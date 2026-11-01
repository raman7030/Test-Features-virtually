package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.֡ۚ */
/* JADX INFO: compiled from: J1AU */
/* JADX INFO: loaded from: classes2.dex */
public class C0852 extends AbstractC1216 implements InterfaceC1482 {

    /* JADX INFO: renamed from: ۛ */
    public boolean f4212;

    /* JADX INFO: renamed from: ۨ */
    public boolean f4213;

    public C0852(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4213 = false;
        this.f4212 = false;
        mo3751(attributeSet);
    }

    public C0852(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4213 = false;
        this.f4212 = false;
        mo3751(attributeSet);
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(AttributeSet attributeSet) {
        super.mo3751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72696);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f4213 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4213);
                } else if (index == 0) {
                    this.f4212 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4212);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m3752() {
        return this.f4213;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m3753() {
        return this.f4212;
    }
}
