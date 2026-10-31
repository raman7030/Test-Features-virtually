package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes.dex */
public class C23592 extends LinearLayout {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76481 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC17242 f76482;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76483;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f76484;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15124 f76485;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f76486;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ImageView f76487;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f76488;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public SparseArray f76489;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f76490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76491;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f76492;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f76493;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final View f76494;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public C23592(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C23592(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76488 = "";
        this.f76491 = false;
        this.f76483 = true;
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f76487 = imageView;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f76494 = viewFindViewById;
        this.f76490 = (ImageView) findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f76493 = imageView2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.hint, android.R.attr.text});
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null) {
            this.f76486 = text.toString();
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(1);
        if (text2 != null) {
            this.f76488 = TextUtils.stringOrSpannedString(text2);
            this.f76483 = text2.length() == 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView.setOnClickListener(new ViewOnClickListenerC10893(0, this));
        imageView2.setOnClickListener(new ViewOnClickListenerC16536(0, this));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۢۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23592.m52041(this.f41011);
            }
        });
        m52053();
        if (!this.f76483) {
            m52044();
        }
        m52045();
        m52048(false);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m52044() {
        if (this.f76485 != null) {
            return;
        }
        this.f76484 = true;
        try {
            this.f76485 = (C15124) ((ViewStub) findViewById(R.id.MT_Protector)).inflate();
            m52051();
            this.f76485.m30477(this.f76486);
            m52046();
        } finally {
            this.f76484 = false;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m52046() {
        SparseArray<Parcelable> sparseArray = this.f76489;
        if (sparseArray != null) {
            this.f76485.restoreHierarchyState(sparseArray);
            this.f76489 = null;
        } else {
            this.f76485.mo25910(this.f76488);
            C15124 c15124 = this.f76485;
            c15124.mo25919(c15124.m30526());
        }
        this.f76488 = "";
        m52052();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52051() {
        this.f76485.setBackground(null);
        this.f76485.m25926(524289);
        this.f76485.m25894(true);
        this.f76485.m25924(3);
        this.f76485.m35828(new C7385(0, this));
        this.f76485.setOnKeyListener(new View.OnKeyListener() { // from class: l.֫ۡۡ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C23592.m52043(this.f5956, i, keyEvent);
            }
        });
        this.f76485.m30313(new C17948(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m52042(C23592 c23592, int i) {
        InterfaceC17242 interfaceC17242;
        if ((i != 3 && i != 6 && i != 5 && i != 0) || (interfaceC17242 = c23592.f76482) == null) {
            return false;
        }
        interfaceC17242.mo4109(c23592.m52060().toString());
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m52043(C23592 c23592, int i, KeyEvent keyEvent) {
        InterfaceC17242 interfaceC17242;
        if (keyEvent.getAction() != 0 || i != 66 || (interfaceC17242 = c23592.f76482) == null) {
            return false;
        }
        interfaceC17242.mo4109(c23592.m52060().toString());
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52053() {
        ColorStateList colorStateListM48207 = C21238.m48207(getContext().getTheme(), android.R.attr.colorControlNormal);
        int defaultColor = C21238.m48207(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor();
        this.f76487.setImageTintList(colorStateListM48207);
        this.f76490.setImageTintList(colorStateListM48207);
        this.f76493.setImageTintList(colorStateListM48207);
        m52052();
        View view = this.f76494;
        Drawable background = view.getBackground();
        if (background != null) {
            Drawable drawableM21684 = C8184.m21684(background.mutate());
            C8184.m21676(drawableM21684, ColorStateList.valueOf(defaultColor));
            view.setBackground(drawableM21684);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52052() {
        if (this.f76485 == null) {
            return;
        }
        this.f76485.m25912(C21238.m48207(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor());
        this.f76485.mo25918();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52056(boolean z) {
        this.f76491 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m52059() {
        return this.f76491;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52055(InterfaceC17242 interfaceC17242) {
        this.f76482 = interfaceC17242;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52054(String str) {
        InterfaceC17242 interfaceC17242;
        if (str == null) {
            str = "";
        }
        C15124 c15124 = this.f76485;
        if (c15124 == null) {
            boolean z = (this.f76488.length() == 0 && str.length() == 0) ? false : true;
            this.f76488 = TextUtils.stringOrSpannedString(str);
            this.f76489 = null;
            m52045();
            if (!z || (interfaceC17242 = this.f76482) == null) {
                return;
            }
            interfaceC17242.mo4107(this.f76488.toString());
            return;
        }
        c15124.mo25910((CharSequence) str);
        C15124 c15125 = this.f76485;
        c15125.mo25919(c15125.m30436().length());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m52060() {
        C15124 c15124 = this.f76485;
        return c15124 == null ? this.f76488 : c15124.m30436();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52058(boolean z) {
        boolean z2;
        InterfaceC17242 interfaceC17242;
        m52044();
        boolean z3 = true;
        if (getVisibility() != 0) {
            setVisibility(0);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f76483) {
            this.f76483 = false;
            m52048(true);
        } else {
            z3 = z2;
        }
        if (z3 && (interfaceC17242 = this.f76482) != null) {
            interfaceC17242.mo4108(EnumC14419.EXPANDED);
        }
        C15124 c15124 = this.f76485;
        if (c15124 != null) {
            c15124.requestFocus();
            C15124 c15125 = this.f76485;
            c15125.mo25919(c15125.m30436().length());
        }
        if (z) {
            C4925.m14334(this.f76485);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52062() {
        if (getVisibility() != 8) {
            clearFocus();
            setVisibility(8);
            InterfaceC17242 interfaceC17242 = this.f76482;
            if (interfaceC17242 != null) {
                interfaceC17242.mo4108(EnumC14419.HIDDEN);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52057() {
        if (!this.f76491) {
            if (this.f76483) {
                return;
            }
            this.f76483 = true;
            m52048(true);
            clearFocus();
            InterfaceC17242 interfaceC17242 = this.f76482;
            if (interfaceC17242 != null) {
                interfaceC17242.mo4108(EnumC14419.COLLAPSED);
                return;
            }
            return;
        }
        m52062();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m52061() {
        return getVisibility() == 0 && !this.f76483;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f76483 && getVisibility() != 8) {
            int mode = View.MeasureSpec.getMode(i);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(dimensionPixelSize, View.MeasureSpec.getSize(i)), 1073741824);
            } else if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
            }
        }
        super.onMeasure(i, i2);
        if (this.f76483 || getVisibility() == 8) {
            return;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        int measuredHeight = getMeasuredHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(Math.max(dimensionPixelSize2, measuredHeight), size);
        } else if (mode2 != 1073741824) {
            size = Math.max(dimensionPixelSize2, measuredHeight);
        }
        if (size != measuredHeight) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f76492 = true;
        super.clearFocus();
        C15124 c15124 = this.f76485;
        if (c15124 != null) {
            c15124.clearFocus();
            this.f76485.m30376();
        }
        this.f76492 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        C15124 c15124;
        if (this.f76492) {
            return false;
        }
        if (this.f76483 || (c15124 = this.f76485) == null || !c15124.requestFocus(i, rect)) {
            return super.requestFocus(i, rect);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52041(C23592 c23592) {
        C15124 c15124 = c23592.f76485;
        if (c15124 == null) {
            return;
        }
        c15124.requestFocus();
        C15124 c15125 = c23592.f76485;
        c15125.mo25919(c15125.m30436().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void m52045() {
        this.f76490.setVisibility(!this.f76483 && m52060().length() == 0 && TextUtils.isEmpty(this.f76486) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m52048(boolean z) {
        this.f76487.setVisibility(this.f76483 ? 0 : 8);
        this.f76494.setVisibility(this.f76483 ? 8 : 0);
        m52045();
        if (z) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putCharSequence("query", TextUtils.stringOrSpannedString(m52060()));
        SparseArray<Parcelable> sparseArray = this.f76489;
        if (this.f76485 != null) {
            sparseArray = new SparseArray<>();
            this.f76485.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("editor", sparseArray);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        this.f76488 = bundle.getCharSequence("query", "");
        this.f76489 = bundle.getSparseParcelableArray("editor");
        if (this.f76485 != null) {
            this.f76484 = true;
            try {
                m52046();
                this.f76484 = false;
            } catch (Throwable th) {
                this.f76484 = false;
                throw th;
            }
        } else if (m52061()) {
            m52044();
        }
        m52048(true);
    }
}
