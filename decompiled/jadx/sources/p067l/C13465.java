package p067l;

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
public final class C13465 extends C18158 {

    /* JADX INFO: renamed from: ۜ */
    public Set f37787;

    /* JADX INFO: renamed from: ܳ */
    public UUID f37788;

    /* JADX INFO: renamed from: ܿ */
    public Set f37789;

    /* JADX INFO: renamed from: ᩷ */
    public List f37790;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f37791;

    public C13465(EnumSet enumSet, UUID uuid, boolean z, EnumSet enumSet2, byte[] bArr) {
        List list;
        ArrayList arrayList;
        super(36, EnumC23366.UNKNOWN, EnumC24036.SMB2_NEGOTIATE, 0L, 0L);
        this.f37787 = enumSet;
        this.f37788 = uuid;
        this.f37791 = z;
        this.f37789 = enumSet2;
        if (enumSet.contains(EnumC23366.SMB_3_1_1)) {
            arrayList = new ArrayList();
            arrayList.add(new C23169(bArr, Arrays.asList(EnumC7430.SHA_512)));
            if (enumSet2.contains(EnumC7943.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                list = arrayList;
                arrayList.add(new C3051(Arrays.asList(EnumC2735.AES_256_GCM, EnumC2735.AES_256_CCM, EnumC2735.AES_128_GCM, EnumC2735.AES_128_CCM)));
                list = arrayList;
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        list = arrayList;
        this.f37790 = list;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        int i;
        int i2 = this.f54223;
        c2460.m28111(i2);
        Set set = this.f37787;
        c2460.m28111(set.size());
        c2460.m28111(this.f37791 ? 2 : 1);
        c2460.m3478(2);
        if (EnumC23366.m52017(set)) {
            c2460.m28113(C16873.m38438(this.f37789));
        } else {
            c2460.m3477();
        }
        UUID uuid = this.f37788;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        c2460.m28113(mostSignificantBits >>> 32);
        c2460.m28111((int) ((mostSignificantBits >>> 16) & 65535));
        c2460.m28111((int) (mostSignificantBits & 65535));
        AbstractC24250.f76846.mo18932(c2460, leastSignificantBits);
        boolean zContains = set.contains(EnumC23366.SMB_3_1_1);
        List list = this.f37790;
        if (zContains) {
            c2460.m28113((set.size() * 2) + i2 + 64 + (8 - (((set.size() * 2) + i2) % 8)));
            c2460.m28111(list.size());
            c2460.m3476();
        } else {
            c2460.m3478(8);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c2460.m28111(((EnumC23366) it.next()).getValue());
        }
        int size = ((set.size() * 2) + i2) % 8;
        if (size > 0) {
            c2460.m3478(8 - size);
        }
        if (set.contains(EnumC23366.SMB_3_1_1)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iM7166 = ((AbstractC3722) list.get(i3)).m7166(c2460);
                if (i3 < list.size() - 1 && (i = iM7166 % 8) != 0) {
                    c2460.m3478(8 - i);
                }
            }
        }
    }
}
