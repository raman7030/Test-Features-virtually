package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import bin.mt.plus.R;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۡۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final class C8823 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PackageManager f26893 = C4925.m14320();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26894;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f26895;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f26896;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f26897;

    public C8823(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, View view) {
        this.f26896 = dialogInterfaceOnClickListenerC19407;
        this.f26894 = view;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f26896.f62792.m39056(), R.string.MT_Protector);
        this.f23322.m31860(new Runnable() { // from class: l.᩻ۤܿ
            @Override // java.lang.Runnable
            public final void run() {
                C8823.m22795(this.f76586);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22795(C8823 c8823) {
        c8823.f26896.m44706(true);
        c8823.f23322.m31857();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String str;
        PackageManager packageManager = this.f26893;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f26896;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC19407.f62796.m12094(), 0);
            dialogInterfaceOnClickListenerC19407.f62793 = ((long) packageInfo.versionCode) > dialogInterfaceOnClickListenerC19407.f62796.m12098();
            str = packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            dialogInterfaceOnClickListenerC19407.f62793 = false;
            str = "";
        } catch (Throwable unused2) {
            str = null;
        }
        if (dialogInterfaceOnClickListenerC19407.f62793 && DialogInterfaceOnClickListenerC19407.f62785 && (C20549.m47086() || (C20549.m47084() && !C19554.m44967().m44969("disable_install_by_shizuku") && C20549.m47087() != 0))) {
            dialogInterfaceOnClickListenerC19407.f62793 = false;
        }
        while (dialogInterfaceOnClickListenerC19407.f62795.get()) {
            if (this.f23322.m31868()) {
                return;
            } else {
                SystemClock.sleep(10L);
            }
        }
        if (dialogInterfaceOnClickListenerC19407.f62797 != null && dialogInterfaceOnClickListenerC19407.f62797.m13530() && dialogInterfaceOnClickListenerC19407.f62797.m13531()) {
            MessageDigest messageDigestM34532 = C14460.m34532();
            messageDigestM34532.update(dialogInterfaceOnClickListenerC19407.f62797.m13532());
            this.f26895 = C14460.m34531(messageDigestM34532.digest());
            if (this.f23322.m31868()) {
                return;
            }
            if (str != null) {
                if (str.isEmpty()) {
                    return;
                }
                try {
                    C4611 c4611 = new C4611(C16999.m39866(str, new String[0]), false);
                    MessageDigest messageDigestM34533 = C14460.m34532();
                    messageDigestM34533.update(c4611.m13532());
                    this.f26897 = C14460.m34531(messageDigestM34533.digest());
                    return;
                } catch (Throwable unused3) {
                }
            }
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC19407.f62796.m12094(), 64);
                if (packageInfo2 == null || packageInfo2.signatures == null) {
                    return;
                }
                MessageDigest messageDigestM34534 = C14460.m34532();
                messageDigestM34534.update(packageInfo2.signatures[0].toByteArray());
                this.f26897 = C14460.m34531(messageDigestM34534.digest());
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int i;
        if (this.f23322.m31868()) {
            return;
        }
        String str = this.f26895;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f26896;
        if (str == null) {
            C19258 c19258BuildDialog = dialogInterfaceOnClickListenerC19407.f62792.m39056().buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f20815.f26896.m44706(false);
                }
            });
            C8960.m23095(c19258BuildDialog.m44438());
            return;
        }
        String str2 = this.f26897;
        if (str2 == null || str.equals(str2)) {
            i = dialogInterfaceOnClickListenerC19407.f62793 ? R.string.MT_Protector : 0;
        } else {
            i = R.string.MT_Protector;
        }
        if (i == 0) {
            dialogInterfaceOnClickListenerC19407.m44706(true);
            return;
        }
        C19258 c19258BuildDialog2 = dialogInterfaceOnClickListenerC19407.f62792.m39056().buildDialog();
        c19258BuildDialog2.m44433(R.string.MT_Protector);
        c19258BuildDialog2.m44416(i);
        c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19408 = this.f67390.f26896;
                dialogInterfaceOnClickListenerC19408.f62794 = true;
                dialogInterfaceOnClickListenerC19408.f62792.m39056().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", dialogInterfaceOnClickListenerC19408.f62796.m12094(), null)));
            }
        });
        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog2.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f28921.f26896.m44706(false);
            }
        });
        C8960.m23095(c19258BuildDialog2.m44438());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f26896.f62792.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        if (this.f26896.f62789.m1442()) {
            this.f26894.setEnabled(true);
        }
    }
}
