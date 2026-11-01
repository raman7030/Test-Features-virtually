package p067l;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes4.dex */
public class C18258 implements InterfaceC13765 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC14548 f54528;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6664 f54529;

    /* JADX INFO: renamed from: ܳ */
    public final C16051 f54530;

    /* JADX INFO: renamed from: ܽ */
    public final Set f54531;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC5323 f54532;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC21706 f54533;

    /* JADX INFO: renamed from: ᩻ */
    public C4177 f54534;

    public C18258(InterfaceC14548 interfaceC14548, AbstractC6664 abstractC6664, EnumC21706 enumC21706, Set set, C16051 c16051, InterfaceC5323 interfaceC5323) {
        if (c16051 == null && interfaceC5323 != null && interfaceC5323.mo11523() != -1) {
            throw new IllegalArgumentException();
        }
        this.f54528 = interfaceC14548;
        this.f54529 = abstractC6664;
        this.f54533 = enumC21706;
        this.f54531 = set;
        this.f54530 = c16051;
        this.f54532 = interfaceC5323;
    }

    /* JADX INFO: renamed from: ܺ */
    public final EnumC14710 m41589() {
        return this.f54529.f17193;
    }

    /* JADX INFO: renamed from: ۡ */
    public C4848 mo41585() {
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m41583() {
        return this.f54531.contains(EnumC21417.MANDATORY);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC21706 m41593() {
        return this.f54533;
    }

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC19740 m41586() {
        C16051 c16051 = this.f54530;
        if (c16051 == null) {
            return null;
        }
        return c16051.f46464;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C16051 m41591() {
        return this.f54530;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m41584() {
        InterfaceC5323 interfaceC5323 = this.f54532;
        if (interfaceC5323 == null) {
            return -1;
        }
        return interfaceC5323.mo11526();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m41594() {
        InterfaceC5323 interfaceC5323 = this.f54532;
        if (interfaceC5323 == null) {
            return -1;
        }
        return interfaceC5323.mo11523();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m41588() {
        InterfaceC5323 interfaceC5323 = this.f54532;
        if (interfaceC5323 == null) {
            return -1;
        }
        return interfaceC5323.mo11524(this.f54530.f46462);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC5323 m41592() {
        return this.f54532;
    }

    @Override // p067l.InterfaceC13765
    public final long getLineNumber() {
        if (this.f54534 == null) {
            this.f54534 = new C4177(this);
        }
        return this.f54534.m8456();
    }

    @Override // p067l.InterfaceC13765
    public final long getColumnNumber() {
        if (this.f54534 == null) {
            this.f54534 = new C4177(this);
        }
        return this.f54534.m8455();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object[] m41590() {
        return this.f54529.f17190;
    }

    public final String toString() {
        return this.f54528.mo10703(this, Locale.getDefault());
    }

    @Override // p067l.InterfaceC13765
    /* JADX INFO: renamed from: ֫ */
    public final EnumC8400 mo31352() {
        int iOrdinal = this.f54529.f17193.ordinal();
        if (iOrdinal == 1) {
            return EnumC8400.NOTE;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return EnumC8400.ERROR;
            }
            return EnumC8400.OTHER;
        }
        if (this.f54531.contains(EnumC21417.MANDATORY)) {
            return EnumC8400.MANDATORY_WARNING;
        }
        return EnumC8400.WARNING;
    }

    @Override // p067l.InterfaceC13765
    /* JADX INFO: renamed from: ۧ */
    public final String mo31353() {
        return this.f54529.m15176();
    }

    @Override // p067l.InterfaceC13765
    /* JADX INFO: renamed from: ֫ */
    public final String mo31351(Locale locale) {
        return this.f54528.mo10700(this, locale);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41587(EnumC21417 enumC21417) {
        Set set = this.f54531;
        set.add(enumC21417);
        if (this.f54529.f17193 == EnumC14710.ERROR) {
            int iOrdinal = enumC21417.ordinal();
            if (iOrdinal == 1) {
                set.add(EnumC21417.RECOVERABLE);
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                set.remove(EnumC21417.RECOVERABLE);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41582(EnumC21417 enumC21417) {
        return this.f54531.contains(enumC21417);
    }
}
