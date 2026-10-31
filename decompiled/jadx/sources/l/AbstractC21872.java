package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21872 extends C2095 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public boolean f70043;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f70044;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f70045;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f70046;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public CharSequence f70047;

    public AbstractC21872(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AbstractC21872(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC21872(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC21872(Context context) {
        this(context, null);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۛ */
    public final void mo6908() {
        boolean z = !this.f70046;
        m6893((Serializable) Boolean.valueOf(z));
        m49260(z);
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49256() {
        return this.f70046;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49260(boolean z) {
        boolean z2 = this.f70046 != z;
        if (z2 || !this.f70044) {
            this.f70046 = z;
            this.f70044 = true;
            m6934(z);
            if (z2) {
                mo6918(mo6932());
                mo6922();
            }
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo6932() {
        boolean z;
        if (this.f70043) {
            z = this.f70046;
        } else {
            z = !this.f70046;
        }
        return z || super.mo6932();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49259(String str) {
        this.f70047 = str;
        if (this.f70046) {
            mo6922();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49258(String str) {
        this.f70045 = str;
        if (this.f70046) {
            return;
        }
        mo6922();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m49255(boolean z) {
        this.f70043 = z;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6895(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m49260(m6903(((Boolean) obj).booleanValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49257(View view) {
        boolean z;
        int i;
        CharSequence charSequenceMo6907;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (this.f70046 && !TextUtils.isEmpty(this.f70047)) {
                textView.setText(this.f70047);
            } else {
                if (this.f70046 || TextUtils.isEmpty(this.f70045)) {
                    z = true;
                } else {
                    textView.setText(this.f70045);
                }
                if (z) {
                    charSequenceMo6907 = mo6907();
                    if (!TextUtils.isEmpty(charSequenceMo6907)) {
                        textView.setText(charSequenceMo6907);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            z = false;
            if (z) {
                charSequenceMo6907 = mo6907();
                if (!TextUtils.isEmpty(charSequenceMo6907)) {
                    textView.setText(charSequenceMo6907);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C15520 c15520 = new C15520();
        c15520.f47441 = this.f70046;
        return c15520;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C15520.class)) {
            super.mo6892(parcelable);
            return;
        }
        C15520 c15520 = (C15520) parcelable;
        super.mo6892(c15520.getSuperState());
        m49260(c15520.f47441);
    }
}
