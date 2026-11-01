package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.p061s3.model.ListObjectsRequest;

/* JADX INFO: renamed from: l.ۗۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5179 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f12192;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C14566 f12193;

    public C5179(AbstractActivityC5549 abstractActivityC5549, C14566 c14566) {
        this.f12192 = abstractActivityC5549;
        this.f12193 = c14566;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f12192, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14566 c14566 = this.f12193;
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(new BasicAWSCredentials(c14566.f41581, c14566.f41583));
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        String strM33293 = C14566.m33293(c14566.f41586, clientConfiguration);
        C3837 c3837 = new C3837(staticCredentialsProvider, clientConfiguration);
        c3837.mo1324(strM33293);
        c3837.m7521(c14566.f41585);
        c3837.m1614(new ListObjectsRequest(c14566.f41582, "", "", "", 10));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f12192.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f26234.m33960()) {
            return;
        }
        m22249();
    }
}
