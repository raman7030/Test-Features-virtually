package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩻ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24963 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AtomicBoolean f79700;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ArrayList f79701;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Uri f79702;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC17586 f79703;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f79704;

    public /* synthetic */ RunnableC24963(ActivityC17586 activityC17586, boolean z, Uri uri, ArrayList arrayList, AtomicBoolean atomicBoolean) {
        this.f79703 = activityC17586;
        this.f79704 = z;
        this.f79702 = uri;
        this.f79701 = arrayList;
        this.f79700 = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C4847 c4847M54340;
        ArrayList arrayList = this.f79701;
        int i = ActivityC17586.f52553;
        final ActivityC17586 activityC17586 = this.f79703;
        boolean z = this.f79704;
        Uri uri = this.f79702;
        final AtomicBoolean atomicBoolean = this.f79700;
        try {
            if (z) {
                C12826.requireNonNull(atomicBoolean);
                c4847M54340 = C24690.m54339(uri, arrayList, new C8870(atomicBoolean));
            } else {
                C12826.requireNonNull(atomicBoolean);
                c4847M54340 = C24690.m54340(uri, new C8870(atomicBoolean));
            }
            activityC17586.runOnUiThread(new Runnable() { // from class: l.ۨ۠ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17586.m40011(activityC17586, atomicBoolean, c4847M54340);
                }
            });
        } catch (Exception e) {
            activityC17586.runOnUiThread(new RunnableC12711(activityC17586, atomicBoolean, e));
        }
    }
}
