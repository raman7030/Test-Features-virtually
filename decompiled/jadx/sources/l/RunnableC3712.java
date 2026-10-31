package l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۘۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3712 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18529 f11709;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7945 f11710;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11711;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11712;

    public RunnableC3712(Context context, ViewOnTouchListenerC18529 viewOnTouchListenerC18529) {
        this.f11709 = viewOnTouchListenerC18529;
        this.f11710 = new C7945(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11296() {
        this.f11710.m21246();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11297(int i, int i2, int i3, int i4) {
        int i5;
        int iRound;
        int i6;
        int iRound2;
        RectF rectFM43067 = this.f11709.m43067();
        if (rectFM43067 == null) {
            return;
        }
        int iRound3 = Math.round(-rectFM43067.left);
        float f = i;
        if (f < rectFM43067.width()) {
            iRound = Math.round(rectFM43067.width() - f);
            i5 = 0;
        } else {
            i5 = iRound3;
            iRound = i5;
        }
        int iRound4 = Math.round(-rectFM43067.top);
        float f2 = i2;
        if (f2 < rectFM43067.height()) {
            iRound2 = Math.round(rectFM43067.height() - f2);
            i6 = 0;
        } else {
            i6 = iRound4;
            iRound2 = i6;
        }
        this.f11711 = iRound3;
        this.f11712 = iRound4;
        if (iRound3 == iRound && iRound4 == iRound2) {
            return;
        }
        this.f11710.m21244(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529;
        ImageView imageViewM43073;
        C7945 c7945 = this.f11710;
        if (c7945.m21248() || (imageViewM43073 = (viewOnTouchListenerC18529 = this.f11709).m43073()) == null || !c7945.m21245()) {
            return;
        }
        int iM21247 = c7945.m21247();
        int iM21249 = c7945.m21249();
        viewOnTouchListenerC18529.f57412.postTranslate(this.f11711 - iM21247, this.f11712 - iM21249);
        viewOnTouchListenerC18529.m43059(viewOnTouchListenerC18529.m43070());
        this.f11711 = iM21247;
        this.f11712 = iM21249;
        imageViewM43073.postOnAnimation(this);
    }
}
