package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1652 implements InterfaceC21030 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5180 f5765;

    public C1652(AbstractC5180 abstractC5180) {
        this.f5765 = abstractC5180;
    }

    @Override // l.InterfaceC21030
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5550(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC5180 abstractC5180 = this.f5765;
        C3769 c3769 = (C3769) abstractC5180.f16243.pollFirst();
        if (c3769 == null) {
            return;
        }
        String str = c3769.f11890;
        int i2 = c3769.f11889;
        ComponentCallbacksC9205 componentCallbacksC9205M28400 = abstractC5180.f16235.m28400(str);
        if (componentCallbacksC9205M28400 == null) {
            return;
        }
        componentCallbacksC9205M28400.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
