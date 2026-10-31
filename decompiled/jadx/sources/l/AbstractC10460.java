package l;

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
public abstract class AbstractC10460 implements InterfaceC0748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31399;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BitSet f31400;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC8343 f31401;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10630 f31402;

    public AbstractC10460(AbstractC8343 abstractC8343, int i) {
        this.f31401 = abstractC8343;
        this.f31399 = i;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܳ */
    public boolean mo2875(int i) {
        BitSet bitSet = this.f31400;
        return bitSet != null && bitSet.get(i);
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public int mo2879(int i) {
        C10630 c10630 = this.f31402;
        if (c10630 == null) {
            return 0;
        }
        return c10630.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26324(int i, boolean z) {
        if (z) {
            if (this.f31400 == null) {
                this.f31400 = new BitSet();
            }
            this.f31400.set(i);
        } else {
            BitSet bitSet = this.f31400;
            if (bitSet != null) {
                bitSet.clear(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26323(int i, int i2) {
        if (((mo2874().mo12848().m26261() | 1610874879) & i2) != 0) {
            throw new IllegalArgumentException("Extra typeSpec flags contain supported bits");
        }
        if (i2 != 0) {
            if (this.f31402 == null) {
                this.f31402 = new C10630();
            }
            this.f31402.mo23658(i, i2);
        } else {
            C10630 c10630 = this.f31402;
            if (c10630 != null) {
                c10630.remove(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26322(C5896 c5896, C1993 c1993) throws IOException {
        int i = c1993.f6675;
        int i2 = c1993.f6673;
        long j = ((long) i) + ((long) i2);
        long jM16529 = ((long) c5896.m16529()) + ((long) c5896.m16525());
        int i3 = c1993.f6674;
        if (i3 < 16 || i2 < i3 || j > jM16529) {
            throw new IOException("Invalid typeSpec header");
        }
        c5896.m16533(i + 8);
        this.f31399 = c5896.m16531();
        c5896.m16536(3);
        int iM16535 = c5896.m16535();
        long j2 = (((long) iM16535) * 4) + ((long) i) + ((long) i3);
        if (iM16535 >= 0 && iM16535 <= 65536 && j2 <= j) {
            c5896.m16533(i + i3);
            for (int i4 = 0; i4 < iM16535; i4++) {
                int iM16536 = c5896.m16535();
                m26324(i4, (536870912 & iM16536) != 0);
                m26323(i4, iM16536 & (~(mo2874().mo12848().m26261() | 1610874879)));
            }
            return iM16535;
        }
        throw new IOException("Invalid typeSpec entry count");
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9922 mo2869() {
        return this.f31401.mo12847();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4277 mo2874() {
        return this.f31401;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۘ֫ */
    public final int mo2870() {
        return this.f31399;
    }

    @Override // l.InterfaceC0748
    public final String getTypeName() {
        try {
            return (String) mo2874().mo12853().get(this.f31399 - 1);
        } catch (IndexOutOfBoundsException unused) {
            return "ERROR-ID" + this.f31399;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m26325() {
        return new C11871(mo2871(), new InterfaceC12954() { // from class: l.ۙᩳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C3077.m9405(this, obj);
            }

            @Override // l.InterfaceC12954
            public final Object get(int i) {
                return this.f15237.mo2877(i);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ Object get(Object obj) {
                return C3077.m9406(this, obj);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ boolean mo2422(int i) {
                return true;
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ Object mo2319() {
                return null;
            }

            @Override // l.InterfaceC12954, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ֫ */
            public final Object mo2318(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC12954
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܽۧ */
    public ArrayList mo2876() {
        ArrayList arrayList = new ArrayList(mo2871());
        C11871 c11871 = (C11871) m26325();
        c11871.iterator();
        while (c11871.hasNext()) {
            arrayList.add((InterfaceC7099) c11871.next());
        }
        Collections.sort(arrayList, new C20338());
        return arrayList;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public final String mo2868(C20296 c20296) {
        int iMo2878 = mo2878();
        int iMo2871 = mo2871();
        InterfaceC7099[] interfaceC7099Arr = new InterfaceC7099[iMo2871];
        for (int i = 0; i < iMo2871; i++) {
            interfaceC7099Arr[i] = mo2877(i);
        }
        for (int i2 = 0; i2 < iMo2878; i2++) {
            for (int i3 = 0; i3 < iMo2871; i3++) {
                InterfaceC7099 interfaceC7099 = interfaceC7099Arr[i3];
                if (interfaceC7099.mo2347(i2)) {
                    String strMo2348 = interfaceC7099.mo2348(i2);
                    if (!c20296.mo10274(strMo2348)) {
                        break;
                    }
                    return strMo2348;
                }
            }
        }
        return null;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ֫ */
    public int mo2867(InterfaceC15564 interfaceC15564) {
        int iMo2878 = mo2878();
        int iMo2871 = mo2871();
        InterfaceC7099[] interfaceC7099Arr = new InterfaceC7099[iMo2871];
        for (int i = 0; i < iMo2871; i++) {
            interfaceC7099Arr[i] = mo2877(i);
        }
        for (int i2 = 0; i2 < iMo2878; i2++) {
            for (int i3 = 0; i3 < iMo2871; i3++) {
                InterfaceC7099 interfaceC7099 = interfaceC7099Arr[i3];
                if (interfaceC7099.mo2347(i2)) {
                    if (!interfaceC15564.mo10274(interfaceC7099.mo2348(i2))) {
                        break;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // l.InterfaceC0748
    public final String getPath() {
        return mo2874().getPath() + "/" + getTypeName();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC8510
    @TargetApi(24)
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC0748 interfaceC0748 = (InterfaceC0748) interfaceC8510;
        if (this.f31399 != interfaceC0748.mo2870()) {
            throw new RuntimeException(getPath());
        }
        if (mo2871() != interfaceC0748.mo2871()) {
            throw new RuntimeException(getPath());
        }
        if (!C11003.equals(getTypeName(), interfaceC0748.getTypeName())) {
            throw new RuntimeException(getPath());
        }
        List list = (List) C14841.stream(C19846.spliterator(mo2872()), false).sorted(new C3404(0)).collect(C22976.toList());
        List list2 = (List) C14841.stream(C19846.spliterator(interfaceC0748.mo2872()), false).sorted(new C13281(0)).collect(C22976.toList());
        for (int i = 0; i < mo2871(); i++) {
            ((InterfaceC7099) list.get(i)).mo12336((InterfaceC8510) list2.get(i));
            System.out.println("check ok " + ((InterfaceC7099) list.get(i)).getPath());
        }
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ */
    public Iterable mo2872() {
        return m26325();
    }
}
