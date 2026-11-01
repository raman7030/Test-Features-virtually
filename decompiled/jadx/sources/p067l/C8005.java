package p067l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public final class C8005 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f21026 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final EnumSet f21027;

    /* JADX INFO: renamed from: ۧ */
    public C7138 f21028;

    /* JADX INFO: renamed from: ܽ */
    public final String f21029;

    /* JADX INFO: renamed from: ֫ */
    public static C8005 m18541(C5127 c5127) {
        C8005 c8005 = (C8005) c5127.m10905(f21026);
        return c8005 == null ? new C8005(c5127) : c8005;
    }

    public C8005(C5127 c5127) {
        C16246 c16246M37002 = C16246.m37002(c5127);
        this.f21029 = "compiler";
        this.f21028 = new C7138(c16246M37002, new C2443());
        EnumSet enumSetOf = EnumSet.of(EnumC21417.MANDATORY);
        this.f21027 = enumSetOf;
        c5127.m10908(f21026, this);
        final C13565 c13565M30871 = C13565.m30871(c5127);
        if (c13565M30871.m30879("onlySyntaxErrorsUnrecoverable")) {
            enumSetOf.add(EnumC21417.RECOVERABLE);
        }
        c13565M30871.m30875(new Runnable() { // from class: l.ۤ۠۠
            @Override // java.lang.Runnable
            public final void run() {
                if (c13565M30871.m30879("onlySyntaxErrorsUnrecoverable")) {
                    this.f33530.f21027.add(EnumC21417.RECOVERABLE);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m18546(EnumC21417 enumC21417, C16051 c16051, InterfaceC5323 interfaceC5323, C14040 c14040) {
        C18258 c18258M18547 = m18547((EnumC21706) null, EnumSet.copyOf((Collection) this.f21027), c16051, interfaceC5323, c14040);
        if (enumC21417 != null) {
            c18258M18547.m41587(enumC21417);
        }
        return c18258M18547;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m18543(C13370 c13370) {
        return m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), (C16051) null, (InterfaceC5323) null, c13370);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m18545(EnumC14710 enumC14710, C16051 c16051, InterfaceC5323 interfaceC5323, String str, Object... objArr) {
        return m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051, interfaceC5323, AbstractC6664.m15175(enumC14710, this.f21029, str, objArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m18544(EnumC14710 enumC14710, EnumSet enumSet, C16051 c16051, InterfaceC5323 interfaceC5323, Object... objArr) {
        return m18547((EnumC21706) null, enumSet, c16051, interfaceC5323, AbstractC6664.m15175(enumC14710, this.f21029, "cant.apply.symbols", objArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18258 m18547(EnumC21706 enumC21706, Set set, C16051 c16051, InterfaceC5323 interfaceC5323, AbstractC6664 abstractC6664) {
        return new C18258(this.f21028, AbstractC6664.m15175(abstractC6664.f17193, abstractC6664.f17192, abstractC6664.f17191, C18486.m42024of(abstractC6664.f17190).map(new C4922(1, this)).toArray()), enumC21706, set, c16051, interfaceC5323);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14040 m18542(String str, Object... objArr) {
        return (C14040) AbstractC6664.m15175(EnumC14710.ERROR, this.f21029, str, objArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C15380 m18549(String str, Object... objArr) {
        return (C15380) AbstractC6664.m15175(EnumC14710.NOTE, this.f21029, str, objArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18258 m18548(String str, Object... objArr) {
        return m18543((C13370) AbstractC6664.m15175(EnumC14710.FRAGMENT, this.f21029, str, objArr));
    }
}
