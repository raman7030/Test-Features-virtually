package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10729 extends AbstractC11498 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4694 f29720;

    public C10729(C4694 c4694) {
        this.f29720 = c4694;
    }

    @Override // p067l.AbstractC11498
    public final void onScrollStateChanged(C14849 c14849, int i) {
        C4694 c4694 = this.f29720;
        if (i != 0) {
            c4694.f10602 = true;
        } else {
            c4694.f10606 = SystemClock.uptimeMillis();
            c4694.f10602 = false;
        }
    }
}
