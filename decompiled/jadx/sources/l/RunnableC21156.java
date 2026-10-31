package l;

import android.app.Activity;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21156 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f68209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f68210;

    public RunnableC21156(Activity activity, String[] strArr, int i) {
        this.f68210 = strArr;
        this.f68209 = activity;
        this.f68208 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.f68210;
        int[] iArr = new int[strArr.length];
        Activity activity = this.f68209;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((InterfaceC2811) activity).onRequestPermissionsResult(this.f68208, strArr, iArr);
    }
}
