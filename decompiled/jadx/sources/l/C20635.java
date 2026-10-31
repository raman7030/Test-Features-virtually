package l;

import java.util.Date;

/* JADX INFO: renamed from: l.᩷ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9W0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20635 extends AbstractC10011 implements InterfaceC14242 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f66382;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f66383;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f66384;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public byte f66385;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f66386;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f66387;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f66388;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public long f66389;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public long f66390;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f66391;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public long f66392;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public long f66393;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f66394;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public long f66395;

    @Override // l.InterfaceC14242
    public final long getSize() {
        throw null;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

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

    public C20635(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m47219() {
        return this.f66384;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47221() {
        return this.f66387;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final void m47222() {
        this.f66387 = true;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int m47218() {
        return this.f66386;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f66388;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return this.f66390;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final long m47220() {
        return this.f66389;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f66385 = bArr[i];
        this.f66386 = C1480.m5121(i + 1, bArr);
        this.f66394 = C1480.m5123(i + 3, bArr);
        this.f66392 = C1480.m5127(i + 7, bArr);
        this.f66395 = C1480.m5127(i + 15, bArr);
        this.f66390 = C1480.m5127(i + 23, bArr);
        this.f66393 = C1480.m5127(i + 31, bArr);
        this.f66388 = C1480.m5123(i + 39, bArr);
        this.f66391 = C1480.m5125(i + 43, bArr);
        this.f66389 = C1480.m5125(i + 51, bArr);
        this.f66384 = C1480.m5121(i + 59, bArr);
        this.f66383 = C1480.m5121(i + 61, bArr);
        int i2 = i + 64;
        this.f66382 = (bArr[i + 63] & 255) > 0;
        return i2 - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndXResponse[");
        sb.append(super.toString());
        sb.append(",oplockLevel=");
        sb.append((int) this.f66385);
        sb.append(",fid=");
        sb.append(this.f66386);
        sb.append(",createAction=0x");
        sb.append(C12085.m29467(this.f66394, 4));
        sb.append(",creationTime=");
        sb.append(new Date(this.f66392));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f66395));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f66390));
        sb.append(",changeTime=");
        sb.append(new Date(this.f66393));
        sb.append(",extFileAttributes=0x");
        C19033.m43886(this.f66388, 4, ",allocationSize=", sb);
        sb.append(this.f66391);
        sb.append(",endOfFile=");
        sb.append(this.f66389);
        sb.append(",fileType=");
        sb.append(this.f66384);
        sb.append(",deviceState=");
        sb.append(this.f66383);
        sb.append(",directory=");
        sb.append(this.f66382);
        sb.append("]");
        return new String(sb.toString());
    }
}
