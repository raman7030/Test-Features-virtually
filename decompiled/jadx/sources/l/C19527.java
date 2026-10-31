package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBAU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19527 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19611 f63098;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13012 f63099;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f63100;

    public C19527(C13012 c13012, int[] iArr, C19611 c19611) {
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c19611 == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f63099 = c13012;
        this.f63100 = iArr;
        this.f63098 = c19611;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44932() {
        C17246 c17246M31591 = this.f63099.m31591();
        int size = c17246M31591.size();
        for (int i = 0; i < size; i++) {
            if (c17246M31591.m41002get(i).m38915().mo3533().size() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m44931() {
        HashSet hashSet = new HashSet(20);
        C17246 c17246M31591 = this.f63099.m31591();
        int size = c17246M31591.size();
        for (int i = 0; i < size; i++) {
            InterfaceC10711 interfaceC10711Mo3533 = c17246M31591.m41002get(i).m38915().mo3533();
            int size2 = interfaceC10711Mo3533.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(interfaceC10711Mo3533.getType(i2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8321 m44930() {
        int[] iArr;
        C5499 c5499;
        C19527 c19527 = this;
        int[] iArr2 = c19527.f63100;
        int length = iArr2.length;
        C17246 c17246M31591 = c19527.f63099.m31591();
        ArrayList arrayList = new ArrayList(length);
        C5499 c54910 = C5499.f17054;
        C16540 c16540 = null;
        C16540 c16541 = null;
        int i = 0;
        while (true) {
            C19611 c19611 = c19527.f63098;
            if (i < length) {
                C16540 c16540M40535 = c17246M31591.m40535(iArr2[i]);
                if (c16540M40535.m38912()) {
                    C21064 c21064M38911 = c16540M40535.m38911();
                    int size = c21064M38911.size();
                    int iM38913 = c16540M40535.m38913();
                    InterfaceC10711 interfaceC10711Mo3533 = c16540M40535.m38915().mo3533();
                    int size2 = interfaceC10711Mo3533.size();
                    if (size2 == 0) {
                        c5499 = C5499.f17054;
                        iArr = iArr2;
                    } else if ((iM38913 != -1 || size == size2) && (iM38913 == -1 || (size == size2 + 1 && iM38913 == c21064M38911.get(size2)))) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (interfaceC10711Mo3533.getType(i2).equals(C7573.f23412)) {
                                size2 = i2 + 1;
                                break;
                            }
                        }
                        C5499 c54911 = new C5499(size2);
                        int i3 = 0;
                        while (i3 < size2) {
                            c54911.m15634(i3, new C12512(interfaceC10711Mo3533.getType(i3)), c19611.m45051(c21064M38911.get(i3)).m13990());
                            i3++;
                            iArr2 = iArr2;
                        }
                        iArr = iArr2;
                        c54911.mo20349();
                        c5499 = c54911;
                    } else {
                        throw new RuntimeException("shouldn't happen: weird successors list");
                    }
                    if (c54910.size() != 0) {
                        if (c54910.equals(c5499)) {
                            if (c16540 == null) {
                                throw new NullPointerException("start == null");
                            }
                            if (c19611.m45052(c16540M40535).m13990() - c19611.m45053(c16540).m13990() <= 65535) {
                                c16541 = c16540M40535;
                            }
                        }
                        if (c54910.size() != 0) {
                            arrayList.add(new C1265(c19611.m45053(c16540).m13990(), c19611.m45052(c16541).m13990(), c54910));
                        }
                        c16540 = c16540M40535;
                        c16541 = c16540;
                        c54910 = c5499;
                    } else {
                        c16540 = c16540M40535;
                        c16541 = c16540;
                        c54910 = c5499;
                    }
                } else {
                    iArr = iArr2;
                }
                i++;
                c19527 = this;
                iArr2 = iArr;
            } else {
                if (c54910.size() != 0) {
                    arrayList.add(new C1265(c19611.m45053(c16540).m13990(), c19611.m45052(c16541).m13990(), c54910));
                }
                int size3 = arrayList.size();
                if (size3 != 0) {
                    C8321 c8321 = new C8321(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        c8321.m40982(i4, (C1265) arrayList.get(i4));
                    }
                    c8321.mo20349();
                    return c8321;
                }
                return C8321.f25533;
            }
        }
    }
}
