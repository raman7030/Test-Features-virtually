package p067l;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23036 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return AbstractC8543.m19894().mo19899((C25027) Collections.max(list, new C18992()), (C25027) Collections.max(list2, new C18992()), new C18992()).mo19897(list.size(), list2.size()).mo19899((C25027) Collections.max(list, new C16309()), (C25027) Collections.max(list2, new C16309()), new C16309()).mo19896();
    }
}
