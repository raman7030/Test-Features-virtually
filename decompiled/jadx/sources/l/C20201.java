package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩶ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20201 extends AbstractC0204 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f65363;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0052 f65364;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f65362 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f65360 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f65361 = new HashMap();

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C0052 c0052 = c3587.f11377;
        C12171.m29637(c0052);
        this.f65364 = c0052;
        if (c3587.mo10982() == EnumC6857.OPEN) {
            this.f65364.f916.add(EnumC18398.OPEN);
        }
        C0052 c0053 = this.f65364;
        c0053.f17563 |= c3587.f11379.f7169 & 131072;
        c0053.f929 = C2609.m8239();
        this.f65364.f921 = C2609.m8239();
        this.f65364.f919 = C2609.m8239();
        C19846.forEach(c3587.f11376, new C22257(1, this));
        C0052 c0054 = this.f65364;
        c0054.f929 = c0054.f929.m8250();
        C0052 c0055 = this.f65364;
        c0055.f921 = c0055.f921.m8250();
        C0052 c0056 = this.f65364;
        c0056.f919 = c0056.f919.m8250();
        AbstractC10370 abstractC10370 = this.f65364.f17562;
        C3267 c3267 = this.f65363;
        if (abstractC10370 == c3267.f10257.f18810) {
            return;
        }
        Iterator it = this.f65364.f929.iterator();
        while (it.hasNext()) {
            if (((C9764) it.next()).f29541.f17562 == c3267.f10257.f18810) {
                return;
            }
        }
        C9764 c9764 = new C9764(c3267.f10261.m47258(c3267.f10257.f18810), EnumSet.of(EnumC9058.MANDATED));
        C0052 c0057 = this.f65364;
        c0057.f929 = c0057.f929.m8246(c9764);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        AbstractC12612 abstractC12612 = c12054.f36052;
        AbstractC10370 abstractC10370M19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        C0052 c0052M17169 = c3267.f10281.m17169(abstractC10370M19452);
        C7260.m19459(c0052M17169, abstractC12612);
        if (c0052M17169.f17559 != EnumC1296.f4568) {
            C22364 c22364 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "module.not.found", c0052M17169));
            ((HashSet) c3267.f10263).add(c0052M17169);
            return;
        }
        HashSet hashSet = this.f65362;
        if (hashSet.contains(c0052M17169)) {
            C22364 c22365 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12282 = C6241.f19132;
            c22365.m7273(abstractC12612, new C12281("compiler", "duplicate.requires", c0052M17169));
            return;
        }
        hashSet.add(c0052M17169);
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC9058.class);
        if (c12054.f36053) {
            if (c0052M17169 == c3267.f10261.f66509 && c3267.f10267.compareTo(EnumC16280.JDK10) >= 0) {
                C22364 c22366 = c3267.f10283;
                AbstractC10370 abstractC10370 = c3267.f10257.f18811;
                C12281 c12283 = C6241.f19132;
                c22366.m7273(c12054, new C12281("compiler", "modifier.not.allowed.here", abstractC10370));
            } else {
                enumSetNoneOf.add(EnumC9058.TRANSITIVE);
            }
        }
        if (c12054.f36054) {
            if (c0052M17169 == c3267.f10261.f66509 && c3267.f10267.compareTo(EnumC16280.JDK10) >= 0) {
                C22364 c22367 = c3267.f10283;
                EnumSet enumSetOf = EnumSet.of(EnumC18936.f59679);
                C12281 c12284 = C6241.f19132;
                c22367.m7273(c12054, new C12281("compiler", "mod.not.allowed.here", enumSetOf));
            } else {
                enumSetNoneOf.add(EnumC9058.STATIC_PHASE);
            }
        }
        C9764 c9764 = new C9764(c0052M17169, enumSetNoneOf);
        c12054.f36051 = c9764;
        C0052 c0052 = this.f65364;
        c0052.f929 = c0052.f929.m8246(c9764);
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        C2609 c2609M8235;
        AbstractC12612 abstractC12612 = c13317.f39865;
        C2609 c2609 = c13317.f39866;
        AbstractC10370 abstractC10370M19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        C7814 c7814M47266 = c3267.f10261.m47266(this.f65364, abstractC10370M19452);
        c3267.f10282.getClass();
        new C5117(c7814M47266).mo10758(abstractC12612);
        C22317 c22317 = new C22317();
        HashMap map = this.f65360;
        C2609<C17524> c26010 = (C2609) C13843.computeIfAbsent(map, c7814M47266, c22317);
        for (C17524 c17524 : c26010) {
            C22364 c22364 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "conflicting.exports", c7814M47266));
        }
        if (c2609 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                AbstractC12612 abstractC12613 = (AbstractC12612) it.next();
                C0052 c0052M17169 = c3267.f10281.m17169(C7260.m19452(abstractC12613));
                C7260.m19459(c0052M17169, abstractC12613);
                C15240 c15240 = c3267.f10266;
                abstractC12613.getClass();
                c15240.m36153(abstractC12613, c0052M17169);
                Iterator it2 = c26010.iterator();
                while (it2.hasNext()) {
                    C2609 c26011 = ((C17524) it2.next()).f53522;
                    if (c26011 != null) {
                        Iterator it3 = c26011.iterator();
                        while (it3.hasNext()) {
                            if (c0052M17169 == ((C0052) it3.next())) {
                                C22364 c22365 = c3267.f10283;
                                C12281 c12282 = C6241.f19132;
                                c22365.m7273(abstractC12613, new C12281("compiler", "conflicting.exports.to.module", c0052M17169));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c0052M17169)) {
                    C22364 c22366 = c3267.f10283;
                    C12281 c12283 = C6241.f19132;
                    c22366.m7273(abstractC12613, new C12281("compiler", "conflicting.exports.to.module", c0052M17169));
                }
                it = it4;
            }
            c2609M8235 = C2609.m8235((Iterable) linkedHashSet);
        } else {
            c2609M8235 = null;
        }
        if (c2609M8235 == null || !c2609M8235.isEmpty()) {
            C17524 c17525 = new C17524(c7814M47266, c2609M8235, EnumSet.noneOf(EnumC14701.class));
            C0052 c0052 = this.f65364;
            c0052.f921 = c0052.f921.m8246(c17525);
            c13317.f39864 = c17525;
            map.put(c7814M47266, c26010.m8246(c17525));
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        C2609 c2609M8235;
        AbstractC12612 abstractC12612 = c0058.f946;
        C2609 c2609 = c0058.f947;
        AbstractC10370 abstractC10370M19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        C7814 c7814M47266 = c3267.f10261.m47266(this.f65364, abstractC10370M19452);
        c3267.f10282.getClass();
        new C5117(c7814M47266).mo10758(abstractC12612);
        if (this.f65364.f916.contains(EnumC18398.OPEN)) {
            c3267.f10283.m7273(c0058, C6241.f19189);
        }
        C18554 c18554 = new C18554(8);
        HashMap map = this.f65361;
        C2609<C23874> c26010 = (C2609) C13843.computeIfAbsent(map, c7814M47266, c18554);
        for (C23874 c23874 : c26010) {
            C22364 c22364 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "conflicting.opens", c7814M47266));
        }
        if (c2609 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                AbstractC12612 abstractC12613 = (AbstractC12612) it.next();
                C0052 c0052M17169 = c3267.f10281.m17169(C7260.m19452(abstractC12613));
                C7260.m19459(c0052M17169, abstractC12613);
                C15240 c15240 = c3267.f10266;
                abstractC12613.getClass();
                c15240.m36153(abstractC12613, c0052M17169);
                Iterator it2 = c26010.iterator();
                while (it2.hasNext()) {
                    C2609 c26011 = ((C23874) it2.next()).f77198;
                    if (c26011 != null) {
                        Iterator it3 = c26011.iterator();
                        while (it3.hasNext()) {
                            if (c0052M17169 == ((C0052) it3.next())) {
                                C22364 c22365 = c3267.f10283;
                                C12281 c12282 = C6241.f19132;
                                c22365.m7273(abstractC12613, new C12281("compiler", "conflicting.opens.to.module", c0052M17169));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c0052M17169)) {
                    C22364 c22366 = c3267.f10283;
                    C12281 c12283 = C6241.f19132;
                    c22366.m7273(abstractC12613, new C12281("compiler", "conflicting.opens.to.module", c0052M17169));
                }
                it = it4;
            }
            c2609M8235 = C2609.m8235((Iterable) linkedHashSet);
        } else {
            c2609M8235 = null;
        }
        if (c2609M8235 == null || !c2609M8235.isEmpty()) {
            C23874 c23875 = new C23874(c7814M47266, c2609M8235, EnumSet.noneOf(EnumC6941.class));
            C0052 c0052 = this.f65364;
            c0052.f919 = c0052.f919.m8246(c23875);
            c0058.f945 = c23875;
            map.put(c7814M47266, c26010.m8246(c23875));
        }
    }

    public C20201(C3267 c3267) {
        this.f65363 = c3267;
    }
}
