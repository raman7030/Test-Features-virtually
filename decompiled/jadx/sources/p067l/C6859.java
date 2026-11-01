package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6859 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC19740 f17827;

    /* JADX INFO: renamed from: ۜ */
    public HashSet f17828;

    /* JADX INFO: renamed from: ۧ */
    public EnumC21612 f17829;

    /* JADX INFO: renamed from: ܳ */
    public final String f17830;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC19740 f17831;

    /* JADX INFO: renamed from: ܿ */
    public final C23623 f17832;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC21706 f17833;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f17834;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC17840 f17835;

    public C6859(C23623 c23623, EnumC17840 enumC17840, boolean z, String str, EnumC21706 enumC21706) {
        this.f17832 = c23623;
        this.f17835 = enumC17840;
        this.f17834 = z;
        this.f17830 = str;
        this.f17833 = enumC21706;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15720(InterfaceC5323 interfaceC5323, C12895 c12895) {
        C23623 c23623 = this.f17832;
        InterfaceC19740 interfaceC19740M52457 = c23623.m52457();
        if (this.f17834) {
            if (this.f17828 == null) {
                this.f17828 = new HashSet();
            }
            if (c23623.f75177 >= c23623.f75189) {
                EnumC21612 enumC21612 = this.f17829;
                if (enumC21612 == null) {
                    if (this.f17828.contains(interfaceC19740M52457)) {
                        this.f17829 = EnumC21612.ADDITIONAL_IN_FILE;
                    } else {
                        this.f17829 = EnumC21612.IN_FILE;
                    }
                    this.f17831 = interfaceC19740M52457;
                    this.f17827 = interfaceC19740M52457;
                    return;
                }
                if ((enumC21612 == EnumC21612.IN_FILE || enumC21612 == EnumC21612.ADDITIONAL_IN_FILE) && !C12826.equals(this.f17831, interfaceC19740M52457)) {
                    this.f17829 = EnumC21612.ADDITIONAL_IN_FILES;
                    this.f17827 = null;
                    return;
                }
                return;
            }
            c23623.m9360(this.f17833, interfaceC5323, c12895);
            this.f17828.add(interfaceC19740M52457);
            return;
        }
        EnumC21612 enumC21613 = this.f17829;
        if (enumC21613 == null) {
            this.f17829 = EnumC21612.IN_FILE;
            this.f17831 = interfaceC19740M52457;
            this.f17827 = interfaceC19740M52457;
        } else {
            if (enumC21613 != EnumC21612.IN_FILE || C12826.equals(this.f17831, interfaceC19740M52457)) {
                return;
            }
            this.f17829 = EnumC21612.IN_FILES;
            this.f17827 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15719() {
        EnumC21612 enumC21612 = this.f17829;
        if (enumC21612 != null) {
            InterfaceC19740 interfaceC19740 = this.f17827;
            EnumC17840 enumC17840 = this.f17835;
            String str = this.f17830;
            if (interfaceC19740 == null) {
                if (enumC17840 != null) {
                    m15718(this.f17831, enumC21612.m48817(str), enumC17840);
                } else {
                    m15718(this.f17831, enumC21612.m48817(str), new Object[0]);
                }
            } else if (enumC17840 != null) {
                m15718(this.f17831, enumC21612.m48817(str), this.f17827, enumC17840);
            } else {
                m15718(this.f17831, enumC21612.m48817(str), this.f17827);
            }
            if (this.f17834) {
                return;
            }
            m15718(this.f17831, str.concat(".recompile"), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15718(InterfaceC19740 interfaceC19740, String str, Object... objArr) {
        this.f17832.m9357(interfaceC19740, new C15380("compiler", str, objArr));
    }
}
