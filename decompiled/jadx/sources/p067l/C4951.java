package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۖᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8RD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4951 implements InterfaceC20790 {

    /* JADX INFO: renamed from: ֫ */
    public C10307 f11273;

    /* JADX INFO: renamed from: ۜ */
    public boolean f11274;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC11657 f11275;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20790 f11277;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8974 f11280;

    /* JADX INFO: renamed from: ᩻ */
    public int f11281 = 0;

    /* JADX INFO: renamed from: ܳ */
    public int f11276 = 0;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f11278 = C5792.f14227;

    /* JADX INFO: renamed from: ᩳ */
    public final C19203 f11279 = new C19203();

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo10501(long j) {
    }

    public C4951(InterfaceC20790 interfaceC20790, InterfaceC8974 interfaceC8974) {
        this.f11277 = interfaceC20790;
        this.f11280 = interfaceC8974;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10499() {
        this.f11274 = true;
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10503(C10307 c10307) {
        c10307.f28528.getClass();
        String str = c10307.f28528;
        C23877.m52957(C11669.m26822(str) == 3);
        boolean zEquals = c10307.equals(this.f11273);
        InterfaceC8974 interfaceC8974 = this.f11280;
        if (!zEquals) {
            this.f11273 = c10307;
            this.f11275 = interfaceC8974.mo20731(c10307) ? interfaceC8974.mo20733(c10307) : null;
        }
        InterfaceC11657 interfaceC11657 = this.f11275;
        InterfaceC20790 interfaceC20790 = this.f11277;
        if (interfaceC11657 == null) {
            interfaceC20790.mo10503(c10307);
            return;
        }
        C3601 c3601M23918 = c10307.m23918();
        c3601M23918.m6697("application/x-media3-cues");
        c3601M23918.m6677(str);
        c3601M23918.m6675(C14849.FOREVER_NS);
        c3601M23918.m6696(interfaceC8974.mo20732(c10307));
        interfaceC20790.mo10503(c3601M23918.m6672());
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ۧ */
    public final int mo10505(InterfaceC11649 interfaceC11649, int i, boolean z) throws EOFException {
        if (this.f11275 == null) {
            return this.f11277.mo10505(interfaceC11649, i, z);
        }
        m10496(i);
        int i2 = interfaceC11649.read(this.f11278, this.f11276, i);
        if (i2 != -1) {
            this.f11276 += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10504(C19203 c19203, int i, int i2) {
        if (this.f11275 == null) {
            this.f11277.mo10504(c19203, i, i2);
            return;
        }
        m10496(i);
        c19203.m43707(this.f11276, i, this.f11278);
        this.f11276 += i;
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10502(final long j, final int i, int i2, int i3, C20119 c20119) {
        if (this.f11275 == null) {
            this.f11277.mo10502(j, i, i2, i3, c20119);
            return;
        }
        C23877.m52956("DRM on subtitles is not supported", c20119 == null);
        int i4 = (this.f11276 - i3) - i2;
        try {
            this.f11275.mo8744(this.f11278, i4, i2, C22386.m50238(), new InterfaceC24686() { // from class: l.ܺᩴۧ
                @Override // p067l.InterfaceC24686
                public final void accept(Object obj) {
                    C4951.m10497(this.f52831, j, i, (C14596) obj);
                }
            });
        } catch (RuntimeException e) {
            if (this.f11274) {
                C21334.m48350("Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.f11281 = i5;
        if (i5 == this.f11276) {
            this.f11281 = 0;
            this.f11276 = 0;
        }
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final int mo10498(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return mo10505(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10500(int i, C19203 c19203) {
        mo10504(c19203, i, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10497(C4951 c4951, long j, int i, C14596 c14596) {
        C23877.m52958(c4951.f11273);
        byte[] bArrM11175 = C5209.m11175(c14596.f41681, c14596.f41680);
        C19203 c19203 = c4951.f11279;
        c19203.getClass();
        c19203.m43708(bArrM11175.length, bArrM11175);
        c4951.f11277.mo10500(bArrM11175.length, c19203);
        long j2 = c14596.f41683;
        if (j2 == -9223372036854775807L) {
            C23877.m52960(c4951.f11273.f28534 == C14849.FOREVER_NS);
        } else {
            long j3 = c4951.f11273.f28534;
            j = j3 == C14849.FOREVER_NS ? j + j2 : j2 + j3;
        }
        c4951.f11277.mo10502(j, i | 1, bArrM11175.length, 0, null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10496(int i) {
        int length = this.f11278.length;
        int i2 = this.f11276;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f11281;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f11278;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f11281, bArr2, 0, i3);
        this.f11281 = 0;
        this.f11276 = i3;
        this.f11278 = bArr2;
    }
}
