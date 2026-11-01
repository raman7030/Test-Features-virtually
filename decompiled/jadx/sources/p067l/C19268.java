package p067l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19268 extends C13234 {

    /* JADX INFO: renamed from: ۙ */
    public final C4516 f57587;

    public C19268(C11222 c11222, C18236 c18236, InterfaceC21909 interfaceC21909) {
        super(c18236, interfaceC21909);
        this.f57587 = c11222.f31216.m13144(interfaceC21909.getType());
    }

    @Override // p067l.C13234, p067l.InterfaceC21909
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) arrayList.get(i);
            String strM9552 = this.f57587.m9552(interfaceC11180.getName());
            if (strM9552 != null) {
                arrayList.set(i, new C17926(strM9552, interfaceC11180.getValue()));
            }
        }
        return C11222.m25981(arrayList);
    }
}
