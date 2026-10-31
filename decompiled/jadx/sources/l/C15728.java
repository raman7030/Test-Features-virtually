package l;

import android.app.Application;
import android.content.res.Configuration;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
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
public final class C15728 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f48506 = Pattern.compile("(?is)(<title\\b[^>]*>).*?(</title>)");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f48505 = Pattern.compile("(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"'])(.*?)(\\2[^>]*>)");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m37118(C15996 c15996) {
        ByteArrayInputStream byteArrayInputStream;
        EnumC4003 enumC4003M37807 = c15996.m37807();
        if (EnumC4003.GET.equals(enumC4003M37807) || EnumC4003.HEAD.equals(enumC4003M37807)) {
            String strM37804 = c15996.m37804();
            if (TextUtils.isEmpty(strM37804) || "/".equals(strM37804)) {
                strM37804 = "index.html";
            }
            if (strM37804.startsWith("/")) {
                strM37804 = strM37804.substring(1);
            }
            if (TextUtils.isEmpty(strM37804)) {
                strM37804 = "index.html";
            } else {
                if (strM37804.startsWith("/") || strM37804.contains("\\") || strM37804.indexOf(0) >= 0) {
                    strM37804 = null;
                    break;
                }
                for (String str : strM37804.split("/")) {
                    if (str.isEmpty() || ".".equals(str) || "..".equals(str)) {
                        strM37804 = null;
                        break;
                    }
                }
            }
            if (strM37804 != null) {
                C8674 c8674M37116 = m37116(strM37804, false);
                if (c8674M37116 == null && !"index.html".equals(strM37804)) {
                    c8674M37116 = m37116("index.html", true);
                }
                if (c8674M37116 != null) {
                    if (EnumC4003.HEAD.equals(enumC4003M37807)) {
                        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        byteArrayInputStream = new ByteArrayInputStream(c8674M37116.f26450);
                    }
                    C8236 c8236M13783 = AbstractC4708.m13783(EnumC1180.OK, c8674M37116.f26452, byteArrayInputStream, c8674M37116.f26450.length);
                    c8236M13783.m21806(enumC4003M37807);
                    c8236M13783.m21805("Cache-Control", c8674M37116.f26451);
                    c8236M13783.m21805("Referrer-Policy", "no-referrer");
                    return c8236M13783;
                }
                return AbstractC4708.m13784(EnumC1180.NOT_FOUND, "text/plain", "");
            }
            return AbstractC4708.m13784(EnumC1180.NOT_FOUND, "text/plain", "");
        }
        return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8674 m37116(String str, boolean z) {
        String str2;
        try {
            InputStream inputStreamOpen = C4925.m14325().open("web-manager/".concat(str));
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
                    byteArray = m37115(new String(byteArray, charset)).getBytes(charset);
                }
                C8674 c8674 = new C8674(m37117(str), byteArray, str2);
                inputStreamOpen.close();
                return c8674;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37115(String str) {
        Locale localeM24394 = C9523.m24394(C4925.m14335());
        String strM7583 = C2324.m7583(localeM24394);
        Application applicationM14335 = C4925.m14335();
        Configuration configuration = new Configuration(applicationM14335.getResources().getConfiguration());
        configuration.setLocale(localeM24394);
        configuration.setLayoutDirection(localeM24394);
        String strM46315 = C20094.m46315(strM7583.startsWith("zh-") ? "MT" : "MT ", applicationM14335.createConfigurationContext(configuration).getString(R.string.MT_Protector));
        Matcher matcher = f48506.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + matcher.group(1) + strM46315.replace(a.p, "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") + matcher.group(2) + str.substring(matcher.end());
        }
        if ("zh-rCN".equals(strM7583)) {
            strM7583 = "zh-CN";
        } else if ("zh-rTW".equals(strM7583)) {
            strM7583 = "zh-TW";
        } else if ("in".equals(strM7583)) {
            strM7583 = "id";
        }
        Matcher matcher2 = f48505.matcher(str);
        if (!matcher2.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, matcher2.start()));
        sb.append(matcher2.group(1));
        sb.append(matcher2.group(2));
        sb.append(strM7583);
        sb.append(matcher2.group(4));
        return C20087.m46305(matcher2.end(), str, sb);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m37117(String str) {
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
