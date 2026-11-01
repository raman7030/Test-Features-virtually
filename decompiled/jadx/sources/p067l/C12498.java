package p067l;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12498 {

    /* JADX INFO: renamed from: ܳ */
    public static C12498 f35033;

    /* JADX INFO: renamed from: ֫ */
    public final Executor f35034;

    /* JADX INFO: renamed from: ۧ */
    public boolean f35035;

    /* JADX INFO: renamed from: ܽ */
    public final CopyOnWriteArrayList f35036;

    /* JADX INFO: renamed from: ܿ */
    public int f35037;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f35038;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C12498 m28788(Context context) {
        if (f35033 == null) {
            f35033 = new C12498(context);
        }
        return f35033;
    }

    public C12498(final Context context) {
        Executor executorM29223 = C12710.m29223();
        this.f35034 = executorM29223;
        this.f35036 = new CopyOnWriteArrayList();
        this.f35038 = new Object();
        this.f35037 = 0;
        executorM29223.execute(new Runnable() { // from class: l.۫ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C3780(this), intentFilter);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28792() {
        int i;
        synchronized (this.f35038) {
            i = this.f35037;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28789(int i) {
        CopyOnWriteArrayList<C15297> copyOnWriteArrayList = this.f35036;
        for (C15297 c15297 : copyOnWriteArrayList) {
            if (c15297.m34832()) {
                copyOnWriteArrayList.remove(c15297);
            }
        }
        synchronized (this.f35038) {
            if (this.f35035 && this.f35037 == i) {
                return;
            }
            this.f35035 = true;
            this.f35037 = i;
            Iterator it = this.f35036.iterator();
            while (it.hasNext()) {
                ((C15297) it.next()).m34831();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28793(C12287 c12287, Executor executor) {
        boolean z;
        CopyOnWriteArrayList<C15297> copyOnWriteArrayList = this.f35036;
        for (C15297 c15297 : copyOnWriteArrayList) {
            if (c15297.m34832()) {
                copyOnWriteArrayList.remove(c15297);
            }
        }
        C15297 c15298 = new C15297(this, c12287, executor);
        synchronized (this.f35038) {
            this.f35036.add(c15298);
            z = this.f35035;
        }
        if (z) {
            c15298.m34831();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX INFO: renamed from: ֫ */
    public static void m28790(Context context, C12498 c12498) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i = type != 9 ? 8 : 7;
                    } else {
                        i = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            C7922.m18292(context, c12498);
        } else {
            c12498.m28789(i);
        }
    }
}
