package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAW9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6666 extends AbstractC17955 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC5471 f20721;

    public C6666(C17249 c17249, InterfaceC5276 interfaceC5276, InterfaceC5471 interfaceC5471) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        super(c17249, interfaceC5276, sb.toString(), false);
        this.f20721 = interfaceC5471;
    }

    @Override // l.AbstractC17955, l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public final List mo3535(C17249 c17249) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c17249.f52880.values().iterator();
        while (it.hasNext()) {
            for (C1032 c1032 : ((C0657) it.next()).mo2696()) {
                if (EnumC15657.STATIC.m36866(c1032.mo3567()) && c1032.equals(this.f20721)) {
                    arrayList.add(c1032);
                }
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "CustomMethodDecryptor[" + this.f20721 + "]";
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public final String mo15148(int i, String str) {
        str.getClass();
        return (str.equals("Ljava/lang/CharSequence;") || str.equals("Ljava/lang/Object;")) ? "Ljava/lang/String;" : str;
    }
}
