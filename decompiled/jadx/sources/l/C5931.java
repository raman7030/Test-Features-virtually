package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5931 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4314 f18172 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet f18173;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5019 f18174;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f18175;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5931 m16615(C2903 c2903) {
        C5931 c5931 = (C5931) c2903.m8838(f18172);
        return c5931 == null ? new C5931(c2903) : c5931;
    }

    public C5931(C2903 c2903) {
        C14602 c14602M34851 = C14602.m34851(c2903);
        this.f18175 = "compiler";
        this.f18174 = new C5019(c14602M34851, new C0079());
        EnumSet enumSetOf = EnumSet.of(EnumC20043.MANDATORY);
        this.f18173 = enumSetOf;
        c2903.m8841(f18172, this);
        final C11781 c11781M28823 = C11781.m28823(c2903);
        if (c11781M28823.m28831("onlySyntaxErrorsUnrecoverable")) {
            enumSetOf.add(EnumC20043.RECOVERABLE);
        }
        c11781M28823.m28827(new Runnable() { // from class: l.ۤ۠۠
            @Override // java.lang.Runnable
            public final void run() {
                if (c11781M28823.m28831("onlySyntaxErrorsUnrecoverable")) {
                    this.f30568.f18173.add(EnumC20043.RECOVERABLE);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m16620(EnumC20043 enumC20043, C14397 c14397, InterfaceC3109 interfaceC3109, C12281 c12281) {
        C16719 c16719M16621 = m16621((EnumC20347) null, EnumSet.copyOf((Collection) this.f18173), c14397, interfaceC3109, c12281);
        if (enumC20043 != null) {
            c16719M16621.m39351(enumC20043);
        }
        return c16719M16621;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m16617(C11576 c11576) {
        return m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), (C14397) null, (InterfaceC3109) null, c11576);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m16619(EnumC12986 enumC12986, C14397 c14397, InterfaceC3109 interfaceC3109, String str, Object... objArr) {
        return m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c14397, interfaceC3109, AbstractC4520.m13292(enumC12986, this.f18175, str, objArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m16618(EnumC12986 enumC12986, EnumSet enumSet, C14397 c14397, InterfaceC3109 interfaceC3109, Object... objArr) {
        return m16621((EnumC20347) null, enumSet, c14397, interfaceC3109, AbstractC4520.m13292(enumC12986, this.f18175, "cant.apply.symbols", objArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m16621(EnumC20347 enumC20347, Set set, C14397 c14397, InterfaceC3109 interfaceC3109, AbstractC4520 abstractC4520) {
        return new C16719(this.f18174, AbstractC4520.m13292(abstractC4520.f14366, abstractC4520.f14365, abstractC4520.f14364, C16958.of(abstractC4520.f14363).map(new C2687(1, this)).toArray()), enumC20347, set, c14397, interfaceC3109);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12281 m16616(String str, Object... objArr) {
        return (C12281) AbstractC4520.m13292(EnumC12986.ERROR, this.f18175, str, objArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13691 m16623(String str, Object... objArr) {
        return (C13691) AbstractC4520.m13292(EnumC12986.NOTE, this.f18175, str, objArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16719 m16622(String str, Object... objArr) {
        return m16617((C11576) AbstractC4520.m13292(EnumC12986.FRAGMENT, this.f18175, str, objArr));
    }
}
