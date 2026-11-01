package p067l;

import android.media.session.MediaSession;
import android.os.RemoteCallbackList;

/* JADX INFO: renamed from: l.۫֫ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public class C1442 implements InterfaceC0987 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1057 f39156;

    /* JADX INFO: renamed from: ۜ */
    public final MediaSession f39157;

    /* JADX INFO: renamed from: ܳ */
    public C1805 f39159;

    /* JADX INFO: renamed from: ܽ */
    public final BinderC1477 f39160;

    /* JADX INFO: renamed from: ܿ */
    public C1372 f39161;

    /* JADX INFO: renamed from: ᩷ */
    public final C1560 f39163;

    /* JADX INFO: renamed from: ᩻ */
    public C22636 f39164;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f39162 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public final RemoteCallbackList f39158 = new RemoteCallbackList();

    public C1442(ServiceC6328 serviceC6328) {
        MediaSession mediaSessionMo31531 = mo31531(serviceC6328);
        this.f39157 = mediaSessionMo31531;
        BinderC1477 binderC1477 = new BinderC1477(this);
        this.f39160 = binderC1477;
        this.f39163 = new C1560(mediaSessionMo31531.getSessionToken(), binderC1477);
        mediaSessionMo31531.setFlags(3);
    }

    /* JADX INFO: renamed from: ֫ */
    public MediaSession mo31531(ServiceC6328 serviceC6328) {
        return new MediaSession(serviceC6328, "MusicService");
    }

    @Override // p067l.InterfaceC0987
    /* JADX INFO: renamed from: ᩳ */
    public final C1805 mo10978() {
        return this.f39159;
    }

    @Override // p067l.InterfaceC0987
    /* JADX INFO: renamed from: ֫ */
    public void mo10976(C22636 c22636) {
        synchronized (this.f39162) {
            this.f39164 = c22636;
        }
    }

    @Override // p067l.InterfaceC0987
    /* JADX INFO: renamed from: ۧ */
    public C22636 mo10977() {
        C22636 c22636;
        synchronized (this.f39162) {
            c22636 = this.f39164;
        }
        return c22636;
    }

    @Override // p067l.InterfaceC0987
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1057 mo10975() {
        AbstractC1057 abstractC1057;
        synchronized (this.f39162) {
            abstractC1057 = this.f39156;
        }
        return abstractC1057;
    }
}
