package l;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8975 implements InterfaceC8174 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f27260;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f27261;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15228 f27262;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17230 f27263;

    public C8975(C15228 c15228, InterfaceC13207 interfaceC13207) {
        C11233.m27805(c15228, "savedStateRegistry");
        this.f27262 = c15228;
        this.f27263 = C14407.m34431(new C9681(interfaceC13207));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final C16029 m23184() {
        return (C16029) this.f27263.getValue();
    }

    @Override // l.InterfaceC8174
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo1940() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f27261;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m23184().m37895().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo1940 = ((C11092) entry.getValue()).m27521().mo1940();
            if (!C11233.m27802(bundleMo1940, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo1940);
            }
        }
        this.f27260 = false;
        return bundle;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23186() {
        if (this.f27260) {
            return;
        }
        Bundle bundleM36036 = this.f27262.m36036("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f27261;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM36036 != null) {
            bundle.putAll(bundleM36036);
        }
        this.f27261 = bundle;
        this.f27260 = true;
        m23184();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m23185(String str) {
        m23186();
        Bundle bundle = this.f27261;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f27261;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f27261;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f27261 = null;
        }
        return bundle2;
    }
}
