package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9GP */
/* JADX INFO: loaded from: classes2.dex */
public final class C23523 extends C18158 {

    /* JADX INFO: renamed from: ۜ */
    public final Set f74948;

    /* JADX INFO: renamed from: ۡ */
    public final Set f74949;

    /* JADX INFO: renamed from: ۢ */
    public final C18139 f74950;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC9955 f74951;

    /* JADX INFO: renamed from: ܿ */
    public final Set f74952;

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC13308 f74953;

    /* JADX INFO: renamed from: ᩻ */
    public final Set f74954;

    public C23523(EnumC23366 enumC23366, long j, long j2, EnumC13308 enumC13308, Set set, Set set2, Set set3, EnumC9955 enumC9955, Set set4, C18139 c18139) {
        super(57, enumC23366, EnumC24036.SMB2_CREATE, j, j2);
        this.f74953 = enumC13308 != null ? enumC13308 : EnumC13308.Identification;
        this.f74952 = set;
        this.f74948 = set2 == null ? EnumSet.noneOf(EnumC4038.class) : set2;
        this.f74949 = set3 == null ? EnumSet.noneOf(EnumC8771.class) : set3;
        this.f74951 = enumC9955 != null ? enumC9955 : EnumC9955.FILE_OPEN_IF;
        this.f74954 = set4 == null ? EnumSet.noneOf(EnumC16659.class) : set4;
        this.f74950 = c18139;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        byte[] bArrM27389;
        int i = this.f54223;
        c2460.m28111(i);
        c2460.m28100((byte) 0);
        c2460.m28100((byte) 0);
        c2460.m28113(this.f74953.getValue());
        c2460.m3478(8);
        c2460.m3478(8);
        c2460.m28113(C16873.m38438(this.f74952));
        c2460.m28113(C16873.m38438(this.f74948));
        c2460.m28113(C16873.m38438(this.f74949));
        c2460.m28113(this.f74951.getValue());
        c2460.m28113(C16873.m38438(this.f74954));
        int i2 = i + 63;
        String strM41321 = this.f74950.m41321();
        if (strM41321 == null || strM41321.trim().length() == 0) {
            c2460.m28111(i2);
            c2460.m28111(0);
            bArrM27389 = new byte[1];
        } else {
            bArrM27389 = C11967.m27389(strM41321);
            c2460.m28111(i2);
            c2460.m28111(bArrM27389.length);
        }
        c2460.m28113(0L);
        c2460.m28113(0L);
        c2460.m28102(bArrM27389.length, bArrM27389);
    }
}
