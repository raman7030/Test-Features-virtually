package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18066 implements InterfaceC0179 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f56278;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6777[] f56279;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f56280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f56281;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56282;

    public C18066(int i, ArrayList arrayList, HashMap map) {
        this.f56282 = i;
        this.f56281 = arrayList;
        this.f56280 = map;
        this.f56279 = new C6777[i];
    }

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1319(Object obj, Object obj2, AbstractC1591 abstractC1591, AbstractC1591 abstractC1592) {
        C6777[] c6777Arr = (C6777[]) obj;
        C6777[] c6777Arr2 = (C6777[]) obj2;
        int i = 0;
        int i2 = this.f56282;
        if (c6777Arr2 != null) {
            while (i < i2) {
                C6777 c6777 = c6777Arr[i];
                C6777 c6778 = c6777Arr2[i];
                if (c6777 != null && c6778 != null) {
                    if (c6778.f21042 == null) {
                        c6778.f21042 = new HashSet();
                    }
                    c6778.f21042.add(c6777);
                }
                i++;
            }
            return c6777Arr2;
        }
        C6777[] c6777Arr3 = new C6777[i2];
        while (i < i2) {
            C6777 c6779 = c6777Arr[i];
            if (c6779 != null) {
                C6777 c67710 = new C6777(c6779.f21040);
                this.f56281.add(c67710);
                c67710.f21039 = c6779.f21039;
                c67710.f21044 = c6779;
                c67710.f21043 = (BitSet) c6779.f21043.clone();
                c6777Arr3[i] = c67710;
            }
            i++;
        }
        return c6777Arr3;
    }

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1320(Object obj, AbstractC1591 abstractC1591) {
        this.f56278 = abstractC1591;
        int i = this.f56282;
        C6777[] c6777Arr = this.f56279;
        System.arraycopy((C6777[]) obj, 0, c6777Arr, 0, i);
        EnumC7690 enumC7690 = abstractC1591.f5638;
        if (enumC7690 == EnumC7690.FILL_ARRAY_DATA) {
            if (abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                int i2 = ((C18274) abstractC1591.mo5445()).f56817;
                if (i2 >= 0) {
                    C6777 c6777 = c6777Arr[i2];
                    c6777.f21043.set(0, Array.getLength(((C11987) abstractC1591.mo5444()).f35889));
                    return c6777Arr;
                }
            } else {
                m42133(abstractC1591.mo5445());
                return c6777Arr;
            }
        } else {
            EnumC7690 enumC7691 = EnumC7690.ASSIGN;
            if (enumC7690 == enumC7691 && abstractC1591.mo5445().f25745 == EnumC1340.ARRAY) {
                m42133(abstractC1591.mo5444());
                C12692 c12692 = (C12692) abstractC1591.mo5445();
                AbstractC8396 abstractC8396 = c12692.f2428;
                if (abstractC8396.f25745 == EnumC1340.LOCAL) {
                    C18274 c18274 = (C18274) abstractC8396;
                    if (c18274.f56817 >= 0) {
                        c6777Arr[c18274.f56817].f21043.set(((Number) ((C11987) c12692.f2429).f35889).intValue());
                        return c6777Arr;
                    }
                    m42133(c12692);
                    return c6777Arr;
                }
                m42133(c12692);
                return c6777Arr;
            }
            if (enumC7690 == enumC7691 && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                C18274 c18275 = (C18274) abstractC1591.mo5445();
                m42133(abstractC1591.mo5444());
                if (c18275.f56817 >= 0) {
                    C6777 c6778 = new C6777(c18275);
                    c6778.f21039 = (C23710) this.f56280.get(c18275);
                    c6778.f21043 = new BitSet();
                    this.f56281.add(c6778);
                    c6777Arr[c18275.f56817] = c6778;
                    return c6777Arr;
                }
            } else {
                int i3 = C14537.f44539[abstractC1591.f5633.ordinal()];
                if (i3 == 2) {
                    m42133(abstractC1591.mo5442());
                    return c6777Arr;
                }
                if (i3 == 3) {
                    m42133(abstractC1591.mo5445());
                    m42133(abstractC1591.mo5444());
                    return c6777Arr;
                }
                if (i3 == 4) {
                    throw new RuntimeException();
                }
            }
        }
        return c6777Arr;
    }

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1318() {
        return new C6777[this.f56282];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42133(AbstractC8396 abstractC8396) {
        int i;
        int i2 = C14537.f44539[abstractC8396.f25747.ordinal()];
        if (i2 == 1) {
            if (abstractC8396.f25745 != EnumC1340.LOCAL || (i = ((C18274) abstractC8396).f56817) < 0) {
                return;
            }
            C6777 c6777 = this.f56279[i];
            c6777.f21039.f76777.add(this.f56278);
            c6777.f21041 = true;
            return;
        }
        if (i2 == 2) {
            m42133(abstractC8396.mo21997());
            return;
        }
        if (i2 == 3) {
            m42133(abstractC8396.mo2581());
            m42133(abstractC8396.mo2583());
        } else {
            if (i2 != 4) {
                return;
            }
            for (AbstractC8396 abstractC8397 : abstractC8396.mo15838()) {
                m42133(abstractC8397);
            }
        }
    }
}
