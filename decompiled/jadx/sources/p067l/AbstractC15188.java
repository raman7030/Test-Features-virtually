package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15188 {

    /* JADX INFO: renamed from: ֫ */
    public final View[] f43348;

    public AbstractC15188(View... viewArr) {
        this.f43348 = viewArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34623() {
        for (View view : this.f43348) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34624() {
        for (View view : this.f43348) {
            view.setVisibility(0);
        }
    }
}
