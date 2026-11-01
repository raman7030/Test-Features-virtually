package p067l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.֡᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3057 extends AbstractC7752 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f5494;

    /* JADX INFO: renamed from: ۜ */
    public float f5495;

    /* JADX INFO: renamed from: ۡ */
    public float f5496;

    /* JADX INFO: renamed from: ۢ */
    public float f5497;

    /* JADX INFO: renamed from: ۧ */
    public String f5498;

    /* JADX INFO: renamed from: ܳ */
    public float f5499;

    /* JADX INFO: renamed from: ܽ */
    public final Matrix f5500;

    /* JADX INFO: renamed from: ܿ */
    public float f5501;

    /* JADX INFO: renamed from: ᩳ */
    public float f5502;

    /* JADX INFO: renamed from: ᩷ */
    public final Matrix f5503;

    /* JADX INFO: renamed from: ᩻ */
    public float f5504;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057(C3057 c3057, C0977 c0977) {
        AbstractC3728 c20493;
        super(0);
        this.f5503 = new Matrix();
        this.f5494 = new ArrayList();
        this.f5499 = 0.0f;
        this.f5502 = 0.0f;
        this.f5501 = 0.0f;
        this.f5504 = 1.0f;
        this.f5495 = 1.0f;
        this.f5497 = 0.0f;
        this.f5496 = 0.0f;
        Matrix matrix = new Matrix();
        this.f5500 = matrix;
        this.f5498 = null;
        this.f5499 = c3057.f5499;
        this.f5502 = c3057.f5502;
        this.f5501 = c3057.f5501;
        this.f5504 = c3057.f5504;
        this.f5495 = c3057.f5495;
        this.f5497 = c3057.f5497;
        this.f5496 = c3057.f5496;
        String str = c3057.f5498;
        this.f5498 = str;
        if (str != null) {
            c0977.put(str, this);
        }
        matrix.set(c3057.f5500);
        ArrayList arrayList = c3057.f5494;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C3057) {
                this.f5494.add(new C3057((C3057) obj, c0977));
            } else {
                if (!(obj instanceof C21164)) {
                    if (!(obj instanceof C20493)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c20493 = new C20493((C20493) obj);
                } else {
                    C21164 c21164 = (C21164) obj;
                    C21164 c21165 = new C21164(c21164);
                    c21165.f66484 = 0.0f;
                    c21165.f66486 = 1.0f;
                    c21165.f66489 = 1.0f;
                    c21165.f66482 = 0.0f;
                    c21165.f66487 = 1.0f;
                    c21165.f66481 = 0.0f;
                    c21165.f66483 = Paint.Cap.BUTT;
                    c21165.f66490 = Paint.Join.MITER;
                    c21165.f66485 = 4.0f;
                    c21165.f66491 = c21164.f66491;
                    c21165.f66484 = c21164.f66484;
                    c21165.f66486 = c21164.f66486;
                    c21165.f66488 = c21164.f66488;
                    c21165.f7898 = c21164.f7898;
                    c21165.f66489 = c21164.f66489;
                    c21165.f66482 = c21164.f66482;
                    c21165.f66487 = c21164.f66487;
                    c21165.f66481 = c21164.f66481;
                    c21165.f66483 = c21164.f66483;
                    c21165.f66490 = c21164.f66490;
                    c21165.f66485 = c21164.f66485;
                    c20493 = c21165;
                }
                this.f5494.add(c20493);
                Object obj2 = c20493.f7900;
                if (obj2 != null) {
                    c0977.put(obj2, c20493);
                }
            }
        }
    }

    public C3057() {
        super(0);
        this.f5503 = new Matrix();
        this.f5494 = new ArrayList();
        this.f5499 = 0.0f;
        this.f5502 = 0.0f;
        this.f5501 = 0.0f;
        this.f5504 = 1.0f;
        this.f5495 = 1.0f;
        this.f5497 = 0.0f;
        this.f5496 = 0.0f;
        this.f5500 = new Matrix();
        this.f5498 = null;
    }

    public String getGroupName() {
        return this.f5498;
    }

    public Matrix getLocalMatrix() {
        return this.f5500;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5162(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM11087 = C0989.m11087(resources, theme, attributeSet, C13117.f36855);
        float f = this.f5499;
        if (C0989.m11090(xmlPullParser, "rotation")) {
            f = typedArrayM11087.getFloat(5, f);
        }
        this.f5499 = f;
        this.f5502 = typedArrayM11087.getFloat(1, this.f5502);
        this.f5501 = typedArrayM11087.getFloat(2, this.f5501);
        float f2 = this.f5504;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            f2 = typedArrayM11087.getFloat(3, f2);
        }
        this.f5504 = f2;
        float f3 = this.f5495;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            f3 = typedArrayM11087.getFloat(4, f3);
        }
        this.f5495 = f3;
        float f4 = this.f5497;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            f4 = typedArrayM11087.getFloat(6, f4);
        }
        this.f5497 = f4;
        float f5 = this.f5496;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            f5 = typedArrayM11087.getFloat(7, f5);
        }
        this.f5496 = f5;
        String string = typedArrayM11087.getString(0);
        if (string != null) {
            this.f5498 = string;
        }
        m5161();
        typedArrayM11087.recycle();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m5161() {
        Matrix matrix = this.f5500;
        matrix.reset();
        matrix.postTranslate(-this.f5502, -this.f5501);
        matrix.postScale(this.f5504, this.f5495);
        matrix.postRotate(this.f5499, 0.0f, 0.0f);
        matrix.postTranslate(this.f5497 + this.f5502, this.f5496 + this.f5501);
    }

    public float getRotation() {
        return this.f5499;
    }

    public void setRotation(float f) {
        if (f != this.f5499) {
            this.f5499 = f;
            m5161();
        }
    }

    public float getPivotX() {
        return this.f5502;
    }

    public void setPivotX(float f) {
        if (f != this.f5502) {
            this.f5502 = f;
            m5161();
        }
    }

    public float getPivotY() {
        return this.f5501;
    }

    public void setPivotY(float f) {
        if (f != this.f5501) {
            this.f5501 = f;
            m5161();
        }
    }

    public float getScaleX() {
        return this.f5504;
    }

    public void setScaleX(float f) {
        if (f != this.f5504) {
            this.f5504 = f;
            m5161();
        }
    }

    public float getScaleY() {
        return this.f5495;
    }

    public void setScaleY(float f) {
        if (f != this.f5495) {
            this.f5495 = f;
            m5161();
        }
    }

    public float getTranslateX() {
        return this.f5497;
    }

    public void setTranslateX(float f) {
        if (f != this.f5497) {
            this.f5497 = f;
            m5161();
        }
    }

    public float getTranslateY() {
        return this.f5496;
    }

    public void setTranslateY(float f) {
        if (f != this.f5496) {
            this.f5496 = f;
            m5161();
        }
    }

    @Override // p067l.AbstractC7752
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5163() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5494;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC7752) arrayList.get(i)).mo5163()) {
                return true;
            }
            i++;
        }
    }

    @Override // p067l.AbstractC7752
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5164(int[] iArr) {
        int i = 0;
        boolean zMo5164 = false;
        while (true) {
            ArrayList arrayList = this.f5494;
            if (i >= arrayList.size()) {
                return zMo5164;
            }
            zMo5164 |= ((AbstractC7752) arrayList.get(i)).mo5164(iArr);
            i++;
        }
    }
}
