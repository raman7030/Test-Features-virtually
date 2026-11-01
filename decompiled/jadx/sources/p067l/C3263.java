package p067l;

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
public final class C3263 {

    /* JADX INFO: renamed from: ۧ */
    public int f6343;

    /* JADX INFO: renamed from: ܿ */
    public final String f6345;

    /* JADX INFO: renamed from: ᩳ */
    public final String f6346;

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f6342 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f6344 = new HashMap();

    public C3263(String str, String str2, List list) {
        this.f6345 = str;
        this.f6346 = str2;
        m5672(list);
    }

    public C3263(C14677 c14677) {
        this.f6345 = c14677.m33591();
        this.f6346 = c14677.m33591();
        int i = c14677.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C7287(c14677));
        }
        m5672(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5672(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            C7287 c7287 = (C7287) it.next();
            size = c7287.f19020.isEmpty() ? size + 1 : c7287.f19020.size() + size;
            this.f6344.put(c7287.f19021, c7287);
        }
        this.f6343 = size;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5676(C11996 c11996) {
        c11996.m27443((CharSequence) this.f6345);
        c11996.m27443((CharSequence) this.f6346);
        Collection<C7287> collectionValues = this.f6344.values();
        c11996.writeInt(collectionValues.size());
        for (C7287 c7287 : collectionValues) {
            c11996.m27443((CharSequence) c7287.f19021);
            List<C20699> list = c7287.f19020;
            c11996.writeInt(list.size());
            for (C20699 c20699 : list) {
                c11996.writeInt(c20699.f63910);
                c11996.writeInt(c20699.f63906);
                c11996.writeInt(c20699.f63907);
                c11996.writeInt(c20699.f63914);
                c11996.writeInt(c20699.f63915);
                c11996.m27443((CharSequence) c20699.f63912);
                c11996.m27443((CharSequence) c20699.f63911);
                c11996.m27443((CharSequence) c20699.f63909);
                c11996.m27443((CharSequence) c20699.f63913);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m5679() {
        return this.f6346;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m5680() {
        return this.f6345;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5677() {
        return this.f6343;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m5674() {
        return this.f6344.keySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7287 m5675(String str) {
        return (C7287) this.f6344.get(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5678(String str) {
        C7287 c7287 = (C7287) this.f6344.remove(str);
        if (c7287 == null) {
            return;
        }
        List list = c7287.f19020;
        this.f6343 -= list.isEmpty() ? 1 : list.size();
        this.f6342.remove(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5673(String str, Runnable runnable) {
        Iterator it = this.f6344.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C15993.m36347((String) entry.getKey()).equals(str)) {
                if (size == 0) {
                    runnable.run();
                }
                C7287 c7287 = (C7287) entry.getValue();
                size += c7287.f19020.isEmpty() ? 1 : c7287.f19020.size();
                it.remove();
            }
        }
        if (size == 0) {
            return 0;
        }
        this.f6343 -= size;
        C7480.removeIf(this.f6342, new C2592(0, str));
        return size;
    }
}
