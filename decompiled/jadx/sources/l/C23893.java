package l;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: l.᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U3Z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23893 implements InterfaceC21072 {
    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ֫ */
    public final void mo47960(C17543 c17543, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c17543.m41022(new C9783(f, colorStateList));
        C14720 c14720 = c17543.f53592;
        c14720.setClipToOutline(true);
        c14720.setElevation(f2);
        mo47966(c17543, f3);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ֫ */
    public final void mo47958(InterfaceC6960 interfaceC6960, float f) {
        m52638(interfaceC6960).m24789(f);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ܽ */
    public final void mo47966(InterfaceC6960 interfaceC6960, float f) {
        C17543 c17543 = (C17543) interfaceC6960;
        m52638(interfaceC6960).m24790(f, c17543.f53592.getUseCompatPadding(), c17543.f53592.getPreventCornerOverlap());
        mo47961(interfaceC6960);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ۧ */
    public final float mo47962(InterfaceC6960 interfaceC6960) {
        return m52638(interfaceC6960).m24792();
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ᩷ */
    public final float mo47969(InterfaceC6960 interfaceC6960) {
        return mo47957(interfaceC6960) * 2.0f;
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ᩳ */
    public final float mo47968(InterfaceC6960 interfaceC6960) {
        return mo47957(interfaceC6960) * 2.0f;
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ֫ */
    public final float mo47957(InterfaceC6960 interfaceC6960) {
        return m52638(interfaceC6960).m24793();
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ۧ */
    public final void mo47963(InterfaceC6960 interfaceC6960, float f) {
        ((C17543) interfaceC6960).f53592.setElevation(f);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ܳ */
    public final float mo47964(InterfaceC6960 interfaceC6960) {
        return ((C17543) interfaceC6960).f53592.getElevation();
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ۜ */
    public final void mo47961(InterfaceC6960 interfaceC6960) {
        if (!((C17543) interfaceC6960).f53592.getUseCompatPadding()) {
            ((C17543) interfaceC6960).m41021(0, 0, 0, 0);
            return;
        }
        float fMo47962 = mo47962(interfaceC6960);
        float fMo47957 = mo47957(interfaceC6960);
        C17543 c17543 = (C17543) interfaceC6960;
        C14720 c14720 = c17543.f53592;
        int iCeil = (int) Math.ceil(C9077.m23431(fMo47962, fMo47957, c14720.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C9077.m23432(fMo47962, fMo47957, c14720.getPreventCornerOverlap()));
        c17543.m41021(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ᩻ */
    public final void mo47970(InterfaceC6960 interfaceC6960) {
        mo47966(interfaceC6960, mo47962(interfaceC6960));
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ܿ */
    public final void mo47967(InterfaceC6960 interfaceC6960) {
        mo47966(interfaceC6960, mo47962(interfaceC6960));
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ֫ */
    public final void mo47959(InterfaceC6960 interfaceC6960, ColorStateList colorStateList) {
        m52638(interfaceC6960).m24791(colorStateList);
    }

    @Override // l.InterfaceC21072
    /* JADX INFO: renamed from: ܽ */
    public final ColorStateList mo47965(InterfaceC6960 interfaceC6960) {
        return m52638(interfaceC6960).m24788();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C9783 m52638(InterfaceC6960 interfaceC6960) {
        return (C9783) ((C17543) interfaceC6960).m41020();
    }
}
