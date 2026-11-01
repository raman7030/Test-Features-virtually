package p067l;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: l.᩻᩵ */
/* JADX INFO: compiled from: U3Z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2027 implements InterfaceC1887 {
    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ֫ */
    public final void mo50290(C1712 c1712, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c1712.m43267(new C1327(f, colorStateList));
        C1572 c1572 = c1712.f56782;
        c1572.setClipToOutline(true);
        c1572.setElevation(f2);
        mo50296(c1712, f3);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ֫ */
    public final void mo50288(InterfaceC1187 interfaceC1187, float f) {
        m55047(interfaceC1187).m26803(f);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ܽ */
    public final void mo50296(InterfaceC1187 interfaceC1187, float f) {
        C1712 c1712 = (C1712) interfaceC1187;
        m55047(interfaceC1187).m26804(f, c1712.f56782.getUseCompatPadding(), c1712.f56782.getPreventCornerOverlap());
        mo50291(interfaceC1187);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ۧ */
    public final float mo50292(InterfaceC1187 interfaceC1187) {
        return m55047(interfaceC1187).m26806();
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ᩷ */
    public final float mo50299(InterfaceC1187 interfaceC1187) {
        return mo50287(interfaceC1187) * 2.0f;
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ᩳ */
    public final float mo50298(InterfaceC1187 interfaceC1187) {
        return mo50287(interfaceC1187) * 2.0f;
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ֫ */
    public final float mo50287(InterfaceC1187 interfaceC1187) {
        return m55047(interfaceC1187).m26807();
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ۧ */
    public final void mo50293(InterfaceC1187 interfaceC1187, float f) {
        ((C1712) interfaceC1187).f56782.setElevation(f);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ܳ */
    public final float mo50294(InterfaceC1187 interfaceC1187) {
        return ((C1712) interfaceC1187).f56782.getElevation();
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ۜ */
    public final void mo50291(InterfaceC1187 interfaceC1187) {
        if (!((C1712) interfaceC1187).f56782.getUseCompatPadding()) {
            ((C1712) interfaceC1187).m43266(0, 0, 0, 0);
            return;
        }
        float fMo50292 = mo50292(interfaceC1187);
        float fMo50287 = mo50287(interfaceC1187);
        C1712 c1712 = (C1712) interfaceC1187;
        C1572 c1572 = c1712.f56782;
        int iCeil = (int) Math.ceil(C1292.m25377(fMo50292, fMo50287, c1572.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C1292.m25378(fMo50292, fMo50287, c1572.getPreventCornerOverlap()));
        c1712.m43266(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ᩻ */
    public final void mo50300(InterfaceC1187 interfaceC1187) {
        mo50296(interfaceC1187, mo50292(interfaceC1187));
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ܿ */
    public final void mo50297(InterfaceC1187 interfaceC1187) {
        mo50296(interfaceC1187, mo50292(interfaceC1187));
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ֫ */
    public final void mo50289(InterfaceC1187 interfaceC1187, ColorStateList colorStateList) {
        m55047(interfaceC1187).m26805(colorStateList);
    }

    @Override // p067l.InterfaceC1887
    /* JADX INFO: renamed from: ܽ */
    public final ColorStateList mo50295(InterfaceC1187 interfaceC1187) {
        return m55047(interfaceC1187).m26802();
    }

    /* JADX INFO: renamed from: ۢ */
    public static C1327 m55047(InterfaceC1187 interfaceC1187) {
        return (C1327) ((C1712) interfaceC1187).m43265();
    }
}
