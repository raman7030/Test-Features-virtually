package l;

import android.content.Intent;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAJ1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20250 extends AbstractC3817 {

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65467 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f65468;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f65469;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f65472;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f65474;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f65478;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public CharSequence f65479;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public long f65480;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f65470 = false;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f65473 = false;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f65477 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f65481 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f65471 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f65475 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f65476 = new AtomicBoolean();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo11519(Intent intent) {
        super.mo11519(intent);
        this.f65474 = m11535("ARG_MSG_FROM");
        this.f65479 = m11535("ARG_MSG_TO");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC0206 mo10130(AbstractActivityC3346 abstractActivityC3346) {
        C1848 c1848 = new C1848(abstractActivityC3346);
        c1848.m6147(new RunnableC1126(4, this));
        c1848.m6148(new ViewOnClickListenerC19142(4, c1848));
        c1848.m6146(this.f65474);
        c1848.m6154(this.f65479);
        m11532().m1668(c1848.m6155(), new C17810(1, this, c1848));
        c1848.m6153();
        return c1848.m6155();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46497(AbstractC20250 abstractC20250, final C1848 c1848) {
        if (abstractC20250.m11561()) {
            c1848.m6158(abstractC20250.m11557());
        }
        if (abstractC20250.m11547()) {
            if (abstractC20250.f65470) {
                c1848.m6152(abstractC20250.m11534());
            } else {
                c1848.m6156(abstractC20250.m11534());
            }
        }
        if (abstractC20250.f65475.compareAndSet(true, false)) {
            c1848.m6150(abstractC20250.f65473);
        }
        if (abstractC20250.f65477.compareAndSet(true, false)) {
            c1848.m6159(abstractC20250.mo12244());
        }
        if (abstractC20250.f65481.compareAndSet(true, false)) {
            c1848.m6145(abstractC20250.f65480);
        }
        if (abstractC20250.f65471.compareAndSet(true, false)) {
            final boolean z = abstractC20250.f65470;
            Runnable runnable = new Runnable() { // from class: l.ۨۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C1848.m6139(c1848, z);
                }
            };
            if (C10975.m27285()) {
                runnable.run();
            } else {
                C4925.m14315(runnable);
            }
        }
        if (abstractC20250.f65476.compareAndSet(true, false)) {
            c1848.m6146(abstractC20250.f65474);
            c1848.m6154(abstractC20250.f65479);
        }
        c1848.m6144(abstractC20250.m11539());
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo23259(CharSequence charSequence) {
        super.mo11520(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46501(boolean z) {
        this.f65473 = z;
        this.f65475.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo23260(C20876 c20876) {
        this.f65472 = c20876.m47716();
        this.f65478 = c20876.m47714();
        this.f65469 = c20876.m47709();
        this.f65468 = c20876.m47713();
        this.f65477.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ۫֫ */
    public String mo12244() {
        int i = this.f65472;
        long j = this.f65469;
        long j2 = j - this.f65468;
        if (i == 1) {
            return C22927.m51020(j2) + "/" + C22927.m51020(j);
        }
        return (i - this.f65478) + " (" + C22927.m51020(j2) + "/" + C22927.m51020(j) + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23258(long j) {
        this.f65480 = j;
        this.f65481.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final long m46499() {
        return this.f65480;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46500(boolean z) {
        this.f65470 = z;
        this.f65471.set(true);
        m11559();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46498(String str, String str2) {
        this.f65474 = str;
        this.f65479 = str2;
        this.f65476.set(true);
        m11559();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۙ֫ */
    public final void mo11530() {
        super.mo11530();
        this.f65477.set(true);
        this.f65481.set(true);
        this.f65471.set(true);
        this.f65475.set(true);
        this.f65476.set(true);
    }
}
