package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC15909 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f49147;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC15909(TextView textView) {
        this.f49147 = textView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC19439.m44781(this.f49147);
        view.removeOnAttachStateChangeListener(this);
        view.setTag(R.id.MT_Protector, null);
    }
}
