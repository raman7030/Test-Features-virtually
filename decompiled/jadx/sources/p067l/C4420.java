package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֫᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C4420 {

    /* JADX INFO: renamed from: ܽ */
    public static final int f9929 = 31;

    /* JADX INFO: renamed from: ֫ */
    public final Writer f9934;

    /* JADX INFO: renamed from: ᩻ */
    public static final char[] f9933 = {'\\', '\"'};

    /* JADX INFO: renamed from: ۧ */
    public static final char[] f9927 = {'\\', '\\'};

    /* JADX INFO: renamed from: ܳ */
    public static final char[] f9928 = {'\\', 'n'};

    /* JADX INFO: renamed from: ᩳ */
    public static final char[] f9931 = {'\\', 'r'};

    /* JADX INFO: renamed from: ۜ */
    public static final char[] f9925 = {'\\', 't'};

    /* JADX INFO: renamed from: ᩷ */
    public static final char[] f9932 = {'\\', 'u', '2', '0', '2', '8'};

    /* JADX INFO: renamed from: ۢ */
    public static final char[] f9926 = {'\\', 'u', '2', '0', '2', '9'};

    /* JADX INFO: renamed from: ܿ */
    public static final char[] f9930 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C4420(Writer writer) {
        this.f9934 = writer;
    }

    /* JADX INFO: renamed from: ۧ */
    public void m9215(String str) throws IOException {
        this.f9934.write(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void m9222(String str) throws IOException {
        this.f9934.write(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public void m9220(String str) throws IOException {
        this.f9934.write(34);
        m9213(str);
        this.f9934.write(34);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9214() throws IOException {
        this.f9934.write(91);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9212() throws IOException {
        this.f9934.write(93);
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo9217() throws IOException {
        this.f9934.write(44);
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo9216() throws IOException {
        this.f9934.write(123);
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo9219() throws IOException {
        this.f9934.write(C0254q.f1218h);
    }

    /* JADX INFO: renamed from: ܽ */
    public void m9218(String str) throws IOException {
        this.f9934.write(34);
        m9213(str);
        this.f9934.write(34);
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo9221() throws IOException {
        this.f9934.write(58);
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo9223() throws IOException {
        this.f9934.write(44);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m9213(String str) throws IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArrM9211 = m9211(str.charAt(i2));
            if (cArrM9211 != null) {
                this.f9934.write(str, i, i2 - i);
                this.f9934.write(cArrM9211);
                i = i2 + 1;
            }
        }
        this.f9934.write(str, i, length - i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static char[] m9211(char c) {
        if (c > '\\') {
            if (c < 8232 || c > 8233) {
                return null;
            }
            return c == 8232 ? f9932 : f9926;
        }
        if (c == '\\') {
            return f9927;
        }
        if (c > '\"') {
            return null;
        }
        if (c == '\"') {
            return f9933;
        }
        if (c > 31) {
            return null;
        }
        if (c == '\n') {
            return f9928;
        }
        if (c == '\r') {
            return f9931;
        }
        if (c == '\t') {
            return f9925;
        }
        char[] cArr = f9930;
        return new char[]{'\\', 'u', '0', '0', cArr[(c >> 4) & 15], cArr[c & 15]};
    }
}
