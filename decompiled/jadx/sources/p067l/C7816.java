package p067l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 113M */
/* JADX INFO: loaded from: classes2.dex */
public final class C7816 {

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f20502;

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f20503;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17043 f20504;

    /* JADX INFO: renamed from: ܽ */
    public String f20505;

    static {
        f20502 = Build.VERSION.SDK_INT < 24;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7816 m18080(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, String str) {
        C7816 c7816 = new C7816();
        c7816.f20503 = abstractActivityC5549;
        c7816.f20504 = abstractC17043;
        c7816.f20505 = str;
        return c7816;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m18082() {
        return this.f20505;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m18083(String str) {
        if (str == null || str.equals("default")) {
            str = this.f20505;
        }
        return m18079(this.f20503.getPackageManager(), this.f20504, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18086(InterfaceC7796 interfaceC7796) {
        m18085(interfaceC7796, this.f20504, false);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015f A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:67:0x0153, B:68:0x015f), top: B:75:0x0031 }] */
    /* JADX INFO: renamed from: ֫ */
    public final void m18085(InterfaceC7796 interfaceC7796, AbstractC17043 abstractC17043, boolean z) {
        int i;
        String str = this.f20505;
        AbstractActivityC5549 abstractActivityC5549 = this.f20503;
        if (!interfaceC7796.mo10961() && !interfaceC7796.mo10959()) {
            throw new RuntimeException();
        }
        if (z) {
            try {
                abstractActivityC5549.startActivity(m18078(interfaceC7796, C13692.m31098(abstractC17043), str));
                return;
            } catch (Exception e) {
                abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        try {
            if (!abstractC17043.mo29980() || !interfaceC7796.mo10961()) {
                abstractActivityC5549.startActivity(m18078(interfaceC7796, abstractC17043.m38667(), str));
            } else {
                boolean z2 = false;
                try {
                    i = abstractActivityC5549.getPackageManager().getApplicationInfo(interfaceC7796.mo10963().getPackageName(), 0).targetSdkVersion;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = -1;
                }
                if (i >= 29) {
                    abstractActivityC5549.startActivity(m18078(interfaceC7796, abstractC17043.m38667(), str));
                } else {
                    Intent intentM18078 = m18078(interfaceC7796, abstractC17043.m38680(), str);
                    if (f20502) {
                        try {
                            abstractActivityC5549.startActivity(intentM18078);
                            return;
                        } catch (Exception unused2) {
                        }
                    }
                    InterfaceC11953 interfaceC11953M25777 = C11164.m25777();
                    if (interfaceC11953M25777 != null && interfaceC11953M25777.mo27365()) {
                        StringBuilder sb = new StringBuilder("am start");
                        String action = intentM18078.getAction();
                        if (action != null) {
                            sb.append(" -a ");
                            sb.append(action);
                        }
                        ComponentName component = intentM18078.getComponent();
                        if (component != null) {
                            sb.append(" -n ");
                            sb.append(C11164.m25756(component.flattenToString()));
                        }
                        Uri data = intentM18078.getData();
                        if (data != null) {
                            sb.append(" -d ");
                            sb.append(C11164.m25756(data.toString()));
                        }
                        String type = intentM18078.getType();
                        if (type != null) {
                            sb.append(" -t ");
                            sb.append(C11164.m25756(type));
                        }
                        Uri uri = (Uri) intentM18078.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null) {
                            sb.append(" --eu android.intent.extra.STREAM ");
                            sb.append(C11164.m25756(uri.toString()));
                        }
                        int flags = intentM18078.getFlags();
                        if (flags != 0) {
                            sb.append(" -f ");
                            sb.append(String.format("0x%08x", Integer.valueOf(flags)));
                        }
                        String string = sb.toString();
                        System.out.println("Cmd: " + string);
                        C13964 c13964Mo27362 = interfaceC11953M25777.mo27362(string);
                        boolean zM31745 = c13964Mo27362.m31745();
                        String str2 = c13964Mo27362.f39429;
                        if (!zM31745 || str2.contains("Warning")) {
                            return;
                        } else {
                            System.out.println("Start activity with shell failed: ".concat(str2));
                        }
                    }
                    try {
                        C7050.m16201("bin.mt.filetransfer");
                        z2 = true;
                    } catch (Exception unused3) {
                    }
                    if (z2) {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName("bin.mt.filetransfer", "bin.mt.filetransfer.Main"));
                        intent.putExtra("intent", intentM18078);
                        try {
                            abstractActivityC5549.startActivity(intent);
                            return;
                        } catch (Exception unused4) {
                        }
                    }
                    abstractActivityC5549.startActivity(m18078(interfaceC7796, abstractC17043.m38667(), str));
                }
            }
        } catch (Exception e2) {
            abstractActivityC5549.m12259(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18084(InterfaceC7796 interfaceC7796) {
        this.f20503.mo12256(interfaceC7796.mo10963().getPackageName());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m18087() {
        if (f20502 || !this.f20504.mo29980() || C11164.m25769()) {
            return false;
        }
        try {
            C7050.m16201("bin.mt.filetransfer");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m18079(PackageManager packageManager, AbstractC17043 abstractC17043, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        HashMap map = new HashMap();
        if (abstractC17043.mo29980()) {
            intent.setDataAndType(abstractC17043.m38680(), str);
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                m18081(map, it.next(), true);
            }
        }
        intent.setDataAndType(abstractC17043.m38667(), str);
        Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
        while (it2.hasNext()) {
            m18081(map, it2.next(), false);
        }
        if (map.isEmpty() && !str.equals("*/*")) {
            return m18079(packageManager, abstractC17043, "*/*");
        }
        return new ArrayList(map.values());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18081(HashMap map, ResolveInfo resolveInfo, boolean z) {
        String str = resolveInfo.activityInfo.packageName;
        if (str.equals("bin.mt.plus") || str.equals("bin.mt.plus.canary") || str.equals("bin.mt.plus")) {
            return;
        }
        StringBuilder sbM21133 = C9179.m21133(str, "/");
        sbM21133.append(resolveInfo.activityInfo.name);
        String string = sbM21133.toString();
        C5134 c5134 = (C5134) map.get(string);
        if (c5134 == null) {
            c5134 = new C5134(resolveInfo);
            map.put(string, c5134);
        }
        if (z) {
            c5134.m10966();
        } else {
            c5134.m10962();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Intent m18078(InterfaceC7796 interfaceC7796, Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str);
        intent.setComponent(interfaceC7796.mo10963());
        intent.addFlags(268435456);
        C5065.m10798(intent, uri);
        return intent;
    }
}
