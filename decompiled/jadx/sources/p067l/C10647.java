package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N67V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10647 {

    /* JADX INFO: renamed from: ֫ */
    public int f29436;

    /* JADX INFO: renamed from: ۧ */
    public int f29437;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC9305 f29438;

    /* JADX INFO: renamed from: ܿ */
    public final C17351 f29439;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC13053 f29440;

    public C10647(InterfaceC9305 interfaceC9305, C16069 c16069, C17351 c17351) {
        this.f29438 = interfaceC9305;
        this.f29440 = c16069;
        this.f29439 = c17351;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24471(int i) {
        this.f29436 = 0;
        this.f29437 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24473(int i, int i2, C9384 c9384, C24787 c24787, C9384 c9385) {
        InterfaceC9305 interfaceC9305 = this.f29438;
        int iMo18431 = interfaceC9305.mo18431(c9384);
        int iMo18432 = ((C16069) this.f29440).mo18431(c24787);
        int iMo18433 = interfaceC9305.mo18431(c9385);
        m24470(i);
        C17351 c17351 = this.f29439;
        if (iMo18433 == -1) {
            c17351.write(3);
            C17351.m39338(c17351, i2);
            C17351.m39338(c17351, iMo18431 + 1);
            C17351.m39338(c17351, iMo18432 + 1);
            return;
        }
        c17351.write(4);
        C17351.m39338(c17351, i2);
        C17351.m39338(c17351, iMo18431 + 1);
        C17351.m39338(c17351, iMo18432 + 1);
        C17351.m39338(c17351, iMo18433 + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24472(int i, int i2) {
        m24470(i);
        C17351 c17351 = this.f29439;
        c17351.write(5);
        C17351.m39338(c17351, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24478(int i, int i2) {
        m24470(i);
        C17351 c17351 = this.f29439;
        c17351.write(6);
        C17351.m39338(c17351, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24477(int i) {
        m24470(i);
        this.f29439.write(7);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24475(int i) {
        m24470(i);
        this.f29439.write(8);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24476(int i, int i2) {
        int i3 = i2 - this.f29437;
        int i4 = i - this.f29436;
        if (i4 < 0) {
            throw new C17034(null, "debug info items must have non-decreasing code addresses", new Object[0]);
        }
        C17351 c17351 = this.f29439;
        if (i3 < -4 || i3 > 10) {
            if (i3 != 0) {
                c17351.write(2);
                C17351.m39337(c17351, i3);
                this.f29437 = i2;
            }
            i3 = 0;
        }
        if ((i3 < 2 && i4 > 16) || (i3 > 1 && i4 > 15)) {
            m24470(i);
            i4 = 0;
        }
        c17351.write((byte) (i3 + 4 + (i4 * 15) + 10));
        this.f29437 += i3;
        this.f29436 += i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24474(int i, C9384 c9384) {
        m24470(i);
        C17351 c17351 = this.f29439;
        c17351.write(9);
        C17351.m39338(c17351, this.f29438.mo18431(c9384) + 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24470(int i) throws IOException {
        int i2 = i - this.f29436;
        if (i2 > 0) {
            C17351 c17351 = this.f29439;
            c17351.write(1);
            c17351.getClass();
            C17351.m39338(c17351, i2);
            this.f29436 = i;
        }
    }
}
