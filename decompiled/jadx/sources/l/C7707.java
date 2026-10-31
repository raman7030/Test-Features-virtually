package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C7707 extends C17939 implements InterfaceC14431 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f23814;

    @Override // l.InterfaceC14431
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20623() {
        return false;
    }

    @Override // l.InterfaceC14431
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo20624() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7707(C17254 c17254, Context context) {
        super(context, null, R.attr.MT_Protector);
        this.f23814 = c17254;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C18934.m43699(this, getContentDescription());
        setOnTouchListener(new C14056(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f23814.m40547();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C8184.m21675(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
