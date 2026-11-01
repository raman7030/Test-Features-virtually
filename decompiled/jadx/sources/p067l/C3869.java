package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBGQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3869 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f8367;

    /* JADX INFO: renamed from: ۜ */
    public final C21975 f8368;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f8369;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f8370;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f8371;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f8372;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC15405[] f8373;

    /* JADX INFO: renamed from: ᩳ */
    public final BitSet f8374;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f8375;

    /* JADX INFO: renamed from: ᩻ */
    public final int f8376;

    public C3869(C21975 c21975) {
        this.f8368 = c21975;
        int iM49513 = c21975.m49513();
        this.f8376 = iM49513;
        this.f8371 = new int[iM49513];
        this.f8373 = new AbstractC15405[iM49513];
        this.f8372 = new ArrayList();
        this.f8370 = new ArrayList();
        this.f8374 = new BitSet(c21975.m49517().size());
        this.f8375 = new ArrayList();
        this.f8369 = new ArrayList();
        this.f8367 = new ArrayList();
        for (int i = 0; i < this.f8376; i++) {
            this.f8371[i] = 0;
            this.f8373[i] = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7627(C21975 c21975) {
        BitSet bitSet;
        C3869 c3869 = new C3869(c21975);
        c3869.m7626(c21975.m49522());
        while (true) {
            ArrayList arrayList = c3869.f8372;
            boolean zIsEmpty = arrayList.isEmpty();
            bitSet = c3869.f8374;
            ArrayList arrayList2 = c3869.f8369;
            ArrayList arrayList3 = c3869.f8375;
            ArrayList arrayList4 = c3869.f8370;
            if (zIsEmpty && arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            while (!arrayList.isEmpty()) {
                for (AbstractC15938 abstractC15938 : ((C17950) C6406.m14670(arrayList, 1)).m40832()) {
                    if (abstractC15938 instanceof C15229) {
                        c3869.m7624((C15229) abstractC15938);
                    } else {
                        c3869.m7625(abstractC15938);
                    }
                }
            }
            while (!arrayList4.isEmpty()) {
                for (AbstractC15938 abstractC15939 : ((C17950) C6406.m14670(arrayList4, 1)).m40832()) {
                    if (!(abstractC15939 instanceof C15229)) {
                        break;
                    } else {
                        c3869.m7624((C15229) abstractC15939);
                    }
                }
            }
            while (!arrayList2.isEmpty()) {
                AbstractC15938 abstractC159310 = (AbstractC15938) C6406.m14670(arrayList2, 1);
                if (bitSet.get(abstractC159310.m36177().m40826())) {
                    if (abstractC159310 instanceof C15229) {
                        c3869.m7624((C15229) abstractC159310);
                    } else {
                        c3869.m7625(abstractC159310);
                    }
                }
            }
            while (!arrayList3.isEmpty()) {
                AbstractC15938 abstractC159311 = (AbstractC15938) C6406.m14670(arrayList3, 1);
                if (bitSet.get(abstractC159311.m36177().m40826())) {
                    if (abstractC159311 instanceof C15229) {
                        c3869.m7624((C15229) abstractC159311);
                    } else {
                        c3869.m7625(abstractC159311);
                    }
                }
            }
        }
        for (int i = 0; i < c3869.f8376; i++) {
            if (c3869.f8371[i] == 1) {
                AbstractC15405[] abstractC15405Arr = c3869.f8373;
                if (abstractC15405Arr[i] instanceof AbstractC8225) {
                    AbstractC15938 abstractC15938M49521 = c21975.m49521(i);
                    if (!abstractC15938M49521.m36175().m50974().mo7482()) {
                        abstractC15938M49521.m36174(abstractC15938M49521.m36175().m50978((AbstractC8225) abstractC15405Arr[i]));
                        for (AbstractC15938 abstractC159312 : c21975.m49526(i)) {
                            if (!abstractC159312.mo31596()) {
                                C13889 c13889 = (C13889) abstractC159312;
                                C21442 c21442Mo31600 = abstractC159312.mo31600();
                                int iM48576 = c21442Mo31600.m48576(i);
                                c13889.m31597(iM48576, c21442Mo31600.m56524get(iM48576).m50978((AbstractC8225) abstractC15405Arr[i]));
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC15938 abstractC159313 : c3869.f8367) {
            C17950 c17950M36177 = abstractC159313.m36177();
            int size = c17950M36177.m40820().size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = c17950M36177.m40820().get(i3);
                if (!bitSet.get(i4)) {
                    i2 = i4;
                }
            }
            if (size == 2 && i2 != -1) {
                c17950M36177.m40828(new C3336(C14065.f39817, abstractC159313.mo31607().m39652(), (C22783) null, C21442.f67643));
                c17950M36177.m40837(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7626(C17950 c17950) {
        int iM40826 = c17950.m40826();
        BitSet bitSet = this.f8374;
        if (!bitSet.get(iM40826)) {
            this.f8372.add(c17950);
            bitSet.set(c17950.m40826());
        } else {
            this.f8370.add(c17950);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7623(int i, int i2) {
        C21975 c21975 = this.f8368;
        if (i2 == 2) {
            Iterator it = c21975.m49526(i).iterator();
            while (it.hasNext()) {
                this.f8369.add((AbstractC15938) it.next());
            }
            return;
        }
        Iterator it2 = c21975.m49526(i).iterator();
        while (it2.hasNext()) {
            this.f8375.add((AbstractC15938) it2.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m7628(int i, int i2, AbstractC15405 abstractC15405) {
        int[] iArr = this.f8371;
        if (i2 != 1) {
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        int i3 = iArr[i];
        AbstractC15405[] abstractC15405Arr = this.f8373;
        if (i3 == i2 && abstractC15405Arr[i].equals(abstractC15405)) {
            return false;
        }
        iArr[i] = i2;
        abstractC15405Arr[i] = abstractC15405;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7624(C15229 c15229) {
        int iM50989 = c15229.m36175().m50989();
        int[] iArr = this.f8371;
        int i = 2;
        if (iArr[iM50989] == 2) {
            return;
        }
        C21442 c21442Mo31600 = c15229.mo31600();
        int size = c21442Mo31600.size();
        int i2 = 0;
        AbstractC15405 abstractC15405 = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iM34677 = c15229.m34677(i2);
            int iM509810 = c21442Mo31600.m56524get(i2).m50989();
            int i4 = iArr[iM509810];
            if (this.f8374.get(iM34677)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                }
                AbstractC15405[] abstractC15405Arr = this.f8373;
                if (abstractC15405 == null) {
                    abstractC15405 = abstractC15405Arr[iM509810];
                    i3 = 1;
                } else if (!abstractC15405Arr[iM509810].equals(abstractC15405)) {
                    break;
                }
            }
            i2++;
        }
        if (m7628(iM50989, i, abstractC15405)) {
            m7623(iM50989, i);
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
    /* JADX INFO: renamed from: ֫ */
    private void m7625(p067l.AbstractC15938 r17) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C3869.m7625(l.ܳۘܺ):void");
    }
}
