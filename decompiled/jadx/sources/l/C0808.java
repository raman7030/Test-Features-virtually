package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0808 implements InterfaceC5380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ActivityC17169 f2946;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f2947;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2948;

    public C0808(ActivityC17169 activityC17169, C7864 c7864, boolean z) {
        this.f2947 = c7864;
        this.f2946 = activityC17169;
        this.f2948 = z;
        if (c7864.f24368 == null) {
            C19452 c19452 = (C19452) ((C3764) new C4741(activityC17169).m13885(C3764.class)).m11411().m1662();
            C11003.requireNonNull(c19452);
            c7864.f24368 = c19452;
        }
        if (c7864.f24372 == null) {
            c7864.f24372 = (C12230) new C4741(activityC17169).m13885(C12230.class);
        }
    }

    @Override // l.InterfaceC5380
    public final String getTitle() {
        return this.f2947.mo14421();
    }

    @Override // l.InterfaceC5380
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3044() {
        if (this.f2947.f24385) {
            C12392 c12392 = this.f2947.f24374;
            m3042(c12392.m30436().toString());
            if (this.f2948) {
                this.f2947.f43260.putBoolean("changed", false);
                C7864 c7864 = this.f2947;
                c7864.m34239(c7864.f24368.m36268());
                InterfaceC18581 interfaceC18581Mo17431 = this.f2947.mo17431();
                if (interfaceC18581Mo17431 != null) {
                    C8570 c8570 = (C8570) interfaceC18581Mo17431;
                    c8570.mo9498();
                    c8570.mo9497();
                }
            }
            c12392.m30470();
            return;
        }
        this.f2947.f24372.m29734();
        C7864 c7865 = this.f2947;
        C11005 c11005M34233 = c7865.m34233(c7865.f24368.m36268());
        C12951 c12951M31485 = C12951.m31485(c11005M34233.m27337());
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253410);
        int i = c12951M31485.readInt();
        C22124.m49722((InterfaceC20008) c12951M31485, 1382253410);
        if (i == this.f2947.f24368.m44835(this.f2947.m21123())) {
            C7864 c7866 = this.f2947;
            m3042(C6748.m18370(c12951M31485, c7866.m34236(c7866.f24368.m36268()).m27340()));
        } else {
            m3042(this.f2947.f24368.m44856(this.f2947.m21123()));
        }
        if (this.f2948) {
            this.f2947.f43260.putBoolean("changed", false);
            C7864 c7867 = this.f2947;
            c7867.m34239(c7867.f24368.m36268());
            C6748.m18368(c12951M31485);
            C15972.m37746(4, this.f2947.f24368.m44835(this.f2947.m21123()), c12951M31485.f38849);
            synchronized (this.f2947) {
                byte[] bArr = c12951M31485.f38849;
                int i2 = C3878.f12396;
                c11005M34233.m27332(C3878.m11707(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3042(String str) throws IOException {
        C7864 c7864 = this.f2947;
        String strM21123 = c7864.m21123();
        c7864.f24368.m44849(strM21123, str);
        if (strM21123.endsWith("package-info") || strM21123.endsWith("type-info")) {
            this.f2946.m40369().m11400();
        }
    }

    @Override // l.InterfaceC5380
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Exception mo3043(Exception exc) {
        int iM38634;
        C7864 c7864 = this.f2947;
        if (!c7864.f24385) {
            return exc instanceof C1580 ? new C5672(c7864.m21123(), (C1580) exc) : exc;
        }
        this.f2946.m10223(exc, (DialogInterface.OnDismissListener) null);
        if ((exc instanceof C1580) && (iM38634 = ((C1580) exc).m5400().m38634()) != -1) {
            c7864.f24374.m30372(iM38634 - 1);
        }
        return null;
    }
}
