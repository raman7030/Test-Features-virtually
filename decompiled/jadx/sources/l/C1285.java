package l;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.֨ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1285 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f4515;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4347(String str) {
        int i;
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        if (iLastIndexOf2 > iLastIndexOf && (i = iLastIndexOf2 + 1) < str.length()) {
            String str2 = (String) f4515.get(str.substring(i).toLowerCase(Locale.ROOT));
            if (str2 != null) {
                return str2;
            }
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? "application/octet-stream" : strGuessContentTypeFromName;
    }

    static {
        HashMap map = new HashMap();
        m4348(map, "text/html", "html", "htm", "shtml");
        m4348(map, "application/xhtml+xml", "xhtml", "xht");
        m4348(map, "multipart/related", "mhtml", "mht");
        m4348(map, "text/css", "css");
        m4348(map, "text/javascript", "js", "mjs", "cjs");
        m4348(map, "application/json", "json", "map");
        m4348(map, "application/manifest+json", "webmanifest");
        m4348(map, "application/xml", DocumentReader.RESERVED, "xsl", "xslt");
        m4348(map, "application/wasm", "wasm");
        m4348(map, "image/svg+xml", "svg", "svgz");
        m4348(map, "image/png", "png", "apng");
        m4348(map, "image/jpeg", "jpg", "jpeg", "jpe");
        m4348(map, "image/gif", "gif");
        m4348(map, "image/webp", "webp");
        m4348(map, "image/avif", "avif");
        m4348(map, "image/bmp", "bmp", "dib");
        m4348(map, "image/x-icon", "ico", "cur");
        m4348(map, "image/tiff", "tif", "tiff");
        m4348(map, "font/woff", "woff");
        m4348(map, "font/woff2", "woff2");
        m4348(map, "font/ttf", "ttf");
        m4348(map, "font/otf", "otf");
        m4348(map, "application/vnd.ms-fontobject", "eot");
        m4348(map, "audio/mpeg", "mp3", "mp2", "mpga");
        m4348(map, "audio/ogg", "oga", "ogg", "opus");
        m4348(map, "audio/wav", "wav");
        m4348(map, "audio/mp4", "m4a");
        m4348(map, "audio/aac", "aac");
        m4348(map, "audio/flac", "flac");
        m4348(map, "video/mp4", "mp4", "m4v");
        m4348(map, "video/webm", "webm");
        m4348(map, "video/ogg", "ogv");
        m4348(map, "video/mp2t", "ts", "m2ts");
        m4348(map, "application/vnd.apple.mpegurl", "m3u8");
        m4348(map, "text/vtt", "vtt");
        m4348(map, "application/pdf", "pdf");
        m4348(map, "text/plain", "txt", TextBundle.TEXT_ENTRY);
        m4348(map, "text/csv", "csv");
        f4515 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4348(HashMap map, String str, String... strArr) {
        for (String str2 : strArr) {
            map.put(str2, str);
        }
    }
}
