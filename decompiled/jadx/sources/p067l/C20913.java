package p067l;

import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20913 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ HashSet f65673;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC22924 f65674;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f65675;

    public C20913(ViewOnClickListenerC22924 viewOnClickListenerC22924, String str, HashSet hashSet) {
        this.f65674 = viewOnClickListenerC22924;
        this.f65675 = str;
        this.f65673 = hashSet;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243((AbstractActivityC5549) this.f65674.requireActivity(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C10844 c10844 = new C10844(this.f65675);
        try {
            C15230 c15230 = new C15230(new BufferedOutputStream(c10844.m24981()));
            for (String str : this.f65673) {
                c10844.m24986(str + ".xml");
                c15230.write(this.f65674.f72135.m47152(str));
                c15230.flush();
            }
            c10844.close();
        } catch (Throwable th) {
            try {
                c10844.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f65674.f72130.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
