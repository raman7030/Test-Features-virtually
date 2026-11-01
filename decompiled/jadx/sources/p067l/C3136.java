package p067l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3136 implements InterfaceC7482 {

    /* JADX INFO: renamed from: ֫ */
    public ActivityC18686 f5717;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9842 f5718;

    /* JADX INFO: renamed from: ܽ */
    public boolean f5719;

    public C3136(ActivityC18686 activityC18686, C9842 c9842, boolean z) {
        this.f5718 = c9842;
        this.f5717 = activityC18686;
        this.f5719 = z;
        if (c9842.f27284 == null) {
            C20856 c20856 = (C20856) ((C5946) new C6874(activityC18686).m15765(C5946.class)).m13347().m4060();
            C12826.requireNonNull(c20856);
            c9842.f27284 = c20856;
        }
        if (c9842.f27288 == null) {
            c9842.f27288 = (C13992) new C6874(activityC18686).m15765(C13992.class);
        }
    }

    @Override // p067l.InterfaceC7482
    public final String getTitle() {
        return this.f5718.mo16325();
    }

    @Override // p067l.InterfaceC7482
    /* JADX INFO: renamed from: ֫ */
    public final void mo5357() {
        if (this.f5718.f27301) {
            C14146 c14146 = this.f5718.f27290;
            m5355(c14146.m32500().toString());
            if (this.f5719) {
                this.f5718.f46351.putBoolean("changed", false);
                C9842 c9842 = this.f5718;
                c9842.m36372(c9842.f27284.m38429());
                InterfaceC20028 interfaceC20028Mo19371 = this.f5718.mo19371();
                if (interfaceC20028Mo19371 != null) {
                    C10513 c10513 = (C10513) interfaceC20028Mo19371;
                    c10513.mo11541();
                    c10513.mo11540();
                }
            }
            c14146.m32534();
            return;
        }
        this.f5718.f27288.m31796();
        C9842 c9843 = this.f5718;
        C12828 c12828M36366 = c9843.m36366(c9843.f27284.m38429());
        C14677 c14677M33572 = C14677.m33572(c12828M36366.m29399());
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253410);
        int i = c14677M33572.readInt();
        C23395.m52060((InterfaceC21384) c14677M33572, 1382253410);
        if (i == this.f5718.f27284.m47131(this.f5718.m23088())) {
            C9842 c9844 = this.f5718;
            m5355(C8782.m20318(c14677M33572, c9844.m36369(c9844.f27284.m38429()).m29402()));
        } else {
            m5355(this.f5718.f27284.m47152(this.f5718.m23088()));
        }
        if (this.f5719) {
            this.f5718.f46351.putBoolean("changed", false);
            C9842 c9845 = this.f5718;
            c9845.m36372(c9845.f27284.m38429());
            C8782.m20316(c14677M33572);
            C17548.m39930(4, this.f5718.f27284.m47131(this.f5718.m23088()), c14677M33572.f41893);
            synchronized (this.f5718) {
                byte[] bArr = c14677M33572.f41893;
                int i2 = C6054.f15203;
                c12828M36366.m29394(C6054.m13643(bArr, bArr.length));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5355(String str) throws IOException {
        C9842 c9842 = this.f5718;
        String strM23088 = c9842.m23088();
        c9842.f27284.m47145(strM23088, str);
        if (strM23088.endsWith("package-info") || strM23088.endsWith("type-info")) {
            this.f5717.m42614().m13336();
        }
    }

    @Override // p067l.InterfaceC7482
    /* JADX INFO: renamed from: ֫ */
    public final Exception mo5356(Exception exc) {
        int iM40851;
        C9842 c9842 = this.f5718;
        if (!c9842.f27301) {
            return exc instanceof C3870 ? new C7760(c9842.m23088(), (C3870) exc) : exc;
        }
        this.f5717.m12259(exc, (DialogInterface.OnDismissListener) null);
        if ((exc instanceof C3870) && (iM40851 = ((C3870) exc).m7629().m40851()) != -1) {
            c9842.f27290.m32436(iM40851 - 1);
        }
        return null;
    }
}
