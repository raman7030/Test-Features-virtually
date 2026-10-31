package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes.dex */
public class C22367 extends AbstractC11079 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72474;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72475;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public HashSet f72476;

    public C22367(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f72476 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29906, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f72475 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f72474 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public C22367(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m50133() {
        return this.f72475;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m50134() {
        return this.f72474;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50132(Set set) {
        HashSet hashSet = this.f72476;
        hashSet.clear();
        hashSet.addAll(set);
        m6917(set);
        mo6922();
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final HashSet m50131() {
        return this.f72476;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6895(Object obj) {
        m50132(m6889((Set) obj));
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C21662 c21662 = new C21662();
        c21662.f69515 = this.f72476;
        return c21662;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C21662.class)) {
            super.mo6892(parcelable);
            return;
        }
        C21662 c21662 = (C21662) parcelable;
        super.mo6892(c21662.getSuperState());
        m50132(c21662.f69515);
    }
}
