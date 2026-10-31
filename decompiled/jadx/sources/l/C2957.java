package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.s3.model.ListObjectsRequest;

/* JADX INFO: renamed from: l.ۗۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2957 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f9392;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12834 f9393;

    public C2957(AbstractActivityC3346 abstractActivityC3346, C12834 c12834) {
        this.f9392 = abstractActivityC3346;
        this.f9393 = c12834;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f9392, R.string.MT_Protector);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C12834 c12834 = this.f9393;
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(new BasicAWSCredentials(c12834.f38539, c12834.f38541));
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        String strM31207 = C12834.m31207(c12834.f38544, clientConfiguration);
        C1545 c1545 = new C1545(staticCredentialsProvider, clientConfiguration);
        c1545.mo157(strM31207);
        c1545.m5292(c12834.f38543);
        c1545.m448(new ListObjectsRequest(c12834.f38540, "", "", "", 10));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f9392.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
