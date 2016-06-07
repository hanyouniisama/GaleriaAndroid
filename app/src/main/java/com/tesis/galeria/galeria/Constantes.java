package com.tesis.galeria.galeria;

/**
 * Created by danie on 18/5/2016.
 */
public class Constantes {
    public static final String DOMINIO = "https://192.168.0.102";
    // public static String DOMINIO = "https://192.168.0.57";

    public static final String URL_IMAGEN_USUARIO = "/Imagenes/Usuario/";
    public static final String URL_IMAGEN_NOTCIA = "/Imagenes/Noticia/";
    public static final String URL_IMAGEN_OBRA = "/Imagenes/Obra/";
    public static final String URL_IMAGEN_ARTISTA = "/Imagenes/Artista/";
    public static final String URL_IMAGEN_AVALUO = "/Imagenes/Avaluo/";

    public static final String PREFERENCIA = "preferencia";

    public static final String PARAM_REGISTRO = "registro";
    public static final String PARAM_ID_USUARIO = "id_usuario";
    public static final String PARAM_CORREO = "correo";
    public static final String PARAM_IMAGEN_USUARIO = "imagen_usuario";
    public static final String PARAM_DATOS_AVALUO = "datos_avaluo";
    public static final String PARAM_DATOS_ARTISTA = "datos_artista";
    public static final String PARAM_DATOS_OBRA = "datos_obra";
    public static final String PARAM_EXTRA = "com.tesis.galeria.galeria";


    public static final String FRAGMENT_NOTCIAS = "fragment_noticias";
    public static final String FRAGMENT_ARTISTAS = "fragment_artistas";
    public static final String FRAGMENT_OBRAS = "fragment_obras";
    public static final String FRAGMENT_CUENTA = "fragment_cuenta";
    public static final String FRAGMENT_PERFIL = "fragment_perfil";
    public static final String FRAGMENT_IMAGENES = "fragment_imagenes";

    public enum ESTATUS_AVALUO {
        DEFECTO, AVALUADO, ESPERA, PROCESO
    }

}