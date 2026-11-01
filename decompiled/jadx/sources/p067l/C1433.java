package p067l;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ۨ᩶ */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433 {
    /* JADX INFO: renamed from: ֫ */
    public static C1538 m31135(PersistableBundle persistableBundle) {
        String string = persistableBundle.getString("name");
        String string2 = persistableBundle.getString("uri");
        String string3 = persistableBundle.getString("key");
        boolean z = persistableBundle.getBoolean("isBot");
        boolean z2 = persistableBundle.getBoolean("isImportant");
        C1538 c1538 = new C1538();
        c1538.f45517 = string;
        c1538.f45513 = null;
        c1538.f45515 = string2;
        c1538.f45518 = string3;
        c1538.f45514 = z;
        c1538.f45516 = z2;
        return c1538;
    }

    /* JADX INFO: renamed from: ֫ */
    public static PersistableBundle m31134(C1538 c1538) {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = c1538.f45517;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", c1538.f45515);
        persistableBundle.putString("key", c1538.f45518);
        persistableBundle.putBoolean("isBot", c1538.f45514);
        persistableBundle.putBoolean("isImportant", c1538.f45516);
        return persistableBundle;
    }
}
