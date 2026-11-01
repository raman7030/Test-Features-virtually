package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes.dex */
public class C24790 extends LinearLayout {

    /* JADX INFO: renamed from: ֫֫ */
    public static final /* synthetic */ int f79226 = 0;

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC18755 f79227;

    /* JADX INFO: renamed from: ۙ */
    public boolean f79228;

    /* JADX INFO: renamed from: ۛ */
    public boolean f79229;

    /* JADX INFO: renamed from: ۟ */
    public C16742 f79230;

    /* JADX INFO: renamed from: ۤ */
    public String f79231;

    /* JADX INFO: renamed from: ۨ */
    public final ImageView f79232;

    /* JADX INFO: renamed from: ۫ */
    public CharSequence f79233;

    /* JADX INFO: renamed from: ۬ */
    public SparseArray f79234;

    /* JADX INFO: renamed from: ܰ */
    public final ImageView f79235;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f79236;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f79237;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f79238;

    /* JADX INFO: renamed from: ᩺ */
    public final View f79239;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public C24790(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C24790(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79233 = "";
        this.f79236 = false;
        this.f79228 = true;
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f79232 = imageView;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f79239 = viewFindViewById;
        this.f79235 = (ImageView) findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f79238 = imageView2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.hint, android.R.attr.text});
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null) {
            this.f79231 = text.toString();
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(1);
        if (text2 != null) {
            this.f79233 = TextUtils.stringOrSpannedString(text2);
            this.f79228 = text2.length() == 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView.setOnClickListener(new ViewOnClickListenerC12721(0, this));
        imageView2.setOnClickListener(new ViewOnClickListenerC18084(0, this));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۢۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24790.m54444(this.f44090);
            }
        });
        m54456();
        if (!this.f79228) {
            m54447();
        }
        m54448();
        m54451(false);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m54447() {
        if (this.f79230 != null) {
            return;
        }
        this.f79229 = true;
        try {
            this.f79230 = (C16742) ((ViewStub) findViewById(R.id.MT_Protector)).inflate();
            m54454();
            this.f79230.m32541(this.f79231);
            m54449();
        } finally {
            this.f79229 = false;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private void m54449() {
        SparseArray<Parcelable> sparseArray = this.f79234;
        if (sparseArray != null) {
            this.f79230.restoreHierarchyState(sparseArray);
            this.f79234 = null;
        } else {
            this.f79230.mo27932(this.f79233);
            C16742 c16742 = this.f79230;
            c16742.mo27941(c16742.m32590());
        }
        this.f79233 = "";
        m54455();
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m54454() {
        this.f79230.setBackground(null);
        this.f79230.m27948(524289);
        this.f79230.m27916(true);
        this.f79230.m27946(3);
        this.f79230.m37986(new C9387(0, this));
        this.f79230.setOnKeyListener(new View.OnKeyListener() { // from class: l.֫ۡۡ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return C24790.m54446(this.f8734, i, keyEvent);
            }
        });
        this.f79230.m32377(new C19426(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m54445(C24790 c24790, int i) {
        InterfaceC18755 interfaceC18755;
        if ((i != 3 && i != 6 && i != 5 && i != 0) || (interfaceC18755 = c24790.f79227) == null) {
            return false;
        }
        interfaceC18755.mo6353(c24790.m54463().toString());
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m54446(C24790 c24790, int i, KeyEvent keyEvent) {
        InterfaceC18755 interfaceC18755;
        if (keyEvent.getAction() != 0 || i != 66 || (interfaceC18755 = c24790.f79227) == null) {
            return false;
        }
        interfaceC18755.mo6353(c24790.m54463().toString());
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54456() {
        ColorStateList colorStateListM50538 = C22553.m50538(getContext().getTheme(), android.R.attr.colorControlNormal);
        int defaultColor = C22553.m50538(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor();
        this.f79232.setImageTintList(colorStateListM50538);
        this.f79235.setImageTintList(colorStateListM50538);
        this.f79238.setImageTintList(colorStateListM50538);
        m54455();
        View view = this.f79239;
        Drawable background = view.getBackground();
        if (background != null) {
            Drawable drawableM23653 = C1248.m23653(background.mutate());
            C1248.m23645(drawableM23653, ColorStateList.valueOf(defaultColor));
            view.setBackground(drawableM23653);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m54455() {
        if (this.f79230 == null) {
            return;
        }
        this.f79230.m27934(C22553.m50538(getContext().getTheme(), android.R.attr.textColorPrimary).getDefaultColor());
        this.f79230.mo27940();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54459(boolean z) {
        this.f79236 = z;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m54462() {
        return this.f79236;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54458(InterfaceC18755 interfaceC18755) {
        this.f79227 = interfaceC18755;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54457(String str) {
        InterfaceC18755 interfaceC18755;
        if (str == null) {
            str = "";
        }
        C16742 c16742 = this.f79230;
        if (c16742 == null) {
            boolean z = (this.f79233.length() == 0 && str.length() == 0) ? false : true;
            this.f79233 = TextUtils.stringOrSpannedString(str);
            this.f79234 = null;
            m54448();
            if (!z || (interfaceC18755 = this.f79227) == null) {
                return;
            }
            interfaceC18755.mo6351(this.f79233.toString());
            return;
        }
        c16742.mo27932((CharSequence) str);
        C16742 c16743 = this.f79230;
        c16743.mo27941(c16743.m32500().length());
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m54463() {
        C16742 c16742 = this.f79230;
        return c16742 == null ? this.f79233 : c16742.m32500();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54461(boolean z) {
        boolean z2;
        InterfaceC18755 interfaceC18755;
        m54447();
        boolean z3 = true;
        if (getVisibility() != 0) {
            setVisibility(0);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f79228) {
            this.f79228 = false;
            m54451(true);
        } else {
            z3 = z2;
        }
        if (z3 && (interfaceC18755 = this.f79227) != null) {
            interfaceC18755.mo6352(EnumC16072.EXPANDED);
        }
        C16742 c16742 = this.f79230;
        if (c16742 != null) {
            c16742.requestFocus();
            C16742 c16743 = this.f79230;
            c16743.mo27941(c16743.m32500().length());
        }
        if (z) {
            C7050.m16231(this.f79230);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m54465() {
        if (getVisibility() != 8) {
            clearFocus();
            setVisibility(8);
            InterfaceC18755 interfaceC18755 = this.f79227;
            if (interfaceC18755 != null) {
                interfaceC18755.mo6352(EnumC16072.HIDDEN);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54460() {
        if (!this.f79236) {
            if (this.f79228) {
                return;
            }
            this.f79228 = true;
            m54451(true);
            clearFocus();
            InterfaceC18755 interfaceC18755 = this.f79227;
            if (interfaceC18755 != null) {
                interfaceC18755.mo6352(EnumC16072.COLLAPSED);
                return;
            }
            return;
        }
        m54465();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m54464() {
        return getVisibility() == 0 && !this.f79228;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f79228 && getVisibility() != 8) {
            int mode = View.MeasureSpec.getMode(i);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(dimensionPixelSize, View.MeasureSpec.getSize(i)), 1073741824);
            } else if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
            }
        }
        super.onMeasure(i, i2);
        if (this.f79228 || getVisibility() == 8) {
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
        this.f79237 = true;
        super.clearFocus();
        C16742 c16742 = this.f79230;
        if (c16742 != null) {
            c16742.clearFocus();
            this.f79230.m32440();
        }
        this.f79237 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        C16742 c16742;
        if (this.f79237) {
            return false;
        }
        if (this.f79228 || (c16742 = this.f79230) == null || !c16742.requestFocus(i, rect)) {
            return super.requestFocus(i, rect);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54444(C24790 c24790) {
        C16742 c16742 = c24790.f79230;
        if (c16742 == null) {
            return;
        }
        c16742.requestFocus();
        C16742 c16743 = c24790.f79230;
        c16743.mo27941(c16743.m32500().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ */
    public void m54448() {
        this.f79235.setVisibility(!this.f79228 && m54463().length() == 0 && TextUtils.isEmpty(this.f79231) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m54451(boolean z) {
        this.f79232.setVisibility(this.f79228 ? 0 : 8);
        this.f79239.setVisibility(this.f79228 ? 8 : 0);
        m54448();
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
        bundle.putCharSequence("query", TextUtils.stringOrSpannedString(m54463()));
        SparseArray<Parcelable> sparseArray = this.f79234;
        if (this.f79230 != null) {
            sparseArray = new SparseArray<>();
            this.f79230.saveHierarchyState(sparseArray);
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
        this.f79233 = bundle.getCharSequence("query", "");
        this.f79234 = bundle.getSparseParcelableArray("editor");
        if (this.f79230 != null) {
            this.f79229 = true;
            try {
                m54449();
                this.f79229 = false;
            } catch (Throwable th) {
                this.f79229 = false;
                throw th;
            }
        } else if (m54464()) {
            m54447();
        }
        m54451(true);
    }
}
