package l;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5352 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22285 f16681;

    public C5352(InterfaceC22285 interfaceC22285) {
        this.f16681 = interfaceC22285;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 != EnumC22901.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC23586.getLifecycle().mo19834(this);
        InterfaceC22285 interfaceC22285 = this.f16681;
        Bundle bundleM36036 = interfaceC22285.getSavedStateRegistry().m36036("androidx.savedstate.Restarter");
        if (bundleM36036 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM36036.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C5352.class.getClassLoader()).asSubclass(InterfaceC1118.class);
                C11233.m27803(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        C11233.m27803(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((InterfaceC1118) objNewInstance).mo3834(interfaceC22285);
                    } catch (Exception e) {
                        throw new RuntimeException(C20094.m46315("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C4860.m14172("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
