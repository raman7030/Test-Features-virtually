package p067l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import bin.p000mt.plus.R;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19707 implements InterfaceC18365 {

    /* JADX INFO: renamed from: ۧ */
    public static final ComponentName f59912 = new ComponentName("com.xiaomi.aiasst.vision", "com.xiaomi.aiasst.vision.control.translation.AiTranslateService");

    /* JADX INFO: renamed from: ֫ */
    public final PackageInfo f59913;

    public C19707(PackageManager packageManager) {
        this.f59913 = packageManager.getPackageInfo(f59912.getPackageName(), 0);
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final String mo41841(PackageManager packageManager) {
        try {
            return String.valueOf(this.f59913.applicationInfo.loadLabel(packageManager));
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final String mo41840() {
        return f59912.flattenToShortString();
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo41842(C14146 c14146) {
        try {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            c14146.getLocationOnScreen(iArr);
            c14146.getFocusedRect(rect);
            rect.offset(iArr[0], iArr[1]);
            Intent intent = new Intent();
            intent.setComponent(f59912);
            Bundle bundle = new Bundle();
            bundle.putString("from", "system_edit_box");
            bundle.putString(TextBundle.TEXT_ENTRY, c14146.m32442());
            bundle.putString("floatingWindowType", "startDictionaryTranslationWindow");
            bundle.putInt("rawX", rect.left);
            bundle.putInt("rawY", rect.top);
            intent.putExtras(bundle);
            c14146.getContext().startService(intent);
            return true;
        } catch (Throwable th) {
            if (th.getCause() instanceof TransactionTooLargeException) {
                C22682.m50793(R.string.MT_Protector);
                return true;
            }
            Activity activityM17221 = C7453.m17221(c14146.getContext());
            if (!(activityM17221 instanceof AbstractActivityC5549)) {
                C22682.m50795((CharSequence) th.toString());
            } else {
                ((AbstractActivityC5549) activityM17221).m12259(th, (DialogInterface.OnDismissListener) null);
            }
            return false;
        }
    }
}
