package p067l;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import bin.p000mt.plus.ShortcutActivity;
import com.alipay.sdk.p010m.p052u0.C0226b;

/* JADX INFO: renamed from: l.ۤ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 592B */
/* JADX INFO: loaded from: classes3.dex */
public final class C12435 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f34762;

    /* JADX INFO: renamed from: ۧ */
    public int f34763;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f34764;

    public C12435(AbstractActivityC5549 abstractActivityC5549, boolean z) {
        this.f34762 = abstractActivityC5549;
        this.f34764 = z;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m28642() {
        boolean z = this.f34764;
        AbstractActivityC5549 abstractActivityC5549 = this.f34762;
        if (z) {
            if (C1654.m40724(abstractActivityC5549).size() >= Math.min(C1654.m40730(abstractActivityC5549), 4)) {
                C22682.m50799(R.string.MT_Protector);
                C20422.m46099(abstractActivityC5549);
                return false;
            }
        } else {
            if (!ShortcutActivity.m139()) {
                C22682.m50799(R.string.MT_Protector);
                return false;
            }
            int iM49001 = 2;
            try {
                if (C5623.m12437()) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
                    Object objInvoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, abstractActivityC5549, intent);
                    if (objInvoke != null) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            iM49001 = 0;
                        } else {
                            iM49001 = -1;
                        }
                    }
                } else if (!C5623.m12441()) {
                    if (!C5623.m12440()) {
                        if (C5623.m12442()) {
                            iM49001 = C21717.m49001(abstractActivityC5549);
                        } else {
                            iM49001 = 0;
                        }
                    } else {
                        ContentResolver contentResolver = abstractActivityC5549.getContentResolver();
                        if (contentResolver != null) {
                            Cursor cursorQuery = contentResolver.query(Uri.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    String packageName = abstractActivityC5549.getApplicationContext().getPackageName();
                                    while (true) {
                                        if (cursorQuery.moveToNext()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(C0226b.f1011d));
                                            if (!TextUtils.isEmpty(string)) {
                                                if (!string.contains(packageName + ", 1")) {
                                                    if (string.contains(packageName + ", 0")) {
                                                        cursorQuery.close();
                                                        iM49001 = -1;
                                                    }
                                                } else {
                                                    cursorQuery.close();
                                                    iM49001 = 0;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else if (cursorQuery != null) {
                            }
                            cursorQuery.close();
                        }
                    }
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) abstractActivityC5549.getSystemService("appops");
                    String packageName2 = abstractActivityC5549.getApplicationContext().getPackageName();
                    int i = abstractActivityC5549.getApplicationInfo().uid;
                    Class<?> cls2 = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls3 = Integer.TYPE;
                    Object objInvoke2 = cls2.getDeclaredMethod("checkOpNoThrow", cls3, cls3, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName2);
                    if (objInvoke2 != null) {
                        String string2 = objInvoke2.toString();
                        int iHashCode = string2.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode != 49) {
                                if (iHashCode == 53 && string2.equals("5")) {
                                    iM49001 = 1;
                                }
                            } else if (string2.equals("1")) {
                                iM49001 = -1;
                            }
                        } else if (string2.equals("0")) {
                            iM49001 = 0;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.f34763 = iM49001;
            if (iM49001 == -1) {
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫᩹᩷
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C12435.m28641(this.f41272);
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28641(C12435 c12435) {
        AbstractActivityC5549 abstractActivityC5549 = c12435.f34762;
        C23728.m52763(abstractActivityC5549, abstractActivityC5549.getPackageName());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28643(Intent intent, String str, Bitmap bitmap, String str2) throws Throwable {
        boolean z = this.f34764;
        if (z) {
            str2 = C17588.m40053(str2, ":dynamic");
        }
        String strM36664 = C16111.m36664(str2);
        AbstractActivityC5549 abstractActivityC5549 = this.f34762;
        C1516 c1516 = new C1516(abstractActivityC5549, strM36664);
        c1516.m34773(str);
        c1516.m34774(C1073.m15503(bitmap));
        c1516.m34772(intent);
        C1201 c1201M34771 = c1516.m34771();
        if (z) {
            if (!C1654.m40731(abstractActivityC5549, c1201M34771)) {
                C22682.m50793(R.string.MT_Protector);
                return false;
            }
            ShortcutActivity.m135(c1201M34771.m21281(), bitmap);
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
        if (!C1654.m40735(abstractActivityC5549, c1201M34771)) {
            C22682.m50793(R.string.MT_Protector);
            return false;
        }
        if (this.f34763 == 0) {
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
        return true;
    }
}
