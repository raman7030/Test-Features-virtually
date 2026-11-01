package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܰۙ */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1516 {

    /* JADX INFO: renamed from: ֫ */
    public final C1201 f43596;

    public C1516(Context context, String str) {
        C1201 c1201 = new C1201();
        this.f43596 = c1201;
        c1201.f25031 = context;
        c1201.f25035 = str;
    }

    public C1516(C1201 c1201) {
        C1201 c1202 = new C1201();
        this.f43596 = c1202;
        c1202.f25031 = c1201.f25031;
        c1202.f25035 = c1201.f25035;
        Intent[] intentArr = c1201.f25025;
        c1202.f25025 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        c1202.f25023 = c1201.f25023;
        c1202.f25034 = c1201.f25034;
        c1202.f25026 = c1201.f25026;
        c1202.f25033 = c1201.f25033;
        c1202.f25029 = c1201.f25029;
        c1202.f25027 = c1201.f25027;
        c1202.f25024 = c1201.f25024;
        C1538[] c1538Arr = c1201.f25030;
        if (c1538Arr != null) {
            c1202.f25030 = (C1538[]) Arrays.copyOf(c1538Arr, c1538Arr.length);
        }
        if (c1201.f25028 != null) {
            c1202.f25028 = new HashSet(c1201.f25028);
        }
        PersistableBundle persistableBundle = c1201.f25032;
        if (persistableBundle != null) {
            c1202.f25032 = persistableBundle;
        }
    }

    public C1516(Context context, ShortcutInfo shortcutInfo) {
        C1538[] c1538Arr;
        String string;
        C1201 c1201 = new C1201();
        this.f43596 = c1201;
        c1201.f25031 = context;
        c1201.f25035 = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c1201.f25025 = (Intent[]) Arrays.copyOf(intents, intents.length);
        c1201.f25023 = shortcutInfo.getActivity();
        c1201.f25034 = shortcutInfo.getShortLabel();
        c1201.f25026 = shortcutInfo.getLongLabel();
        c1201.f25033 = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c1201.f25028 = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C1061 c1061 = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c1538Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c1538Arr = new C1538[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                c1538Arr[i2] = C1538.m35768(extras.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
        }
        c1201.f25030 = c1538Arr;
        C1201 c1202 = this.f43596;
        shortcutInfo.getUserHandle();
        c1202.getClass();
        C1201 c1203 = this.f43596;
        shortcutInfo.getLastChangedTimestamp();
        c1203.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C1201 c1204 = this.f43596;
            shortcutInfo.isCached();
            c1204.getClass();
        }
        C1201 c1205 = this.f43596;
        shortcutInfo.isDynamic();
        c1205.getClass();
        C1201 c1206 = this.f43596;
        shortcutInfo.isPinned();
        c1206.getClass();
        C1201 c1207 = this.f43596;
        shortcutInfo.isDeclaredInManifest();
        c1207.getClass();
        C1201 c1208 = this.f43596;
        shortcutInfo.isImmutable();
        c1208.getClass();
        C1201 c1209 = this.f43596;
        shortcutInfo.isEnabled();
        c1209.getClass();
        C1201 c12010 = this.f43596;
        shortcutInfo.hasKeyFieldsOnly();
        c12010.getClass();
        C1201 c12011 = this.f43596;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                c1061 = C1061.m14999(shortcutInfo.getLocusId());
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c1061 = new C1061(string);
            }
        }
        c12011.f25027 = c1061;
        this.f43596.f25024 = shortcutInfo.getRank();
        this.f43596.f25032 = shortcutInfo.getExtras();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34773(CharSequence charSequence) {
        this.f43596.f25034 = charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34772(Intent intent) {
        this.f43596.f25025 = new Intent[]{intent};
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34774(C1073 c1073) {
        this.f43596.f25029 = c1073;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1201 m34771() {
        C1201 c1201 = this.f43596;
        if (TextUtils.isEmpty(c1201.f25034)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = c1201.f25025;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return c1201;
    }
}
