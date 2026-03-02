public class TelegramNotifier {

    private static final String BOT_TOKEN = "8696168630:AAGYISxIO22IfQvR2tbwvkgFqtgNq-11-cs";
    private static final String BASE_URL = "https://api.telegram.org/bot" + BOT_TOKEN;

    private final HttpClient httpClient;

    public TelegramNotifier() {
        this.httpClient = HttpClient.newHttpClient();
    }

    /**
     * Envía un mensaje de texto a un chat específico.
     *
     * @param chatId  ID del chat o usuario al que se enviará el mensaje
     * @param message Mensaje a enviar
     * @return true si el mensaje fue enviado exitosamente, false en caso contrario
     */
    public boolean sendMessage(String chatId, String message) {
        try {
            String encodedMessage = URLEncoder.encode(message, StandardCharsets.UTF_8);
            String url = BASE_URL + "/sendMessage?chat_id=" + chatId + "&text=" + encodedMessage;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("✅ Mensaje enviado exitosamente a: " + chatId);
                return true;
            } else {
                System.err.println("❌ Error al enviar mensaje. Código: " + response.statusCode());
                System.err.println("Respuesta: " + response.body());
                return false;
            }

        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Excepción al enviar mensaje: " + e.getMessage());
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /**
     * Envía un mensaje con formato HTML.
     *
     * @param chatId  ID del chat
     * @param message Mensaje en formato HTML (ej: "<b>negrita</b>")
     * @return true si fue exitoso
     */
    public boolean sendHtmlMessage(String chatId, String message) {
        try {
            String encodedMessage = URLEncoder.encode(message, StandardCharsets.UTF_8);
            String url = BASE_URL + "/sendMessage?chat_id=" + chatId
                    + "&text=" + encodedMessage
                    + "&parse_mode=HTML";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return response.statusCode() == 200;

        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Excepción: " + e.getMessage());
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /**
     * Obtiene el chatId de los usuarios que han hablado con el bot.
     * Útil para obtener tu propio chatId la primera vez.
     */
    public void getUpdates() {
        try {
            String url = BASE_URL + "/getUpdates";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("📋 Updates del bot:");
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Error: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

}



















