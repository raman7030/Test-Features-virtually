package p067l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ᩴ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20071 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public int f61002;

    /* JADX INFO: renamed from: ۢ */
    public final C8420 f61003;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f61004;

    /* JADX INFO: renamed from: ܿ */
    public int f61005;

    /* JADX INFO: renamed from: ᩷ */
    public Uri f61006;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f61007;

    public C20071(byte[] bArr) {
        C8420 c8420 = new C8420(bArr);
        super(false);
        this.f61003 = c8420;
        C23877.m52957(bArr.length > 0);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C23423 {
        m9837(c5318);
        Uri uri = c5318.f12514;
        long j = c5318.f12516;
        this.f61006 = uri;
        byte[] bArr = (byte[]) this.f61003.f22577;
        this.f61004 = bArr;
        long j2 = c5318.f12521;
        if (j2 > bArr.length) {
            throw new C23423(2008);
        }
        int i = (int) j2;
        this.f61002 = i;
        int length = bArr.length - i;
        this.f61005 = length;
        if (j != -1) {
            this.f61005 = (int) Math.min(length, j);
        }
        this.f61007 = true;
        m9839(c5318);
        return j != -1 ? j : this.f61005;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f61005;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f61004;
        C23877.m52958(bArr2);
        System.arraycopy(bArr2, this.f61002, bArr, i, iMin);
        this.f61002 += iMin;
        this.f61005 -= iMin;
        m9840(iMin);
        return iMin;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f61006;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        if (this.f61007) {
            this.f61007 = false;
            m9838();
        }
        this.f61006 = null;
        this.f61004 = null;
    }
}
