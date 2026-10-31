package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: renamed from: l.᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20429 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f65921;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f65922;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f65923;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f65924;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f65925;

    public C20429(Context context, XmlResourceParser xmlResourceParser) {
        this.f65924 = Float.NaN;
        this.f65925 = Float.NaN;
        this.f65923 = Float.NaN;
        this.f65922 = Float.NaN;
        this.f65921 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69972);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f65921);
                this.f65921 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f65922 = typedArrayObtainStyledAttributes.getDimension(index, this.f65922);
            } else if (index == 2) {
                this.f65925 = typedArrayObtainStyledAttributes.getDimension(index, this.f65925);
            } else if (index == 3) {
                this.f65923 = typedArrayObtainStyledAttributes.getDimension(index, this.f65923);
            } else if (index == 4) {
                this.f65924 = typedArrayObtainStyledAttributes.getDimension(index, this.f65924);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46832(float f, float f2) {
        float f3 = this.f65924;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f65925;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f65923;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f65922;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
