package p067l;

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
public final class C17117 extends Drawable implements InterfaceC1493 {

    /* JADX INFO: renamed from: ۛ */
    public static final /* synthetic */ int f50558 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final PorterDuff.Mode f50559 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ */
    public final float[] f50560;

    /* JADX INFO: renamed from: ۙ */
    public final Rect f50561;

    /* JADX INFO: renamed from: ۤ */
    public boolean f50562;

    /* JADX INFO: renamed from: ۫ */
    public C10413 f50563;

    /* JADX INFO: renamed from: ۬ */
    public final Matrix f50564;

    /* JADX INFO: renamed from: ᩶ */
    public PorterDuffColorFilter f50565;

    /* JADX INFO: renamed from: ᩸ */
    public ColorFilter f50566;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f50567;

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C17117() {
        this.f50560 = new float[9];
        this.f50564 = new Matrix();
        this.f50561 = new Rect();
        C10413 c10413 = new C10413();
        c10413.f28796 = null;
        c10413.f28795 = f50559;
        c10413.f28799 = new C3707();
        this.f50563 = c10413;
    }

    public C17117(C10413 c10413) {
        this.f50560 = new float[9];
        this.f50564 = new Matrix();
        this.f50561 = new Rect();
        this.f50563 = c10413;
        this.f50565 = m38747(c10413.f28796, c10413.f28795);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f50567 && super.mutate() == this) {
            C10413 c10413 = this.f50563;
            C10413 c10414 = new C10413();
            c10414.f28796 = null;
            c10414.f28795 = f50559;
            if (c10413 != null) {
                c10414.f28794 = c10413.f28794;
                C3707 c3707 = new C3707(c10413.f28799);
                c10414.f28799 = c3707;
                if (c10413.f28799.f7840 != null) {
                    c3707.f7840 = new Paint(c10413.f28799.f7840);
                }
                if (c10413.f28799.f7839 != null) {
                    c10414.f28799.f7839 = new Paint(c10413.f28799.f7839);
                }
                c10414.f28796 = c10413.f28796;
                c10414.f28795 = c10413.f28795;
                c10414.f28793 = c10413.f28793;
            }
            this.f50563 = c10414;
            this.f50567 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f50563.f28794 = getChangingConfigurations();
        return this.f50563;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Rect rect = this.f50561;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f50566;
        if (colorFilter == null) {
            colorFilter = this.f50565;
        }
        Matrix matrix = this.f50564;
        canvas.getMatrix(matrix);
        float[] fArr = this.f50560;
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
        if (this.f50563.f28793 && C1248.m23656(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C10413 c10413 = this.f50563;
        Bitmap bitmap = c10413.f28802;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c10413.f28802.getHeight()) {
            c10413.f28802 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c10413.f28797 = true;
        }
        C10413 c10414 = this.f50563;
        if (c10414.f28797 || c10414.f28798 != c10414.f28796 || c10414.f28804 != c10414.f28795 || c10414.f28800 != c10414.f28793 || c10414.f28801 != c10414.f28799.f7844) {
            c10414.f28802.eraseColor(0);
            c10414.f28799.m7138(new Canvas(c10414.f28802), iMin, iMin2);
            C10413 c10415 = this.f50563;
            c10415.f28798 = c10415.f28796;
            c10415.f28804 = c10415.f28795;
            c10415.f28801 = c10415.f28799.f7844;
            c10415.f28800 = c10415.f28793;
            c10415.f28797 = false;
        }
        C10413 c10416 = this.f50563;
        if (c10416.f28799.f7844 >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c10416.f28803 == null) {
                Paint paint2 = new Paint();
                c10416.f28803 = paint2;
                paint2.setFilterBitmap(true);
            }
            c10416.f28803.setAlpha(c10416.f28799.f7844);
            c10416.f28803.setColorFilter(colorFilter);
            paint = c10416.f28803;
        }
        canvas.drawBitmap(c10416.f28802, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f50563.f28799.f7844;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C3707 c3707 = this.f50563.f28799;
        if (c3707.f7844 != i) {
            c3707.f7844 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50566 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f50566;
    }

    /* JADX INFO: renamed from: ֫ */
    public final PorterDuffColorFilter m38747(ColorStateList colorStateList, PorterDuff.Mode mode) {
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
        C10413 c10413 = this.f50563;
        if (c10413.f28796 != colorStateList) {
            c10413.f28796 = colorStateList;
            this.f50565 = m38747(colorStateList, c10413.f28795);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C10413 c10413 = this.f50563;
        if (c10413.f28795 != mode) {
            c10413.f28795 = mode;
            this.f50565 = m38747(c10413.f28796, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        C10413 c10413 = this.f50563;
        if (c10413 == null) {
            return false;
        }
        C3707 c3707 = c10413.f28799;
        if (c3707.f7841 == null) {
            c3707.f7841 = Boolean.valueOf(c3707.f7836.mo5133());
        }
        if (c3707.f7841.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f50563.f28796;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        C10413 c10413 = this.f50563;
        ColorStateList colorStateList = c10413.f28796;
        if (colorStateList == null || (mode = c10413.f28795) == null) {
            z = false;
        } else {
            this.f50565 = m38747(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C3707 c3707 = c10413.f28799;
        if (c3707.f7841 == null) {
            c3707.f7841 = Boolean.valueOf(c3707.f7836.mo5133());
        }
        if (c3707.f7841.booleanValue()) {
            boolean zMo5134 = c10413.f28799.f7836.mo5134(iArr);
            c10413.f28797 |= zMo5134;
            if (zMo5134) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f50563.f28799.f7837;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f50563.f28799.f7831;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f50563.f28793;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f50563.f28793 = z;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX INFO: renamed from: ֫ */
    public static C17117 m38746(XmlResourceParserC12128 xmlResourceParserC12128, C14281 c14281, boolean z) throws XmlPullParserException {
        int next;
        int i;
        int i2;
        ColorStateList colorStateListValueOf;
        C17117 c17117;
        int i3;
        int i4;
        int i5;
        int iM38369;
        do {
            next = xmlResourceParserC12128.next();
            i = 1;
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (!xmlResourceParserC12128.getName().equals("vector")) {
            throw new XmlPullParserException("Unexpected tag: " + xmlResourceParserC12128.getName());
        }
        C17117 c17118 = new C17117();
        c17118.f50562 = z;
        C10413 c10413 = c17118.f50563;
        c10413.f28799 = new C3707();
        C16858 c16858M51122 = C22895.m51122(xmlResourceParserC12128, C5070.f11875, c14281);
        C10413 c10414 = c17118.f50563;
        C3707 c3707 = c10414.f28799;
        int iM383610 = xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "tintMode") != null ? c16858M51122.m38369(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (iM383610 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM383610 != 5) {
            if (iM383610 != 9) {
                switch (iM383610) {
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
        c10414.f28795 = mode;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "tint") != null) {
            TypedValue typedValue = new TypedValue();
            c16858M51122.m38371(1, typedValue);
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
            c10414.f28796 = colorStateListValueOf;
        }
        boolean zM38372 = c10414.f28793;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "autoMirrored") != null) {
            zM38372 = c16858M51122.m38372(zM38372);
        }
        c10414.f28793 = zM38372;
        float fM38373 = c3707.f7843;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportWidth") != null) {
            fM38373 = c16858M51122.m38373(fM38373, 7);
        }
        c3707.f7843 = fM38373;
        float fM38374 = c3707.f7833;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "viewportHeight") != null) {
            fM38374 = c16858M51122.m38373(fM38374, 8);
        }
        c3707.f7833 = fM38374;
        if (c3707.f7843 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportWidth > 0");
        }
        if (fM38374 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires viewportHeight > 0");
        }
        c3707.f7837 = c16858M51122.m38368(c3707.f7837, 3);
        float fM38368 = c16858M51122.m38368(c3707.f7831, 2);
        c3707.f7831 = fM38368;
        if (c3707.f7837 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires width > 0");
        }
        if (fM38368 <= 0.0f) {
            throw new XmlPullParserException("<vector> tag requires height > 0");
        }
        float fM38375 = c3707.f7844 / 255.0f;
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "alpha") != null) {
            fM38375 = c16858M51122.m38373(fM38375, 4);
        }
        c3707.f7844 = (int) (fM38375 * 255.0f);
        int i8 = 0;
        String strM38370 = c16858M51122.m38370(0);
        if (strM38370 != null) {
            c3707.f7835 = strM38370;
            c3707.f7832.put(strM38370, c3707);
        }
        c10413.f28794 = c17118.getChangingConfigurations();
        c10413.f28797 = true;
        C10413 c10415 = c17118.f50563;
        C3707 c3708 = c10415.f28799;
        ArrayDeque arrayDeque = new ArrayDeque();
        C21143 c21143 = c3708.f7836;
        C0977 c0977 = c3708.f7832;
        arrayDeque.push(c21143);
        int eventType = xmlResourceParserC12128.getEventType();
        int depth = xmlResourceParserC12128.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i && (xmlResourceParserC12128.getDepth() >= depth || eventType != i6)) {
            if (eventType == i2) {
                String name = xmlResourceParserC12128.getName();
                C21143 c21144 = (C21143) arrayDeque.peek();
                C12826.requireNonNull(c21144);
                ArrayList arrayList = c21144.f66435;
                i3 = depth;
                if (MotionUtils.EASING_TYPE_PATH.equals(name)) {
                    C20472 c20472 = new C20472();
                    boolean z3 = c17118.f50562;
                    C16858 c16858M51123 = C22895.m51122(xmlResourceParserC12128, C5070.f11874, c14281);
                    if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        String strM38371 = c16858M51123.m38370(i8);
                        if (strM38371 != null) {
                            c20472.f20269 = strM38371;
                        }
                        String strM38372 = c16858M51123.m38370(2);
                        if (strM38372 != null) {
                            if (c16858M51123.m38374(2) != 3) {
                                throw new RuntimeException();
                            }
                            c20472.f20267 = C1563.m36822(strM38372);
                            if (z3) {
                                c20472.f20268 = strM38372;
                            }
                        }
                        c20472.f63217 = C22895.m51123(c16858M51123, xmlResourceParserC12128, "fillColor", 1);
                        float fM38376 = c20472.f63219;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillAlpha") != null) {
                            fM38376 = c16858M51123.m38373(fM38376, 12);
                        }
                        c20472.f63219 = fM38376;
                        int iM383611 = xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineCap") != null ? c16858M51123.m38369(8, -1) : -1;
                        Paint.Cap cap = c20472.f63221;
                        if (iM383611 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iM383611 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iM383611 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        c20472.f63221 = cap;
                        int iM383612 = xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeLineJoin") != null ? c16858M51123.m38369(9, -1) : -1;
                        Paint.Join join = c20472.f63216;
                        if (iM383612 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iM383612 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iM383612 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        c20472.f63216 = join;
                        float fM38377 = c20472.f63215;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeMiterLimit") != null) {
                            fM38377 = c16858M51123.m38373(fM38377, 10);
                        }
                        c20472.f63215 = fM38377;
                        c20472.f63214 = C22895.m51123(c16858M51123, xmlResourceParserC12128, "strokeColor", 3);
                        float fM38378 = c20472.f63222;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeAlpha") != null) {
                            fM38378 = c16858M51123.m38373(fM38378, 11);
                        }
                        c20472.f63222 = fM38378;
                        float fM38379 = c20472.f63218;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "strokeWidth") != null) {
                            fM38379 = c16858M51123.m38373(fM38379, 4);
                        }
                        c20472.f63218 = fM38379;
                        float fM383710 = c20472.f63212;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathEnd") != null) {
                            fM383710 = c16858M51123.m38373(fM383710, 6);
                        }
                        c20472.f63212 = fM383710;
                        float fM383711 = c20472.f63213;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathOffset") != null) {
                            fM383711 = c16858M51123.m38373(fM383711, 7);
                        }
                        c20472.f63213 = fM383711;
                        float fM383712 = c20472.f63220;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "trimPathStart") != null) {
                            fM383712 = c16858M51123.m38373(fM383712, 5);
                        }
                        c20472.f63220 = fM383712;
                        int iM383613 = c20472.f20266;
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            iM383613 = c16858M51123.m38369(13, iM383613);
                        }
                        c20472.f20266 = iM383613;
                    }
                    arrayList.add(c20472);
                    String str = c20472.f20269;
                    if (str != null) {
                        c0977.put(str, c20472);
                    }
                    c10415.f28794 = c10415.f28794;
                    i4 = 0;
                    z2 = false;
                    c17117 = c17118;
                } else if ("clip-path".equals(name)) {
                    C6390 c6390 = new C6390();
                    boolean z4 = c17118.f50562;
                    if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "pathData") != null) {
                        C16858 c16858M51124 = C22895.m51122(xmlResourceParserC12128, C5070.f11872, c14281);
                        String strM38373 = c16858M51124.m38370(0);
                        if (strM38373 != null) {
                            c6390.f20269 = strM38373;
                        }
                        String strM38374 = c16858M51124.m38370(1);
                        if (strM38374 != null) {
                            c17117 = c17118;
                            if (c16858M51124.m38374(1) != 3) {
                                throw new RuntimeException();
                            }
                            c6390.f20267 = C1563.m36822(strM38374);
                            if (z4) {
                                c6390.f20268 = strM38374;
                            }
                        } else {
                            c17117 = c17118;
                        }
                        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, "fillType") != null) {
                            i5 = 0;
                            iM38369 = c16858M51124.m38369(2, 0);
                        } else {
                            i5 = 0;
                            iM38369 = 0;
                        }
                        c6390.f20266 = iM38369;
                    } else {
                        c17117 = c17118;
                        i5 = 0;
                    }
                    arrayList.add(c6390);
                    String str2 = c6390.f20269;
                    if (str2 != null) {
                        c0977.put(str2, c6390);
                    }
                    c10415.f28794 = c10415.f28794;
                    i4 = i5;
                } else {
                    c17117 = c17118;
                    if ("group".equals(name)) {
                        C21143 c21145 = new C21143();
                        c21145.m47762(xmlResourceParserC12128, c14281);
                        arrayList.add(c21145);
                        arrayDeque.push(c21145);
                        if (c21145.m47763() != null) {
                            c0977.put(c21145.m47763(), c21145);
                        }
                        c10415.f28794 = c10415.f28794;
                    }
                    i4 = 0;
                }
                i8 = i4;
            } else {
                c17117 = c17118;
                i3 = depth;
                if (eventType == 3 && "group".equals(xmlResourceParserC12128.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlResourceParserC12128.next();
            i = 1;
            i2 = 2;
            i6 = 3;
            depth = i3;
            c17118 = c17117;
        }
        C17117 c17119 = c17118;
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        c17119.f50565 = c17119.m38747(c10413.f28796, c10413.f28795);
        return c17119;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f50563.f28794;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38748() {
        if (!this.f50562) {
            throw new IllegalStateException("Need set savePathData to true");
        }
        return C21083.m47580(this);
    }
}
