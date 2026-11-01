package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ܳܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes5.dex */
public final class C16300 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final /* synthetic */ int f47909 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public int f47910;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f47911;

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20569(DataInputStream dataInputStream, EnumC6799 enumC6799, int i) {
        if (enumC6799 != EnumC6799.f17627) {
            return false;
        }
        if (this.f38268 != null) {
            this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "record_component_info");
        }
        C8925 c8925 = new C8925((C22161) this.f38259);
        c8925.m20620(i, dataInputStream);
        this.f38268 = c8925;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37093(DataInputStream dataInputStream) {
        this.f47910 = dataInputStream.readUnsignedShort();
        this.f47911 = dataInputStream.readUnsignedShort();
        this.f38257.m48090(String.format("RecordComponent: name[%d]=%s descriptor[%d]=%s", Integer.valueOf(this.f47910), ((C22161) this.f38259).f38266.m27987(this.f47910, new C23868(3)), Integer.valueOf(this.f47911), ((C22161) this.f38259).f38266.m27987(this.f47911, new C23868(3))), new Object[0]);
        m30953(dataInputStream);
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        C8925 c8925 = this.f38268;
        boolean z = (c8925 == null || c8925.f32289 || !this.f32296) ? false : true;
        mo10015(this.f38267, this.f38261);
        mo10015(this.f38265, this.f38269);
        int iM26670 = ((m26670() * 2) + mo20624()) - 2;
        m30954(new StringBuilder(m26671(iM26670, m26658(m30957()).concat(EnumC16818.f49771.m38127()))), null, z ? ":" : C0249l.f1196b, this.f47910, this.f47911, -1);
        if (z) {
            int iM26671 = iM26670 - (m26670() + 2);
            C8925 c8926 = this.f38268;
            c8926.m20625(iM26671);
            c8926.m26678(1);
            c8926.m26678(1);
            c8926.f32298 = (this.f32298 - (m26683() * 2)) - 2;
            this.f38268.mo5334();
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        mo6308(i, i2);
    }
}
