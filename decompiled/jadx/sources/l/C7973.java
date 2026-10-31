package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7973 implements InterfaceC7267 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f24628;

    @Override // l.InterfaceC7267
    /* JADX INFO: renamed from: ֫ */
    public final PackageInstaller.Session mo19504(PackageInstaller.SessionParams sessionParams) throws C1637 {
        IPackageInstaller iPackageInstallerM45654 = C19844.m45654();
        boolean z = C23216.m51526() == 0;
        C10671 c10671 = this.f24628;
        String packageName = z ? c10671.f32087.getPackageName() : "com.android.shell";
        int iHashCode = z ? Process.myUserHandle().hashCode() : 0;
        String str = c10671.f32090;
        if (str.isEmpty() || C19844.f64107.isPackageAvailable(str, iHashCode)) {
            return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(new C14043(iPackageInstallerM45654.openSession(C4321.m12975(iPackageInstallerM45654, C4321.m12976(sessionParams, packageName, c10671.f32090), Build.VERSION.SDK_INT >= 31 ? c10671.f32087.getAttributionTag() : null, iHashCode).createSession(sessionParams)).asBinder())));
        }
        throw new C1637(C4925.m14306(R.string.MT_Protector, str));
    }

    public C7973(C10671 c10671) {
        this.f24628 = c10671;
    }

    @Override // l.InterfaceC7267
    /* JADX INFO: renamed from: ֫ */
    public final void mo19505() {
        this.f24628.m26778(EnumC5856.SHIZUKU);
    }
}
