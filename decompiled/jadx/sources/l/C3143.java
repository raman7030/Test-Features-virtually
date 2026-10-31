package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4U7 */
/* JADX INFO: loaded from: classes2.dex */
public class C3143 extends CheckedTextView implements InterfaceC12091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1916 f9827;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13020 f9828;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7376 f9829;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22193 f9830;

    public C3143(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3143(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C1916 c1916 = new C1916(this);
        this.f9827 = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        C22193 c22193 = new C22193(this);
        this.f9830 = c22193;
        c22193.m49839(attributeSet, i);
        C13020 c13020 = new C13020(this);
        this.f9828 = c13020;
        c13020.m31603(attributeSet, i);
        if (this.f9829 == null) {
            this.f9829 = new C7376(this);
        }
        this.f9829.m19826(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C13020 c13020 = this.f9828;
        if (c13020 != null) {
            c13020.m31604();
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C21311.m48345(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.f9830;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.f9830;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1916 c1916 = this.f9827;
        if (c1916 != null) {
            c1916.m6318(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1916 c1916 = this.f9827;
        if (c1916 != null) {
            c1916.m6314();
        }
        C22193 c22193 = this.f9830;
        if (c22193 != null) {
            c22193.m49835();
        }
        C13020 c13020 = this.f9828;
        if (c13020 != null) {
            c13020.m31602();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1711.m5725(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f9829 == null) {
            this.f9829 = new C7376(this);
        }
        this.f9829.m19827(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f9827;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f9827;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1916 c1916 = this.f9827;
        c1916.m6319(colorStateList);
        c1916.m6314();
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1916 c1916 = this.f9827;
        c1916.m6320(mode);
        c1916.m6314();
    }
}
