package p067l;

import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩹ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes.dex */
public final class C23514 {

    /* JADX INFO: renamed from: ֫ */
    public final HandlerC22844 f74925 = new HandlerC22844(this);

    /* JADX INFO: renamed from: ۧ */
    public final ObjectAnimator f74926;

    /* JADX INFO: renamed from: ܽ */
    public final ObjectAnimator f74927;

    /* JADX INFO: renamed from: ᩳ */
    public final TextView f74928;

    public C23514(TextView textView) {
        this.f74928 = textView;
        textView.setVisibility(8);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        this.f74927 = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(200L);
        this.f74926 = duration2;
        duration.addListener(new C10103(textView));
        duration2.addListener(new C16807(textView));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52291(int i) {
        m52292(i, 1000);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52292(int i, int i2) {
        TextView textView = this.f74928;
        CharSequence text = textView.getText();
        textView.setText(i);
        m52290(TextUtils.equals(text, textView.getText()));
        HandlerC22844 handlerC22844 = this.f74925;
        handlerC22844.removeMessages(0);
        handlerC22844.sendEmptyMessageDelayed(0, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52293(String str) {
        TextView textView = this.f74928;
        CharSequence text = textView.getText();
        textView.setText(str);
        m52290(TextUtils.equals(text, str));
        HandlerC22844 handlerC22844 = this.f74925;
        handlerC22844.removeMessages(0);
        handlerC22844.sendEmptyMessageDelayed(0, OpenAuthTask.Duplex);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52290(boolean z) {
        ObjectAnimator objectAnimator = this.f74926;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f74927;
        if (objectAnimator2.isRunning()) {
            return;
        }
        if (z || this.f74928.getVisibility() == 8) {
            objectAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52289(C23514 c23514) {
        ObjectAnimator objectAnimator = c23514.f74926;
        ObjectAnimator objectAnimator2 = c23514.f74927;
        if (objectAnimator2.isRunning()) {
            objectAnimator2.cancel();
        }
        if (objectAnimator.isRunning() || c23514.f74928.getVisibility() != 0) {
            return;
        }
        objectAnimator.start();
    }
}
