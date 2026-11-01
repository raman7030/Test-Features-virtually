package p067l;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩺᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes.dex */
public final class C1996 implements InterfaceC1436 {

    /* JADX INFO: renamed from: ֫ */
    public final JobWorkItem f77490;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ JobServiceEngineC1541 f77491;

    public C1996(JobServiceEngineC1541 jobServiceEngineC1541, JobWorkItem jobWorkItem) {
        this.f77491 = jobServiceEngineC1541;
        this.f77490 = jobWorkItem;
    }

    @Override // p067l.InterfaceC1436
    public final Intent getIntent() {
        return this.f77490.getIntent();
    }

    @Override // p067l.InterfaceC1436
    /* JADX INFO: renamed from: ֫ */
    public final void mo19555() {
        synchronized (this.f77491.f45651) {
            JobParameters jobParameters = this.f77491.f45652;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f77490);
            }
        }
    }
}
