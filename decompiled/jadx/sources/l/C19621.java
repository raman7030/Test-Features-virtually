package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19621 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63348;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap f63349;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet f63350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f63351;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f63352;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8331 f63353;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f63354;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f63356;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f63357;

    public C19621() {
        this.f63356 = new HashSet();
        this.f63351 = new HashMap();
        this.f63357 = new HashMap();
        this.f63350 = new HashSet();
        this.f63349 = new HashMap();
        this.f63355 = EnumC6073.f18624.m16978();
    }

    public C19621(String str, int i, int i2, String str2) {
        this.f63356 = new HashSet();
        this.f63351 = new HashMap();
        this.f63357 = new HashMap();
        this.f63350 = new HashSet();
        this.f63349 = new HashMap();
        EnumC6073.f18624.m16978();
        this.f63348 = i;
        this.f63355 = i2;
        this.f63354 = str;
        this.f63352 = str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45078(int i) {
        this.f63355 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45068(int i) {
        this.f63348 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45072(String str) {
        this.f63354 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45073(C0569 c0569) {
        this.f63356.add(c0569);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45074(C5509 c5509, Set set) {
        m45066(this.f63351, c5509, set);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45069(int i, int i2, String str) {
        m45066(this.f63351, new C5509(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45070(int i, int i2, String str, HashSet hashSet) {
        m45066(this.f63351, new C5509(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45075(C15385 c15385, Set set) {
        m45066(this.f63357, c15385, set);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45079(int i, int i2, String str) {
        m45066(this.f63357, new C15385(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45080(int i, int i2, String str, HashSet hashSet) {
        m45066(this.f63357, new C15385(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45077(C21737 c21737, Set set) {
        m45066(this.f63349, c21737, set);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45071(int i, String str, HashSet hashSet) {
        m45066(this.f63349, new C21737(i, str), hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45076(C20326 c20326) {
        this.f63350.add(c20326);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3392 m45067() {
        int i = this.f63348;
        String str = this.f63354;
        int i2 = this.f63355;
        EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
        this.f63353 = new C8331(i, str, i2, EnumC20185.MODULE, this.f63352);
        return new C3392(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45066(HashMap map, C22442 c22442, Set set) {
        C11003.requireNonNull(set);
        if (!map.containsKey(c22442)) {
            map.put(c22442, new HashSet());
        }
        ((Set) map.get(c22442)).addAll(set);
    }
}
