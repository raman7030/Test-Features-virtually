package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22964 extends C16614 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22984 f73956;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73957;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73958;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f73959;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f73960;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public UUID f73961;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumSet f73962 = EnumSet.noneOf(EnumC5866.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f73963;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f73964;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        int iM26100;
        int iM26101;
        ?? arrayList;
        c0097.m26096(2);
        this.f73958 = c0097.m26100();
        EnumC22094 enumC22094M49678 = EnumC22094.m49678(c0097.m26100());
        this.f73960 = enumC22094M49678;
        EnumC22094 enumC22094 = EnumC22094.SMB_3_1_1;
        if (enumC22094M49678 == enumC22094) {
            iM26100 = c0097.m26100();
        } else {
            c0097.m26096(2);
            iM26100 = 0;
        }
        this.f73961 = new UUID((((c0097.m26082() << 16) | ((long) c0097.m26100())) << 16) | ((long) c0097.m26100()), AbstractC23024.f74107.mo17000(c0097));
        this.f73962 = C15262.m36278(c0097.m26082(), EnumC5866.class);
        this.f73957 = c0097.m26099();
        this.f73964 = c0097.m26099();
        this.f73963 = c0097.m26099();
        this.f73956 = C13811.m33143(c0097);
        C13811.m33143(c0097);
        int iM26102 = c0097.m26100();
        int iM26103 = c0097.m26100();
        if (this.f73960 == enumC22094) {
            iM26101 = c0097.m26100();
        } else {
            c0097.m26096(2);
            iM26101 = 0;
        }
        if (iM26103 > 0) {
            c0097.m26097(iM26102);
            c0097.m26094(iM26103);
        }
        if (this.f73960 == enumC22094) {
            c0097.m26097(iM26101);
            try {
                arrayList = new ArrayList();
                for (int i = 0; i < iM26100; i++) {
                    arrayList.add(AbstractC1424.m4921(c0097));
                }
            } catch (C13146 e) {
                throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        this.f73959 = arrayList;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m51098() {
        return this.f73958;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC22094 m51105() {
        return this.f73960;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID m51103() {
        return this.f73961;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set m51099() {
        return this.f73962;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m51100() {
        return this.f73957;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m51101() {
        return this.f73964;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m51102() {
        return this.f73963;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22984 m51104() {
        return this.f73956;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m51097() {
        return this.f73959;
    }
}
