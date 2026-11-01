package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܳ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C16190 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫ */
    public final Rect f47657;

    /* JADX INFO: renamed from: ۧ */
    public boolean f47658;

    /* JADX INFO: renamed from: ܽ */
    public boolean f47659;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC5462 f47660;

    public C16190(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47657 = new Rect();
        this.f47658 = true;
        this.f47659 = false;
    }

    public C16190(int i, int i2) {
        super(i, i2);
        this.f47657 = new Rect();
        this.f47658 = true;
        this.f47659 = false;
    }

    public C16190(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f47657 = new Rect();
        this.f47658 = true;
        this.f47659 = false;
    }

    public C16190(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f47657 = new Rect();
        this.f47658 = true;
        this.f47659 = false;
    }

    public C16190(C16190 c16190) {
        super((ViewGroup.LayoutParams) c16190);
        this.f47657 = new Rect();
        this.f47658 = true;
        this.f47659 = false;
    }
}
