package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.chip.Chip;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩻ۗ */
/* JADX INFO: compiled from: J204 */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 {

    /* JADX INFO: renamed from: ֫ */
    public int f77954;

    /* JADX INFO: renamed from: ۧ */
    public final ColorStateList f77955;

    /* JADX INFO: renamed from: ܽ */
    public final Shader f77956;

    public C2004(Shader shader, ColorStateList colorStateList, int i) {
        this.f77956 = shader;
        this.f77955 = colorStateList;
        this.f77954 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C2004 m54273(int i) {
        return new C2004(null, null, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Shader m54278() {
        return this.f77956;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54275() {
        return this.f77954;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54276(int i) {
        this.f77954 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m54279() {
        return this.f77956 != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m54281() {
        ColorStateList colorStateList;
        return this.f77956 == null && (colorStateList = this.f77955) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54277(int[] iArr) {
        if (!m54281()) {
            return false;
        }
        ColorStateList colorStateList = this.f77955;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f77954) {
            return false;
        }
        this.f77954 = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m54280() {
        return m54279() || this.f77954 != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C2004 m54274(Resources resources, int i, Resources.Theme theme) {
        try {
            return m54272(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2004 m54272(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        Resources resources2 = resources;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM36023 = C1549.m36023(resources2, xml, attributeSetAsAttributeSet, theme);
                return new C2004(null, colorStateListM36023, colorStateListM36023.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM11087 = C0989.m11087(resources2, theme, attributeSetAsAttributeSet, C2031.f80493);
        float f3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startX") != null ? typedArrayM11087.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startY") != null ? typedArrayM11087.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endX") != null ? typedArrayM11087.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endY") != null ? typedArrayM11087.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerX") != null ? typedArrayM11087.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerY") != null ? typedArrayM11087.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "type") != null ? typedArrayM11087.getInt(2, 0) : 0;
        int color = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startColor") != null ? typedArrayM11087.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null;
        int color2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null ? typedArrayM11087.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endColor") != null ? typedArrayM11087.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "tileMode") != null ? typedArrayM11087.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "gradientRadius") != null ? typedArrayM11087.getFloat(5, 0.0f) : 0.0f;
        typedArrayM11087.recycle();
        int depth = xml.getDepth() + 1;
        float f10 = f9;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f6;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM11088 = C0989.m11087(resources2, theme, attributeSetAsAttributeSet, C2031.f80492);
                boolean zHasValue = typedArrayM11088.hasValue(0);
                boolean zHasValue2 = typedArrayM11088.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM11088.getColor(0, 0);
                float f12 = typedArrayM11088.getFloat(1, 0.0f);
                typedArrayM11088.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            resources2 = resources;
            f5 = f;
            f4 = f2;
        }
        C1024 c1024 = arrayList2.size() > 0 ? new C1024(arrayList2, arrayList) : null;
        if (c1024 == null) {
            c1024 = z ? new C1024(color, color2, color3) : new C1024(color, color3);
        }
        if (i2 == 1) {
            float f13 = f8;
            float f14 = f7;
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = c1024.f14358;
            float[] fArr = c1024.f14359;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f14, f13, f10, iArr, fArr, tileMode);
        } else if (i2 != 2) {
            int[] iArr2 = c1024.f14358;
            float[] fArr2 = c1024.f14359;
            if (i3 != 1) {
                tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            radialGradient = new LinearGradient(f3, f2, f, f11, iArr2, fArr2, tileMode2);
        } else {
            radialGradient = new SweepGradient(f7, f8, c1024.f14358, c1024.f14359);
        }
        return new C2004(radialGradient, null, 0);
    }
}
