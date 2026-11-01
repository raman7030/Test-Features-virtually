package p067l;

import android.annotation.TargetApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12310 implements InterfaceC3080 {

    /* JADX INFO: renamed from: ۙ */
    public int f34362;

    /* JADX INFO: renamed from: ᩶ */
    public BitSet f34363;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC10298 f34364;

    /* JADX INFO: renamed from: ᩹ */
    public C12472 f34365;

    public AbstractC12310(AbstractC10298 abstractC10298, int i) {
        this.f34364 = abstractC10298;
        this.f34362 = i;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܳ */
    public boolean mo5204(int i) {
        BitSet bitSet = this.f34363;
        return bitSet != null && bitSet.get(i);
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public int mo5208(int i) {
        C12472 c12472 = this.f34365;
        if (c12472 == null) {
            return 0;
        }
        return c12472.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28354(int i, boolean z) {
        if (z) {
            if (this.f34363 == null) {
                this.f34363 = new BitSet();
            }
            this.f34363.set(i);
        } else {
            BitSet bitSet = this.f34363;
            if (bitSet != null) {
                bitSet.clear(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28353(int i, int i2) {
        if (((mo5203().mo14712().m28290() | 1610874879) & i2) != 0) {
            throw new IllegalArgumentException("Extra typeSpec flags contain supported bits");
        }
        if (i2 != 0) {
            if (this.f34365 == null) {
                this.f34365 = new C12472();
            }
            this.f34365.mo25657(i, i2);
        } else {
            C12472 c12472 = this.f34365;
            if (c12472 != null) {
                c12472.remove(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28352(C7972 c7972, C4263 c4263) throws IOException {
        int i = c4263.f9455;
        int i2 = c4263.f9453;
        long j = ((long) i) + ((long) i2);
        long jM18455 = ((long) c7972.m18455()) + ((long) c7972.m18451());
        int i3 = c4263.f9454;
        if (i3 < 16 || i2 < i3 || j > jM18455) {
            throw new IOException("Invalid typeSpec header");
        }
        c7972.m18459(i + 8);
        this.f34362 = c7972.m18457();
        c7972.m18462(3);
        int iM18461 = c7972.m18461();
        long j2 = (((long) iM18461) * 4) + ((long) i) + ((long) i3);
        if (iM18461 >= 0 && iM18461 <= 65536 && j2 <= j) {
            c7972.m18459(i + i3);
            for (int i4 = 0; i4 < iM18461; i4++) {
                int iM18462 = c7972.m18461();
                m28354(i4, (536870912 & iM18462) != 0);
                m28353(i4, iM18462 & (~(mo5203().mo14712().m28290() | 1610874879)));
            }
            return iM18461;
        }
        throw new IOException("Invalid typeSpec entry count");
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11799 mo5198() {
        return this.f34364.mo14711();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC6434 mo5203() {
        return this.f34364;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۘ֫ */
    public final int mo5199() {
        return this.f34362;
    }

    @Override // p067l.InterfaceC3080
    public final String getTypeName() {
        try {
            return (String) mo5203().mo14717().get(this.f34362 - 1);
        } catch (IndexOutOfBoundsException unused) {
            return "ERROR-ID" + this.f34362;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m28355() {
        return new C13651(mo5200(), new InterfaceC14680() { // from class: l.ۙᩳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C5293.m11447(this, obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object get(int i) {
                return this.f18070.mo5206(i);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ Object get(Object obj) {
                return C5293.m11448(this, obj);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ boolean mo4793(int i) {
                return true;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ Object mo4687() {
                return null;
            }

            @Override // p067l.InterfaceC14680, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4686(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܽۧ */
    public ArrayList mo5205() {
        ArrayList arrayList = new ArrayList(mo5200());
        C13651 c13651 = (C13651) m28355();
        c13651.iterator();
        while (c13651.hasNext()) {
            arrayList.add((InterfaceC9116) c13651.next());
        }
        Collections.sort(arrayList, new C21698());
        return arrayList;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public final String mo5197(C21658 c21658) {
        int iMo5207 = mo5207();
        int iMo5200 = mo5200();
        InterfaceC9116[] interfaceC9116Arr = new InterfaceC9116[iMo5200];
        for (int i = 0; i < iMo5200; i++) {
            interfaceC9116Arr[i] = mo5206(i);
        }
        for (int i2 = 0; i2 < iMo5207; i2++) {
            for (int i3 = 0; i3 < iMo5200; i3++) {
                InterfaceC9116 interfaceC9116 = interfaceC9116Arr[i3];
                if (interfaceC9116.mo4718(i2)) {
                    String strMo4719 = interfaceC9116.mo4719(i2);
                    if (!c21658.mo12311(strMo4719)) {
                        break;
                    }
                    return strMo4719;
                }
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ֫ */
    public int mo5196(InterfaceC17161 interfaceC17161) {
        int iMo5207 = mo5207();
        int iMo5200 = mo5200();
        InterfaceC9116[] interfaceC9116Arr = new InterfaceC9116[iMo5200];
        for (int i = 0; i < iMo5200; i++) {
            interfaceC9116Arr[i] = mo5206(i);
        }
        for (int i2 = 0; i2 < iMo5207; i2++) {
            for (int i3 = 0; i3 < iMo5200; i3++) {
                InterfaceC9116 interfaceC9116 = interfaceC9116Arr[i3];
                if (interfaceC9116.mo4718(i2)) {
                    if (!interfaceC17161.mo12311(interfaceC9116.mo4719(i2))) {
                        break;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC3080
    public final String getPath() {
        return mo5203().getPath() + "/" + getTypeName();
    }

    public final String toString() {
        return getPath();
    }

    @Override // p067l.InterfaceC10457
    @TargetApi(24)
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC3080 interfaceC3080 = (InterfaceC3080) interfaceC10457;
        if (this.f34362 != interfaceC3080.mo5199()) {
            throw new RuntimeException(getPath());
        }
        if (mo5200() != interfaceC3080.mo5200()) {
            throw new RuntimeException(getPath());
        }
        if (!C12826.equals(getTypeName(), interfaceC3080.getTypeName())) {
            throw new RuntimeException(getPath());
        }
        List list = (List) C16474.stream(C21230.spliterator(mo5201()), false).sorted(new C5604(0)).collect(C24205.toList());
        List list2 = (List) C16474.stream(C21230.spliterator(interfaceC3080.mo5201()), false).sorted(new C14991(0)).collect(C24205.toList());
        for (int i = 0; i < mo5200(); i++) {
            ((InterfaceC9116) list.get(i)).mo14241((InterfaceC10457) list2.get(i));
            System.out.println("check ok " + ((InterfaceC9116) list.get(i)).getPath());
        }
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ */
    public Iterable mo5201() {
        return m28355();
    }
}
