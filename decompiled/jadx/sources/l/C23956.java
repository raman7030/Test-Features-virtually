package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23956 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4201 f77674;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f77675;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f77676;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f77677;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f77678;

    public C23956(Context context, XmlResourceParser xmlResourceParser) {
        this.f77675 = Float.NaN;
        this.f77677 = Float.NaN;
        this.f77678 = Float.NaN;
        this.f77676 = Float.NaN;
        this.f77673 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69972);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f77673);
                this.f77673 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C4201 c4201 = new C4201();
                    this.f77674 = c4201;
                    c4201.m12685((C17606) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f77676 = typedArrayObtainStyledAttributes.getDimension(index, this.f77676);
            } else if (index == 2) {
                this.f77677 = typedArrayObtainStyledAttributes.getDimension(index, this.f77677);
            } else if (index == 3) {
                this.f77678 = typedArrayObtainStyledAttributes.getDimension(index, this.f77678);
            } else if (index == 4) {
                this.f77675 = typedArrayObtainStyledAttributes.getDimension(index, this.f77675);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52781(float f, float f2) {
        float f3 = this.f77675;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f77677;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f77678;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f77676;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
