package l;

import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩹ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes.dex */
public final class C22249 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HandlerC21544 f72200 = new HandlerC21544(this);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f72201;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f72202;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f72203;

    public C22249(TextView textView) {
        this.f72203 = textView;
        textView.setVisibility(8);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        this.f72202 = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(200L);
        this.f72201 = duration2;
        duration.addListener(new C8138(textView));
        duration2.addListener(new C15192(textView));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49963(int i) {
        m49964(i, 1000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49964(int i, int i2) {
        TextView textView = this.f72203;
        CharSequence text = textView.getText();
        textView.setText(i);
        m49962(TextUtils.equals(text, textView.getText()));
        HandlerC21544 handlerC21544 = this.f72200;
        handlerC21544.removeMessages(0);
        handlerC21544.sendEmptyMessageDelayed(0, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49965(String str) {
        TextView textView = this.f72203;
        CharSequence text = textView.getText();
        textView.setText(str);
        m49962(TextUtils.equals(text, str));
        HandlerC21544 handlerC21544 = this.f72200;
        handlerC21544.removeMessages(0);
        handlerC21544.sendEmptyMessageDelayed(0, OpenAuthTask.Duplex);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49962(boolean z) {
        ObjectAnimator objectAnimator = this.f72201;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f72202;
        if (objectAnimator2.isRunning()) {
            return;
        }
        if (z || this.f72203.getVisibility() == 8) {
            objectAnimator2.start();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49961(C22249 c22249) {
        ObjectAnimator objectAnimator = c22249.f72201;
        ObjectAnimator objectAnimator2 = c22249.f72202;
        if (objectAnimator2.isRunning()) {
            objectAnimator2.cancel();
        }
        if (objectAnimator.isRunning() || c22249.f72203.getVisibility() != 0) {
            return;
        }
        objectAnimator.start();
    }
}
