package p067l;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19372 extends AbstractC10298 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f57823;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayList f57824;

    /* JADX INFO: renamed from: ۤ */
    public List f57825;

    /* JADX INFO: renamed from: ۨ */
    public List f57826;

    /* JADX INFO: renamed from: ۫ */
    public final C11326 f57827;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f57828;

    /* JADX INFO: renamed from: ᩺ */
    public final ArrayList f57829;

    public C19372(C24538 c24538, C7972 c7972) throws IOException {
        ArrayList arrayList;
        super(c24538);
        this.f57823 = new ArrayList();
        this.f57828 = new ArrayList();
        this.f57824 = new ArrayList();
        this.f57829 = new ArrayList();
        int iM18455 = c7972.m18455();
        C4263 c4263M8665 = C4263.m8665(c7972);
        c4263M8665.m8668(512);
        this.f28480 = c7972.m18461();
        this.f28479 = c7972.m18456(128);
        int iM18461 = c7972.m18461();
        c7972.m18454();
        int iM18462 = c7972.m18461();
        c7972.m18454();
        int iM18463 = c4263M8665.f9454 >= 288 ? c7972.m18461() : 0;
        c7972.m18459(iM18461 + iM18455);
        C11326 c11326 = new C11326(c7972);
        c7972.m18459(iM18462 + iM18455);
        C11326 c11327 = new C11326(c7972);
        this.f57827 = c11327;
        this.f57826 = new C12667(c11326);
        this.f57825 = new C18030(c11327);
        C4263 c4263M8666 = C4263.m8665(c7972);
        int i = iM18455 + c4263M8665.f9453;
        SparseArray sparseArray = new SparseArray();
        while (true) {
            short s = c4263M8666.f9456;
            if (s == 515) {
                int iM18464 = c7972.m18461();
                ArrayList arrayList2 = this.f57823;
                arrayList2.ensureCapacity(iM18464);
                for (int i2 = 0; i2 < iM18464; i2++) {
                    arrayList2.add(new C15820(c7972));
                }
            } else if (s == 516) {
                C9786 c9786 = new C9786(c7972);
                this.f57828.add(c9786);
                int iM18456 = c7972.m18455();
                C4263 c4263M8667 = C4263.m8665(c7972);
                while (true) {
                    short s2 = c4263M8667.f9456;
                    arrayList = c9786.f27029;
                    if (s2 != 517) {
                        break;
                    }
                    int iM18465 = c7972.m18461();
                    int iM18466 = c7972.m18461();
                    C17441 c17441 = new C17441(iM18466);
                    for (int i3 = 0; i3 < iM18466; i3++) {
                        c17441.add(c7972.m18461());
                    }
                    arrayList.add(new C3949(iM18465, c17441));
                    iM18456 = c7972.m18455();
                    c4263M8667 = C4263.m8665(c7972);
                }
                arrayList.trimToSize();
                c7972.m18459(iM18456);
            } else if (s == 518) {
                this.f57824.add(new C18701(c7972));
            } else if (s == 514) {
                C24736 c24736 = new C24736(this, c7972, c4263M8666);
                this.f57829.add(c24736);
                sparseArray.put(c24736.mo5199(), c24736);
            } else {
                if (s != 513) {
                    if (s != -1 && s != 512) {
                        System.err.printf("Skip arsc chunk: %04x\n", Short.valueOf(s));
                    }
                    c7972.m18459(i);
                    return;
                }
                int iM18457 = c7972.m18457() - iM18463;
                C24736 c24737 = (C24736) sparseArray.get(iM18457);
                if (c24737 == null) {
                    throw new IOException(C20778.m46922(iM18457, "Can not find ArscType with id of "));
                }
                c24737.m54398(new C8445(c24737, c7972, c4263M8666));
            }
            int i4 = c4263M8666.f9455 + c4263M8666.f9453;
            if (i4 >= i) {
                c7972.m18459(i);
                return;
            } else {
                c7972.m18459(i4);
                c4263M8666 = C4263.m8665(c7972);
            }
        }
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۗ */
    public final int mo14715() {
        return this.f57829.size();
    }

    @Override // p067l.InterfaceC6434
    public final InterfaceC3080 getType(int i) {
        return (C24736) this.f57829.get(i);
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    public final InterfaceC3080 getType(String str) {
        return (C24736) super.getType(str);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo14718() {
        return this.f57823.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC11128 mo14713(int i) {
        return (C15820) this.f57823.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֡ */
    public final int mo14708() {
        return this.f57828.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC17832 mo14720(int i) {
        return (C9786) this.f57828.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo14710() {
        return this.f57824.size();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20516 mo14716(int i) {
        return (C18701) this.f57824.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo14717() {
        return this.f57826;
    }

    /* JADX INFO: renamed from: ۜ */
    public final List m44105() {
        return this.f57825;
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo14711() {
        return (C24538) super.mo14711();
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֫ */
    public final C24538 mo14711() {
        return (C24538) super.mo14711();
    }
}
