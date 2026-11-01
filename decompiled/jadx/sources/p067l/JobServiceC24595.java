package p067l;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.᩻֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8R3 */
/* JADX INFO: loaded from: classes.dex */
public final class JobServiceC24595 extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM49452 = new C21914(extras.getInt("requirements")).m49452(this);
        if (iM49452 == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            C5792.m13001(this, new Intent(string).setPackage(string2));
            return false;
        }
        C21334.m48351("Requirements not met: " + iM49452);
        jobFinished(jobParameters, true);
        return false;
    }
}
