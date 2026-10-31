package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۛ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48R2 */
/* JADX INFO: loaded from: classes2.dex */
public class C6257 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19350;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f19351;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10491 f19352;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f19353;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f19354;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f19355;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f19356;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f19357;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f19358;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f19359;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f19360;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f19361;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f19362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19363;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashSet f19364;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19365;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f19366;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f19367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f19368;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f19369;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f19370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f19371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19372;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f19373;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f19374;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f19375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f19376;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19377;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f19378;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19379;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f19380;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6257 mo17264(C12607 c12607) {
        C13312 c13312 = c12607.f38012;
        mo17261(c13312.f39853);
        this.f19357.put(c13312, c12607);
        return this;
    }

    public C6257() {
        this.f19353 = Integer.MAX_VALUE;
        this.f19370 = Integer.MAX_VALUE;
        this.f19361 = Integer.MAX_VALUE;
        this.f19362 = Integer.MAX_VALUE;
        this.f19365 = Integer.MAX_VALUE;
        this.f19363 = Integer.MAX_VALUE;
        this.f19380 = true;
        this.f19358 = true;
        this.f19356 = AbstractC14545.of();
        this.f19376 = AbstractC14545.of();
        this.f19354 = 0;
        this.f19351 = AbstractC14545.of();
        this.f19369 = 0;
        this.f19377 = Integer.MAX_VALUE;
        this.f19359 = Integer.MAX_VALUE;
        this.f19360 = AbstractC14545.of();
        this.f19352 = C10491.f31474;
        this.f19378 = AbstractC14545.of();
        this.f19379 = 0;
        this.f19366 = true;
        this.f19372 = 0;
        this.f19367 = false;
        this.f19368 = false;
        this.f19373 = false;
        this.f19371 = false;
        this.f19357 = new HashMap();
        this.f19364 = new HashSet();
    }

    public C6257(C11902 c11902) {
        m17244(c11902);
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17244(C11902 c11902) {
        this.f19353 = c11902.f35548;
        this.f19370 = c11902.f35565;
        this.f19361 = c11902.f35556;
        this.f19362 = c11902.f35557;
        this.f19350 = c11902.f35545;
        this.f19375 = c11902.f35570;
        this.f19374 = c11902.f35569;
        this.f19355 = c11902.f35550;
        this.f19365 = c11902.f35560;
        this.f19363 = c11902.f35558;
        this.f19380 = c11902.f35575;
        this.f19358 = c11902.f35553;
        this.f19356 = c11902.f35551;
        this.f19376 = c11902.f35571;
        this.f19354 = c11902.f35549;
        this.f19351 = c11902.f35546;
        this.f19369 = c11902.f35564;
        this.f19377 = c11902.f35572;
        this.f19359 = c11902.f35554;
        this.f19360 = c11902.f35555;
        this.f19352 = c11902.f35547;
        this.f19378 = c11902.f35573;
        this.f19379 = c11902.f35574;
        this.f19366 = c11902.f35561;
        this.f19372 = c11902.f35567;
        this.f19367 = c11902.f35562;
        this.f19368 = c11902.f35563;
        this.f19373 = c11902.f35568;
        this.f19371 = c11902.f35566;
        this.f19364 = new HashSet(c11902.f35559);
        this.f19357 = new HashMap(c11902.f35552);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17267(C11902 c11902) {
        m17244(c11902);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6257 mo17269() {
        return mo17265(new String[0]);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6257 mo17270() {
        this.f19379 = 0;
        this.f19366 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6257 mo17268() {
        this.f19372 = -3;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6257 mo17261(int i) {
        Iterator it = this.f19357.values().iterator();
        while (it.hasNext()) {
            if (((C12607) it.next()).f38012.f39853 == i) {
                it.remove();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6257 mo17263(Set set) {
        this.f19364.clear();
        this.f19364.addAll(set);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6257 mo17262(int i, boolean z) {
        if (z) {
            this.f19364.add(Integer.valueOf(i));
            return this;
        }
        this.f19364.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11902 mo17266() {
        return new C11902(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6257 mo17265(String... strArr) {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        for (String str : strArr) {
            str.getClass();
            c1846.m16264(C3603.m11048(str));
        }
        this.f19378 = c1846.m6131();
        this.f19366 = false;
        return this;
    }
}
