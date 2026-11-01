package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11194 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f31076;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ RunnableC3319 f31077;

    /* JADX INFO: renamed from: ܳ */
    public boolean f31078 = false;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f31079;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C10523 f31080;

    public C11194(C10523 c10523, boolean z, boolean z2, RunnableC3319 runnableC3319) {
        this.f31080 = c10523;
        this.f31079 = z;
        this.f31076 = z2;
        this.f31077 = runnableC3319;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f31080.f29129.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C13102 c13102M33654;
        C10523 c10523 = this.f31080;
        int iM3507 = c10523.f29127.m3507();
        int iM3505 = c10523.f29127.m3505();
        Iterator it = c10523.f29128.iterator();
        while (it.hasNext()) {
            C11450 c11450 = (C11450) ((InterfaceC19370) it.next());
            this.f26234.m33953(c11450.getName());
            if (c11450.m26448()) {
                throw new IOException("Unable to chown '" + c11450.getPath() + "': Unsupported operation");
            }
            String path = c11450.getPath();
            AbstractC17043 abstractC17043M42109 = C18524.m42109(path, new String[0]);
            if ((abstractC17043M42109 instanceof C14717) && (c13102M33654 = ((C14717) abstractC17043M42109).m33654()) != null) {
                path = c13102M33654.mo25505();
            }
            C21759.m49048(path, iM3507, iM3505, this.f31079, this.f31076);
            c11450.m26441(c11450.mo26440().m41061(iM3507, iM3505));
            this.f31078 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f31077.run();
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f31078) {
            this.f31077.run();
        }
        this.f31080.f29129.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
