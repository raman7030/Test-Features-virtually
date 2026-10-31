package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1UL */
/* JADX INFO: loaded from: classes3.dex */
public class C7199 extends AbstractC18769 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC5471 f22043;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16696 f22044;

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ܳ */
    public final String mo3566() {
        return (String) this.f22044.m39233().mo4329(this.f22043.mo3566());
    }

    @Override // l.InterfaceC5471
    public String getName() {
        return this.f22043.getName();
    }

    public C7199(C16696 c16696, InterfaceC5471 interfaceC5471) {
        this.f22044 = c16696;
        this.f22043 = interfaceC5471;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ۘ */
    public final List mo3565() {
        InterfaceC5471 interfaceC5471 = this.f22043;
        ArrayList arrayList = new ArrayList(interfaceC5471.mo3565().size());
        Iterator it = interfaceC5471.mo3565().iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) it.next()).toString());
        }
        return C21908.m49310(this.f22044.m39233(), (List) arrayList);
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3568() {
        return (String) this.f22044.m39233().mo4329(this.f22043.mo3568());
    }
}
