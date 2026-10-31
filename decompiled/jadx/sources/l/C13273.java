package l;

import java.util.List;

/* JADX INFO: renamed from: l.۬ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13273 extends AbstractC18769 implements InterfaceC12568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f39744;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f39745;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f39746;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f39747;

    public C13273(String str, String str2, String str3, List list) {
        this.f39746 = str;
        this.f39747 = str2;
        this.f39745 = C23151.m51332(list);
        this.f39744 = str3;
    }

    public C13273(String str, String str2, AbstractC14545 abstractC14545) {
        this.f39746 = str;
        this.f39747 = str2;
        this.f39745 = abstractC14545 == null ? AbstractC14545.of() : abstractC14545;
        this.f39744 = "V";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13273 m32238(InterfaceC5471 interfaceC5471) {
        if (interfaceC5471 instanceof C13273) {
            return (C13273) interfaceC5471;
        }
        return new C13273(interfaceC5471.mo3566(), interfaceC5471.getName(), interfaceC5471.mo3568(), interfaceC5471.mo3565());
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ܳ */
    public final String mo3566() {
        return this.f39746;
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        return this.f39747;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ۘ */
    public final List mo3565() {
        return this.f39745;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3568() {
        return this.f39744;
    }
}
