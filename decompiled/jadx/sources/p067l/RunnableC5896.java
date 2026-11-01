package p067l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۘۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5896 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ViewOnTouchListenerC19978 f14510;

    /* JADX INFO: renamed from: ᩶ */
    public final C9919 f14511;

    /* JADX INFO: renamed from: ᩸ */
    public int f14512;

    /* JADX INFO: renamed from: ᩹ */
    public int f14513;

    public RunnableC5896(Context context, ViewOnTouchListenerC19978 viewOnTouchListenerC19978) {
        this.f14510 = viewOnTouchListenerC19978;
        this.f14511 = new C9919(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13243() {
        this.f14511.m23212();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13244(int i, int i2, int i3, int i4) {
        int i5;
        int iRound;
        int i6;
        int iRound2;
        RectF rectFM45345 = this.f14510.m45345();
        if (rectFM45345 == null) {
            return;
        }
        int iRound3 = Math.round(-rectFM45345.left);
        float f = i;
        if (f < rectFM45345.width()) {
            iRound = Math.round(rectFM45345.width() - f);
            i5 = 0;
        } else {
            i5 = iRound3;
            iRound = i5;
        }
        int iRound4 = Math.round(-rectFM45345.top);
        float f2 = i2;
        if (f2 < rectFM45345.height()) {
            iRound2 = Math.round(rectFM45345.height() - f2);
            i6 = 0;
        } else {
            i6 = iRound4;
            iRound2 = i6;
        }
        this.f14512 = iRound3;
        this.f14513 = iRound4;
        if (iRound3 == iRound && iRound4 == iRound2) {
            return;
        }
        this.f14511.m23210(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978;
        ImageView imageViewM45351;
        C9919 c9919 = this.f14511;
        if (c9919.m23214() || (imageViewM45351 = (viewOnTouchListenerC19978 = this.f14510).m45351()) == null || !c9919.m23211()) {
            return;
        }
        int iM23213 = c9919.m23213();
        int iM23215 = c9919.m23215();
        viewOnTouchListenerC19978.f60633.postTranslate(this.f14512 - iM23213, this.f14513 - iM23215);
        viewOnTouchListenerC19978.m45337(viewOnTouchListenerC19978.m45348());
        this.f14512 = iM23213;
        this.f14513 = iM23215;
        imageViewM45351.postOnAnimation(this);
    }
}
