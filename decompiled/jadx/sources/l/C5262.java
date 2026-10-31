package l;

import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۚۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5262 extends C1028 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f16466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f16467;

    public C5262(ImageView imageView, AttributeSet attributeSet, int i) {
        super(imageView, attributeSet, i);
        this.f16467 = m15174(imageView, attributeSet, true);
        this.f16466 = m15174(imageView, attributeSet, false);
    }

    public C5262() {
        this.f16467 = 0;
        this.f16466 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15174(ImageView imageView, AttributeSet attributeSet, boolean z) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, z ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (C8084.f24900.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !C8084.m21455(imageView, z, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }
}
