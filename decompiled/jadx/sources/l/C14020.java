package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܰ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14020 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33625(StringBuilder sb, char c) {
        if (c >= ' ' && c < 127) {
            if (c == '\'' || c == '\"' || c == '\\') {
                sb.append('\\');
            }
            sb.append(c);
            return;
        }
        if (c <= 127) {
            switch (c) {
                case '\b':
                    sb.append("\\b");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
            }
            return;
        }
        if (m33626(c)) {
            sb.append(c);
            return;
        }
        sb.append("\\u");
        sb.append(Character.forDigit(c >> '\f', 16));
        sb.append(Character.forDigit((c >> '\b') & 15, 16));
        sb.append(Character.forDigit((c >> 4) & 15, 16));
        sb.append(Character.forDigit(c & 15, 16));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33623(Writer writer, char c) throws IOException {
        if (c >= ' ' && c < 127) {
            if (c == '\'' || c == '\"' || c == '\\') {
                writer.write(92);
            }
            writer.write(c);
            return;
        }
        if (c <= 127) {
            switch (c) {
                case '\b':
                    writer.write("\\b");
                    break;
                case '\t':
                    writer.write("\\t");
                    break;
                case '\n':
                    writer.write("\\n");
                    break;
                case '\f':
                    writer.write("\\f");
                    break;
                case '\r':
                    writer.write("\\r");
                    break;
            }
            return;
        }
        if (m33626(c)) {
            writer.write(c);
            return;
        }
        writer.write("\\u");
        writer.write(Character.forDigit(c >> '\f', 16));
        writer.write(Character.forDigit((c >> '\b') & 15, 16));
        writer.write(Character.forDigit((c >> 4) & 15, 16));
        writer.write(Character.forDigit(c & 15, 16));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33624(Writer writer, String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            m33623(writer, str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33622(String str) {
        StringBuilder sb = new StringBuilder((str.length() * 3) / 2);
        for (int i = 0; i < str.length(); i++) {
            m33625(sb, str.charAt(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33626(char c) {
        Character.UnicodeBlock unicodeBlockOf;
        if (c < ' ' && c != '\r' && c != '\n' && c != '\t') {
            return false;
        }
        if ((c >= 127 && c <= 160) || c == 173 || c == 65279) {
            return false;
        }
        if (c >= 8192 && c <= 8207) {
            return false;
        }
        if (c >= 8232 && c <= 8239) {
            return false;
        }
        if (c >= 8287 && c <= 8303) {
            return false;
        }
        if (c > 127) {
            return (!Character.isValidCodePoint(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == Character.UnicodeBlock.PRIVATE_USE_AREA || unicodeBlockOf == Character.UnicodeBlock.SPECIALS || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B || unicodeBlockOf == Character.UnicodeBlock.LOW_SURROGATES || unicodeBlockOf == Character.UnicodeBlock.HIGH_SURROGATES || unicodeBlockOf == Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES) ? false : true;
        }
        return true;
    }
}
