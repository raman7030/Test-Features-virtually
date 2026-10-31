package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܶܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15348 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f47034;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f47035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18878 f47036;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f47037;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f47038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13232 f47039;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f47040;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f47041;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f47042;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f47043;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f47044;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap f47033 = new HashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f47032 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f47030 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f47031 = new ArrayList();

    public C15348(C18878 c18878, int i, String str, int i2, int i3, int i4, int i5, int i6, HashSet hashSet) {
        this.f47036 = c18878;
        this.f47043 = i;
        this.f47037 = str;
        this.f47034 = i2;
        this.f47038 = i3;
        this.f47040 = i4;
        this.f47041 = i5;
        this.f47044 = i6;
        this.f47042 = hashSet;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36386() {
        C1238 c1238 = new C1238();
        ArrayList arrayList = this.f47030;
        C6083.sort(arrayList, c1238);
        this.f47035 = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = this.f47031;
            if (arrayList2.size() >= this.f47034) {
                return;
            }
            C5472 c5472 = (C5472) arrayList.get(i);
            arrayList2.add(C9042.m23308(this.f47036, c5472.f16999, c5472.f17000, this.f47038, this.f47040, this.f47041, this.f47044, this.f47042, this.f47033));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m36385() {
        ArrayList arrayList = new ArrayList(this.f47032);
        C6083.sort(arrayList, new C8294());
        return arrayList;
    }
}
