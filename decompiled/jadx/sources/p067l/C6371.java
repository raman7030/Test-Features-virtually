package p067l;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.View;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONParseException;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6371 {
    /* JADX INFO: renamed from: ֫ */
    public static C5030 m14579() {
        String strM47268 = C20953.m47267().m47268("term_ex_info_v3", null);
        if (strM47268 != null) {
            try {
                C5030 c5030 = new C5030();
                JSONObject jSONObject = new JSONObject(strM47268);
                c5030.f11535 = jSONObject.getInt(C0655am.f2277aE);
                c5030.f11534 = jSONObject.getString("n");
                c5030.f11533 = jSONObject.getJSONArray(c5030.f11531).getLong(0);
                c5030.f11532 = jSONObject.getJSONArray(c5030.f11531).getString(1);
                return c5030;
            } catch (JSONParseException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14581(final AbstractActivityC5549 abstractActivityC5549, final Runnable runnable, final boolean z) {
        int i;
        final C5030 c5030M14579 = m14579();
        if (c5030M14579 == null) {
            runnable.run();
            return;
        }
        if (!z && C7050.f18355.getInt("term_ex_skip", -1) == c5030M14579.f11535) {
            runnable.run();
            return;
        }
        C9543 c9543M9006 = C4359.m9006();
        if (c9543M9006 == null) {
            i = R.string.MT_Protector;
        } else {
            if (c9543M9006.f26242 >= c5030M14579.f11535) {
                runnable.run();
                return;
            }
            i = R.string.MT_Protector;
        }
        String strM16203 = C7050.m16203(R.string.MT_Protector, c5030M14579.f11534, C24158.m53411(c5030M14579.f11533) + "B", c5030M14579.f11531);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(strM16203 + "\n" + C7050.m16224(i));
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C6371.m14580(c5030M14579, abstractActivityC5549, runnable);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!z) {
                    C22682.m50799(R.string.MT_Protector);
                    C7050.f18355.edit().putInt("term_ex_skip", c5030M14579.f11535).apply();
                }
                runnable.run();
            }
        });
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14580(C5030 c5030, AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        PackageInfo packageInfoM16201;
        AbstractC17043 abstractC17043M38684 = C17853.f53277.m38684("termex_v" + c5030.f11535 + "_" + c5030.f11531 + ".apk");
        if (!C4359.f9761) {
            try {
                packageInfoM16201 = C7050.m16201("bin.mt.termex");
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfoM16201 = null;
            }
            if (packageInfoM16201 != null) {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(packageInfoM16201.applicationInfo.sourceDir, new String[0]);
                try {
                    MessageDigest messageDigestM36660 = C16111.m36660();
                    C16111.m36661(messageDigestM36660, abstractC17043M42109.mo29987());
                    if (C16111.m36665(messageDigestM36660.digest()).equals(c5030.f11532)) {
                        c5030.f11535 = packageInfoM16201.versionCode;
                        c5030.f11534 = packageInfoM16201.versionName;
                        m14587(abstractActivityC5549, abstractC17043M42109, c5030, runnable);
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (abstractC17043M38684.mo25094()) {
            try {
                MessageDigest messageDigestM36661 = C16111.m36660();
                C16111.m36661(messageDigestM36661, abstractC17043M38684.mo29987());
                if (C16111.m36665(messageDigestM36661.digest()).equals(c5030.f11532)) {
                    m14587(abstractActivityC5549, abstractC17043M38684, c5030, runnable);
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        new C22465(abstractActivityC5549, abstractC17043M38684, c5030, runnable).m22250();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m14588(C19561 c19561) {
        Set set = (Set) C7480.stream(new C24925(c19561.m44469()).m7180("lib/")).filter(new C5364(1)).map(new C9053(0)).collect(C24205.toSet());
        for (String str : Build.SUPPORTED_ABIS) {
            if (set.contains(str)) {
                return C6988.m16053("lib/", str, "/");
            }
        }
        return C10965.m25286(new StringBuilder("lib/"), Build.SUPPORTED_ABIS[0], "/");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14587(final AbstractActivityC5549 abstractActivityC5549, final AbstractC17043 abstractC17043, C5030 c5030, final Runnable runnable) {
        if (!C4359.f9761) {
            new C11065(abstractActivityC5549, abstractC17043, c5030, runnable).m22250();
            return;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19782(0, runnable));
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        final C11736 c11736 = new C11736();
        final C17769 c17769 = new C17769(dialogInterfaceC2564M46732, abstractActivityC5549, c11736, runnable);
        abstractActivityC5549.getLifecycle().mo21806(c17769);
        dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ܿ᩸ۢ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                abstractActivityC5549.getLifecycle().mo21807(c17769);
            }
        });
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩸ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11736 c11737 = c11736;
                if (c11737.m26940()) {
                    if (c11737.f32775) {
                        return;
                    }
                    c11737.f32775 = true;
                    dialogInterfaceC2564M46732.dismiss();
                    ServiceC24495.m53994();
                    C4359.m9007();
                    runnable.run();
                    return;
                }
                C21898.m49403(abstractActivityC5549, abstractC17043, "bin.mt.termex");
            }
        });
        C21898.f68876.m4066(dialogInterfaceC2564M46732, new InterfaceC3326() { // from class: l.᩻᩸ۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C11736 c11737 = c11736;
                if (!c11737.m26940() || c11737.f32775) {
                    return;
                }
                c11737.f32775 = true;
                dialogInterfaceC2564M46732.dismiss();
                ServiceC24495.m53994();
                C4359.m9007();
                runnable.run();
            }
        });
        C21898.m49403(abstractActivityC5549, abstractC17043, "bin.mt.termex");
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: ֫ */
    public static void m14583(C9543 c9543) throws Throwable {
        C19561 c19561;
        C19561 c19562 = null;
        try {
            String str = c9543.f26243;
            String str2 = c9543.f26238;
            if (str == null) {
                c19561 = new C19561(str2);
                try {
                    String strM14589 = m14589(c19561);
                    c9543.f26243 = strM14589;
                    str = strM14589;
                    c19562 = c19561;
                } catch (Throwable th) {
                    th = th;
                    C2700.m4192(c19561);
                    throw th;
                }
            }
            AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("term/.exhash");
            if (abstractC17043M38684.mo25093()) {
                try {
                    if (abstractC17043M38684.m38647().equals(str)) {
                        C2700.m4192(c19562);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c19562 == null) {
                c19562 = new C19561(str2);
            }
            m14585(c19562, str);
            C2700.m4192(c19562);
        } catch (Throwable th2) {
            th = th2;
            c19561 = c19562;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14585(C19561 c19561, String str) throws ErrnoException {
        String strSubstring;
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("term");
        HashSet<String> hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM25286 = C10965.m25286(new StringBuilder(), m14588(c19561), "lib/");
        for (C5738 c5738 : c19561.m44453()) {
            String name = c5738.getName();
            if (name.startsWith("assets/")) {
                strSubstring = name.substring(7);
            } else if (name.startsWith(strM25286)) {
                strSubstring = name.substring(strM25286.length() - 4);
            }
            linkedHashMap.put(strSubstring, c5738);
            int iIndexOf = strSubstring.indexOf(47);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            hashSet.add(strSubstring);
        }
        for (String str2 : hashSet) {
            abstractC17043M38684.m38684(str2).mo25503();
            System.out.println(">> Delete: " + str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strM38720 = (String) entry.getKey();
            C5738 c5739 = (C5738) entry.getValue();
            if (strM38720.endsWith(".rename")) {
                strM38720 = C17073.m38720(7, 0, strM38720);
            } else if (strM38720.endsWith(".link")) {
                String strM38721 = C17073.m38720(5, 0, strM38720);
                String strTrim = new String(c19561.m44452(c5739, (C20689) null), StandardCharsets.UTF_8).trim();
                if (strTrim.startsWith("-n ")) {
                    strTrim = strTrim.substring(3);
                }
                Os.symlink(strTrim, abstractC17043M38684.m38684(strM38721).mo25495());
                System.out.println(">> Symlink: " + strM38721 + " > " + strTrim);
            }
            System.out.println(">> Extract: " + strM38720);
            AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684(strM38720);
            if (c5739.isDirectory()) {
                abstractC17043M38685.m38666();
            } else {
                abstractC17043M38685.m38651(c19561.m44448(c5739));
            }
        }
        if (str != null) {
            abstractC17043M38684.m38684(".exhash").m38668(str);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m14589(C19561 c19561) {
        MessageDigest messageDigestM36660 = C16111.m36660();
        String strM25286 = C10965.m25286(new StringBuilder(), m14588(c19561), "lib/");
        byte[] bArr = new byte[4];
        for (C5738 c5738 : c19561.m44453()) {
            String name = c5738.getName();
            if (name.startsWith("assets/") || name.startsWith(strM25286)) {
                C16111.m36662(messageDigestM36660, name);
                if (c5738.isDirectory()) {
                    C17548.m39930(0, 123456, bArr);
                } else {
                    C17548.m39930(0, c5738.m12763(), bArr);
                }
                messageDigestM36660.update(bArr);
            }
        }
        return C16111.m36665(messageDigestM36660.digest());
    }
}
