package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7TS */
/* JADX INFO: loaded from: classes.dex */
public class C23449 extends C1120 {

    /* JADX INFO: renamed from: ۛ */
    public float f74691;

    public C23449(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74691 = 1.0f;
    }

    public C23449(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74691 = 1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52152(float f) {
        this.f74691 = f;
        m22204();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        m22204();
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo22208(C1715 c1715) {
        int i;
        C22779 c22779;
        super.mo22208(c1715);
        float alpha = getAlpha();
        for (int i2 = 0; i2 < this.f26211; i2++) {
            View viewById = c1715.getViewById(this.f26210[i2]);
            if (viewById != null) {
                viewById.setAlpha(alpha);
            }
        }
        float f = this.f74691;
        for (int i3 = 0; i3 < this.f26211 && (i = this.f26210[i3]) != R.id.divider_left && i != R.id.divider_right; i3++) {
            View viewById2 = c1715.getViewById(i);
            if (viewById2 != null) {
                Drawable background = viewById2.getBackground();
                C12826.requireNonNull(background);
                if (!(background instanceof C22779)) {
                    if (i == R.id.shadow_left_top || i == R.id.shadow_right_top) {
                        c22779 = new C22779(background, 1);
                    } else if (i == R.id.shadow_left_bottom || i == R.id.shadow_right_bottom) {
                        c22779 = new C22779(background, 3);
                    } else if (i == R.id.shadow_left) {
                        c22779 = new C22779(background, 2);
                    } else if (i == R.id.shadow_right) {
                        c22779 = new C22779(background, 0);
                    } else {
                        throw new RuntimeException();
                    }
                    background = c22779;
                    viewById2.setBackground(background);
                }
                ((C22779) background).m50966(f);
            }
        }
    }
}
