package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes3.dex */
public final class C11083 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C13698 f33272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C0069 f33273;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f33274;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static List f33275;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f33276;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33277;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f33278;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m27510() {
        if (Build.VERSION.SDK_INT >= 30 && !C7349.f22567) {
            return (C22518.m50491() && C22518.m50492().mo2656()) ? false : true;
        }
        return false;
    }

    public C11083(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        this.f33276 = abstractActivityC3346;
        this.f33278 = runnable;
        if (Build.VERSION.SDK_INT >= 30) {
            C12993.f38908.m1668(abstractActivityC3346, new C3116(new C22166(abstractActivityC3346, new C14873(2, this))));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27512(String str) {
        if (m27510()) {
            boolean zM39886 = C16999.m39886();
            int i = 1;
            AbstractActivityC3346 abstractActivityC3346 = this.f33276;
            if (zM39886) {
                String strReplace = C4925.m14327(R.string.MT_Protector).replace("xxx", "Android/data");
                C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44424(strReplace);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7018(i, this, str));
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
                this.f33277 = dialogInterfaceC0206M44438;
                dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.۫۠ܿ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C11083.m27504(this.f36598, dialogInterfaceC0206M44438);
                    }
                });
                return;
            }
            C13698 c13698M27502 = m27502();
            boolean z = str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb");
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 33) {
                    if (c13698M27502.m32947() || c13698M27502.m32949()) {
                        String strConcat = "forbid_tip_".concat(str);
                        if (C4925.f15523.getBoolean(strConcat, true)) {
                            C4925.f15523.edit().putBoolean(strConcat, false).apply();
                            StringBuilder sb = new StringBuilder(C4925.m14338().getText(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(sb, "xxx");
                            if (iIndexOf != -1) {
                                sb.replace(iIndexOf, iIndexOf + 3, str);
                            }
                            abstractActivityC3346.m10218(R.string.MT_Protector, sb.toString(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 >= 34) {
                    return;
                }
            }
            C20050 c20050 = C12993.f38911;
            if (C20050.m46238(str)) {
                return;
            }
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f33277;
            if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
                this.f33277.dismiss();
            }
            if (!c13698M27502.m32948(z)) {
                if (c13698M27502.m32949()) {
                    m27513(str, z, c13698M27502, new RunnableC23495(i, this, str));
                    return;
                } else {
                    m27515(str);
                    return;
                }
            }
            String strReplace2 = C4925.m14327(R.string.MT_Protector).replace("xxx", str);
            if (Build.VERSION.SDK_INT == 33) {
                strReplace2 = strReplace2.replace("Android 11", "Android 13");
            }
            C19258 c19258BuildDialog2 = abstractActivityC3346.buildDialog();
            c19258BuildDialog2.m44433(R.string.MT_Protector);
            c19258BuildDialog2.m44424(strReplace2);
            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9152(i, this, str));
            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC0206 dialogInterfaceC0206M44439 = c19258BuildDialog2.m44438();
            this.f33277 = dialogInterfaceC0206M44439;
            dialogInterfaceC0206M44439.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۤ۠ܿ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C11083.m27507(this.f30572, dialogInterfaceC0206M44439);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27499(C11083 c11083, String str) {
        f33274 = false;
        f33275 = Collections.singletonList(str);
        c11083.m27506(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27504(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27503(C11083 c11083, String str) {
        f33274 = false;
        f33275 = Collections.singletonList(str);
        c11083.m27506(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27507(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27513(String str, final boolean z, C13698 c13698, final Runnable runnable) {
        String strReplace = C4925.m14327(R.string.MT_Protector).replace("xxx", str);
        C19258 c19258BuildDialog = this.f33276.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(strReplace);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC17928(1, this, c13698));
        this.f33277 = dialogInterfaceC0206M44438;
        dialogInterfaceC0206M44438.m1436(new DialogInterfaceOnDismissListenerC21105(1, this, dialogInterfaceC0206M44438));
        C1802.f6208.submit(new Runnable() { // from class: l.ۨ۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                    if (!dialogInterfaceC0206.m1442()) {
                        return;
                    }
                    if (C11083.m27502().m32948(z)) {
                        C4925.m14315(new RunnableC6583(3, dialogInterfaceC0206, runnable));
                    }
                    SystemClock.sleep(600L);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27500(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27515(String str) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f33277;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            this.f33277.dismiss();
        }
        String strReplace = C4925.m14327(R.string.MT_Protector).replace("xxx", str);
        C19258 c19258BuildDialog = this.f33276.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(strReplace);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        this.f33277 = dialogInterfaceC0206M44438;
        dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۛ۠ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C11083.m27509(this.f18223, dialogInterfaceC0206M44438);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27509(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27514(LinkedHashSet linkedHashSet) {
        LinkedList linkedList = new LinkedList(linkedHashSet);
        f33275 = linkedList;
        f33274 = true;
        m27506((String) linkedList.get(0));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m27506(String str) {
        AbstractActivityC3346 abstractActivityC3346 = this.f33276;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(195);
        String strM27505 = m27505();
        intent.setPackage(strM27505);
        intent.putExtra("android.provider.extra.INITIAL_URI", C14609.m34868("primary:" + str, true));
        try {
            abstractActivityC3346.mo123(intent);
        } catch (Exception e) {
            if (strM27505 != null) {
                abstractActivityC3346.mo10220(strM27505);
            } else {
                abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27511(Uri uri) {
        List list = f33275;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        String string = C14609.m34868("primary:" + str, false).toString();
        String name = new File(str).getName();
        boolean z = f33274;
        Runnable runnable = this.f33278;
        if (z) {
            if (!uri.toString().equals(string)) {
                C21374.m48464(C4925.m14306(R.string.MT_Protector, name));
            } else {
                C12993.f38909.put(str, uri);
                C4925.m14336().takePersistableUriPermission(uri, 3);
                C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector, name));
            }
            list.remove(0);
            if (list.isEmpty()) {
                runnable.run();
                return;
            } else {
                m27506((String) list.get(0));
                return;
            }
        }
        if (list.size() == 1) {
            if (!uri.toString().equals(string)) {
                m27512(str);
                C21374.m48464(C4925.m14306(R.string.MT_Protector, name));
            } else {
                C12993.f38909.put(str, uri);
                C4925.m14336().takePersistableUriPermission(uri, 3);
                runnable.run();
                C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector, name));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m27505() {
        try {
            try {
                return C4925.m14304("com.google.android.documentsui").packageName;
            } catch (Exception unused) {
                return C4925.m14304("com.android.documentsui").packageName;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13698 m27502() {
        C13698 c13698 = f33272;
        try {
            try {
                PackageInfo packageInfoM14304 = C4925.m14304("com.google.android.documentsui");
                if (c13698 != null && C13698.m32946(c13698, packageInfoM14304)) {
                    return c13698;
                }
                C13698 c13698M32945 = C13698.m32945(packageInfoM14304);
                f33272 = c13698M32945;
                return c13698M32945;
            } catch (Exception unused) {
                return new C13698("com.android.documentsui", false, true, true, 0L);
            }
        } catch (Exception unused2) {
            PackageInfo packageInfoM14305 = C4925.m14304("com.android.documentsui");
            if (c13698 != null && C13698.m32946(c13698, packageInfoM14305)) {
                return c13698;
            }
            C13698 c13698M32946 = C13698.m32945(packageInfoM14305);
            f33272 = c13698M32946;
            return c13698M32946;
        }
        return new C13698("com.android.documentsui", false, true, true, 0L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27498(C0069 c0069) {
        f33273 = c0069;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m27508() {
        C0069 c0069 = f33273;
        C11003.requireNonNull(c0069);
        return c0069.mo1018();
    }
}
