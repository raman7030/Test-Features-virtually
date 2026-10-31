package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8972 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9678 f27249;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f27250;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public TextPaint f27251;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Context f27253;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final RectF f27247 = new RectF();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentMapC10942 f27246 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27255 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27257 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f27254 = -1.0f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f27252 = -1.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f27248 = -1.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f27256 = new int[0];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f27258 = false;

    public C8972(TextView textView) {
        this.f27250 = textView;
        this.f27253 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f27249 = new C20967();
        } else if (i >= 23) {
            this.f27249 = new C6855();
        } else {
            this.f27249 = new C9678();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23173(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f27253;
        int[] iArr = C3390.f10706;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f27250;
        C17648.m41302(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f27255 = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr2[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                this.f27256 = m23165(iArr2);
                m23168();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (m23167()) {
            if (this.f27255 == 1) {
                if (!this.f27258) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    m23164(dimension2, dimension3, dimension);
                }
                m23166();
                return;
            }
            return;
        }
        this.f27255 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23171(int i) {
        if (m23167()) {
            if (i == 0) {
                this.f27255 = 0;
                this.f27252 = -1.0f;
                this.f27248 = -1.0f;
                this.f27254 = -1.0f;
                this.f27256 = new int[0];
                this.f27257 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C19370.m44628(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = this.f27253.getResources().getDisplayMetrics();
            m23164(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m23166()) {
                m23169();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23172(int i, int i2, int i3, int i4) {
        if (m23167()) {
            DisplayMetrics displayMetrics = this.f27253.getResources().getDisplayMetrics();
            m23164(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m23166()) {
                m23169();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23174(int[] iArr, int i) {
        if (m23167()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f27253.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f27256 = m23165(iArrCopyOf);
                if (!m23168()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f27258 = false;
            }
            if (m23166()) {
                m23169();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m23176() {
        return this.f27255;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23179() {
        return Math.round(this.f27254);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23177() {
        return Math.round(this.f27252);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23175() {
        return Math.round(this.f27248);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] m23178() {
        return this.f27256;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m23168() {
        int[] iArr = this.f27256;
        int length = iArr.length;
        boolean z = length > 0;
        this.f27258 = z;
        if (z) {
            this.f27255 = 1;
            this.f27252 = iArr[0];
            this.f27248 = iArr[length - 1];
            this.f27254 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m23165(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23164(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f27255 = 1;
        this.f27252 = f;
        this.f27248 = f2;
        this.f27254 = f3;
        this.f27258 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m23166() {
        if (m23167() && this.f27255 == 1) {
            if (!this.f27258 || this.f27256.length == 0) {
                int iFloor = ((int) Math.floor((this.f27248 - this.f27252) / this.f27254)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f27254) + this.f27252);
                }
                this.f27256 = m23165(iArr);
            }
            this.f27257 = true;
        } else {
            this.f27257 = false;
        }
        return this.f27257;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23169() {
        if (m23180()) {
            if (this.f27257) {
                if (this.f27250.getMeasuredHeight() <= 0 || this.f27250.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f27249.mo24604(this.f27250) ? 1048576 : (this.f27250.getMeasuredWidth() - this.f27250.getTotalPaddingLeft()) - this.f27250.getTotalPaddingRight();
                int height = (this.f27250.getHeight() - this.f27250.getCompoundPaddingBottom()) - this.f27250.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f27247;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM23161 = m23161(rectF);
                    if (fM23161 != this.f27250.getTextSize()) {
                        m23170(fM23161, 0);
                    }
                }
            }
            this.f27257 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23170(float f, int i) {
        Resources resources;
        Context context = this.f27253;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f27250;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f27257 = false;
                try {
                    Method methodM23163 = m23163("nullLayouts");
                    if (methodM23163 != null) {
                        methodM23163.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (!zIsInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m23161(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f27256.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f27256[i4];
            TextView textView = this.f27250;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f27251;
            if (textPaint == null) {
                this.f27251 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f27251.set(textView.getPaint());
            this.f27251.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m23162("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = C23788.m52463(charSequence, alignment, iRound, maxLines, textView, this.f27251, this.f27249);
            } else {
                staticLayout = new StaticLayout(charSequence, this.f27251, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f27256[i3];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m23162(String str, Object obj, Object obj2) {
        try {
            return m23163(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method m23163(String str) {
        try {
            ConcurrentMapC10942 concurrentMapC10942 = f27246;
            Method declaredMethod = (Method) concurrentMapC10942.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentMapC10942.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m23180() {
        return m23167() && this.f27255 != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m23167() {
        return !(this.f27250 instanceof C22898);
    }
}
