package l;

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

/* JADX INFO: renamed from: l.᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J204 */
/* JADX INFO: loaded from: classes.dex */
public final class C23418 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75208;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ColorStateList f75209;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Shader f75210;

    public C23418(Shader shader, ColorStateList colorStateList, int i) {
        this.f75210 = shader;
        this.f75209 = colorStateList;
        this.f75208 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23418 m51875(int i) {
        return new C23418(null, null, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Shader m51880() {
        return this.f75210;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51877() {
        return this.f75208;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51878(int i) {
        this.f75208 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51881() {
        return this.f75210 != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51883() {
        ColorStateList colorStateList;
        return this.f75210 == null && (colorStateList = this.f75209) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51879(int[] iArr) {
        if (!m51883()) {
            return false;
        }
        ColorStateList colorStateList = this.f75209;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f75208) {
            return false;
        }
        this.f75208 = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m51882() {
        return m51881() || this.f75208 != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23418 m51876(Resources resources, int i, Resources.Theme theme) {
        try {
            return m51874(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23418 m51874(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                ColorStateList colorStateListM33891 = C14245.m33891(resources2, xml, attributeSetAsAttributeSet, theme);
                return new C23418(null, colorStateListM33891, colorStateListM33891.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM9019 = C2958.m9019(resources2, theme, attributeSetAsAttributeSet, C23977.f77741);
        float f3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startX") != null ? typedArrayM9019.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startY") != null ? typedArrayM9019.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endX") != null ? typedArrayM9019.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endY") != null ? typedArrayM9019.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerX") != null ? typedArrayM9019.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerY") != null ? typedArrayM9019.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "type") != null ? typedArrayM9019.getInt(2, 0) : 0;
        int color = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "startColor") != null ? typedArrayM9019.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null;
        int color2 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "centerColor") != null ? typedArrayM9019.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "endColor") != null ? typedArrayM9019.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "tileMode") != null ? typedArrayM9019.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue(Chip.NAMESPACE_ANDROID, "gradientRadius") != null ? typedArrayM9019.getFloat(5, 0.0f) : 0.0f;
        typedArrayM9019.recycle();
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
                TypedArray typedArrayM90110 = C2958.m9019(resources2, theme, attributeSetAsAttributeSet, C23977.f77740);
                boolean zHasValue = typedArrayM90110.hasValue(0);
                boolean zHasValue2 = typedArrayM90110.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM90110.getColor(0, 0);
                float f12 = typedArrayM90110.getFloat(1, 0.0f);
                typedArrayM90110.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            resources2 = resources;
            f5 = f;
            f4 = f2;
        }
        C3663 c3663 = arrayList2.size() > 0 ? new C3663(arrayList2, arrayList) : null;
        if (c3663 == null) {
            c3663 = z ? new C3663(color, color2, color3) : new C3663(color, color3);
        }
        if (i2 == 1) {
            float f13 = f8;
            float f14 = f7;
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = c3663.f11554;
            float[] fArr = c3663.f11555;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f14, f13, f10, iArr, fArr, tileMode);
        } else if (i2 != 2) {
            int[] iArr2 = c3663.f11554;
            float[] fArr2 = c3663.f11555;
            if (i3 != 1) {
                tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            radialGradient = new LinearGradient(f3, f2, f, f11, iArr2, fArr2, tileMode2);
        } else {
            radialGradient = new SweepGradient(f7, f8, c3663.f11554, c3663.f11555);
        }
        return new C23418(radialGradient, null, 0);
    }
}
