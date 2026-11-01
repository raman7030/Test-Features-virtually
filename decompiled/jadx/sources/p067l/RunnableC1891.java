package p067l;

import android.app.Activity;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.᩷᩹ */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1891 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f70891;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Activity f70892;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String[] f70893;

    public RunnableC1891(Activity activity, String[] strArr, int i) {
        this.f70893 = strArr;
        this.f70892 = activity;
        this.f70891 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.f70893;
        int[] iArr = new int[strArr.length];
        Activity activity = this.f70892;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((InterfaceC0981) activity).onRequestPermissionsResult(this.f70891, strArr, iArr);
    }
}
