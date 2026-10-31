package l;

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
public final class C4484 extends AbstractC5895 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Comparator f14262 = new C22123();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC20007 f14263;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f14264;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f14265;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f14266;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC3073 m13223(AbstractC3073 abstractC3073) {
        m16519();
        AbstractC3073 abstractC3074 = (AbstractC3073) this.f14264.get(abstractC3073);
        if (abstractC3074 != null) {
            return abstractC3074;
        }
        m13220(abstractC3073);
        this.f14264.put(abstractC3073, abstractC3073);
        return abstractC3073;
    }

    public C4484(String str, C1662 c1662, int i, EnumC20007 enumC20007) {
        super(str, c1662, i);
        this.f14266 = new ArrayList(100);
        this.f14264 = new HashMap(100);
        this.f14263 = enumC20007;
        this.f14265 = -1;
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f14266;
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo13226() {
        m16524();
        return this.f14265;
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo13219(AbstractC2368 abstractC2368) {
        return ((AbstractC3073) abstractC2368).m9390();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13220(AbstractC3073 abstractC3073) {
        m16519();
        try {
            if (abstractC3073.m9392() > m16516()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f14266.add(abstractC3073);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13221(C18241 c18241, EnumC3779 enumC3779) {
        m16524();
        TreeMap treeMap = new TreeMap();
        for (AbstractC3073 abstractC3073 : this.f14266) {
            if (abstractC3073.mo2862() == enumC3779) {
                treeMap.put(abstractC3073.mo2864(), abstractC3073);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c18241.m42501(0, "\nmethod code index:\n\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            c18241.m42501(0, ((AbstractC3073) entry.getValue()).m9391() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo13225() {
        C1662 c1662M16521 = m16521();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14266;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC3073) arrayList.get(i)).mo2863(c1662M16521);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m13222() {
        m16524();
        int iOrdinal = this.f14263.ordinal();
        ArrayList arrayList = this.f14266;
        if (iOrdinal == 1) {
            Collections.sort(arrayList, f14262);
        } else if (iOrdinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo3385 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC3073 abstractC3073 = (AbstractC3073) arrayList.get(i);
            try {
                int iM9388 = abstractC3073.m9388(this, iMo3385);
                if (iM9388 < iMo3385) {
                    throw new RuntimeException("bogus place() result for " + abstractC3073);
                }
                iMo3385 = abstractC3073.mo3385() + iM9388;
            } catch (RuntimeException e) {
                throw C8136.m21601("...while placing " + abstractC3073, e);
            }
        }
        this.f14265 = iMo3385;
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo13224(C18241 c18241) {
        boolean zM42506 = c18241.m42506();
        C1662 c1662M16521 = m16521();
        int iMo3385 = 0;
        boolean z = true;
        for (AbstractC3073 abstractC3073 : this.f14266) {
            if (zM42506) {
                if (z) {
                    z = false;
                } else {
                    c18241.m42501(0, "\n");
                }
            }
            int iM9392 = abstractC3073.m9392() - 1;
            int i = (~iM9392) & (iMo3385 + iM9392);
            if (iMo3385 != i) {
                c18241.m42518(i - iMo3385);
                iMo3385 = i;
            }
            abstractC3073.mo3384(c1662M16521, c18241);
            iMo3385 += abstractC3073.mo3385();
        }
        if (iMo3385 != this.f14265) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
