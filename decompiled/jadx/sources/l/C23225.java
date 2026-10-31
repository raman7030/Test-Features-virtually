package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23225 extends C14052 {
    public final /* synthetic */ C11937 d;

    public C23225(C11937 c11937) {
        this.d = c11937;
    }

    @Override // l.C14052
    public final String b(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        return this.d.a(j, enumC20655);
    }

    @Override // l.C14052
    public final String c(InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        return this.d.a(j, enumC20655);
    }

    @Override // l.C14052
    public final Iterator d(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC20655);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // l.C14052
    public final Iterator e(InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC20655);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
