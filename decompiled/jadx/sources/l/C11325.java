package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11325 extends AbstractC18769 implements InterfaceC18444 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18444 f33893;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16968 f33894;

    public C11325(C16968 c16968, InterfaceC18444 interfaceC18444) {
        this.f33894 = c16968;
        this.f33893 = interfaceC18444;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ܳ */
    public final String mo3566() {
        return ((InterfaceC5471) this.f33894.f52056.m39235().mo4329(this.f33893)).mo3566();
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        return ((InterfaceC5471) this.f33894.f52056.m39235().mo4329(this.f33893)).getName();
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ۘ */
    public final List mo3565() {
        return ((InterfaceC5471) this.f33894.f52056.m39235().mo4329(this.f33893)).mo3565();
    }

    @Override // l.InterfaceC18444
    public final List getParameters() {
        return new C16262(this.f33894.f52056.m39242(), this.f33893.getParameters());
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3568() {
        return ((InterfaceC5471) this.f33894.f52056.m39235().mo4329(this.f33893)).mo3568();
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ܽ */
    public final int mo3567() {
        return this.f33893.mo3567();
    }

    @Override // l.InterfaceC18444
    public final Set getAnnotations() {
        return new C9208(this.f33893.getAnnotations(), this.f33894.f52056.m39240());
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo3569() {
        return this.f33893.mo3569();
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩷ۧ */
    public final InterfaceC19150 mo3570() {
        return (InterfaceC19150) C21908.m49309(this.f33894.f52056.m39238(), this.f33893.mo3570());
    }
}
