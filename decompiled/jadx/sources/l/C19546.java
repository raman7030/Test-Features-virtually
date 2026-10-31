package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public class C19546 extends AbstractC11079 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f63199;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public CharSequence[] f63200;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public String f63201;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public String f63202;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f63203;

    public C19546(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29909, i, i2);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f63200 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f63199 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            m6898((InterfaceC7550) C18840.m43526());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C9878.f29912, i, i2);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f63201 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public C19546(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C19546(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public C19546(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44954(CharSequence[] charSequenceArr) {
        this.f63200 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m44958() {
        return this.f63200;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44955(CharSequence[] charSequenceArr) {
        this.f63199 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m44953() {
        return this.f63199;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6894(CharSequence charSequence) {
        super.mo6894(charSequence);
        if (charSequence == null) {
            this.f63201 = null;
        } else {
            this.f63201 = charSequence.toString();
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۚ */
    public final CharSequence mo6907() {
        if (m6884() != null) {
            return m6884().mo7073(this);
        }
        CharSequence charSequenceM44959 = m44959();
        CharSequence charSequenceMo6907 = super.mo6907();
        String str = this.f63201;
        if (str != null) {
            if (charSequenceM44959 == null) {
                charSequenceM44959 = "";
            }
            String str2 = String.format(str, charSequenceM44959);
            if (!TextUtils.equals(str2, charSequenceMo6907)) {
                return str2;
            }
        }
        return charSequenceMo6907;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44957(String str) {
        boolean zEquals = TextUtils.equals(this.f63202, str);
        if (zEquals && this.f63203) {
            return;
        }
        this.f63202 = str;
        this.f63203 = true;
        m6916(str);
        if (zEquals) {
            return;
        }
        mo6922();
    }

    public final String getValue() {
        return this.f63202;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44956(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f63199) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!TextUtils.equals(this.f63199[length].toString(), str));
        return length;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m44959() {
        CharSequence[] charSequenceArr;
        int iM44956 = m44956(this.f63202);
        if (iM44956 < 0 || (charSequenceArr = this.f63200) == null) {
            return null;
        }
        return charSequenceArr[iM44956];
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6895(Object obj) {
        m44957(m6888((String) obj));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C4023 c4023 = new C4023();
        c4023.f12769 = this.f63202;
        return c4023;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C4023.class)) {
            super.mo6892(parcelable);
            return;
        }
        C4023 c4023 = (C4023) parcelable;
        super.mo6892(c4023.getSuperState());
        m44957(c4023.f12769);
    }
}
