package p067l;

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
public abstract class AbstractC23156 extends C4360 {

    /* JADX INFO: renamed from: ۛ֫ */
    public boolean f72753;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f72754;

    /* JADX INFO: renamed from: ۨ֫ */
    public CharSequence f72755;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f72756;

    /* JADX INFO: renamed from: ᩺֫ */
    public CharSequence f72757;

    public AbstractC23156(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AbstractC23156(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC23156(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC23156(Context context) {
        this(context, null);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۛ */
    public final void mo9034() {
        boolean z = !this.f72756;
        m9019((Serializable) Boolean.valueOf(z));
        m51612(z);
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m51608() {
        return this.f72756;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m51612(boolean z) {
        boolean z2 = this.f72756 != z;
        if (z2 || !this.f72754) {
            this.f72756 = z;
            this.f72754 = true;
            m9060(z);
            if (z2) {
                mo9044(mo9058());
                mo9048();
            }
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo9058() {
        boolean z;
        if (this.f72753) {
            z = this.f72756;
        } else {
            z = !this.f72756;
        }
        return z || super.mo9058();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51611(String str) {
        this.f72757 = str;
        if (this.f72756) {
            mo9048();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51610(String str) {
        this.f72755 = str;
        if (this.f72756) {
            return;
        }
        mo9048();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m51607(boolean z) {
        this.f72753 = z;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9013(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9021(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m51612(m9029(((Boolean) obj).booleanValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final void m51609(View view) {
        boolean z;
        int i;
        CharSequence charSequenceMo9033;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (this.f72756 && !TextUtils.isEmpty(this.f72757)) {
                textView.setText(this.f72757);
            } else {
                if (this.f72756 || TextUtils.isEmpty(this.f72755)) {
                    z = true;
                } else {
                    textView.setText(this.f72755);
                }
                if (z) {
                    charSequenceMo9033 = mo9033();
                    if (!TextUtils.isEmpty(charSequenceMo9033)) {
                        textView.setText(charSequenceMo9033);
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
                charSequenceMo9033 = mo9033();
                if (!TextUtils.isEmpty(charSequenceMo9033)) {
                    textView.setText(charSequenceMo9033);
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

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m9032()) {
            return absSavedState;
        }
        C17119 c17119 = new C17119();
        c17119.f50573 = this.f72756;
        return c17119;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C17119.class)) {
            super.mo9018(parcelable);
            return;
        }
        C17119 c17119 = (C17119) parcelable;
        super.mo9018(c17119.getSuperState());
        m51612(c17119.f50573);
    }
}
