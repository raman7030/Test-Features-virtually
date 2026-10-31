package l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩵᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19789 extends AbstractC4971 implements InterfaceC2999, InterfaceC12876, InterfaceC10509, InterfaceC6275, InterfaceC13207, InterfaceC23103, InterfaceC0567, InterfaceC22285, InterfaceC19997, InterfaceC19974 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0737 f63906;

    @Override // l.InterfaceC19997
    /* JADX INFO: renamed from: ֫ */
    public final void mo18099(ComponentCallbacksC9205 componentCallbacksC9205) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19789(ActivityC0737 activityC0737) {
        super(activityC0737);
        this.f63906 = activityC0737;
    }

    @Override // l.InterfaceC23586
    public final AbstractC7379 getLifecycle() {
        return this.f63906.f2782;
    }

    @Override // l.InterfaceC13207
    public final C3330 getViewModelStore() {
        return this.f63906.getViewModelStore();
    }

    @Override // l.InterfaceC23103
    public final C11815 getOnBackPressedDispatcher() {
        return this.f63906.getOnBackPressedDispatcher();
    }

    @Override // l.AbstractC4971
    /* JADX INFO: renamed from: ֫ */
    public final void mo14429(PrintWriter printWriter, String[] strArr) {
        this.f63906.dump(EnumC0121.f1143, null, printWriter, strArr);
    }

    @Override // l.AbstractC4971
    /* JADX INFO: renamed from: ۜ */
    public final LayoutInflater mo14430() {
        ActivityC0737 activityC0737 = this.f63906;
        return activityC0737.getLayoutInflater().cloneInContext(activityC0737);
    }

    @Override // l.AbstractC4971
    /* JADX INFO: renamed from: ܳ */
    public final ActivityC0737 mo14432() {
        return this.f63906;
    }

    @Override // l.AbstractC4971
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14431(String str) {
        return C19039.m43891((Activity) this.f63906, str);
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ֫ */
    public final View mo7106(int i) {
        return this.f63906.findViewById(i);
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7107() {
        Window window = this.f63906.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // l.InterfaceC0567
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19619 mo2322() {
        return this.f63906.mo2322();
    }

    @Override // l.InterfaceC22285
    public final C15228 getSavedStateRegistry() {
        return this.f63906.getSavedStateRegistry();
    }

    @Override // l.InterfaceC2999
    /* JADX INFO: renamed from: ֫ */
    public final void mo9143(InterfaceC13041 interfaceC13041) {
        this.f63906.mo9143(interfaceC13041);
    }

    @Override // l.InterfaceC2999
    /* JADX INFO: renamed from: ۜ */
    public final void mo9144(InterfaceC13041 interfaceC13041) {
        this.f63906.mo9144(interfaceC13041);
    }

    @Override // l.InterfaceC12876
    /* JADX INFO: renamed from: ܿ */
    public final void mo31308(InterfaceC13041 interfaceC13041) {
        this.f63906.mo31308(interfaceC13041);
    }

    @Override // l.InterfaceC12876
    /* JADX INFO: renamed from: ܽ */
    public final void mo31307(InterfaceC13041 interfaceC13041) {
        this.f63906.mo31307(interfaceC13041);
    }

    @Override // l.InterfaceC10509
    /* JADX INFO: renamed from: ᩻ */
    public final void mo26415(InterfaceC13041 interfaceC13041) {
        this.f63906.mo26415(interfaceC13041);
    }

    @Override // l.InterfaceC10509
    /* JADX INFO: renamed from: ܳ */
    public final void mo26414(InterfaceC13041 interfaceC13041) {
        this.f63906.mo26414(interfaceC13041);
    }

    @Override // l.InterfaceC6275
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17288(InterfaceC13041 interfaceC13041) {
        this.f63906.mo17288(interfaceC13041);
    }

    @Override // l.InterfaceC6275
    /* JADX INFO: renamed from: ۧ */
    public final void mo17287(InterfaceC13041 interfaceC13041) {
        this.f63906.mo17287(interfaceC13041);
    }

    @Override // l.InterfaceC19974
    public final void addMenuProvider(InterfaceC11507 interfaceC11507) {
        this.f63906.addMenuProvider(interfaceC11507);
    }

    @Override // l.InterfaceC19974
    public final void removeMenuProvider(InterfaceC11507 interfaceC11507) {
        this.f63906.removeMenuProvider(interfaceC11507);
    }

    @Override // l.AbstractC4971
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14436() {
        this.f63906.invalidateOptionsMenu();
    }
}
