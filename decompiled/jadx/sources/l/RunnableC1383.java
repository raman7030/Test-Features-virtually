package l;

import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: l.֨᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1383 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f5019;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21451 f5020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f5021;

    public RunnableC1383(C21451 c21451, Activity activity, Bundle bundle) {
        this.f5020 = c21451;
        this.f5021 = activity;
        this.f5019 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C21845.m49233(this.f5020, this.f5021, this.f5019);
        } catch (MalformedURLException | SocketTimeoutException | IOException | C8439 | C15493 | JSONException | Exception unused) {
        }
    }
}
