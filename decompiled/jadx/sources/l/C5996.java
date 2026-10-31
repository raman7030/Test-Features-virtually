package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۛۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83AT */
/* JADX INFO: loaded from: classes3.dex */
public class C5996 extends AbstractC0227 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final float f18431 = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f18432;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f18433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f18434;

    public C5996(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18433 = 0.0f;
        this.f18434 = 0.0f;
        this.f18432 = f18431;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45924);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f18434 = m16810(!C2958.m9022(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        this.f18433 = m16810(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f18432 = m16810(xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m16810(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // l.AbstractC0227
    public final Path getPath(float f, float f2, float f3, float f4) {
        float fM46695;
        float fM46696;
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
                fM46696 = fAbs + f4;
                fM46695 = f3;
            } else {
                fM46696 = fAbs + f2;
                fM46695 = f;
            }
            f5 = this.f18434;
        } else {
            float f12 = f8 / (f6 * 2.0f);
            if (z) {
                fM46696 = f2;
                fM46695 = f12 + f;
            } else {
                fM46695 = f3 - f12;
                fM46696 = f4;
            }
            f5 = this.f18433;
        }
        float f13 = f11 * f5 * f5;
        float f14 = f9 - fM46695;
        float f15 = f10 - fM46696;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f18432;
        float f18 = f11 * f17 * f17;
        if (f16 >= f13) {
            f13 = f16 > f18 ? f18 : 0.0f;
        }
        if (f13 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f13 / f16);
            fM46695 = C20382.m46695(fM46695, f9, fSqrt, f9);
            fM46696 = C20382.m46695(fM46696, f10, fSqrt, f10);
        }
        path.cubicTo((f + fM46695) / 2.0f, (f2 + fM46696) / 2.0f, (fM46695 + f3) / 2.0f, (fM46696 + f4) / 2.0f, f3, f4);
        return path;
    }
}
