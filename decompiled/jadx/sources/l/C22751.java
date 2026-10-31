package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.᩺ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A38 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22751 extends AbstractC18246 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f73470 = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public String f73471;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public String f73472;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f73473;

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ۜ */
    public final int mo2483(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2485(int i, byte[] bArr) {
        return 0;
    }

    public C22751(InterfaceC1023 interfaceC1023, String str, int i) {
        super(interfaceC1023, (byte) 37, (byte) 104);
        this.f73471 = null;
        this.f73472 = str;
        this.f73473 = i;
        this.f56701 = "\\PIPE\\LANMAN";
        this.f56702 = 8;
        this.f56716 = 16384;
        this.f56712 = 0;
        this.f56700 = OpenAuthTask.Duplex;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50829(int i, String str) {
        reset();
        this.f73471 = str;
    }

    @Override // l.AbstractC18246
    /* JADX INFO: renamed from: ܽ */
    public final int mo2484(byte[] bArr) {
        char c = m42528() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = f73470[c].getBytes("ASCII");
            C1480.m5122(m42528() & 255, 0, bArr);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            int length = bytes.length;
            C1480.m5122(1L, 2 + length, bArr);
            C1480.m5122(this.f56716, length + 4, bArr);
            C1480.m5124(this.f73473, length + 6, bArr);
            int i = length + 10;
            int iM28198 = i + m28198(this.f73472.toUpperCase(), bArr, i, false);
            return c == 1 ? iM28198 + m28198(this.f73471.toUpperCase(), bArr, iM28198, false) : iM28198;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // l.AbstractC18246, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetServerEnum2[");
        sb.append(super.toString());
        sb.append(",name=");
        sb.append(this.f56701);
        sb.append(",serverTypes=");
        return new String(C9045.m23341(sb, this.f73473 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM", "]"));
    }
}
