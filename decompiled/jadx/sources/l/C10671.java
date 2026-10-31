package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.rosan.dhizuku.api.Dhizuku;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10671 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f32087;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f32088;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f32089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f32090;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f32091;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f32092;

    public C10671() {
        throw null;
    }

    public C10671(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, boolean z, String str, List list, String str2) {
        this.f32087 = abstractActivityC3346;
        this.f32088 = abstractC15440;
        this.f32092 = z;
        this.f32091 = str;
        this.f32089 = list;
        this.f32090 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10671)) {
            return false;
        }
        C10671 c10671 = (C10671) obj;
        return this.f32092 == c10671.f32092 && C11003.equals(this.f32087, c10671.f32087) && C11003.equals(this.f32088, c10671.f32088) && C11003.equals(this.f32091, c10671.f32091) && C11003.equals(this.f32089, c10671.f32089) && C11003.equals(this.f32090, c10671.f32090);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f32090) + ((C11003.hashCode(this.f32089) + C20361.m46680((C11003.hashCode(this.f32088) + ((C11003.hashCode(this.f32087) + ((this.f32092 ? 1231 : 1237) * 31)) * 31)) * 31, 31, this.f32091)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f32087, this.f32088, Boolean.valueOf(this.f32092), this.f32091, this.f32089, this.f32090};
        String[] strArrSplit = "activity;file;isApks;packageName;selectedApkNames;installerPackageName".length() == 0 ? new String[0] : "activity;file;isApks;packageName;selectedApkNames;installerPackageName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10671.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26773() {
        if (this.f32090.isEmpty()) {
            return;
        }
        C4925.m14315(new RunnableC5258(2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26775(Intent intent) {
        this.f32087.startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26776(Exception exc) {
        this.f32087.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26774(int i) {
        this.f32087.m10235(i);
    }

    public final String getFileName() {
        return this.f32088.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1.versionCode < 54100) goto L30;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26777(final EnumC5856 enumC5856) {
        if (!C10975.m27285()) {
            C4925.m14315(new Runnable() { // from class: l.֫֨ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5347.m26777(enumC5856);
                }
            });
            return;
        }
        String str = this.f32090;
        if (!str.isEmpty() && !C11356.m28105(str)) {
            m26774(R.string.MT_Protector);
            return;
        }
        while (true) {
            int i = C10090.f30380[enumC5856.ordinal()];
            int i2 = 1;
            AbstractC15440 abstractC15440 = this.f32088;
            if (i != 1) {
                if (i != 2) {
                    boolean z = this.f32092;
                    if (i != 3) {
                        if (i == 4) {
                            m26773();
                            System.out.println("Try install apk by System: " + abstractC15440.mo23554());
                            if (z) {
                                C5242 c5242 = C20549.f66199;
                                if (C3424.m10402() && ApplicationC20075.f65008.getBoolean("show_apks_miui_warning", true)) {
                                    try {
                                        PackageInfo packageInfo = C4925.m14320().getPackageInfo("com.miui.packageinstaller", 0);
                                        System.out.println("packageInfo.versionCode=" + packageInfo.versionCode);
                                    } catch (Exception unused) {
                                    }
                                }
                                if (this.f32087.m10231(this.f32088, this.f32089)) {
                                    new C9385(this).m20274();
                                    return;
                                }
                                return;
                            }
                            C5242 c5243 = C20549.f66199;
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.addFlags(268435456);
                            ComponentName componentNameM7568 = C2312.m7568(C4925.m14320());
                            if (componentNameM7568 != null) {
                                try {
                                    Uri uriM29046 = C11914.m29046(abstractC15440);
                                    intent.setDataAndType(uriM29046, "application/vnd.android.package-archive");
                                    C2837.m8731(intent, uriM29046);
                                    intent.setComponent(componentNameM7568);
                                    m26775(intent);
                                    return;
                                } catch (ActivityNotFoundException unused2) {
                                    intent.setComponent(null);
                                }
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String str2 = C11914.f35616;
                                if (!C4925.f15523.getBoolean("apk_installation_prevents_deletion", false) && abstractC15440.mo27919()) {
                                    try {
                                        intent.setDataAndType(abstractC15440.m36522(), "application/vnd.android.package-archive");
                                        m26775(intent);
                                        return;
                                    } catch (ActivityNotFoundException unused3) {
                                    }
                                }
                            }
                            try {
                                Uri uriM29047 = C11914.m29046(abstractC15440);
                                intent.setDataAndType(uriM29047, "application/vnd.android.package-archive");
                                C2837.m8731(intent, uriM29047);
                                m26775(intent);
                                return;
                            } catch (ActivityNotFoundException e) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    m26776(e);
                                    return;
                                } else {
                                    new C19263(this, intent).m20274();
                                    return;
                                }
                            }
                        }
                    } else if (C20549.m47086()) {
                        System.out.println("Try install apk by Shell: " + abstractC15440.mo23554());
                        if (z) {
                            new C2329(this, C16293.f50111.m36527()).m20274();
                            return;
                        }
                        if (!abstractC15440.mo35194()) {
                            i2 = 2;
                        } else if (Build.VERSION.SDK_INT < 28 || "/data/local/tmp".equals(abstractC15440.getParent())) {
                            i2 = 0;
                        }
                        new C0917(this, i2).m20274();
                        return;
                    }
                } else {
                    C5242 c5244 = C20549.f66199;
                    if (ApplicationC20075.f65010.getBoolean("apk_installation_dhizuku", true) && !C19554.m44967().m44969("disable_install_by_shizuku")) {
                        System.out.println("Try install apk by Dhizuku: " + abstractC15440.mo23554());
                        if (!Dhizuku.init(C4925.m14335())) {
                            m26778(EnumC5856.DHIZUKU);
                            return;
                        }
                        try {
                            if (!Dhizuku.isPermissionGranted()) {
                                Dhizuku.requestPermission(new BinderC15027(this));
                                return;
                            } else {
                                new C12206(this, new C21379(this)).m20274();
                                return;
                            }
                        } catch (Exception unused4) {
                            m26778(EnumC5856.DHIZUKU);
                            return;
                        }
                    }
                }
            } else if (C20549.m47084() && !C19554.m44967().m44969("disable_install_by_shizuku")) {
                System.out.println("Try install apk by Shizuku: " + abstractC15440.mo23554());
                int iM47087 = C20549.m47087();
                if (iM47087 == 0) {
                    m26778(EnumC5856.SHIZUKU);
                    return;
                } else if (iM47087 != 1) {
                    new C12206(this, new C7973(this)).m20274();
                    return;
                } else {
                    if (new C17726(this).m41511()) {
                        return;
                    }
                    m26778(EnumC5856.SHIZUKU);
                    return;
                }
            }
            enumC5856 = enumC5856.m16416();
        }
        C19258 c19258BuildDialog = this.f32087.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧۚܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C10671 c10671 = this.f32469;
                if (c10671.f32087.m10231(c10671.f32088, c10671.f32089)) {
                    new C9385(c10671).m20274();
                }
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܽۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10671 c10671 = this.f50560;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                    intent2.addFlags(268435456);
                    c10671.m26775(intent2);
                } catch (Exception e2) {
                    c10671.m26776(e2);
                }
            }
        });
        C8960.m23095(dialogInterfaceC0206M44438);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26778(EnumC5856 enumC5856) {
        m26777(enumC5856.m16416());
    }
}
