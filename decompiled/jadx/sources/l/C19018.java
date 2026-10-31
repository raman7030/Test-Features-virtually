package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VR */
/* JADX INFO: loaded from: classes5.dex */
public class C19018 extends C16900 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f59915;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public float f59916;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f59917;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public float f59918;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public float f59919;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public float f59920;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public float f59921;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public float f59922;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public float f59923;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public float f59924;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public float f59925;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f59926;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public float f59927;

    public C19018() {
        super(-2);
        this.f59919 = 1.0f;
        this.f59926 = false;
        this.f59920 = 0.0f;
        this.f59917 = 0.0f;
        this.f59915 = 0.0f;
        this.f59918 = 0.0f;
        this.f59922 = 1.0f;
        this.f59924 = 1.0f;
        this.f59923 = 0.0f;
        this.f59921 = 0.0f;
        this.f59927 = 0.0f;
        this.f59916 = 0.0f;
        this.f59925 = 0.0f;
    }

    public C19018(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59919 = 1.0f;
        this.f59926 = false;
        this.f59920 = 0.0f;
        this.f59917 = 0.0f;
        this.f59915 = 0.0f;
        this.f59918 = 0.0f;
        this.f59922 = 1.0f;
        this.f59924 = 1.0f;
        this.f59923 = 0.0f;
        this.f59921 = 0.0f;
        this.f59927 = 0.0f;
        this.f59916 = 0.0f;
        this.f59925 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69986);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.f59919 = typedArrayObtainStyledAttributes.getFloat(index, this.f59919);
            } else if (index == 28) {
                this.f59920 = typedArrayObtainStyledAttributes.getFloat(index, this.f59920);
                this.f59926 = true;
            } else if (index == 23) {
                this.f59915 = typedArrayObtainStyledAttributes.getFloat(index, this.f59915);
            } else if (index == 24) {
                this.f59918 = typedArrayObtainStyledAttributes.getFloat(index, this.f59918);
            } else if (index == 22) {
                this.f59917 = typedArrayObtainStyledAttributes.getFloat(index, this.f59917);
            } else if (index == 20) {
                this.f59922 = typedArrayObtainStyledAttributes.getFloat(index, this.f59922);
            } else if (index == 21) {
                this.f59924 = typedArrayObtainStyledAttributes.getFloat(index, this.f59924);
            } else if (index == 16) {
                this.f59923 = typedArrayObtainStyledAttributes.getFloat(index, this.f59923);
            } else if (index == 17) {
                this.f59921 = typedArrayObtainStyledAttributes.getFloat(index, this.f59921);
            } else if (index == 18) {
                this.f59927 = typedArrayObtainStyledAttributes.getFloat(index, this.f59927);
            } else if (index == 19) {
                this.f59916 = typedArrayObtainStyledAttributes.getFloat(index, this.f59916);
            } else if (index == 27) {
                this.f59925 = typedArrayObtainStyledAttributes.getFloat(index, this.f59925);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
