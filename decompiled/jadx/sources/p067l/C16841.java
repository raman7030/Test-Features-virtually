package p067l;

import android.os.Bundle;
import com.umeng.analytics.pro.C0708d;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q22N */
/* JADX INFO: loaded from: classes4.dex */
public final class C16841 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f49860;

    /* JADX INFO: renamed from: ܳ */
    public Bundle f49862;

    /* JADX INFO: renamed from: ܿ */
    public C2760 f49864;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f49865;

    /* JADX INFO: renamed from: ۧ */
    public final C1397 f49861 = new C1397();

    /* JADX INFO: renamed from: ܽ */
    public boolean f49863 = true;

    /* JADX INFO: renamed from: ۧ */
    public final void m38202() {
        if (!this.f49863) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2760 c2760 = this.f49864;
        if (c2760 == null) {
            c2760 = new C2760(this);
        }
        this.f49864 = c2760;
        try {
            C5358.class.getDeclaredConstructor(null);
            C2760 c2761 = this.f49864;
            if (c2761 != null) {
                c2761.m4333(C5358.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C5358.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38200(String str, InterfaceC10137 interfaceC10137) {
        C13045.m29867(interfaceC10137, C0708d.f2597M);
        if (((InterfaceC10137) this.f49861.mo28379(str, interfaceC10137)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38203(Bundle bundle) {
        C13045.m29867(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f49862;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1536 c1536M29826 = this.f49861.m29826();
        while (c1536M29826.hasNext()) {
            Map.Entry entry = (Map.Entry) c1536M29826.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC10137) entry.getValue()).mo4332());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m38197(String str) {
        if (!this.f49865) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f49862;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f49862;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f49862;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f49862 = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10137 m38198() {
        for (Map.Entry entry : this.f49861) {
            C13045.m29865(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC10137 interfaceC10137 = (InterfaceC10137) entry.getValue();
            if (C13045.m29864((Object) str, (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return interfaceC10137;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38201(AbstractC9381 abstractC9381) {
        if (this.f49860) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC9381.mo21806(new C11877(1, this));
        this.f49860 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38196(C16841 c16841, InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_START) {
            c16841.f49863 = true;
        } else if (enumC24133 == EnumC24133.ON_STOP) {
            c16841.f49863 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38199(Bundle bundle) {
        if (!this.f49860) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f49865) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f49862 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f49865 = true;
    }
}
