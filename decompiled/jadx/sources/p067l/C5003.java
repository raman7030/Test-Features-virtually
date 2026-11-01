package p067l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۖ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6218 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5003 implements InterfaceC6699, InterfaceC23548, InterfaceC14920 {

    /* JADX INFO: renamed from: ۗ */
    public final C5533 f11430;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC16931 f11433;

    /* JADX INFO: renamed from: ᩹ */
    public final ComponentCallbacksC11117 f11434;

    /* JADX INFO: renamed from: ᩶ */
    public C22103 f11432 = null;

    /* JADX INFO: renamed from: ۙ */
    public C22878 f11431 = null;

    public C5003(ComponentCallbacksC11117 componentCallbacksC11117, C5533 c5533) {
        this.f11434 = componentCallbacksC11117;
        this.f11430 = c5533;
    }

    @Override // p067l.InterfaceC14920
    public final C5533 getViewModelStore() {
        m10626();
        return this.f11430;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10626() {
        if (this.f11432 == null) {
            this.f11432 = new C22103(this);
            C22878 c22878 = new C22878(this);
            this.f11431 = c22878;
            c22878.m51095();
            C22298.m50118((InterfaceC23548) this);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m10631() {
        return this.f11432 != null;
    }

    @Override // p067l.InterfaceC24784
    public final AbstractC9381 getLifecycle() {
        m10626();
        return this.f11432;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10628(EnumC15415 enumC15415) {
        this.f11432.m49765(enumC15415);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10629(EnumC24133 enumC24133) {
        this.f11432.m49766(enumC24133);
    }

    @Override // p067l.InterfaceC6699
    public final InterfaceC16931 getDefaultViewModelProviderFactory() {
        Application application;
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f11434;
        InterfaceC16931 defaultViewModelProviderFactory = componentCallbacksC11117.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(componentCallbacksC11117.mDefaultFactory)) {
            this.f11433 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f11433 == null) {
            Context applicationContext = componentCallbacksC11117.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f11433 = new C4863(application, this, componentCallbacksC11117.getArguments());
        }
        return this.f11433;
    }

    @Override // p067l.InterfaceC6699
    public final AbstractC9556 getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f11434;
        Context applicationContext = componentCallbacksC11117.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C17901 c17901 = new C17901();
        if (application != null) {
            c17901.m22254().put(C10227.f28340, application);
        }
        c17901.m22254().put(C22298.f70433, this);
        c17901.m22254().put(C22298.f70434, this);
        if (componentCallbacksC11117.getArguments() != null) {
            c17901.m22254().put(C22298.f70432, componentCallbacksC11117.getArguments());
        }
        return c17901;
    }

    @Override // p067l.InterfaceC23548
    public final C16841 getSavedStateRegistry() {
        m10626();
        return this.f11431.m51093();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10627(Bundle bundle) {
        this.f11431.m51094(bundle);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10630(Bundle bundle) {
        this.f11431.m51096(bundle);
    }
}
