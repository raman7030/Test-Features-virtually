package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩹᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22597 extends AbstractC4253 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f73034 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f73035;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73036;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15540 f73037;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix f73038;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f73039;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Rect f73040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ColorFilter f73041;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73042;

    public C22597() {
        this.f73042 = true;
        this.f73039 = new float[9];
        this.f73038 = new Matrix();
        this.f73040 = new Rect();
        C15540 c15540 = new C15540();
        c15540.f47891 = null;
        c15540.f47890 = f73034;
        c15540.f47894 = new C8486();
        this.f73037 = c15540;
    }

    public C22597(C15540 c15540) {
        this.f73042 = true;
        this.f73039 = new float[9];
        this.f73038 = new Matrix();
        this.f73040 = new Rect();
        this.f73037 = c15540;
        this.f73035 = m50573(c15540.f47891, c15540.f47890);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m50573(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f73036 && super.mutate() == this) {
            C15540 c15540 = this.f73037;
            C15540 c15541 = new C15540();
            c15541.f47891 = null;
            c15541.f47890 = f73034;
            if (c15540 != null) {
                c15541.f47889 = c15540.f47889;
                C8486 c8486 = new C8486(c15540.f47894);
                c15541.f47894 = c8486;
                if (c15540.f47894.f25938 != null) {
                    c8486.f25938 = new Paint(c15540.f47894.f25938);
                }
                if (c15540.f47894.f25937 != null) {
                    c15541.f47894.f25937 = new Paint(c15540.f47894.f25937);
                }
                c15541.f47891 = c15540.f47891;
                c15541.f47890 = c15540.f47890;
                c15541.f47888 = c15540.f47888;
            }
            this.f73037 = c15541;
            this.f73036 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50574(String str) {
        return this.f73037.f47894.f25930.getOrDefault(str, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13777 != null && Build.VERSION.SDK_INT >= 24) {
            return new C21892(this.f13777.getConstantState());
        }
        this.f73037.f47889 = getChangingConfigurations();
        return this.f73037;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f73040;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f73041;
        if (colorFilter == null) {
            colorFilter = this.f73035;
        }
        Matrix matrix = this.f73038;
        canvas.getMatrix(matrix);
        float[] fArr = this.f73039;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C8184.m21687(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C15540 c15540 = this.f73037;
        Bitmap bitmap = c15540.f47897;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c15540.f47897.getHeight()) {
            c15540.f47897 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c15540.f47892 = true;
        }
        if (!this.f73042) {
            C15540 c15541 = this.f73037;
            c15541.f47897.eraseColor(0);
            c15541.f47894.m22162(new Canvas(c15541.f47897), iMin, iMin2);
        } else {
            C15540 c15542 = this.f73037;
            if (c15542.f47892 || c15542.f47893 != c15542.f47891 || c15542.f47899 != c15542.f47890 || c15542.f47895 != c15542.f47888 || c15542.f47896 != c15542.f47894.getRootAlpha()) {
                C15540 c15543 = this.f73037;
                c15543.f47897.eraseColor(0);
                c15543.f47894.m22162(new Canvas(c15543.f47897), iMin, iMin2);
                C15540 c15544 = this.f73037;
                c15544.f47893 = c15544.f47891;
                c15544.f47899 = c15544.f47890;
                c15544.f47896 = c15544.f47894.getRootAlpha();
                c15544.f47895 = c15544.f47888;
                c15544.f47892 = false;
            }
        }
        C15540 c15545 = this.f73037;
        if (c15545.f47894.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c15545.f47898 == null) {
                Paint paint2 = new Paint();
                c15545.f47898 = paint2;
                paint2.setFilterBitmap(true);
            }
            c15545.f47898.setAlpha(c15545.f47894.getRootAlpha());
            c15545.f47898.setColorFilter(colorFilter);
            paint = c15545.f47898;
        }
        canvas.drawBitmap(c15545.f47897, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f73037.f47894.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f73037.f47894.getRootAlpha() != i) {
            this.f73037.f47894.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f73041 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21685(drawable);
        }
        return this.f73041;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21683(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21676(drawable, colorStateList);
            return;
        }
        C15540 c15540 = this.f73037;
        if (c15540.f47891 != colorStateList) {
            c15540.f47891 = colorStateList;
            this.f73035 = m50573(colorStateList, c15540.f47890);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21679(drawable, mode);
            return;
        }
        C15540 c15540 = this.f73037;
        if (c15540.f47890 != mode) {
            c15540.f47890 = mode;
            this.f73035 = m50573(c15540.f47891, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C15540 c15540 = this.f73037;
        if (c15540 == null) {
            return false;
        }
        C8486 c8486 = c15540.f47894;
        if (c8486.f25939 == null) {
            c8486.f25939 = Boolean.valueOf(c8486.f25934.mo2834());
        }
        if (c8486.f25939.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f73037.f47891;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C15540 c15540 = this.f73037;
        ColorStateList colorStateList = c15540.f47891;
        if (colorStateList == null || (mode = c15540.f47890) == null) {
            z = false;
        } else {
            this.f73035 = m50573(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C8486 c8486 = c15540.f47894;
        if (c8486.f25939 == null) {
            c8486.f25939 = Boolean.valueOf(c8486.f25934.mo2834());
        }
        if (c8486.f25939.booleanValue()) {
            boolean zMo2835 = c15540.f47894.f25934.mo2835(iArr);
            c15540.f47892 |= zMo2835;
            if (zMo2835) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f73037.f47894.f25935;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f73037.f47894.f25929;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13777;
        if (drawable == null) {
            return false;
        }
        C8184.m21680(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f73037.f47888;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f73037.f47888 = z;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22597 m50571(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C22597 c22597 = new C22597();
            c22597.f13777 = C4369.m13097(resources, i, theme);
            new C21892(c22597.f13777.getConstantState());
            return c22597;
        }
        try {
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
            return m50572(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22597 m50572(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C22597 c22597 = new C22597();
        c22597.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c22597;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM33890;
        int i;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21678(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C15540 c15540 = this.f73037;
        c15540.f47894 = new C8486();
        TypedArray typedArrayM9019 = C2958.m9019(resources, theme, attributeSet, C11309.f33848);
        C15540 c15541 = this.f73037;
        C8486 c8486 = c15541.f47894;
        int iM9018 = C2958.m9018(typedArrayM9019, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iM9018 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM9018 != 5) {
            if (iM9018 != 9) {
                switch (iM9018) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c15541.f47890 = mode;
        int i2 = 1;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM9019.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 < 28 || i3 > 31) {
                Resources resources2 = typedArrayM9019.getResources();
                int resourceId = typedArrayM9019.getResourceId(1, 0);
                int i4 = C14245.f42922;
                try {
                    colorStateListM33890 = C14245.m33890(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                    colorStateListM33890 = null;
                }
            } else {
                colorStateListM33890 = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM33890 = null;
        }
        if (colorStateListM33890 != null) {
            c15541.f47891 = colorStateListM33890;
        }
        boolean z = c15541.f47888;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            z = typedArrayM9019.getBoolean(5, z);
        }
        c15541.f47888 = z;
        float f = c8486.f25941;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            f = typedArrayM9019.getFloat(7, f);
        }
        c8486.f25941 = f;
        float f2 = c8486.f25931;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            f2 = typedArrayM9019.getFloat(8, f2);
        }
        c8486.f25931 = f2;
        if (c8486.f25941 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9019.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9019.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c8486.f25935 = typedArrayM9019.getDimension(3, c8486.f25935);
        float dimension = typedArrayM9019.getDimension(2, c8486.f25929);
        c8486.f25929 = dimension;
        if (c8486.f25935 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9019.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM9019.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c8486.getAlpha();
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            alpha = typedArrayM9019.getFloat(4, alpha);
        }
        c8486.setAlpha(alpha);
        String string = typedArrayM9019.getString(0);
        if (string != null) {
            c8486.f25933 = string;
            c8486.f25930.put(string, c8486);
        }
        typedArrayM9019.recycle();
        c15540.f47889 = getChangingConfigurations();
        c15540.f47892 = true;
        C15540 c15542 = this.f73037;
        C8486 c8487 = c15542.f47894;
        ArrayDeque arrayDeque = new ArrayDeque();
        C0724 c0724 = c8487.f25934;
        C2727 c2727 = c8487.f25930;
        arrayDeque.push(c0724);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0724 c0725 = (C0724) arrayDeque.peek();
                i = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C19776 c19776 = new C19776();
                    TypedArray typedArrayM90110 = C2958.m9019(resources, theme, attributeSet, C11309.f33849);
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String string2 = typedArrayM90110.getString(0);
                        if (string2 != null) {
                            c19776.f5127 = string2;
                        }
                        String string3 = typedArrayM90110.getString(2);
                        if (string3 != null) {
                            c19776.f5126 = C14533.m34679(string3);
                        }
                        c19776.f63850 = C2958.m9021(typedArrayM90110, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c19776.f63851;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            f3 = typedArrayM90110.getFloat(12, f3);
                        }
                        c19776.f63851 = f3;
                        int i5 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? typedArrayM90110.getInt(8, -1) : -1;
                        Paint.Cap cap = c19776.f63845;
                        if (i5 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i5 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i5 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c19776.f63845 = cap;
                        int i6 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? typedArrayM90110.getInt(9, -1) : -1;
                        Paint.Join join = c19776.f63852;
                        if (i6 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i6 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i6 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c19776.f63852 = join;
                        float f4 = c19776.f63847;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            f4 = typedArrayM90110.getFloat(10, f4);
                        }
                        c19776.f63847 = f4;
                        c19776.f63853 = C2958.m9021(typedArrayM90110, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c19776.f63848;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            f5 = typedArrayM90110.getFloat(11, f5);
                        }
                        c19776.f63848 = f5;
                        float f6 = c19776.f63846;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            f6 = typedArrayM90110.getFloat(4, f6);
                        }
                        c19776.f63846 = f6;
                        float f7 = c19776.f63849;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            f7 = typedArrayM90110.getFloat(6, f7);
                        }
                        c19776.f63849 = f7;
                        float f8 = c19776.f63843;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            f8 = typedArrayM90110.getFloat(7, f8);
                        }
                        c19776.f63843 = f8;
                        float f9 = c19776.f63844;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            f9 = typedArrayM90110.getFloat(5, f9);
                        }
                        c19776.f63844 = f9;
                        int i7 = c19776.f5125;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i7 = typedArrayM90110.getInt(13, i7);
                        }
                        c19776.f5125 = i7;
                    }
                    typedArrayM90110.recycle();
                    c0725.f2722.add(c19776);
                    if (c19776.getPathName() != null) {
                        c2727.put(c19776.getPathName(), c19776);
                    }
                    c15542.f47889 = c15542.f47889;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    C19070 c19070 = new C19070();
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        TypedArray typedArrayM90111 = C2958.m9019(resources, theme, attributeSet, C11309.f33847);
                        String string4 = typedArrayM90111.getString(0);
                        if (string4 != null) {
                            c19070.f5127 = string4;
                        }
                        String string5 = typedArrayM90111.getString(1);
                        if (string5 != null) {
                            c19070.f5126 = C14533.m34679(string5);
                        }
                        c19070.f5125 = !C2958.m9022(xmlPullParser, "fillType") ? 0 : typedArrayM90111.getInt(2, 0);
                        typedArrayM90111.recycle();
                    }
                    c0725.f2722.add(c19070);
                    if (c19070.getPathName() != null) {
                        c2727.put(c19070.getPathName(), c19070);
                    }
                    c15542.f47889 = c15542.f47889;
                } else if ("group".equals(name)) {
                    C0724 c0726 = new C0724();
                    c0726.m2833(resources, xmlPullParser, attributeSet, theme);
                    c0725.f2722.add(c0726);
                    arrayDeque.push(c0726);
                    if (c0726.getGroupName() != null) {
                        c2727.put(c0726.getGroupName(), c0726);
                    }
                    c15542.f47889 = c15542.f47889;
                }
            } else {
                i = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i2 = 1;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f73035 = m50573(c15540.f47891, c15540.f47890);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50575() {
        this.f73042 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f73037.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
