package p067l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes3.dex */
public class C8026 extends C1732 {

    /* JADX INFO: renamed from: ᩸ */
    public int f21106;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC12050 f21107;

    public C8026(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8026(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18604();
        if (isInEditMode()) {
            return;
        }
        setOnClickListener(new ViewOnClickListenerC14061(0, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18603(C8026 c8026) {
        if (c8026.f21106 == 2) {
            c8026.m18605(0);
        } else {
            c8026.m18605(2);
        }
        InterfaceC12050 interfaceC12050 = c8026.f21107;
        if (interfaceC12050 != null) {
            interfaceC12050.mo6230(c8026.f21106);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m18604() {
        int i = this.f21106;
        if (i == 0) {
            setImageResource(R.drawable.MT_Protector);
            return;
        }
        if (i == 1) {
            setImageResource(R.drawable.MT_Protector);
            if (isInEditMode()) {
                return;
            }
            getDrawable().setColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
            return;
        }
        if (i != 2) {
            return;
        }
        setImageResource(R.drawable.MT_Protector);
        if (isInEditMode()) {
            return;
        }
        getDrawable().setColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.view.View
    @InterfaceC1080
    public void setScaleX(float f) {
        if (f == 0.0f) {
            setVisibility(8);
            f = 1.0f;
        }
        super.setScaleX(f);
        requestLayout();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float scaleX = getScaleX();
        if (scaleX != 1.0f) {
            setMeasuredDimension((int) (getMeasuredWidth() * scaleX), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18605(int i) {
        if (this.f21106 != i) {
            this.f21106 = i;
            m18604();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18606(InterfaceC12050 interfaceC12050) {
        this.f21107 = interfaceC12050;
    }
}
