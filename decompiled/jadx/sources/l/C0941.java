package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f3566;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f3568;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f3569;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f3565 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f3567 = new HashMap();

    public C0941(String str, String str2, List list) {
        this.f3568 = str;
        this.f3569 = str2;
        m3353(list);
    }

    public C0941(C12951 c12951) {
        this.f3568 = c12951.m31504();
        this.f3569 = c12951.m31504();
        int i = c12951.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C5175(c12951));
        }
        m3353(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3353(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            C5175 c5175 = (C5175) it.next();
            size = c5175.f16179.isEmpty() ? size + 1 : c5175.f16179.size() + size;
            this.f3567.put(c5175.f16180, c5175);
        }
        this.f3566 = size;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3357(C10130 c10130) {
        c10130.m25423((CharSequence) this.f3568);
        c10130.m25423((CharSequence) this.f3569);
        Collection<C5175> collectionValues = this.f3567.values();
        c10130.writeInt(collectionValues.size());
        for (C5175 c5175 : collectionValues) {
            c10130.m25423((CharSequence) c5175.f16180);
            List<C19287> list = c5175.f16179;
            c10130.writeInt(list.size());
            for (C19287 c19287 : list) {
                c10130.writeInt(c19287.f60680);
                c10130.writeInt(c19287.f60676);
                c10130.writeInt(c19287.f60677);
                c10130.writeInt(c19287.f60684);
                c10130.writeInt(c19287.f60685);
                c10130.m25423((CharSequence) c19287.f60682);
                c10130.m25423((CharSequence) c19287.f60681);
                c10130.m25423((CharSequence) c19287.f60679);
                c10130.m25423((CharSequence) c19287.f60683);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m3360() {
        return this.f3569;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m3361() {
        return this.f3568;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3358() {
        return this.f3566;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m3355() {
        return this.f3567.keySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5175 m3356(String str) {
        return (C5175) this.f3567.get(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3359(String str) {
        C5175 c5175 = (C5175) this.f3567.remove(str);
        if (c5175 == null) {
            return;
        }
        List list = c5175.f16179;
        this.f3566 -= list.isEmpty() ? 1 : list.size();
        this.f3565.remove(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3354(String str, Runnable runnable) {
        Iterator it = this.f3567.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C14336.m34214((String) entry.getKey()).equals(str)) {
                if (size == 0) {
                    runnable.run();
                }
                C5175 c5175 = (C5175) entry.getValue();
                size += c5175.f16179.isEmpty() ? 1 : c5175.f16179.size();
                it.remove();
            }
        }
        if (size == 0) {
            return 0;
        }
        this.f3566 -= size;
        C5378.removeIf(this.f3565, new C0235(0, str));
        return size;
    }
}
