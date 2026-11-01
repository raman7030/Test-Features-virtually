package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۬ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14983 extends AbstractC20206 implements InterfaceC14313 {

    /* JADX INFO: renamed from: ۙ */
    public final String f42809;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC16192 f42810;

    /* JADX INFO: renamed from: ᩸ */
    public final String f42811;

    /* JADX INFO: renamed from: ᩹ */
    public final String f42812;

    public C14983(String str, String str2, String str3, List list) {
        this.f42811 = str;
        this.f42812 = str2;
        this.f42810 = C24371.m53727(list);
        this.f42809 = str3;
    }

    public C14983(String str, String str2, AbstractC16192 abstractC16192) {
        this.f42811 = str;
        this.f42812 = str2;
        this.f42810 = abstractC16192 == null ? AbstractC16192.m36872of() : abstractC16192;
        this.f42809 = "V";
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14983 m34337(InterfaceC7568 interfaceC7568) {
        if (interfaceC7568 instanceof C14983) {
            return (C14983) interfaceC7568;
        }
        return new C14983(interfaceC7568.mo5853(), interfaceC7568.getName(), interfaceC7568.mo5855(), interfaceC7568.mo5852());
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        return this.f42811;
    }

    @Override // p067l.InterfaceC7568
    public final String getName() {
        return this.f42812;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final List mo5852() {
        return this.f42810;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        return this.f42809;
    }
}
