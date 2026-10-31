package l;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8V2 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9811 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f29648;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "MusicPlayerActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10239();
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("fromService", false);
        this.f29648 = booleanExtra;
        if (booleanExtra) {
            C6988 c6988M48041 = C21100.m48041();
            if (c6988M48041 == null || c6988M48041.f21578.mo15853()) {
                finish();
                return;
            }
            Main mainM36593 = C15528.m36593();
            if (mainM36593 != null && mainM36593.getLifecycle().mo19832().m33028(EnumC13728.STARTED) && C21100.m48037()) {
                finish();
                return;
            }
            if (C21100.m48037() && !ApplicationC20075.f65008.getBoolean("mbp", false) && C21100.m48037()) {
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
                if (!appTasks.isEmpty()) {
                    int size = appTasks.size();
                    for (int i = 0; i < size; i++) {
                        ActivityManager.AppTask appTask = appTasks.get(i);
                        if (ActivityC12210.m29697(appTask)) {
                            appTask.moveToFront();
                            finish();
                            return;
                        }
                    }
                }
            }
            new C21100(this);
            return;
        }
        if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction()) && "tool-music-player".equals(intent.getStringExtra("operation"))) {
            C21100.m48036(this);
            return;
        }
        C2608 c2608M8231 = C2608.m8231(this, "audio/");
        if (c2608M8231 == null) {
            finish();
            return;
        }
        C21100 c21100 = new C21100(this);
        C21100.m48023(c2608M8231.m8234(), c2608M8231.m8233(), c2608M8231.m8232());
        c21100.m48045();
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۙ */
    public final void mo120() {
        C13630.m32769();
        C12814.m31129();
        C14096.m33706(this);
        this.f10586 = C21943.m49431();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24844() {
        return this.f29648;
    }
}
