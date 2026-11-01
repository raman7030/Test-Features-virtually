package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21016 {

    /* JADX INFO: renamed from: ֫ */
    public int f65969;

    /* JADX INFO: renamed from: ۜ */
    public final HashMap f65970;

    /* JADX INFO: renamed from: ۢ */
    public final HashSet f65971;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f65972;

    /* JADX INFO: renamed from: ܳ */
    public String f65973;

    /* JADX INFO: renamed from: ܽ */
    public C10286 f65974;

    /* JADX INFO: renamed from: ܿ */
    public String f65975;

    /* JADX INFO: renamed from: ᩳ */
    public int f65976;

    /* JADX INFO: renamed from: ᩷ */
    public final HashSet f65977;

    /* JADX INFO: renamed from: ᩻ */
    public final HashMap f65978;

    public C21016() {
        this.f65977 = new HashSet();
        this.f65972 = new HashMap();
        this.f65978 = new HashMap();
        this.f65971 = new HashSet();
        this.f65970 = new HashMap();
        this.f65976 = EnumC8140.f21480.m18907();
    }

    public C21016(String str, int i, int i2, String str2) {
        this.f65977 = new HashSet();
        this.f65972 = new HashMap();
        this.f65978 = new HashMap();
        this.f65971 = new HashSet();
        this.f65970 = new HashMap();
        EnumC8140.f21480.m18907();
        this.f65969 = i;
        this.f65976 = i2;
        this.f65975 = str;
        this.f65973 = str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47374(int i) {
        this.f65976 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47364(int i) {
        this.f65969 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47368(String str) {
        this.f65975 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47369(C2909 c2909) {
        this.f65977.add(c2909);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47370(C7604 c7604, Set set) {
        m47362(this.f65972, c7604, set);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47365(int i, int i2, String str) {
        m47362(this.f65972, new C7604(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47366(int i, int i2, String str, HashSet hashSet) {
        m47362(this.f65972, new C7604(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47371(C16990 c16990, Set set) {
        m47362(this.f65978, c16990, set);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47375(int i, int i2, String str) {
        m47362(this.f65978, new C16990(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47376(int i, int i2, String str, HashSet hashSet) {
        m47362(this.f65978, new C16990(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47373(C23027 c23027, Set set) {
        m47362(this.f65970, c23027, set);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47367(int i, String str, HashSet hashSet) {
        m47362(this.f65970, new C23027(i, str), hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47372(C21686 c21686) {
        this.f65971.add(c21686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5592 m47363() {
        int i = this.f65969;
        String str = this.f65975;
        int i2 = this.f65976;
        EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
        this.f65974 = new C10286(i, str, i2, EnumC21552.MODULE, this.f65973);
        return new C5592(this);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47362(HashMap map, C23697 c23697, Set set) {
        C12826.requireNonNull(set);
        if (!map.containsKey(c23697)) {
            map.put(c23697, new HashSet());
        }
        ((Set) map.get(c23697)).addAll(set);
    }
}
