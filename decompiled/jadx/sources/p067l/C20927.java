package p067l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBAU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20927 {

    /* JADX INFO: renamed from: ֫ */
    public final C21007 f65718;

    /* JADX INFO: renamed from: ۧ */
    public final C14735 f65719;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f65720;

    public C20927(C14735 c14735, int[] iArr, C21007 c21007) {
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c21007 == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f65719 = c14735;
        this.f65720 = iArr;
        this.f65718 = c21007;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m47230() {
        C18759 c18759M33676 = this.f65719.m33676();
        int size = c18759M33676.size();
        for (int i = 0; i < size; i++) {
            if (c18759M33676.m56522get(i).m41141().mo5820().size() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final HashSet m47229() {
        HashSet hashSet = new HashSet(20);
        C18759 c18759M33676 = this.f65719.m33676();
        int size = c18759M33676.size();
        for (int i = 0; i < size; i++) {
            InterfaceC12548 interfaceC12548Mo5820 = c18759M33676.m56522get(i).m41141().mo5820();
            int size2 = interfaceC12548Mo5820.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(interfaceC12548Mo5820.getType(i2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10277 m47228() {
        int[] iArr;
        C7595 c7595;
        C20927 c20927 = this;
        int[] iArr2 = c20927.f65720;
        int length = iArr2.length;
        C18759 c18759M33676 = c20927.f65719.m33676();
        ArrayList arrayList = new ArrayList(length);
        C7595 c7596 = C7595.f19893;
        C18088 c18088 = null;
        C18088 c18089 = null;
        int i = 0;
        while (true) {
            C21007 c21007 = c20927.f65718;
            if (i < length) {
                C18088 c18088M42784 = c18759M33676.m42784(iArr2[i]);
                if (c18088M42784.m41138()) {
                    C22388 c22388M41137 = c18088M42784.m41137();
                    int size = c22388M41137.size();
                    int iM41139 = c18088M42784.m41139();
                    InterfaceC12548 interfaceC12548Mo5820 = c18088M42784.m41141().mo5820();
                    int size2 = interfaceC12548Mo5820.size();
                    if (size2 == 0) {
                        c7595 = C7595.f19893;
                        iArr = iArr2;
                    } else if ((iM41139 != -1 || size == size2) && (iM41139 == -1 || (size == size2 + 1 && iM41139 == c22388M41137.get(size2)))) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (interfaceC12548Mo5820.getType(i2).equals(C9566.f26324)) {
                                size2 = i2 + 1;
                                break;
                            }
                        }
                        C7595 c7597 = new C7595(size2);
                        int i3 = 0;
                        while (i3 < size2) {
                            c7597.m17545(i3, new C14260(interfaceC12548Mo5820.getType(i3)), c21007.m47347(c22388M41137.get(i3)).m15870());
                            i3++;
                            iArr2 = iArr2;
                        }
                        iArr = iArr2;
                        c7597.mo22326();
                        c7595 = c7597;
                    } else {
                        throw new RuntimeException("shouldn't happen: weird successors list");
                    }
                    if (c7596.size() != 0) {
                        if (c7596.equals(c7595)) {
                            if (c18088 == null) {
                                throw new NullPointerException("start == null");
                            }
                            if (c21007.m47348(c18088M42784).m15870() - c21007.m47349(c18088).m15870() <= 65535) {
                                c18089 = c18088M42784;
                            }
                        }
                        if (c7596.size() != 0) {
                            arrayList.add(new C3571(c21007.m47349(c18088).m15870(), c21007.m47348(c18089).m15870(), c7596));
                        }
                        c18088 = c18088M42784;
                        c18089 = c18088;
                        c7596 = c7595;
                    } else {
                        c18088 = c18088M42784;
                        c18089 = c18088;
                        c7596 = c7595;
                    }
                } else {
                    iArr = iArr2;
                }
                i++;
                c20927 = this;
                iArr2 = iArr;
            } else {
                if (c7596.size() != 0) {
                    arrayList.add(new C3571(c21007.m47349(c18088).m15870(), c21007.m47348(c18089).m15870(), c7596));
                }
                int size3 = arrayList.size();
                if (size3 != 0) {
                    C10277 c10277 = new C10277(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        c10277.m43242(i4, (C3571) arrayList.get(i4));
                    }
                    c10277.mo22326();
                    return c10277;
                }
                return C10277.f28444;
            }
        }
    }
}
