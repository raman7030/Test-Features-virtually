package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗۢ */
/* JADX INFO: compiled from: W4U7 */
/* JADX INFO: loaded from: classes2.dex */
public class C0998 extends CheckedTextView implements InterfaceC13859 {

    /* JADX INFO: renamed from: ۙ */
    public final C0937 f12630;

    /* JADX INFO: renamed from: ᩶ */
    public final C1488 f12631;

    /* JADX INFO: renamed from: ᩸ */
    public C1208 f12632;

    /* JADX INFO: renamed from: ᩹ */
    public final C1943 f12633;

    public C0998(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C0937 c0937 = new C0937(this);
        this.f12630 = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        C1943 c1943 = new C1943(this);
        this.f12633 = c1943;
        c1943.m52166(attributeSet, i);
        C1488 c1488 = new C1488(this);
        this.f12631 = c1488;
        c1488.m33688(attributeSet, i);
        if (this.f12632 == null) {
            this.f12632 = new C1208(this);
        }
        this.f12632.m21799(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1488 c1488 = this.f12631;
        if (c1488 != null) {
            c1488.m33689();
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C22622.m50680(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.f12633;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.f12633;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0937 c0937 = this.f12630;
        if (c0937 != null) {
            c0937.m8491(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0937 c0937 = this.f12630;
        if (c0937 != null) {
            c0937.m8487();
        }
        C1943 c1943 = this.f12633;
        if (c1943 != null) {
            c1943.m52162();
        }
        C1488 c1488 = this.f12631;
        if (c1488 != null) {
            c1488.m33687();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0927.m7951(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C6483.m14851(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C6483.m14850(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f12632 == null) {
            this.f12632 = new C1208(this);
        }
        this.f12632.m21800(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f12630;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f12630;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0937 c0937 = this.f12630;
        c0937.m8492(colorStateList);
        c0937.m8487();
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0937 c0937 = this.f12630;
        c0937.m8493(mode);
        c0937.m8487();
    }
}
