package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.۟ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9441 extends C12795 {

    /* JADX INFO: renamed from: ۜ */
    public final Set f25769;

    /* JADX INFO: renamed from: ܳ */
    public final C13978 f25770;

    /* JADX INFO: renamed from: ᩷ */
    public final String f25771;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC12756 f25772;

    public C9441(EnumC23366 enumC23366, long j, long j2, C13978 c13978, EnumC12756 enumC12756, Set set, int i) {
        super(33, enumC23366, EnumC24036.SMB2_QUERY_DIRECTORY, j, j2, i);
        this.f25772 = enumC12756;
        this.f25769 = set;
        this.f25770 = c13978;
        this.f25771 = "*";
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        c2460.m28100((byte) this.f25772.getValue());
        c2460.m28100((byte) C16873.m38438(this.f25769));
        c2460.m28113(0L);
        this.f25770.m31769(c2460);
        c2460.m28111(96);
        String str = this.f25771;
        c2460.m28111(str.length() * 2);
        c2460.m28113(Math.min(mo10023(), ((C24864) mo5341()).m54617() * 65536));
        c2460.m28114(str, C10169.f28132);
    }
}
