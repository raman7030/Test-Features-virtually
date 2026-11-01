package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: PAOD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5358 implements InterfaceC3431 {
    @Override // p067l.InterfaceC3431
    /* JADX INFO: renamed from: ֫ */
    public final void mo6091(InterfaceC23548 interfaceC23548) {
        if (!(interfaceC23548 instanceof InterfaceC14920)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        C5533 viewModelStore = ((InterfaceC14920) interfaceC23548).getViewModelStore();
        C16841 savedStateRegistry = interfaceC23548.getSavedStateRegistry();
        Iterator it = viewModelStore.m12227().iterator();
        while (it.hasNext()) {
            AbstractC7545 abstractC7545M12224 = viewModelStore.m12224((String) it.next());
            C13045.m29861(abstractC7545M12224);
            C14075.m31935(abstractC7545M12224, savedStateRegistry, interfaceC23548.getLifecycle());
        }
        if (viewModelStore.m12227().isEmpty()) {
            return;
        }
        savedStateRegistry.m38202();
    }
}
