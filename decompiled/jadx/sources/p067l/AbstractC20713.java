package p067l;

/* JADX INFO: renamed from: l.᩵ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBCF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20713 extends AbstractC10654 {

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC16941 f63942;

    /* JADX INFO: renamed from: ۡ */
    public abstract String mo37793();

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 8;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo37794(C3948 c3948);

    public AbstractC20713(AbstractC16941 abstractC16941) {
        super(abstractC16941.m38521());
        this.f63942 = abstractC16941;
    }

    @Override // p067l.AbstractC10654, p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public void mo5192(C3948 c3948) {
        super.mo5192(c3948);
        c3948.m7861().m8958(this.f63942.m38522().getName());
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        C18423 c18423M7862 = c3948.m7862();
        C4342 c4342M7861 = c3948.m7861();
        AbstractC16941 abstractC16941 = this.f63942;
        C21637 c21637M38522 = abstractC16941.m38522();
        int iM41989 = c18423M7862.m41989(m24490());
        int iM8956 = c4342M7861.m8956(c21637M38522.getName());
        int iMo37794 = mo37794(c3948);
        if (c19705.m44765()) {
            c19705.m44760(0, m39359() + ' ' + abstractC16941.mo4819());
            c19705.m44760(2, "  class_idx: ".concat(C16351.m37153(iM41989)));
            c19705.m44760(2, String.format("  %-10s %s", mo37793().concat(":"), C16351.m37153(iMo37794)));
            c19705.m44760(4, "  name_idx:  ".concat(C16351.m37155(iM8956)));
        }
        c19705.m44770(iM41989);
        c19705.m44770(iMo37794);
        c19705.m44773(iM8956);
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC16941 m46788() {
        return this.f63942;
    }
}
