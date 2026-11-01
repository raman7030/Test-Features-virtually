package p067l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.ܰܽ */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1533 extends AbstractC18408 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C1533 f44686 = new C1533(1);

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        C13045.m29867(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
