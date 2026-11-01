package p067l;

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
public final class C9255 {

    /* JADX INFO: renamed from: ᩸ */
    public static final C13261 f25099 = new C13261();

    /* JADX INFO: renamed from: ֡ */
    public RectF f25100;

    /* JADX INFO: renamed from: ֨ */
    public float f25101;

    /* JADX INFO: renamed from: ֫ */
    public boolean f25102;

    /* JADX INFO: renamed from: ۖ */
    public float f25103;

    /* JADX INFO: renamed from: ۘ */
    public boolean f25104;

    /* JADX INFO: renamed from: ۚ */
    public final C17932 f25105;

    /* JADX INFO: renamed from: ۜ */
    public boolean f25106;

    /* JADX INFO: renamed from: ۠ */
    public float f25107;

    /* JADX INFO: renamed from: ۡ */
    public int f25108;

    /* JADX INFO: renamed from: ۢ */
    public final Matrix f25109;

    /* JADX INFO: renamed from: ۧ */
    public int f25110;

    /* JADX INFO: renamed from: ܳ */
    public int f25111;

    /* JADX INFO: renamed from: ܶ */
    public float f25112;

    /* JADX INFO: renamed from: ܺ */
    public float f25113;

    /* JADX INFO: renamed from: ܽ */
    public int f25114;

    /* JADX INFO: renamed from: ܿ */
    public float f25115;

    /* JADX INFO: renamed from: ᩳ */
    public final List f25116;

    /* JADX INFO: renamed from: ᩴ */
    public float f25117;

    /* JADX INFO: renamed from: ᩵ */
    public float f25118;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f25119;

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet f25120;

