/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.utilities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 *
 * @author jonas
 */
public class JImageUtils {

    public static ByteArrayOutputStream getScaledImage(Integer newWidth, Integer newHeight, InputStream is) throws IOException {
        BufferedImage buffImage = ImageIO.read(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(getScaledImage(newWidth, newHeight, buffImage), "png", baos);
        return baos;
    }

    public static byte[] getScaledImage(Integer newWidth, Integer newHeight, byte[] image) throws IOException {
        InputStream is = new ByteArrayInputStream(image);
        BufferedImage buffImage = ImageIO.read(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(getScaledImage(newWidth, newHeight, buffImage), "png", baos);
        byte[] bytes = baos.toByteArray();
        return bytes;
    }

    public static BufferedImage getScaledImage(Integer newWidth, Integer newHeight, BufferedImage image) {
        Image resultImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        outputImage.getGraphics().drawImage(resultImage, 0, 0, null);
        return outputImage;
    }
}
