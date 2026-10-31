package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.᩸֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f68577 = IPackageManager.Stub.asInterface(Dhizuku.binderWrapper(C14294.m34080("package")));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m48263() {
        return IPackageInstaller.Stub.asInterface(Dhizuku.binderWrapper(f68577.getPackageInstaller().asBinder()));
    }
}
