package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۗ */
/* JADX INFO: compiled from: 63RK */
/* JADX INFO: loaded from: classes4.dex */
public final class C1654 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile ArrayList f53522;

    /* JADX INFO: renamed from: ۧ */
    public static volatile AbstractC1374 f53523;

    /* JADX INFO: renamed from: ֫ */
    public static void m40726(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            C21459.m48619(context.getSystemService(C19158.m43631())).reportShortcutUsed(str);
        }
        for (AbstractC1411 abstractC1411 : (ArrayList) m40734(context)) {
            Collections.singletonList(str);
            abstractC1411.getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40729(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        abstractActivityC5549.getClass();
        List listM40725 = m40725(arrayList);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = (ArrayList) listM40725;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C1201) it.next()).m21284());
            }
            if (!((ShortcutManager) abstractActivityC5549.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
                return false;
            }
        }
        m40737(abstractActivityC5549).getClass();
        m40737(abstractActivityC5549).getClass();
        Iterator it2 = ((ArrayList) m40734(abstractActivityC5549)).iterator();
        while (it2.hasNext()) {
            ((AbstractC1411) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m40730(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return C21459.m48619(context.getSystemService(C19158.m43631())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m40731(Context context, C1201 c1201) {
        context.getClass();
        c1201.getClass();
        int i = Build.VERSION.SDK_INT;
        int iM40730 = m40730(context);
        if (iM40730 != 0) {
            if (i <= 29) {
                m40728(context, c1201);
            }
            String str = null;
            int i2 = -1;
            if (i >= 30) {
                C21459.m48619(context.getSystemService(C19158.m43631())).pushDynamicShortcut(c1201.m21284());
            } else if (i >= 25) {
                ShortcutManager shortcutManagerM48619 = C21459.m48619(context.getSystemService(C19158.m43631()));
                if (!shortcutManagerM48619.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManagerM48619.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= iM40730) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManagerM48619.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManagerM48619.addDynamicShortcuts(Arrays.asList(c1201.m21284()));
                }
            }
            try {
                m40737(context).getClass();
                ArrayList<C1201> arrayList = new ArrayList();
                if (arrayList.size() >= iM40730) {
                    for (C1201 c1202 : arrayList) {
                        int i3 = c1202.f25024;
                        if (i3 > i2) {
                            str = c1202.f25035;
                            i2 = i3;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(c1201);
                return true;
            } catch (Exception unused) {
                return false;
            } finally {
                for (AbstractC1411 abstractC1411 : (ArrayList) m40734(context)) {
                    Collections.singletonList(c1201);
                    abstractC1411.getClass();
                }
                m40726(context, c1201.f25035);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m40733(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C21459.m48619(context.getSystemService(C19158.m43631())).isRequestPinShortcutSupported();
        }
        if (C0886.m5543(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m40735(Context context, C1201 c1201) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            c1201.getClass();
        }
        if (i >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c1201.m21284(), null);
        }
        if (!m40733(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = c1201.f25025;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c1201.f25034.toString());
        C1073 c1073 = c1201.f25029;
        if (c1073 != null) {
            c1073.m15506(intent, (Drawable) null, c1201.f25031);
        }
        context.sendBroadcast(intent);
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public static List m40736(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C1201.m21280(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
            return C1201.m21280(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m40724(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1516(context, it.next()).m34771());
            }
            return arrayList;
        }
        try {
            m40737(context).getClass();
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m40732(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        List listM40725 = m40725(arrayList);
        if (Build.VERSION.SDK_INT <= 29) {
            for (C1201 c1201 : new ArrayList(listM40725)) {
                if (!m40728(abstractActivityC5549, c1201)) {
                    ((ArrayList) listM40725).remove(c1201);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) listM40725).iterator();
            while (it.hasNext()) {
                arrayList2.add(((C1201) it.next()).m21284());
            }
            if (!((ShortcutManager) abstractActivityC5549.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return false;
            }
        }
        m40737(abstractActivityC5549).getClass();
        Iterator it2 = ((ArrayList) m40734(abstractActivityC5549)).iterator();
        while (it2.hasNext()) {
            ((AbstractC1411) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40728(Context context, C1201 c1201) {
        Bitmap bitmapDecodeStream;
        C1073 c1073M15503;
        C1073 c1073 = c1201.f25029;
        if (c1073 == null) {
            return false;
        }
        int i = c1073.f17601;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamM15505 = c1073.m15505(context);
        if (inputStreamM15505 == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM15505)) == null) {
            return false;
        }
        if (i == 6) {
            c1073M15503 = C1073.m15501(bitmapDecodeStream);
        } else {
            c1073M15503 = C1073.m15503(bitmapDecodeStream);
        }
        c1201.f25029 = c1073M15503;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40727(AbstractActivityC5549 abstractActivityC5549, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) abstractActivityC5549.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m40737(abstractActivityC5549).getClass();
        Iterator it = ((ArrayList) m40734(abstractActivityC5549)).iterator();
        while (it.hasNext()) {
            ((AbstractC1411) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC1374 m40737(Context context) {
        if (f53523 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f53523 = (AbstractC1374) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C1654.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f53523 == null) {
                f53523 = new C0919();
            }
        }
        return f53523;
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m40734(Context context) {
        Bundle bundle;
        String string;
        if (f53522 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC1411) Class.forName(string, false, C1654.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f53522 == null) {
                f53522 = arrayList;
            }
        }
        return f53522;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m40725(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1201) it.next()).getClass();
        }
        return arrayList2;
    }
}
