package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۗ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3506 extends C2095 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final C3432 f11128;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f11129;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f11130;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f11131;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f11132;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f11133;

    public AbstractC3506(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f11128 = new C3432();
        new Handler(Looper.getMainLooper());
        this.f11133 = true;
        this.f11129 = 0;
        this.f11131 = false;
        this.f11130 = Integer.MAX_VALUE;
        this.f11132 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29904, i, i2);
        this.f11133 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m10702(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC3506(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC3506(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m10702(int i) {
        if (i != Integer.MAX_VALUE) {
            m6938();
        }
        this.f11130 = i;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int m10697() {
        return this.f11130;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m10699() {
        return this.f11132.size();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2095 m10701(int i) {
        return (C2095) this.f11132.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10696(C2095 c2095) {
        long jM41275;
        if (this.f11132.contains(c2095)) {
            return;
        }
        if (c2095.m6911() != null) {
            AbstractC3506 parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            parent.m10700((CharSequence) c2095.m6911());
        }
        if (c2095.m6926() == Integer.MAX_VALUE) {
            if (this.f11133) {
                int i = this.f11129;
                this.f11129 = i + 1;
                c2095.m6933(i);
            }
            if (c2095 instanceof AbstractC3506) {
                ((AbstractC3506) c2095).f11133 = this.f11133;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f11132, c2095);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        int i2 = iBinarySearch;
        c2095.m6927(mo6932());
        synchronized (this) {
            this.f11132.add(i2, c2095);
        }
        C17638 c17638M6935 = m6935();
        String strM6911 = c2095.m6911();
        if (strM6911 != null && this.f11128.containsKey(strM6911)) {
            jM41275 = ((Long) this.f11128.getOrDefault(strM6911, null)).longValue();
            this.f11128.remove(strM6911);
        } else {
            jM41275 = c17638M6935.m41275();
        }
        c2095.m6901(c17638M6935, jM41275);
        c2095.m6896(this);
        if (this.f11131) {
            c2095.mo6912();
        }
        m6921();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2095 m10700(CharSequence charSequence) {
        C2095 c2095M10700;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(m6911(), charSequence)) {
            return this;
        }
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            C2095 c2095M10701 = m10701(i);
            if (TextUtils.equals(c2095M10701.m6911(), charSequence)) {
                return c2095M10701;
            }
            if ((c2095M10701 instanceof AbstractC3506) && (c2095M10700 = ((AbstractC3506) c2095M10701).m10700(charSequence)) != null) {
                return c2095M10700;
            }
        }
        return null;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۤ */
    public final void mo6912() {
        super.mo6912();
        this.f11131 = true;
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            m10701(i).mo6912();
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۨ */
    public final void mo6920() {
        super.mo6920();
        this.f11131 = false;
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            m10701(i).mo6920();
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۧ */
    public final void mo6918(boolean z) {
        super.mo6918(z);
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            m10701(i).m6927(z);
        }
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final void m10698() {
        synchronized (this) {
            Collections.sort(this.f11132);
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۧ */
    public final void mo6915(Bundle bundle) {
        super.mo6915(bundle);
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            m10701(i).mo6915(bundle);
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6891(Bundle bundle) {
        super.mo6891(bundle);
        int size = this.f11132.size();
        for (int i = 0; i < size; i++) {
            m10701(i).mo6891(bundle);
        }
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new C4917(this.f11130);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C4917.class)) {
            super.mo6892(parcelable);
            return;
        }
        C4917 c4917 = (C4917) parcelable;
        this.f11130 = c4917.f15509;
        super.mo6892(c4917.getSuperState());
    }
}
