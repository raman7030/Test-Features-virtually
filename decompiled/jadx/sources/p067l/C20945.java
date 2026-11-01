package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes5.dex */
public class C20945 extends AbstractC12898 {

    /* JADX INFO: renamed from: ֫ۧ */
    public CharSequence[] f65819;

    /* JADX INFO: renamed from: ۟֫ */
    public CharSequence[] f65820;

    /* JADX INFO: renamed from: ۧۧ */
    public String f65821;

    /* JADX INFO: renamed from: ܽۧ */
    public String f65822;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f65823;

    public C20945(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32866, i, i2);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f65820 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f65819 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            m9024((InterfaceC9544) C20274.m45792());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C11757.f32869, i, i2);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f65821 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public C20945(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C20945(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public C20945(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47254(CharSequence[] charSequenceArr) {
        this.f65820 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final CharSequence[] m47258() {
        return this.f65820;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47255(CharSequence[] charSequenceArr) {
        this.f65819 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final CharSequence[] m47253() {
        return this.f65819;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9020(CharSequence charSequence) {
        super.mo9020(charSequence);
        if (charSequence == null) {
            this.f65821 = null;
        } else {
            this.f65821 = charSequence.toString();
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۚ */
    public final CharSequence mo9033() {
        if (m9010() != null) {
            return m9010().mo9168(this);
        }
        CharSequence charSequenceM47259 = m47259();
        CharSequence charSequenceMo9033 = super.mo9033();
        String str = this.f65821;
        if (str != null) {
            if (charSequenceM47259 == null) {
                charSequenceM47259 = "";
            }
            String str2 = String.format(str, charSequenceM47259);
            if (!TextUtils.equals(str2, charSequenceMo9033)) {
                return str2;
            }
        }
        return charSequenceMo9033;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47257(String str) {
        boolean zEquals = TextUtils.equals(this.f65822, str);
        if (zEquals && this.f65823) {
            return;
        }
        this.f65822 = str;
        this.f65823 = true;
        m9042(str);
        if (zEquals) {
            return;
        }
        mo9048();
    }

    public final String getValue() {
        return this.f65822;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47256(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f65819) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!TextUtils.equals(this.f65819[length].toString(), str));
        return length;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final CharSequence m47259() {
        CharSequence[] charSequenceArr;
        int iM47256 = m47256(this.f65822);
        if (iM47256 < 0 || (charSequenceArr = this.f65820) == null) {
            return null;
        }
        return charSequenceArr[iM47256];
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9013(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9021(Object obj) {
        m47257(m9014((String) obj));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m9032()) {
            return absSavedState;
        }
        C6192 c6192 = new C6192();
        c6192.f15584 = this.f65822;
        return c6192;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C6192.class)) {
            super.mo9018(parcelable);
            return;
        }
        C6192 c6192 = (C6192) parcelable;
        super.mo9018(c6192.getSuperState());
        m47257(c6192.f15584);
    }
}
