package p067l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B916 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16582 implements MovementMethod {

    /* JADX INFO: renamed from: ֫ */
    public final MovementMethod f48717;

    public C16582(MovementMethod movementMethod) {
        this.f48717 = movementMethod;
    }

    @Override // android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        this.f48717.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f48717.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f48717.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.f48717.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.f48717.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f48717.onTrackballEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C4116 c4116;
        Layout layoutM8316;
        if (this.f48717.onTouchEvent(textView, spannable, motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            C4116[] c4116Arr = (C4116[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C4116.class);
            if (c4116Arr.length != 0 && (layoutM8316 = (c4116 = c4116Arr[0]).m8316(scrollX)) != null) {
                int offsetForHorizontal2 = layoutM8316.getOffsetForHorizontal(layoutM8316.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % c4116.m8313());
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layoutM8316.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(textView);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f48717.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return this.f48717.canSelectArbitrarily();
    }
}
