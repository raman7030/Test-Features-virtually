package p067l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8099 extends AbstractC11185 implements InterfaceC19556 {

    /* JADX INFO: renamed from: ֫֫ */
    public C8295 f21357;

    /* JADX INFO: renamed from: ۛ */
    public final C19781 f21358;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC23522 f21359;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f21360;

    /* JADX INFO: renamed from: ۧ֫ */
    public final InterfaceC12878 f21361;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC22852 f21362;

    /* JADX INFO: renamed from: ܰ */
    public final long f21363;

    /* JADX INFO: renamed from: ܳ֫ */
    public final InterfaceC18885 f21364;

    /* JADX INFO: renamed from: ܽ֫ */
    public C13010 f21365;

    /* JADX INFO: renamed from: ܿ֫ */
    public final int f21366;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC2830 f21367;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC6601 f21368;

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13010 mo11862() {
        return this.f21365;
    }

    @Override // p067l.AbstractC11185, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo11867(C13010 c13010) {
        this.f21365 = c13010;
    }

    static {
        C18373.m41851("media3.exoplayer.hls");
    }

    public C8099(C13010 c13010, InterfaceC22852 interfaceC22852, C4747 c4747, C19781 c19781, InterfaceC6601 interfaceC6601, InterfaceC12878 interfaceC12878, InterfaceC18885 interfaceC18885, long j, boolean z, int i) {
        this.f21365 = c13010;
        this.f21357 = c13010.f36609;
        this.f21362 = interfaceC22852;
        this.f21359 = c4747;
        this.f21358 = c19781;
        this.f21368 = interfaceC6601;
        this.f21361 = interfaceC12878;
        this.f21364 = interfaceC18885;
        this.f21363 = j;
        this.f21360 = z;
        this.f21366 = i;
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11865(InterfaceC2830 interfaceC2830) {
        this.f21367 = interfaceC2830;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C15512 c15512M25809 = m25809();
        InterfaceC6601 interfaceC6601 = this.f21368;
        interfaceC6601.mo9698(looperMyLooper, c15512M25809);
        interfaceC6601.mo9701();
        C10099 c10099M25806 = m25806((C17474) null);
        C13660 c13660 = mo11862().f36611;
        c13660.getClass();
        this.f21364.mo11227(c13660.f38436, c10099M25806, this);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo11868() {
        this.f21364.mo11235();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        C10099 c10099M25806 = m25806(c17474);
        C16658 c16658M25802 = m25802(c17474);
        return new C14134(this.f21359, this.f21364, this.f21362, this.f21367, this.f21368, c16658M25802, this.f21361, c10099M25806, interfaceC23016, this.f21358, this.f21360, this.f21366, m25809());
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        ((C14134) interfaceC11441).m32169();
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
        this.f21364.stop();
        this.f21368.mo9697();
    }

    @Override // p067l.InterfaceC19556
    /* JADX INFO: renamed from: ֫ */
    public final void mo18800(C7074 c7074) {
        long j;
        C10255 c10255;
        long jM12990;
        long j2;
        long jM12991;
        long j3;
        long jElapsedRealtime;
        boolean z = c7074.f18443;
        boolean z2 = c7074.f18430;
        AbstractC16192 abstractC16192 = c7074.f18427;
        long j4 = c7074.f18439;
        long jM12992 = c7074.f18428;
        int i = c7074.f18429;
        long j5 = c7074.f18433;
        long jM13013 = z ? C5792.m13013(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM13013 : -9223372036854775807L;
        InterfaceC18885 interfaceC18885 = this.f21364;
        interfaceC18885.mo11230().getClass();
        C8702 c8702 = new C8702();
        if (interfaceC18885.mo11234()) {
            C21827 c21827 = c7074.f18431;
            long jMo11224 = j5 - interfaceC18885.mo11224();
            boolean z3 = c7074.f18446;
            long j7 = z3 ? jMo11224 + j4 : -9223372036854775807L;
            if (c7074.f18443) {
                String str = C5792.f14228;
                long j8 = this.f21363;
                if (j8 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
                }
                jM12990 = C5792.m12990(jElapsedRealtime) - (j5 + j4);
            } else {
                jM12990 = 0;
            }
            long j9 = this.f21357.f21968;
            if (j9 != -9223372036854775807L) {
                jM12991 = C5792.m12990(j9);
            } else {
                if (jM12992 != -9223372036854775807L) {
                    j2 = j4 - jM12992;
                } else {
                    j2 = c21827.f68672;
                    if (j2 == -9223372036854775807L || c7074.f18438 == -9223372036854775807L) {
                        j2 = c21827.f68670;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c7074.f18437;
                        }
                    }
                }
                jM12991 = j2 + jM12990;
            }
            long j10 = j4 + jM12990;
            long jM12993 = C5792.m12992(jM12991, jM12990, j10);
            C8295 c8295 = mo11862().f36609;
            boolean z4 = c8295.f21969 == -3.4028235E38f && c8295.f21966 == -3.4028235E38f && c21827.f68670 == -9223372036854775807L && c21827.f68672 == -9223372036854775807L;
            C12319 c12319 = new C12319();
            c12319.m28394(C5792.m13013(jM12993));
            c12319.m28392(z4 ? 1.0f : this.f21357.f21969);
            c12319.m28390(z4 ? 1.0f : this.f21357.f21966);
            C8295 c8295M28389 = c12319.m28389();
            this.f21357 = c8295M28389;
            if (jM12992 == -9223372036854775807L) {
                jM12992 = j10 - C5792.m12990(c8295M28389.f21968);
            }
            if (z2) {
                j3 = jM12992;
            } else {
                C10427 c10427M18799 = m18799(jM12992, c7074.f18444);
                if (c10427M18799 != null) {
                    j3 = c10427M18799.f75743;
                } else if (abstractC16192.isEmpty()) {
                    j3 = 0;
                } else {
                    C23168 c23168 = (C23168) abstractC16192.get(C5792.m12985((List) abstractC16192, Long.valueOf(jM12992), true));
                    C10427 c10427M187910 = m18799(jM12992, c23168.f72778);
                    if (c10427M187910 != null) {
                        j3 = c10427M187910.f75743;
                    } else {
                        j3 = c23168.f75743;
                    }
                }
            }
            c10255 = new C10255(j6, jM13013, j7, c7074.f18439, jMo11224, j3, true, !z3, i == 2 && c7074.f18432, c8702, mo11862(), this.f21357);
        } else {
            if (jM12992 == -9223372036854775807L || abstractC16192.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM12992 != j4) {
                    jM12992 = ((C23168) abstractC16192.get(C5792.m12985((List) abstractC16192, Long.valueOf(jM12992), true))).f75743;
                }
                j = jM12992;
            }
            long j11 = c7074.f18439;
            c10255 = new C10255(j6, jM13013, j11, j11, 0L, j, true, false, true, c8702, mo11862(), null);
        }
        m25803(c10255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10427 m18799(long j, List list) {
        C10427 c10427 = null;
        for (int i = 0; i < list.size(); i++) {
            C10427 c10428 = (C10427) list.get(i);
            long j2 = c10428.f75743;
            if (j2 > j || !c10428.f28832) {
                if (j2 > j) {
                    break;
                }
            } else {
                c10427 = c10428;
            }
        }
        return c10427;
    }
}
