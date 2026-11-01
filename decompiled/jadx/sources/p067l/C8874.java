package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes3.dex */
public class C8874 extends AbstractC12898 {

    /* JADX INFO: renamed from: ۟֫ */
    public String f24065;

    public C8874(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32867, i, i2);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            m9024((InterfaceC9544) C24967.m54858());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C8874(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C8874(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.editTextPreferenceStyle));
    }

    public C8874(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20477(String str) {
        boolean zMo9058 = mo9058();
        this.f24065 = str;
        m9042(str);
        boolean zMo9059 = mo9058();
        if (zMo9059 != zMo9058) {
            mo9044(zMo9059);
        }
        mo9048();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final String m20478() {
        return this.f24065;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9013(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9021(Object obj) {
        m20477(m9014((String) obj));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo9058() {
        return TextUtils.isEmpty(this.f24065) || super.mo9058();
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m9032()) {
            return absSavedState;
        }
        C16249 c16249 = new C16249();
        c16249.f47805 = this.f24065;
        return c16249;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C16249.class)) {
            super.mo9018(parcelable);
            return;
        }
        C16249 c16249 = (C16249) parcelable;
        super.mo9018(c16249.getSuperState());
        m20477(c16249.f47805);
    }
}
