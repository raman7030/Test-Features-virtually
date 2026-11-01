package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟᩷ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1224 extends C1732 implements InterfaceC1558 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1698 f26728;

    @Override // p067l.InterfaceC1558
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22603() {
        return false;
    }

    @Override // p067l.InterfaceC1558
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22604() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224(C1698 c1698, Context context) {
        super(context, null, R.attr.MT_Protector);
        this.f26728 = c1698;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C1781.m45965(this, getContentDescription());
        setOnTouchListener(new C1539(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f26728.m42796();
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
            C1248.m23644(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
