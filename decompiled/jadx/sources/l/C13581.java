package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7232 f40519;

    public C13581(Context context, String str) {
        C7232 c7232 = new C7232();
        this.f40519 = c7232;
        c7232.f22148 = context;
        c7232.f22152 = str;
    }

    public C13581(C7232 c7232) {
        C7232 c7233 = new C7232();
        this.f40519 = c7233;
        c7233.f22148 = c7232.f22148;
        c7233.f22152 = c7232.f22152;
        Intent[] intentArr = c7232.f22142;
        c7233.f22142 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        c7233.f22140 = c7232.f22140;
        c7233.f22151 = c7232.f22151;
        c7233.f22143 = c7232.f22143;
        c7233.f22150 = c7232.f22150;
        c7233.f22146 = c7232.f22146;
        c7233.f22144 = c7232.f22144;
        c7233.f22141 = c7232.f22141;
        C14035[] c14035Arr = c7232.f22147;
        if (c14035Arr != null) {
            c7233.f22147 = (C14035[]) Arrays.copyOf(c14035Arr, c14035Arr.length);
        }
        if (c7232.f22145 != null) {
            c7233.f22145 = new HashSet(c7232.f22145);
        }
        PersistableBundle persistableBundle = c7232.f22149;
        if (persistableBundle != null) {
            c7233.f22149 = persistableBundle;
        }
    }

    public C13581(Context context, ShortcutInfo shortcutInfo) {
        C14035[] c14035Arr;
        String string;
        C7232 c7232 = new C7232();
        this.f40519 = c7232;
        c7232.f22148 = context;
        c7232.f22152 = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c7232.f22142 = (Intent[]) Arrays.copyOf(intents, intents.length);
        c7232.f22140 = shortcutInfo.getActivity();
        c7232.f22151 = shortcutInfo.getShortLabel();
        c7232.f22143 = shortcutInfo.getLongLabel();
        c7232.f22150 = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c7232.f22145 = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C4410 c4410 = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c14035Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c14035Arr = new C14035[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                c14035Arr[i2] = C14035.m33648(extras.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
        }
        c7232.f22147 = c14035Arr;
        C7232 c7233 = this.f40519;
        shortcutInfo.getUserHandle();
        c7233.getClass();
        C7232 c7234 = this.f40519;
        shortcutInfo.getLastChangedTimestamp();
        c7234.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C7232 c7235 = this.f40519;
            shortcutInfo.isCached();
            c7235.getClass();
        }
        C7232 c7236 = this.f40519;
        shortcutInfo.isDynamic();
        c7236.getClass();
        C7232 c7237 = this.f40519;
        shortcutInfo.isPinned();
        c7237.getClass();
        C7232 c7238 = this.f40519;
        shortcutInfo.isDeclaredInManifest();
        c7238.getClass();
        C7232 c7239 = this.f40519;
        shortcutInfo.isImmutable();
        c7239.getClass();
        C7232 c72310 = this.f40519;
        shortcutInfo.isEnabled();
        c72310.getClass();
        C7232 c72311 = this.f40519;
        shortcutInfo.hasKeyFieldsOnly();
        c72311.getClass();
        C7232 c72312 = this.f40519;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                c4410 = C4410.m13135(shortcutInfo.getLocusId());
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c4410 = new C4410(string);
            }
        }
        c72312.f22144 = c4410;
        this.f40519.f22141 = shortcutInfo.getRank();
        this.f40519.f22149 = shortcutInfo.getExtras();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32661(CharSequence charSequence) {
        this.f40519.f22151 = charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32660(Intent intent) {
        this.f40519.f22142 = new Intent[]{intent};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32662(C4656 c4656) {
        this.f40519.f22146 = c4656;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7232 m32659() {
        C7232 c7232 = this.f40519;
        if (TextUtils.isEmpty(c7232.f22151)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = c7232.f22142;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return c7232;
    }
}
