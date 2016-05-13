package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * 22-mar-2016
 * @author Seix
 */
public class Utils {
    
    /**
     * Recibe una cadena de texto que encriptará
     * @param password Cadena de texto a encriptar
     * @return Cadena encriptada según el algoritmo establecido
     */
    public static String encriptarPassword(String password){
        return encriptador(password);
    }
    /**
     * Compara una contraseña sin encriptar, la encripta y la compara con la original.
     * @param password Password de referencia ya encriptado
     * @param passwordComparar Password recibido sin ecriptar
     * @return True or False si hay coincidencia
     */
    public static boolean compararPassword(String password, String passwordComparar){
        return password.equals(encriptador(passwordComparar));
    }
    
    /**
     * Función que se encarga de encriptar una cadena de texto con algoritmo SHA-256
     * @param cadena Cadena a encriptar
     * @return Cadena encriptada de 64 caracteres de ongitud
     */
    private static String encriptador(String cadena){
        String result = "";
        
        try {
            result = DigestUtils.sha256Hex(cadena);
        } catch (Exception ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public static Date sumarDiasFecha(Date fechaInicio, int dias){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fechaInicio);
        cal.add(GregorianCalendar.DAY_OF_MONTH, dias);
        return cal.getTime();
    }
}
