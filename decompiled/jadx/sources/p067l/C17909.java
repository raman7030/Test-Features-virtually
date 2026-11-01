package p067l;

import java.math.RoundingMode;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ܽۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17909 implements InterfaceC24615 {

    /* JADX INFO: renamed from: ֫ */
    public final int f53502;

    /* JADX INFO: renamed from: ۧ */
    public final long f53503;

    /* JADX INFO: renamed from: ܽ */
    public final long f53504;

    /* JADX INFO: renamed from: ᩳ */
    public final C19448 f53505;

    public C17909(long j, long j2, long j3) {
        this.f53505 = new C19448(j, new long[]{j2}, new long[]{0});
        this.f53504 = j2;
        this.f53503 = j3;
        int i = SecP160R1Field.PInv;
        if (j != -9223372036854775807L) {
            long jM12993 = C5792.m12993(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jM12993 > 0 && jM12993 <= 2147483647L) {
                i = (int) jM12993;
            }
            this.f53502 = i;
            return;
        }
        this.f53502 = SecP160R1Field.PInv;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19817(long j) {
        return this.f53505.m44231(j);
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19816() {
        return this.f53504;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩳ */
    public final long mo19818() {
        return this.f53503;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return this.f53505.mo8955();
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f53505.mo8953();
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        return this.f53505.mo4119(j);
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19819() {
        return this.f53502;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40714(long j, long j2) {
        C19448 c19448 = this.f53505;
        if (c19448.m44232(j)) {
            return;
        }
        c19448.m44230(j, j2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m40715(long j) {
        return this.f53505.m44232(j);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40716(long j) {
        this.f53505.m44233(j);
    }
}
