package p067l;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import bin.p000mt.plus.Main;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8V2 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11693 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f32599;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "MusicPlayerActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12275();
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("fromService", false);
        this.f32599 = booleanExtra;
        if (booleanExtra) {
            C9010 c9010M50371 = C22422.m50371();
            if (c9010M50371 == null || c9010M50371.f24458.mo17768()) {
                finish();
                return;
            }
            Main mainM38753 = C17127.m38753();
            if (mainM38753 != null && mainM38753.getLifecycle().mo21805().m35142(EnumC15415.STARTED) && C22422.m50367()) {
                finish();
                return;
            }
            if (C22422.m50367() && !ApplicationC21448.f67649.getBoolean("mbp", false) && C22422.m50367()) {
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
                if (!appTasks.isEmpty()) {
                    int size = appTasks.size();
                    for (int i = 0; i < size; i++) {
                        ActivityManager.AppTask appTask = appTasks.get(i);
                        if (ActivityC13973.m31759(appTask)) {
                            appTask.moveToFront();
                            finish();
                            return;
                        }
                    }
                }
            }
            new C22422(this);
            return;
        }
        if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction()) && "tool-music-player".equals(intent.getStringExtra("operation"))) {
            C22422.m50366(this);
            return;
        }
        C4847 c4847M10272 = C4847.m10272(this, "audio/");
        if (c4847M10272 == null) {
            finish();
            return;
        }
        C22422 c22422 = new C22422(this);
        C22422.m50353(c4847M10272.m10275(), c4847M10272.m10274(), c4847M10272.m10273());
        c22422.m50375();
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۙ */
    public final void mo118() {
        C15322.m34884();
        C1478.m33218();
        C15766.m35832(this);
        this.f13394 = C23223.m51768();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m26859() {
        return this.f32599;
    }
}
