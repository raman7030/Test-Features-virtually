package p067l;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10482 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC20541 f29011;

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        String strSubstring;
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
        boolean z = true;
        if (!interfaceC19370.mo39148() && !interfaceC19370.isDirectory()) {
            ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f29011;
            HashSet hashSet = viewOnClickListenerC20541.f63482;
            String name = interfaceC19370.getName();
            if (name == null) {
                int i = C4686.f10556;
                strSubstring = null;
            } else {
                int iM9925 = C4686.m9925(name);
                strSubstring = iM9925 == -1 ? "" : name.substring(iM9925 + 1);
            }
            C13045.m29865(strSubstring, "getExtension(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            C13045.m29865(lowerCase, "toLowerCase(...)");
            if (!hashSet.contains(lowerCase)) {
                for (String str : viewOnClickListenerC20541.f63480) {
                    String name2 = interfaceC19370.getName();
                    C13045.m29865(name2, "getName(...)");
                    if (C5235.m11298(name2, str, true)) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
