package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩷ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22298 {

    /* JADX INFO: renamed from: ۧ */
    public static final C16261 f70433 = new C16261();

    /* JADX INFO: renamed from: ܽ */
    public static final C24979 f70434 = new C24979();

    /* JADX INFO: renamed from: ֫ */
    public static final C18944 f70432 = new C18944();

    /* JADX INFO: renamed from: ֫ */
    public static final C17602 m50117(InterfaceC14920 interfaceC14920) {
        AbstractC9556 defaultViewModelCreationExtras;
        C12538 c12538 = new C12538();
        c12538.m28866(C9021.m20892(C17602.class), C8886.f24086);
        C3820 c3820M28865 = c12538.m28865();
        C5533 viewModelStore = interfaceC14920.getViewModelStore();
        if (interfaceC14920 instanceof InterfaceC6699) {
            defaultViewModelCreationExtras = ((InterfaceC6699) interfaceC14920).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C24308.f76980;
        }
        return (C17602) new C6874(viewModelStore, c3820M28865, defaultViewModelCreationExtras).m15766(C17602.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m50118(InterfaceC23548 interfaceC23548) {
        EnumC15415 enumC15415Mo21805 = interfaceC23548.getLifecycle().mo21805();
        if (enumC15415Mo21805 != EnumC15415.INITIALIZED && enumC15415Mo21805 != EnumC15415.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC23548.getSavedStateRegistry().m38198() == null) {
            C10898 c10898 = new C10898(interfaceC23548.getSavedStateRegistry(), (InterfaceC14920) interfaceC23548);
            interfaceC23548.getSavedStateRegistry().m38200("androidx.lifecycle.internal.SavedStateHandlesProvider", c10898);
            interfaceC23548.getLifecycle().mo21806(new C18273(c10898));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C12910 m50116(C17901 c17901) {
        InterfaceC23548 interfaceC23548 = (InterfaceC23548) c17901.m22254().get(f70433);
        if (interfaceC23548 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC14920 interfaceC14920 = (InterfaceC14920) c17901.m22254().get(f70434);
        if (interfaceC14920 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c17901.m22254().get(f70432);
        int i = C23638.f75252;
        String str = (String) c17901.m22254().get(C22968.f72232);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC10137 interfaceC10137M38198 = interfaceC23548.getSavedStateRegistry().m38198();
        C10898 c10898 = interfaceC10137M38198 instanceof C10898 ? (C10898) interfaceC10137M38198 : null;
        if (c10898 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C17602 c17602M50117 = m50117(interfaceC14920);
        C12910 c12910 = (C12910) c17602M50117.m40082().get(str);
        if (c12910 != null) {
            return c12910;
        }
        int i2 = C12910.f36286;
        C12910 c12910M8507 = C4192.m8507(c10898.m25129(str), bundle);
        c17602M50117.m40082().put(str, c12910M8507);
        return c12910M8507;
    }
}
