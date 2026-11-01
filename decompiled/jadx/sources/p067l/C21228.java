package p067l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;

/* JADX INFO: renamed from: l.᩶֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21228 {

    /* JADX INFO: renamed from: ֫ */
    public static final IPackageManager f66744 = IPackageManager.Stub.asInterface(new C15715(C15953.m36213("package")));

    /* JADX INFO: renamed from: ۧ */
    public static IPackageInstaller m47965() {
        return IPackageInstaller.Stub.asInterface(new C15715(f66744.getPackageInstaller().asBinder()));
    }
}
