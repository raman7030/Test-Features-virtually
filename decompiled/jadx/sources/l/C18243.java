package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import bin.mt.plus.R;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18243 implements InterfaceC16831 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ComponentName f56694 = new ComponentName("com.xiaomi.aiasst.vision", "com.xiaomi.aiasst.vision.control.translation.AiTranslateService");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PackageInfo f56695;

    public C18243(PackageManager packageManager) {
        this.f56695 = packageManager.getPackageInfo(f56694.getPackageName(), 0);
    }

    @Override // l.InterfaceC16831
    /* JADX INFO: renamed from: ֫ */
    public final String mo39605(PackageManager packageManager) {
        try {
            return String.valueOf(this.f56695.applicationInfo.loadLabel(packageManager));
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // l.InterfaceC16831
    /* JADX INFO: renamed from: ֫ */
    public final String mo39604() {
        return f56694.flattenToShortString();
    }

    @Override // l.InterfaceC16831
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo39606(C12392 c12392) {
        try {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            c12392.getLocationOnScreen(iArr);
            c12392.getFocusedRect(rect);
            rect.offset(iArr[0], iArr[1]);
            Intent intent = new Intent();
            intent.setComponent(f56694);
            Bundle bundle = new Bundle();
            bundle.putString("from", "system_edit_box");
            bundle.putString(TextBundle.TEXT_ENTRY, c12392.m30378());
            bundle.putString("floatingWindowType", "startDictionaryTranslationWindow");
            bundle.putInt("rawX", rect.left);
            bundle.putInt("rawY", rect.top);
            intent.putExtras(bundle);
            c12392.getContext().startService(intent);
            return true;
        } catch (Throwable th) {
            if (th.getCause() instanceof TransactionTooLargeException) {
                C21374.m48457(R.string.MT_Protector);
                return true;
            }
            Activity activityM15313 = C5350.m15313(c12392.getContext());
            if (!(activityM15313 instanceof AbstractActivityC3346)) {
                C21374.m48459((CharSequence) th.toString());
            } else {
                ((AbstractActivityC3346) activityM15313).m10223(th, (DialogInterface.OnDismissListener) null);
            }
            return false;
        }
    }
}
