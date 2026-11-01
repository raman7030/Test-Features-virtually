package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ᩴ᩸ */
/* JADX INFO: compiled from: 83VR */
/* JADX INFO: loaded from: classes5.dex */
public class C1785 extends C1680 {

    /* JADX INFO: renamed from: ֫ۧ */
    public float f63144;

    /* JADX INFO: renamed from: ۜۧ */
    public float f63145;

    /* JADX INFO: renamed from: ۟֫ */
    public float f63146;

    /* JADX INFO: renamed from: ۧۧ */
    public float f63147;

    /* JADX INFO: renamed from: ۨ֫ */
    public float f63148;

    /* JADX INFO: renamed from: ܰ֫ */
    public float f63149;

    /* JADX INFO: renamed from: ܳۧ */
    public float f63150;

    /* JADX INFO: renamed from: ܽۧ */
    public float f63151;

    /* JADX INFO: renamed from: ܿۧ */
    public float f63152;

    /* JADX INFO: renamed from: ᩳۧ */
    public float f63153;

    /* JADX INFO: renamed from: ᩷ۧ */
    public float f63154;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f63155;

    /* JADX INFO: renamed from: ᩻ۧ */
    public float f63156;

    public C1785() {
        super(-2);
        this.f63148 = 1.0f;
        this.f63155 = false;
        this.f63149 = 0.0f;
        this.f63146 = 0.0f;
        this.f63144 = 0.0f;
        this.f63147 = 0.0f;
        this.f63151 = 1.0f;
        this.f63153 = 1.0f;
        this.f63152 = 0.0f;
        this.f63150 = 0.0f;
        this.f63156 = 0.0f;
        this.f63145 = 0.0f;
        this.f63154 = 0.0f;
    }

    public C1785(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63148 = 1.0f;
        this.f63155 = false;
        this.f63149 = 0.0f;
        this.f63146 = 0.0f;
        this.f63144 = 0.0f;
        this.f63147 = 0.0f;
        this.f63151 = 1.0f;
        this.f63153 = 1.0f;
        this.f63152 = 0.0f;
        this.f63150 = 0.0f;
        this.f63156 = 0.0f;
        this.f63145 = 0.0f;
        this.f63154 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72695);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.f63148 = typedArrayObtainStyledAttributes.getFloat(index, this.f63148);
            } else if (index == 28) {
                this.f63149 = typedArrayObtainStyledAttributes.getFloat(index, this.f63149);
                this.f63155 = true;
            } else if (index == 23) {
                this.f63144 = typedArrayObtainStyledAttributes.getFloat(index, this.f63144);
            } else if (index == 24) {
                this.f63147 = typedArrayObtainStyledAttributes.getFloat(index, this.f63147);
            } else if (index == 22) {
                this.f63146 = typedArrayObtainStyledAttributes.getFloat(index, this.f63146);
            } else if (index == 20) {
                this.f63151 = typedArrayObtainStyledAttributes.getFloat(index, this.f63151);
            } else if (index == 21) {
                this.f63153 = typedArrayObtainStyledAttributes.getFloat(index, this.f63153);
            } else if (index == 16) {
                this.f63152 = typedArrayObtainStyledAttributes.getFloat(index, this.f63152);
            } else if (index == 17) {
                this.f63150 = typedArrayObtainStyledAttributes.getFloat(index, this.f63150);
            } else if (index == 18) {
                this.f63156 = typedArrayObtainStyledAttributes.getFloat(index, this.f63156);
            } else if (index == 19) {
                this.f63145 = typedArrayObtainStyledAttributes.getFloat(index, this.f63145);
            } else if (index == 27) {
                this.f63154 = typedArrayObtainStyledAttributes.getFloat(index, this.f63154);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
