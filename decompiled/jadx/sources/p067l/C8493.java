package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes3.dex */
public class C8493 extends AbstractC13599 {

    /* JADX INFO: renamed from: ܺۧ */
    public static final /* synthetic */ int f22800 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public final boolean f22801;

    /* JADX INFO: renamed from: ۡۧ */
    public String f22802;

    /* JADX INFO: renamed from: ۢۧ */
    public int f22803;

    /* JADX INFO: renamed from: ᩷ۧ */
    public String f22804;

    /* JADX INFO: renamed from: ᩻ۧ */
    public final ArrayList f22805;

    public C8493(AbstractC13599 abstractC13599, boolean z) {
        super(abstractC13599);
        this.f22802 = "@+";
        this.f22804 = "@-";
        this.f22805 = new ArrayList();
        this.f22803 = 0;
        this.f22801 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo19750(DataInputStream dataInputStream) {
        this.f22803 = dataInputStream.readShort();
        short s = dataInputStream.readShort();
        for (int i = 0; i < s; i++) {
            C9834 c9834 = new C9834(this.f38259);
            c9834.f27273 = null;
            c9834.f27274 = dataInputStream.readShort();
            c9834.f27273 = C9834.m23011(dataInputStream, c9834.f38259, this.f22801);
            c9834.f38257.m48090("AnnotationElement: cpIndex#%d=%s value=%s", Integer.valueOf(c9834.f27274), c9834.f38266.m27987(c9834.f27274, new C23787(5)), c9834.f27273.toString());
            this.f22805.add(c9834);
        }
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        String strM16053;
        String strM27987 = this.f38266.m27987(this.f22803, new C10223(4));
        if (this.f32275) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f22803);
            sb.append((strM27987 == null || this.f32292) ? "" : C6988.m16053(" /* ", strM27987, " */"));
            strM16053 = sb.toString();
        } else if (strM27987 == null) {
            strM16053 = "#" + this.f22803;
        } else {
            strM16053 = C6988.m16053("\"", strM27987, "\"");
        }
        int i = C24586.f77863[m30951().ordinal()];
        boolean z = this.f22801;
        if (i == 1) {
            m26676(" default { ");
            m26672(z ? this.f22804 : this.f22802);
            m26668(strM16053);
            this.f32298 = this.f32298;
        } else if (i == 2 || i == 3) {
            this.f32274.mo4344(z ? this.f22804 : this.f22802);
            m26668(strM16053);
        } else {
            m26672(z ? this.f22804 : this.f22802);
            m26668(strM16053);
        }
        mo19751();
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m19749() {
        ArrayList<C9834> arrayList = this.f22805;
        int i = 0;
        for (C9834 c9834 : arrayList) {
            c9834.f32298 = this.f32298;
            c9834.m26661(this);
            c9834.m26678(1);
            c9834.mo5334();
            int i2 = i + 1;
            m26676(i < arrayList.size() - 1 ? "," : "");
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21545.m48729(sb, this.f22801 ? this.f22804 : this.f22802, this.f38266.m27987(this.f22803, new C15868(0)), "{");
        return C10965.m25286(sb, (String) C7480.stream(this.f22805).map(new C22964(3)).collect(C24205.joining(",")), C0249l.f1198d);
    }

    public final boolean isEmpty() {
        return this.f22805.isEmpty();
    }

    /* JADX INFO: renamed from: ᩹ */
    public void mo19751() {
        ArrayList<C9834> arrayList = this.f22805;
        if (arrayList.isEmpty()) {
            m26668(" { }");
            return;
        }
        int i = C24586.f77863[m30951().ordinal()];
        if (i != 1) {
            if (i != 3) {
                m26676(" {");
                m19749();
                m26672(C0249l.f1198d);
                return;
            } else {
                m26678(1);
                m26679("{");
                m19749();
                m26672(C0249l.f1198d);
                m26667(1);
                return;
            }
        }
        m26676(" {");
        int i2 = this.f32298;
        for (C9834 c9834 : arrayList) {
            m26668(m26677(i2, ""));
            c9834.mo24245(EnumC8234.RIGHT_OPERAND);
            c9834.mo5334();
        }
        m26681();
        m26667(1);
        m26672(C0249l.f1198d);
    }
}
