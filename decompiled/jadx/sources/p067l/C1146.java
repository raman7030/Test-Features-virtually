package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۛܶ */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes3.dex */
public class C1146 extends AbstractC1216 {

    /* JADX INFO: renamed from: ۛ */
    public C0961 f21621;

    /* JADX INFO: renamed from: ۨ */
    public int f21622;

    /* JADX INFO: renamed from: ᩺ */
    public int f21623;

    public C1146(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C1146(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C1146(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m18976() {
        return this.f21622;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18975(int i) {
        this.f21622 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18970(C1591 c1591, int i, boolean z) {
        this.f21623 = i;
        if (z) {
            int i2 = this.f21622;
            if (i2 == 5) {
                this.f21623 = 1;
            } else if (i2 == 6) {
                this.f21623 = 0;
            }
        } else {
            int i3 = this.f21622;
            if (i3 == 5) {
                this.f21623 = 0;
            } else if (i3 == 6) {
                this.f21623 = 1;
            }
        }
        if (c1591 instanceof C0961) {
            ((C0961) c1591).m9820(this.f21623);
        }
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo18972(C1591 c1591, boolean z) {
        m18970(c1591, this.f21622, z);
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(AttributeSet attributeSet) {
        super.mo3751(attributeSet);
        this.f21621 = new C0961();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f21622 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.f21621.m9830(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.f21621.m9827(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f26212 = this.f21621;
        m22212();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18974(boolean z) {
        this.f21621.m9830(z);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m18978() {
        return this.f21621.m9833();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m18977() {
        return this.f21621.m9828();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18971(int i) {
        this.f21621.m9827(i);
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo18973(C1890 c1890, C1486 c1486, C1785 c1785, SparseArray sparseArray) {
        super.mo18973(c1890, c1486, c1785, sparseArray);
        C1330 c1330 = c1890.f70840;
        if (c1486 instanceof C0961) {
            C0961 c0961 = (C0961) c1486;
            m18970(c0961, c1330.f32741, ((C1906) c1486.f49252).m50915());
            c0961.m9830(c1330.f32727);
            c0961.m9827(c1330.f32745);
        }
    }
}
