package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes3.dex */
public class C8082 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f24891;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5260 f24892;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f24893;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9287 f24894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f24895;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FrameLayout f24896;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0320 f24897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f24898;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Drawable f24899;

    public C8082(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8082(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C15842(this);
        this.f24893 = new ViewTreeObserverOnGlobalLayoutListenerC2438(this);
        int[] iArr = C3390.f10715;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ViewOnClickListenerC5260 viewOnClickListenerC5260 = new ViewOnClickListenerC5260(this);
        this.f24892 = viewOnClickListenerC5260;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f24898 = viewFindViewById;
        this.f24899 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f24891 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC5260);
        frameLayout.setOnLongClickListener(viewOnClickListenerC5260);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.MT_Protector);
        frameLayout2.setOnClickListener(viewOnClickListenerC5260);
        frameLayout2.setAccessibilityDelegate(new C3849());
        frameLayout2.setOnTouchListener(new C18666(this, frameLayout2));
        this.f24896 = frameLayout2;
        ((ImageView) frameLayout2.findViewById(R.id.MT_Protector)).setImageDrawable(drawable);
        C0320 c0320 = new C0320(this);
        this.f24897 = c0320;
        c0320.registerDataSetObserver(new C19372(this));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21446() {
        if (m21447().f28156.isShowing()) {
            m21447().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f24893);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21448() {
        if (m21447().f28156.isShowing() || !this.f24895) {
            return;
        }
        this.f24897.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24897.getClass();
        this.f24895 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24897.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f24893);
        }
        if (m21447().f28156.isShowing()) {
            m21446();
        }
        this.f24895 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f24891.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.f24898;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f24898.layout(0, 0, i3 - i, i4 - i2);
        if (m21447().f28156.isShowing()) {
            return;
        }
        m21446();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9287 m21447() {
        if (this.f24894 == null) {
            C9287 c9287 = new C9287(getContext());
            this.f24894 = c9287;
            c9287.mo1654(this.f24897);
            this.f24894.m23831(this);
            this.f24894.m23835();
            C9287 c9288 = this.f24894;
            ViewOnClickListenerC5260 viewOnClickListenerC5260 = this.f24892;
            c9288.m23832((AdapterView.OnItemClickListener) viewOnClickListenerC5260);
            this.f24894.m23834((PopupWindow.OnDismissListener) viewOnClickListenerC5260);
        }
        return this.f24894;
    }
}
