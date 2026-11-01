package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import bin.p000mt.plus.R;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۡۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10754 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public PackageManager f29817 = C7050.m16217();

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ View f29818;

    /* JADX INFO: renamed from: ܳ */
    public String f29819;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC20813 f29820;

    /* JADX INFO: renamed from: ᩻ */
    public String f29821;

    public C10754(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813, View view) {
        this.f29820 = dialogInterfaceOnClickListenerC20813;
        this.f29818 = view;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f29820.f65402.m41282(), R.string.MT_Protector);
        this.f26234.m33952(new Runnable() { // from class: l.᩻ۤܿ
            @Override // java.lang.Runnable
            public final void run() {
                C10754.m24765(this.f79330);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m24765(C10754 c10754) {
        c10754.f29820.m47000(true);
        c10754.f26234.m33949();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String str;
        PackageManager packageManager = this.f29817;
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f29820;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC20813.f65406.m14014(), 0);
            dialogInterfaceOnClickListenerC20813.f65403 = ((long) packageInfo.versionCode) > dialogInterfaceOnClickListenerC20813.f65406.m14018();
            str = packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            dialogInterfaceOnClickListenerC20813.f65403 = false;
            str = "";
        } catch (Throwable unused2) {
            str = null;
        }
        if (dialogInterfaceOnClickListenerC20813.f65403 && DialogInterfaceOnClickListenerC20813.f65395 && (C21898.m49409() || (C21898.m49407() && !C20953.m47267().m47269("disable_install_by_shizuku") && C21898.m49410() != 0))) {
            dialogInterfaceOnClickListenerC20813.f65403 = false;
        }
        while (dialogInterfaceOnClickListenerC20813.f65405.get()) {
            if (this.f26234.m33960()) {
                return;
            } else {
                SystemClock.sleep(10L);
            }
        }
        if (dialogInterfaceOnClickListenerC20813.f65407 != null && dialogInterfaceOnClickListenerC20813.f65407.m15419() && dialogInterfaceOnClickListenerC20813.f65407.m15420()) {
            MessageDigest messageDigestM36666 = C16111.m36666();
            messageDigestM36666.update(dialogInterfaceOnClickListenerC20813.f65407.m15421());
            this.f29819 = C16111.m36665(messageDigestM36666.digest());
            if (this.f26234.m33960()) {
                return;
            }
            if (str != null) {
                if (str.isEmpty()) {
                    return;
                }
                try {
                    C6751 c6751 = new C6751(C18524.m42109(str, new String[0]), false);
                    MessageDigest messageDigestM36667 = C16111.m36666();
                    messageDigestM36667.update(c6751.m15421());
                    this.f29821 = C16111.m36665(messageDigestM36667.digest());
                    return;
                } catch (Throwable unused3) {
                }
            }
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC20813.f65406.m14014(), 64);
                if (packageInfo2 == null || packageInfo2.signatures == null) {
                    return;
                }
                MessageDigest messageDigestM36668 = C16111.m36666();
                messageDigestM36668.update(packageInfo2.signatures[0].toByteArray());
                this.f29821 = C16111.m36665(messageDigestM36668.digest());
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int i;
        if (this.f26234.m33960()) {
            return;
        }
        String str = this.f29819;
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = this.f29820;
        if (str == null) {
            C20671 c20671BuildDialog = dialogInterfaceOnClickListenerC20813.f65402.m41282().buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f23689.f29820.m47000(false);
                }
            });
            C10884.m25069(c20671BuildDialog.m46732());
            return;
        }
        String str2 = this.f29821;
        if (str2 == null || str.equals(str2)) {
            i = dialogInterfaceOnClickListenerC20813.f65403 ? R.string.MT_Protector : 0;
        } else {
            i = R.string.MT_Protector;
        }
        if (i == 0) {
            dialogInterfaceOnClickListenerC20813.m47000(true);
            return;
        }
        C20671 c20671BuildDialog2 = dialogInterfaceOnClickListenerC20813.f65402.m41282().buildDialog();
        c20671BuildDialog2.m46727(R.string.MT_Protector);
        c20671BuildDialog2.m46710(i);
        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20814 = this.f70073.f29820;
                dialogInterfaceOnClickListenerC20814.f65404 = true;
                dialogInterfaceOnClickListenerC20814.f65402.m41282().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", dialogInterfaceOnClickListenerC20814.f65406.m14014(), null)));
            }
        });
        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog2.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f31867.f29820.m47000(false);
            }
        });
        C10884.m25069(c20671BuildDialog2.m46732());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f29820.f65402.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        if (this.f29820.f65399.m3855()) {
            this.f29818.setEnabled(true);
        }
    }
}
