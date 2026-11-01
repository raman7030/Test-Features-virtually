package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAW9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8704 extends AbstractC19433 {

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC7568 f23596;

    public C8704(C18762 c18762, InterfaceC7383 interfaceC7383, InterfaceC7568 interfaceC7568) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC7568.mo5852().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        super(c18762, interfaceC7383, sb.toString(), false);
        this.f23596 = interfaceC7568;
    }

    @Override // p067l.AbstractC19433, p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final List mo5822(C18762 c18762) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c18762.f56062.values().iterator();
        while (it.hasNext()) {
            for (C3349 c3349 : ((C2993) it.next()).mo5035()) {
                if (EnumC17248.STATIC.m39032(c3349.mo5854()) && c3349.equals(this.f23596)) {
                    arrayList.add(c3349);
                }
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "CustomMethodDecryptor[" + this.f23596 + "]";
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final String mo17051(int i, String str) {
        str.getClass();
        return (str.equals("Ljava/lang/CharSequence;") || str.equals("Ljava/lang/Object;")) ? "Ljava/lang/String;" : str;
    }
}
