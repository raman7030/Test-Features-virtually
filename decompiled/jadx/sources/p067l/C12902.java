package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes3.dex */
public final class C12902 {

    /* JADX INFO: renamed from: ܳ */
    public static C15387 f36273;

    /* JADX INFO: renamed from: ܿ */
    public static C2434 f36274;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f36275;

    /* JADX INFO: renamed from: ᩻ */
    public static List f36276;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f36277;

    /* JADX INFO: renamed from: ۧ */
    public DialogInterfaceC2564 f36278;

    /* JADX INFO: renamed from: ܽ */
    public final Runnable f36279;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m29572() {
        if (Build.VERSION.SDK_INT >= 30 && !C9353.f25480) {
            return (C23770.m52833() && C23770.m52834().mo4996()) ? false : true;
        }
        return false;
    }

    public C12902(AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        this.f36277 = abstractActivityC5549;
        this.f36279 = runnable;
        if (Build.VERSION.SDK_INT >= 30) {
            C14717.f41954.m4066(abstractActivityC5549, new C5330(new C23435(abstractActivityC5549, new C16503(2, this))));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29574(String str) {
        if (m29572()) {
            boolean zM42129 = C18524.m42129();
            int i = 1;
            AbstractActivityC5549 abstractActivityC5549 = this.f36277;
            if (zM42129) {
                String strReplace = C7050.m16224(R.string.MT_Protector).replace("xxx", "Android/data");
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(strReplace);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9039(i, this, str));
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
                this.f36278 = dialogInterfaceC2564M46732;
                dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.۫۠ܿ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C12902.m29566(this.f39614, dialogInterfaceC2564M46732);
                    }
                });
                return;
            }
            C15387 c15387M29564 = m29564();
            boolean z = str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb");
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 33) {
                    if (c15387M29564.m35062() || c15387M29564.m35064()) {
                        String strConcat = "forbid_tip_".concat(str);
                        if (C7050.f18355.getBoolean(strConcat, true)) {
                            C7050.f18355.edit().putBoolean(strConcat, false).apply();
                            StringBuilder sb = new StringBuilder(C7050.m16235().getText(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(sb, "xxx");
                            if (iIndexOf != -1) {
                                sb.replace(iIndexOf, iIndexOf + 3, str);
                            }
                            abstractActivityC5549.m12254(R.string.MT_Protector, sb.toString(), false);
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
            C21424 c21424 = C14717.f41957;
            if (C21424.m48554(str)) {
                return;
            }
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f36278;
            if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
                this.f36278.dismiss();
            }
            if (!c15387M29564.m35063(z)) {
                if (c15387M29564.m35064()) {
                    m29575(str, z, c15387M29564, new RunnableC24698(i, this, str));
                    return;
                } else {
                    m29577(str);
                    return;
                }
            }
            String strReplace2 = C7050.m16224(R.string.MT_Protector).replace("xxx", str);
            if (Build.VERSION.SDK_INT == 33) {
                strReplace2 = strReplace2.replace("Android 11", "Android 13");
            }
            C20671 c20671BuildDialog2 = abstractActivityC5549.buildDialog();
            c20671BuildDialog2.m46727(R.string.MT_Protector);
            c20671BuildDialog2.m46718(strReplace2);
            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11067(i, this, str));
            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC2564 dialogInterfaceC2564M46733 = c20671BuildDialog2.m46732();
            this.f36278 = dialogInterfaceC2564M46733;
            dialogInterfaceC2564M46733.m3849(new DialogInterface.OnDismissListener() { // from class: l.ۤ۠ܿ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C12902.m29569(this.f33534, dialogInterfaceC2564M46733);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m29561(C12902 c12902, String str) {
        f36275 = false;
        f36276 = Collections.singletonList(str);
        c12902.m29568(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m29566(C12902 c12902, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (c12902.f36278 == dialogInterfaceC2564) {
            c12902.f36278 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m29565(C12902 c12902, String str) {
        f36275 = false;
        f36276 = Collections.singletonList(str);
        c12902.m29568(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m29569(C12902 c12902, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (c12902.f36278 == dialogInterfaceC2564) {
            c12902.f36278 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29575(String str, final boolean z, C15387 c15387, final Runnable runnable) {
        String strReplace = C7050.m16224(R.string.MT_Protector).replace("xxx", str);
        C20671 c20671BuildDialog = this.f36277.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(strReplace);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC19407(1, this, c15387));
        this.f36278 = dialogInterfaceC2564M46732;
        dialogInterfaceC2564M46732.m3849(new DialogInterfaceOnDismissListenerC22427(1, this, dialogInterfaceC2564M46732));
        C4081.f8987.submit(new Runnable() { // from class: l.ۨ۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                    if (!dialogInterfaceC2564.m3855()) {
                        return;
                    }
                    if (C12902.m29564().m35063(z)) {
                        C7050.m16212(new RunnableC8625(3, dialogInterfaceC2564, runnable));
                    }
                    SystemClock.sleep(600L);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m29562(C12902 c12902, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (c12902.f36278 == dialogInterfaceC2564) {
            c12902.f36278 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29577(String str) {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f36278;
        if (dialogInterfaceC2564 != null && dialogInterfaceC2564.m3855()) {
            this.f36278.dismiss();
        }
        String strReplace = C7050.m16224(R.string.MT_Protector).replace("xxx", str);
        C20671 c20671BuildDialog = this.f36277.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(strReplace);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        this.f36278 = dialogInterfaceC2564M46732;
        dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ۛ۠ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C12902.m29571(this.f21077, dialogInterfaceC2564M46732);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m29571(C12902 c12902, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (c12902.f36278 == dialogInterfaceC2564) {
            c12902.f36278 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29576(LinkedHashSet linkedHashSet) {
        LinkedList linkedList = new LinkedList(linkedHashSet);
        f36276 = linkedList;
        f36275 = true;
        m29568((String) linkedList.get(0));
    }

    /* JADX INFO: renamed from: ܽ */
    private void m29568(String str) {
        AbstractActivityC5549 abstractActivityC5549 = this.f36277;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(195);
        String strM29567 = m29567();
        intent.setPackage(strM29567);
        intent.putExtra("android.provider.extra.INITIAL_URI", C16253.m37019("primary:" + str, true));
        try {
            abstractActivityC5549.mo121(intent);
        } catch (Exception e) {
            if (strM29567 != null) {
                abstractActivityC5549.mo12256(strM29567);
            } else {
                abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29573(Uri uri) {
        List list = f36276;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        String string = C16253.m37019("primary:" + str, false).toString();
        String name = new File(str).getName();
        boolean z = f36275;
        Runnable runnable = this.f36279;
        if (z) {
            if (!uri.toString().equals(string)) {
                C22682.m50800(C7050.m16203(R.string.MT_Protector, name));
            } else {
                C14717.f41955.put(str, uri);
                C7050.m16233().takePersistableUriPermission(uri, 3);
                C22682.m50795((CharSequence) C7050.m16203(R.string.MT_Protector, name));
            }
            list.remove(0);
            if (list.isEmpty()) {
                runnable.run();
                return;
            } else {
                m29568((String) list.get(0));
                return;
            }
        }
        if (list.size() == 1) {
            if (!uri.toString().equals(string)) {
                m29574(str);
                C22682.m50800(C7050.m16203(R.string.MT_Protector, name));
            } else {
                C14717.f41955.put(str, uri);
                C7050.m16233().takePersistableUriPermission(uri, 3);
                runnable.run();
                C22682.m50795((CharSequence) C7050.m16203(R.string.MT_Protector, name));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m29567() {
        try {
            try {
                return C7050.m16201("com.google.android.documentsui").packageName;
            } catch (Exception unused) {
                return C7050.m16201("com.android.documentsui").packageName;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15387 m29564() {
        C15387 c15387 = f36273;
        try {
            try {
                PackageInfo packageInfoM16201 = C7050.m16201("com.google.android.documentsui");
                if (c15387 != null && C15387.m35061(c15387, packageInfoM16201)) {
                    return c15387;
                }
                C15387 c15387M35060 = C15387.m35060(packageInfoM16201);
                f36273 = c15387M35060;
                return c15387M35060;
            } catch (Exception unused) {
                return new C15387("com.android.documentsui", false, true, true, 0L);
            }
        } catch (Exception unused2) {
            PackageInfo packageInfoM16202 = C7050.m16201("com.android.documentsui");
            if (c15387 != null && C15387.m35061(c15387, packageInfoM16202)) {
                return c15387;
            }
            C15387 c15387M35061 = C15387.m35060(packageInfoM16202);
            f36273 = c15387M35061;
            return c15387M35061;
        }
        return new C15387("com.android.documentsui", false, true, true, 0L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29560(C2434 c2434) {
        f36274 = c2434;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m29570() {
        C2434 c2434 = f36274;
        C12826.requireNonNull(c2434);
        return c2434.mo3414();
    }
}
