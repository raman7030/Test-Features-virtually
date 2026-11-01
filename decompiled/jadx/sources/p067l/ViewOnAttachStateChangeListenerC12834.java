package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC12834 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextView f36117;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC12834(TextView textView) {
        this.f36117 = textView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TextView textView = this.f36117;
        AbstractC18868.m42941(textView);
        textView.removeOnAttachStateChangeListener(this);
        textView.setTag(R.id.MT_Protector, null);
    }
}
