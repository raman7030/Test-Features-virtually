package l;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A43N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2197 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5931 f7221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14397 f7222;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f7223;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7277(C16719 c16719);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7283(Object... objArr);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m7284(InterfaceC18278 interfaceC18278) {
        C14397 c14397 = this.f7222;
        InterfaceC18278 interfaceC18279 = c14397 == null ? null : c14397.f43371;
        this.f7222 = m7267(interfaceC18278);
        return interfaceC18279;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14397 m7267(InterfaceC18278 interfaceC18278) {
        HashMap map = this.f7223;
        if (interfaceC18278 == null) {
            return C14397.f43364;
        }
        C14397 c14397 = (C14397) map.get(interfaceC18278);
        if (c14397 != null) {
            return c14397;
        }
        C14397 c14398 = new C14397();
        c14398.f43371 = interfaceC18278;
        c14398.f43372 = this;
        map.put(interfaceC18278, c14398);
        return c14398;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14397 m7266() {
        return this.f7222;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7271(String str, Object... objArr) {
        m7276(this.f7221.m16616(str, objArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7276(C12281 c12281) {
        mo7277(this.f7221.m16620(null, this.f7222, null, c12281));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7273(InterfaceC3109 interfaceC3109, C12281 c12281) {
        mo7277(this.f7221.m16620(null, this.f7222, interfaceC3109, c12281));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7280(EnumC20043 enumC20043, InterfaceC3109 interfaceC3109, C12281 c12281) {
        mo7277(this.f7221.m16620(enumC20043, this.f7222, interfaceC3109, c12281));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7269(int i, C12281 c12281) {
        mo7277(this.f7221.m16620(null, this.f7222, i == -1 ? null : new C7342(i), c12281));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7279(EnumC20043 enumC20043, int i, C12281 c12281) {
        mo7277(this.f7221.m16620(enumC20043, this.f7222, i == -1 ? null : new C7342(i), c12281));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7275(C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, (InterfaceC3109) null, c11076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7282(EnumC20347 enumC20347, C11076 c11076) {
        C5931 c5931 = this.f7221;
        c5931.getClass();
        mo7277(c5931.m16621(enumC20347, EnumSet.noneOf(EnumC20043.class), (C14397) null, (InterfaceC3109) null, c11076));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7285(InterfaceC3109 interfaceC3109, C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, interfaceC3109, c11076));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7286(EnumC20347 enumC20347, InterfaceC3109 interfaceC3109, C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621(enumC20347, EnumSet.noneOf(EnumC20043.class), c14397, interfaceC3109, c11076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7268(int i, C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        C7342 c7342 = i == -1 ? null : new C7342(i);
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, c7342, c11076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7272(InterfaceC3109 interfaceC3109, C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.of(EnumC20043.MANDATORY), c14397, interfaceC3109, c11076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7281(EnumC20347 enumC20347, InterfaceC3109 interfaceC3109, C11076 c11076) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621(enumC20347, EnumSet.of(EnumC20043.MANDATORY), c14397, interfaceC3109, c11076));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7274(AbstractC5144 abstractC5144, C13691 c13691) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, abstractC5144, c13691));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7270(int i, C13691 c13691) {
        C5931 c5931 = this.f7221;
        C14397 c14397 = this.f7222;
        C7342 c7342 = i == -1 ? null : new C7342(i);
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, c7342, c13691));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7278(InterfaceC18278 interfaceC18278, C13691 c13691) {
        C5931 c5931 = this.f7221;
        C14397 c14397M7267 = m7267(interfaceC18278);
        c5931.getClass();
        mo7277(c5931.m16621((EnumC20347) null, EnumSet.of(EnumC20043.MANDATORY), c14397M7267, (InterfaceC3109) null, c13691));
    }
}
