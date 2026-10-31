package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public class C22028 extends C1525 implements InterfaceC13434 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final C0154 f70591;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ImageView f70592;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f70593;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CharSequence f70594;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f70595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70596;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f70597;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final View f70598;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Runnable f70599;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C21323 f70600;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int[] f70601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ImageView f70602;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final View f70603;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f70604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f70605;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f70606;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CharSequence f70607;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public Rect f70608;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f70609;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f70610;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C14971 f70611;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final View f70612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f70613;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int[] f70614;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f70615;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f70616;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f70617;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public Rect f70618;

    static {
        f70591 = Build.VERSION.SDK_INT < 29 ? new C0154() : null;
    }

    public C22028(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C22028(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70608 = new Rect();
        this.f70618 = new Rect();
        this.f70614 = new int[2];
        this.f70601 = new int[2];
        this.f70609 = new RunnableC23438(this);
        this.f70599 = new RunnableC6505(this);
        new WeakHashMap();
        ViewOnClickListenerC8622 viewOnClickListenerC8622 = new ViewOnClickListenerC8622(this);
        ViewOnKeyListenerC15676 viewOnKeyListenerC15676 = new ViewOnKeyListenerC15676(this);
        C2272 c2272 = new C2272(this);
        C3683 c3683 = new C3683(this);
        C18500 c18500 = new C18500(this);
        C14265 c14265 = new C14265(this);
        int[] iArr = C3390.f10722;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, c22733M50796.m50810(), i);
        LayoutInflater.from(context).inflate(c22733M50796.m50806(19, R.layout.MT_Protector), (ViewGroup) this, true);
        C14971 c14971 = (C14971) findViewById(R.id.MT_Protector);
        this.f70611 = c14971;
        c14971.m35454(this);
        this.f70603 = findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f70612 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f70598 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f70592 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f70602 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f70616 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f70595 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f70613 = imageView5;
        viewFindViewById.setBackground(c22733M50796.m50815(20));
        viewFindViewById2.setBackground(c22733M50796.m50815(25));
        imageView.setImageDrawable(c22733M50796.m50815(23));
        imageView2.setImageDrawable(c22733M50796.m50815(15));
        imageView3.setImageDrawable(c22733M50796.m50815(12));
        imageView4.setImageDrawable(c22733M50796.m50815(28));
        imageView5.setImageDrawable(c22733M50796.m50815(23));
        this.f70610 = c22733M50796.m50815(22);
        C18934.m43699(imageView, getResources().getString(R.string.MT_Protector));
        c22733M50796.m50806(26, R.layout.MT_Protector);
        c22733M50796.m50806(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC8622);
        imageView3.setOnClickListener(viewOnClickListenerC8622);
        imageView2.setOnClickListener(viewOnClickListenerC8622);
        imageView4.setOnClickListener(viewOnClickListenerC8622);
        c14971.setOnClickListener(viewOnClickListenerC8622);
        c14971.addTextChangedListener(c14265);
        c14971.setOnEditorActionListener(c2272);
        c14971.setOnItemClickListener(c3683);
        c14971.setOnItemSelectedListener(c18500);
        c14971.setOnKeyListener(viewOnKeyListenerC15676);
        c14971.setOnFocusChangeListener(new ViewOnFocusChangeListenerC20617(this));
        boolean zM50801 = c22733M50796.m50801(18, true);
        if (this.f70604 != zM50801) {
            this.f70604 = zM50801;
            m49564(zM50801);
            m49565();
        }
        int iM50803 = c22733M50796.m50803(2, -1);
        if (iM50803 != -1) {
            this.f70617 = iM50803;
            requestLayout();
        }
        this.f70594 = c22733M50796.m50817(14);
        this.f70607 = c22733M50796.m50817(21);
        int iM50809 = c22733M50796.m50809(6, -1);
        if (iM50809 != -1) {
            c14971.setImeOptions(iM50809);
        }
        int iM508010 = c22733M50796.m50809(5, -1);
        if (iM508010 != -1) {
            c14971.setInputType(iM508010);
        }
        setFocusable(c22733M50796.m50801(1, true));
        c22733M50796.m50813();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View viewFindViewById3 = findViewById(c14971.getDropDownAnchor());
        this.f70606 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9328(this));
        }
        m49564(this.f70604);
        m49565();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f70615 || !isFocusable()) {
            return false;
        }
        if (!this.f70597) {
            boolean zRequestFocus = this.f70611.requestFocus(i, rect);
            if (zRequestFocus) {
                m49564(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f70615 = true;
        super.clearFocus();
        C14971 c14971 = this.f70611;
        c14971.clearFocus();
        c14971.m35455(false);
        this.f70615 = false;
    }

    @Override // l.InterfaceC13434
    /* JADX INFO: renamed from: ۧ */
    public final void mo32461() {
        C14971 c14971 = this.f70611;
        c14971.setText("");
        c14971.setSelection(c14971.length());
        this.f70593 = "";
        clearFocus();
        m49564(true);
        c14971.setImeOptions(this.f70596);
        this.f70605 = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m49565() {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2 = this.f70607;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence = this.f70594;
        }
        if (charSequence3 == null) {
            charSequence3 = charSequence;
            charSequence3 = "";
        }
        charSequence3 = charSequence;
        boolean z = this.f70604;
        C14971 c14971 = this.f70611;
        CharSequence charSequence4 = charSequence3;
        if (z && (drawable = this.f70610) != null) {
            charSequence4 = charSequence3;
            int textSize = (int) (((double) c14971.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence3);
            charSequence4 = spannableStringBuilder;
        }
        charSequence4 = charSequence3;
        c14971.setHint(charSequence4);
    }

    @Override // l.C1525, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f70597) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f70617;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size);
        } else if (mode == 0) {
            size = this.f70617;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            }
        } else if (mode == 1073741824 && (i3 = this.f70617) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49573() {
        m49564(this.f70597);
        post(this.f70609);
        C14971 c14971 = this.f70611;
        if (c14971.hasFocus()) {
            if (Build.VERSION.SDK_INT >= 29) {
                C19206.m44272(c14971);
                return;
            }
            C0154 c0154 = f70591;
            c0154.m1256(c14971);
            c0154.m1254((AutoCompleteTextView) c14971);
        }
    }

    @Override // l.C1525, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C14971 c14971 = this.f70611;
            int[] iArr = this.f70614;
            c14971.getLocationInWindow(iArr);
            int[] iArr2 = this.f70601;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = c14971.getWidth() + i6;
            int height = c14971.getHeight() + i5;
            Rect rect = this.f70608;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f70618;
            rect2.set(i7, 0, i8, i9);
            C21323 c21323 = this.f70600;
            if (c21323 == null) {
                C21323 c21324 = new C21323(c14971, rect2, rect);
                this.f70600 = c21324;
                setTouchDelegate(c21324);
                return;
            }
            c21323.m48351(rect2, rect);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49564(boolean z) {
        this.f70597 = z;
        int i = z ? 0 : 8;
        TextUtils.isEmpty(this.f70611.getText());
        this.f70592.setVisibility(i);
        this.f70602.setVisibility(8);
        this.f70603.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f70613;
        imageView.setVisibility((imageView.getDrawable() == null || this.f70604) ? 8 : 0);
        m49566();
        this.f70595.setVisibility(8);
        this.f70598.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49566() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f70611.getText());
        int i = (!zIsEmpty || (this.f70604 && !this.f70605)) ? 0 : 8;
        ImageView imageView = this.f70616;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m49568() {
        int[] iArr = this.f70611.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f70612.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f70598.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f70609);
        post(this.f70599);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49567(CharSequence charSequence) {
        Editable text = this.f70611.getText();
        this.f70593 = text;
        TextUtils.isEmpty(text);
        this.f70602.setVisibility(8);
        this.f70595.setVisibility(8);
        m49566();
        this.f70598.setVisibility(8);
        charSequence.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49569() {
        C14971 c14971 = this.f70611;
        Editable text = c14971.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        c14971.m35455(false);
        c14971.dismissDropDown();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49572() {
        C14971 c14971 = this.f70611;
        if (TextUtils.isEmpty(c14971.getText())) {
            if (this.f70604) {
                clearFocus();
                m49564(true);
                return;
            }
            return;
        }
        c14971.setText("");
        c14971.requestFocus();
        c14971.m35455(true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49571() {
        m49564(false);
        C14971 c14971 = this.f70611;
        c14971.requestFocus();
        c14971.m35455(true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f70609);
    }

    @Override // l.InterfaceC13434
    /* JADX INFO: renamed from: ֫ */
    public final void mo32460() {
        if (this.f70605) {
            return;
        }
        this.f70605 = true;
        C14971 c14971 = this.f70611;
        int imeOptions = c14971.getImeOptions();
        this.f70596 = imeOptions;
        c14971.setImeOptions(imeOptions | 33554432);
        c14971.setText("");
        m49571();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0860 c0860 = new C0860(super.onSaveInstanceState());
        c0860.f3347 = this.f70597;
        return c0860;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0860)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0860 c0860 = (C0860) parcelable;
        super.onRestoreInstanceState(c0860.getSuperState());
        m49564(c0860.f3347);
        requestLayout();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49570() {
        int i;
        View view = this.f70606;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f70612.getPaddingLeft();
            Rect rect = new Rect();
            int i2 = C22461.f72738;
            boolean z = getLayoutDirection() == 1;
            int dimensionPixelSize = this.f70604 ? resources.getDimensionPixelSize(R.dimen.MT_Protector) + resources.getDimensionPixelSize(R.dimen.MT_Protector) : 0;
            C14971 c14971 = this.f70611;
            c14971.getDropDownBackground().getPadding(rect);
            if (z) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            c14971.setDropDownHorizontalOffset(i);
            c14971.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
