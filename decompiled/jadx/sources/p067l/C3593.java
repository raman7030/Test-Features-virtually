package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3593 extends AbstractC9542 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ C15802 f7293;

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ int f7294;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C13259 f7295;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ boolean f7296;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ int[] f7297;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f7298;

    /* JADX INFO: renamed from: ۠ */
    public final /* synthetic */ int f7299;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ InterfaceC22097 f7300;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C14146 f7301;

    /* JADX INFO: renamed from: ܳ */
    public C8427 f7302;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ InterfaceC9768 f7303;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ String f7304;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ int f7305;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f7306;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23710 f7307;

    public C3593(C23710 c23710, C15802 c15802, InterfaceC9768 interfaceC9768, int i, C13259 c13259, int i2, int[] iArr, String str, boolean z, int i3, boolean z2, InterfaceC22097 interfaceC22097, C14146 c14146, AbstractActivityC5549 abstractActivityC5549) {
        this.f7307 = c23710;
        this.f7293 = c15802;
        this.f7303 = interfaceC9768;
        this.f7299 = i;
        this.f7295 = c13259;
        this.f7294 = i2;
        this.f7297 = iArr;
        this.f7304 = str;
        this.f7296 = z;
        this.f7305 = i3;
        this.f7306 = z2;
        this.f7300 = interfaceC22097;
        this.f7301 = c14146;
        this.f7298 = abstractActivityC5549;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f7307.f75460 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C15802 c15802 = this.f7293;
        c15802.m35874();
        RunnableC21169 runnableC21169 = new RunnableC21169(0, c15802);
        C9729 c9729Mo28595 = this.f7303.mo28595();
        try {
            c9729Mo28595.m22746(runnableC21169);
            c15802.m35874();
            if (c9729Mo28595.m22747() != this.f7299) {
                throw new CancellationException();
            }
            C13929 c13929Matcher = this.f7295.matcher((CharSequence) c9729Mo28595);
            c13929Matcher.m31669();
            c13929Matcher.m31664(runnableC21169);
            int i = this.f7294;
            int[] iArr = this.f7297;
            if (i == 1) {
                iArr[0] = c9729Mo28595.lastIndexOf('\n', 0, iArr[0]) + 1;
                int iIndexOf = c9729Mo28595.indexOf('\n', iArr[1], c9729Mo28595.length());
                iArr[1] = iIndexOf;
                if (iIndexOf == -1) {
                    iArr[1] = c9729Mo28595.length();
                }
            } else if (i == 2) {
                iArr[1] = iArr[0];
                iArr[0] = 0;
            } else if (i == 3) {
                iArr[0] = iArr[1];
                iArr[1] = c9729Mo28595.length();
            } else if (i != 0) {
                iArr[0] = 0;
                iArr[1] = c9729Mo28595.length();
            }
            c13929Matcher.m56472region(iArr[0], iArr[1]);
            String str = this.f7304;
            boolean z = this.f7296;
            int i2 = this.f7305;
            boolean z2 = this.f7306;
            final InterfaceC22097 interfaceC22097 = this.f7300;
            this.f7302 = C8427.m19621(c9729Mo28595, c13929Matcher, str, z, i2, z2, runnableC21169, new Supplier() { // from class: l.ۚᩳܿ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new C5726(interfaceC22097, C8467.m19691(), 0);
                }
            });
            c15802.m35874();
            c9729Mo28595.close();
        } catch (Throwable th) {
            try {
                c9729Mo28595.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f7293.m35869()) {
            if (this.f7302.count() != 0) {
                this.f7302.m19634(this.f7301, this.f7303, this.f7306);
                C22682.m50795((CharSequence) C7050.m16203(R.string.MT_Protector, Integer.valueOf(this.f7302.count())));
            } else {
                C22682.m50793(R.string.MT_Protector);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f7293.m35870() && !(exc instanceof CancellationException)) {
            this.f7298.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C23710 c23710 = this.f7307;
        C15802 c15802 = this.f7293;
        try {
            C8427 c8427 = this.f7302;
            if (c8427 != null) {
                c8427.close();
            }
        } finally {
            c15802.m35873();
            c23710.f75460 = false;
        }
    }
}
