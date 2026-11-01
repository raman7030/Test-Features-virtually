package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1UL */
/* JADX INFO: loaded from: classes3.dex */
public class C9210 extends AbstractC20206 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC7568 f24921;

    /* JADX INFO: renamed from: ᩹ */
    public final C18236 f24922;

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        return (String) this.f24922.m41469().mo6575(this.f24921.mo5853());
    }

    @Override // p067l.InterfaceC7568
    public String getName() {
        return this.f24921.getName();
    }

    public C9210(C18236 c18236, InterfaceC7568 interfaceC7568) {
        this.f24922 = c18236;
        this.f24921 = interfaceC7568;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final List mo5852() {
        InterfaceC7568 interfaceC7568 = this.f24921;
        ArrayList arrayList = new ArrayList(interfaceC7568.mo5852().size());
        Iterator it = interfaceC7568.mo5852().iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) it.next()).toString());
        }
        return C23190.m51663(this.f24922.m41469(), (List) arrayList);
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        return (String) this.f24922.m41469().mo6575(this.f24921.mo5855());
    }
}
