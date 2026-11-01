package p067l;

import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۚۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7369 extends C3345 {

    /* JADX INFO: renamed from: ܽ */
    public final int f19303;

    /* JADX INFO: renamed from: ᩳ */
    public final int f19304;

    public C7369(ImageView imageView, AttributeSet attributeSet, int i) {
        super(imageView, attributeSet, i);
        this.f19304 = m17077(imageView, attributeSet, true);
        this.f19303 = m17077(imageView, attributeSet, false);
    }

    public C7369() {
        this.f19304 = 0;
        this.f19303 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m17077(ImageView imageView, AttributeSet attributeSet, boolean z) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, z ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (C10051.f27811.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !C10051.m23423(imageView, z, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }
}
