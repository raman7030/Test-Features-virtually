package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24442 extends C15724 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13714 f77387d;

    public C24442(C13714 c13714) {
        this.f77387d = c13714;
    }

    @Override // p067l.C15724
    /* JADX INFO: renamed from: b */
    public final String mo35779b(InterfaceC4997 interfaceC4997, InterfaceC11901 interfaceC11901, long j, EnumC21999 enumC21999, Locale locale) {
        return this.f77387d.m31181a(j, enumC21999);
    }

    @Override // p067l.C15724
    /* JADX INFO: renamed from: c */
    public final String mo35780c(InterfaceC11901 interfaceC11901, long j, EnumC21999 enumC21999, Locale locale) {
        return this.f77387d.m31181a(j, enumC21999);
    }

    @Override // p067l.C15724
    /* JADX INFO: renamed from: d */
    public final Iterator mo35781d(InterfaceC4997 interfaceC4997, InterfaceC11901 interfaceC11901, EnumC21999 enumC21999, Locale locale) {
        List list = (List) ((HashMap) this.f77387d.f38708b).get(enumC21999);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // p067l.C15724
    /* JADX INFO: renamed from: e */
    public final Iterator mo35782e(InterfaceC11901 interfaceC11901, EnumC21999 enumC21999, Locale locale) {
        List list = (List) ((HashMap) this.f77387d.f38708b).get(enumC21999);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
