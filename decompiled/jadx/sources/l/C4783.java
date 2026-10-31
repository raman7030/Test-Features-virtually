package l;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4783 extends AbstractC16798 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f15171;

    public C4783(EditText editText) {
        this.f15171 = new WeakReference(editText);
    }

    @Override // l.AbstractC16798
    /* JADX INFO: renamed from: ۧ */
    public final void mo2295() {
        C3372.m10302((EditText) this.f15171.get(), 1);
    }
}
