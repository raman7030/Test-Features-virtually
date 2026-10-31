package l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۢܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJ0 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC9667 extends ActivityC7747 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C5242 f29264 = new C5242();

    @Override // l.ActivityC7747, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        f29264.mo1664(Long.valueOf(SystemClock.uptimeMillis()));
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        startActivity(intent);
    }
}
