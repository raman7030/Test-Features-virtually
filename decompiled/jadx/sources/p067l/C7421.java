package p067l;

import bin.p000mt.plus.R;
import java.util.concurrent.Future;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7421 {

    /* JADX INFO: renamed from: ֡ */
    public final InterfaceC9768 f19406;

    /* JADX INFO: renamed from: ֨ */
    public final int f19407;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f19408;

    /* JADX INFO: renamed from: ۖ */
    public final int f19409;

    /* JADX INFO: renamed from: ۘ */
    public final C15802 f19410;

    /* JADX INFO: renamed from: ۚ */
    public final int f19411;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f19412;

    /* JADX INFO: renamed from: ۠ */
    public final /* synthetic */ C3397 f19413;

    /* JADX INFO: renamed from: ۡ */
    public final C14698 f19414;

    /* JADX INFO: renamed from: ۢ */
    public final String f19415;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f19416;

    /* JADX INFO: renamed from: ܳ */
    public final C13929 f19417;

    /* JADX INFO: renamed from: ܺ */
    public final int f19418;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f19419;

    /* JADX INFO: renamed from: ܿ */
    public volatile Future f19420;

    /* JADX INFO: renamed from: ᩳ */
    public final int f19421;

    /* JADX INFO: renamed from: ᩴ */
    public final int f19422;

    /* JADX INFO: renamed from: ᩵ */
    public final int f19423;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC4739 f19424;

    /* JADX INFO: renamed from: ᩻ */
    public final int f19425;

    public C7421(C3397 c3397) {
        this.f19413 = c3397;
        this.f19417 = c3397.f6725;
        InterfaceC9768 interfaceC9768 = c3397.f6744;
        this.f19406 = interfaceC9768;
        this.f19425 = c3397.f6743;
        this.f19407 = c3397.f6720;
        int length = interfaceC9768.length();
        this.f19411 = length;
        boolean z = false;
        int i = c3397.f6746 == null ? 0 : c3397.f6746.f41923;
        this.f19409 = i;
        this.f19418 = c3397.f6746 != null ? c3397.f6746.f41922 : length;
        this.f19423 = c3397.f6734.m32508();
        int iM32512 = c3397.f6734.m32512();
        this.f19422 = iM32512;
        if (Math.max(i, iM32512) == i && !C3397.m5967(c3397, i)) {
            z = true;
        }
        this.f19408 = z;
        this.f19415 = c3397.f6732;
        this.f19421 = c3397.m5989();
        this.f19414 = c3397.f6734.m32582();
        this.f19424 = c3397.f6730;
        this.f19412 = c3397.f6721;
        this.f19410 = new C15802(c3397.f6734, c3397.f6722, R.string.MT_Protector, new BooleanSupplier() { // from class: l.֡ۧܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                C7421 c7421 = this.f4571;
                return c7421.f19413.m5969(c7421);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17141(Future future) {
        this.f19420 = future;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17144() {
        while (this.f19420 == null) {
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m17145() {
        Future future = this.f19420;
        return future != null && future.isDone();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m17143() {
        Future future = this.f19420;
        if (this.f19416 || this.f19410.m35871()) {
            return true;
        }
        return future != null && future.isCancelled();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17140() {
        this.f19416 = true;
        this.f19410.m35872();
        Future future = this.f19420;
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17142() {
        this.f19410.m35873();
    }
}
