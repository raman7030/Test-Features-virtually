package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܺ᩸ */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1645 {

    /* JADX INFO: renamed from: ֫ */
    public float f53035;

    /* JADX INFO: renamed from: ۧ */
    public boolean f53036;

    /* JADX INFO: renamed from: ܽ */
    public float f53037;

    /* JADX INFO: renamed from: ܿ */
    public int f53038;

    /* JADX INFO: renamed from: ᩳ */
    public int f53039;

    /* JADX INFO: renamed from: ֫ */
    public final void m40338(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72691);
        this.f53036 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f53035 = typedArrayObtainStyledAttributes.getFloat(index, this.f53035);
            } else if (index == 0) {
                this.f53038 = typedArrayObtainStyledAttributes.getInt(index, this.f53038);
                this.f53038 = C1050.f16480[this.f53038];
            } else if (index == 4) {
                this.f53039 = typedArrayObtainStyledAttributes.getInt(index, this.f53039);
            } else if (index == 3) {
                this.f53037 = typedArrayObtainStyledAttributes.getFloat(index, this.f53037);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
