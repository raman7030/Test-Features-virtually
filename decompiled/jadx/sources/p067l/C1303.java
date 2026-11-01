package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p050t0.C0215b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۢۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public class C1303 implements InterfaceC1329 {

    /* JADX INFO: renamed from: ۘ֫ */
    public static Method f31081;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static Method f31082;

    /* JADX INFO: renamed from: ᩵֫ */
    public static Method f31083;

    /* JADX INFO: renamed from: ֫֫ */
    public final RunnableC1688 f31084;

    /* JADX INFO: renamed from: ۖ֫ */
    public final ViewOnTouchListenerC1163 f31085;

    /* JADX INFO: renamed from: ۗ */
    public int f31086;

    /* JADX INFO: renamed from: ۙ */
    public int f31087;

    /* JADX INFO: renamed from: ۛ */
    public boolean f31088;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f31089;

    /* JADX INFO: renamed from: ۟ */
    public final Handler f31090;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C2003 f31091;

    /* JADX INFO: renamed from: ۢ֫ */
    public final RunnableC1863 f31092;

    /* JADX INFO: renamed from: ۤ */
    public int f31093;

    /* JADX INFO: renamed from: ۧ֫ */
    public AdapterView.OnItemClickListener f31094;

    /* JADX INFO: renamed from: ۨ */
    public int f31095;

    /* JADX INFO: renamed from: ۫ */
    public C1462 f31096;

    /* JADX INFO: renamed from: ۬ */
    public int f31097;

    /* JADX INFO: renamed from: ܰ */
    public Rect f31098;

    /* JADX INFO: renamed from: ܳ֫ */
    public DataSetObserver f31099;

    /* JADX INFO: renamed from: ܺ֫ */
    public final Rect f31100;

    /* JADX INFO: renamed from: ܽ֫ */
    public AdapterView.OnItemSelectedListener f31101;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f31102;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f31103;

    /* JADX INFO: renamed from: ᩶ */
    public View f31104;

    /* JADX INFO: renamed from: ᩷֫ */
    public PopupWindow f31105;

    /* JADX INFO: renamed from: ᩸ */
    public ListAdapter f31106;

    /* JADX INFO: renamed from: ᩹ */
    public Context f31107;

    /* JADX INFO: renamed from: ᩺ */
    public int f31108;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f31109;

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f31082 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f31083 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f31081 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C1303(Context context) {
        this(context, null, R.attr.MT_Protector);
    }

    public C1303(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1303(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C1303(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f31086 = -2;
        this.f31095 = -2;
        this.f31108 = C0215b.f1000c;
        this.f31087 = 0;
        this.f31103 = Integer.MAX_VALUE;
        this.f31092 = new RunnableC1863(this);
        this.f31085 = new ViewOnTouchListenerC1163(this);
        this.f31091 = new C2003(this);
        this.f31084 = new RunnableC1688(this);
        this.f31100 = new Rect();
        this.f31107 = context;
        this.f31090 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1010.f13501, i, 0);
        this.f31097 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f31093 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f31088 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1557 c1557 = new C1557(context, attributeSet, i, 0);
        this.f31105 = c1557;
        c1557.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4052(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f31099;
        if (dataSetObserver == null) {
            this.f31099 = new C1548(this);
        } else {
            ListAdapter listAdapter2 = this.f31106;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f31106 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f31099);
        }
        C1462 c1462 = this.f31096;
        if (c1462 != null) {
            c1462.setAdapter(this.f31106);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m25844() {
        this.f31102 = true;
        this.f31105.setFocusable(true);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m25848() {
        return this.f31102;
    }

    public final Drawable getBackground() {
        return this.f31105.getBackground();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f31105.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m25847() {
        this.f31105.setAnimationStyle(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25840(View view) {
        this.f31104 = view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25837() {
        return this.f31097;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25838(int i) {
        this.f31097 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m25852() {
        if (this.f31088) {
            return this.f31093;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25849(int i) {
        this.f31093 = i;
        this.f31088 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25839(Rect rect) {
        this.f31098 = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m25854(int i) {
        this.f31087 = i;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m25856() {
        return this.f31095;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25855(int i) {
        Drawable background = this.f31105.getBackground();
        if (background == null) {
            this.f31095 = i;
            return;
        }
        Rect rect = this.f31100;
        background.getPadding(rect);
        this.f31095 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25841(AdapterView.OnItemClickListener onItemClickListener) {
        this.f31094 = onItemClickListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25842(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f31101 = onItemSelectedListener;
    }

    @Override // p067l.InterfaceC1329
    public final void dismiss() {
        PopupWindow popupWindow = this.f31105;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f31096 = null;
        this.f31090.removeCallbacks(this.f31092);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25843(PopupWindow.OnDismissListener onDismissListener) {
        this.f31105.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m25851() {
        this.f31105.setInputMethodMode(2);
    }

    @Override // p067l.InterfaceC1329
    public final boolean isShowing() {
        return this.f31105.isShowing();
    }

    /* JADX INFO: renamed from: ۜ */
    public final View m25846() {
        if (this.f31105.isShowing()) {
            return this.f31096.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m25850() {
        if (this.f31105.isShowing()) {
            return this.f31096.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m25853() {
        if (this.f31105.isShowing()) {
            return this.f31096.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m25857() {
        if (this.f31105.isShowing()) {
            return this.f31096.getSelectedItemPosition();
        }
        return -1;
    }

    @Override // p067l.InterfaceC1329
    /* JADX INFO: renamed from: ᩳ */
    public final ListView mo10603() {
        return this.f31096;
    }

    /* JADX INFO: renamed from: ֫ */
    public C1462 mo3513(Context context, boolean z) {
        return new C1462(context, z);
    }

    @Override // p067l.InterfaceC1329
    public final void show() {
        int i;
        int iM40706;
        int iMakeMeasureSpec;
        int paddingBottom;
        C1462 c1462;
        C1462 c1463 = this.f31096;
        Context context = this.f31107;
        PopupWindow popupWindow = this.f31105;
        if (c1463 == null) {
            C1462 c1462Mo3513 = mo3513(context, !this.f31102);
            this.f31096 = c1462Mo3513;
            c1462Mo3513.setAdapter(this.f31106);
            this.f31096.setOnItemClickListener(this.f31094);
            this.f31096.setFocusable(true);
            this.f31096.setFocusableInTouchMode(true);
            this.f31096.setOnItemSelectedListener(new C1373(this));
            this.f31096.setOnScrollListener(this.f31091);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f31101;
            if (onItemSelectedListener != null) {
                this.f31096.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f31096);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f31100;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f31088) {
                this.f31093 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        View view = this.f31104;
        int i3 = this.f31093;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f31081;
            if (method != null) {
                try {
                    iM40706 = ((Integer) method.invoke(popupWindow, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    iM40706 = popupWindow.getMaxAvailableHeight(view, i3);
                }
            } else {
                iM40706 = popupWindow.getMaxAvailableHeight(view, i3);
            }
        } else {
            iM40706 = C1653.m40706(popupWindow, view, i3, z);
        }
        int i4 = this.f31086;
        if (i4 == -1) {
            paddingBottom = iM40706 + i;
        } else {
            int i5 = this.f31095;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iMo24264 = this.f31096.mo24264(iMakeMeasureSpec, iM40706);
            paddingBottom = iMo24264 + (iMo24264 > 0 ? this.f31096.getPaddingBottom() + this.f31096.getPaddingTop() + i : 0);
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        C3129.m5336(popupWindow, this.f31108);
        if (popupWindow.isShowing()) {
            if (this.f31104.isAttachedToWindow()) {
                int width = this.f31095;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f31104.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f31095 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f31095 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.f31104;
                int i6 = this.f31097;
                int i7 = this.f31093;
                int i8 = width < 0 ? -1 : width;
                if (i4 < 0) {
                    i4 = -1;
                }
                popupWindow.update(view2, i6, i7, i8, i4);
                return;
            }
            return;
        }
        int width2 = this.f31095;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f31104.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f31082;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            C1723.m43823(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f31085);
        if (this.f31089) {
            C3129.m5337(popupWindow, this.f31109);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f31083;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.f31098);
                } catch (Exception unused3) {
                }
            }
        } else {
            C1723.m43822(popupWindow, this.f31098);
        }
        popupWindow.showAsDropDown(this.f31104, this.f31097, this.f31093, this.f31087);
        this.f31096.setSelection(-1);
        if ((!this.f31102 || this.f31096.isInTouchMode()) && (c1462 = this.f31096) != null) {
            c1462.m32745(true);
            c1462.requestLayout();
        }
        if (this.f31102) {
            return;
        }
        this.f31090.post(this.f31084);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m25845() {
        this.f31089 = true;
        this.f31109 = true;
    }
}
