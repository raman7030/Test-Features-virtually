package p067l;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ܰ᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class JobServiceEngineC1541 extends JobServiceEngine {

    /* JADX INFO: renamed from: ֫ */
    public final Object f45651;

    /* JADX INFO: renamed from: ۧ */
    public JobParameters f45652;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractServiceC1398 f45653;

    public JobServiceEngineC1541(AbstractServiceC1398 abstractServiceC1398) {
        super(abstractServiceC1398);
        this.f45651 = new Object();
        this.f45653 = abstractServiceC1398;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IBinder m35833() {
        return getBinder();
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f45652 = jobParameters;
        this.f45653.m29847(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC1471 asyncTaskC1471 = this.f45653.f36651;
        if (asyncTaskC1471 != null) {
            asyncTaskC1471.cancel(false);
        }
        synchronized (this.f45651) {
            this.f45652 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1996 m35834() {
        synchronized (this.f45651) {
            JobParameters jobParameters = this.f45652;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
            if (jobWorkItemDequeueWork == null) {
                return null;
            }
            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f45653.getClassLoader());
            return new C1996(this, jobWorkItemDequeueWork);
        }
    }
}
