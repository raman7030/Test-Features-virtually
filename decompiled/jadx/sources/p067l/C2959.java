package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֡᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public class C2959 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f5153;

    /* JADX INFO: renamed from: ۧ */
    public boolean f5154;

    /* JADX INFO: renamed from: ܽ */
    public final View[] f5155;

    public C2959(View... viewArr) {
        this.f5155 = viewArr;
    }

    @InterfaceC1080
    public void setAlpha(float f) {
        for (View view : this.f5155) {
            view.setAlpha(f);
        }
        if (f == 0.0f) {
            if (this.f5153) {
                m4909(8);
            } else if (this.f5154) {
                m4909(4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4909(int i) {
        for (View view : this.f5155) {
            view.setVisibility(i);
        }
    }
}
