package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1AU */
/* JADX INFO: loaded from: classes2.dex */
public class C0196 extends AbstractC7539 implements InterfaceC12896 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f1433;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f1434;

    public C0196(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1434 = false;
        this.f1433 = false;
        mo1338(attributeSet);
    }

    public C0196(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1434 = false;
        this.f1433 = false;
        mo1338(attributeSet);
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1338(AttributeSet attributeSet) {
        super.mo1338(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69987);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1434 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1434);
                } else if (index == 0) {
                    this.f1433 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1433);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m1339() {
        return this.f1434;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m1340() {
        return this.f1433;
    }
}
