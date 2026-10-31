package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ᩴۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18518 extends AbstractC11422 implements InterfaceC14242 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f57388;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f57389;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f57390;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f57391;

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

    public C18518(InterfaceC1023 interfaceC1023, long j) {
        super(interfaceC1023, (byte) 8);
        this.f57388 = 0;
        this.f57389 = 0L;
        this.f57390 = 0;
        this.f57391 = j;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f57388;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ */
    public final long mo7549() {
        return this.f57389 + this.f57391;
    }

    @Override // l.InterfaceC14242
    public final long getSize() {
        return this.f57390;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        if (this.f34157 == 0) {
            return 0;
        }
        this.f57388 = C1480.m5121(i, bArr);
        this.f57389 = (((long) C1480.m5123(i + 2, bArr)) & 4294967295L) * 1000;
        this.f57390 = C1480.m5123(i + 6, bArr);
        return 20;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComQueryInformationResponse[");
        sb.append(super.toString());
        sb.append(",fileAttributes=0x");
        sb.append(C12085.m29467(this.f57388, 4));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f57389));
        sb.append(",fileSize=");
        return new String(C3200.m9831(this.f57390, "]", sb));
    }
}
