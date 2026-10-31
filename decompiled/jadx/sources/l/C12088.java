package l;

import android.media.session.MediaSession;
import android.os.RemoteCallbackList;

/* JADX INFO: renamed from: l.۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public class C12088 implements InterfaceC2916 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4327 f36145;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final MediaSession f36146;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19413 f36148;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BinderC12793 f36149;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10677 f36150;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14472 f36152;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21326 f36153;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f36151 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RemoteCallbackList f36147 = new RemoteCallbackList();

    public C12088(ServiceC4166 serviceC4166) {
        MediaSession mediaSessionMo29469 = mo29469(serviceC4166);
        this.f36146 = mediaSessionMo29469;
        BinderC12793 binderC12793 = new BinderC12793(this);
        this.f36149 = binderC12793;
        this.f36152 = new C14472(mediaSessionMo29469.getSessionToken(), binderC12793);
        mediaSessionMo29469.setFlags(3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MediaSession mo29469(ServiceC4166 serviceC4166) {
        return new MediaSession(serviceC4166, "MusicService");
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ᩳ */
    public final C19413 mo8910() {
        return this.f36148;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ֫ */
    public void mo8908(C21326 c21326) {
        synchronized (this.f36151) {
            this.f36153 = c21326;
        }
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ۧ */
    public C21326 mo8909() {
        C21326 c21326;
        synchronized (this.f36151) {
            c21326 = this.f36153;
        }
        return c21326;
    }

    @Override // l.InterfaceC2916
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4327 mo8907() {
        AbstractC4327 abstractC4327;
        synchronized (this.f36151) {
            abstractC4327 = this.f36145;
        }
        return abstractC4327;
    }
}
