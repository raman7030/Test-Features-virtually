package p067l;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7455 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23548 f19520;

    public C7455(InterfaceC23548 interfaceC23548) {
        this.f19520 = interfaceC23548;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 != EnumC24133.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC24784.getLifecycle().mo21807(this);
        InterfaceC23548 interfaceC23548 = this.f19520;
        Bundle bundleM38197 = interfaceC23548.getSavedStateRegistry().m38197("androidx.savedstate.Restarter");
        if (bundleM38197 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM38197.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C7455.class.getClassLoader()).asSubclass(InterfaceC3431.class);
                C13045.m29865(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        C13045.m29865(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((InterfaceC3431) objNewInstance).mo6091(interfaceC23548);
                    } catch (Exception e) {
                        throw new RuntimeException(C21466.m48631("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C6988.m16053("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
