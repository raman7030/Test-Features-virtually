package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.p000mt.plus.R;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes.dex */
public class C23626 extends AbstractC12898 {

    /* JADX INFO: renamed from: ֫ۧ */
    public CharSequence[] f75200;

    /* JADX INFO: renamed from: ۟֫ */
    public CharSequence[] f75201;

    /* JADX INFO: renamed from: ۧۧ */
    public HashSet f75202;

    public C23626(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f75202 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32863, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f75201 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f75200 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public C23626(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final CharSequence[] m52473() {
        return this.f75201;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final CharSequence[] m52474() {
        return this.f75200;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52472(Set set) {
        HashSet hashSet = this.f75202;
        hashSet.clear();
        hashSet.addAll(set);
        m9043(set);
        mo9048();
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final HashSet m52471() {
        return this.f75202;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9013(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9021(Object obj) {
        m52472(m9015((Set) obj));
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m9032()) {
            return absSavedState;
        }
        C22956 c22956 = new C22956();
        c22956.f72219 = this.f75202;
        return c22956;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C22956.class)) {
            super.mo9018(parcelable);
            return;
        }
        C22956 c22956 = (C22956) parcelable;
        super.mo9018(c22956.getSuperState());
        m52472(c22956.f72219);
    }
}
