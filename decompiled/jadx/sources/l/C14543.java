package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܳ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C14543 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect f44551;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44552;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC3255 f44554;

    public C14543(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44551 = new Rect();
        this.f44552 = true;
        this.f44553 = false;
    }

    public C14543(int i, int i2) {
        super(i, i2);
        this.f44551 = new Rect();
        this.f44552 = true;
        this.f44553 = false;
    }

    public C14543(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f44551 = new Rect();
        this.f44552 = true;
        this.f44553 = false;
    }

    public C14543(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f44551 = new Rect();
        this.f44552 = true;
        this.f44553 = false;
    }

    public C14543(C14543 c14543) {
        super((ViewGroup.LayoutParams) c14543);
        this.f44551 = new Rect();
        this.f44552 = true;
        this.f44553 = false;
    }
}
