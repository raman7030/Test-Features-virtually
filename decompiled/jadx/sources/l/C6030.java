package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6030 extends AbstractC9277 implements InterfaceC18085 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C6236 f18501;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C18321 f18502;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC22258 f18503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f18504;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f18505;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21553 f18506;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f18507;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17379 f18508;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C11197 f18509;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int f18510;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0486 f18511;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 f18512;

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11197 mo9817() {
        return this.f18509;
    }

    @Override // l.AbstractC9277, l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo9822(C11197 c11197) {
        this.f18509 = c11197;
    }

    static {
        C16840.m39615("media3.exoplayer.hls");
    }

    public C6030(C11197 c11197, InterfaceC21553 interfaceC21553, C2503 c2503, C18321 c18321, InterfaceC4454 interfaceC4454, InterfaceC11058 interfaceC11058, InterfaceC17379 interfaceC17379, long j, boolean z, int i) {
        this.f18509 = c11197;
        this.f18501 = c11197.f33610;
        this.f18506 = interfaceC21553;
        this.f18503 = c2503;
        this.f18502 = c18321;
        this.f18512 = interfaceC4454;
        this.f18505 = interfaceC11058;
        this.f18508 = interfaceC17379;
        this.f18507 = j;
        this.f18504 = z;
        this.f18510 = i;
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ֫ */
    public final void mo9820(InterfaceC0486 interfaceC0486) {
        this.f18511 = interfaceC0486;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C13830 c13830M23800 = m23800();
        InterfaceC4454 interfaceC4454 = this.f18512;
        interfaceC4454.mo7627(looperMyLooper, c13830M23800);
        interfaceC4454.mo7630();
        C8134 c8134M23797 = m23797((C15894) null);
        C11881 c11881 = mo9817().f33612;
        c11881.getClass();
        this.f18508.mo9176(c11881.f35426, c8134M23797, this);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public final void mo9823() {
        this.f18508.mo9184();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9546 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        C8134 c8134M23797 = m23797(c15894);
        C15036 c15036M23793 = m23793(c15894);
        return new C12380(this.f18503, this.f18508, this.f18506, this.f18511, this.f18512, c15036M23793, this.f18505, c8134M23797, interfaceC21725, this.f18502, this.f18504, this.f18510, m23800());
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ((C12380) interfaceC9546).m30105();
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9824() {
        this.f18508.stop();
        this.f18512.mo7626();
    }

    @Override // l.InterfaceC18085
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16872(C4951 c4951) {
        long j;
        C8298 c8298;
        long jM11014;
        long j2;
        long jM11015;
        long j3;
        long jElapsedRealtime;
        boolean z = c4951.f15609;
        boolean z2 = c4951.f15596;
        AbstractC14545 abstractC14545 = c4951.f15593;
        long j4 = c4951.f15605;
        long jM11016 = c4951.f15594;
        int i = c4951.f15595;
        long j5 = c4951.f15599;
        long jM11037 = z ? C3603.m11037(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM11037 : -9223372036854775807L;
        InterfaceC17379 interfaceC17379 = this.f18508;
        interfaceC17379.mo9179().getClass();
        C6664 c6664 = new C6664();
        if (interfaceC17379.mo9183()) {
            C20474 c20474 = c4951.f15597;
            long jMo9173 = j5 - interfaceC17379.mo9173();
            boolean z3 = c4951.f15612;
            long j7 = z3 ? jMo9173 + j4 : -9223372036854775807L;
            if (c4951.f15609) {
                String str = C3603.f11424;
                long j8 = this.f18507;
                if (j8 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
                }
                jM11014 = C3603.m11014(jElapsedRealtime) - (j5 + j4);
            } else {
                jM11014 = 0;
            }
            long j9 = this.f18501.f19103;
            if (j9 != -9223372036854775807L) {
                jM11015 = C3603.m11014(j9);
            } else {
                if (jM11016 != -9223372036854775807L) {
                    j2 = j4 - jM11016;
                } else {
                    j2 = c20474.f65995;
                    if (j2 == -9223372036854775807L || c4951.f15604 == -9223372036854775807L) {
                        j2 = c20474.f65993;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c4951.f15603;
                        }
                    }
                }
                jM11015 = j2 + jM11014;
            }
            long j10 = j4 + jM11014;
            long jM11017 = C3603.m11016(jM11015, jM11014, j10);
            C6236 c6236 = mo9817().f33610;
            boolean z4 = c6236.f19104 == -3.4028235E38f && c6236.f19101 == -3.4028235E38f && c20474.f65993 == -9223372036854775807L && c20474.f65995 == -9223372036854775807L;
            C10470 c10470 = new C10470();
            c10470.m26362(C3603.m11037(jM11017));
            c10470.m26360(z4 ? 1.0f : this.f18501.f19104);
            c10470.m26358(z4 ? 1.0f : this.f18501.f19101);
            C6236 c6236M26357 = c10470.m26357();
            this.f18501 = c6236M26357;
            if (jM11016 == -9223372036854775807L) {
                jM11016 = j10 - C3603.m11014(c6236M26357.f19103);
            }
            if (z2) {
                j3 = jM11016;
            } else {
                C8479 c8479M16871 = m16871(jM11016, c4951.f15610);
                if (c8479M16871 != null) {
                    j3 = c8479M16871.f73016;
                } else if (abstractC14545.isEmpty()) {
                    j3 = 0;
                } else {
                    C21885 c21885 = (C21885) abstractC14545.get(C3603.m11009((List) abstractC14545, Long.valueOf(jM11016), true));
                    C8479 c8479M16872 = m16871(jM11016, c21885.f70066);
                    if (c8479M16872 != null) {
                        j3 = c8479M16872.f73016;
                    } else {
                        j3 = c21885.f73016;
                    }
                }
            }
            c8298 = new C8298(j6, jM11037, j7, c4951.f15605, jMo9173, j3, true, !z3, i == 2 && c4951.f15598, c6664, mo9817(), this.f18501);
        } else {
            if (jM11016 == -9223372036854775807L || abstractC14545.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM11016 != j4) {
                    jM11016 = ((C21885) abstractC14545.get(C3603.m11009((List) abstractC14545, Long.valueOf(jM11016), true))).f73016;
                }
                j = jM11016;
            }
            long j11 = c4951.f15605;
            c8298 = new C8298(j6, jM11037, j11, j11, 0L, j, true, false, true, c6664, mo9817(), null);
        }
        m23794(c8298);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8479 m16871(long j, List list) {
        C8479 c8479 = null;
        for (int i = 0; i < list.size(); i++) {
            C8479 c84710 = (C8479) list.get(i);
            long j2 = c84710.f73016;
            if (j2 > j || !c84710.f25917) {
                if (j2 > j) {
                    break;
                }
            } else {
                c8479 = c84710;
            }
        }
        return c8479;
    }
}
