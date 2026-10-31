package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public class C17690 extends AbstractC3495 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20035 f54148;

    public C17690(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C17690(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo17041(C15094 c15094, boolean z) {
        this.f54148.m25510(z);
    }

    @Override // l.AbstractC7539, android.view.View
    public final void onMeasure(int i, int i2) {
        mo10676(this.f54148, i, i2);
    }

    @Override // l.AbstractC3495
    /* JADX INFO: renamed from: ֫ */
    public final void mo10676(C10157 c10157, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c10157 != null) {
            c10157.mo25501(mode, size, mode2, size2);
            setMeasuredDimension(c10157.m25516(), c10157.m25506());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo17042(C21135 c21135, C12978 c12978, C19018 c19018, SparseArray sparseArray) {
        super.mo17042(c21135, c12978, c19018, sparseArray);
        if (c12978 instanceof C20035) {
            C20035 c20035 = (C20035) c12978;
            int i = c19018.f51941;
            if (i != -1) {
                c20035.m46218(i);
            }
        }
    }

    @Override // l.AbstractC3495, l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo1338(AttributeSet attributeSet) {
        super.mo1338(attributeSet);
        this.f54148 = new C20035();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f54148.m46218(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f54148.m25500(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    this.f54148.m25515(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 12) {
                    this.f54148.m25511(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.f54148.m25517(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f54148.m25505(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f54148.m25518(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f54148.m25507(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.f54148.m46230(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.f54148.m46216(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.f54148.m46227(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.f54148.m46215(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.f54148.m46221(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.f54148.m46223(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.f54148.m46231(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.f54148.m46228(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.f54148.m46226(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.f54148.m46225(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.f54148.m46229(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.f54148.m46232(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.f54148.m46217(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.f54148.m46222(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.f54148.m46214(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.f54148.m46219(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.f54148.m46220(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.f54148.m46224(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f23299 = this.f54148;
        m20236();
    }
}
