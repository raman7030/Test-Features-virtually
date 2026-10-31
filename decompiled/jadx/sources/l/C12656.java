package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۫᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12656 implements InterfaceC5380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f38121;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f38122;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38123;

    public C12656(ActivityC17169 activityC17169, C6306 c6306, boolean z) {
        this.f38122 = c6306;
        this.f38121 = activityC17169;
        this.f38123 = z;
        if (c6306.f19514 == null) {
            C12366 c12366 = (C12366) ((C3764) new C4741(activityC17169).m13885(C3764.class)).m11419().m1662();
            C11003.requireNonNull(c12366);
            c6306.f19514 = c12366;
        }
        if (c6306.f19502 == null) {
            c6306.f19502 = (C12230) new C4741(activityC17169).m13885(C12230.class);
        }
    }

    @Override // l.InterfaceC5380
    public final String getTitle() {
        return this.f38122.mo14421();
    }

    @Override // l.InterfaceC5380
    /* JADX INFO: renamed from: ֫ */
    public final void mo3044() {
        if (this.f38122.f19523) {
            C12392 c12392 = this.f38122.f19506;
            m30935(c12392.m30436().toString());
            if (this.f38123) {
                this.f38122.f43260.putBoolean("changed", false);
                C6306 c6306 = this.f38122;
                c6306.m34239(c6306.f19514.m36268());
                InterfaceC18581 interfaceC18581Mo17431 = this.f38122.mo17431();
                if (interfaceC18581Mo17431 != null) {
                    C15477 c15477 = (C15477) interfaceC18581Mo17431;
                    c15477.mo9498();
                    c15477.mo9497();
                }
            }
            c12392.m30470();
            return;
        }
        this.f38122.f19502.m29734();
        C6306 c6307 = this.f38122;
        C11005 c11005M34233 = c6307.m34233(c6307.f19514.m36268());
        C12951 c12951M31485 = C12951.m31485(c11005M34233.m27337());
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253409);
        int i = c12951M31485.readInt();
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253409);
        if (i == this.f38122.f19514.m30062(this.f38122.m17420())) {
            C6306 c6308 = this.f38122;
            m30935(C6748.m18370(c12951M31485, c6308.m34236(c6308.f19514.m36268()).m27340()));
        } else {
            m30935(this.f38122.f19514.m30052(this.f38122.m17420()));
        }
        if (this.f38123) {
            this.f38122.f43260.putBoolean("changed", false);
            C6306 c6309 = this.f38122;
            c6309.m34239(c6309.f19514.m36268());
            C6748.m18368(c12951M31485);
            C15972.m37746(4, this.f38122.f19514.m30062(this.f38122.m17420()), c12951M31485.f38849);
            synchronized (this.f38122) {
                byte[] bArr = c12951M31485.f38849;
                int i2 = C3878.f12396;
                c11005M34233.m27332(C3878.m11707(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30935(String str) throws Exception {
        C6306 c6306 = this.f38122;
        C19562 c19562M30045 = c6306.f19514.m30045(c6306.f19514.m30076(c6306.m17420()));
        if (C9684.m24627(str, c19562M30045.m44986(), c19562M30045) == null) {
            throw new Exception("Unknown error");
        }
        c6306.f19514.m30056(c6306.m17420(), str);
    }

    @Override // l.InterfaceC5380
    /* JADX INFO: renamed from: ֫ */
    public final Exception mo3043(Exception exc) {
        C6306 c6306 = this.f38122;
        if (!c6306.f19523) {
            return exc instanceof C14658 ? new C1783(c6306.m17420(), (C14658) exc) : exc;
        }
        ActivityC17169 activityC17169 = this.f38121;
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C14658) {
            C14658 c14658 = (C14658) exc;
            activityC17169.m40358();
            C19287 c19287M44466 = C19287.m44466(c14658.f44794, c14658.f44798);
            c19287M44466.f60678 = false;
            activityC17169.m40343(c6306.m17420(), c19287M44466);
            c6306.f19514.m30026(c6306.m17420());
        }
        return null;
    }
}
