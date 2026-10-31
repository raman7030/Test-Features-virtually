package l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܶ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15518 extends Drawable implements InterfaceC13122 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47426 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f47427 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float[] f47428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f47429;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f47430;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8464 f47431;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Matrix f47432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f47433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ColorFilter f47434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f47435;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C15518() {
        this.f47428 = new float[9];
        this.f47432 = new Matrix();
        this.f47429 = new Rect();
        C8464 c8464 = new C8464();
        c8464.f25883 = null;
        c8464.f25882 = f47427;
        c8464.f25886 = new C1408();
        this.f47431 = c8464;
    }

    public C15518(C8464 c8464) {
        this.f47428 = new float[9];
        this.f47432 = new Matrix();
        this.f47429 = new Rect();
        this.f47431 = c8464;
        this.f47433 = m36588(c8464.f25883, c8464.f25882);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f47435 && super.mutate() == this) {
            C8464 c8464 = this.f47431;
            C8464 c8465 = new C8464();
            c8465.f25883 = null;
            c8465.f25882 = f47427;
            if (c8464 != null) {
                c8465.f25881 = c8464.f25881;
                C1408 c1408 = new C1408(c8464.f25886);
                c8465.f25886 = c1408;
                if (c8464.f25886.f5069 != null) {
                    c1408.f5069 = new Paint(c8464.f25886.f5069);
                }
                if (c8464.f25886.f5068 != null) {
                    c8465.f25886.f5068 = new Paint(c8464.f25886.f5068);
                }
                c8465.f25883 = c8464.f25883;
                c8465.f25882 = c8464.f25882;
                c8465.f25880 = c8464.f25880;
            }
            this.f47431 = c8465;
            this.f47435 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f47431.f25881 = getChangingConfigurations();
        return this.f47431;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Rect rect = this.f47429;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f47434;
        if (colorFilter == null) {
            colorFilter = this.f47433;
        }
        Matrix matrix = this.f47432;
        canvas.getMatrix(matrix);
        float[] fArr = this.f47428;
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
        if (this.f47431.f25880 && C8184.m21687(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C8464 c8464 = this.f47431;
        Bitmap bitmap = c8464.f25889;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c8464.f25889.getHeight()) {
            c8464.f25889 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c8464.f25884 = true;
        }
        C8464 c8465 = this.f47431;
        if (c8465.f25884 || c8465.f25885 != c8465.f25883 || c8465.f25891 != c8465.f25882 || c8465.f25887 != c8465.f25880 || c8465.f25888 != c8465.f25886.f5073) {
            c8465.f25889.eraseColor(0);
            c8465.f25886.m4899(new Canvas(c8465.f25889), iMin, iMin2);
            C8464 c8466 = this.f47431;
            c8466.f25885 = c8466.f25883;
            c8466.f25891 = c8466.f25882;
            c8466.f25888 = c8466.f25886.f5073;
            c8466.f25887 = c8466.f25880;
            c8466.f25884 = false;
        }
        C8464 c8467 = this.f47431;
        if (c8467.f25886.f5073 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c8467.f25890 == null) {
                Paint paint2 = new Paint();
                c8467.f25890 = paint2;
                paint2.setFilterBitmap(true);
            }
            c8467.f25890.setAlpha(c8467.f25886.f5073);
            c8467.f25890.setColorFilter(colorFilter);
            paint = c8467.f25890;
        }
        canvas.drawBitmap(c8467.f25889, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f47431.f25886.f5073;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C1408 c1408 = this.f47431.f25886;
        if (c1408.f5073 != i) {
            c1408.f5073 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47434 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f47434;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter m36588(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C8464 c8464 = this.f47431;
        if (c8464.f25883 != colorStateList) {
            c8464.f25883 = colorStateList;
            this.f47433 = m36588(colorStateList, c8464.f25882);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C8464 c8464 = this.f47431;
        if (c8464.f25882 != mode) {
            c8464.f25882 = mode;
            this.f47433 = m36588(c8464.f25883, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        C8464 c8464 = this.f47431;
        if (c8464 == null) {
            return false;
        }
        C1408 c1408 = c8464.f25886;
        if (c1408.f5070 == null) {
            c1408.f5070 = Boolean.valueOf(c1408.f5065.mo2788());
        }
        if (c1408.f5070.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f47431.f25883;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        C8464 c8464 = this.f47431;
        ColorStateList colorStateList = c8464.f25883;
        if (colorStateList == null || (mode = c8464.f25882) == null) {
            z = false;
        } else {
            this.f47433 = m36588(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C1408 c1408 = c8464.f25886;
        if (c1408.f5070 == null) {
            c1408.f5070 = Boolean.valueOf(c1408.f5065.mo2788());
        }
        if (c1408.f5070.booleanValue()) {
            boolean zMo2789 = c8464.f25886.f5065.mo2789(iArr);
            c8464.f25884 |= zMo2789;
            if (zMo2789) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f47431.f25886.f5066;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f47431.f25886.f5060;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f47431.f25880;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f47431.f25880 = z;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15518 m36587(XmlResourceParserC10269 xmlResourceParserC10269, C12534 c12534, boolean z) throws XmlPullParserException {
        int next;
        int i;
        int i2;
        ColorStateList colorStateListValueOf;
        C15518 c15518;
        int i3;
        int i4;
        int i5;
        int iM36208;
        do {
            next = xmlResourceParserC10269.next();
            i = 1;
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (!xmlResourceParserC10269.getName().equals("vector")) {
            throw new XmlPullParserException("Unexpected tag: " + xmlResourceParserC10269.getName());
        }
        C15518 c15519 = new C15518();
        c15519.f47430 = z;
        C8464 c8464 = c15519.f47431;
        c8464.f25886 = new C1408();
        C15246 c15246M48775 = C21598.m48775(xmlResourceParserC10269, C2842.f9078, c12534);
        C8464 c8465 = c15519.f47431;
        C1408 c1408 = c8465.f25886;
        int iM36209 = xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "tintMode") != null ? c15246M48775.m36208(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (iM36209 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM36209 != 5) {
            if (iM36209 != 9) {
                switch (iM36209) {
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
        c8465.f25882 = mode;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            c15246M48775.m36210(1, typedValue);
            int i7 = typedValue.type;
            if (i7 >= 28 && i7 <= 31) {
                colorStateListValueOf = ColorStateList.valueOf(typedValue.data);
            } else if (i7 == 1 || i7 == 2) {
                colorStateListValueOf = ColorStateList.valueOf(-16777216);
            } else {
                colorStateListValueOf = null;
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            c8465.f25883 = colorStateListValueOf;
        }
        boolean zM36211 = c8465.f25880;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            zM36211 = c15246M48775.m36211(zM36211);
        }
        c8465.f25880 = zM36211;
        float fM36212 = c1408.f5072;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            fM36212 = c15246M48775.m36212(fM36212, 7);
        }
        c1408.f5072 = fM36212;
        float fM36213 = c1408.f5062;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            fM36213 = c15246M48775.m36212(fM36213, 8);
        }
        c1408.f5062 = fM36213;
        if (c1408.f5072 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportWidth > 0");
        }
        if (fM36213 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportHeight > 0");
        }
        c1408.f5066 = c15246M48775.m36207(c1408.f5066, 3);
        float fM36207 = c15246M48775.m36207(c1408.f5060, 2);
        c1408.f5060 = fM36207;
        if (c1408.f5066 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires width > 0");
        }
        if (fM36207 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires height > 0");
        }
        float fM36214 = c1408.f5073 / 255.0f;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            fM36214 = c15246M48775.m36212(fM36214, 4);
        }
        c1408.f5073 = (int) (fM36214 * 255.0f);
        int i8 = 0;
        String strM36209 = c15246M48775.m36209(0);
        if (strM36209 != null) {
            c1408.f5064 = strM36209;
            c1408.f5061.put(strM36209, c1408);
        }
        c8464.f25881 = c15519.getChangingConfigurations();
        c8464.f25884 = true;
        C8464 c8466 = c15519.f47431;
        C1408 c1409 = c8466.f25886;
        ArrayDeque arrayDeque = new ArrayDeque();
        C19754 c19754 = c1409.f5065;
        C2727 c2727 = c1409.f5061;
        arrayDeque.push(c19754);
        int eventType = xmlResourceParserC10269.getEventType();
        int depth = xmlResourceParserC10269.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i && (xmlResourceParserC10269.getDepth() >= depth || eventType != i6)) {
            if (eventType == i2) {
                String name = xmlResourceParserC10269.getName();
                C19754 c19755 = (C19754) arrayDeque.peek();
                C11003.requireNonNull(c19755);
                ArrayList arrayList = c19755.f63800;
                i3 = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C19048 c19048 = new C19048();
                    boolean z3 = c15519.f47430;
                    C15246 c15246M48776 = C21598.m48775(xmlResourceParserC10269, C2842.f9077, c12534);
                    if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String strM362010 = c15246M48776.m36209(i8);
                        if (strM362010 != null) {
                            c19048.f17423 = strM362010;
                        }
                        String strM362011 = c15246M48776.m36209(2);
                        if (strM362011 != null) {
                            if (c15246M48776.m36213(2) != 3) {
                                throw new RuntimeException();
                            }
                            c19048.f17421 = C14533.m34679(strM362011);
                            if (z3) {
                                c19048.f17422 = strM362011;
                            }
                        }
                        c19048.f59988 = C21598.m48776(c15246M48776, xmlResourceParserC10269, "fillColor", 1);
                        float fM36215 = c19048.f59990;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            fM36215 = c15246M48776.m36212(fM36215, 12);
                        }
                        c19048.f59990 = fM36215;
                        int iM362010 = xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? c15246M48776.m36208(8, -1) : -1;
                        Paint.Cap cap = c19048.f59992;
                        if (iM362010 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iM362010 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iM362010 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c19048.f59992 = cap;
                        int iM362011 = xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? c15246M48776.m36208(9, -1) : -1;
                        Paint.Join join = c19048.f59987;
                        if (iM362011 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iM362011 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iM362011 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c19048.f59987 = join;
                        float fM36216 = c19048.f59986;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            fM36216 = c15246M48776.m36212(fM36216, 10);
                        }
                        c19048.f59986 = fM36216;
                        c19048.f59985 = C21598.m48776(c15246M48776, xmlResourceParserC10269, "strokeColor", 3);
                        float fM36217 = c19048.f59993;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            fM36217 = c15246M48776.m36212(fM36217, 11);
                        }
                        c19048.f59993 = fM36217;
                        float fM36218 = c19048.f59989;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            fM36218 = c15246M48776.m36212(fM36218, 4);
                        }
                        c19048.f59989 = fM36218;
                        float fM36219 = c19048.f59983;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            fM36219 = c15246M48776.m36212(fM36219, 6);
                        }
                        c19048.f59983 = fM36219;
                        float fM362110 = c19048.f59984;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            fM362110 = c15246M48776.m36212(fM362110, 7);
                        }
                        c19048.f59984 = fM362110;
                        float fM362111 = c19048.f59991;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            fM362111 = c15246M48776.m36212(fM362111, 5);
                        }
                        c19048.f59991 = fM362111;
                        int iM362012 = c19048.f17420;
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            iM362012 = c15246M48776.m36208(13, iM362012);
                        }
                        c19048.f17420 = iM362012;
                    }
                    arrayList.add(c19048);
                    String str = c19048.f17423;
                    if (str != null) {
                        c2727.put(str, c19048);
                    }
                    c8466.f25881 = c8466.f25881;
                    i4 = 0;
                    z2 = false;
                    c15518 = c15519;
                } else if ("clip-path".equals(name)) {
                    C4231 c4231 = new C4231();
                    boolean z4 = c15519.f47430;
                    if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        C15246 c15246M48777 = C21598.m48775(xmlResourceParserC10269, C2842.f9075, c12534);
                        String strM362012 = c15246M48777.m36209(0);
                        if (strM362012 != null) {
                            c4231.f17423 = strM362012;
                        }
                        String strM362013 = c15246M48777.m36209(1);
                        if (strM362013 != null) {
                            c15518 = c15519;
                            if (c15246M48777.m36213(1) != 3) {
                                throw new RuntimeException();
                            }
                            c4231.f17421 = C14533.m34679(strM362013);
                            if (z4) {
                                c4231.f17422 = strM362013;
                            }
                        } else {
                            c15518 = c15519;
                        }
                        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i5 = 0;
                            iM36208 = c15246M48777.m36208(2, 0);
                        } else {
                            i5 = 0;
                            iM36208 = 0;
                        }
                        c4231.f17420 = iM36208;
                    } else {
                        c15518 = c15519;
                        i5 = 0;
                    }
                    arrayList.add(c4231);
                    String str2 = c4231.f17423;
                    if (str2 != null) {
                        c2727.put(str2, c4231);
                    }
                    c8466.f25881 = c8466.f25881;
                    i4 = i5;
                } else {
                    c15518 = c15519;
                    if ("group".equals(name)) {
                        C19754 c19756 = new C19754();
                        c19756.m45455(xmlResourceParserC10269, c12534);
                        arrayList.add(c19756);
                        arrayDeque.push(c19756);
                        if (c19756.m45456() != null) {
                            c2727.put(c19756.m45456(), c19756);
                        }
                        c8466.f25881 = c8466.f25881;
                    }
                    i4 = 0;
                }
                i8 = i4;
            } else {
                c15518 = c15519;
                i3 = depth;
                if (eventType == 3 && "group".equals(xmlResourceParserC10269.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlResourceParserC10269.next();
            i = 1;
            i2 = 2;
            i6 = 3;
            depth = i3;
            c15519 = c15518;
        }
        C15518 c155110 = c15519;
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        c155110.f47433 = c155110.m36588(c8464.f25883, c8464.f25882);
        return c155110;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f47431.f25881;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36589() {
        if (!this.f47430) {
            throw new IllegalStateException("Need set savePathData to true");
        }
        return C19691.m45283(this);
    }
}
