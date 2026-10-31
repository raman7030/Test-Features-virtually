package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩻ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23774 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f76947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f76948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f76949;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16012 f76950;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f76951;

    public /* synthetic */ RunnableC23774(ActivityC16012 activityC16012, boolean z, Uri uri, ArrayList arrayList, AtomicBoolean atomicBoolean) {
        this.f76950 = activityC16012;
        this.f76951 = z;
        this.f76949 = uri;
        this.f76948 = arrayList;
        this.f76947 = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C2608 c2608M51938;
        ArrayList arrayList = this.f76948;
        int i = ActivityC16012.f49390;
        final ActivityC16012 activityC16012 = this.f76950;
        boolean z = this.f76951;
        Uri uri = this.f76949;
        final AtomicBoolean atomicBoolean = this.f76947;
        try {
            if (z) {
                C11003.requireNonNull(atomicBoolean);
                c2608M51938 = C23487.m51937(uri, arrayList, new C6841(atomicBoolean));
            } else {
                C11003.requireNonNull(atomicBoolean);
                c2608M51938 = C23487.m51938(uri, new C6841(atomicBoolean));
            }
            activityC16012.runOnUiThread(new Runnable() { // from class: l.ۨ۠ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC16012.m37825(activityC16012, atomicBoolean, c2608M51938);
                }
            });
        } catch (Exception e) {
            activityC16012.runOnUiThread(new RunnableC10882(activityC16012, atomicBoolean, e));
        }
    }
}
