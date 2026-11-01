package p067l;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: l.֨᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3683 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Bundle f7791;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22755 f7792;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Activity f7793;

    public RunnableC3683(C22755 c22755, Activity activity, Bundle bundle) {
        this.f7792 = c22755;
        this.f7793 = activity;
        this.f7791 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C23130.m51584(this.f7792, this.f7793, this.f7791);
        } catch (MalformedURLException | SocketTimeoutException | IOException | C10389 | C17093 | JSONException | Exception unused) {
        }
    }
}
