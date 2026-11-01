package p067l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.TransactionTooLargeException;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19036 implements InterfaceC18365 {

    /* JADX INFO: renamed from: ֫ */
    public final ComponentName f56751;

    /* JADX INFO: renamed from: ۧ */
    public final ResolveInfo f56752;

    public C19036(ResolveInfo resolveInfo) {
        this.f56752 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f56751 = new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final String mo41841(PackageManager packageManager) {
        ResolveInfo resolveInfo = this.f56752;
        try {
            String strValueOf = String.valueOf(resolveInfo.loadLabel(packageManager));
            String strValueOf2 = String.valueOf(resolveInfo.activityInfo.applicationInfo.loadLabel(packageManager));
            if (strValueOf.contains(strValueOf2)) {
                return strValueOf;
            }
            return strValueOf2 + " - " + strValueOf;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final String mo41840() {
        return this.f56751.flattenToShortString();
    }

    @Override // p067l.InterfaceC18365
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo41842(C14146 c14146) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
        intent.setComponent(this.f56751);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", c14146.m32442());
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
        try {
            c14146.getContext().startActivity(intent);
            return true;
        } catch (Exception e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                return false;
            }
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
    }
}
