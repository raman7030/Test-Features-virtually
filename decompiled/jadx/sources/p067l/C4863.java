package p067l;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.ۖܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4863 extends C21627 implements InterfaceC16931 {

    /* JADX INFO: renamed from: ֫ */
    public Application f11051;

    /* JADX INFO: renamed from: ۧ */
    public Bundle f11052;

    /* JADX INFO: renamed from: ܽ */
    public final C10227 f11053;

    /* JADX INFO: renamed from: ܿ */
    public C16841 f11054;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC9381 f11055;

    public C4863(Application application, InterfaceC23548 interfaceC23548, Bundle bundle) {
        C10227 c10227;
        this.f11054 = interfaceC23548.getSavedStateRegistry();
        this.f11055 = interfaceC23548.getLifecycle();
        this.f11052 = bundle;
        this.f11051 = application;
        if (application == null) {
            c10227 = new C10227();
        } else {
            if (C10227.f28339 == null) {
                C10227.f28339 = new C10227(application);
            }
            c10227 = C10227.f28339;
            C13045.m29861(c10227);
        }
        this.f11053 = c10227;
    }

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7442(Class cls, C17901 c17901) {
        int i = C23638.f75252;
        String str = (String) c17901.m22254().get(C22968.f72232);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c17901.m22254().get(C22298.f70433) == null || c17901.m22254().get(C22298.f70434) == null) {
            if (this.f11055 != null) {
                return m10300(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        InterfaceC15590 interfaceC15590 = C10227.f28340;
        Application application = (Application) c17901.m22254().get(C3521.f7133);
        boolean zIsAssignableFrom = C20111.class.isAssignableFrom(cls);
        Constructor constructorM14051 = (!zIsAssignableFrom || application == null) ? C6204.m14051(cls, C6204.f15620) : C6204.m14051(cls, C6204.f15619);
        if (constructorM14051 == null) {
            return this.f11053.mo7442(cls, c17901);
        }
        return (!zIsAssignableFrom || application == null) ? C6204.m14053(cls, constructorM14051, C22298.m50116(c17901)) : C6204.m14053(cls, constructorM14051, application, C22298.m50116(c17901));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 m10300(Class cls, String str) {
        AbstractC9381 abstractC9381 = this.f11055;
        if (abstractC9381 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C20111.class.isAssignableFrom(cls);
        Application application = this.f11051;
        Constructor constructorM14051 = (!zIsAssignableFrom || application == null) ? C6204.m14051(cls, C6204.f15620) : C6204.m14051(cls, C6204.f15619);
        if (constructorM14051 != null) {
            C16841 c16841 = this.f11054;
            C13045.m29861(c16841);
            C19615 c19615M31934 = C14075.m31934(c16841, abstractC9381, str, this.f11052);
            AbstractC7545 abstractC7545M14053 = (!zIsAssignableFrom || application == null) ? C6204.m14053(cls, constructorM14051, c19615M31934.m44515()) : C6204.m14053(cls, constructorM14051, application, c19615M31934.m44515());
            abstractC7545M14053.m17456(c19615M31934);
            return abstractC7545M14053;
        }
        if (application != null) {
            return this.f11053.mo7441(cls);
        }
        if (C23638.f75253 == null) {
            C23638.f75253 = new C23638();
        }
        C23638 c23638 = C23638.f75253;
        C13045.m29861(c23638);
        return c23638.mo7441(cls);
    }

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7441(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m10300(cls, canonicalName);
    }

    @Override // p067l.C21627
    /* JADX INFO: renamed from: ֫ */
    public final void mo10301(AbstractC7545 abstractC7545) {
        AbstractC9381 abstractC9381 = this.f11055;
        if (abstractC9381 != null) {
            C16841 c16841 = this.f11054;
            C13045.m29861(c16841);
            C14075.m31935(abstractC7545, c16841, abstractC9381);
        }
    }
}
