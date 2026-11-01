package p067l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88LY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC18560 extends Service {

    /* JADX INFO: renamed from: ᩹ */
    public static final HashMap f55393 = new HashMap();

    /* JADX INFO: renamed from: ᩸ */
    public C19231 f55394;

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C13346 m42241();

    @Override // android.app.Service
    public final void onCreate() {
        C19231 c19231 = (C19231) f55393.get(getClass());
        if (c19231 == null) {
            m42241();
            throw null;
        }
        this.f55394 = c19231;
        c19231.m43803(this);
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    C21334.m48347("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra == null) {
                    C21334.m48347("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((C17889) intent.getParcelableExtra("download_request")) == null) {
                    C21334.m48347("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((C21914) intent.getParcelableExtra("requirements")) == null) {
                    C21334.m48347("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            default:
                C21334.m48347("Ignored unrecognized action: ".concat(action));
                throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f55394.m43804(this);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
