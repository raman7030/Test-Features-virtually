package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܿ */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1499 {

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ int f42720 = 0;

    /* JADX INFO: renamed from: ۛ */
    public static ExecutorC1079 f42714 = new ExecutorC1079(new ExecutorC1009());

    /* JADX INFO: renamed from: ۗ */
    public static int f42712 = -100;

    /* JADX INFO: renamed from: ۤ */
    public static C1037 f42715 = null;

    /* JADX INFO: renamed from: ۨ */
    public static C1037 f42716 = null;

    /* JADX INFO: renamed from: ۬ */
    public static Boolean f42718 = null;

    /* JADX INFO: renamed from: ۫ */
    public static boolean f42717 = false;

    /* JADX INFO: renamed from: ᩹ */
    public static final C1782 f42721 = new C1782();

    /* JADX INFO: renamed from: ᩶ */
    public static final Object f42719 = new Object();

    /* JADX INFO: renamed from: ۙ */
    public static final Object f42713 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public Context mo17342(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract View mo17343(int i);

    /* JADX INFO: renamed from: ֫ */
    public void mo17345() {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17347(Configuration configuration);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17348(View view);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17349(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17350(CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17352(C1326 c1326);

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo17356();

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo17357();

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo17360();

    /* JADX INFO: renamed from: ۡ */
    public abstract void mo17362();

    /* JADX INFO: renamed from: ۢ */
    public abstract void mo17363();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo17366(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo17367();

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo17368(int i);

    /* JADX INFO: renamed from: ܳ */
    public abstract AbstractC1360 mo17369();

    /* JADX INFO: renamed from: ܺ */
    public abstract void mo17371();

    /* JADX INFO: renamed from: ܽ */
    public Context mo17372() {
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo17373(int i);

    /* JADX INFO: renamed from: ܿ */
    public abstract MenuInflater mo17374();

    /* JADX INFO: renamed from: ܿ */
    public void mo17375(int i) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo17376() {
        return -100;
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo17377(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo17379();

    /* JADX INFO: renamed from: ᩻ */
    public abstract void mo17383();

    /* JADX INFO: renamed from: ܳ */
    public static void m34242(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f42712 != i) {
            f42712 = i;
            synchronized (f42719) {
                Iterator it = f42721.iterator();
                while (it.hasNext()) {
                    AbstractC1499 abstractC1499 = (AbstractC1499) ((WeakReference) it.next()).get();
                    if (abstractC1499 != null) {
                        abstractC1499.mo17367();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34237(C1037 c1037) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM34235 = m34235();
            if (objM34235 != null) {
                C1954.m52687(objM34235, C1919.m51393(c1037.m13900()));
                return;
            }
            return;
        }
        if (c1037.equals(f42715)) {
            return;
        }
        synchronized (f42719) {
            f42715 = c1037;
            Iterator it = f42721.iterator();
            while (it.hasNext()) {
                AbstractC1499 abstractC1499 = (AbstractC1499) ((WeakReference) it.next()).get();
                if (abstractC1499 != null) {
                    abstractC1499.mo17345();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static C1037 m34246() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM34235 = m34235();
            if (objM34235 != null) {
                return C1037.m13893(C1954.m52686(objM34235));
            }
        } else {
            C1037 c1037 = f42715;
            if (c1037 != null) {
                return c1037;
            }
        }
        return C1037.m13896();
    }

    /* JADX INFO: renamed from: ᩵ */
    public static int m34247() {
        return f42712;
    }

    /* JADX INFO: renamed from: ۚ */
    public static C1037 m34239() {
        return f42715;
    }

    /* JADX INFO: renamed from: ֨ */
    public static C1037 m34236() {
        return f42716;
    }

    /* JADX INFO: renamed from: ֡ */
    public static Object m34235() {
        Context contextMo17372;
        Iterator it = f42721.iterator();
        while (it.hasNext()) {
            AbstractC1499 abstractC1499 = (AbstractC1499) ((WeakReference) it.next()).get();
            if (abstractC1499 != null && (contextMo17372 = abstractC1499.mo17372()) != null) {
                return contextMo17372.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m34244(Context context) {
        if (f42718 == null) {
            try {
                int i = ServiceC1845.f68058;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC1845.class), Build.VERSION.SDK_INT >= 24 ? C1950.m52407() | 128 : 640).metaData;
                if (bundle != null) {
                    f42718 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f42718 = Boolean.FALSE;
            }
        }
        return f42718.booleanValue();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m34245(Context context) {
        if (m34244(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f42717) {
                    return;
                }
                f42714.execute(new RunnableC21169(1, context));
                return;
            }
            synchronized (f42713) {
                C1037 c1037 = f42715;
                if (c1037 == null) {
                    if (f42716 == null) {
                        f42716 = C1037.m13894(C1611.m38737(context));
                    }
                    if (f42716.m13898()) {
                    } else {
                        f42715 = f42716;
                    }
                } else if (!c1037.equals(f42716)) {
                    C1037 c1038 = f42715;
                    f42716 = c1038;
                    C1611.m38738(context, c1038.m13900());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34238(AbstractC1499 abstractC1499) {
        synchronized (f42719) {
            m34243(abstractC1499);
            f42721.add(new WeakReference(abstractC1499));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34241(AbstractC1499 abstractC1499) {
        synchronized (f42719) {
            m34243(abstractC1499);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34240(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m34246().m13898()) {
                    String strM38737 = C1611.m38737(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C1954.m52687(systemService, C1919.m51393(strM38737));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        f42717 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m34243(AbstractC1499 abstractC1499) {
        synchronized (f42719) {
            Iterator it = f42721.iterator();
            while (it.hasNext()) {
                AbstractC1499 abstractC14910 = (AbstractC1499) ((WeakReference) it.next()).get();
                if (abstractC14910 == abstractC1499 || abstractC14910 == null) {
                    it.remove();
                }
            }
        }
    }
}
