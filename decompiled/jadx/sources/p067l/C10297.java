package p067l;

/* JADX INFO: renamed from: l.۠ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBE0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10297 {
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC14320 mo23909(C23708 c23708, int i, String str, int i2, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC25009 m23910(C23708 c23708, int i, int i2) {
        String str;
        if (c23708 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C14930 c14930 = null;
        try {
            C13000 c13000M52729 = c23708.m52729();
            C12249 c12249M52728 = c23708.m52728();
            int iM29815 = c13000M52729.m29815(i2);
            int iM29814 = c13000M52729.m29814(i2 + 2);
            C14930 c14931 = (C14930) c12249M52728.get(iM29815);
            try {
                return (AbstractC25009) mo23909(c23708, i, c14931.getString(), i2 + 6, iM29814);
            } catch (C24378 e) {
                e = e;
                c14930 = c14931;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c14930 != null) {
                    str = c14930.mo4819() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(C16351.m37155(i2));
                e.m23570(sb.toString());
                throw e;
            }
        } catch (C24378 e2) {
            e = e2;
        }
    }
}
