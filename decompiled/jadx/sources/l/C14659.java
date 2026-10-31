package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ܳܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes5.dex */
public final class C14659 extends AbstractC11817 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44799 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f44800;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f44801;

    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18620(DataInputStream dataInputStream, EnumC4662 enumC4662, int i) {
        if (enumC4662 != EnumC4662.f14797) {
            return false;
        }
        if (this.f35266 != null) {
            this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "record_component_info");
        }
        C6899 c6899 = new C6899((C20826) this.f35257);
        c6899.m18671(i, dataInputStream);
        this.f35266 = c6899;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34946(DataInputStream dataInputStream) {
        this.f44800 = dataInputStream.readUnsignedShort();
        this.f44801 = dataInputStream.readUnsignedShort();
        this.f35255.m45778(String.format("RecordComponent: name[%d]=%s descriptor[%d]=%s", Integer.valueOf(this.f44800), ((C20826) this.f35257).f35264.m25965(this.f44800, new C22621(3)), Integer.valueOf(this.f44801), ((C20826) this.f35257).f35264.m25965(this.f44801, new C22621(3))), new Object[0]);
        m28904(dataInputStream);
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        C6899 c6899 = this.f35266;
        boolean z = (c6899 == null || c6899.f29340 || !this.f29347) ? false : true;
        mo7967(this.f35265, this.f35259);
        mo7967(this.f35263, this.f35267);
        int iM24656 = ((m24656() * 2) + mo18675()) - 2;
        m28905(new StringBuilder(m24657(iM24656, m24644(m28908()).concat(EnumC15204.f46646.m35967()))), null, z ? ":" : l.b, this.f44800, this.f44801, -1);
        if (z) {
            int iM24657 = iM24656 - (m24656() + 2);
            C6899 c68910 = this.f35266;
            c68910.m18676(iM24657);
            c68910.m24664(1);
            c68910.m24664(1);
            c68910.f29349 = (this.f29349 - (m24669() * 2)) - 2;
            this.f35266.mo3021();
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        mo4064(i, i2);
    }
}
