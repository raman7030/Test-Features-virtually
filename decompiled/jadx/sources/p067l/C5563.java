package p067l;

/* JADX INFO: renamed from: l.ۗܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BDK */
/* JADX INFO: loaded from: classes3.dex */
public final class C5563 implements InterfaceC13650 {

    /* JADX INFO: renamed from: ֫ */
    public final C23512 f13442;

    /* JADX INFO: renamed from: ۧ */
    public final C23708 f13443;

    /* JADX INFO: renamed from: ܽ */
    public final C8245 f13444;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC13650 f13445;

    /* JADX INFO: renamed from: ᩳ */
    public final C24338 f13446;

    public C5563(InterfaceC13650 interfaceC13650, C23708 c23708, boolean z) {
        this.f13445 = interfaceC13650;
        this.f13443 = c23708;
        C23512 c23512 = (C23512) interfaceC13650.getAttributes().m35585("Code");
        this.f13442 = c23512;
        C15660 c15660M52282 = c23512.m52282();
        C8245 c8245M19036 = C8245.f21845;
        for (C12113 c12113 = (C12113) c15660M52282.m35585("LineNumberTable"); c12113 != null; c12113 = (C12113) c15660M52282.m35584(c12113)) {
            c8245M19036 = C8245.m19036(c8245M19036, c12113.m28004());
        }
        this.f13444 = c8245M19036;
        C24338 c24338M53700 = C24338.f77101;
        if (z) {
            for (C8089 c8089 = (C8089) c15660M52282.m35585("LocalVariableTable"); c8089 != null; c8089 = (C8089) c15660M52282.m35584(c8089)) {
                c24338M53700 = C24338.m53699(c24338M53700, c8089.m20608());
            }
            C24338 c24338M53699 = C24338.f77101;
            for (C13454 c13454 = (C13454) c15660M52282.m35585("LocalVariableTypeTable"); c13454 != null; c13454 = (C13454) c15660M52282.m35584(c13454)) {
                c24338M53699 = C24338.m53699(c24338M53699, c13454.m20608());
            }
            if (c24338M53699.size() != 0) {
                c24338M53700 = C24338.m53700(c24338M53700, c24338M53699);
            }
        }
        this.f13446 = c24338M53700;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m12305() {
        return ((this.f13443.m52717() & 512) == 0 || this.f13445.mo12301().m48852()) ? false : true;
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ۜ */
    public final C21637 mo12301() {
        return this.f13445.mo12301();
    }

    @Override // p067l.InterfaceC8285
    public final C14930 getName() {
        return this.f13445.getName();
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ᩻ */
    public final C14930 mo12310() {
        return this.f13445.mo12310();
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m12300() {
        return (this.f13445.mo12306() & 8) != 0;
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ܽ */
    public final int mo12306() {
        return this.f13445.mo12306();
    }

    @Override // p067l.InterfaceC8285
    public final C15660 getAttributes() {
        return this.f13445.getAttributes();
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ܳ */
    public final C14260 mo12304() {
        return this.f13445.mo12304();
    }

    @Override // p067l.InterfaceC13650
    /* JADX INFO: renamed from: ֫ */
    public final C24318 mo12299() {
        return this.f13445.mo12299();
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m12302() {
        return this.f13442.m52283();
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m12303() {
        return this.f13442.m52285();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C6904 m12307() {
        return this.f13442.m52286();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10257 m12308() {
        return this.f13442.m52284();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C24338 m12309() {
        return this.f13446;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12054 m12298(int i) {
        return new C12054(this.f13443.m52722(), i, this.f13444.m19038(i));
    }
}
