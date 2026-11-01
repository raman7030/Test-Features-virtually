package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.۬ۢ */
/* JADX INFO: compiled from: WB0M */
/* JADX INFO: loaded from: classes3.dex */
public final class C1488 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f42016 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f42017 = false;

    /* JADX INFO: renamed from: ܽ */
    public boolean f42018;

    /* JADX INFO: renamed from: ᩳ */
    public final C0998 f42019;

    public C1488(C0998 c0998) {
        this.f42019 = c0998;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33688(AttributeSet attributeSet, int i) {
        int iM53139;
        int iM531310;
        C0998 c0998 = this.f42019;
        Context context = c0998.getContext();
        int[] iArr = C1010.f13504;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(c0998, c0998.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        try {
            if (c1970M53129.m53135(1) && (iM531310 = c1970M53129.m53139(1, 0)) != 0) {
                try {
                    c0998.setCheckMarkDrawable(C22622.m50680(c0998.getContext(), iM531310));
                } catch (Resources.NotFoundException unused) {
                    if (c1970M53129.m53135(0)) {
                        c0998.setCheckMarkDrawable(C22622.m50680(c0998.getContext(), iM53139));
                    }
                }
            } else if (c1970M53129.m53135(0) && (iM53139 = c1970M53129.m53139(0, 0)) != 0) {
                c0998.setCheckMarkDrawable(C22622.m50680(c0998.getContext(), iM53139));
            }
            if (c1970M53129.m53135(2)) {
                c0998.setCheckMarkTintList(c1970M53129.m53137(2));
            }
            if (c1970M53129.m53135(3)) {
                c0998.setCheckMarkTintMode(C1602.m38504(c1970M53129.m53142(3, -1), null));
            }
        } finally {
            c1970M53129.m53146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33687() {
        C0998 c0998 = this.f42019;
        Drawable checkMarkDrawable = c0998.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f42016 || this.f42017) {
                Drawable drawableMutate = C1248.m23653(checkMarkDrawable).mutate();
                if (this.f42016) {
                    C1248.m23645(drawableMutate, (ColorStateList) null);
                }
                if (this.f42017) {
                    C1248.m23648(drawableMutate, (PorterDuff.Mode) null);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0998.getDrawableState());
                }
                c0998.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33689() {
        if (this.f42018) {
            this.f42018 = false;
        } else {
            this.f42018 = true;
            m33687();
        }
    }
}
