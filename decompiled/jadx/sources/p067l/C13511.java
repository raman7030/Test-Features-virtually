package p067l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13511 extends C6135 {
    /* JADX INFO: renamed from: ֫ */
    public final void m30667(String str, String str2) {
        C23335.m51957(str, str2);
        Map mapM40778 = this.f15397;
        if (mapM40778 == null) {
            mapM40778 = C17930.m40778();
            this.f15397 = mapM40778;
        }
        AbstractC13238 abstractC13238 = (AbstractC13238) ((C17930) mapM40778).get(str);
        AbstractC13238 abstractC13239 = abstractC13238;
        if (abstractC13238 == null) {
            int i = AbstractC8146.f21506;
            C23335.m51956(4, "expectedSize");
            C14181 c14181 = new C14181(4);
            c14181.f40439 = new Object[AbstractC8146.m18917(4)];
            Map mapM40779 = this.f15397;
            if (mapM40779 == null) {
                mapM40779 = C17930.m40778();
                this.f15397 = mapM40779;
            }
            ((C17930) mapM40779).put(str, c14181);
            abstractC13239 = c14181;
        }
        abstractC13239.mo8328(str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15521 m30666() {
        Map map = this.f15397;
        if (map == null) {
            return C2507.f4048;
        }
        Collection collectionEntrySet = ((C17930) map).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return C2507.f4048;
        }
        C24005<Map.Entry> c24005 = (C24005) collectionEntrySet;
        C8817 c8817 = new C8817(c24005.f76242.size());
        int size = 0;
        for (Map.Entry entry : c24005) {
            Object key = entry.getKey();
            AbstractC8146 abstractC8146CopyOf = AbstractC8146.copyOf((Collection) ((C14181) entry.getValue()).mo32660());
            if (!abstractC8146CopyOf.isEmpty()) {
                c8817.mo20376(key, abstractC8146CopyOf);
                size += abstractC8146CopyOf.size();
            }
        }
        return new C15521(c8817.mo20378(), size);
    }
}
