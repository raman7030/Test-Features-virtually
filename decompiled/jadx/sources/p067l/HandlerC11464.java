package p067l;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۢۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YALU */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11464 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f31974;

    public HandlerC11464(TextView textView) {
        this.f31974 = new WeakReference(textView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        View view = (View) this.f31974.get();
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.addListener(new C22193(view));
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }
    }
}
