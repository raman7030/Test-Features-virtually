package p067l;

import java.io.StringWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۤ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12365 implements InterfaceC8341 {

    /* JADX INFO: renamed from: ֫ */
    public StringWriter f34500 = new StringWriter();

    @Override // p067l.InterfaceC8341
    /* JADX INFO: renamed from: ֫ */
    public final void mo9631(String str, String str2) {
        m28460(C24104.m53357(str.replace('/', '.'), " -> ", str2.replace('/', '.')));
        this.f34500.write("\n");
    }

    @Override // p067l.InterfaceC8341
    /* JADX INFO: renamed from: ۧ */
    public final void mo9633(String str, String str2, String str3) {
        m28460(ASN1Dump.TAB + C24158.m53420(str));
        m28460(C20865.m47154(" ", str2, " -> ", str3));
        this.f34500.write(10);
    }

    @Override // p067l.InterfaceC8341
    /* JADX INFO: renamed from: ֫ */
    public final void mo9632(String str, String str2, String str3) {
        m28460(ASN1Dump.TAB + C24158.m53420(str.substring(str.indexOf(41) + 1)));
        m28460(C21466.m48631(" ", str2));
        StringWriter stringWriter = this.f34500;
        stringWriter.write(40);
        m28460(C24158.m53412(str));
        stringWriter.write(41);
        m28460(" -> " + str3);
        stringWriter.write(10);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28460(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            StringWriter stringWriter = this.f34500;
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
        return this.f34500.toString();
    }
}
