package p067l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3845 extends AbstractC3441 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC23661 f8253;

    /* JADX INFO: renamed from: ᩸ */
    public final C4516 f8254;

    /* JADX INFO: renamed from: ᩹ */
    public final C18236 f8255;

    public C3845(C11222 c11222, C18236 c18236, InterfaceC23661 interfaceC23661) {
        this.f8255 = c18236;
        this.f8253 = interfaceC23661;
        this.f8254 = c11222.f31216.m13144(interfaceC23661.getType());
    }

    @Override // p067l.InterfaceC23661
    public final String getType() {
        return (String) this.f8255.m41469().mo6575(this.f8253.getType());
    }

    @Override // p067l.InterfaceC23661
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(C23190.m51664(this.f8253.getElements(), this.f8255.m41470()));
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) arrayList.get(i);
            String strM9552 = this.f8254.m9552(interfaceC11180.getName());
            if (strM9552 != null) {
                arrayList.set(i, new C9249(strM9552, interfaceC11180.getValue()));
            }
        }
        return C11222.m25981(arrayList);
    }
}
