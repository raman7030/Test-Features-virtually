package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۫᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14397 implements InterfaceC7482 {

    /* JADX INFO: renamed from: ֫ */
    public ActivityC18686 f41149;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8362 f41150;

    /* JADX INFO: renamed from: ܽ */
    public boolean f41151;

    public C14397(ActivityC18686 activityC18686, C8362 c8362, boolean z) {
        this.f41150 = c8362;
        this.f41149 = activityC18686;
        this.f41151 = z;
        if (c8362.f22385 == null) {
            C14121 c14121 = (C14121) ((C5946) new C6874(activityC18686).m15765(C5946.class)).m13355().m4060();
            C12826.requireNonNull(c14121);
            c8362.f22385 = c14121;
        }
        if (c8362.f22373 == null) {
            c8362.f22373 = (C13992) new C6874(activityC18686).m15765(C13992.class);
        }
    }

    @Override // p067l.InterfaceC7482
    public final String getTitle() {
        return this.f41150.mo16325();
    }

    @Override // p067l.InterfaceC7482
    /* JADX INFO: renamed from: ֫ */
    public final void mo5357() {
        if (this.f41150.f22394) {
            C14146 c14146 = this.f41150.f22377;
            m33013(c14146.m32500().toString());
            if (this.f41151) {
                this.f41150.f46351.putBoolean("changed", false);
                C8362 c8362 = this.f41150;
                c8362.m36372(c8362.f22385.m38429());
                InterfaceC20028 interfaceC20028Mo19371 = this.f41150.mo19371();
                if (interfaceC20028Mo19371 != null) {
                    C17078 c17078 = (C17078) interfaceC20028Mo19371;
                    c17078.mo11541();
                    c17078.mo11540();
                }
            }
            c14146.m32534();
            return;
        }
        this.f41150.f22373.m31796();
        C8362 c8363 = this.f41150;
        C12828 c12828M36366 = c8363.m36366(c8363.f22385.m38429());
        C14677 c14677M33572 = C14677.m33572(c12828M36366.m29399());
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253409);
        int i = c14677M33572.readInt();
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253409);
        if (i == this.f41150.f22385.m32123(this.f41150.m19360())) {
            C8362 c8364 = this.f41150;
            m33013(C8782.m20318(c14677M33572, c8364.m36369(c8364.f22385.m38429()).m29402()));
        } else {
            m33013(this.f41150.f22385.m32113(this.f41150.m19360()));
        }
        if (this.f41151) {
            this.f41150.f46351.putBoolean("changed", false);
            C8362 c8365 = this.f41150;
            c8365.m36372(c8365.f22385.m38429());
            C8782.m20316(c14677M33572);
            C17548.m39930(4, this.f41150.f22385.m32123(this.f41150.m19360()), c14677M33572.f41893);
            synchronized (this.f41150) {
                byte[] bArr = c14677M33572.f41893;
                int i2 = C6054.f15203;
                c12828M36366.m29394(C6054.m13643(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33013(String str) throws Exception {
        C8362 c8362 = this.f41150;
        C20960 c20960M32106 = c8362.f22385.m32106(c8362.f22385.m32137(c8362.m19360()));
        if (C11572.m26641(str, c20960M32106.m47281(), c20960M32106) == null) {
            throw new Exception("Unknown error");
        }
        c8362.f22385.m32117(c8362.m19360(), str);
    }

    @Override // p067l.InterfaceC7482
    /* JADX INFO: renamed from: ֫ */
    public final Exception mo5356(Exception exc) {
        C8362 c8362 = this.f41150;
        if (!c8362.f22394) {
            return exc instanceof C16299 ? new C4063(c8362.m19360(), (C16299) exc) : exc;
        }
        ActivityC18686 activityC18686 = this.f41149;
        activityC18686.m12259(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C16299) {
            C16299 c16299 = (C16299) exc;
            activityC18686.m42603();
            C20699 c20699M46760 = C20699.m46760(c16299.f47904, c16299.f47908);
            c20699M46760.f63908 = false;
            activityC18686.m42588(c8362.m19360(), c20699M46760);
            c8362.f22385.m32087(c8362.m19360());
        }
        return null;
    }
}
