package p067l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3245 implements InterfaceC17365 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9951 f6321;

    public C3245(C9951 c9951) {
        this.f6321 = c9951;
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5646(Object obj) {
        return ((C10409) obj).m24114();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ۧ */
    public final String mo5647(Object obj) {
        return ((C10409) obj).m24113();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final List mo5645(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        C9951 c9951 = this.f6321;
        List list = (List) C7480.stream(c9951.f27551.m28625(c9951.m23245(strM41972))).skip(1L).collect(C24205.toList());
        if (c9951.f27549 == null && !list.isEmpty()) {
            try {
                C9951.m23244(c9951, list, strM41972);
            } catch (IOException unused) {
            }
        }
        return list;
    }
}
