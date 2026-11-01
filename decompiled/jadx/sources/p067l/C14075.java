package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۫ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: PAOD */
/* JADX INFO: loaded from: classes3.dex */
public final class C14075 {
    /* JADX INFO: renamed from: ֫ */
    public static final C19615 m31934(C16841 c16841, AbstractC9381 abstractC9381, String str, Bundle bundle) {
        C13045.m29867(c16841, "registry");
        C13045.m29867(abstractC9381, "lifecycle");
        Bundle bundleM38197 = c16841.m38197(str);
        int i = C12910.f36286;
        C19615 c19615 = new C19615(str, C4192.m8507(bundleM38197, bundle));
        c19615.m44516(abstractC9381, c16841);
        m31936(abstractC9381, c16841);
        return c19615;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m31935(AbstractC7545 abstractC7545, C16841 c16841, AbstractC9381 abstractC9381) {
        C13045.m29867(c16841, "registry");
        C13045.m29867(abstractC9381, "lifecycle");
        C19615 c19615 = (C19615) abstractC7545.m17457();
        if (c19615 == null || c19615.m44517()) {
            return;
        }
        c19615.m44516(abstractC9381, c16841);
        m31936(abstractC9381, c16841);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31936(AbstractC9381 abstractC9381, C16841 c16841) {
        EnumC15415 enumC15415Mo21805 = abstractC9381.mo21805();
        if (enumC15415Mo21805 == EnumC15415.INITIALIZED || enumC15415Mo21805.m35142(EnumC15415.STARTED)) {
            c16841.m38202();
        } else {
            abstractC9381.mo21806(new C14745(abstractC9381, c16841));
        }
    }
}
