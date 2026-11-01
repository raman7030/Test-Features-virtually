package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3974 {

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f8635;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f8636;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f8637;

    public C3974(ArrayList arrayList, HashMap map, HashSet hashSet) {
        this.f8636 = arrayList;
        this.f8637 = map;
        this.f8635 = hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m7921() {
        return this.f8636;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7923(C19160 c19160) {
        return this.f8635.contains(c19160.f57226);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m7922(String str) {
        return (AbstractC17043) this.f8637.get(str);
    }
}
