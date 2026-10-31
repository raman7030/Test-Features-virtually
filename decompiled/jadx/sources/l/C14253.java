package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14253 extends C11433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9316 f42941;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14253(C9316 c9316, C16696 c16696, InterfaceC20561 interfaceC20561) {
        super(c16696, interfaceC20561);
        this.f42941 = c9316;
    }

    @Override // l.C11433, l.InterfaceC20561
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) arrayList.get(i);
            if (interfaceC9272.getName().equals("name") && interfaceC9272.getValue().mo2302() == 23) {
                InterfaceC10410 value = interfaceC9272.getValue();
                C9316 c9316 = this.f42941;
                if (c9316.f28266 != null) {
                    String strSubstring = c9316.f28266.substring(c9316.f28266.lastIndexOf(36) + 1);
                    if (!strSubstring.isEmpty() && strSubstring.indexOf(47) == -1) {
                        char cCharAt = strSubstring.charAt(0);
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            strSubstring = strSubstring.substring(1);
                        }
                        value = new C10727(strSubstring);
                    }
                }
                arrayList.set(i, new C17076(value));
            }
        }
        return C9316.m23972(arrayList);
    }
}
