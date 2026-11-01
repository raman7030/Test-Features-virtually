package p067l;

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

/* JADX INFO: renamed from: l.ۡܺ */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1287 {

    /* JADX INFO: renamed from: ۜ */
    public final C1322 f30184;

    /* JADX INFO: renamed from: ۡ */
    public final TextView f30185;

    /* JADX INFO: renamed from: ۢ */
    public TextPaint f30186;

    /* JADX INFO: renamed from: ܳ */
    public final Context f30188;

    /* JADX INFO: renamed from: ܺ */
    public static final RectF f30182 = new RectF();

    /* JADX INFO: renamed from: ۖ */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentMapC12768 f30181 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ܿ */
    public int f30190 = 0;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f30192 = false;

    /* JADX INFO: renamed from: ܽ */
    public float f30189 = -1.0f;

    /* JADX INFO: renamed from: ۧ */
    public float f30187 = -1.0f;

    /* JADX INFO: renamed from: ֫ */
    public float f30183 = -1.0f;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f30191 = new int[0];

    /* JADX INFO: renamed from: ᩻ */
    public boolean f30193 = false;

    public C1287(TextView textView) {
        this.f30185 = textView;
        this.f30188 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f30184 = new C1882();
        } else if (i >= 23) {
            this.f30184 = new C1182();
        } else {
            this.f30184 = new C1322();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25117(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f30188;
        int[] iArr = C1010.f13513;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f30185;
        C1717.m43548(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f30190 = typedArrayObtainStyledAttributes.getInt(5, 0);
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
                this.f30191 = m25109(iArr2);
                m25112();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (m25111()) {
            if (this.f30190 == 1) {
                if (!this.f30193) {
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
                    m25108(dimension2, dimension3, dimension);
                }
                m25110();
                return;
            }
            return;
        }
        this.f30190 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25115(int i) {
        if (m25111()) {
            if (i == 0) {
                this.f30190 = 0;
                this.f30187 = -1.0f;
                this.f30183 = -1.0f;
                this.f30189 = -1.0f;
                this.f30191 = new int[0];
                this.f30192 = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C20778.m46922(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = this.f30188.getResources().getDisplayMetrics();
            m25108(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m25110()) {
                m25113();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25116(int i, int i2, int i3, int i4) {
        if (m25111()) {
            DisplayMetrics displayMetrics = this.f30188.getResources().getDisplayMetrics();
            m25108(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m25110()) {
                m25113();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25118(int[] iArr, int i) {
        if (m25111()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f30188.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f30191 = m25109(iArrCopyOf);
                if (!m25112()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f30193 = false;
            }
            if (m25110()) {
                m25113();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m25120() {
        return this.f30190;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m25123() {
        return Math.round(this.f30189);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m25121() {
        return Math.round(this.f30187);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25119() {
        return Math.round(this.f30183);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int[] m25122() {
        return this.f30191;
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m25112() {
        int[] iArr = this.f30191;
        int length = iArr.length;
        boolean z = length > 0;
        this.f30193 = z;
        if (z) {
            this.f30190 = 1;
            this.f30187 = iArr[0];
            this.f30183 = iArr[length - 1];
            this.f30189 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m25109(int[] iArr) {
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

    /* JADX INFO: renamed from: ֫ */
    private void m25108(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f30190 = 1;
        this.f30187 = f;
        this.f30183 = f2;
        this.f30189 = f3;
        this.f30193 = false;
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m25110() {
        if (m25111() && this.f30190 == 1) {
            if (!this.f30193 || this.f30191.length == 0) {
                int iFloor = ((int) Math.floor((this.f30183 - this.f30187) / this.f30189)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f30189) + this.f30187);
                }
                this.f30191 = m25109(iArr);
            }
            this.f30192 = true;
        } else {
            this.f30192 = false;
        }
        return this.f30192;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25113() {
        if (m25124()) {
            if (this.f30192) {
                if (this.f30185.getMeasuredHeight() <= 0 || this.f30185.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f30184.mo26618(this.f30185) ? 1048576 : (this.f30185.getMeasuredWidth() - this.f30185.getTotalPaddingLeft()) - this.f30185.getTotalPaddingRight();
                int height = (this.f30185.getHeight() - this.f30185.getCompoundPaddingBottom()) - this.f30185.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f30182;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM25105 = m25105(rectF);
                    if (fM25105 != this.f30185.getTextSize()) {
                        m25114(fM25105, 0);
                    }
                }
            }
            this.f30192 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25114(float f, int i) {
        Resources resources;
        Context context = this.f30188;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f30185;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f30192 = false;
                try {
                    Method methodM25107 = m25107("nullLayouts");
                    if (methodM25107 != null) {
                        methodM25107.invoke(textView, null);
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

    /* JADX INFO: renamed from: ֫ */
    private int m25105(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f30191.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f30191[i4];
            TextView textView = this.f30185;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f30186;
            if (textPaint == null) {
                this.f30186 = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f30186.set(textView.getPaint());
            this.f30186.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) m25106("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = C2022.m54872(charSequence, alignment, iRound, maxLines, textView, this.f30186, this.f30184);
            } else {
                staticLayout = new StaticLayout(charSequence, this.f30186, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
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
        return this.f30191[i3];
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m25106(String str, Object obj, Object obj2) {
        try {
            return m25107(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Method m25107(String str) {
        try {
            ConcurrentMapC12768 concurrentMapC12768 = f30181;
            Method declaredMethod = (Method) concurrentMapC12768.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentMapC12768.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m25124() {
        return m25111() && this.f30190 != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    private boolean m25111() {
        return !(this.f30185 instanceof C1978);
    }
}
