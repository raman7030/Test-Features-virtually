package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0963 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f3617;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f3618;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f3619;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3620;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3621;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21134 f3623;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8019 f3624;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f3622 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AtomicReference f3625 = new AtomicReference();

    public C0963(C8019 c8019, AbstractC3163 abstractC3163, boolean z, boolean z2, long j, RunnableC21134 runnableC21134) {
        this.f3624 = c8019;
        this.f3617 = abstractC3163;
        this.f3621 = z;
        this.f3620 = z2;
        this.f3618 = j;
        this.f3623 = runnableC21134;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f3624.f24759.m39056());
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f3619 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        InterfaceC17066 interfaceC17066 = new InterfaceC17066() { // from class: l.֡ۜ᩻
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
            public final boolean mo1526() {
                C0963 c0963 = this.f1540;
                return c0963.f3619.m51053() || c0963.f3625.get() != null;
            }
        };
        final AbstractC3163 abstractC3163 = this.f3617;
        C20720 c20720 = new C20720(abstractC3163, interfaceC17066);
        c20720.m47324(this.f3621);
        c20720.m47326(this.f3620);
        List list = this.f3624.f24757;
        final long j = this.f3618;
        c20720.m47323(list, new InterfaceC23541() { // from class: l.ۚۜ᩻
            @Override // l.InterfaceC23541
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo14971(C6608 c6608, int i, int i2) {
                AbstractC3163 abstractC3164 = abstractC3163;
                long j2 = j;
                C0963 c0963 = this.f16290;
                C22933 c22933 = c0963.f3619;
                String str = c6608.f20344;
                String str2 = c6608.f20343;
                c22933.m51040(str);
                c0963.f3619.m51039(i, i2);
                try {
                    abstractC3164.mo9700(j2, str2);
                    c0963.f3622 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC17889 interfaceC17889 : c0963.f3624.f24757) {
                            if (interfaceC17889.getPath().equals(str2)) {
                                interfaceC17889.setTime(j2);
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c0963.f3625;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f3619.m51053()) {
            return;
        }
        AtomicReference atomicReference = this.f3625;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f3619.m51053() || !this.f3622) {
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f3624.f24759.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f3622) {
            this.f3623.run();
        }
        this.f3619.m51051();
    }
}
