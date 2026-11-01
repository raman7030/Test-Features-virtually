package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5JO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13469 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f37804;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f37805;

    /* JADX INFO: renamed from: ۡ */
    public final HashSet f37806;

    /* JADX INFO: renamed from: ۢ */
    public C10321 f37807;

    /* JADX INFO: renamed from: ۧ */
    public boolean f37808;

    /* JADX INFO: renamed from: ܳ */
    public boolean f37809;

    /* JADX INFO: renamed from: ܽ */
    public boolean f37810;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f37811;

    /* JADX INFO: renamed from: ᩳ */
    public final HashSet f37812;

    /* JADX INFO: renamed from: ᩷ */
    public C14971 f37813;

    /* JADX INFO: renamed from: ᩻ */
    public HashMap f37814;

    /* JADX WARN: Code duplicated, block: B:173:0x03f9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:230:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:241:0x0506  */
    /* JADX WARN: Code duplicated, block: B:252:0x0549 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:282:0x05c7  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public C13469(java.io.ByteArrayInputStream r26, p067l.C14971 r27) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C13469.<init>(java.io.ByteArrayInputStream, l.۬ܿܽ):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m30611() {
        return this.f37804;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30610(XmlResourceParserC12128 xmlResourceParserC12128) {
        int i = 1;
        while (true) {
            int next = xmlResourceParserC12128.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3 && (i = i - 1) == 0) {
                return;
            }
        }
    }
}
