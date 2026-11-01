package p067l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.rosan.dhizuku.api.Dhizuku;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12510 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f35058;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f35059;

    /* JADX INFO: renamed from: ܳ */
    public final List f35060;

    /* JADX INFO: renamed from: ܽ */
    public final String f35061;

    /* JADX INFO: renamed from: ܿ */
    public final String f35062;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f35063;

    public C12510() {
        throw null;
    }

    public C12510(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, boolean z, String str, List list, String str2) {
        this.f35058 = abstractActivityC5549;
        this.f35059 = abstractC17043;
        this.f35063 = z;
        this.f35062 = str;
        this.f35060 = list;
        this.f35061 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12510)) {
            return false;
        }
        C12510 c12510 = (C12510) obj;
        return this.f35063 == c12510.f35063 && C12826.equals(this.f35058, c12510.f35058) && C12826.equals(this.f35059, c12510.f35059) && C12826.equals(this.f35062, c12510.f35062) && C12826.equals(this.f35060, c12510.f35060) && C12826.equals(this.f35061, c12510.f35061);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f35061) + ((C12826.hashCode(this.f35060) + C21720.m49003((C12826.hashCode(this.f35059) + ((C12826.hashCode(this.f35058) + ((this.f35063 ? 1231 : 1237) * 31)) * 31)) * 31, 31, this.f35062)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f35058, this.f35059, Boolean.valueOf(this.f35063), this.f35062, this.f35060, this.f35061};
        String[] strArrSplit = "activity;file;isApks;packageName;selectedApkNames;installerPackageName".length() == 0 ? new String[0] : "activity;file;isApks;packageName;selectedApkNames;installerPackageName".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C12510.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28812() {
        if (this.f35061.isEmpty()) {
            return;
        }
        C7050.m16212(new RunnableC7366(2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28814(Intent intent) {
        this.f35058.startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28815(Exception exc) {
        this.f35058.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28813(int i) {
        this.f35058.m12271(i);
    }

    public final String getFileName() {
        return this.f35059.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1.versionCode < 54100) goto L30;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28816(final EnumC7934 enumC7934) {
        if (!C12799.m29347()) {
            C7050.m16212(new Runnable() { // from class: l.֫֨ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8120.m28816(enumC7934);
                }
            });
            return;
        }
        String str = this.f35061;
        if (!str.isEmpty() && !C13161.m30149(str)) {
            m28813(R.string.MT_Protector);
            return;
        }
        while (true) {
            int i = C11958.f33340[enumC7934.ordinal()];
            int i2 = 1;
            AbstractC17043 abstractC17043 = this.f35059;
            if (i != 1) {
                if (i != 2) {
                    boolean z = this.f35063;
                    if (i != 3) {
                        if (i == 4) {
                            m28812();
                            System.out.println("Try install apk by System: " + abstractC17043.mo25505());
                            if (z) {
                                C7350 c7350 = C21898.f68876;
                                if (C5623.m12441() && ApplicationC21448.f67649.getBoolean("show_apks_miui_warning", true)) {
                                    try {
                                        PackageInfo packageInfo = C7050.m16217().getPackageInfo("com.miui.packageinstaller", 0);
                                        System.out.println("packageInfo.versionCode=" + packageInfo.versionCode);
                                    } catch (Exception unused) {
                                    }
                                }
                                if (this.f35058.m12267(this.f35059, this.f35060)) {
                                    new C11288(this).m22250();
                                    return;
                                }
                                return;
                            }
                            C7350 c7351 = C21898.f68876;
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.addFlags(268435456);
                            ComponentName componentNameM9638 = C4566.m9638(C7050.m16217());
                            if (componentNameM9638 != null) {
                                try {
                                    Uri uriM31098 = C13692.m31098(abstractC17043);
                                    intent.setDataAndType(uriM31098, "application/vnd.android.package-archive");
                                    C5065.m10798(intent, uriM31098);
                                    intent.setComponent(componentNameM9638);
                                    m28814(intent);
                                    return;
                                } catch (ActivityNotFoundException unused2) {
                                    intent.setComponent(null);
                                }
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String str2 = C13692.f38625;
                                if (!C7050.f18355.getBoolean("apk_installation_prevents_deletion", false) && abstractC17043.mo29980()) {
                                    try {
                                        intent.setDataAndType(abstractC17043.m38680(), "application/vnd.android.package-archive");
                                        m28814(intent);
                                        return;
                                    } catch (ActivityNotFoundException unused3) {
                                    }
                                }
                            }
                            try {
                                Uri uriM31099 = C13692.m31098(abstractC17043);
                                intent.setDataAndType(uriM31099, "application/vnd.android.package-archive");
                                C5065.m10798(intent, uriM31099);
                                m28814(intent);
                                return;
                            } catch (ActivityNotFoundException e) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    m28815(e);
                                    return;
                                } else {
                                    new C20676(this, intent).m22250();
                                    return;
                                }
                            }
                        }
                    } else if (C21898.m49409()) {
                        System.out.println("Try install apk by Shell: " + abstractC17043.mo25505());
                        if (z) {
                            new C4582(this, C17853.f53278.m38685()).m22250();
                            return;
                        }
                        if (!abstractC17043.mo37341()) {
                            i2 = 2;
                        } else if (Build.VERSION.SDK_INT < 28 || "/data/local/tmp".equals(abstractC17043.getParent())) {
                            i2 = 0;
                        }
                        new C3240(this, i2).m22250();
                        return;
                    }
                } else {
                    C7350 c7352 = C21898.f68876;
                    if (ApplicationC21448.f67650.getBoolean("apk_installation_dhizuku", true) && !C20953.m47267().m47269("disable_install_by_shizuku")) {
                        System.out.println("Try install apk by Dhizuku: " + abstractC17043.mo25505());
                        if (!Dhizuku.init(C7050.m16232())) {
                            m28817(EnumC7934.DHIZUKU);
                            return;
                        }
                        try {
                            if (!Dhizuku.isPermissionGranted()) {
                                Dhizuku.requestPermission(new BinderC16650(this));
                                return;
                            } else {
                                new C13969(this, new C22687(this)).m22250();
                                return;
                            }
                        } catch (Exception unused4) {
                            m28817(EnumC7934.DHIZUKU);
                            return;
                        }
                    }
                }
            } else if (C21898.m49407() && !C20953.m47267().m47269("disable_install_by_shizuku")) {
                System.out.println("Try install apk by Shizuku: " + abstractC17043.mo25505());
                int iM49410 = C21898.m49410();
                if (iM49410 == 0) {
                    m28817(EnumC7934.SHIZUKU);
                    return;
                } else if (iM49410 != 1) {
                    new C13969(this, new C9946(this)).m22250();
                    return;
                } else {
                    if (new C19215(this).m43757()) {
                        return;
                    }
                    m28817(EnumC7934.SHIZUKU);
                    return;
                }
            }
            enumC7934 = enumC7934.m18341();
        }
        C20671 c20671BuildDialog = this.f35058.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧۚܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C12510 c12510 = this.f35445;
                if (c12510.f35058.m12267(c12510.f35059, c12510.f35060)) {
                    new C11288(c12510).m22250();
                }
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܽۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12510 c12510 = this.f53739;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                    intent2.addFlags(268435456);
                    c12510.m28814(intent2);
                } catch (Exception e2) {
                    c12510.m28815(e2);
                }
            }
        });
        C10884.m25069(dialogInterfaceC2564M46732);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28817(EnumC7934 enumC7934) {
        m28816(enumC7934.m18341());
    }
}
