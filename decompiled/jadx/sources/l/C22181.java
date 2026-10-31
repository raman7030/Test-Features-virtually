package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7TS */
/* JADX INFO: loaded from: classes.dex */
public class C22181 extends C5612 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f71970;

    public C22181(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71970 = 1.0f;
    }

    public C22181(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71970 = 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49825(float f) {
        this.f71970 = f;
        m20228();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        m20228();
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo20232(C17606 c17606) {
        int i;
        C21476 c21476;
        super.mo20232(c17606);
        float alpha = getAlpha();
        for (int i2 = 0; i2 < this.f23298; i2++) {
            View viewById = c17606.getViewById(this.f23297[i2]);
            if (viewById != null) {
                viewById.setAlpha(alpha);
            }
        }
        float f = this.f71970;
        for (int i3 = 0; i3 < this.f23298 && (i = this.f23297[i3]) != R.id.divider_left && i != R.id.divider_right; i3++) {
            View viewById2 = c17606.getViewById(i);
            if (viewById2 != null) {
                Drawable background = viewById2.getBackground();
                C11003.requireNonNull(background);
                if (!(background instanceof C21476)) {
                    if (i == R.id.shadow_left_top || i == R.id.shadow_right_top) {
                        c21476 = new C21476(background, 1);
                    } else if (i == R.id.shadow_left_bottom || i == R.id.shadow_right_bottom) {
                        c21476 = new C21476(background, 3);
                    } else if (i == R.id.shadow_left) {
                        c21476 = new C21476(background, 2);
                    } else if (i == R.id.shadow_right) {
                        c21476 = new C21476(background, 0);
                    } else {
                        throw new RuntimeException();
                    }
                    background = c21476;
                    viewById2.setBackground(background);
                }
                ((C21476) background).m48629(f);
            }
        }
    }
}
