package p067l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public class C14940 {
    /* JADX INFO: renamed from: ֫ */
    public ProviderInfo mo32795(ResolveInfo resolveInfo) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo32796(PackageManager packageManager, Intent intent) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Signature[] mo28283(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
