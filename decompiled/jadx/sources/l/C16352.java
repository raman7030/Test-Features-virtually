package l;

import java.math.RoundingMode;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ܽۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16352 implements InterfaceC23408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50329;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f50330;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f50331;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17971 f50332;

    public C16352(long j, long j2, long j3) {
        this.f50332 = new C17971(j, new long[]{j2}, new long[]{0});
        this.f50331 = j2;
        this.f50330 = j3;
        int i = SecP160R1Field.PInv;
        if (j != -9223372036854775807L) {
            long jM11017 = C3603.m11017(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jM11017 > 0 && jM11017 <= 2147483647L) {
                i = (int) jM11017;
            }
            this.f50329 = i;
            return;
        }
        this.f50329 = SecP160R1Field.PInv;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17869(long j) {
        return this.f50332.m41982(j);
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17868() {
        return this.f50331;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩳ */
    public final long mo17870() {
        return this.f50330;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return this.f50332.mo6829();
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f50332.mo6827();
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        return this.f50332.mo1721(j);
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17871() {
        return this.f50329;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38497(long j, long j2) {
        C17971 c17971 = this.f50332;
        if (c17971.m41983(j)) {
            return;
        }
        c17971.m41981(j, j2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38498(long j) {
        return this.f50332.m41983(j);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38499(long j) {
        this.f50332.m41984(j);
    }
}
