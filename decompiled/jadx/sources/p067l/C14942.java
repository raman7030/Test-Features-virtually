package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.۬ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14942 implements InterfaceC4885 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15612 f42660;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Set f42661;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C18139 f42662;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ EnumC9955 f42663;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ Set f42664;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Set f42665;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Set f42666;

    public C14942(C15612 c15612, C18139 c18139, Set set, Set set2, Set set3, EnumC9955 enumC9955, Set set4) {
        this.f42660 = c15612;
        this.f42662 = c18139;
        this.f42661 = set;
        this.f42664 = set2;
        this.f42666 = set3;
        this.f42663 = enumC9955;
        this.f42665 = set4;
    }

    @Override // p067l.InterfaceC4885
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10364(C18139 c18139) {
        C15612 c15612 = this.f42660;
        C16953 c16953M38536 = c15612.f11214;
        C18139 c181310 = this.f42662;
        if (!c181310.m41320(c18139)) {
            c16953M38536 = c16953M38536.m38536(c18139);
        }
        if (!c181310.m41322(c18139)) {
            c15612 = (C15612) c16953M38536.m38534(c18139.m41323());
        }
        C15612 c15613 = c15612;
        if (c181310.equals(c18139)) {
            return null;
        }
        return C15612.m35485(c15613, c18139, this.f42661, this.f42664, this.f42666, this.f42663, this.f42665);
    }
}
