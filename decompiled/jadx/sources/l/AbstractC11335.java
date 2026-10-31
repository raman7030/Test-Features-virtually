package l;

import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۧ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11335 implements InterfaceC13883 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22933 f33912;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5168 f33913;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean mo7138(int i) {
        return true;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo7139() {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ void mo7141() {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo7142(int i) {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ boolean mo7145() {
        return true;
    }

    public AbstractC11335(C5168 c5168, C22933 c22933) {
        this.f33913 = c5168;
        this.f33912 = c22933;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۜ */
    public final String mo7137() {
        return this.f33913.m14826();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩳ֫ */
    public final IInArchive mo7143() {
        return this.f33913.m14825();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ */
    public final void mo7140(IInArchive iInArchive) {
        this.f33913.m14823(iInArchive);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܽ */
    public final void mo14154() {
        this.f33912.m51044();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f33912.m51053();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo14152(int i) {
        this.f33912.m51045(i);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7144() {
        return C10395.m26212(mo7137());
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo7136(String str) {
        C10395.m26217(mo7137(), str);
    }
}
