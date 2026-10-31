package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View[] f40278;

    public AbstractC13489(View... viewArr) {
        this.f40278 = viewArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32521() {
        for (View view : this.f40278) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32522() {
        for (View view : this.f40278) {
            view.setVisibility(0);
        }
    }
}
