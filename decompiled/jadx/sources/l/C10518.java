package l;

import java.io.StringWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۤ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10518 implements InterfaceC6284 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public StringWriter f31538 = new StringWriter();

    @Override // l.InterfaceC6284
    /* JADX INFO: renamed from: ֫ */
    public final void mo7563(String str, String str2) {
        m26427(C22870.m50967(str.replace('/', '.'), " -> ", str2.replace('/', '.')));
        this.f31538.write("\n");
    }

    @Override // l.InterfaceC6284
    /* JADX INFO: renamed from: ۧ */
    public final void mo7565(String str, String str2, String str3) {
        m26427(ASN1Dump.TAB + C22927.m51029(str));
        m26427(C19462.m44858(" ", str2, " -> ", str3));
        this.f31538.write(10);
    }

    @Override // l.InterfaceC6284
    /* JADX INFO: renamed from: ֫ */
    public final void mo7564(String str, String str2, String str3) {
        m26427(ASN1Dump.TAB + C22927.m51029(str.substring(str.indexOf(41) + 1)));
        m26427(C20094.m46315(" ", str2));
        StringWriter stringWriter = this.f31538;
        stringWriter.write(40);
        m26427(C22927.m51021(str));
        stringWriter.write(41);
        m26427(" -> " + str3);
        stringWriter.write(10);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26427(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            StringWriter stringWriter = this.f31538;
            if (cCharAt == '\t') {
                stringWriter.write("\\t");
            } else if (cCharAt == '\n') {
                stringWriter.write("\\n");
            } else if (cCharAt == '\r') {
                stringWriter.write("\\r");
            } else if (cCharAt == '\\') {
                stringWriter.write("\\\\");
            } else {
                stringWriter.write(cCharAt);
            }
        }
    }

    public final String toString() {
        return this.f31538.toString();
    }
}
