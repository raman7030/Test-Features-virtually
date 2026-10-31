package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UB1K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3351 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13228 f10611;

    public C3351() {
        this.f10611 = Build.VERSION.SDK_INT >= 28 ? new C10407() : new C12523();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13270 m10251(Context context) {
        ProviderInfo providerInfoMo30723;
        C11692 c11692;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        C13746.m33055(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        C13228 c13228 = this.f10611;
        Iterator it = c13228.mo30724(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoMo30723 = null;
                break;
            }
            providerInfoMo30723 = c13228.mo30723((ResolveInfo) it.next());
            if (providerInfoMo30723 != null && (applicationInfo = providerInfoMo30723.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoMo30723 == null) {
            c11692 = null;
        } else {
            try {
                String str = providerInfoMo30723.authority;
                String str2 = providerInfoMo30723.packageName;
                Signature[] signatureArrMo26254 = c13228.mo26254(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo26254) {
                    arrayList.add(signature.toByteArray());
                }
                c11692 = new C11692(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                c11692 = null;
            }
        }
        if (c11692 == null) {
            return null;
        }
        return new C13270(context, c11692);
    }
}
