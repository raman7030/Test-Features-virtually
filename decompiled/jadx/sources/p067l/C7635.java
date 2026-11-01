package p067l;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۚᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3GW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7635 {

    /* JADX INFO: renamed from: ֫ */
    public final StringBuffer f19983;

    /* JADX INFO: renamed from: ۧ */
    public final C25069 f19984;

    /* JADX INFO: renamed from: ܳ */
    public final C25069 f19985;

    /* JADX INFO: renamed from: ܽ */
    public final int f19986;

    /* JADX INFO: renamed from: ܿ */
    public final StringBuffer f19987;

    /* JADX INFO: renamed from: ᩳ */
    public final Writer f19988;

    /* JADX INFO: renamed from: ֫ */
    public static String m17598(String str, int i, int i2, String str2) {
        StringWriter stringWriter = new StringWriter((str.length() + str2.length()) * 3);
        C7635 c7635 = new C7635(stringWriter, i, i2, "");
        try {
            c7635.f19984.write(str);
            c7635.f19985.write(str2);
            StringBuffer stringBuffer = c7635.f19987;
            StringBuffer stringBuffer2 = c7635.f19983;
            C25069 c25069 = c7635.f19985;
            C25069 c250610 = c7635.f19984;
            try {
                m17600(stringBuffer2, c250610);
                m17600(stringBuffer, c25069);
                c7635.m17599();
                m17600(stringBuffer2, c250610);
                while (stringBuffer2.length() != 0) {
                    c25069.write(10);
                    c7635.m17599();
                }
                m17600(stringBuffer, c25069);
                while (stringBuffer.length() != 0) {
                    c250610.write(10);
                    c7635.m17599();
                }
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("shouldn't happen", e2);
        }
    }

    public C7635(StringWriter stringWriter, int i, int i2, String str) {
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        StringWriter stringWriter2 = new StringWriter(1000);
        StringWriter stringWriter3 = new StringWriter(1000);
        this.f19988 = stringWriter;
        this.f19986 = i;
        this.f19983 = stringWriter2.getBuffer();
        this.f19987 = stringWriter3.getBuffer();
        this.f19984 = new C25069(stringWriter2, i, "");
        this.f19985 = new C25069(stringWriter3, i2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17599() throws IOException {
        StringBuffer stringBuffer;
        int iIndexOf;
        while (true) {
            StringBuffer stringBuffer2 = this.f19983;
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = (stringBuffer = this.f19987).indexOf("\n")) < 0) {
                return;
            }
            Writer writer = this.f19988;
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f19986 - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17600(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }
}
