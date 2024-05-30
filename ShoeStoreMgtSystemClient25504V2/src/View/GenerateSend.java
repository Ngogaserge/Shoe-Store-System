/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP
 */
public class GenerateSend {

    // Method to generate OTP
    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    // Method to send OTP via email
    public void sendOtp(String recipientEmail, String otp) {
        // Set up email server properties
        String host = "smtp.gmail.com"; // Replace with your SMTP server
        final String user = "ufiteyesu77@gmail.com"; // Replace with your email
        final String password = "smey rrii zvrw xzyb"; // Replace with your email password

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587"); // Replace with your SMTP server port
        props.put("mail.smtp.starttls.enable", "true");

        // Get the session object
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        // Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("Your OTP Code");
            message.setText("Your OTP code is: " + otp);

            // Send message
            Transport.send(message);
            System.out.println("OTP from rachel sent successfully ");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
