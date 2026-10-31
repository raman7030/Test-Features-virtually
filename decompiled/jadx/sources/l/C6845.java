package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes3.dex */
public class C6845 extends AbstractC11079 {

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public String f21187;

    public C6845(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29910, i, i2);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            m6898((InterfaceC7550) C23778.m52449());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C6845(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C6845(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.editTextPreferenceStyle));
    }

    public C6845(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18528(String str) {
        boolean zMo6932 = mo6932();
        this.f21187 = str;
        m6916(str);
        boolean zMo6933 = mo6932();
        if (zMo6933 != zMo6932) {
            mo6918(zMo6933);
        }
        mo6922();
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final String m18529() {
        return this.f21187;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6895(Object obj) {
        m18528(m6888((String) obj));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo6932() {
        return TextUtils.isEmpty(this.f21187) || super.mo6932();
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C14605 c14605 = new C14605();
        c14605.f44699 = this.f21187;
        return c14605;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C14605.class)) {
            super.mo6892(parcelable);
            return;
        }
        C14605 c14605 = (C14605) parcelable;
        super.mo6892(c14605.getSuperState());
        m18528(c14605.f44699);
    }
}
