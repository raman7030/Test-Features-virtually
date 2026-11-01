package p067l;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10898 implements InterfaceC10137 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f30195;

    /* JADX INFO: renamed from: ۧ */
    public Bundle f30196;

    /* JADX INFO: renamed from: ܽ */
    public final C16841 f30197;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18744 f30198;

    public C10898(C16841 c16841, InterfaceC14920 interfaceC14920) {
        C13045.m29867(c16841, "savedStateRegistry");
        this.f30197 = c16841;
        this.f30198 = C16061.m36565(new C11569(interfaceC14920));
    }

    /* JADX INFO: renamed from: ܽ */
    private final C17602 m25128() {
        return (C17602) this.f30198.getValue();
    }

    @Override // p067l.InterfaceC10137
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo4332() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f30196;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m25128().m40082().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo4332 = ((C12910) entry.getValue()).m29583().mo4332();
            if (!C13045.m29864(bundleMo4332, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo4332);
            }
        }
        this.f30195 = false;
        return bundle;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25130() {
        if (this.f30195) {
            return;
        }
        Bundle bundleM38197 = this.f30197.m38197("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f30196;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM38197 != null) {
            bundle.putAll(bundleM38197);
        }
        this.f30196 = bundle;
        this.f30195 = true;
        m25128();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m25129(String str) {
        m25130();
        Bundle bundle = this.f30196;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f30196;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f30196;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f30196 = null;
        }
        return bundle2;
    }
}
