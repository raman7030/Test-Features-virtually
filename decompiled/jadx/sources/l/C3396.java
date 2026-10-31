package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396 extends AbstractC3952 implements InterfaceC12568 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f10751;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f10752;

    public C3396(String str, List list) {
        this.f10751 = C23151.m51332(list);
        this.f10752 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3396 m10363(InterfaceC0531 interfaceC0531) {
        if (interfaceC0531 instanceof C3396) {
            return (C3396) interfaceC0531;
        }
        return new C3396(interfaceC0531.mo2258(), interfaceC0531.mo2257());
    }

    @Override // l.InterfaceC0531
    /* JADX INFO: renamed from: ۘ */
    public final List mo2257() {
        return this.f10751;
    }

    @Override // l.InterfaceC0531
    /* JADX INFO: renamed from: ᩳ */
    public final String mo2258() {
        return this.f10752;
    }
}
