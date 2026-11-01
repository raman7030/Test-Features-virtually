package p067l;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A43N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4456 {

    /* JADX INFO: renamed from: ֫ */
    public C8005 f10006;

    /* JADX INFO: renamed from: ۧ */
    public C16051 f10007;

    /* JADX INFO: renamed from: ܽ */
    public HashMap f10008;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9356(C18258 c18258);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9362(Object... objArr);

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19740 m9363(InterfaceC19740 interfaceC19740) {
        C16051 c16051 = this.f10007;
        InterfaceC19740 interfaceC19741 = c16051 == null ? null : c16051.f46464;
        this.f10007 = m9346(interfaceC19740);
        return interfaceC19741;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16051 m9346(InterfaceC19740 interfaceC19740) {
        HashMap map = this.f10008;
        if (interfaceC19740 == null) {
            return C16051.f46457;
        }
        C16051 c16051 = (C16051) map.get(interfaceC19740);
        if (c16051 != null) {
            return c16051;
        }
        C16051 c16052 = new C16051();
        c16052.f46464 = interfaceC19740;
        c16052.f46465 = this;
        map.put(interfaceC19740, c16052);
        return c16052;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16051 m9345() {
        return this.f10007;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9350(String str, Object... objArr) {
        m9355(this.f10006.m18542(str, objArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9355(C14040 c14040) {
        mo9356(this.f10006.m18546(null, this.f10007, null, c14040));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9352(InterfaceC5323 interfaceC5323, C14040 c14040) {
        mo9356(this.f10006.m18546(null, this.f10007, interfaceC5323, c14040));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9359(EnumC21417 enumC21417, InterfaceC5323 interfaceC5323, C14040 c14040) {
        mo9356(this.f10006.m18546(enumC21417, this.f10007, interfaceC5323, c14040));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9348(int i, C14040 c14040) {
        mo9356(this.f10006.m18546(null, this.f10007, i == -1 ? null : new C9346(i), c14040));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9358(EnumC21417 enumC21417, int i, C14040 c14040) {
        mo9356(this.f10006.m18546(enumC21417, this.f10007, i == -1 ? null : new C9346(i), c14040));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9354(C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, (InterfaceC5323) null, c12895));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9361(EnumC21706 enumC21706, C12895 c12895) {
        C8005 c8005 = this.f10006;
        c8005.getClass();
        mo9356(c8005.m18547(enumC21706, EnumSet.noneOf(EnumC21417.class), (C16051) null, (InterfaceC5323) null, c12895));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9364(InterfaceC5323 interfaceC5323, C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, interfaceC5323, c12895));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9365(EnumC21706 enumC21706, InterfaceC5323 interfaceC5323, C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547(enumC21706, EnumSet.noneOf(EnumC21417.class), c16051, interfaceC5323, c12895));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9347(int i, C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        C9346 c9346 = i == -1 ? null : new C9346(i);
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, c9346, c12895));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9351(InterfaceC5323 interfaceC5323, C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.of(EnumC21417.MANDATORY), c16051, interfaceC5323, c12895));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9360(EnumC21706 enumC21706, InterfaceC5323 interfaceC5323, C12895 c12895) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547(enumC21706, EnumSet.of(EnumC21417.MANDATORY), c16051, interfaceC5323, c12895));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9353(AbstractC7257 abstractC7257, C15380 c15380) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, abstractC7257, c15380));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9349(int i, C15380 c15380) {
        C8005 c8005 = this.f10006;
        C16051 c16051 = this.f10007;
        C9346 c9346 = i == -1 ? null : new C9346(i);
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, c9346, c15380));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9357(InterfaceC19740 interfaceC19740, C15380 c15380) {
        C8005 c8005 = this.f10006;
        C16051 c16051M9346 = m9346(interfaceC19740);
        c8005.getClass();
        mo9356(c8005.m18547((EnumC21706) null, EnumSet.of(EnumC21417.MANDATORY), c16051M9346, (InterfaceC5323) null, c15380));
    }
}
