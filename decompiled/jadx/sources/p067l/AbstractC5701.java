package p067l;

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
public abstract class AbstractC5701 extends C4360 {

    /* JADX INFO: renamed from: ۛ֫ */
    public final C1012 f13933;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f13934;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f13935;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f13936;

    /* JADX INFO: renamed from: ܰ֫ */
    public final ArrayList f13937;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f13938;

    public AbstractC5701(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13933 = new C1012();
        new Handler(Looper.getMainLooper());
        this.f13938 = true;
        this.f13934 = 0;
        this.f13936 = false;
        this.f13935 = Integer.MAX_VALUE;
        this.f13937 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11757.f32861, i, i2);
        this.f13938 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m12697(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC5701(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC5701(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m12697(int i) {
        if (i != Integer.MAX_VALUE) {
            m9064();
        }
        this.f13935 = i;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final int m12692() {
        return this.f13935;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m12694() {
        return this.f13937.size();
    }

    /* JADX INFO: renamed from: ܳ */
    public final C4360 m12696(int i) {
        return (C4360) this.f13937.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12691(C4360 c4360) {
        long jM43521;
        if (this.f13937.contains(c4360)) {
            return;
        }
        if (c4360.m9037() != null) {
            AbstractC5701 parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            parent.m12695((CharSequence) c4360.m9037());
        }
        if (c4360.m9052() == Integer.MAX_VALUE) {
            if (this.f13938) {
                int i = this.f13934;
                this.f13934 = i + 1;
                c4360.m9059(i);
            }
            if (c4360 instanceof AbstractC5701) {
                ((AbstractC5701) c4360).f13938 = this.f13938;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f13937, c4360);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        int i2 = iBinarySearch;
        c4360.m9053(mo9058());
        synchronized (this) {
            this.f13937.add(i2, c4360);
        }
        C19132 c19132M9061 = m9061();
        String strM9037 = c4360.m9037();
        if (strM9037 != null && this.f13933.containsKey(strM9037)) {
            jM43521 = ((Long) this.f13933.getOrDefault(strM9037, null)).longValue();
            this.f13933.remove(strM9037);
        } else {
            jM43521 = c19132M9061.m43521();
        }
        c4360.m9027(c19132M9061, jM43521);
        c4360.m9022(this);
        if (this.f13936) {
            c4360.mo9038();
        }
        m9047();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4360 m12695(CharSequence charSequence) {
        C4360 c4360M12695;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(m9037(), charSequence)) {
            return this;
        }
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            C4360 c4360M12696 = m12696(i);
            if (TextUtils.equals(c4360M12696.m9037(), charSequence)) {
                return c4360M12696;
            }
            if ((c4360M12696 instanceof AbstractC5701) && (c4360M12695 = ((AbstractC5701) c4360M12696).m12695(charSequence)) != null) {
                return c4360M12695;
            }
        }
        return null;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۤ */
    public final void mo9038() {
        super.mo9038();
        this.f13936 = true;
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            m12696(i).mo9038();
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۨ */
    public final void mo9046() {
        super.mo9046();
        this.f13936 = false;
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            m12696(i).mo9046();
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۧ */
    public final void mo9044(boolean z) {
        super.mo9044(z);
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            m12696(i).m9053(z);
        }
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final void m12693() {
        synchronized (this) {
            Collections.sort(this.f13937);
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۧ */
    public final void mo9041(Bundle bundle) {
        super.mo9041(bundle);
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            m12696(i).mo9041(bundle);
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9017(Bundle bundle) {
        super.mo9017(bundle);
        int size = this.f13937.size();
        for (int i = 0; i < size; i++) {
            m12696(i).mo9017(bundle);
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩺ */
    public final Parcelable mo9066() {
        super.mo9066();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new C7042(this.f13935);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo9018(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C7042.class)) {
            super.mo9018(parcelable);
            return;
        }
        C7042 c7042 = (C7042) parcelable;
        this.f13935 = c7042.f18342;
        super.mo9018(c7042.getSuperState());
    }
}
