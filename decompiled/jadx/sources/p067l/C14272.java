package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.۫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14272 implements InterfaceC4885 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15612 f40665;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Set f40666;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C18139 f40667;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ EnumC9955 f40668;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ Set f40669;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Set f40670;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Set f40671;

    public C14272(C15612 c15612, C18139 c18139, Set set, Set set2, Set set3, EnumC9955 enumC9955, Set set4) {
        this.f40665 = c15612;
        this.f40667 = c18139;
        this.f40666 = set;
        this.f40669 = set2;
        this.f40671 = set3;
        this.f40668 = enumC9955;
        this.f40670 = set4;
    }

    @Override // p067l.InterfaceC4885
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10364(C18139 c18139) {
        C15612 c15612 = this.f40665;
        C16953 c16953M38536 = c15612.f11214;
        C18139 c181310 = this.f40667;
        if (!c181310.m41320(c18139)) {
            c16953M38536 = c16953M38536.m38536(c18139);
        }
        if (!c181310.m41322(c18139)) {
            c15612 = (C15612) c16953M38536.m38534(c18139.m41323());
        }
        return C15612.m35485(c15612, c18139, this.f40666, this.f40669, this.f40671, this.f40668, this.f40670);
    }
}
