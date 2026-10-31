package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC14088 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7739 f42543;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C11233.m27798(view);
        view.removeOnLayoutChangeListener(this);
        AbstractC7739 abstractC7739 = this.f42543;
        AbstractC0525 abstractC0525 = abstractC7739.f23948;
        C11233.m27799(abstractC0525);
        abstractC0525.m2240(((C14462) abstractC7739.requireView()).m34547() && ((C14462) abstractC7739.requireView()).m34549());
    }

    public ViewOnLayoutChangeListenerC14088(AbstractC7739 abstractC7739) {
        this.f42543 = abstractC7739;
    }
}
