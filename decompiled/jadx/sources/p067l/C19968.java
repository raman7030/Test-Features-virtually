package p067l;

import java.util.Date;

/* JADX INFO: renamed from: l.ᩴۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19968 extends AbstractC13224 implements InterfaceC15904 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f60609;

    /* JADX INFO: renamed from: ֨֫ */
    public long f60610;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f60611;

    /* JADX INFO: renamed from: ۠֫ */
    public long f60612;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

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

    public C19968(InterfaceC3341 interfaceC3341, long j) {
        super(interfaceC3341, (byte) 8);
        this.f60609 = 0;
        this.f60610 = 0L;
        this.f60611 = 0;
        this.f60612 = j;
    }

    @Override // p067l.InterfaceC15904
    public final int getAttributes() {
        return this.f60609;
    }

    @Override // p067l.InterfaceC15904
    /* JADX INFO: renamed from: ۛ */
    public final long mo9617() {
        return this.f60610 + this.f60612;
    }

    @Override // p067l.InterfaceC15904
    public final long getSize() {
        return this.f60611;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        if (this.f37153 == 0) {
            return 0;
        }
        this.f60609 = C3775.m7363(i, bArr);
        this.f60610 = (((long) C3775.m7365(i + 2, bArr)) & 4294967295L) * 1000;
        this.f60611 = C3775.m7365(i + 6, bArr);
        return 20;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComQueryInformationResponse[");
        sb.append(super.toString());
        sb.append(",fileAttributes=0x");
        sb.append(C13854.m31529(this.f60609, 4));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f60610));
        sb.append(",fileSize=");
        return new String(C5410.m11876(this.f60611, "]", sb));
    }
}
