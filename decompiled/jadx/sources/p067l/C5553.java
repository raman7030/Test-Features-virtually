package p067l;

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
public final class C5553 {

    /* JADX INFO: renamed from: ֫ */
    public final C14940 f13419;

    public C5553() {
        this.f13419 = Build.VERSION.SDK_INT >= 28 ? new C12259() : new C14270();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14980 m12287(Context context) {
        ProviderInfo providerInfoMo32795;
        C1422 c1422;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        C1524.m35169(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        C14940 c14940 = this.f13419;
        Iterator it = c14940.mo32796(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoMo32795 = null;
                break;
            }
            providerInfoMo32795 = c14940.mo32795((ResolveInfo) it.next());
            if (providerInfoMo32795 != null && (applicationInfo = providerInfoMo32795.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoMo32795 == null) {
            c1422 = null;
        } else {
            try {
                String str = providerInfoMo32795.authority;
                String str2 = providerInfoMo32795.packageName;
                Signature[] signatureArrMo28283 = c14940.mo28283(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo28283) {
                    arrayList.add(signature.toByteArray());
                }
                c1422 = new C1422(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                c1422 = null;
            }
        }
        if (c1422 == null) {
            return null;
        }
        return new C14980(context, c1422);
    }
}
