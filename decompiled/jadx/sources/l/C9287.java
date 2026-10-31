package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public class C9287 implements InterfaceC9825 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static Method f28132;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static Method f28133;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static Method f28134;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final RunnableC17047 f28135;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC6464 f28136;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f28137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28138;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f28139;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f28140;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Handler f28141;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C23397 f28142;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC20576 f28143;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28144;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemClickListener f28145;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28146;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12499 f28147;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f28148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Rect f28149;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public DataSetObserver f28150;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final Rect f28151;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemSelectedListener f28152;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f28153;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f28154;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f28155;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public PopupWindow f28156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ListAdapter f28157;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Context f28158;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f28159;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f28160;

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f28133 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f28134 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f28132 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C9287(Context context) {
        this(context, null, R.attr.MT_Protector);
    }

    public C9287(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C9287(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C9287(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f28137 = -2;
        this.f28146 = -2;
        this.f28159 = b.c;
        this.f28138 = 0;
        this.f28154 = Integer.MAX_VALUE;
        this.f28143 = new RunnableC20576(this);
        this.f28136 = new ViewOnTouchListenerC6464(this);
        this.f28142 = new C23397(this);
        this.f28135 = new RunnableC17047(this);
        this.f28151 = new Rect();
        this.f28158 = context;
        this.f28141 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10694, i, 0);
        this.f28148 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f28144 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f28139 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C14410 c14410 = new C14410(context, attributeSet, i, 0);
        this.f28156 = c14410;
        c14410.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1654(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f28150;
        if (dataSetObserver == null) {
            this.f28150 = new C14224(this);
        } else {
            ListAdapter listAdapter2 = this.f28157;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f28157 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f28150);
        }
        C12499 c12499 = this.f28147;
        if (c12499 != null) {
            c12499.setAdapter(this.f28157);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23835() {
        this.f28153 = true;
        this.f28156.setFocusable(true);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m23839() {
        return this.f28153;
    }

    public final Drawable getBackground() {
        return this.f28156.getBackground();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f28156.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m23838() {
        this.f28156.setAnimationStyle(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23831(View view) {
        this.f28155 = view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23828() {
        return this.f28148;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23829(int i) {
        this.f28148 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23843() {
        if (this.f28139) {
            return this.f28144;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23840(int i) {
        this.f28144 = i;
        this.f28139 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23830(Rect rect) {
        this.f28149 = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m23845(int i) {
        this.f28138 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23847() {
        return this.f28146;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23846(int i) {
        Drawable background = this.f28156.getBackground();
        if (background == null) {
            this.f28146 = i;
            return;
        }
        Rect rect = this.f28151;
        background.getPadding(rect);
        this.f28146 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23832(AdapterView.OnItemClickListener onItemClickListener) {
        this.f28145 = onItemClickListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23833(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f28152 = onItemSelectedListener;
    }

    @Override // l.InterfaceC9825
    public final void dismiss() {
        PopupWindow popupWindow = this.f28156;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f28147 = null;
        this.f28141.removeCallbacks(this.f28143);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23834(PopupWindow.OnDismissListener onDismissListener) {
        this.f28156.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m23842() {
        this.f28156.setInputMethodMode(2);
    }

    @Override // l.InterfaceC9825
    public final boolean isShowing() {
        return this.f28156.isShowing();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final View m23837() {
        if (this.f28156.isShowing()) {
            return this.f28147.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m23841() {
        if (this.f28156.isShowing()) {
            return this.f28147.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m23844() {
        if (this.f28156.isShowing()) {
            return this.f28147.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m23848() {
        if (this.f28156.isShowing()) {
            return this.f28147.getSelectedItemPosition();
        }
        return -1;
    }

    @Override // l.InterfaceC9825
    /* JADX INFO: renamed from: ᩳ */
    public final ListView mo8540() {
        return this.f28147;
    }

    /* JADX INFO: renamed from: ֫ */
    public C12499 mo1112(Context context, boolean z) {
        return new C12499(context, z);
    }

    @Override // l.InterfaceC9825
    public final void show() {
        int i;
        int iM38490;
        int iMakeMeasureSpec;
        int paddingBottom;
        C12499 c12499;
        C12499 c124910 = this.f28147;
        Context context = this.f28158;
        PopupWindow popupWindow = this.f28156;
        if (c124910 == null) {
            C12499 c12499Mo1112 = mo1112(context, !this.f28153);
            this.f28147 = c12499Mo1112;
            c12499Mo1112.setAdapter(this.f28157);
            this.f28147.setOnItemClickListener(this.f28145);
            this.f28147.setFocusable(true);
            this.f28147.setFocusableInTouchMode(true);
            this.f28147.setOnItemSelectedListener(new C10698(this));
            this.f28147.setOnScrollListener(this.f28142);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f28152;
            if (onItemSelectedListener != null) {
                this.f28147.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f28147);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f28151;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f28139) {
                this.f28144 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        View view = this.f28155;
        int i3 = this.f28144;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f28132;
            if (method != null) {
                try {
                    iM38490 = ((Integer) method.invoke(popupWindow, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    iM38490 = popupWindow.getMaxAvailableHeight(view, i3);
                }
            } else {
                iM38490 = popupWindow.getMaxAvailableHeight(view, i3);
            }
        } else {
            iM38490 = C16341.m38490(popupWindow, view, i3, z);
        }
        int i4 = this.f28137;
        if (i4 == -1) {
            paddingBottom = iM38490 + i;
        } else {
            int i5 = this.f28146;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iMo22295 = this.f28147.mo22295(iMakeMeasureSpec, iM38490);
            paddingBottom = iMo22295 + (iMo22295 > 0 ? this.f28147.getPaddingBottom() + this.f28147.getPaddingTop() + i : 0);
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        C0801.m3023(popupWindow, this.f28159);
        if (popupWindow.isShowing()) {
            if (this.f28155.isAttachedToWindow()) {
                int width = this.f28146;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f28155.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f28146 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f28146 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.f28155;
                int i6 = this.f28148;
                int i7 = this.f28144;
                int i8 = width < 0 ? -1 : width;
                if (i4 < 0) {
                    i4 = -1;
                }
                popupWindow.update(view2, i6, i7, i8, i4);
                return;
            }
            return;
        }
        int width2 = this.f28146;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f28155.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f28133;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            C17753.m41578(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f28136);
        if (this.f28140) {
            C0801.m3024(popupWindow, this.f28160);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f28134;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.f28149);
                } catch (Exception unused3) {
                }
            }
        } else {
            C17753.m41577(popupWindow, this.f28149);
        }
        popupWindow.showAsDropDown(this.f28155, this.f28148, this.f28144, this.f28138);
        this.f28147.setSelection(-1);
        if ((!this.f28153 || this.f28147.isInTouchMode()) && (c12499 = this.f28147) != null) {
            c12499.m30670(true);
            c12499.requestLayout();
        }
        if (this.f28153) {
            return;
        }
        this.f28141.post(this.f28135);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m23836() {
        this.f28140 = true;
        this.f28160 = true;
    }
}
