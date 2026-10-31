package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBGQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1579 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f5587;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20630 f5588;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5589;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5590;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f5591;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5592;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717[] f5593;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f5594;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f5595;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f5596;

    public C1579(C20630 c20630) {
        this.f5588 = c20630;
        int iM47186 = c20630.m47186();
        this.f5596 = iM47186;
        this.f5591 = new int[iM47186];
        this.f5593 = new AbstractC13717[iM47186];
        this.f5592 = new ArrayList();
        this.f5590 = new ArrayList();
        this.f5594 = new BitSet(c20630.m47190().size());
        this.f5595 = new ArrayList();
        this.f5589 = new ArrayList();
        this.f5587 = new ArrayList();
        for (int i = 0; i < this.f5596; i++) {
            this.f5591[i] = 0;
            this.f5593[i] = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5398(C20630 c20630) {
        BitSet bitSet;
        C1579 c1579 = new C1579(c20630);
        c1579.m5397(c20630.m47195());
        while (true) {
            ArrayList arrayList = c1579.f5592;
            boolean zIsEmpty = arrayList.isEmpty();
            bitSet = c1579.f5594;
            ArrayList arrayList2 = c1579.f5589;
            ArrayList arrayList3 = c1579.f5595;
            ArrayList arrayList4 = c1579.f5590;
            if (zIsEmpty && arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            while (!arrayList.isEmpty()) {
                for (AbstractC14278 abstractC14278 : ((C16395) C4248.m12790(arrayList, 1)).m38615()) {
                    if (abstractC14278 instanceof C13532) {
                        c1579.m5395((C13532) abstractC14278);
                    } else {
                        c1579.m5396(abstractC14278);
                    }
                }
            }
            while (!arrayList4.isEmpty()) {
                for (AbstractC14278 abstractC14279 : ((C16395) C4248.m12790(arrayList4, 1)).m38615()) {
                    if (!(abstractC14279 instanceof C13532)) {
                        break;
                    } else {
                        c1579.m5395((C13532) abstractC14279);
                    }
                }
            }
            while (!arrayList2.isEmpty()) {
                AbstractC14278 abstractC142710 = (AbstractC14278) C4248.m12790(arrayList2, 1);
                if (bitSet.get(abstractC142710.m34044().m38609())) {
                    if (abstractC142710 instanceof C13532) {
                        c1579.m5395((C13532) abstractC142710);
                    } else {
                        c1579.m5396(abstractC142710);
                    }
                }
            }
            while (!arrayList3.isEmpty()) {
                AbstractC14278 abstractC142711 = (AbstractC14278) C4248.m12790(arrayList3, 1);
                if (bitSet.get(abstractC142711.m34044().m38609())) {
                    if (abstractC142711 instanceof C13532) {
                        c1579.m5395((C13532) abstractC142711);
                    } else {
                        c1579.m5396(abstractC142711);
                    }
                }
            }
        }
        for (int i = 0; i < c1579.f5596; i++) {
            if (c1579.f5591[i] == 1) {
                AbstractC13717[] abstractC13717Arr = c1579.f5593;
                if (abstractC13717Arr[i] instanceof AbstractC6162) {
                    AbstractC14278 abstractC14278M47194 = c20630.m47194(i);
                    if (!abstractC14278M47194.m34042().m48637().mo5253()) {
                        abstractC14278M47194.m34041(abstractC14278M47194.m34042().m48641((AbstractC6162) abstractC13717Arr[i]));
                        for (AbstractC14278 abstractC142712 : c20630.m47199(i)) {
                            if (!abstractC142712.mo29531()) {
                                C12122 c12122 = (C12122) abstractC142712;
                                C20069 c20069Mo29535 = abstractC142712.mo29535();
                                int iM46260 = c20069Mo29535.m46260(i);
                                c12122.m29532(iM46260, c20069Mo29535.m41004get(iM46260).m48641((AbstractC6162) abstractC13717Arr[i]));
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC14278 abstractC142713 : c1579.f5587) {
            C16395 c16395M34044 = abstractC142713.m34044();
            int size = c16395M34044.m38603().size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = c16395M34044.m38603().get(i3);
                if (!bitSet.get(i4)) {
                    i2 = i4;
                }
            }
            if (size == 2 && i2 != -1) {
                c16395M34044.m38611(new C1018(C12307.f36802, abstractC142713.mo29542().m37480(), (C21480) null, C20069.f65002));
                c16395M34044.m38620(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5397(C16395 c16395) {
        int iM38609 = c16395.m38609();
        BitSet bitSet = this.f5594;
        if (!bitSet.get(iM38609)) {
            this.f5592.add(c16395);
            bitSet.set(c16395.m38609());
        } else {
            this.f5590.add(c16395);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5394(int i, int i2) {
        C20630 c20630 = this.f5588;
        if (i2 == 2) {
            Iterator it = c20630.m47199(i).iterator();
            while (it.hasNext()) {
                this.f5589.add((AbstractC14278) it.next());
            }
            return;
        }
        Iterator it2 = c20630.m47199(i).iterator();
        while (it2.hasNext()) {
            this.f5595.add((AbstractC14278) it2.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m5399(int i, int i2, AbstractC13717 abstractC13717) {
        int[] iArr = this.f5591;
        if (i2 != 1) {
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        int i3 = iArr[i];
        AbstractC13717[] abstractC13717Arr = this.f5593;
        if (i3 == i2 && abstractC13717Arr[i].equals(abstractC13717)) {
            return false;
        }
        iArr[i] = i2;
        abstractC13717Arr[i] = abstractC13717;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5395(C13532 c13532) {
        int iM48652 = c13532.m34042().m48652();
        int[] iArr = this.f5591;
        int i = 2;
        if (iArr[iM48652] == 2) {
            return;
        }
        C20069 c20069Mo29535 = c13532.mo29535();
        int size = c20069Mo29535.size();
        int i2 = 0;
        AbstractC13717 abstractC13717 = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iM32574 = c13532.m32574(i2);
            int iM48653 = c20069Mo29535.m41004get(i2).m48652();
            int i4 = iArr[iM48653];
            if (this.f5594.get(iM32574)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                }
                AbstractC13717[] abstractC13717Arr = this.f5593;
                if (abstractC13717 == null) {
                    abstractC13717 = abstractC13717Arr[iM48653];
                    i3 = 1;
                } else if (!abstractC13717Arr[iM48653].equals(abstractC13717)) {
                    break;
                }
            }
            i2++;
        }
        if (m5399(iM48652, i, abstractC13717)) {
            m5394(iM48652, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5396(l.AbstractC14278 r17) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1579.m5396(l.ܳۘܺ):void");
    }
}
