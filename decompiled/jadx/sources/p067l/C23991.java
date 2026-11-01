package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.᩺ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23991 extends AbstractC19710 {

    /* JADX INFO: renamed from: ۜۧ */
    public static final String[] f76196 = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};

    /* JADX INFO: renamed from: ܳۧ */
    public String f76197;

    /* JADX INFO: renamed from: ܿۧ */
    public String f76198;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f76199;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        return 0;
    }

    public C23991(InterfaceC3341 interfaceC3341, String str, int i) {
        super(interfaceC3341, (byte) 37, (byte) 104);
        this.f76197 = null;
        this.f76198 = str;
        this.f76199 = i;
        this.f59919 = "\\PIPE\\LANMAN";
        this.f59920 = 8;
        this.f59934 = 16384;
        this.f59930 = 0;
        this.f59918 = OpenAuthTask.Duplex;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53162(int i, String str) {
        reset();
        this.f76197 = str;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        char c = m44787() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = f76196[c].getBytes("ASCII");
            C3775.m7364(m44787() & 255, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C3775.m7364(1L, 2 + length, bArr);
            C3775.m7364(this.f59934, length + 4, bArr);
            C3775.m7366(this.f76199, length + 6, bArr);
            int i = length + 10;
            int iM30242 = i + m30242(this.f76198.toUpperCase(), bArr, i, false);
            return c == 1 ? iM30242 + m30242(this.f76197.toUpperCase(), bArr, iM30242, false) : iM30242;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2[");
        sb.append(super.toString());
        sb.append(",name=");
        sb.append(this.f59919);
        sb.append(",serverTypes=");
        return new String(C10965.m25286(sb, this.f76199 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM", "]"));
    }
}
