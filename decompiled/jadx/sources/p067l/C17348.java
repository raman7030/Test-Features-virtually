package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܺۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17348 extends AbstractC1920 {
    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Intent mo5143(Context context, Object obj) {
        Bundle bundleExtra;
        C1255 c1255M17555 = (C1255) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intentM23901 = c1255M17555.m23901();
        if (intentM23901 != null && (bundleExtra = intentM23901.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intentM23901.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intentM23901.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C1115 c1115 = new C1115(c1255M17555.m23904());
                c1115.m17557(null);
                c1115.m17556(c1255M17555.m23903(), c1255M17555.m23902());
                c1255M17555 = c1115.m17555();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1255M17555);
        if (AbstractC7291.m16763(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5144(Intent intent, int i) {
        return new C1185(intent, i);
    }
}
