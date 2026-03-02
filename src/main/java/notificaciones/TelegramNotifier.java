package notificaciones;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * Clase encargada de enviar notificaciones mediante la API de Telegram.
 * <p>
 * Utiliza la API oficial de bots de Telegram para enviar mensajes
 * a un chat específico configurado mediante un BOT_TOKEN y CHAT_ID.
 * </p>
 * <p>
 * Implementa comunicación HTTP utilizando {@link HttpClient}
 * introducido en Java 11.
 * </p>
 *
 * <p><b>Importante:</b> El token del bot y el chat ID están
 * configurados como constantes internas.</p>
 *
 * @author Juan Jose Morales
 * @version 1.0
 */
public class TelegramNotifier {

    /**
     * Token de autenticación del bot de Telegram.
     */
    private static final String BOT_TOKEN = "8696168630:AAGYISxIO22IfQvR2tbwvkgFqtgNq-11-cs";

    /**
     * Identificador del chat destino.
     */
    private static final String CHAT_ID   = "7056005334";

    /**
     * URL base utilizada para realizar la petición a la API de Telegram.
     */
    private static final String BASE_URL  = "https://api.telegram.org/bot" + BOT_TOKEN + "/sendMessage";

    /**
     * Envía un mensaje de texto plano al chat configurado.
     *
     * @param mensaje texto que será enviado al chat
     * @return {@code true} si el mensaje fue enviado exitosamente,
     *         {@code false} si ocurrió algún error
     */
    public boolean enviarMensaje(String mensaje) {
        try {
            String textoEncoded = URLEncoder.encode(mensaje, StandardCharsets.UTF_8);
            String url = BASE_URL + "?chat_id=" + CHAT_ID + "&text=" + textoEncoded;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("✅ Mensaje enviado correctamente.");
                System.out.println("Respuesta: " + response.body());
                return true;
            } else {
                System.out.println("❌ Error al enviar. Código: " + response.statusCode());
                System.out.println("Respuesta: " + response.body());
                return false;
            }

        } catch (Exception e) {
            System.err.println("❌ Excepción: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Envía un mensaje con formato HTML (negrita, cursiva, enlaces, etc.).
     *
     * @param mensaje texto con formato HTML compatible con Telegram
     * @return {@code true} si el mensaje fue enviado correctamente,
     *         {@code false} en caso de error
     */
    public boolean enviarMensajeHTML(String mensaje) {
        try {
            String textoEncoded = URLEncoder.encode(mensaje, StandardCharsets.UTF_8);
            String url = BASE_URL + "?chat_id=" + CHAT_ID
                    + "&text=" + textoEncoded
                    + "&parse_mode=HTML";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.statusCode() == 200;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}