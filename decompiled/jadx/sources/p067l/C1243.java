package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۢ */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes3.dex */
public class C1243 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ */
    public final FrameLayout f27802;

    /* JADX INFO: renamed from: ۙ */
    public final ViewOnClickListenerC1103 f27803;

    /* JADX INFO: renamed from: ۛ */
    public final ViewTreeObserver.OnGlobalLayoutListener f27804;

    /* JADX INFO: renamed from: ۤ */
    public C1303 f27805;

    /* JADX INFO: renamed from: ۫ */
    public boolean f27806;

    /* JADX INFO: renamed from: ۬ */
    public final FrameLayout f27807;

    /* JADX INFO: renamed from: ᩶ */
    public final C0858 f27808;

    /* JADX INFO: renamed from: ᩸ */
    public final View f27809;

    /* JADX INFO: renamed from: ᩹ */
    public final Drawable f27810;

    public C1243(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1243(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C1628(this);
        this.f27804 = new ViewTreeObserverOnGlobalLayoutListenerC0963(this);
        int[] iArr = C1010.f13522;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1717.m43548(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ViewOnClickListenerC1103 viewOnClickListenerC1103 = new ViewOnClickListenerC1103(this);
        this.f27803 = viewOnClickListenerC1103;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f27809 = viewFindViewById;
        this.f27810 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f27802 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC1103);
        frameLayout.setOnLongClickListener(viewOnClickListenerC1103);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.MT_Protector);
        frameLayout2.setOnClickListener(viewOnClickListenerC1103);
        frameLayout2.setAccessibilityDelegate(new C1033());
        frameLayout2.setOnTouchListener(new C1768(this, frameLayout2));
        this.f27807 = frameLayout2;
        ((ImageView) frameLayout2.findViewById(R.id.MT_Protector)).setImageDrawable(drawable);
        C0858 c0858 = new C0858(this);
        this.f27808 = c0858;
        c0858.registerDataSetObserver(new C1803(this));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23414() {
        if (m23415().f31105.isShowing()) {
            m23415().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f27804);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23416() {
        if (m23415().f31105.isShowing() || !this.f27806) {
            return;
        }
        this.f27808.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27808.getClass();
        this.f27806 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27808.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f27804);
        }
        if (m23415().f31105.isShowing()) {
            m23414();
        }
        this.f27806 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f27802.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.f27809;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f27809.layout(0, 0, i3 - i, i4 - i2);
        if (m23415().f31105.isShowing()) {
            return;
        }
        m23414();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1303 m23415() {
        if (this.f27805 == null) {
            C1303 c1303 = new C1303(getContext());
            this.f27805 = c1303;
            c1303.mo4052(this.f27808);
            this.f27805.m25840(this);
            this.f27805.m25844();
            C1303 c1304 = this.f27805;
            ViewOnClickListenerC1103 viewOnClickListenerC1103 = this.f27803;
            c1304.m25841((AdapterView.OnItemClickListener) viewOnClickListenerC1103);
            this.f27805.m25843((PopupWindow.OnDismissListener) viewOnClickListenerC1103);
        }
        return this.f27805;
    }
}
