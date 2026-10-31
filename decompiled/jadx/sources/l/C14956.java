package l;

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
public final class C14956 implements MovementMethod {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MovementMethod f45605;

    public C14956(MovementMethod movementMethod) {
        this.f45605 = movementMethod;
    }

    @Override // android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        this.f45605.initialize(textView, spannable);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f45605.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return this.f45605.onKeyUp(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return this.f45605.onKeyOther(textView, spannable, keyEvent);
    }

    @Override // android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        this.f45605.onTakeFocus(textView, spannable, i);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return this.f45605.onTrackballEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C1839 c1839;
        Layout layoutM6118;
        if (this.f45605.onTouchEvent(textView, spannable, motionEvent)) {
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
            C1839[] c1839Arr = (C1839[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C1839.class);
            if (c1839Arr.length != 0 && (layoutM6118 = (c1839 = c1839Arr[0]).m6118(scrollX)) != null) {
                int offsetForHorizontal2 = layoutM6118.getOffsetForHorizontal(layoutM6118.getLineForVertical(scrollY - layout.getLineTop(lineForVertical)), scrollX % c1839.m6115());
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) layoutM6118.getText()).getSpans(offsetForHorizontal2, offsetForHorizontal2, ClickableSpan.class);
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
        return this.f45605.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return this.f45605.canSelectArbitrarily();
    }
}
