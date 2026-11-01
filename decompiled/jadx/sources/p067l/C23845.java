package p067l;

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
public final class C23845 extends AbstractC6411 {

    /* JADX INFO: renamed from: ۨ */
    public static final PorterDuff.Mode f75761 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ */
    public PorterDuffColorFilter f75762;

    /* JADX INFO: renamed from: ۙ */
    public boolean f75763;

    /* JADX INFO: renamed from: ۛ */
    public C17138 f75764;

    /* JADX INFO: renamed from: ۤ */
    public final Matrix f75765;

    /* JADX INFO: renamed from: ۫ */
    public final float[] f75766;

    /* JADX INFO: renamed from: ۬ */
    public final Rect f75767;

    /* JADX INFO: renamed from: ᩶ */
    public ColorFilter f75768;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f75769;

    public C23845() {
        this.f75769 = true;
        this.f75766 = new float[9];
        this.f75765 = new Matrix();
        this.f75767 = new Rect();
        C17138 c17138 = new C17138();
        c17138.f51023 = null;
        c17138.f51022 = f75761;
        c17138.f51026 = new C10434();
        this.f75764 = c17138;
    }

    public C23845(C17138 c17138) {
        this.f75769 = true;
        this.f75766 = new float[9];
        this.f75765 = new Matrix();
        this.f75767 = new Rect();
        this.f75764 = c17138;
        this.f75762 = m52915(c17138.f51023, c17138.f51022);
    }

