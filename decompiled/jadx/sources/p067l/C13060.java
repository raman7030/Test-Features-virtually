package p067l;

/* JADX INFO: renamed from: l.ۧ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13060 extends AbstractC10654 {
    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 4;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_TYPE_ID_ITEM;
    }

    @Override // p067l.AbstractC10654, p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        c3948.m7861().m8958(m24490().m32772());
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        C14930 c14930M32772 = m24490().m32772();
        int iM8956 = c3948.m7861().m8956(c14930M32772);
        if (c19705.m44765()) {
            c19705.m44760(0, m39359() + ' ' + c14930M32772.mo4819());
            c19705.m44760(4, "  descriptor_idx: ".concat(C16351.m37155(iM8956)));
        }
        c19705.m44773(iM8956);
    }
}
