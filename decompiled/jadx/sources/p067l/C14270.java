package p067l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes4.dex */
public class C14270 extends C14940 {
    @Override // p067l.C14940
    /* JADX INFO: renamed from: ֫ */
    public final List mo32796(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }

    @Override // p067l.C14940
    /* JADX INFO: renamed from: ֫ */
    public final ProviderInfo mo32795(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }
}
