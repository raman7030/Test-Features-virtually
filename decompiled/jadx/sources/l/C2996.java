package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۗۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9VM */
/* JADX INFO: loaded from: classes3.dex */
public final class C2996 extends AbstractC10011 implements InterfaceC9305 {

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public String f9444;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f9445;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public String f9446;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f9447;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C2996(InterfaceC1023 interfaceC1023, AbstractC11422 abstractC11422) {
        super(interfaceC1023, abstractC11422);
        this.f9444 = "";
    }

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String mo9135() {
        return this.f9446;
    }

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo9136() {
        return this.f9447;
    }

    @Override // l.InterfaceC9305
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9134() {
        return m28231() != 65535;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        byte b = bArr[i];
        this.f9445 = (b & 1) == 1;
        this.f9447 = (b & 2) == 2;
        return 2;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndXResponse[");
        sb.append(super.toString());
        sb.append(",supportSearchBits=");
        sb.append(this.f9445);
        sb.append(",shareIsInDfs=");
        sb.append(this.f9447);
        sb.append(",service=");
        sb.append(this.f9446);
        sb.append(",nativeFileSystem=");
        return new String(C9045.m23341(sb, this.f9444, "]"));
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new C13017("zero termination not found: " + this);
            }
            i2 = i3;
        }
        try {
            this.f9446 = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }
}