    /* JADX INFO: renamed from: ֫ */
    public final void m21303(C13279 c13279) {
        if (c13279.f37283.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int iM21309 = m21309();
        int i = m21304().f37284;
        int i2 = c13279.f37284;
        if (iM21309 > i2 || i2 > i) {
            int i3 = this.f25114;
            ArrayList arrayList = this.f25119;
            List list = this.f25116;
            if (i3 == -1) {
                list.add(0, new C13279(-1, ""));
                arrayList.add(0, null);
                this.f25114 = 0;
            }
            C24007 c24007 = new C24007();
            list.add(this.f25114, c13279);
            arrayList.add(this.f25114, c24007);
            C23120 c23120M37809 = C11938.f33226.m37809(C7026.f18306);
            int length = c13279.f37283.length();
            if (length != 0) {
                c24007.f76244.add(new C15289(length, c23120M37809));
            }
            this.f25114++;
        }
    }

    public C9255(C17932 c17932, int i, ArrayList arrayList) {
        this.f25114 = -1;
        this.f25100 = new RectF();
        this.f25102 = C23223.m51768();
        this.f25110 = 0;
        this.f25109 = new Matrix();
        this.f25105 = c17932;
        this.f25111 = i;
        this.f25116 = arrayList;
        this.f25120 = new HashSet();
        if (arrayList.size() > 210) {
            int size = arrayList.size() / 2;
            arrayList.set(size - 100, new C13279(-1, "......"));
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
            C13279 c13279 = (C13279) arrayList.get(i2);
            if (!c13279.f37283.isEmpty()) {
                if (c13279.f37283.startsWith(".sparse-switch") || c13279.f37283.startsWith(".packed-switch")) {
                    z = false;
                } else if (z) {
                    if (c13279.f37283.length() > 100) {
                        c13279.f37283 = C8597.m20011(100, c13279.f37283);
                    }
                    if (c13279.f37283.startsWith(":")) {
                        int iIndexOf = c13279.f37283.indexOf(32);
                        strSubstring = iIndexOf == -1 ? c13279.f37283 : c13279.f37283.substring(0, iIndexOf);
                    }
                    if (strSubstring != null) {
                        this.f25120.add(strSubstring);
                    }
                }
            }
            i2++;
        }
        this.f25119 = new ArrayList(arrayList.size());
        C19255 c19255 = new C19255();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13279 c132710 = (C13279) it.next();
            if (c132710.f37283.isEmpty()) {
                this.f25119.add(null);
            } else {
                C24007 c24007 = new C24007();
                this.f25119.add(c24007);
                try {
                    c19255.m43866(C11938.f33227.m53661(c132710.f37283, f25099).m11703());
                    while (c19255.m43871()) {
                        C23120 c23120M43870 = c19255.m43870();
                        int iM43868 = c19255.m43868();
                        int iM43865 = c19255.m43865();
                        if (iM43868 != iM43865) {
                            c24007.f76244.add(new C15289(iM43865, c23120M43870));
                        }
                    }
                } catch (C10064 unused) {
                    C23120 c23120M37819 = C11938.f33226.m37819();
                    int length = c132710.f37283.length();
                    if (length != 0) {
                        c24007.f76244.add(new C15289(length, c23120M37819));
                    }
                }
                c24007.f76244.trimToSize();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m21309() {
        return ((C13279) this.f25116.get(this.f25114 + 1)).f37284;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21301(Paint paint) {
        float fontSpacing = paint.getFontSpacing();
        List list = this.f25116;
        if (list.isEmpty()) {
            this.f25113 = 4.0f * fontSpacing;
            this.f25103 = (fontSpacing * 3.0f) + paint.measureText("EXIT");
            float fMeasureText = paint.measureText("0") * 0.6f;
            this.f25118 = fMeasureText;
            this.f25117 = fMeasureText;
            this.f25104 = true;
            return;
        }
        this.f25113 = list.size() * fontSpacing;
        float fMeasureText2 = paint.measureText("0");
        float length = (String.valueOf(((C13279) C9179.m21131(1, list)).f37284).length() + 1) * fMeasureText2;
        this.f25117 = 0.7f * fMeasureText2;
        this.f25118 = fMeasureText2 * 0.5f;
        if (this.f25104) {
            this.f25103 = m21297(this.f25108, paint);
        } else {
            this.f25108 = 0;
            int size = list.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                float fM21297 = m21297(i, paint);
                if (fM21297 > f) {
                    this.f25108 = i;
                    f = fM21297;
                }
            }
            this.f25103 = f;
            this.f25104 = true;
        }
        this.f25113 = (this.f25118 * 2.0f) + this.f25113;
        this.f25103 = (this.f25117 * 2.0f) + length + this.f25103;
    }

    /* JADX INFO: renamed from: ֫ */
    private float m21297(int i, Paint paint) {
        C13279 c13279 = (C13279) this.f25116.get(i);
        C24007 c24007 = (C24007) this.f25119.get(i);
        float f = 0.0f;
        if (!c13279.f37283.isEmpty() && c24007 != null) {
            int i2 = 0;
            for (C15289 c15289 : c24007.f76244) {
                float fMeasureText = paint.measureText(c13279.f37283, i2, c15289.f43619);
                c15289.f43620 = fMeasureText;
                f += fMeasureText;
                i2 = c15289.f43619;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m21307() {
        if (!this.f25104) {
            throw new IllegalStateException("Need measure");
        }
        return this.f25103;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m21305() {
        if (!this.f25104) {
            throw new IllegalStateException("Need measure");
        }
        return this.f25113;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21299(float f, float f2, float f3, float f4) {
        this.f25107 = f;
        this.f25112 = f2;
        this.f25101 = f3;
        this.f25115 = f4;
        this.f25106 = true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m21306() {
        if (!this.f25106) {
            throw new IllegalStateException("Need layout");
        }
        return this.f25107;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final float m21311() {
        if (!this.f25106) {
            throw new IllegalStateException("Need layout");
        }
        return this.f25112;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m21308() {
        if (!this.f25106) {
            throw new IllegalStateException("Need layout");
        }
        return this.f25101;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m21298() {
        if (!this.f25106) {
            throw new IllegalStateException("Need layout");
        }
        return this.f25115;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0422  */
    /* JADX INFO: renamed from: ֫ */
    public final void m21300(Canvas canvas, C3831 c3831, C3831 c3832, RectF rectF, float f) {
        boolean z;
        int iSave;
        float f2;
        float f3;
        float f4;
        float f5;
        List list;
        C17932 c17932;
        int i;
        int iSave2;
        ArrayList arrayList;
        boolean z2;
        int i2;
        C13279 c13279;
        C13279 c132710;
        C17932 c17933;
        C17932 c17934;
        C9255 c9255;
        C13279 c132711;
        int i3;
        C13279 c132712;
        int i4;
        Canvas canvas2 = canvas;
        float f6 = this.f25107;
        float f7 = this.f25112;
        if (rectF.intersects(f6, f7, this.f25101 + f6, this.f25115 + f7)) {
            List list2 = this.f25116;
            boolean zIsEmpty = list2.isEmpty();
            float fontSpacing = c3831.getFontSpacing();
            float f8 = -c3831.getFontMetrics().ascent;
            float fM21298 = zIsEmpty ? m21298() / 4.0f : (m21298() - (this.f25118 * 2.0f)) / list2.size();
            float f9 = (f8 / fontSpacing) * fM21298;
            float fM21306 = m21306();
            float fM21311 = m21311();
            float f10 = fM21306 * f;
            float f11 = fM21311 * f;
            float f12 = this.f25101 * f;
            float f13 = this.f25115 * f;
            float f14 = ((this.f25117 + this.f25118) / 4.0f) * f;
            float fMeasureText = c3831.measureText("0");
            float length = zIsEmpty ? 0.0f : (String.valueOf(((C13279) C9179.m21131(1, list2)).f37284).length() + 1) * fMeasureText;
            float f15 = length * f;
            float f16 = f12 + f10;
            RectF rectF2 = this.f25100;
            rectF2.set(f10, f11, f16, f13 + f11);
            C17932 c17935 = this.f25105;
            int i5 = c17935.f53562;
            List list3 = list2;
            Paint.Style style = Paint.Style.FILL;
            c3831.setStyle(style);
            C17932 c17936 = c17935;
            if (i5 == this.f25111) {
                float f17 = C11938.f33224;
                c3831.setColor(C23223.m51761(-13421779, -1309));
            } else {
                float f18 = C11938.f33224;
                c3831.setColor(zIsEmpty ? C23223.m51761(-13948117, -328966) : C23223.m51761(-13948117, -1));
            }
            canvas2.drawRoundRect(rectF2, f14, f14, c3831);
            if (!zIsEmpty) {
                rectF2.right = rectF2.left + f14 + f14;
                c3831.setColor(C23223.m51761(-13223878, -986896));
                canvas2.drawRoundRect(rectF2, f14, f14, c3831);
                rectF2.left = rectF2.right - f14;
                rectF2.right = f15 + f10;
                canvas2.drawRect(rectF2, c3831);
                c3831.setStyle(Paint.Style.STROKE);
                c3831.setColor(C23223.m51761(-11184811, -3092272));
                c3831.setStrokeWidth(1.0f * f);
                float f19 = rectF2.right;
                canvas.drawLine(f19, rectF2.top, f19, rectF2.bottom, c3831);
            }
            rectF2.left = f10;
            rectF2.right = f16;
            c3831.setStyle(Paint.Style.STROKE);
            c3831.setColor(C23223.m51761(-11513776, -4144960));
            c3831.setStrokeWidth(C11938.f33224 * 1.5f * f);
            canvas2.drawRoundRect(rectF2, f14, f14, c3831);
            if (zIsEmpty) {
                c3831.setTextAlign(Paint.Align.CENTER);
                c3831.setStyle(style);
                c3831.setColor(C23223.m51761(-7829368, -16777216));
                iSave = canvas.save();
                canvas2.scale(f, f);
                canvas.drawText("EXIT", 0, 4, (this.f25101 / 2.0f) + fM21306, (fM21298 * 1.5f) + fM21311 + f9, (Paint) c3831);
                canvas2.restoreToCount(iSave);
                c3831.setTextAlign(Paint.Align.LEFT);
                z = false;
            } else {
                C9255 c9256 = this;
                float f20 = c9256.f25118;
                float f21 = fM21311 + f20;
                float f22 = f20 + f9 + fM21311;
                float f23 = fM21306 + c9256.f25117 + length;
                float f24 = (fM21306 + length) - fMeasureText;
                boolean z3 = f <= 0.15f;
                c3831.setStyle(style);
                int size = list3.size();
                int i6 = 0;
                float f25 = f21;
                Canvas canvas3 = canvas2;
                int i7 = 0;
                float f26 = f22;
                z = false;
                while (i7 < size) {
                    if (i7 > 0) {
                        f26 += fM21298;
                        f25 += fM21298;
                    }
                    float f27 = f26;
                    float f28 = f25;
                    RectF rectF3 = rectF;
                    int i8 = size;
                    int i9 = i6;
                    if (rectF3.intersects(rectF3.left, f28, rectF3.right, f28 + fM21298)) {
                        if (f24 < rectF3.left || fM21306 > rectF3.right) {
                            list = list3;
                        } else {
                            list = list3;
                            int i10 = ((C13279) list.get(i7)).f37284;
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
                                    canvas3.drawText(strValueOf, length2, length2 + 1, f29, f27, (Paint) c3832);
                                    f29 -= fMeasureText;
                                }
                            }
                            arrayList = c9256.f25119;
                            if (z3) {
                                f2 = f28;
                                c132710 = (C13279) list.get(i7);
                                C24007 c24007 = (C24007) arrayList.get(i7);
                                i2 = iSave2;
                                if (!c132710.f37283.isEmpty() || c24007 == null) {
                                    z2 = z;
                                    f3 = f24;
                                    f4 = fM21298;
                                    f5 = f23;
                                    c17932 = c17936;
                                    i = i7;
                                    list = list;
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    int i11 = i7;
                                    if (c9256.f25102 != C23223.m51768()) {
                                        c9256.f25102 = C23223.m51768();
                                        c17933 = c17936;
                                        c17933.f53560 -= (long) c9256.f25110;
                                        m21310();
                                    } else {
                                        c17933 = c17936;
                                    }
                                    float f30 = f27 - f9;
                                    Iterator it = c24007.f76244.iterator();
                                    C3831 c3833 = c3831;
                                    float f31 = f23;
                                    int iSave3 = i2;
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        C15289 c15289 = (C15289) it.next();
                                        float f32 = c15289.f43620;
                                        Iterator it2 = it;
                                        C23120 c23120 = c15289.f43621;
                                        float f33 = f24;
                                        int i13 = c15289.f43619;
                                        float f34 = f31 + f32;
                                        float f35 = f23;
                                        if (f34 < rectF3.left || f31 > rectF3.right) {
                                            i13 = i13;
                                            c17934 = c17933;
                                            c9255 = c9256;
                                            rectF = rectF3;
                                            c132711 = c132710;
                                            int i14 = i11;
                                            fM21298 = fM21298;
                                            i3 = i14;
                                            iSave3 = iSave3;
                                        } else {
                                            int i15 = i13 - i12;
                                            if (10 >= i15 || i15 >= 100) {
                                                c132711 = c132710;
                                                int iSave4 = iSave3;
                                                i13 = i13;
                                                c17934 = c17933;
                                                c9255 = c9256;
                                                rectF = rectF;
                                                int i16 = i11;
                                                fM21298 = fM21298;
                                                i3 = i16;
                                                c3833.setColor(c23120.m51556());
                                                if (!z) {
                                                    iSave4 = canvas3.save();
                                                    canvas3.scale(f, f);
                                                    z = true;
                                                }
                                                iSave3 = iSave4;
                                                canvas3.drawText(c132711.f37283, i12, c15289.f43619, f31, f30 + f9, (Paint) c3833);
                                            } else {
                                                Bitmap bitmap = c15289.f43618;
                                                if (bitmap == null) {
                                                    i4 = iSave3;
                                                    if (c17933.f53560 >= 5242880) {
                                                        c3833.setColor(c23120.m51556());
                                                        if (z) {
                                                            iSave3 = i4;
                                                        } else {
                                                            iSave3 = canvas3.save();
                                                            canvas3.scale(f, f);
                                                            z = true;
                                                        }
                                                        canvas3.drawText(c132710.f37283, i12, c15289.f43619, f31, f30 + f9, (Paint) c3833);
                                                        canvas3 = canvas;
                                                        rectF = rectF;
                                                        c132711 = c132710;
                                                        i13 = i13;
                                                        c17934 = c17933;
                                                        c9255 = this;
                                                        int i17 = i11;
                                                        fM21298 = fM21298;
                                                        i3 = i17;
                                                    } else {
                                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, (int) ((f32 * 0.1f) + 0.5f)), Math.max(1, (int) ((fM21298 * 0.1f) + 0.5f)), Bitmap.Config.ARGB_4444);
                                                        c15289.f43618 = bitmapCreateBitmap;
                                                        Canvas canvas4 = new Canvas(bitmapCreateBitmap);
                                                        canvas4.scale(0.1f, 0.1f);
                                                        c3833.setColor(c23120.m51556());
                                                        c132712 = c132710;
                                                        c17934 = c17933;
                                                        i3 = i11;
                                                        canvas4.drawText(c132710.f37283, i12, c15289.f43619, 0.0f, f9, (Paint) c3831);
                                                        int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth() * 2;
                                                        c9255 = this;
                                                        c9255.f25110 += height;
                                                        c17934.f53560 += (long) height;
                                                        canvas3 = canvas;
                                                        c3833 = c3831;
                                                        bitmap = bitmapCreateBitmap;
                                                    }
                                                } else {
                                                    c132712 = c132710;
                                                    i4 = iSave3;
                                                    c17934 = c17933;
                                                    c9255 = c9256;
                                                    i3 = i11;
                                                }
                                                Matrix matrix = c9255.f25109;
                                                matrix.reset();
                                                float f36 = 10.0f * f;
                                                matrix.setScale(f36, f36);
                                                matrix.postTranslate(f31 * f, f30 * f);
                                                int i18 = i4;
                                                if (z) {
                                                    canvas3.restoreToCount(i18);
                                                    z = false;
                                                }
                                                canvas3.drawBitmap(bitmap, matrix, c3833);
                                                iSave3 = i18;
                                                c132711 = c132712;
                                            }
                                        }
                                        c132710 = c132711;
                                        rectF3 = rectF;
                                        f31 = f34;
                                        it = it2;
                                        f23 = f35;
                                        i12 = i13;
                                        c9256 = c9255;
                                        c17933 = c17934;
                                        f24 = f33;
                                        float f37 = fM21298;
                                        i11 = i3;
                                        fM21298 = f37;
                                    }
                                    i6 = iSave3;
                                    f3 = f24;
                                    f5 = f23;
                                    c17932 = c17933;
                                    int i19 = i11;
                                    f4 = fM21298;
                                    i = i19;
                                    z = z;
                                    list = list;
                                }
                            } else {
                                z2 = z;
                                i2 = iSave2;
                                f2 = f28;
                                f3 = f24;
                                f4 = fM21298;
                                f5 = f23;
                                c17932 = c17936;
                                i = i7;
                                c13279 = (C13279) list.get(i);
                                C24007 c24008 = (C24007) arrayList.get(i);
                                if (!c13279.f37283.isEmpty() || c24008 == null) {
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
                                    for (C15289 c152810 : c24008.f76244) {
                                        float f39 = f38 + c152810.f43620;
                                        if (f39 >= rectF3.left && f38 <= rectF3.right) {
                                            c3831.setColor(c152810.f43621.m51556());
                                            canvas3.drawText(c13279.f37283, i20, c152810.f43619, f38, f27, (Paint) c3831);
                                        }
                                        i20 = c152810.f43619;
                                        f38 = f39;
                                        canvas3 = canvas3;
                                    }
                                    i6 = i2;
                                    z = z2;
                                }
                            }
                        }
                        iSave2 = i9;
                        arrayList = c9256.f25119;
                        if (z3) {
                            f2 = f28;
                            c132710 = (C13279) list.get(i7);
                            C24007 c24009 = (C24007) arrayList.get(i7);
                            i2 = iSave2;
                            if (c132710.f37283.isEmpty()) {
                            }
                            z2 = z;
                            f3 = f24;
                            f4 = fM21298;
                            f5 = f23;
                            c17932 = c17936;
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
                            f4 = fM21298;
                            f5 = f23;
                            c17932 = c17936;
                            i = i7;
                            c13279 = (C13279) list.get(i);
                            C24007 c240010 = (C24007) arrayList.get(i);
                            if (c13279.f37283.isEmpty()) {
                            }
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        }
                    } else {
                        f2 = f28;
                        f3 = f24;
                        f4 = fM21298;
                        f5 = f23;
                        list = list3;
                        c17932 = c17936;
                        i = i7;
                        i6 = i9;
                    }
                    i7 = i + 1;
                    c9256 = this;
                    list3 = list;
                    c17936 = c17932;
                    f26 = f27;
                    size = i8;
                    f25 = f2;
                    fM21298 = f4;
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

    /* JADX INFO: renamed from: ᩷ */
    public final void m21310() {
        for (C24007 c24007 : this.f25119) {
            if (c24007 != null) {
                for (C15289 c15289 : c24007.f76244) {
                    Bitmap bitmap = c15289.f43618;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c15289.f43618 = null;
                    }
                }
            }
        }
        this.f25110 = 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C13279 m21304() {
        return (C13279) C9179.m21131(1, this.f25116);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9255.class == obj.getClass() && this.f25111 == ((C9255) obj).f25111;
    }

    public final int hashCode() {
        return this.f25111;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21302(C11996 c11996) {
        c11996.writeInt(this.f25111);
        List<C13279> list = this.f25116;
        c11996.writeInt(list.size());
        for (C13279 c13279 : list) {
            c11996.writeInt(c13279.f37284);
            c11996.m27459(c13279.f37283);
        }
        HashSet hashSet = this.f25120;
        c11996.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c11996.m27459((String) it.next());
        }
        C21779 c21779 = new C21779();
        ArrayList<C24007> arrayList = this.f25119;
        for (C24007 c24007 : arrayList) {
            if (c24007 != null) {
                Iterator it2 = c24007.f76244.iterator();
                while (it2.hasNext()) {
                    c21779.m49152(((C15289) it2.next()).f43621);
                }
            }
        }
        c21779.m49150(c11996);
        c11996.writeInt(arrayList.size());
        for (C24007 c24008 : arrayList) {
            if (c24008 == null) {
                c11996.writeInt(-1);
            } else {
                ArrayList<C15289> arrayList2 = c24008.f76244;
                c11996.writeInt(arrayList2.size());
                for (C15289 c15289 : arrayList2) {
                    c11996.writeByte(c21779.m49148(c15289.f43621));
                    c11996.writeInt(c15289.f43619);
                    c11996.m27439(c15289.f43620);
                }
            }
        }
        c11996.writeByte(this.f25104 ? (byte) 1 : (byte) 0);
        c11996.writeInt(this.f25108);
        c11996.m27439(this.f25117);
        c11996.m27439(this.f25118);
        c11996.m27439(this.f25103);
        c11996.m27439(this.f25113);
        c11996.writeByte(this.f25106 ? (byte) 1 : (byte) 0);
        c11996.m27439(this.f25107);
        c11996.m27439(this.f25112);
        c11996.m27439(this.f25101);
        c11996.m27439(this.f25115);
        c11996.writeInt(this.f25114);
    }

    public C9255(C17932 c17932, C14677 c14677) {
        this.f25114 = -1;
        this.f25100 = new RectF();
        this.f25102 = C23223.m51768();
        this.f25110 = 0;
        this.f25109 = new Matrix();
        this.f25105 = c17932;
        this.f25111 = c14677.readInt();
        int i = c14677.readInt();
        this.f25116 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f25116.add(new C13279(c14677.readInt(), c14677.m33593()));
        }
        int i3 = c14677.readInt();
        this.f25120 = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f25120.add(c14677.m33593());
        }
        C21779 c21779 = new C21779();
        c21779.m49151(c14677);
        int i5 = c14677.readInt();
        this.f25119 = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = c14677.readInt();
            if (i7 == -1) {
                this.f25119.add(null);
            } else {
                C24007 c24007 = new C24007();
                c24007.f76244.ensureCapacity(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    C15289 c15289 = new C15289(c14677.readInt(), c21779.m49149(c14677.readByte() & 255));
                    c15289.f43620 = c14677.m33582();
                    c24007.f76244.add(c15289);
                }
                this.f25119.add(c24007);
            }
        }
        this.f25104 = c14677.readByte() != 0;
        this.f25108 = c14677.readInt();
        this.f25117 = c14677.m33582();
        this.f25118 = c14677.m33582();
        this.f25103 = c14677.m33582();
        this.f25113 = c14677.m33582();
        this.f25106 = c14677.readByte() != 0;
        this.f25107 = c14677.m33582();
        this.f25112 = c14677.m33582();
        this.f25101 = c14677.m33582();
        this.f25115 = c14677.m33582();
        this.f25114 = c14677.readInt();
    }
}
