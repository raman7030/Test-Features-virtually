package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC12235 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f36483;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC12235(View view) {
        this.f36483 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f36483;
        view2.removeOnAttachStateChangeListener(this);
        C17648.m41339(view2);
    }
}
