package p067l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ۢܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJ0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC11556 extends ActivityC9732 {

    /* JADX INFO: renamed from: ᩸ */
    public static final C7350 f32213 = new C7350();

    @Override // p067l.ActivityC9732, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        f32213.mo4062(Long.valueOf(SystemClock.uptimeMillis()));
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        startActivity(intent);
    }
}
