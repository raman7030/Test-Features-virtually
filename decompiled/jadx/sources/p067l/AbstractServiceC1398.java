package p067l;

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

/* JADX INFO: renamed from: l.ۧ᩶ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractServiceC1398 extends Service {

    /* JADX INFO: renamed from: ۫ */
    public static final Object f36647 = new Object();

    /* JADX INFO: renamed from: ۬ */
    public static final HashMap f36648 = new HashMap();

    /* JADX INFO: renamed from: ۗ */
    public JobServiceEngineC1541 f36649;

    /* JADX INFO: renamed from: ۙ */
    public boolean f36650 = false;

    /* JADX INFO: renamed from: ᩶ */
    public AsyncTaskC1471 f36651;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f36652;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC0943 f36653;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo25162(Intent intent);

    /* JADX INFO: renamed from: ֫ */
    public static void m29845(Application application, Intent intent) {
        ComponentName componentName = new ComponentName(application, (Class<?>) ServiceC10905.class);
        synchronized (f36647) {
            AbstractC0943 abstractC0943M29844 = m29844(application, componentName, true, 100);
            abstractC0943M29844.m8837(100);
            abstractC0943M29844.mo8838(intent);
        }
    }

    public AbstractServiceC1398() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36652 = null;
        } else {
            this.f36652 = new ArrayList();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36649 = new JobServiceEngineC1541(this);
            this.f36653 = null;
        } else {
            this.f36649 = null;
            this.f36653 = m29844(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f36652 == null) {
            return 2;
        }
        this.f36653.mo8840();
        synchronized (this.f36652) {
            ArrayList arrayList = this.f36652;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C1156(this, intent, i2));
            m29847(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC1541 jobServiceEngineC1541 = this.f36649;
        if (jobServiceEngineC1541 != null) {
            return jobServiceEngineC1541.m35833();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f36652;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f36650 = true;
                this.f36653.mo8836();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC0943 m29844(ContextWrapper contextWrapper, ComponentName componentName, boolean z, int i) {
        AbstractC0943 c1366;
        HashMap map = f36648;
        AbstractC0943 abstractC0943 = (AbstractC0943) map.get(componentName);
        if (abstractC0943 != null) {
            return abstractC0943;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c1366 = new C1366(contextWrapper, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c1366 = new C1226(contextWrapper, componentName, i);
        }
        map.put(componentName, c1366);
        return c1366;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29847(boolean z) {
        if (this.f36651 == null) {
            this.f36651 = new AsyncTaskC1471(this);
            AbstractC0943 abstractC0943 = this.f36653;
            if (abstractC0943 != null && z) {
                abstractC0943.mo8839();
            }
            this.f36651.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29846() {
        ArrayList arrayList = this.f36652;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f36651 = null;
                ArrayList arrayList2 = this.f36652;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m29847(false);
                } else if (!this.f36650) {
                    this.f36653.mo8836();
                }
            }
        }
    }
}
