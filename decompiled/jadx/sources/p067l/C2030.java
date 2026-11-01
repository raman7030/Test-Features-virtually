package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩻᩸ */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes.dex */
public final class C2030 {

    /* JADX INFO: renamed from: ֫ */
    public int f80425;

    /* JADX INFO: renamed from: ۧ */
    public C1050 f80426;

    /* JADX INFO: renamed from: ܳ */
    public float f80427;

    /* JADX INFO: renamed from: ܽ */
    public float f80428;

    /* JADX INFO: renamed from: ܿ */
    public float f80429;

    /* JADX INFO: renamed from: ᩳ */
    public float f80430;

    public C2030(Context context, XmlResourceParser xmlResourceParser) {
        this.f80427 = Float.NaN;
        this.f80429 = Float.NaN;
        this.f80430 = Float.NaN;
        this.f80428 = Float.NaN;
        this.f80425 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72681);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f80425);
                this.f80425 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C1050 c1050 = new C1050();
                    this.f80426 = c1050;
                    c1050.m14561((C1715) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f80428 = typedArrayObtainStyledAttributes.getDimension(index, this.f80428);
            } else if (index == 2) {
                this.f80429 = typedArrayObtainStyledAttributes.getDimension(index, this.f80429);
            } else if (index == 3) {
                this.f80430 = typedArrayObtainStyledAttributes.getDimension(index, this.f80430);
            } else if (index == 4) {
                this.f80427 = typedArrayObtainStyledAttributes.getDimension(index, this.f80427);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55187(float f, float f2) {
        float f3 = this.f80427;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f80429;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f80430;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f80428;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
