package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes3.dex */
public class C6128 extends AbstractC7539 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2396 f18763;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f18764;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f18765;

    public C6128(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C6128(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C6128(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m17045() {
        return this.f18764;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17044(int i) {
        this.f18764 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17039(C15094 c15094, int i, boolean z) {
        this.f18765 = i;
        if (z) {
            int i2 = this.f18764;
            if (i2 == 5) {
                this.f18765 = 1;
            } else if (i2 == 6) {
                this.f18765 = 0;
            }
        } else {
            int i3 = this.f18764;
            if (i3 == 5) {
                this.f18765 = 0;
            } else if (i3 == 6) {
                this.f18765 = 1;
            }
        }
        if (c15094 instanceof C2396) {
            ((C2396) c15094).m7757(this.f18765);
        }
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17041(C15094 c15094, boolean z) {
        m17039(c15094, this.f18764, z);
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo1338(AttributeSet attributeSet) {
        super.mo1338(attributeSet);
        this.f18763 = new C2396();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f18764 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.f18763.m7767(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.f18763.m7764(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f23299 = this.f18763;
        m20236();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17043(boolean z) {
        this.f18763.m7767(z);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17047() {
        return this.f18763.m7770();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m17046() {
        return this.f18763.m7765();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17040(int i) {
        this.f18763.m7764(i);
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17042(C21135 c21135, C12978 c12978, C19018 c19018, SparseArray sparseArray) {
        super.mo17042(c21135, c12978, c19018, sparseArray);
        C9846 c9846 = c21135.f68158;
        if (c12978 instanceof C2396) {
            C2396 c2396 = (C2396) c12978;
            m17039(c2396, c9846.f29788, ((C21446) c12978.f46132).m48578());
            c2396.m7767(c9846.f29774);
            c2396.m7764(c9846.f29792);
        }
    }
}
