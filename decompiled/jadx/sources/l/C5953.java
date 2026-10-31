package l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes3.dex */
public class C5953 extends C17939 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18251;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC10187 f18252;

    public C5953(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5953(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16678();
        if (isInEditMode()) {
            return;
        }
        setOnClickListener(new ViewOnClickListenerC12303(0, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16677(C5953 c5953) {
        if (c5953.f18251 == 2) {
            c5953.m16679(0);
        } else {
            c5953.m16679(2);
        }
        InterfaceC10187 interfaceC10187 = c5953.f18252;
        if (interfaceC10187 != null) {
            interfaceC10187.mo3988(c5953.f18251);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m16678() {
        int i = this.f18251;
        if (i == 0) {
            setImageResource(R.drawable.MT_Protector);
            return;
        }
        if (i == 1) {
            setImageResource(R.drawable.MT_Protector);
            if (isInEditMode()) {
                return;
            }
            getDrawable().setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
            return;
        }
        if (i != 2) {
            return;
        }
        setImageResource(R.drawable.MT_Protector);
        if (isInEditMode()) {
            return;
        }
        getDrawable().setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.view.View
    @InterfaceC4801
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16679(int i) {
        if (this.f18251 != i) {
            this.f18251 = i;
            m16678();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16680(InterfaceC10187 interfaceC10187) {
        this.f18252 = interfaceC10187;
    }
}
