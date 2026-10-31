package l;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8537 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f26096;

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        String strSubstring;
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        boolean z = true;
        if (!interfaceC17889.mo36982() && !interfaceC17889.isDirectory()) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f26096;
            HashSet hashSet = viewOnClickListenerC19121.f60250;
            String name = interfaceC17889.getName();
            if (name == null) {
                int i = C2439.f7766;
                strSubstring = null;
            } else {
                int iM7877 = C2439.m7877(name);
                strSubstring = iM7877 == -1 ? "" : name.substring(iM7877 + 1);
            }
            C11233.m27803(strSubstring, "getExtension(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            C11233.m27803(lowerCase, "toLowerCase(...)");
            if (!hashSet.contains(lowerCase)) {
                for (String str : viewOnClickListenerC19121.f60248) {
                    String name2 = interfaceC17889.getName();
                    C11233.m27803(name2, "getName(...)");
                    if (C3016.m9240(name2, str, true)) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
