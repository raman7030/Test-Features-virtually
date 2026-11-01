package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳ֡ */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public class C1720 extends AbstractC1015 {

    /* JADX INFO: renamed from: ᩺ */
    public C1836 f57340;

    public C1720(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1720(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo18972(C1591 c1591, boolean z) {
        this.f57340.m27529(z);
    }

    @Override // p067l.AbstractC1216, android.view.View
    public final void onMeasure(int i, int i2) {
        mo12671(this.f57340, i, i2);
    }

    @Override // p067l.AbstractC1015
    /* JADX INFO: renamed from: ֫ */
    public final void mo12671(C1346 c1346, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c1346 != null) {
            c1346.mo27520(mode, size, mode2, size2);
            setMeasuredDimension(c1346.m27535(), c1346.m27525());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo18973(C1890 c1890, C1486 c1486, C1785 c1785, SparseArray sparseArray) {
        super.mo18973(c1890, c1486, c1785, sparseArray);
        if (c1486 instanceof C1836) {
            C1836 c1836 = (C1836) c1486;
            int i = c1785.f55121;
            if (i != -1) {
                c1836.m48534(i);
            }
        }
    }

    @Override // p067l.AbstractC1015, p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(AttributeSet attributeSet) {
        super.mo3751(attributeSet);
        this.f57340 = new C1836();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f57340.m48534(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f57340.m27519(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    this.f57340.m27534(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 12) {
                    this.f57340.m27530(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.f57340.m27536(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f57340.m27524(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f57340.m27537(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f57340.m27526(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.f57340.m48546(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.f57340.m48532(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.f57340.m48543(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.f57340.m48531(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.f57340.m48537(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.f57340.m48539(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.f57340.m48547(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.f57340.m48544(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.f57340.m48542(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.f57340.m48541(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.f57340.m48545(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.f57340.m48548(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.f57340.m48533(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.f57340.m48538(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.f57340.m48530(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.f57340.m48535(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.f57340.m48536(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.f57340.m48540(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f26212 = this.f57340;
        m22212();
    }
}
