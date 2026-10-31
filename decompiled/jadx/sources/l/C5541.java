package l;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۚᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3GW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5541 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuffer f17142;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23885 f17143;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23885 f17144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17145;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringBuffer f17146;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Writer f17147;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15683(String str, int i, int i2, String str2) {
        StringWriter stringWriter = new StringWriter((str.length() + str2.length()) * 3);
        C5541 c5541 = new C5541(stringWriter, i, i2, "");
        try {
            c5541.f17143.write(str);
            c5541.f17144.write(str2);
            StringBuffer stringBuffer = c5541.f17146;
            StringBuffer stringBuffer2 = c5541.f17142;
            C23885 c23885 = c5541.f17144;
            C23885 c23886 = c5541.f17143;
            try {
                m15685(stringBuffer2, c23886);
                m15685(stringBuffer, c23885);
                c5541.m15684();
                m15685(stringBuffer2, c23886);
                while (stringBuffer2.length() != 0) {
                    c23885.write(10);
                    c5541.m15684();
                }
                m15685(stringBuffer, c23885);
                while (stringBuffer.length() != 0) {
                    c23886.write(10);
                    c5541.m15684();
                }
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("shouldn't happen", e2);
        }
    }

    public C5541(StringWriter stringWriter, int i, int i2, String str) {
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
        this.f17147 = stringWriter;
        this.f17145 = i;
        this.f17142 = stringWriter2.getBuffer();
        this.f17146 = stringWriter3.getBuffer();
        this.f17143 = new C23885(stringWriter2, i, "");
        this.f17144 = new C23885(stringWriter3, i2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15684() throws IOException {
        StringBuffer stringBuffer;
        int iIndexOf;
        while (true) {
            StringBuffer stringBuffer2 = this.f17142;
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = (stringBuffer = this.f17146).indexOf("\n")) < 0) {
                return;
            }
            Writer writer = this.f17147;
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.f17145 - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15685(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }
}
