package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3236 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6058 f10181;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f10182;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f10183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f10184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f10185;

    public C3236(C6058 c6058, int[] iArr, Runnable runnable) {
        this.f10181 = c6058;
        this.f10182 = iArr;
        this.f10184 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f10181.f18567);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f10185 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C6058 c6058;
        int[] iArr = this.f10182;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (true) {
            c6058 = this.f10181;
            if (i >= length) {
                break;
            }
            arrayList.add((InterfaceC15334) c6058.f18565[iArr[i]].f31002.get());
            i++;
        }
        AbstractC13921 abstractC13921Mo6020 = c6058.f18563.m39044().mo6020();
        C5458 c5458 = new C5458(arrayList);
        try {
            abstractC13921Mo6020.mo7641(null, c6058.f18561, new C4647(this, c5458));
            c5458.close();
            if (this.f10183 || this.f10185.m51053()) {
                return;
            }
            this.f10185.m51045(100);
            c6058.f18562.m31779(arrayList, iArr);
        } catch (Throwable th) {
            try {
                c5458.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f10183 || this.f10185.m51053()) {
            return;
        }
        this.f10184.run();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f10181.f18567.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f10185.m51051();
        C21374.m48465();
    }
}
