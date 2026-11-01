package p067l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.᩸֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C22569 {

    /* JADX INFO: renamed from: ֫ */
    public static final IPackageManager f71259 = IPackageManager.Stub.asInterface(Dhizuku.binderWrapper(C15953.m36213("package")));

    /* JADX INFO: renamed from: ֫ */
    public static IPackageInstaller m50594() {
        return IPackageInstaller.Stub.asInterface(Dhizuku.binderWrapper(f71259.getPackageInstaller().asBinder()));
    }
}
