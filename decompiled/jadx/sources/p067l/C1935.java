package p067l;

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
import bin.p000mt.plus.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩹ۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public class C1935 extends C0918 implements InterfaceC1508 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final C0850 f73308;

    /* JADX INFO: renamed from: ֫֫ */
    public final ImageView f73309;

    /* JADX INFO: renamed from: ۖ֫ */
    public CharSequence f73310;

    /* JADX INFO: renamed from: ۗ */
    public final CharSequence f73311;

    /* JADX INFO: renamed from: ۘ֫ */
    public final ImageView f73312;

    /* JADX INFO: renamed from: ۙ */
    public int f73313;

    /* JADX INFO: renamed from: ۛ */
    public boolean f73314;

    /* JADX INFO: renamed from: ۜ֫ */
    public final View f73315;

    /* JADX INFO: renamed from: ۟ */
    public Runnable f73316;

    /* JADX INFO: renamed from: ۡ֫ */
    public C1900 f73317;

    /* JADX INFO: renamed from: ۢ֫ */
    public int[] f73318;

    /* JADX INFO: renamed from: ۤ */
    public final ImageView f73319;

    /* JADX INFO: renamed from: ۧ֫ */
    public final View f73320;

    /* JADX INFO: renamed from: ۨ */
    public boolean f73321;

    /* JADX INFO: renamed from: ۫ */
    public boolean f73322;

    /* JADX INFO: renamed from: ۬ */
    public final View f73323;

    /* JADX INFO: renamed from: ܰ */
    public CharSequence f73324;

    /* JADX INFO: renamed from: ܳ֫ */
    public Rect f73325;

    /* JADX INFO: renamed from: ܺ֫ */
    public final Runnable f73326;

    /* JADX INFO: renamed from: ܽ֫ */
    public final Drawable f73327;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C1585 f73328;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final View f73329;

    /* JADX INFO: renamed from: ᩶ */
    public final ImageView f73330;

    /* JADX INFO: renamed from: ᩷֫ */
    public int[] f73331;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f73332;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f73333;

    /* JADX INFO: renamed from: ᩺ */
    public int f73334;

    /* JADX INFO: renamed from: ᩻֫ */
    public Rect f73335;

    static {
        f73308 = Build.VERSION.SDK_INT < 29 ? new C0850() : null;
    }

    public C1935(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1935(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73325 = new Rect();
        this.f73335 = new Rect();
        this.f73331 = new int[2];
        this.f73318 = new int[2];
        this.f73326 = new RunnableC2005(this);
        this.f73316 = new RunnableC1165(this);
        new WeakHashMap();
        ViewOnClickListenerC1270 viewOnClickListenerC1270 = new ViewOnClickListenerC1270(this);
        ViewOnKeyListenerC1620 viewOnKeyListenerC1620 = new ViewOnKeyListenerC1620(this);
        C0955 c0955 = new C0955(this);
        C1025 c1025 = new C1025(this);
        C1760 c1760 = new C1760(this);
        C1550 c1550 = new C1550(this);
        int[] iArr = C1010.f13529;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(this, context, iArr, attributeSet, c1970M53129.m53143(), i);
        LayoutInflater.from(context).inflate(c1970M53129.m53139(19, R.layout.MT_Protector), (ViewGroup) this, true);
        C1585 c1585 = (C1585) findViewById(R.id.MT_Protector);
        this.f73328 = c1585;
        c1585.m37610(this);
        this.f73320 = findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f73329 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f73315 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f73309 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f73319 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f73333 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f73312 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f73330 = imageView5;
        viewFindViewById.setBackground(c1970M53129.m53148(20));
        viewFindViewById2.setBackground(c1970M53129.m53148(25));
        imageView.setImageDrawable(c1970M53129.m53148(23));
        imageView2.setImageDrawable(c1970M53129.m53148(15));
        imageView3.setImageDrawable(c1970M53129.m53148(12));
        imageView4.setImageDrawable(c1970M53129.m53148(28));
        imageView5.setImageDrawable(c1970M53129.m53148(23));
        this.f73327 = c1970M53129.m53148(22);
        C1781.m45965(imageView, getResources().getString(R.string.MT_Protector));
        c1970M53129.m53139(26, R.layout.MT_Protector);
        c1970M53129.m53139(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC1270);
        imageView3.setOnClickListener(viewOnClickListenerC1270);
        imageView2.setOnClickListener(viewOnClickListenerC1270);
        imageView4.setOnClickListener(viewOnClickListenerC1270);
        c1585.setOnClickListener(viewOnClickListenerC1270);
        c1585.addTextChangedListener(c1550);
        c1585.setOnEditorActionListener(c0955);
        c1585.setOnItemClickListener(c1025);
        c1585.setOnItemSelectedListener(c1760);
        c1585.setOnKeyListener(viewOnKeyListenerC1620);
        c1585.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1865(this));
        boolean zM53134 = c1970M53129.m53134(18, true);
        if (this.f73321 != zM53134) {
            this.f73321 = zM53134;
            m51900(zM53134);
            m51901();
        }
        int iM53136 = c1970M53129.m53136(2, -1);
        if (iM53136 != -1) {
            this.f73334 = iM53136;
            requestLayout();
        }
        this.f73311 = c1970M53129.m53150(14);
        this.f73324 = c1970M53129.m53150(21);
        int iM53142 = c1970M53129.m53142(6, -1);
        if (iM53142 != -1) {
            c1585.setImeOptions(iM53142);
        }
        int iM53143 = c1970M53129.m53142(5, -1);
        if (iM53143 != -1) {
            c1585.setInputType(iM53143);
        }
        setFocusable(c1970M53129.m53134(1, true));
        c1970M53129.m53146();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View viewFindViewById3 = findViewById(c1585.getDropDownAnchor());
        this.f73323 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1305(this));
        }
        m51900(this.f73321);
        m51901();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f73332 || !isFocusable()) {
            return false;
        }
        if (!this.f73314) {
            boolean zRequestFocus = this.f73328.requestFocus(i, rect);
            if (zRequestFocus) {
                m51900(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f73332 = true;
        super.clearFocus();
        C1585 c1585 = this.f73328;
        c1585.clearFocus();
        c1585.m37611(false);
        this.f73332 = false;
    }

    @Override // p067l.InterfaceC1508
    /* JADX INFO: renamed from: ۧ */
    public final void mo34563() {
        C1585 c1585 = this.f73328;
        c1585.setText("");
        c1585.setSelection(c1585.length());
        this.f73310 = "";
        clearFocus();
        m51900(true);
        c1585.setImeOptions(this.f73313);
        this.f73322 = false;
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
    /* JADX INFO: renamed from: ۢ */
    private void m51901() {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2 = this.f73324;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence = this.f73311;
        }
        if (charSequence3 == null) {
            charSequence3 = charSequence;
            charSequence3 = "";
        }
        charSequence3 = charSequence;
        boolean z = this.f73321;
        C1585 c1585 = this.f73328;
        CharSequence charSequence4 = charSequence3;
        if (z && (drawable = this.f73327) != null) {
            charSequence4 = charSequence3;
            int textSize = (int) (((double) c1585.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence3);
            charSequence4 = spannableStringBuilder;
        }
        charSequence4 = charSequence3;
        c1585.setHint(charSequence4);
    }

    @Override // p067l.C0918, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f73314) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f73334;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector), size);
        } else if (mode == 0) {
            size = this.f73334;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            }
        } else if (mode == 1073741824 && (i3 = this.f73334) > 0) {
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

    /* JADX INFO: renamed from: ᩻ */
    public final void m51909() {
        m51900(this.f73314);
        post(this.f73326);
        C1585 c1585 = this.f73328;
        if (c1585.hasFocus()) {
            if (Build.VERSION.SDK_INT >= 29) {
                C1795.m46567(c1585);
                return;
            }
            C0850 c0850 = f73308;
            c0850.m3664(c1585);
            c0850.m3662((AutoCompleteTextView) c1585);
        }
    }

    @Override // p067l.C0918, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C1585 c1585 = this.f73328;
            int[] iArr = this.f73331;
            c1585.getLocationInWindow(iArr);
            int[] iArr2 = this.f73318;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = c1585.getWidth() + i6;
            int height = c1585.getHeight() + i5;
            Rect rect = this.f73325;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f73335;
            rect2.set(i7, 0, i8, i9);
            C1900 c1900 = this.f73317;
            if (c1900 == null) {
                C1900 c1901 = new C1900(c1585, rect2, rect);
                this.f73317 = c1901;
                setTouchDelegate(c1901);
                return;
            }
            c1900.m50686(rect2, rect);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51900(boolean z) {
        this.f73314 = z;
        int i = z ? 0 : 8;
        TextUtils.isEmpty(this.f73328.getText());
        this.f73309.setVisibility(i);
        this.f73319.setVisibility(8);
        this.f73320.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f73330;
        imageView.setVisibility((imageView.getDrawable() == null || this.f73321) ? 8 : 0);
        m51902();
        this.f73312.setVisibility(8);
        this.f73315.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m51902() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f73328.getText());
        int i = (!zIsEmpty || (this.f73321 && !this.f73322)) ? 0 : 8;
        ImageView imageView = this.f73333;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m51904() {
        int[] iArr = this.f73328.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f73329.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f73315.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f73326);
        post(this.f73316);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51903(CharSequence charSequence) {
        Editable text = this.f73328.getText();
        this.f73310 = text;
        TextUtils.isEmpty(text);
        this.f73319.setVisibility(8);
        this.f73312.setVisibility(8);
        m51902();
        this.f73315.setVisibility(8);
        charSequence.toString();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m51905() {
        C1585 c1585 = this.f73328;
        Editable text = c1585.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        c1585.m37611(false);
        c1585.dismissDropDown();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51908() {
        C1585 c1585 = this.f73328;
        if (TextUtils.isEmpty(c1585.getText())) {
            if (this.f73321) {
                clearFocus();
                m51900(true);
                return;
            }
            return;
        }
        c1585.setText("");
        c1585.requestFocus();
        c1585.m37611(true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m51907() {
        m51900(false);
        C1585 c1585 = this.f73328;
        c1585.requestFocus();
        c1585.m37611(true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f73326);
    }

    @Override // p067l.InterfaceC1508
    /* JADX INFO: renamed from: ֫ */
    public final void mo34562() {
        if (this.f73322) {
            return;
        }
        this.f73322 = true;
        C1585 c1585 = this.f73328;
        int imeOptions = c1585.getImeOptions();
        this.f73313 = imeOptions;
        c1585.setImeOptions(imeOptions | 33554432);
        c1585.setText("");
        m51907();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0885 c0885 = new C0885(super.onSaveInstanceState());
        c0885.f6120 = this.f73314;
        return c0885;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0885)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0885 c0885 = (C0885) parcelable;
        super.onRestoreInstanceState(c0885.getSuperState());
        m51900(c0885.f6120);
        requestLayout();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51906() {
        int i;
        View view = this.f73323;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f73329.getPaddingLeft();
            Rect rect = new Rect();
            int i2 = C1956.f75466;
            boolean z = getLayoutDirection() == 1;
            int dimensionPixelSize = this.f73321 ? resources.getDimensionPixelSize(R.dimen.MT_Protector) + resources.getDimensionPixelSize(R.dimen.MT_Protector) : 0;
            C1585 c1585 = this.f73328;
            c1585.getDropDownBackground().getPadding(rect);
            if (z) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            c1585.setDropDownHorizontalOffset(i);
            c1585.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
