package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes3.dex */
public class C13228 {
    /* JADX INFO: renamed from: ֫ */
    public ProviderInfo mo30723(ResolveInfo resolveInfo) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo30724(PackageManager packageManager, Intent intent) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Signature[] mo26254(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
