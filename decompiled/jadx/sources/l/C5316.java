package l;

import bin.mt.plus.R;
import java.util.concurrent.Future;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5316 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f16569;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f16570;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f16571;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f16572;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14134 f16573;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f16574;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f16575;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1082 f16576;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12973 f16577;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f16578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16579;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12164 f16580;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f16581;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16582;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Future f16583;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f16584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f16585;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f16586;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2494 f16587;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f16588;

    public C5316(C1082 c1082) {
        this.f16576 = c1082;
        this.f16580 = c1082.f3954;
        InterfaceC7785 interfaceC7785 = c1082.f3973;
        this.f16569 = interfaceC7785;
        this.f16588 = c1082.f3972;
        this.f16570 = c1082.f3949;
        int length = interfaceC7785.length();
        this.f16574 = length;
        boolean z = false;
        int i = c1082.f3975 == null ? 0 : c1082.f3975.f38879;
        this.f16572 = i;
        this.f16581 = c1082.f3975 != null ? c1082.f3975.f38878 : length;
        this.f16586 = c1082.f3963.m30444();
        int iM30448 = c1082.f3963.m30448();
        this.f16585 = iM30448;
        if (Math.max(i, iM30448) == i && !C1082.m3696(c1082, i)) {
            z = true;
        }
        this.f16571 = z;
        this.f16578 = c1082.f3961;
        this.f16584 = c1082.m3718();
        this.f16577 = c1082.f3963.m30518();
        this.f16587 = c1082.f3959;
        this.f16575 = c1082.f3950;
        this.f16573 = new C14134(c1082.f3963, c1082.f3951, R.string.MT_Protector, new BooleanSupplier() { // from class: l.֡ۧܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                C5316 c5316 = this.f1792;
                return c5316.f16576.m3698(c5316);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15235(Future future) {
        this.f16583 = future;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15238() {
        while (this.f16583 == null) {
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m15239() {
        Future future = this.f16583;
        return future != null && future.isDone();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m15237() {
        Future future = this.f16583;
        if (this.f16579 || this.f16573.m33739()) {
            return true;
        }
        return future != null && future.isCancelled();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15234() {
        this.f16579 = true;
        this.f16573.m33740();
        Future future = this.f16583;
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15236() {
        this.f16573.m33741();
    }
}
