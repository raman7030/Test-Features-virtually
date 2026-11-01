package p067l;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes.dex */
public final class C24398 extends AbstractC8305 {

    /* JADX INFO: renamed from: ܿ */
    public final String f77254;

    /* JADX INFO: renamed from: ᩳ */
    public final String f77255;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f77253 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f77251 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f77252 = new HashMap();

    public C24398(String str, String str2) {
        this.f77255 = str2;
        this.f77254 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24398 m53817(C16371 c16371) {
        boolean zM37187 = c16371.m37187();
        AbstractC19054 abstractC19054 = c16371.f48110;
        if (zM37187) {
            this.f77253.put((C18383) abstractC19054, c16371);
            return this;
        }
        this.f77251.put((C13020) abstractC19054, c16371);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4302 m53816() {
        Map map;
        HashMap map2 = this.f77252;
        if (map2.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map3 = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map3.put((String) entry.getKey(), new C9646((List) entry.getValue()));
            }
            map = map3;
        }
        return new C4302(this.f77254, this.f77255, this.f77253, this.f77251, map);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53818(C22408 c22408, C18383 c18383, Object obj, String str) {
        ((List) C15525.computeIfAbsent(this.f77252, str, new C24721(5))).add(new C15680(c22408, c18383, obj, str));
    }
}
