package l;

import android.os.Bundle;
import com.umeng.analytics.pro.d;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q22N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15228 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f46736;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bundle f46738;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C0412 f46740;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f46741;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11194 f46737 = new C11194();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46739 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36041() {
        if (!this.f46739) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0412 c0412 = this.f46740;
        if (c0412 == null) {
            c0412 = new C0412(this);
        }
        this.f46740 = c0412;
        try {
            C3146.class.getDeclaredConstructor(null);
            C0412 c0413 = this.f46740;
            if (c0413 != null) {
                c0413.m1941(C3146.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C3146.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36039(String str, InterfaceC8174 interfaceC8174) {
        C11233.m27805(interfaceC8174, d.M);
        if (((InterfaceC8174) this.f46737.mo26347(str, interfaceC8174)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36042(Bundle bundle) {
        C11233.m27805(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f46738;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C13993 c13993M27764 = this.f46737.m27764();
        while (c13993M27764.hasNext()) {
            Map.Entry entry = (Map.Entry) c13993M27764.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC8174) entry.getValue()).mo1940());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m36036(String str) {
        if (!this.f46741) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f46738;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f46738;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f46738;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f46738 = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8174 m36037() {
        for (Map.Entry entry : this.f46737) {
            C11233.m27803(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC8174 interfaceC8174 = (InterfaceC8174) entry.getValue();
            if (C11233.m27802((Object) str, (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return interfaceC8174;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36040(AbstractC7379 abstractC7379) {
        if (this.f46736) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC7379.mo19833(new C10005(1, this));
        this.f46736 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36035(C15228 c15228, InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_START) {
            c15228.f46739 = true;
        } else if (enumC22901 == EnumC22901.ON_STOP) {
            c15228.f46739 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36038(Bundle bundle) {
        if (!this.f46736) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f46741) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f46738 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f46741 = true;
    }
}
