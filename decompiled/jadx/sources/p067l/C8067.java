package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۛۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83AT */
/* JADX INFO: loaded from: classes3.dex */
public class C8067 extends AbstractC2584 {

    /* JADX INFO: renamed from: ᩳ */
    public static final float f21282 = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: ֫ */
    public float f21283;

    /* JADX INFO: renamed from: ۧ */
    public float f21284;

    /* JADX INFO: renamed from: ܽ */
    public float f21285;

    public C8067(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21284 = 0.0f;
        this.f21285 = 0.0f;
        this.f21283 = f21282;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49040);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f21285 = m18737(!C0989.m11090(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        this.f21284 = m18737(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f21283 = m18737(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m18737(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // p067l.AbstractC2584
    public final Path getPath(float f, float f2, float f3, float f4) {
        float fM49018;
        float fM49019;
        float f5;
        Path path = new Path();
        path.moveTo(f, f2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = 0.25f * f8;
        boolean z = f2 > f4;
        if (Math.abs(f6) < Math.abs(f7)) {
            float fAbs = Math.abs(f8 / (f7 * 2.0f));
            if (z) {
                fM49019 = fAbs + f4;
                fM49018 = f3;
            } else {
                fM49019 = fAbs + f2;
                fM49018 = f;
            }
            f5 = this.f21285;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fM49019 = f2;
                fM49018 = f12 + f;
            } else {
                fM49018 = f3 - f12;
                fM49019 = f4;
            }
            f5 = this.f21284;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fM49018;
        float f15 = f10 - fM49019;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f21283;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fM49018 = C21740.m49018(fM49018, f9, fSqrt, f9);
            fM49019 = C21740.m49018(fM49019, f10, fSqrt, f10);
        }
        path.cubicTo((f + fM49018) / 2.0f, (f2 + fM49019) / 2.0f, (fM49018 + f3) / 2.0f, (fM49019 + f4) / 2.0f, f3, f4);
        return path;
    }
}
