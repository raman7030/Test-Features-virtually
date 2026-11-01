package p067l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes2.dex */
public class C3345 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f6529;

    /* JADX INFO: renamed from: ۧ */
    public final int f6530;

    public C3345(View view, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C14074.f39885, i, 0);
        this.f6529 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f6530 = typedArrayObtainStyledAttributes.getInt(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3345() {
        this.f6529 = false;
        this.f6530 = -1;
    }
}
