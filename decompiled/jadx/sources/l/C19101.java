package l;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C19101 implements InterfaceC0755 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaBrowser f60163;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Messenger f60165;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle f60166;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f60167;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14472 f60168;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21923 f60170;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HandlerC8517 f60169 = new HandlerC8517(this);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2727 f60164 = new C2727();

    @Override // l.InterfaceC0755
    /* JADX INFO: renamed from: ֫ */
    public final void mo2893() {
    }

    @Override // l.InterfaceC0755
    /* JADX INFO: renamed from: ۧ */
    public final void mo2895() {
    }

    public C19101(Context context, ComponentName componentName, C2167 c2167) {
        this.f60167 = context;
        Bundle bundle = new Bundle();
        this.f60166 = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c2167.f7160 = this;
        this.f60163 = new MediaBrowser(context, componentName, c2167.f7159, bundle);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14472 m44021() {
        if (this.f60168 == null) {
            this.f60168 = C14472.m34568(this.f60163.getSessionToken(), null);
        }
        return this.f60168;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44023() {
        MediaBrowser mediaBrowser = this.f60163;
        try {
            Bundle extras = mediaBrowser.getExtras();
            if (extras == null) {
                return;
            }
            extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.f60170 = new C21923(binder, this.f60166);
                HandlerC8517 handlerC8517 = this.f60169;
                Messenger messenger = new Messenger(handlerC8517);
                this.f60165 = messenger;
                handlerC8517.m22209(messenger);
                try {
                    this.f60170.m49345(this.f60167, this.f60165);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC2210 interfaceC2210M22275 = AbstractBinderC8560.m22275(extras.getBinder("extra_session_binder"));
            if (interfaceC2210M22275 != null) {
                this.f60168 = C14472.m34568(mediaBrowser.getSessionToken(), interfaceC2210M22275);
            }
        } catch (IllegalStateException unused2) {
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44022() {
        this.f60170 = null;
        this.f60165 = null;
        this.f60168 = null;
        this.f60169.m22209(null);
    }

    @Override // l.InterfaceC0755
    /* JADX INFO: renamed from: ֫ */
    public final void mo2894(Messenger messenger, String str, Bundle bundle) {
        if (this.f60165 != messenger) {
            return;
        }
        C19807 c19807 = (C19807) this.f60164.getOrDefault(str, null);
        if (c19807 == null) {
            int i = C12045.f36032;
        } else {
            c19807.m45546(bundle);
        }
    }
}
