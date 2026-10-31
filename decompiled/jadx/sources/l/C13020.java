package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB0M */
/* JADX INFO: loaded from: classes3.dex */
public final class C13020 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f38970 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f38971 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38972;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3143 f38973;

    public C13020(C3143 c3143) {
        this.f38973 = c3143;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31603(AttributeSet attributeSet, int i) {
        int iM50806;
        int iM50807;
        C3143 c3143 = this.f38973;
        Context context = c3143.getContext();
        int[] iArr = C3390.f10697;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(c3143, c3143.getContext(), iArr, attributeSet, c22733M50796.m50810(), i);
        try {
            if (c22733M50796.m50802(1) && (iM50807 = c22733M50796.m50806(1, 0)) != 0) {
                try {
                    c3143.setCheckMarkDrawable(C21311.m48345(c3143.getContext(), iM50807));
                } catch (Resources.NotFoundException unused) {
                    if (c22733M50796.m50802(0)) {
                        c3143.setCheckMarkDrawable(C21311.m48345(c3143.getContext(), iM50806));
                    }
                }
            } else if (c22733M50796.m50802(0) && (iM50806 = c22733M50796.m50806(0, 0)) != 0) {
                c3143.setCheckMarkDrawable(C21311.m48345(c3143.getContext(), iM50806));
            }
            if (c22733M50796.m50802(2)) {
                c3143.setCheckMarkTintList(c22733M50796.m50804(2));
            }
            if (c22733M50796.m50802(3)) {
                c3143.setCheckMarkTintMode(C15320.m36346(c22733M50796.m50809(3, -1), null));
            }
        } finally {
            c22733M50796.m50813();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31602() {
        C3143 c3143 = this.f38973;
        Drawable checkMarkDrawable = c3143.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f38970 || this.f38971) {
                Drawable drawableMutate = C8184.m21684(checkMarkDrawable).mutate();
                if (this.f38970) {
                    C8184.m21676(drawableMutate, (ColorStateList) null);
                }
                if (this.f38971) {
                    C8184.m21679(drawableMutate, (PorterDuff.Mode) null);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c3143.getDrawableState());
                }
                c3143.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31604() {
        if (this.f38972) {
            this.f38972 = false;
        } else {
            this.f38972 = true;
            m31602();
        }
    }
}
