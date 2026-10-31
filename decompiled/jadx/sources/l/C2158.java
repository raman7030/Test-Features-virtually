package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֫᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C2158 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f7143 = 31;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Writer f7148;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f7147 = {'\\', '\"'};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f7141 = {'\\', '\\'};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f7142 = {'\\', 'n'};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final char[] f7145 = {'\\', 'r'};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final char[] f7139 = {'\\', 't'};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f7146 = {'\\', 'u', '2', '0', '2', '8'};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final char[] f7140 = {'\\', 'u', '2', '0', '2', '9'};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final char[] f7144 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C2158(Writer writer) {
        this.f7148 = writer;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m7120(String str) throws IOException {
        this.f7148.write(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m7127(String str) throws IOException {
        this.f7148.write(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m7125(String str) throws IOException {
        this.f7148.write(34);
        m7118(str);
        this.f7148.write(34);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo7119() throws IOException {
        this.f7148.write(91);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7117() throws IOException {
        this.f7148.write(93);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo7122() throws IOException {
        this.f7148.write(44);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo7121() throws IOException {
        this.f7148.write(123);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo7124() throws IOException {
        this.f7148.write(q.h);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m7123(String str) throws IOException {
        this.f7148.write(34);
        m7118(str);
        this.f7148.write(34);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo7126() throws IOException {
        this.f7148.write(58);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo7128() throws IOException {
        this.f7148.write(44);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m7118(String str) throws IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArrM7116 = m7116(str.charAt(i2));
            if (cArrM7116 != null) {
                this.f7148.write(str, i, i2 - i);
                this.f7148.write(cArrM7116);
                i = i2 + 1;
            }
        }
        this.f7148.write(str, i, length - i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m7116(char c) {
        if (c > '\\') {
            if (c < 8232 || c > 8233) {
                return null;
            }
            return c == 8232 ? f7146 : f7140;
        }
        if (c == '\\') {
            return f7141;
        }
        if (c > '\"') {
            return null;
        }
        if (c == '\"') {
            return f7147;
        }
        if (c > 31) {
            return null;
        }
        if (c == '\n') {
            return f7142;
        }
        if (c == '\r') {
            return f7145;
        }
        if (c == '\t') {
            return f7139;
        }
        char[] cArr = f7144;
        return new char[]{'\\', 'u', '0', '0', cArr[(c >> 4) & 15], cArr[c & 15]};
    }
}
