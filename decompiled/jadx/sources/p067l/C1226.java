package p067l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: renamed from: l.۟᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1226 extends AbstractC0943 {

    /* JADX INFO: renamed from: ܿ */
    public final JobScheduler f26885;

    /* JADX INFO: renamed from: ᩳ */
    public final JobInfo f26886;

    public C1226(ContextWrapper contextWrapper, ComponentName componentName, int i) {
        super(componentName);
        m8837(i);
        this.f26886 = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.f26885 = (JobScheduler) contextWrapper.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // p067l.AbstractC0943
    /* JADX INFO: renamed from: ֫ */
    public final void mo8838(Intent intent) {
        this.f26885.enqueue(this.f26886, new JobWorkItem(intent));
    }
}
