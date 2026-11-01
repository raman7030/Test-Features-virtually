package p067l;

/* JADX INFO: renamed from: l.ۤ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C12396 implements InterfaceC7976 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8728 f34642;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9713 f34643;

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ۧ */
    public final void mo18467(AbstractC14681 abstractC14681) {
    }

    public C12396(C8728 c8728, C9713 c9713) {
        this.f34642 = c8728;
        this.f34643 = c9713;
    }

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ֫ */
    public final void mo18466(AbstractC14681 abstractC14681) {
        C8728 c8728 = this.f34642;
        String str = c8728.f23671;
        String strMo33611 = abstractC14681.mo33611();
        AbstractC12000 abstractC12000Mo33610 = abstractC14681.mo33610();
        String strM4161 = C2692.m4161(str, strMo33611, abstractC12000Mo33610 == null ? null : abstractC12000Mo33610.mo27475(), abstractC14681.getName());
        String strM4162 = C2692.m4161(c8728.f23671, abstractC14681.mo33611(), (String) null, abstractC14681.getName());
        if (C2692.m4178(c8728, abstractC14681.mo33611(), strM4161, strM4162)) {
            this.f34643.m22682(strM4161, strM4162);
        }
    }

    @Override // p067l.InterfaceC7976
    /* JADX INFO: renamed from: ܽ */
    public final void mo18468(AbstractC14681 abstractC14681) {
        C13737 c13737M4165;
        C12752 c12752M4163 = C2692.m4163(abstractC14681.mo33610());
        if (c12752M4163 == null || (c13737M4165 = C2692.m4165(this.f34642, abstractC14681, c12752M4163)) == null) {
            return;
        }
        this.f34643.m22683(c13737M4165.f38836, c13737M4165.f38834, c13737M4165.f38837, c13737M4165.f38835);
    }
}
