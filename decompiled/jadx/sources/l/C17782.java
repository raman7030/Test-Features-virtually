package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17782 extends C11433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2260 f54393;

    public C17782(C9316 c9316, C16696 c16696, InterfaceC20561 interfaceC20561) {
        super(c16696, interfaceC20561);
        this.f54393 = c9316.f28267.m11184(interfaceC20561.getType());
    }

    @Override // l.C11433, l.InterfaceC20561
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) arrayList.get(i);
            String strM7470 = this.f54393.m7470(interfaceC9272.getName());
            if (strM7470 != null) {
                arrayList.set(i, new C16370(strM7470, interfaceC9272.getValue()));
            }
        }
        return C9316.m23972(arrayList);
    }
}
