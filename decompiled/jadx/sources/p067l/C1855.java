package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: renamed from: l.᩶᩸ */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1855 {

    /* JADX INFO: renamed from: ֫ */
    public int f68596;

    /* JADX INFO: renamed from: ۧ */
    public float f68597;

    /* JADX INFO: renamed from: ܽ */
    public float f68598;

    /* JADX INFO: renamed from: ܿ */
    public float f68599;

    /* JADX INFO: renamed from: ᩳ */
    public float f68600;

    public C1855(Context context, XmlResourceParser xmlResourceParser) {
        this.f68599 = Float.NaN;
        this.f68600 = Float.NaN;
        this.f68598 = Float.NaN;
        this.f68597 = Float.NaN;
        this.f68596 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72681);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f68596);
                this.f68596 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f68597 = typedArrayObtainStyledAttributes.getDimension(index, this.f68597);
            } else if (index == 2) {
                this.f68600 = typedArrayObtainStyledAttributes.getDimension(index, this.f68600);
            } else if (index == 3) {
                this.f68598 = typedArrayObtainStyledAttributes.getDimension(index, this.f68598);
            } else if (index == 4) {
                this.f68599 = typedArrayObtainStyledAttributes.getDimension(index, this.f68599);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49155(float f, float f2) {
        float f3 = this.f68599;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f68600;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f68598;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f68597;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
