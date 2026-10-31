package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: H14L */
/* JADX INFO: loaded from: classes2.dex */
public final class C7246 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C11461 f22217 = new C11461();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RectF f22218;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f22219;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f22220;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f22221;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f22222;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16376 f22223;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22224;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f22225;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f22226;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Matrix f22227;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22228;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22229;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f22230;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f22231;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22232;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f22233;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f22234;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f22235;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f22236;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f22237;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f22238;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19354(C11480 c11480) {
        if (c11480.f34287.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int iM19360 = m19360();
        int i = m19355().f34288;
        int i2 = c11480.f34288;
        if (iM19360 > i2 || i2 > i) {
            int i3 = this.f22232;
            ArrayList arrayList = this.f22237;
            List list = this.f22234;
            if (i3 == -1) {
                list.add(0, new C11480(-1, ""));
                arrayList.add(0, null);
                this.f22232 = 0;
            }
            C22768 c22768 = new C22768();
            list.add(this.f22232, c11480);
            arrayList.add(this.f22232, c22768);
            C21834 c21834M35651 = C10069.f30268.m35651(C4900.f15473);
            int length = c11480.f34287.length();
            if (length != 0) {
                c22768.f73518.add(new C13595(length, c21834M35651));
            }
            this.f22232++;
        }
    }

