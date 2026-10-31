package l;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractServiceC11215 extends Service {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Object f33648 = new Object();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f33649 = new HashMap();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public JobServiceEngineC14098 f33650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f33651 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AsyncTaskC12688 f33652;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f33653;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC2042 f33654;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo23218(Intent intent);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27783(Application application, Intent intent) {
        ComponentName componentName = new ComponentName(application, (Class<?>) ServiceC8982.class);
        synchronized (f33648) {
            AbstractC2042 abstractC2042M27782 = m27782(application, componentName, true, 100);
            abstractC2042M27782.m6711(100);
            abstractC2042M27782.mo6712(intent);
        }
    }

    public AbstractServiceC11215() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33653 = null;
        } else {
            this.f33653 = new ArrayList();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33650 = new JobServiceEngineC14098(this);
            this.f33654 = null;
        } else {
            this.f33650 = null;
            this.f33654 = m27782(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f33653 == null) {
            return 2;
        }
        this.f33654.mo6714();
        synchronized (this.f33653) {
            ArrayList arrayList = this.f33653;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C6338(this, intent, i2));
            m27785(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC14098 jobServiceEngineC14098 = this.f33650;
        if (jobServiceEngineC14098 != null) {
            return jobServiceEngineC14098.m33707();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f33653;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33651 = true;
                this.f33654.mo6710();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2042 m27782(ContextWrapper contextWrapper, ComponentName componentName, boolean z, int i) {
        AbstractC2042 c10572;
        HashMap map = f33649;
        AbstractC2042 abstractC2042 = (AbstractC2042) map.get(componentName);
        if (abstractC2042 != null) {
            return abstractC2042;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c10572 = new C10572(contextWrapper, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c10572 = new C7749(contextWrapper, componentName, i);
        }
        map.put(componentName, c10572);
        return c10572;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27785(boolean z) {
        if (this.f33652 == null) {
            this.f33652 = new AsyncTaskC12688(this);
            AbstractC2042 abstractC2042 = this.f33654;
            if (abstractC2042 != null && z) {
                abstractC2042.mo6713();
            }
            this.f33652.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27784() {
        ArrayList arrayList = this.f33653;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33652 = null;
                ArrayList arrayList2 = this.f33653;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m27785(false);
                } else if (!this.f33651) {
                    this.f33654.mo6710();
                }
            }
        }
    }
}
