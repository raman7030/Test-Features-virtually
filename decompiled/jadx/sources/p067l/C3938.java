package p067l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3938 implements InterfaceC1885 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC7291 f8545;

    public C3938(AbstractC7291 abstractC7291) {
        this.f8545 = abstractC7291;
    }

    @Override // p067l.InterfaceC1885
    /* JADX INFO: renamed from: ֫ */
    public final void mo7780(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC7291 abstractC7291 = this.f8545;
        C5950 c5950 = (C5950) abstractC7291.f19084.pollFirst();
        if (c5950 == null) {
            return;
        }
        String str = c5950.f14696;
        int i2 = c5950.f14695;
        ComponentCallbacksC11117 componentCallbacksC11117M30446 = abstractC7291.f19076.m30446(str);
        if (componentCallbacksC11117M30446 == null) {
            return;
        }
        componentCallbacksC11117M30446.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
