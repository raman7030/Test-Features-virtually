package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes.dex */
public final class C23179 extends AbstractC6246 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f74510;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f74511;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f74509 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f74507 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f74508 = new HashMap();

    public C23179(String str, String str2) {
        this.f74511 = str2;
        this.f74510 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23179 m51421(C14733 c14733) {
        boolean zM35040 = c14733.m35040();
        AbstractC17556 abstractC17556 = c14733.f44997;
        if (zM35040) {
            this.f74509.put((C16850) abstractC17556, c14733);
            return this;
        }
        this.f74507.put((C11207) abstractC17556, c14733);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2034 m51420() {
        Map map;
        HashMap map2 = this.f74508;
        if (map2.isEmpty()) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map3 = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map3.put((String) entry.getKey(), new C7657((List) entry.getValue()));
            }
            map = map3;
        }
        return new C2034(this.f74510, this.f74511, this.f74509, this.f74507, map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51422(C21085 c21085, C16850 c16850, Object obj, String str) {
        ((List) C13843.computeIfAbsent(this.f74508, str, new C23519(5))).add(new C14006(c21085, c16850, obj, str));
    }
}
