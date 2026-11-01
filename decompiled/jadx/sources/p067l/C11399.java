package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۢۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07RX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11399 extends C22128 {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f31792;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        sb.append("[");
        return (AbstractC6462) c7251.f18916.mo5291(this, sb);
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        String strReplace = (this.f31792 ? c21333.f16705.mo18002().toString() : c21333.f16705.mo17995().toString()).replace('.', '/');
        sb.append("L");
        sb.append(strReplace);
        sb.append(C0249l.f1196b);
        return null;
    }

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo4507(AbstractC6462 abstractC6462, StringBuilder sb) {
        String str;
        if (!abstractC6462.mo14771()) {
            return (AbstractC6462) abstractC6462.mo5291(this, sb);
        }
        int i = C24809.f79274[abstractC6462.mo5575().ordinal()];
        if (i != 11) {
            switch (i) {
                case 1:
                    str = "Z";
                    break;
                case 2:
                    str = "B";
                    break;
                case 3:
                    str = "S";
                    break;
                case 4:
                    str = "I";
                    break;
                case 5:
                    str = "J";
                    break;
                case 6:
                    str = "C";
                    break;
                case 7:
                    str = "F";
                    break;
                case 8:
                    str = "D";
                    break;
                default:
                    C1446.m31702("unknown type: should not happen");
                    throw null;
            }
        } else {
            str = "V";
        }
        sb.append(str);
        return null;
    }

    public C11399(boolean z) {
        this.f31792 = z;
    }
}
