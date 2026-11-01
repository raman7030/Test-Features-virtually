package p067l;

import android.widget.Spinner;

/* JADX INFO: renamed from: l.۫ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13987 implements InterfaceC24873 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C0990 f39474;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Spinner f39475;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ Spinner f39476;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C0990 f39477;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C11463 f39478;

    public C13987(Spinner spinner, Spinner spinner2, C0990 c0990, C0990 c0991, C11463 c11463) {
        this.f39475 = spinner;
        this.f39476 = spinner2;
        this.f39477 = c0990;
        this.f39474 = c0991;
        this.f39478 = c11463;
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ֫ */
    public final C18483 mo30399() {
        String strMo12362 = ((AbstractC14973) C10792.f29905.get(this.f39475.getSelectedItemPosition())).mo12362();
        EnumC10104 enumC10104 = EnumC10104.values()[this.f39476.getSelectedItemPosition()];
        C0990 c0990 = this.f39477;
        String str = c0990.isChecked() ? (String) c0990.getTag() : null;
        String str2 = (str == null || !str.isEmpty()) ? str : null;
        C0990 c0991 = this.f39474;
        return new C18483(strMo12362, enumC10104, str2, c0991 != null && c0991.isChecked());
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo30401() {
        return C11463.m26458(this.f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo30403() {
        return C11463.m26461(this.f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ܿ */
    public final C23021 mo30402() {
        return C11463.m26460(this.f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ֫ */
    public final void mo30400(Runnable runnable) {
        C11463.m26457(this.f39478, runnable);
    }
}
