package p067l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15914 extends C13234 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C11222 f46033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15914(C11222 c11222, C18236 c18236, InterfaceC21909 interfaceC21909) {
        super(c18236, interfaceC21909);
        this.f46033 = c11222;
    }

    @Override // p067l.C13234, p067l.InterfaceC21909
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) arrayList.get(i);
            if (interfaceC11180.getName().equals("name") && interfaceC11180.getValue().mo4670() == 23) {
                InterfaceC12262 value = interfaceC11180.getValue();
                C11222 c11222 = this.f46033;
                if (c11222.f31215 != null) {
                    String strSubstring = c11222.f31215.substring(c11222.f31215.lastIndexOf(36) + 1);
                    if (!strSubstring.isEmpty() && strSubstring.indexOf(47) == -1) {
                        char cCharAt = strSubstring.charAt(0);
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            strSubstring = strSubstring.substring(1);
                        }
                        value = new C12563(strSubstring);
                    }
                }
                arrayList.set(i, new C18597(value));
            }
        }
        return C11222.m25981(arrayList);
    }
}
