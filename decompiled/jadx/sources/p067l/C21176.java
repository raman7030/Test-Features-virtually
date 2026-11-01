package p067l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩵᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21176 extends AbstractC7093 implements InterfaceC0991, InterfaceC1481, InterfaceC1363, InterfaceC1153, InterfaceC14920, InterfaceC1988, InterfaceC0870, InterfaceC23548, InterfaceC21373, InterfaceC1833 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ActivityC3069 f66543;

    @Override // p067l.InterfaceC21373
    /* JADX INFO: renamed from: ֫ */
    public final void mo20051(ComponentCallbacksC11117 componentCallbacksC11117) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21176(ActivityC3069 activityC3069) {
        super(activityC3069);
        this.f66543 = activityC3069;
    }

    @Override // p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        return this.f66543.f5556;
    }

    @Override // p067l.InterfaceC14920
    public final C5533 getViewModelStore() {
        return this.f66543.getViewModelStore();
    }

    @Override // p067l.InterfaceC1988
    public final C1428 getOnBackPressedDispatcher() {
        return this.f66543.getOnBackPressedDispatcher();
    }

    @Override // p067l.AbstractC7093
    /* JADX INFO: renamed from: ֫ */
    public final void mo16333(PrintWriter printWriter, String[] strArr) {
        this.f66543.dump(EnumC2483.f3919, null, printWriter, strArr);
    }

    @Override // p067l.AbstractC7093
    /* JADX INFO: renamed from: ۜ */
    public final LayoutInflater mo16334() {
        ActivityC3069 activityC3069 = this.f66543;
        return activityC3069.getLayoutInflater().cloneInContext(activityC3069);
    }

    @Override // p067l.AbstractC7093
    /* JADX INFO: renamed from: ܳ */
    public final ActivityC3069 mo16336() {
        return this.f66543;
    }

    @Override // p067l.AbstractC7093
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16335(String str) {
        return C1786.m46160((Activity) this.f66543, str);
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ֫ */
    public final View mo9201(int i) {
        return this.f66543.findViewById(i);
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9202() {
        Window window = this.f66543.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p067l.InterfaceC0870
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1815 mo4693() {
        return this.f66543.mo4693();
    }

    @Override // p067l.InterfaceC23548
    public final C16841 getSavedStateRegistry() {
        return this.f66543.getSavedStateRegistry();
    }

    @Override // p067l.InterfaceC0991
    /* JADX INFO: renamed from: ֫ */
    public final void mo11194(InterfaceC1489 interfaceC1489) {
        this.f66543.mo11194(interfaceC1489);
    }

    @Override // p067l.InterfaceC0991
    /* JADX INFO: renamed from: ۜ */
    public final void mo11195(InterfaceC1489 interfaceC1489) {
        this.f66543.mo11195(interfaceC1489);
    }

    @Override // p067l.InterfaceC1481
    /* JADX INFO: renamed from: ܿ */
    public final void mo33394(InterfaceC1489 interfaceC1489) {
        this.f66543.mo33394(interfaceC1489);
    }

    @Override // p067l.InterfaceC1481
    /* JADX INFO: renamed from: ܽ */
    public final void mo33393(InterfaceC1489 interfaceC1489) {
        this.f66543.mo33393(interfaceC1489);
    }

    @Override // p067l.InterfaceC1363
    /* JADX INFO: renamed from: ᩻ */
    public final void mo28448(InterfaceC1489 interfaceC1489) {
        this.f66543.mo28448(interfaceC1489);
    }

    @Override // p067l.InterfaceC1363
    /* JADX INFO: renamed from: ܳ */
    public final void mo28447(InterfaceC1489 interfaceC1489) {
        this.f66543.mo28447(interfaceC1489);
    }

    @Override // p067l.InterfaceC1153
    /* JADX INFO: renamed from: ᩳ */
    public final void mo19226(InterfaceC1489 interfaceC1489) {
        this.f66543.mo19226(interfaceC1489);
    }

    @Override // p067l.InterfaceC1153
    /* JADX INFO: renamed from: ۧ */
    public final void mo19225(InterfaceC1489 interfaceC1489) {
        this.f66543.mo19225(interfaceC1489);
    }

    @Override // p067l.InterfaceC1833
    public final void addMenuProvider(InterfaceC1413 interfaceC1413) {
        this.f66543.addMenuProvider(interfaceC1413);
    }

    @Override // p067l.InterfaceC1833
    public final void removeMenuProvider(InterfaceC1413 interfaceC1413) {
        this.f66543.removeMenuProvider(interfaceC1413);
    }

    @Override // p067l.AbstractC7093
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16340() {
        this.f66543.invalidateOptionsMenu();
    }
}
