package p067l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Process;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9946 implements InterfaceC9275 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12510 f27541;

    @Override // p067l.InterfaceC9275
    /* JADX INFO: renamed from: ֫ */
    public final PackageInstaller.Session mo21470(PackageInstaller.SessionParams sessionParams) throws C3924 {
        IPackageInstaller iPackageInstallerM47965 = C21228.m47965();
        boolean z = C24433.m53923() == 0;
        C12510 c12510 = this.f27541;
        String packageName = z ? c12510.f35058.getPackageName() : "com.android.shell";
        int iHashCode = z ? Process.myUserHandle().hashCode() : 0;
        String str = c12510.f35061;
        if (str.isEmpty() || C21228.f66744.isPackageAvailable(str, iHashCode)) {
            return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(new C15715(iPackageInstallerM47965.openSession(C6475.m14839(iPackageInstallerM47965, C6475.m14840(sessionParams, packageName, c12510.f35061), Build.VERSION.SDK_INT >= 31 ? c12510.f35058.getAttributionTag() : null, iHashCode).createSession(sessionParams)).asBinder())));
        }
        throw new C3924(C7050.m16203(R.string.MT_Protector, str));
    }

    public C9946(C12510 c12510) {
        this.f27541 = c12510;
    }

    @Override // p067l.InterfaceC9275
    /* JADX INFO: renamed from: ֫ */
    public final void mo21471() {
        this.f27541.m28817(EnumC7934.SHIZUKU);
    }
}
