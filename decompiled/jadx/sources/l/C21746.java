package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21746 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return AbstractC6497.m17946().mo17951((C23841) Collections.max(list, new C17491()), (C23841) Collections.max(list2, new C17491()), new C17491()).mo17949(list.size(), list2.size()).mo17951((C23841) Collections.max(list, new C14668()), (C23841) Collections.max(list2, new C14668()), new C14668()).mo17948();
    }
}
