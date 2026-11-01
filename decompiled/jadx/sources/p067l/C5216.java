package p067l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۗۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9VM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5216 extends AbstractC11883 implements InterfaceC11212 {

    /* JADX INFO: renamed from: ܶ֫ */
    public String f12243;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f12244;

    /* JADX INFO: renamed from: ᩸֫ */
    public String f12245;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f12246;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public C5216(InterfaceC3341 interfaceC3341, AbstractC13224 abstractC13224) {
        super(interfaceC3341, abstractC13224);
        this.f12243 = "";
    }

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ۡ */
    public final String mo11186() {
        return this.f12245;
    }

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11187() {
        return this.f12246;
    }

    @Override // p067l.InterfaceC11212
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11185() {
        return m30275() != 65535;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        byte b = bArr[i];
        this.f12244 = (b & 1) == 1;
        this.f12246 = (b & 2) == 2;
        return 2;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndXResponse[");
        sb.append(super.toString());
        sb.append(",supportSearchBits=");
        sb.append(this.f12244);
        sb.append(",shareIsInDfs=");
        sb.append(this.f12246);
        sb.append(",service=");
        sb.append(this.f12245);
        sb.append(",nativeFileSystem=");
        return new String(C10965.m25286(sb, this.f12243, "]"));
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new C14740("zero termination not found: " + this);
            }
            i2 = i3;
        }
        try {
            this.f12245 = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }
}
