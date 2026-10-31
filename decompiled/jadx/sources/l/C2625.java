package l;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.ۖܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2625 extends C20264 implements InterfaceC15323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Application f8256;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f8257;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8269 f8258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15228 f8259;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC7379 f8260;

    public C2625(Application application, InterfaceC22285 interfaceC22285, Bundle bundle) {
        C8269 c8269;
        this.f8259 = interfaceC22285.getSavedStateRegistry();
        this.f8260 = interfaceC22285.getLifecycle();
        this.f8257 = bundle;
        this.f8256 = application;
        if (application == null) {
            c8269 = new C8269();
        } else {
            if (C8269.f25429 == null) {
                C8269.f25429 = new C8269(application);
            }
            c8269 = C8269.f25429;
            C11233.m27799(c8269);
        }
        this.f8258 = c8269;
    }

    @Override // l.InterfaceC15323
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5447 mo5214(Class cls, C16344 c16344) {
        int i = C22380.f72526;
        String str = (String) c16344.m20277().get(C21675.f69527);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c16344.m20277().get(C20970.f67747) == null || c16344.m20277().get(C20970.f67748) == null) {
            if (this.f8260 != null) {
                return m8256(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        InterfaceC13912 interfaceC13912 = C8269.f25430;
        Application application = (Application) c16344.m20277().get(C1213.f4363);
        boolean zIsAssignableFrom = C18669.class.isAssignableFrom(cls);
        Constructor constructorM12130 = (!zIsAssignableFrom || application == null) ? C4036.m12130(cls, C4036.f12805) : C4036.m12130(cls, C4036.f12804);
        if (constructorM12130 == null) {
            return this.f8258.mo5214(cls, c16344);
        }
        return (!zIsAssignableFrom || application == null) ? C4036.m12132(cls, constructorM12130, C20970.m47786(c16344)) : C4036.m12132(cls, constructorM12130, application, C20970.m47786(c16344));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m8256(Class cls, String str) {
        AbstractC7379 abstractC7379 = this.f8260;
        if (abstractC7379 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C18669.class.isAssignableFrom(cls);
        Application application = this.f8256;
        Constructor constructorM12130 = (!zIsAssignableFrom || application == null) ? C4036.m12130(cls, C4036.f12805) : C4036.m12130(cls, C4036.f12804);
        if (constructorM12130 != null) {
            C15228 c15228 = this.f8259;
            C11233.m27799(c15228);
            C18147 c18147M29874 = C12318.m29874(c15228, abstractC7379, str, this.f8257);
            AbstractC5447 abstractC5447M12132 = (!zIsAssignableFrom || application == null) ? C4036.m12132(cls, constructorM12130, c18147M29874.m42254()) : C4036.m12132(cls, constructorM12130, application, c18147M29874.m42254());
            abstractC5447M12132.m15545(c18147M29874);
            return abstractC5447M12132;
        }
        if (application != null) {
            return this.f8258.mo5213(cls);
        }
        if (C22380.f72527 == null) {
            C22380.f72527 = new C22380();
        }
        C22380 c22380 = C22380.f72527;
        C11233.m27799(c22380);
        return c22380.mo5213(cls);
    }

    @Override // l.InterfaceC15323
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5447 mo5213(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m8256(cls, canonicalName);
    }

    @Override // l.C20264
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8257(AbstractC5447 abstractC5447) {
        AbstractC7379 abstractC7379 = this.f8260;
        if (abstractC7379 != null) {
            C15228 c15228 = this.f8259;
            C11233.m27799(c15228);
            C12318.m29875(abstractC5447, c15228, abstractC7379);
        }
    }
}
