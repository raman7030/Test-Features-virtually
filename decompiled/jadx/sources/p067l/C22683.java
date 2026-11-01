package p067l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.᩸ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22683 implements InterfaceC16646 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC23116 f71555;

    /* JADX INFO: renamed from: ۜ */
    public final C21342 f71556;

    /* JADX INFO: renamed from: ۧ */
    public final C10307 f71557;

    /* JADX INFO: renamed from: ܳ */
    public final int f71558;

    /* JADX INFO: renamed from: ܽ */
    public long f71559;

    /* JADX INFO: renamed from: ܿ */
    public long f71560;

    /* JADX INFO: renamed from: ᩳ */
    public int f71561;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC20790 f71562;

    public C22683(InterfaceC23116 interfaceC23116, InterfaceC20790 interfaceC20790, C21342 c21342, String str, int i) throws C10998 {
        this.f71555 = interfaceC23116;
        this.f71562 = interfaceC20790;
        this.f71556 = c21342;
        int i2 = c21342.f67292;
        int i3 = c21342.f67294;
        int i4 = (c21342.f67290 * i2) / 8;
        int i5 = c21342.f67291;
        if (i5 != i4) {
            throw C10998.m25387("Expected block size: " + i4 + "; got: " + i5, (Throwable) null);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f71558 = iMax;
        C3601 c3601 = new C3601();
        c3601.m6694("audio/wav");
        c3601.m6697(str);
        c3601.m6700(i7);
        c3601.m6670(i7);
        c3601.m6683(iMax);
        c3601.m6704(i2);
        c3601.m6688(i3);
        c3601.m6707(i);
        this.f71557 = c3601.m6672();
    }

    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final void mo23240(long j) {
        this.f71560 = j;
        this.f71561 = 0;
        this.f71559 = 0L;
    }

    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final void mo23239(int i, long j) {
        C14635 c14635 = new C14635(this.f71556, 1, i, j);
        this.f71555.mo5733(c14635);
        C10307 c10307 = this.f71557;
        InterfaceC20790 interfaceC20790 = this.f71562;
        interfaceC20790.mo10503(c10307);
        interfaceC20790.mo10501(c14635.mo8953());
    }

    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23241(InterfaceC10375 interfaceC10375, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f71561) < (i2 = this.f71558)) {
            int iMo10498 = this.f71562.mo10498((InterfaceC11649) interfaceC10375, (int) Math.min(i2 - i, j2), true);
            if (iMo10498 == -1) {
                j2 = 0;
            } else {
                this.f71561 += iMo10498;
                j2 -= (long) iMo10498;
            }
        }
        C21342 c21342 = this.f71556;
        int i3 = c21342.f67291;
        int i4 = this.f71561 / i3;
        if (i4 > 0) {
            long j3 = this.f71560;
            long j4 = this.f71559;
            long j5 = c21342.f67294;
            String str = C5792.f14228;
            long jM12993 = j3 + C5792.m12993(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f71561 - i5;
            this.f71562.mo10502(jM12993, 1, i5, i6, null);
            this.f71559 += (long) i4;
            this.f71561 = i6;
        }
        return j2 <= 0;
    }
}
