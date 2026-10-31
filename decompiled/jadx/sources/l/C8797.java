package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۡۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8797 extends AbstractC9606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2447 f26795;

    public C8797(C2447 c2447) {
        this.f26795 = c2447;
    }

    @Override // l.AbstractC9606
    public final void onScrollStateChanged(C13132 c13132, int i) {
        C2447 c2447 = this.f26795;
        if (i != 0) {
            c2447.f7813 = true;
        } else {
            c2447.f7817 = SystemClock.uptimeMillis();
            c2447.f7813 = false;
        }
    }
}
