package p067l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import com.rosan.dhizuku.api.Dhizuku;

/* JADX INFO: renamed from: l.᩸ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22687 implements InterfaceC9275 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12510 f71565;

    @Override // p067l.InterfaceC9275
    /* JADX INFO: renamed from: ֫ */
    public final PackageInstaller.Session mo21470(PackageInstaller.SessionParams sessionParams) {
        IPackageInstaller iPackageInstallerM50594 = C22569.m50594();
        this.f71565.m28812();
        return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(Dhizuku.binderWrapper(iPackageInstallerM50594.openSession(C6475.m14839(iPackageInstallerM50594, Dhizuku.getOwnerPackageName(), null, 0).createSession(sessionParams)).asBinder())));
    }

    public C22687(C12510 c12510) {
        this.f71565 = c12510;
    }

    @Override // p067l.InterfaceC9275
    /* JADX INFO: renamed from: ֫ */
    public final void mo21471() {
        this.f71565.m28817(EnumC7934.DHIZUKU);
    }
}
