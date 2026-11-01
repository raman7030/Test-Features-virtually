package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5444 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8126 f12988;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int[] f12989;

    /* JADX INFO: renamed from: ܳ */
    public boolean f12990;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f12991;

    /* JADX INFO: renamed from: ᩻ */
    public C24164 f12992;

    public C5444(C8126 c8126, int[] iArr, Runnable runnable) {
        this.f12988 = c8126;
        this.f12989 = iArr;
        this.f12991 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f12988.f21423);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f12992 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C8126 c8126;
        int[] iArr = this.f12989;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (true) {
            c8126 = this.f12988;
            if (i >= length) {
                break;
            }
            arrayList.add((InterfaceC16942) c8126.f21421[iArr[i]].f33965.get());
            i++;
        }
        AbstractC15599 abstractC15599Mo8217 = c8126.f21419.m41270().mo8217();
        C7556 c7556 = new C7556(arrayList);
        try {
            abstractC15599Mo8217.mo9712(null, c8126.f21417, new C6785(this, c7556));
            c7556.close();
            if (this.f12990 || this.f12992.m53444()) {
                return;
            }
            this.f12992.m53436(100);
            c8126.f21418.m33870(arrayList, iArr);
        } catch (Throwable th) {
            try {
                c7556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f12990 || this.f12992.m53444()) {
            return;
        }
        this.f12991.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f12988.f21423.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f12992.m53442();
        C22682.m50801();
    }
}
