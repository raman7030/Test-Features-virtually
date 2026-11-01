package p067l;

/* JADX INFO: renamed from: l.᩻᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25127 {

    /* JADX INFO: renamed from: ֫ */
    public final int f80409;

    /* JADX INFO: renamed from: ۧ */
    public final C4340 f80410;

    /* JADX INFO: renamed from: ܽ */
    public C18421 f80411;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16409 f80412;

    public AbstractC25127(InterfaceC19763 interfaceC19763, InterfaceC16409 interfaceC16409, long j, long j2, long j3, long j4, long j5, int i) {
        this.f80412 = interfaceC16409;
        this.f80409 = i;
        this.f80410 = new C4340(interfaceC19763, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4340 m55177() {
        return this.f80410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55178(long j) {
        C18421 c18421 = this.f80411;
        if (c18421 == null || C18421.m41965(c18421) != j) {
            C4340 c4340 = this.f80410;
            this.f80411 = new C18421(j, c4340.m8954(j), 0L, c4340.f9705, c4340.f9706, c4340.f9703, c4340.f9702);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m55179() {
        return this.f80411 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m55176(InterfaceC10375 interfaceC10375, C24812 c24812) {
        while (true) {
            C18421 c18421 = this.f80411;
            C23877.m52958(c18421);
            long jM41961 = C18421.m41961(c18421);
            long jM41959 = C18421.m41959(c18421);
            long jM41963 = C18421.m41963(c18421);
            long j = jM41959 - jM41961;
            long j2 = this.f80409;
            InterfaceC16409 interfaceC16409 = this.f80412;
            if (j <= j2) {
                this.f80411 = null;
                interfaceC16409.mo29260();
                return m55175(interfaceC10375, jM41961, c24812);
            }
            long position = jM41963 - interfaceC10375.getPosition();
            if (position < 0 || position > 262144) {
                return m55175(interfaceC10375, jM41963, c24812);
            }
            interfaceC10375.mo24040((int) position);
            interfaceC10375.mo24036();
            C19092 c19092Mo29259 = interfaceC16409.mo29259(interfaceC10375, C18421.m41964(c18421));
            int i = c19092Mo29259.f56964;
            if (i == -3) {
                this.f80411 = null;
                interfaceC16409.mo29260();
                return m55175(interfaceC10375, jM41963, c24812);
            }
            if (i == -2) {
                C18421.m41962(c18421, c19092Mo29259.f56963, c19092Mo29259.f56962);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = c19092Mo29259.f56962 - interfaceC10375.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC10375.mo24040((int) position2);
                    }
                    this.f80411 = null;
                    interfaceC16409.mo29260();
                    return m55175(interfaceC10375, c19092Mo29259.f56962, c24812);
                }
                C18421.m41960(c18421, c19092Mo29259.f56963, c19092Mo29259.f56962);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m55175(InterfaceC10375 interfaceC10375, long j, C24812 c24812) {
        if (j == interfaceC10375.getPosition()) {
            return 0;
        }
        c24812.f79276 = j;
        return 1;
    }
}
