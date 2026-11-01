package p067l;

import java.nio.charset.Charset;
import java.util.AbstractSet;

/* JADX INFO: renamed from: l.ۜܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8828 extends C24921 {

    /* JADX INFO: renamed from: ܳ */
    public byte[] f23965;

    /* JADX INFO: renamed from: ܿ */
    public boolean f23966;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f23967;

    public C8828(AbstractSet abstractSet, String str, String str2, C20899 c20899, boolean z) {
        byte[] bytes;
        super(abstractSet, c20899);
        byte[] bytes2 = C17544.f52435;
        if (str != null) {
            Charset charset = C18215.f54371;
            bytes = str.getBytes(Charset.forName("Cp850"));
        } else {
            bytes = bytes2;
        }
        this.f23967 = bytes;
        if (str2 != null) {
            Charset charset2 = C18215.f54371;
            bytes2 = str2.getBytes(Charset.forName("Cp850"));
        }
        this.f23965 = bytes2;
        this.f23966 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20389(C14192 c14192) {
        c14192.m28114("NTLMSSP\u0000", C10169.f28134);
        c14192.m28113(1L);
        c14192.m28113(C16873.m38438(this.f79589));
        boolean z = this.f23966;
        int iM39921 = !z ? 40 : 32;
        boolean zContains = this.f79589.contains(EnumC22240.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
        byte[] bArr = this.f23967;
        if (zContains) {
            iM39921 = C17544.m39921(c14192, bArr, iM39921);
        } else {
            c14192.m28111(0);
            c14192.m28111(0);
            c14192.m28113(0L);
        }
        boolean zContains2 = this.f79589.contains(EnumC22240.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED);
        byte[] bArr2 = this.f23965;
        if (zContains2) {
            C17544.m39921(c14192, bArr2, iM39921);
        } else {
            c14192.m28111(0);
            c14192.m28111(0);
            c14192.m28113(0L);
        }
        if (!z && this.f79589.contains(EnumC22240.NTLMSSP_NEGOTIATE_VERSION)) {
            this.f79590.m47208(c14192);
        } else if (!z) {
            c14192.m28118(0L);
        }
        c14192.m28102(bArr.length, bArr);
        c14192.m28102(bArr2.length, bArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NtlmNegotiate{\n  domain='");
        Charset charset = C18215.f54371;
        byte[] bArr = this.f23967;
        sb.append(bArr != null ? new String(bArr, Charset.forName("Cp850")) : "");
        sb.append("'',\n  workstation='");
        byte[] bArr2 = this.f23965;
        sb.append(bArr2 != null ? new String(bArr2, Charset.forName("Cp850")) : "");
        sb.append("',\n  negotiateFlags=");
        sb.append(this.f79589);
        sb.append(",\n  version=");
        sb.append(this.f79590);
        sb.append("\n}");
        return sb.toString();
    }
}