    public C7246(C16376 c16376, int i, ArrayList arrayList) {
        this.f22232 = -1;
        this.f22218 = new RectF();
        this.f22220 = C21943.m49431();
        this.f22228 = 0;
        this.f22227 = new Matrix();
        this.f22223 = c16376;
        this.f22229 = i;
        this.f22234 = arrayList;
        this.f22238 = new HashSet();
        if (arrayList.size() > 210) {
            int size = arrayList.size() / 2;
            arrayList.set(size - 100, new C11480(-1, "......"));
            arrayList.subList(size - 99, size + 100).clear();
        }
        int size2 = arrayList.size();
        boolean z = true;
        int i2 = 0;
        while (true) {
            String strSubstring = null;
            if (i2 >= size2) {
                break;
            }
            C11480 c11480 = (C11480) arrayList.get(i2);
            if (!c11480.f34287.isEmpty()) {
                if (c11480.f34287.startsWith(".sparse-switch") || c11480.f34287.startsWith(".packed-switch")) {
                    z = false;
                } else if (z) {
                    if (c11480.f34287.length() > 100) {
                        c11480.f34287 = C6554.m18061(100, c11480.f34287);
                    }
                    if (c11480.f34287.startsWith(":")) {
                        int iIndexOf = c11480.f34287.indexOf(32);
                        strSubstring = iIndexOf == -1 ? c11480.f34287 : c11480.f34287.substring(0, iIndexOf);
                    }
                    if (strSubstring != null) {
                        this.f22238.add(strSubstring);
                    }
                }
            }
            i2++;
        }
        this.f22237 = new ArrayList(arrayList.size());
        C17768 c17768 = new C17768();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11480 c11481 = (C11480) it.next();
            if (c11481.f34287.isEmpty()) {
                this.f22237.add(null);
            } else {
                C22768 c22768 = new C22768();
                this.f22237.add(c22768);
                try {
                    c17768.m41620(C10069.f30269.m51267(c11481.f34287, f22217).m9659());
                    while (c17768.m41625()) {
                        C21834 c21834M41624 = c17768.m41624();
                        int iM41622 = c17768.m41622();
                        int iM41619 = c17768.m41619();
                        if (iM41622 != iM41619) {
                            c22768.f73518.add(new C13595(iM41619, c21834M41624));
                        }
                    }
                } catch (C8097 unused) {
                    C21834 c21834M35661 = C10069.f30268.m35661();
                    int length = c11481.f34287.length();
                    if (length != 0) {
                        c22768.f73518.add(new C13595(length, c21834M35661));
                    }
                }
                c22768.f73518.trimToSize();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m19360() {
        return ((C11480) this.f22234.get(this.f22232 + 1)).f34288;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19352(Paint paint) {
        float fontSpacing = paint.getFontSpacing();
        List list = this.f22234;
        if (list.isEmpty()) {
            this.f22231 = 4.0f * fontSpacing;
            this.f22221 = (fontSpacing * 3.0f) + paint.measureText("EXIT");
            float fMeasureText = paint.measureText("0") * 0.6f;
            this.f22236 = fMeasureText;
            this.f22235 = fMeasureText;
            this.f22222 = true;
            return;
        }
        this.f22231 = list.size() * fontSpacing;
        float fMeasureText2 = paint.measureText("0");
        float length = (String.valueOf(((C11480) C7166.m19188(1, list)).f34288).length() + 1) * fMeasureText2;
        this.f22235 = 0.7f * fMeasureText2;
        this.f22236 = fMeasureText2 * 0.5f;
        if (this.f22222) {
            this.f22221 = m19348(this.f22226, paint);
        } else {
            this.f22226 = 0;
            int size = list.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                float fM19348 = m19348(i, paint);
                if (fM19348 > f) {
                    this.f22226 = i;
                    f = fM19348;
                }
            }
            this.f22221 = f;
            this.f22222 = true;
        }
        this.f22231 = (this.f22236 * 2.0f) + this.f22231;
        this.f22221 = (this.f22235 * 2.0f) + length + this.f22221;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19348(int i, Paint paint) {
        C11480 c11480 = (C11480) this.f22234.get(i);
        C22768 c22768 = (C22768) this.f22237.get(i);
        float f = 0.0f;
        if (!c11480.f34287.isEmpty() && c22768 != null) {
            int i2 = 0;
            for (C13595 c13595 : c22768.f73518) {
                float fMeasureText = paint.measureText(c11480.f34287, i2, c13595.f40543);
                c13595.f40544 = fMeasureText;
                f += fMeasureText;
                i2 = c13595.f40543;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m19358() {
        if (!this.f22222) {
            throw new IllegalStateException("Need measure");
        }
        return this.f22221;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m19356() {
        if (!this.f22222) {
            throw new IllegalStateException("Need measure");
        }
        return this.f22231;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19350(float f, float f2, float f3, float f4) {
        this.f22225 = f;
        this.f22230 = f2;
        this.f22219 = f3;
        this.f22233 = f4;
        this.f22224 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m19357() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22225;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m19362() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22230;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m19359() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22219;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m19349() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22233;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0422  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19351(Canvas canvas, C1539 c1539, C1539 c15310, RectF rectF, float f) {
        boolean z;
        int iSave;
        float f2;
        float f3;
        float f4;
        float f5;
        List list;
        C16376 c16376;
        int i;
        int iSave2;
        ArrayList arrayList;
        boolean z2;
        int i2;
        C11480 c11480;
        C11480 c11481;
        C16376 c16377;
        C16376 c16378;
        C7246 c7246;
        C11480 c11482;
        int i3;
        C11480 c11483;
        int i4;
        Canvas canvas2 = canvas;
        float f6 = this.f22225;
        float f7 = this.f22230;
        if (rectF.intersects(f6, f7, this.f22219 + f6, this.f22233 + f7)) {
            List list2 = this.f22234;
            boolean zIsEmpty = list2.isEmpty();
            float fontSpacing = c1539.getFontSpacing();
            float f8 = -c1539.getFontMetrics().ascent;
            float fM19349 = zIsEmpty ? m19349() / 4.0f : (m19349() - (this.f22236 * 2.0f)) / list2.size();
            float f9 = (f8 / fontSpacing) * fM19349;
            float fM19357 = m19357();
            float fM19362 = m19362();
            float f10 = fM19357 * f;
            float f11 = fM19362 * f;
            float f12 = this.f22219 * f;
            float f13 = this.f22233 * f;
            float f14 = ((this.f22235 + this.f22236) / 4.0f) * f;
            float fMeasureText = c1539.measureText("0");
            float length = zIsEmpty ? 0.0f : (String.valueOf(((C11480) C7166.m19188(1, list2)).f34288).length() + 1) * fMeasureText;
            float f15 = length * f;
            float f16 = f12 + f10;
            RectF rectF2 = this.f22218;
            rectF2.set(f10, f11, f16, f13 + f11);
            C16376 c16379 = this.f22223;
            int i5 = c16379.f50391;
            List list3 = list2;
            Paint.Style style = Paint.Style.FILL;
            c1539.setStyle(style);
            C16376 c163710 = c16379;
            if (i5 == this.f22229) {
                float f17 = C10069.f30266;
                c1539.setColor(C21943.m49424(-13421779, -1309));
            } else {
                float f18 = C10069.f30266;
                c1539.setColor(zIsEmpty ? C21943.m49424(-13948117, -328966) : C21943.m49424(-13948117, -1));
            }
            canvas2.drawRoundRect(rectF2, f14, f14, c1539);
            if (!zIsEmpty) {
                rectF2.right = rectF2.left + f14 + f14;
                c1539.setColor(C21943.m49424(-13223878, -986896));
                canvas2.drawRoundRect(rectF2, f14, f14, c1539);
                rectF2.left = rectF2.right - f14;
                rectF2.right = f15 + f10;
                canvas2.drawRect(rectF2, c1539);
                c1539.setStyle(Paint.Style.STROKE);
                c1539.setColor(C21943.m49424(-11184811, -3092272));
                c1539.setStrokeWidth(1.0f * f);
                float f19 = rectF2.right;
                canvas.drawLine(f19, rectF2.top, f19, rectF2.bottom, c1539);
            }
            rectF2.left = f10;
            rectF2.right = f16;
            c1539.setStyle(Paint.Style.STROKE);
            c1539.setColor(C21943.m49424(-11513776, -4144960));
            c1539.setStrokeWidth(C10069.f30266 * 1.5f * f);
            canvas2.drawRoundRect(rectF2, f14, f14, c1539);
            if (zIsEmpty) {
                c1539.setTextAlign(Paint.Align.CENTER);
                c1539.setStyle(style);
                c1539.setColor(C21943.m49424(-7829368, -16777216));
                iSave = canvas.save();
                canvas2.scale(f, f);
                canvas.drawText("EXIT", 0, 4, (this.f22219 / 2.0f) + fM19357, (fM19349 * 1.5f) + fM19362 + f9, (Paint) c1539);
                canvas2.restoreToCount(iSave);
                c1539.setTextAlign(Paint.Align.LEFT);
                z = false;
            } else {
                C7246 c7247 = this;
                float f20 = c7247.f22236;
                float f21 = fM19362 + f20;
                float f22 = f20 + f9 + fM19362;
                float f23 = fM19357 + c7247.f22235 + length;
                float f24 = (fM19357 + length) - fMeasureText;
                boolean z3 = f <= 0.15f;
                c1539.setStyle(style);
                int size = list3.size();
                int i6 = 0;
                float f25 = f21;
                Canvas canvas3 = canvas2;
                int i7 = 0;
                float f26 = f22;
                z = false;
                while (i7 < size) {
                    if (i7 > 0) {
                        f26 += fM19349;
                        f25 += fM19349;
                    }
                    float f27 = f26;
                    float f28 = f25;
                    RectF rectF3 = rectF;
                    int i8 = size;
                    int i9 = i6;
                    if (rectF3.intersects(rectF3.left, f28, rectF3.right, f28 + fM19349)) {
                        if (f24 < rectF3.left || fM19357 > rectF3.right) {
                            list = list3;
                        } else {
                            list = list3;
                            int i10 = ((C11480) list.get(i7)).f34288;
                            if (i10 != -1) {
                                String strValueOf = String.valueOf(i10);
                                if (z) {
                                    iSave2 = i9;
                                } else {
                                    iSave2 = canvas3.save();
                                    canvas3.scale(f, f);
                                    z = true;
                                }
                                float f29 = f24;
                                for (int length2 = strValueOf.length() - 1; length2 >= 0; length2--) {
                                    canvas3.drawText(strValueOf, length2, length2 + 1, f29, f27, (Paint) c15310);
                                    f29 -= fMeasureText;
                                }
                            }
                            arrayList = c7247.f22237;
                            if (z3) {
                                f2 = f28;
                                c11481 = (C11480) list.get(i7);
                                C22768 c22768 = (C22768) arrayList.get(i7);
                                i2 = iSave2;
                                if (!c11481.f34287.isEmpty() || c22768 == null) {
                                    z2 = z;
                                    f3 = f24;
                                    f4 = fM19349;
                                    f5 = f23;
                                    c16376 = c163710;
                                    i = i7;
                                    list = list;
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    int i11 = i7;
                                    if (c7247.f22220 != C21943.m49431()) {
                                        c7247.f22220 = C21943.m49431();
                                        c16377 = c163710;
                                        c16377.f50389 -= (long) c7247.f22228;
                                        m19361();
                                    } else {
                                        c16377 = c163710;
                                    }
                                    float f30 = f27 - f9;
                                    Iterator it = c22768.f73518.iterator();
                                    C1539 c15311 = c1539;
                                    float f31 = f23;
                                    int iSave3 = i2;
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        C13595 c13595 = (C13595) it.next();
                                        float f32 = c13595.f40544;
                                        Iterator it2 = it;
                                        C21834 c21834 = c13595.f40545;
                                        float f33 = f24;
                                        int i13 = c13595.f40543;
                                        float f34 = f31 + f32;
                                        float f35 = f23;
                                        if (f34 < rectF3.left || f31 > rectF3.right) {
                                            i13 = i13;
                                            c16378 = c16377;
                                            c7246 = c7247;
                                            rectF = rectF3;
                                            c11482 = c11481;
                                            int i14 = i11;
                                            fM19349 = fM19349;
                                            i3 = i14;
                                            iSave3 = iSave3;
                                        } else {
                                            int i15 = i13 - i12;
                                            if (10 >= i15 || i15 >= 100) {
                                                c11482 = c11481;
                                                int iSave4 = iSave3;
                                                i13 = i13;
                                                c16378 = c16377;
                                                c7246 = c7247;
                                                rectF = rectF;
                                                int i16 = i11;
                                                fM19349 = fM19349;
                                                i3 = i16;
                                                c15311.setColor(c21834.m49205());
                                                if (!z) {
                                                    iSave4 = canvas3.save();
                                                    canvas3.scale(f, f);
                                                    z = true;
                                                }
                                                iSave3 = iSave4;
                                                canvas3.drawText(c11482.f34287, i12, c13595.f40543, f31, f30 + f9, (Paint) c15311);
                                            } else {
                                                Bitmap bitmap = c13595.f40542;
                                                if (bitmap == null) {
                                                    i4 = iSave3;
                                                    if (c16377.f50389 >= 5242880) {
                                                        c15311.setColor(c21834.m49205());
                                                        if (z) {
                                                            iSave3 = i4;
                                                        } else {
                                                            iSave3 = canvas3.save();
                                                            canvas3.scale(f, f);
                                                            z = true;
                                                        }
                                                        canvas3.drawText(c11481.f34287, i12, c13595.f40543, f31, f30 + f9, (Paint) c15311);
                                                        canvas3 = canvas;
                                                        rectF = rectF;
                                                        c11482 = c11481;
                                                        i13 = i13;
                                                        c16378 = c16377;
                                                        c7246 = this;
                                                        int i17 = i11;
                                                        fM19349 = fM19349;
                                                        i3 = i17;
                                                    } else {
                                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, (int) ((f32 * 0.1f) + 0.5f)), Math.max(1, (int) ((fM19349 * 0.1f) + 0.5f)), Bitmap.Config.ARGB_4444);
                                                        c13595.f40542 = bitmapCreateBitmap;
                                                        Canvas canvas4 = new Canvas(bitmapCreateBitmap);
                                                        canvas4.scale(0.1f, 0.1f);
                                                        c15311.setColor(c21834.m49205());
                                                        c11483 = c11481;
                                                        c16378 = c16377;
                                                        i3 = i11;
                                                        canvas4.drawText(c11481.f34287, i12, c13595.f40543, 0.0f, f9, (Paint) c1539);
                                                        int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth() * 2;
                                                        c7246 = this;
                                                        c7246.f22228 += height;
                                                        c16378.f50389 += (long) height;
                                                        canvas3 = canvas;
                                                        c15311 = c1539;
                                                        bitmap = bitmapCreateBitmap;
                                                    }
                                                } else {
                                                    c11483 = c11481;
                                                    i4 = iSave3;
                                                    c16378 = c16377;
                                                    c7246 = c7247;
                                                    i3 = i11;
                                                }
                                                Matrix matrix = c7246.f22227;
                                                matrix.reset();
                                                float f36 = 10.0f * f;
                                                matrix.setScale(f36, f36);
                                                matrix.postTranslate(f31 * f, f30 * f);
                                                int i18 = i4;
                                                if (z) {
                                                    canvas3.restoreToCount(i18);
                                                    z = false;
                                                }
                                                canvas3.drawBitmap(bitmap, matrix, c15311);
                                                iSave3 = i18;
                                                c11482 = c11483;
                                            }
                                        }
                                        c11481 = c11482;
                                        rectF3 = rectF;
                                        f31 = f34;
                                        it = it2;
                                        f23 = f35;
                                        i12 = i13;
                                        c7247 = c7246;
                                        c16377 = c16378;
                                        f24 = f33;
                                        float f37 = fM19349;
                                        i11 = i3;
                                        fM19349 = f37;
                                    }
                                    i6 = iSave3;
                                    f3 = f24;
                                    f5 = f23;
                                    c16376 = c16377;
                                    int i19 = i11;
                                    f4 = fM19349;
                                    i = i19;
                                    z = z;
                                    list = list;
                                }
                            } else {
                                z2 = z;
                                i2 = iSave2;
                                f2 = f28;
                                f3 = f24;
                                f4 = fM19349;
                                f5 = f23;
                                c16376 = c163710;
                                i = i7;
                                c11480 = (C11480) list.get(i);
                                C22768 c22769 = (C22768) arrayList.get(i);
                                if (!c11480.f34287.isEmpty() || c22769 == null) {
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    if (!z2) {
                                        int iSave5 = canvas3.save();
                                        canvas3.scale(f, f);
                                        i2 = iSave5;
                                        z2 = true;
                                    }
                                    float f38 = f5;
                                    int i20 = 0;
                                    for (C13595 c13596 : c22769.f73518) {
                                        float f39 = f38 + c13596.f40544;
                                        if (f39 >= rectF3.left && f38 <= rectF3.right) {
                                            c1539.setColor(c13596.f40545.m49205());
                                            canvas3.drawText(c11480.f34287, i20, c13596.f40543, f38, f27, (Paint) c1539);
                                        }
                                        i20 = c13596.f40543;
                                        f38 = f39;
                                        canvas3 = canvas3;
                                    }
                                    i6 = i2;
                                    z = z2;
                                }
                            }
                        }
                        iSave2 = i9;
                        arrayList = c7247.f22237;
                        if (z3) {
                            f2 = f28;
                            c11481 = (C11480) list.get(i7);
                            C22768 c227610 = (C22768) arrayList.get(i7);
                            i2 = iSave2;
                            if (c11481.f34287.isEmpty()) {
                            }
                            z2 = z;
                            f3 = f24;
                            f4 = fM19349;
                            f5 = f23;
                            c16376 = c163710;
                            i = i7;
                            list = list;
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        } else {
                            z2 = z;
                            i2 = iSave2;
                            f2 = f28;
                            f3 = f24;
                            f4 = fM19349;
                            f5 = f23;
                            c16376 = c163710;
                            i = i7;
                            c11480 = (C11480) list.get(i);
                            C22768 c227611 = (C22768) arrayList.get(i);
                            if (c11480.f34287.isEmpty()) {
                            }
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        }
                    } else {
                        f2 = f28;
                        f3 = f24;
                        f4 = fM19349;
                        f5 = f23;
                        list = list3;
                        c16376 = c163710;
                        i = i7;
                        i6 = i9;
                    }
                    i7 = i + 1;
                    c7247 = this;
                    list3 = list;
                    c163710 = c16376;
                    f26 = f27;
                    size = i8;
                    f25 = f2;
                    fM19349 = f4;
                    f24 = f3;
                    f23 = f5;
                }
                iSave = i6;
                canvas2 = canvas3;
            }
            if (z) {
                canvas2.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19361() {
        for (C22768 c22768 : this.f22237) {
            if (c22768 != null) {
                for (C13595 c13595 : c22768.f73518) {
                    Bitmap bitmap = c13595.f40542;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c13595.f40542 = null;
                    }
                }
            }
        }
        this.f22228 = 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11480 m19355() {
        return (C11480) C7166.m19188(1, this.f22234);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7246.class == obj.getClass() && this.f22229 == ((C7246) obj).f22229;
    }

    public final int hashCode() {
        return this.f22229;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19353(C10130 c10130) {
        c10130.writeInt(this.f22229);
        List<C11480> list = this.f22234;
        c10130.writeInt(list.size());
        for (C11480 c11480 : list) {
            c10130.writeInt(c11480.f34288);
            c10130.m25439(c11480.f34287);
        }
        HashSet hashSet = this.f22238;
        c10130.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        C20423 c20423 = new C20423();
        ArrayList<C22768> arrayList = this.f22237;
        for (C22768 c22768 : arrayList) {
            if (c22768 != null) {
                Iterator it2 = c22768.f73518.iterator();
                while (it2.hasNext()) {
                    c20423.m46829(((C13595) it2.next()).f40545);
                }
            }
        }
        c20423.m46827(c10130);
        c10130.writeInt(arrayList.size());
        for (C22768 c22769 : arrayList) {
            if (c22769 == null) {
                c10130.writeInt(-1);
            } else {
                ArrayList<C13595> arrayList2 = c22769.f73518;
                c10130.writeInt(arrayList2.size());
                for (C13595 c13595 : arrayList2) {
                    c10130.writeByte(c20423.m46825(c13595.f40545));
                    c10130.writeInt(c13595.f40543);
                    c10130.m25419(c13595.f40544);
                }
            }
        }
        c10130.writeByte(this.f22222 ? (byte) 1 : (byte) 0);
        c10130.writeInt(this.f22226);
        c10130.m25419(this.f22235);
        c10130.m25419(this.f22236);
        c10130.m25419(this.f22221);
        c10130.m25419(this.f22231);
        c10130.writeByte(this.f22224 ? (byte) 1 : (byte) 0);
        c10130.m25419(this.f22225);
        c10130.m25419(this.f22230);
        c10130.m25419(this.f22219);
        c10130.m25419(this.f22233);
        c10130.writeInt(this.f22232);
    }

    public C7246(C16376 c16376, C12951 c12951) {
        this.f22232 = -1;
        this.f22218 = new RectF();
        this.f22220 = C21943.m49431();
        this.f22228 = 0;
        this.f22227 = new Matrix();
        this.f22223 = c16376;
        this.f22229 = c12951.readInt();
        int i = c12951.readInt();
        this.f22234 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f22234.add(new C11480(c12951.readInt(), c12951.m31506()));
        }
        int i3 = c12951.readInt();
        this.f22238 = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f22238.add(c12951.m31506());
        }
        C20423 c20423 = new C20423();
        c20423.m46828(c12951);
        int i5 = c12951.readInt();
        this.f22237 = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = c12951.readInt();
            if (i7 == -1) {
                this.f22237.add(null);
            } else {
                C22768 c22768 = new C22768();
                c22768.f73518.ensureCapacity(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    C13595 c13595 = new C13595(c12951.readInt(), c20423.m46826(c12951.readByte() & 255));
                    c13595.f40544 = c12951.m31495();
                    c22768.f73518.add(c13595);
                }
                this.f22237.add(c22768);
            }
        }
        this.f22222 = c12951.readByte() != 0;
        this.f22226 = c12951.readInt();
        this.f22235 = c12951.m31495();
        this.f22236 = c12951.m31495();
        this.f22221 = c12951.m31495();
        this.f22231 = c12951.m31495();
        this.f22224 = c12951.readByte() != 0;
        this.f22225 = c12951.m31495();
        this.f22230 = c12951.m31495();
        this.f22219 = c12951.m31495();
        this.f22233 = c12951.m31495();
        this.f22232 = c12951.readInt();
    }
}
