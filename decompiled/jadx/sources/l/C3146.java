package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: PAOD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3146 implements InterfaceC1118 {
    @Override // l.InterfaceC1118
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(InterfaceC22285 interfaceC22285) {
        if (!(interfaceC22285 instanceof InterfaceC13207)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        C3330 viewModelStore = ((InterfaceC13207) interfaceC22285).getViewModelStore();
        C15228 savedStateRegistry = interfaceC22285.getSavedStateRegistry();
        Iterator it = viewModelStore.m10191().iterator();
        while (it.hasNext()) {
            AbstractC5447 abstractC5447M10188 = viewModelStore.m10188((String) it.next());
            C11233.m27799(abstractC5447M10188);
            C12318.m29875(abstractC5447M10188, savedStateRegistry, interfaceC22285.getLifecycle());
        }
        if (viewModelStore.m10191().isEmpty()) {
            return;
        }
        savedStateRegistry.m36041();
    }
}
