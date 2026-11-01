package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۙۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6630 extends AbstractC7971 {

    /* JADX INFO: renamed from: ۢ */
    public static final Comparator f17089 = new C23394();

    /* JADX INFO: renamed from: ۜ */
    public final EnumC21383 f17090;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f17091;

    /* JADX INFO: renamed from: ᩷ */
    public int f17092;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f17093;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized AbstractC5289 m15105(AbstractC5289 abstractC5289) {
        m18445();
        AbstractC5289 abstractC52810 = (AbstractC5289) this.f17091.get(abstractC5289);
        if (abstractC52810 != null) {
            return abstractC52810;
        }
        m15102(abstractC5289);
        this.f17091.put(abstractC5289, abstractC5289);
        return abstractC5289;
    }

    public C6630(String str, C3948 c3948, int i, EnumC21383 enumC21383) {
        super(str, c3948, i);
        this.f17093 = new ArrayList(100);
        this.f17091 = new HashMap(100);
        this.f17090 = enumC21383;
        this.f17092 = -1;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f17093;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15108() {
        m18450();
        return this.f17092;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ֫ */
    public final int mo15101(AbstractC4619 abstractC4619) {
        return ((AbstractC5289) abstractC4619).m11432();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15102(AbstractC5289 abstractC5289) {
        m18445();
        try {
            if (abstractC5289.m11434() > m18442()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f17093.add(abstractC5289);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15103(C19705 c19705, EnumC5960 enumC5960) {
        m18450();
        TreeMap treeMap = new TreeMap();
        for (AbstractC5289 abstractC5289 : this.f17093) {
            if (abstractC5289.mo5191() == enumC5960) {
                treeMap.put(abstractC5289.mo5193(), abstractC5289);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c19705.m44760(0, "\nmethod code index:\n\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            c19705.m44760(0, ((AbstractC5289) entry.getValue()).m11433() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ܳ */
    public final void mo15107() {
        C3948 c3948M18447 = m18447();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17093;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC5289) arrayList.get(i)).mo5192(c3948M18447);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m15104() {
        m18450();
        int iOrdinal = this.f17090.ordinal();
        ArrayList arrayList = this.f17093;
        if (iOrdinal == 1) {
            Collections.sort(arrayList, f17089);
        } else if (iOrdinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo5704 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC5289 abstractC5289 = (AbstractC5289) arrayList.get(i);
            try {
                int iM11430 = abstractC5289.m11430(this, iMo5704);
                if (iM11430 < iMo5704) {
                    throw new RuntimeException("bogus place() result for " + abstractC5289);
                }
                iMo5704 = abstractC5289.mo5704() + iM11430;
            } catch (RuntimeException e) {
                throw C10101.m23569("...while placing " + abstractC5289, e);
            }
        }
        this.f17092 = iMo5704;
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ۧ */
    public final void mo15106(C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        C3948 c3948M18447 = m18447();
        int iMo5704 = 0;
        boolean z = true;
        for (AbstractC5289 abstractC5289 : this.f17093) {
            if (zM44765) {
                if (z) {
                    z = false;
                } else {
                    c19705.m44760(0, "\n");
                }
            }
            int iM11434 = abstractC5289.m11434() - 1;
            int i = (~iM11434) & (iMo5704 + iM11434);
            if (iMo5704 != i) {
                c19705.m44777(i - iMo5704);
                iMo5704 = i;
            }
            abstractC5289.mo5703(c3948M18447, c19705);
            iMo5704 += abstractC5289.mo5704();
        }
        if (iMo5704 != this.f17092) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
