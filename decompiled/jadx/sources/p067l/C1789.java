package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩵ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C1789 implements InterfaceC0879 {

    /* JADX INFO: renamed from: ֫ */
    public final MediaBrowser f63396;

    /* JADX INFO: renamed from: ۧ */
    public Messenger f63398;

    /* JADX INFO: renamed from: ܳ */
    public final Bundle f63399;

    /* JADX INFO: renamed from: ܽ */
    public final Context f63400;

    /* JADX INFO: renamed from: ܿ */
    public C1560 f63401;

    /* JADX INFO: renamed from: ᩻ */
    public C1929 f63403;

    /* JADX INFO: renamed from: ᩳ */
    public final HandlerC1264 f63402 = new HandlerC1264(this);

    /* JADX INFO: renamed from: ۜ */
    public final C0977 f63397 = new C0977();

    @Override // p067l.InterfaceC0879
    /* JADX INFO: renamed from: ֫ */
    public final void mo5222() {
    }

    @Override // p067l.InterfaceC0879
    /* JADX INFO: renamed from: ۧ */
    public final void mo5224() {
    }

    public C1789(Context context, ComponentName componentName, C0949 c0949) {
        this.f63400 = context;
        Bundle bundle = new Bundle();
        this.f63399 = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c0949.f9945 = this;
        this.f63396 = new MediaBrowser(context, componentName, c0949.f9944, bundle);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1560 m46315() {
        if (this.f63401 == null) {
            this.f63401 = C1560.m36709(this.f63396.getSessionToken(), null);
        }
        return this.f63401;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46317() {
        MediaBrowser mediaBrowser = this.f63396;
        try {
            Bundle extras = mediaBrowser.getExtras();
            if (extras == null) {
                return;
            }
            extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.f63403 = new C1929(binder, this.f63399);
                HandlerC1264 handlerC1264 = this.f63402;
                Messenger messenger = new Messenger(handlerC1264);
                this.f63398 = messenger;
                handlerC1264.m24177(messenger);
                try {
                    this.f63403.m51682(this.f63400, this.f63398);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC0952 interfaceC0952M24244 = AbstractBinderC1267.m24244(extras.getBinder("extra_session_binder"));
            if (interfaceC0952M24244 != null) {
                this.f63401 = C1560.m36709(mediaBrowser.getSessionToken(), interfaceC0952M24244);
            }
        } catch (IllegalStateException unused2) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m46316() {
        this.f63403 = null;
        this.f63398 = null;
        this.f63401 = null;
        this.f63402.m24177(null);
    }

    @Override // p067l.InterfaceC0879
    /* JADX INFO: renamed from: ֫ */
    public final void mo5223(Messenger messenger, String str, Bundle bundle) {
        if (this.f63398 != messenger) {
            return;
        }
        C1824 c1824 = (C1824) this.f63397.getOrDefault(str, null);
        if (c1824 == null) {
            int i = C1439.f39043;
        } else {
            c1824.m47857(bundle);
        }
    }
}
