package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۨۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11676 extends C16614 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Set f34788;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public UUID f34789;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Set f34790;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f34791;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f34792;

    public C11676(EnumSet enumSet, UUID uuid, boolean z, EnumSet enumSet2, byte[] bArr) {
        List list;
        ArrayList arrayList;
        super(36, EnumC22094.UNKNOWN, EnumC22799.SMB2_NEGOTIATE, 0L, 0L);
        this.f34788 = enumSet;
        this.f34789 = uuid;
        this.f34792 = z;
        this.f34790 = enumSet2;
        if (enumSet.contains(EnumC22094.SMB_3_1_1)) {
            arrayList = new ArrayList();
            arrayList.add(new C21886(bArr, Arrays.asList(EnumC5326.SHA_512)));
            if (enumSet2.contains(EnumC5866.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                list = arrayList;
                arrayList.add(new C0718(Arrays.asList(EnumC0386.AES_256_GCM, EnumC0386.AES_256_CCM, EnumC0386.AES_128_GCM, EnumC0386.AES_128_CCM)));
                list = arrayList;
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        list = arrayList;
        this.f34791 = list;
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        int i;
        int i2 = this.f51046;
        c0097.m26086(i2);
        Set set = this.f34788;
        c0097.m26086(set.size());
        c0097.m26086(this.f34792 ? 2 : 1);
        c0097.m1082(2);
        if (EnumC22094.m49679(set)) {
            c0097.m26088(C15262.m36277(this.f34790));
        } else {
            c0097.m1081();
        }
        UUID uuid = this.f34789;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        c0097.m26088(mostSignificantBits >>> 32);
        c0097.m26086((int) ((mostSignificantBits >>> 16) & 65535));
        c0097.m26086((int) (mostSignificantBits & 65535));
        AbstractC23024.f74107.mo17001(c0097, leastSignificantBits);
        boolean zContains = set.contains(EnumC22094.SMB_3_1_1);
        List list = this.f34791;
        if (zContains) {
            c0097.m26088((set.size() * 2) + i2 + 64 + (8 - (((set.size() * 2) + i2) % 8)));
            c0097.m26086(list.size());
            c0097.m1080();
        } else {
            c0097.m1082(8);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c0097.m26086(((EnumC22094) it.next()).getValue());
        }
        int size = ((set.size() * 2) + i2) % 8;
        if (size > 0) {
            c0097.m1082(8 - size);
        }
        if (set.contains(EnumC22094.SMB_3_1_1)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iM4924 = ((AbstractC1424) list.get(i3)).m4924(c0097);
                if (i3 < list.size() - 1 && (i = iM4924 % 8) != 0) {
                    c0097.m1082(8 - i);
                }
            }
        }
    }
}
