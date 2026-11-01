package p067l;

import android.app.Application;
import android.content.res.Configuration;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17316 {

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f51646 = Pattern.compile("(?is)(<title\\b[^>]*>).*?(</title>)");

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f51645 = Pattern.compile("(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"'])(.*?)(\\2[^>]*>)");

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m39287(C17571 c17571) {
        ByteArrayInputStream byteArrayInputStream;
        EnumC6173 enumC6173M39993 = c17571.m39993();
        if (EnumC6173.GET.equals(enumC6173M39993) || EnumC6173.HEAD.equals(enumC6173M39993)) {
            String strM39990 = c17571.m39990();
            if (TextUtils.isEmpty(strM39990) || "/".equals(strM39990)) {
                strM39990 = "index.html";
            }
            if (strM39990.startsWith("/")) {
                strM39990 = strM39990.substring(1);
            }
            if (TextUtils.isEmpty(strM39990)) {
                strM39990 = "index.html";
            } else {
                if (strM39990.startsWith("/") || strM39990.contains("\\") || strM39990.indexOf(0) >= 0) {
                    strM39990 = null;
                    break;
                }
                for (String str : strM39990.split("/")) {
                    if (str.isEmpty() || ".".equals(str) || "..".equals(str)) {
                        strM39990 = null;
                        break;
                    }
                }
            }
            if (strM39990 != null) {
                C10612 c10612M39285 = m39285(strM39990, false);
                if (c10612M39285 == null && !"index.html".equals(strM39990)) {
                    c10612M39285 = m39285("index.html", true);
                }
                if (c10612M39285 != null) {
                    if (EnumC6173.HEAD.equals(enumC6173M39993)) {
                        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        byteArrayInputStream = new ByteArrayInputStream(c10612M39285.f29375);
                    }
                    C10196 c10196M15659 = AbstractC6843.m15659(EnumC3490.OK, c10612M39285.f29377, byteArrayInputStream, c10612M39285.f29375.length);
                    c10196M15659.m23775(enumC6173M39993);
                    c10196M15659.m23774("Cache-Control", c10612M39285.f29376);
                    c10196M15659.m23774("Referrer-Policy", "no-referrer");
                    return c10196M15659;
                }
                return AbstractC6843.m15660(EnumC3490.NOT_FOUND, "text/plain", "");
            }
            return AbstractC6843.m15660(EnumC3490.NOT_FOUND, "text/plain", "");
        }
        return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX INFO: renamed from: ֫ */
    private C10612 m39285(String str, boolean z) {
        String str2;
        try {
            InputStream inputStreamOpen = C7050.m16222().open("web-manager/".concat(str));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (z || "index.html".equals(str) || !str.startsWith("assets/")) {
                    str2 = "no-cache";
                } else {
                    String strSubstring = str.substring(str.lastIndexOf(47) + 1);
                    int iLastIndexOf = strSubstring.lastIndexOf(46);
                    int iLastIndexOf2 = strSubstring.lastIndexOf(45, iLastIndexOf);
                    if (iLastIndexOf <= 0 || iLastIndexOf2 < 0 || iLastIndexOf - iLastIndexOf2 <= 8) {
                        str2 = "no-cache";
                    } else {
                        str2 = "public, max-age=31536000, immutable";
                    }
                }
                if (z || "index.html".equals(str)) {
                    Charset charset = StandardCharsets.UTF_8;
                    byteArray = m39284(new String(byteArray, charset)).getBytes(charset);
                }
                C10612 c10612 = new C10612(m39286(str), byteArray, str2);
                inputStreamOpen.close();
                return c10612;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39284(String str) {
        Locale localeM26404 = C11419.m26404(C7050.m16232());
        String strM9653 = C4577.m9653(localeM26404);
        Application applicationM16232 = C7050.m16232();
        Configuration configuration = new Configuration(applicationM16232.getResources().getConfiguration());
        configuration.setLocale(localeM26404);
        configuration.setLayoutDirection(localeM26404);
        String strM48631 = C21466.m48631(strM9653.startsWith("zh-") ? "MT" : "MT ", applicationM16232.createConfigurationContext(configuration).getString(R.string.MT_Protector));
        Matcher matcher = f51646.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + matcher.group(1) + strM48631.replace(C0233a.f1084p, "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") + matcher.group(2) + str.substring(matcher.end());
        }
        if ("zh-rCN".equals(strM9653)) {
            strM9653 = "zh-CN";
        } else if ("zh-rTW".equals(strM9653)) {
            strM9653 = "zh-TW";
        } else if ("in".equals(strM9653)) {
            strM9653 = "id";
        }
        Matcher matcher2 = f51645.matcher(str);
        if (!matcher2.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, matcher2.start()));
        sb.append(matcher2.group(1));
        sb.append(matcher2.group(2));
        sb.append(strM9653);
        sb.append(matcher2.group(4));
        return C21459.m48621(matcher2.end(), str, sb);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m39286(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.endsWith(".html")) {
            return "text/html; charset=UTF-8";
        }
        if (lowerCase.endsWith(".js") || lowerCase.endsWith(".mjs")) {
            return "application/javascript; charset=UTF-8";
        }
        if (lowerCase.endsWith(".css")) {
            return "text/css; charset=UTF-8";
        }
        if (lowerCase.endsWith(".json") || lowerCase.endsWith(".map")) {
            return "application/json; charset=UTF-8";
        }
        if (lowerCase.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (lowerCase.endsWith(".png")) {
            return "image/png";
        }
        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
            return "image/jpeg";
        }
        if (lowerCase.endsWith(".webp")) {
            return "image/webp";
        }
        if (lowerCase.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (lowerCase.endsWith(".woff")) {
            return "font/woff";
        }
        if (lowerCase.endsWith(".woff2")) {
            return "font/woff2";
        }
        return lowerCase.endsWith(".txt") ? "text/plain; charset=UTF-8" : "application/octet-stream";
    }
}
