package l;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes.dex */
public final class C23271 implements InterfaceC11983 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JobWorkItem f74746;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JobServiceEngineC14098 f74747;

    public C23271(JobServiceEngineC14098 jobServiceEngineC14098, JobWorkItem jobWorkItem) {
        this.f74747 = jobServiceEngineC14098;
        this.f74746 = jobWorkItem;
    }

    @Override // l.InterfaceC11983
    public final Intent getIntent() {
        return this.f74746.getIntent();
    }

    @Override // l.InterfaceC11983
    /* JADX INFO: renamed from: ֫ */
    public final void mo17615() {
        synchronized (this.f74747.f42565) {
            JobParameters jobParameters = this.f74747.f42566;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f74746);
            }
        }
    }
}
