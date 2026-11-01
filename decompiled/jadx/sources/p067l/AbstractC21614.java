package p067l;

import android.content.Intent;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAJ1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21614 extends AbstractC5996 {

    /* JADX INFO: renamed from: ۙ֫ */
    public static final /* synthetic */ int f68116 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public long f68117;

    /* JADX INFO: renamed from: ֨֫ */
    public long f68118;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f68121;

    /* JADX INFO: renamed from: ۡ֫ */
    public CharSequence f68123;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f68127;

    /* JADX INFO: renamed from: ᩶֫ */
    public CharSequence f68128;

    /* JADX INFO: renamed from: ᩸֫ */
    public long f68129;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f68119 = false;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f68122 = false;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final AtomicBoolean f68126 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹֫ */
    public final AtomicBoolean f68130 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۘ֫ */
    public final AtomicBoolean f68120 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܶ֫ */
    public final AtomicBoolean f68124 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܺ֫ */
    public final AtomicBoolean f68125 = new AtomicBoolean();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo13455(Intent intent) {
        super.mo13455(intent);
        this.f68123 = m13471("ARG_MSG_FROM");
        this.f68128 = m13471("ARG_MSG_TO");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549) {
        C4125 c4125 = new C4125(abstractActivityC5549);
        c4125.m8345(new RunnableC3439(4, this));
        c4125.m8346(new ViewOnClickListenerC20561(4, c4125));
        c4125.m8344(this.f68123);
        c4125.m8352(this.f68128);
        m13468().m4066(c4125.m8353(), new C19295(1, this, c4125));
        c4125.m8351();
        return c4125.m8353();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48818(AbstractC21614 abstractC21614, final C4125 c4125) {
        if (abstractC21614.m13497()) {
            c4125.m8356(abstractC21614.m13493());
        }
        if (abstractC21614.m13483()) {
            if (abstractC21614.f68119) {
                c4125.m8350(abstractC21614.m13470());
            } else {
                c4125.m8354(abstractC21614.m13470());
            }
        }
        if (abstractC21614.f68124.compareAndSet(true, false)) {
            c4125.m8348(abstractC21614.f68122);
        }
        if (abstractC21614.f68126.compareAndSet(true, false)) {
            c4125.m8357(abstractC21614.mo14165());
        }
        if (abstractC21614.f68130.compareAndSet(true, false)) {
            c4125.m8343(abstractC21614.f68129);
        }
        if (abstractC21614.f68120.compareAndSet(true, false)) {
            final boolean z = abstractC21614.f68119;
            Runnable runnable = new Runnable() { // from class: l.ۨۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C4125.m8337(c4125, z);
                }
            };
            if (C12799.m29347()) {
                runnable.run();
            } else {
                C7050.m16212(runnable);
            }
        }
        if (abstractC21614.f68125.compareAndSet(true, false)) {
            c4125.m8344(abstractC21614.f68123);
            c4125.m8352(abstractC21614.f68128);
        }
        c4125.m8342(abstractC21614.m13475());
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo25203(CharSequence charSequence) {
        super.mo13456(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48822(boolean z) {
        this.f68122 = z;
        this.f68124.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo25204(C22209 c22209) {
        this.f68121 = c22209.m50046();
        this.f68127 = c22209.m50044();
        this.f68118 = c22209.m50039();
        this.f68117 = c22209.m50043();
        this.f68126.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ۫֫ */
    public String mo14165() {
        int i = this.f68121;
        long j = this.f68118;
        long j2 = j - this.f68117;
        if (i == 1) {
            return C24158.m53411(j2) + "/" + C24158.m53411(j);
        }
        return (i - this.f68127) + " (" + C24158.m53411(j2) + "/" + C24158.m53411(j) + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo25202(long j) {
        this.f68129 = j;
        this.f68130.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public final long m48820() {
        return this.f68129;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48821(boolean z) {
        this.f68119 = z;
        this.f68120.set(true);
        m13495();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48819(String str, String str2) {
        this.f68123 = str;
        this.f68128 = str2;
        this.f68125.set(true);
        m13495();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۙ֫ */
    public final void mo13466() {
        super.mo13466();
        this.f68126.set(true);
        this.f68130.set(true);
        this.f68120.set(true);
        this.f68124.set(true);
        this.f68125.set(true);
    }
}
