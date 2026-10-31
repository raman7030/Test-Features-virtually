package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC11012 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f33123;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC11012(TextView textView) {
        this.f33123 = textView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = this.f33123;
        AbstractC17361.m40690(textView);
        textView.removeOnAttachStateChangeListener(this);
        textView.setTag(R.id.MT_Protector, null);
    }
}
