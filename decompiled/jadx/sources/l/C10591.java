package l;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.ۤ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 592B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10591 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f31791;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f31793;

    public C10591(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        this.f31791 = abstractActivityC3346;
        this.f31793 = z;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26605() {
        boolean z = this.f31793;
        AbstractActivityC3346 abstractActivityC3346 = this.f31791;
        if (z) {
            if (C16362.m38507(abstractActivityC3346).size() >= Math.min(C16362.m38513(abstractActivityC3346), 4)) {
                C21374.m48463(R.string.MT_Protector);
                C18995.m43831(abstractActivityC3346);
                return false;
            }
        } else {
            if (!ShortcutActivity.m141()) {
                C21374.m48463(R.string.MT_Protector);
                return false;
            }
            int iM46678 = 2;
            try {
                if (C3424.m10398()) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
                    Object objInvoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, abstractActivityC3346, intent);
                    if (objInvoke != null) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            iM46678 = 0;
                        } else {
                            iM46678 = -1;
                        }
                    }
                } else if (!C3424.m10402()) {
                    if (!C3424.m10401()) {
                        if (C3424.m10403()) {
                            iM46678 = C20358.m46678(abstractActivityC3346);
                        } else {
                            iM46678 = 0;
                        }
                    } else {
                        ContentResolver contentResolver = abstractActivityC3346.getContentResolver();
                        if (contentResolver != null) {
                            Cursor cursorQuery = contentResolver.query(Uri.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    String packageName = abstractActivityC3346.getApplicationContext().getPackageName();
                                    while (true) {
                                        if (cursorQuery.moveToNext()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(b.d));
                                            if (!TextUtils.isEmpty(string)) {
                                                if (!string.contains(packageName + ", 1")) {
                                                    if (string.contains(packageName + ", 0")) {
                                                        cursorQuery.close();
                                                        iM46678 = -1;
                                                    }
                                                } else {
                                                    cursorQuery.close();
                                                    iM46678 = 0;
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
                    AppOpsManager appOpsManager = (AppOpsManager) abstractActivityC3346.getSystemService("appops");
                    String packageName2 = abstractActivityC3346.getApplicationContext().getPackageName();
                    int i = abstractActivityC3346.getApplicationInfo().uid;
                    Class<?> cls2 = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls3 = Integer.TYPE;
                    Object objInvoke2 = cls2.getDeclaredMethod("checkOpNoThrow", cls3, cls3, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName2);
                    if (objInvoke2 != null) {
                        String string2 = objInvoke2.toString();
                        int iHashCode = string2.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode != 49) {
                                if (iHashCode == 53 && string2.equals("5")) {
                                    iM46678 = 1;
                                }
                            } else if (string2.equals("1")) {
                                iM46678 = -1;
                            }
                        } else if (string2.equals("0")) {
                            iM46678 = 0;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.f31792 = iM46678;
            if (iM46678 == -1) {
                C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫᩹᩷
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C10591.m26604(this.f38243);
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26604(C10591 c10591) {
        AbstractActivityC3346 abstractActivityC3346 = c10591.f31791;
        C22474.m50422(abstractActivityC3346, abstractActivityC3346.getPackageName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26606(Intent intent, String str, Bitmap bitmap, String str2) throws Throwable {
        boolean z = this.f31793;
        if (z) {
            str2 = C16014.m37867(str2, ":dynamic");
        }
        String strM34530 = C14460.m34530(str2);
        AbstractActivityC3346 abstractActivityC3346 = this.f31791;
        C13581 c13581 = new C13581(abstractActivityC3346, strM34530);
        c13581.m32661(str);
        c13581.m32662(C4656.m13628(bitmap));
        c13581.m32660(intent);
        C7232 c7232M32659 = c13581.m32659();
        if (z) {
            if (!C16362.m38514(abstractActivityC3346, c7232M32659)) {
                C21374.m48457(R.string.MT_Protector);
                return false;
            }
            ShortcutActivity.m137(c7232M32659.m19332(), bitmap);
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
        if (!C16362.m38518(abstractActivityC3346, c7232M32659)) {
            C21374.m48457(R.string.MT_Protector);
            return false;
        }
        if (this.f31792 == 0) {
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
        return true;
    }
}
