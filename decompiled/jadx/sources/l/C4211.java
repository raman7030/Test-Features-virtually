package l;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4211 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2800 m12703() {
        String strM44968 = C19554.m44967().m44968("term_ex_info_v3", null);
        if (strM44968 != null) {
            try {
                C2800 c2800 = new C2800();
                JSONObject jSONObject = new JSONObject(strM44968);
                c2800.f8741 = jSONObject.getInt(am.aE);
                c2800.f8740 = jSONObject.getString("n");
                c2800.f8739 = jSONObject.getJSONArray(c2800.f8737).getLong(0);
                c2800.f8738 = jSONObject.getJSONArray(c2800.f8737).getString(1);
                return c2800;
            } catch (JSONParseException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12705(final AbstractActivityC3346 abstractActivityC3346, final Runnable runnable, final boolean z) {
        int i;
        final C2800 c2800M12703 = m12703();
        if (c2800M12703 == null) {
            runnable.run();
            return;
        }
        if (!z && C4925.f15523.getInt("term_ex_skip", -1) == c2800M12703.f8741) {
            runnable.run();
            return;
        }
        C7549 c7549M6880 = C2094.m6880();
        if (c7549M6880 == null) {
            i = R.string.MT_Protector;
        } else {
            if (c7549M6880.f23330 >= c2800M12703.f8741) {
                runnable.run();
                return;
            }
            i = R.string.MT_Protector;
        }
        String strM14306 = C4925.m14306(R.string.MT_Protector, c2800M12703.f8740, C22927.m51020(c2800M12703.f8739) + "B", c2800M12703.f8737);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(strM14306 + "\n" + C4925.m14327(i));
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4211.m12704(c2800M12703, abstractActivityC3346, runnable);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!z) {
                    C21374.m48463(R.string.MT_Protector);
                    C4925.f15523.edit().putInt("term_ex_skip", c2800M12703.f8741).apply();
                }
                runnable.run();
            }
        });
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12704(C2800 c2800, AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        PackageInfo packageInfoM14304;
        AbstractC15440 abstractC15440M36526 = C16293.f50110.m36526("termex_v" + c2800.f8741 + "_" + c2800.f8737 + ".apk");
        if (!C2094.f6977) {
            try {
                packageInfoM14304 = C4925.m14304("bin.mt.termex");
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfoM14304 = null;
            }
            if (packageInfoM14304 != null) {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(packageInfoM14304.applicationInfo.sourceDir, new String[0]);
                try {
                    MessageDigest messageDigestM34526 = C14460.m34526();
                    C14460.m34527(messageDigestM34526, abstractC15440M39866.mo27926());
                    if (C14460.m34531(messageDigestM34526.digest()).equals(c2800.f8738)) {
                        c2800.f8741 = packageInfoM14304.versionCode;
                        c2800.f8740 = packageInfoM14304.versionName;
                        m12711(abstractActivityC3346, abstractC15440M39866, c2800, runnable);
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (abstractC15440M36526.mo23120()) {
            try {
                MessageDigest messageDigestM34527 = C14460.m34526();
                C14460.m34527(messageDigestM34527, abstractC15440M36526.mo27926());
                if (C14460.m34531(messageDigestM34527.digest()).equals(c2800.f8738)) {
                    m12711(abstractActivityC3346, abstractC15440M36526, c2800, runnable);
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        new C21145(abstractActivityC3346, abstractC15440M36526, c2800, runnable).m20274();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m12712(C18090 c18090) {
        Set set = (Set) C5378.stream(new C23734(c18090.m42210()).m4937("lib/")).filter(new C3152(1)).map(new C7033(0)).collect(C22976.toSet());
        for (String str : Build.SUPPORTED_ABIS) {
            if (set.contains(str)) {
                return C4860.m14172("lib/", str, "/");
            }
        }
        return C9045.m23341(new StringBuilder("lib/"), Build.SUPPORTED_ABIS[0], "/");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12711(final AbstractActivityC3346 abstractActivityC3346, final AbstractC15440 abstractC15440, C2800 c2800, final Runnable runnable) {
        if (!C2094.f6977) {
            new C9150(abstractActivityC3346, abstractC15440, c2800, runnable).m20274();
            return;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18322(0, runnable));
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        final C9856 c9856 = new C9856();
        final C16204 c16204 = new C16204(dialogInterfaceC0206M44438, abstractActivityC3346, c9856, runnable);
        abstractActivityC3346.getLifecycle().mo19833(c16204);
        dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܿ᩸ۢ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                abstractActivityC3346.getLifecycle().mo19834(c16204);
            }
        });
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩸ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9856 c9857 = c9856;
                if (c9857.m24925()) {
                    if (c9857.f29822) {
                        return;
                    }
                    c9857.f29822 = true;
                    dialogInterfaceC0206M44438.dismiss();
                    ServiceC23281.m51598();
                    C2094.m6881();
                    runnable.run();
                    return;
                }
                C20549.m47080(abstractActivityC3346, abstractC15440, "bin.mt.termex");
            }
        });
        C20549.f66199.m1668(dialogInterfaceC0206M44438, new InterfaceC1008() { // from class: l.᩻᩸ۢ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C9856 c9857 = c9856;
                if (!c9857.m24925() || c9857.f29822) {
                    return;
                }
                c9857.f29822 = true;
                dialogInterfaceC0206M44438.dismiss();
                ServiceC23281.m51598();
                C2094.m6881();
                runnable.run();
            }
        });
        C20549.m47080(abstractActivityC3346, abstractC15440, "bin.mt.termex");
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12707(C7549 c7549) throws Throwable {
        C18090 c18090;
        C18090 c18091 = null;
        try {
            String str = c7549.f23331;
            String str2 = c7549.f23326;
            if (str == null) {
                c18090 = new C18090(str2);
                try {
                    String strM12713 = m12713(c18090);
                    c7549.f23331 = strM12713;
                    str = strM12713;
                    c18091 = c18090;
                } catch (Throwable th) {
                    th = th;
                    C0349.m1793(c18090);
                    throw th;
                }
            }
            AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("term/.exhash");
            if (abstractC15440M36526.mo23119()) {
                try {
                    if (abstractC15440M36526.m36489().equals(str)) {
                        C0349.m1793(c18091);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c18091 == null) {
                c18091 = new C18090(str2);
            }
            m12709(c18091, str);
            C0349.m1793(c18091);
        } catch (Throwable th2) {
            th = th2;
            c18090 = c18091;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12709(C18090 c18090, String str) throws ErrnoException {
        String strSubstring;
        AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("term");
        HashSet<String> hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM23341 = C9045.m23341(new StringBuilder(), m12712(c18090), "lib/");
        for (C3545 c3545 : c18090.m42194()) {
            String name = c3545.getName();
            if (name.startsWith("assets/")) {
                strSubstring = name.substring(7);
            } else if (name.startsWith(strM23341)) {
                strSubstring = name.substring(strM23341.length() - 4);
            }
            linkedHashMap.put(strSubstring, c3545);
            int iIndexOf = strSubstring.indexOf(47);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            hashSet.add(strSubstring);
        }
        for (String str2 : hashSet) {
            abstractC15440M36526.m36526(str2).mo23552();
            System.out.println(">> Delete: " + str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strM36561 = (String) entry.getKey();
            C3545 c3546 = (C3545) entry.getValue();
            if (strM36561.endsWith(".rename")) {
                strM36561 = C15472.m36561(7, 0, strM36561);
            } else if (strM36561.endsWith(".link")) {
                String strM36562 = C15472.m36561(5, 0, strM36561);
                String strTrim = new String(c18090.m42193(c3546, (C19277) null), StandardCharsets.UTF_8).trim();
                if (strTrim.startsWith("-n ")) {
                    strTrim = strTrim.substring(3);
                }
                Os.symlink(strTrim, abstractC15440M36526.m36526(strM36562).mo23544());
                System.out.println(">> Symlink: " + strM36562 + " > " + strTrim);
            }
            System.out.println(">> Extract: " + strM36561);
            AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526(strM36561);
            if (c3546.isDirectory()) {
                abstractC15440M36527.m36508();
            } else {
                abstractC15440M36527.m36493(c18090.m42189(c3546));
            }
        }
        if (str != null) {
            abstractC15440M36526.m36526(".exhash").m36510(str);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m12713(C18090 c18090) {
        MessageDigest messageDigestM34526 = C14460.m34526();
        String strM23341 = C9045.m23341(new StringBuilder(), m12712(c18090), "lib/");
        byte[] bArr = new byte[4];
        for (C3545 c3545 : c18090.m42194()) {
            String name = c3545.getName();
            if (name.startsWith("assets/") || name.startsWith(strM23341)) {
                C14460.m34528(messageDigestM34526, name);
                if (c3545.isDirectory()) {
                    C15972.m37746(0, 123456, bArr);
                } else {
                    C15972.m37746(0, c3545.m10782(), bArr);
                }
                messageDigestM34526.update(bArr);
            }
        }
        return C14460.m34531(messageDigestM34526.digest());
    }
}
