package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes2.dex */
public class C1028 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f3757;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3758;

    public C1028(View view, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C12317.f36871, i, 0);
        this.f3757 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f3758 = typedArrayObtainStyledAttributes.getInt(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1028() {
        this.f3757 = false;
        this.f3758 = -1;
    }
}
