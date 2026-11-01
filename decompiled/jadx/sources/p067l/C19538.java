package p067l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19538 implements InterfaceC2538 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC3880 f59483;

    /* JADX INFO: renamed from: ۧ */
    public C8809[] f59484;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ HashMap f59485;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ArrayList f59486;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ int f59487;

    public C19538(int i, ArrayList arrayList, HashMap map) {
        this.f59487 = i;
        this.f59486 = arrayList;
        this.f59485 = map;
        this.f59484 = new C8809[i];
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3727(Object obj, Object obj2, AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        C8809[] c8809Arr = (C8809[]) obj;
        C8809[] c8809Arr2 = (C8809[]) obj2;
        int i = 0;
        int i2 = this.f59487;
        if (c8809Arr2 != null) {
            while (i < i2) {
                C8809 c8809 = c8809Arr[i];
                C8809 c88010 = c8809Arr2[i];
                if (c8809 != null && c88010 != null) {
                    if (c88010.f23916 == null) {
                        c88010.f23916 = new HashSet();
                    }
                    c88010.f23916.add(c8809);
                }
                i++;
            }
            return c8809Arr2;
        }
        C8809[] c8809Arr3 = new C8809[i2];
        while (i < i2) {
            C8809 c88011 = c8809Arr[i];
            if (c88011 != null) {
                C8809 c88012 = new C8809(c88011.f23914);
                this.f59486.add(c88012);
                c88012.f23913 = c88011.f23913;
                c88012.f23918 = c88011;
                c88012.f23917 = (BitSet) c88011.f23917.clone();
                c8809Arr3[i] = c88012;
            }
            i++;
        }
        return c8809Arr3;
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3728(Object obj, AbstractC3880 abstractC3880) {
        this.f59483 = abstractC3880;
        int i = this.f59487;
        C8809[] c8809Arr = this.f59484;
        System.arraycopy((C8809[]) obj, 0, c8809Arr, 0, i);
        EnumC9677 enumC9677 = abstractC3880.f8417;
        if (enumC9677 == EnumC9677.FILL_ARRAY_DATA) {
            if (abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                int i2 = ((C19736) abstractC3880.mo7675()).f60034;
                if (i2 >= 0) {
                    C8809 c8809 = c8809Arr[i2];
                    c8809.f23917.set(0, Array.getLength(((C13761) abstractC3880.mo7674()).f38899));
                    return c8809Arr;
                }
            } else {
                m44385(abstractC3880.mo7675());
                return c8809Arr;
            }
        } else {
            EnumC9677 enumC9678 = EnumC9677.ASSIGN;
            if (enumC9677 == enumC9678 && abstractC3880.mo7675().f28658 == EnumC3642.ARRAY) {
                m44385(abstractC3880.mo7674());
                C14431 c14431 = (C14431) abstractC3880.mo7675();
                AbstractC10348 abstractC10348 = c14431.f5200;
                if (abstractC10348.f28658 == EnumC3642.LOCAL) {
                    C19736 c19736 = (C19736) abstractC10348;
                    if (c19736.f60034 >= 0) {
                        c8809Arr[c19736.f60034].f23917.set(((Number) ((C13761) c14431.f5201).f38899).intValue());
                        return c8809Arr;
                    }
                    m44385(c14431);
                    return c8809Arr;
                }
                m44385(c14431);
                return c8809Arr;
            }
            if (enumC9677 == enumC9678 && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                C19736 c19737 = (C19736) abstractC3880.mo7675();
                m44385(abstractC3880.mo7674());
                if (c19737.f60034 >= 0) {
                    C8809 c88010 = new C8809(c19737);
                    c88010.f23913 = (C24902) this.f59485.get(c19737);
                    c88010.f23917 = new BitSet();
                    this.f59486.add(c88010);
                    c8809Arr[c19737.f60034] = c88010;
                    return c8809Arr;
                }
            } else {
                int i3 = C16184.f47645[abstractC3880.f8412.ordinal()];
                if (i3 == 2) {
                    m44385(abstractC3880.mo7672());
                    return c8809Arr;
                }
                if (i3 == 3) {
                    m44385(abstractC3880.mo7675());
                    m44385(abstractC3880.mo7674());
                    return c8809Arr;
                }
                if (i3 == 4) {
                    throw new RuntimeException();
                }
            }
        }
        return c8809Arr;
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3726() {
        return new C8809[this.f59487];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44385(AbstractC10348 abstractC10348) {
        int i;
        int i2 = C16184.f47645[abstractC10348.f28660.ordinal()];
        if (i2 == 1) {
            if (abstractC10348.f28658 != EnumC3642.LOCAL || (i = ((C19736) abstractC10348).f60034) < 0) {
                return;
            }
            C8809 c8809 = this.f59484[i];
            c8809.f23913.f79527.add(this.f59483);
            c8809.f23915 = true;
            return;
        }
        if (i2 == 2) {
            m44385(abstractC10348.mo23968());
            return;
        }
        if (i2 == 3) {
            m44385(abstractC10348.mo4921());
            m44385(abstractC10348.mo4923());
        } else {
            if (i2 != 4) {
                return;
            }
            for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
                m44385(abstractC10349);
            }
        }
    }
}
