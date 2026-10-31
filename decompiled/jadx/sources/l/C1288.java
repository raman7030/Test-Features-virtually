package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1288 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f4519;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4520;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11459 f4521;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f4522;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f4523;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f4524;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4525;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20758 f4526;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f4527;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6374 f4528;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f4529;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4530;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f4532;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22455 f4533;

    public C1288(C22455 c22455, C14134 c14134, InterfaceC7785 interfaceC7785, int i, C11459 c11459, int i2, int[] iArr, String str, boolean z, int i3, boolean z2, InterfaceC20758 interfaceC20758, C12392 c12392, AbstractActivityC3346 abstractActivityC3346) {
        this.f4533 = c22455;
        this.f4519 = c14134;
        this.f4529 = interfaceC7785;
        this.f4525 = i;
        this.f4521 = c11459;
        this.f4520 = i2;
        this.f4523 = iArr;
        this.f4530 = str;
        this.f4522 = z;
        this.f4531 = i3;
        this.f4532 = z2;
        this.f4526 = interfaceC20758;
        this.f4527 = c12392;
        this.f4524 = abstractActivityC3346;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f4533.f72734 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C14134 c14134 = this.f4519;
        c14134.m33742();
        RunnableC19781 runnableC19781 = new RunnableC19781(0, c14134);
        C7744 c7744Mo26562 = this.f4529.mo26562();
        try {
            c7744Mo26562.m20766(runnableC19781);
            c14134.m33742();
            if (c7744Mo26562.m20767() != this.f4525) {
                throw new CancellationException();
            }
            C12164 c12164Matcher = this.f4521.matcher((CharSequence) c7744Mo26562);
            c12164Matcher.m29604();
            c12164Matcher.m29599(runnableC19781);
            int i = this.f4520;
            int[] iArr = this.f4523;
            if (i == 1) {
                iArr[0] = c7744Mo26562.lastIndexOf('\n', 0, iArr[0]) + 1;
                int iIndexOf = c7744Mo26562.indexOf('\n', iArr[1], c7744Mo26562.length());
                iArr[1] = iIndexOf;
                if (iIndexOf == -1) {
                    iArr[1] = c7744Mo26562.length();
                }
            } else if (i == 2) {
                iArr[1] = iArr[0];
                iArr[0] = 0;
            } else if (i == 3) {
                iArr[0] = iArr[1];
                iArr[1] = c7744Mo26562.length();
            } else if (i != 0) {
                iArr[0] = 0;
                iArr[1] = c7744Mo26562.length();
            }
            c12164Matcher.m29614region(iArr[0], iArr[1]);
            String str = this.f4530;
            boolean z = this.f4522;
            int i2 = this.f4531;
            boolean z2 = this.f4532;
            final InterfaceC20758 interfaceC20758 = this.f4526;
            this.f4528 = C6374.m17676(c7744Mo26562, c12164Matcher, str, z, i2, z2, runnableC19781, new Supplier() { // from class: l.ۚᩳܿ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new C3532(interfaceC20758, C6417.m17744(), 0);
                }
            });
            c14134.m33742();
            c7744Mo26562.close();
        } catch (Throwable th) {
            try {
                c7744Mo26562.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f4519.m33737()) {
            if (this.f4528.count() != 0) {
                this.f4528.m17689(this.f4527, this.f4529, this.f4532);
                C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector, Integer.valueOf(this.f4528.count())));
            } else {
                C21374.m48457(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f4519.m33738() && !(exc instanceof CancellationException)) {
            this.f4524.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C22455 c22455 = this.f4533;
        C14134 c14134 = this.f4519;
        try {
            C6374 c6374 = this.f4528;
            if (c6374 != null) {
                c6374.close();
            }
        } finally {
            c14134.m33741();
            c22455.f72734 = false;
        }
    }
}