    /* JADX INFO: renamed from: ֫ */
    public final PorterDuffColorFilter m52915(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f75763 && super.mutate() == this) {
            C17138 c17138 = this.f75764;
            C17138 c17139 = new C17138();
            c17139.f51023 = null;
            c17139.f51022 = f75761;
            if (c17138 != null) {
                c17139.f51021 = c17138.f51021;
                C10434 c10434 = new C10434(c17138.f51026);
                c17139.f51026 = c10434;
                if (c17138.f51026.f28853 != null) {
                    c10434.f28853 = new Paint(c17138.f51026.f28853);
                }
                if (c17138.f51026.f28852 != null) {
                    c17139.f51026.f28852 = new Paint(c17138.f51026.f28852);
                }
                c17139.f51023 = c17138.f51023;
                c17139.f51022 = c17138.f51022;
                c17139.f51020 = c17138.f51020;
            }
            this.f75764 = c17139;
            this.f75763 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m52916(String str) {
        return this.f75764.f51026.f28845.getOrDefault(str, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16594 != null && Build.VERSION.SDK_INT >= 24) {
            return new C23175(this.f16594.getConstantState());
        }
        this.f75764.f51021 = getChangingConfigurations();
        return this.f75764;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f75767;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f75768;
        if (colorFilter == null) {
            colorFilter = this.f75762;
        }
        Matrix matrix = this.f75765;
        canvas.getMatrix(matrix);
        float[] fArr = this.f75766;
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
        if (isAutoMirrored() && C1248.m23656(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C17138 c17138 = this.f75764;
        Bitmap bitmap = c17138.f51029;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c17138.f51029.getHeight()) {
            c17138.f51029 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c17138.f51024 = true;
        }
        if (!this.f75769) {
            C17138 c17139 = this.f75764;
            c17139.f51029.eraseColor(0);
            c17139.f51026.m24130(new Canvas(c17139.f51029), iMin, iMin2);
        } else {
            C17138 c171310 = this.f75764;
            if (c171310.f51024 || c171310.f51025 != c171310.f51023 || c171310.f51031 != c171310.f51022 || c171310.f51027 != c171310.f51020 || c171310.f51028 != c171310.f51026.getRootAlpha()) {
                C17138 c171311 = this.f75764;
                c171311.f51029.eraseColor(0);
                c171311.f51026.m24130(new Canvas(c171311.f51029), iMin, iMin2);
                C17138 c171312 = this.f75764;
                c171312.f51025 = c171312.f51023;
                c171312.f51031 = c171312.f51022;
                c171312.f51028 = c171312.f51026.getRootAlpha();
                c171312.f51027 = c171312.f51020;
                c171312.f51024 = false;
            }
        }
        C17138 c171313 = this.f75764;
        if (c171313.f51026.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c171313.f51030 == null) {
                Paint paint2 = new Paint();
                c171313.f51030 = paint2;
                paint2.setFilterBitmap(true);
            }
            c171313.f51030.setAlpha(c171313.f51026.getRootAlpha());
            c171313.f51030.setColorFilter(colorFilter);
            paint = c171313.f51030;
        }
        canvas.drawBitmap(c171313.f51029, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f75764.f51026.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f75764.f51026.getRootAlpha() != i) {
            this.f75764.f51026.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f75768 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return C1248.m23654(drawable);
        }
        return this.f75768;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23652(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23645(drawable, colorStateList);
            return;
        }
        C17138 c17138 = this.f75764;
        if (c17138.f51023 != colorStateList) {
            c17138.f51023 = colorStateList;
            this.f75762 = m52915(colorStateList, c17138.f51022);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23648(drawable, mode);
            return;
        }
        C17138 c17138 = this.f75764;
        if (c17138.f51022 != mode) {
            c17138.f51022 = mode;
            this.f75762 = m52915(c17138.f51023, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C17138 c17138 = this.f75764;
        if (c17138 == null) {
            return false;
        }
        C10434 c10434 = c17138.f51026;
        if (c10434.f28854 == null) {
            c10434.f28854 = Boolean.valueOf(c10434.f28849.mo5163());
        }
        if (c10434.f28854.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f75764.f51023;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C17138 c17138 = this.f75764;
        ColorStateList colorStateList = c17138.f51023;
        if (colorStateList == null || (mode = c17138.f51022) == null) {
            z = false;
        } else {
            this.f75762 = m52915(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C10434 c10434 = c17138.f51026;
        if (c10434.f28854 == null) {
            c10434.f28854 = Boolean.valueOf(c10434.f28849.mo5163());
        }
        if (c10434.f28854.booleanValue()) {
            boolean zMo5164 = c17138.f51026.f28849.mo5164(iArr);
            c17138.f51024 |= zMo5164;
            if (zMo5164) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f75764.f51026.f28850;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f75764.f51026.f28844;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16594;
        if (drawable == null) {
            return false;
        }
        C1248.m23649(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f75764.f51020;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f75764.f51020 = z;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23845 m52913(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C23845 c23845 = new C23845();
            c23845.f16594 = C1059.m14961(resources, i, theme);
            new C23175(c23845.f16594.getConstantState());
            return c23845;
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
            return m52914(resources, xml, attributeSetAsAttributeSet, theme);
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23845 m52914(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C23845 c23845 = new C23845();
        c23845.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c23845;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM36022;
        int i;
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23647(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C17138 c17138 = this.f75764;
        c17138.f51026 = new C10434();
        TypedArray typedArrayM11087 = C0989.m11087(resources, theme, attributeSet, C13117.f36848);
        C17138 c17139 = this.f75764;
        C10434 c10434 = c17139.f51026;
        int iM11086 = C0989.m11086(typedArrayM11087, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iM11086 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM11086 != 5) {
            if (iM11086 != 9) {
                switch (iM11086) {
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
        c17139.f51022 = mode;
        int i2 = 1;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM11087.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 < 28 || i3 > 31) {
                Resources resources2 = typedArrayM11087.getResources();
                int resourceId = typedArrayM11087.getResourceId(1, 0);
                int i4 = C1549.f46014;
                try {
                    colorStateListM36022 = C1549.m36022(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                    colorStateListM36022 = null;
                }
            } else {
                colorStateListM36022 = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM36022 = null;
        }
        if (colorStateListM36022 != null) {
            c17139.f51023 = colorStateListM36022;
        }
        boolean z = c17139.f51020;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            z = typedArrayM11087.getBoolean(5, z);
        }
        c17139.f51020 = z;
        float f = c10434.f28856;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            f = typedArrayM11087.getFloat(7, f);
        }
        c10434.f28856 = f;
        float f2 = c10434.f28846;
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            f2 = typedArrayM11087.getFloat(8, f2);
        }
        c10434.f28846 = f2;
        if (c10434.f28856 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM11087.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM11087.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c10434.f28850 = typedArrayM11087.getDimension(3, c10434.f28850);
        float dimension = typedArrayM11087.getDimension(2, c10434.f28844);
        c10434.f28844 = dimension;
        if (c10434.f28850 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM11087.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM11087.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c10434.getAlpha();
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            alpha = typedArrayM11087.getFloat(4, alpha);
        }
        c10434.setAlpha(alpha);
        String string = typedArrayM11087.getString(0);
        if (string != null) {
            c10434.f28848 = string;
            c10434.f28845.put(string, c10434);
        }
        typedArrayM11087.recycle();
        c17138.f51021 = getChangingConfigurations();
        c17138.f51024 = true;
        C17138 c171310 = this.f75764;
        C10434 c10435 = c171310.f51026;
        ArrayDeque arrayDeque = new ArrayDeque();
        C3057 c3057 = c10435.f28849;
        C0977 c0977 = c10435.f28845;
        arrayDeque.push(c3057);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3057 c3058 = (C3057) arrayDeque.peek();
                i = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C21164 c21164 = new C21164();
                    TypedArray typedArrayM11088 = C0989.m11087(resources, theme, attributeSet, C13117.f36849);
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String string2 = typedArrayM11088.getString(0);
                        if (string2 != null) {
                            c21164.f7900 = string2;
                        }
                        String string3 = typedArrayM11088.getString(2);
                        if (string3 != null) {
                            c21164.f7899 = C1563.m36822(string3);
                        }
                        c21164.f66488 = C0989.m11089(typedArrayM11088, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c21164.f66489;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            f3 = typedArrayM11088.getFloat(12, f3);
                        }
                        c21164.f66489 = f3;
                        int i5 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? typedArrayM11088.getInt(8, -1) : -1;
                        Paint.Cap cap = c21164.f66483;
                        if (i5 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i5 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i5 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c21164.f66483 = cap;
                        int i6 = xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? typedArrayM11088.getInt(9, -1) : -1;
                        Paint.Join join = c21164.f66490;
                        if (i6 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i6 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i6 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c21164.f66490 = join;
                        float f4 = c21164.f66485;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            f4 = typedArrayM11088.getFloat(10, f4);
                        }
                        c21164.f66485 = f4;
                        c21164.f66491 = C0989.m11089(typedArrayM11088, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c21164.f66486;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            f5 = typedArrayM11088.getFloat(11, f5);
                        }
                        c21164.f66486 = f5;
                        float f6 = c21164.f66484;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            f6 = typedArrayM11088.getFloat(4, f6);
                        }
                        c21164.f66484 = f6;
                        float f7 = c21164.f66487;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            f7 = typedArrayM11088.getFloat(6, f7);
                        }
                        c21164.f66487 = f7;
                        float f8 = c21164.f66481;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            f8 = typedArrayM11088.getFloat(7, f8);
                        }
                        c21164.f66481 = f8;
                        float f9 = c21164.f66482;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            f9 = typedArrayM11088.getFloat(5, f9);
                        }
                        c21164.f66482 = f9;
                        int i7 = c21164.f7898;
                        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i7 = typedArrayM11088.getInt(13, i7);
                        }
                        c21164.f7898 = i7;
                    }
                    typedArrayM11088.recycle();
                    c3058.f5494.add(c21164);
                    if (c21164.getPathName() != null) {
                        c0977.put(c21164.getPathName(), c21164);
                    }
                    c171310.f51021 = c171310.f51021;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    C20493 c20493 = new C20493();
                    if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        TypedArray typedArrayM11089 = C0989.m11087(resources, theme, attributeSet, C13117.f36847);
                        String string4 = typedArrayM11089.getString(0);
                        if (string4 != null) {
                            c20493.f7900 = string4;
                        }
                        String string5 = typedArrayM11089.getString(1);
                        if (string5 != null) {
                            c20493.f7899 = C1563.m36822(string5);
                        }
                        c20493.f7898 = !C0989.m11090(xmlPullParser, "fillType") ? 0 : typedArrayM11089.getInt(2, 0);
                        typedArrayM11089.recycle();
                    }
                    c3058.f5494.add(c20493);
                    if (c20493.getPathName() != null) {
                        c0977.put(c20493.getPathName(), c20493);
                    }
                    c171310.f51021 = c171310.f51021;
                } else if ("group".equals(name)) {
                    C3057 c3059 = new C3057();
                    c3059.m5162(resources, xmlPullParser, attributeSet, theme);
                    c3058.f5494.add(c3059);
                    arrayDeque.push(c3059);
                    if (c3059.getGroupName() != null) {
                        c0977.put(c3059.getGroupName(), c3059);
                    }
                    c171310.f51021 = c171310.f51021;
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
        this.f75762 = m52915(c17138.f51023, c17138.f51022);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52917() {
        this.f75769 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f75764.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
