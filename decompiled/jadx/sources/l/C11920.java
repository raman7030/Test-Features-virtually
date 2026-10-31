package l;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ۨ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11920 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14035 m29083(PersistableBundle persistableBundle) {
        String string = persistableBundle.getString("name");
        String string2 = persistableBundle.getString("uri");
        String string3 = persistableBundle.getString("key");
        boolean z = persistableBundle.getBoolean("isBot");
        boolean z2 = persistableBundle.getBoolean("isImportant");
        C14035 c14035 = new C14035();
        c14035.f42434 = string;
        c14035.f42430 = null;
        c14035.f42432 = string2;
        c14035.f42435 = string3;
        c14035.f42431 = z;
        c14035.f42433 = z2;
        return c14035;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PersistableBundle m29082(C14035 c14035) {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = c14035.f42434;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", c14035.f42432);
        persistableBundle.putString("key", c14035.f42435);
        persistableBundle.putBoolean("isBot", c14035.f42431);
        persistableBundle.putBoolean("isImportant", c14035.f42433);
        return persistableBundle;
    }
}
