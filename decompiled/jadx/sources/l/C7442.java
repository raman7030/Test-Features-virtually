package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۟ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7442 extends C10971 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set f22857;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12216 f22858;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f22859;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC10930 f22860;

    public C7442(EnumC22094 enumC22094, long j, long j2, C12216 c12216, EnumC10930 enumC10930, Set set, int i) {
        super(33, enumC22094, EnumC22799.SMB2_QUERY_DIRECTORY, j, j2, i);
        this.f22860 = enumC10930;
        this.f22857 = set;
        this.f22858 = c12216;
        this.f22859 = "*";
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        c0097.m26075((byte) this.f22860.getValue());
        c0097.m26075((byte) C15262.m36277(this.f22857));
        c0097.m26088(0L);
        this.f22858.m29707(c0097);
        c0097.m26086(96);
        String str = this.f22859;
        c0097.m26086(str.length() * 2);
        c0097.m26088(Math.min(mo7975(), ((C23670) mo3028()).m52214() * 65536));
        c0097.m26089(str, C8208.f25222);
    }
}
