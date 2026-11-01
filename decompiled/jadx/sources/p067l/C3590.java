package p067l;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.֨ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3590 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f7289;

    /* JADX INFO: renamed from: ֫ */
    public static String m6593(String str) {
        int i;
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        if (iLastIndexOf2 > iLastIndexOf && (i = iLastIndexOf2 + 1) < str.length()) {
            String str2 = (String) f7289.get(str.substring(i).toLowerCase(Locale.ROOT));
            if (str2 != null) {
                return str2;
            }
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? "application/octet-stream" : strGuessContentTypeFromName;
    }

    static {
        HashMap map = new HashMap();
        m6594(map, "text/html", "html", "htm", "shtml");
        m6594(map, "application/xhtml+xml", "xhtml", "xht");
        m6594(map, "multipart/related", "mhtml", "mht");
        m6594(map, "text/css", "css");
        m6594(map, "text/javascript", "js", "mjs", "cjs");
        m6594(map, "application/json", "json", "map");
        m6594(map, "application/manifest+json", "webmanifest");
        m6594(map, "application/xml", DocumentReader.RESERVED, "xsl", "xslt");
        m6594(map, "application/wasm", "wasm");
        m6594(map, "image/svg+xml", "svg", "svgz");
        m6594(map, "image/png", "png", "apng");
        m6594(map, "image/jpeg", "jpg", "jpeg", "jpe");
        m6594(map, "image/gif", "gif");
        m6594(map, "image/webp", "webp");
        m6594(map, "image/avif", "avif");
        m6594(map, "image/bmp", "bmp", "dib");
        m6594(map, "image/x-icon", "ico", "cur");
        m6594(map, "image/tiff", "tif", "tiff");
        m6594(map, "font/woff", "woff");
        m6594(map, "font/woff2", "woff2");
        m6594(map, "font/ttf", "ttf");
        m6594(map, "font/otf", "otf");
        m6594(map, "application/vnd.ms-fontobject", "eot");
        m6594(map, "audio/mpeg", "mp3", "mp2", "mpga");
        m6594(map, "audio/ogg", "oga", "ogg", "opus");
        m6594(map, "audio/wav", "wav");
        m6594(map, "audio/mp4", "m4a");
        m6594(map, "audio/aac", "aac");
        m6594(map, "audio/flac", "flac");
        m6594(map, "video/mp4", "mp4", "m4v");
        m6594(map, "video/webm", "webm");
        m6594(map, "video/ogg", "ogv");
        m6594(map, "video/mp2t", "ts", "m2ts");
        m6594(map, "application/vnd.apple.mpegurl", "m3u8");
        m6594(map, "text/vtt", "vtt");
        m6594(map, "application/pdf", "pdf");
        m6594(map, "text/plain", "txt", TextBundle.TEXT_ENTRY);
        m6594(map, "text/csv", "csv");
        f7289 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6594(HashMap map, String str, String... strArr) {
        for (String str2 : strArr) {
            map.put(str2, str);
        }
    }
}
