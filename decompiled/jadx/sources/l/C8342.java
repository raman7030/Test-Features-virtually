package l;

/* JADX INFO: renamed from: l.۠ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBE0 */
/* JADX INFO: loaded from: classes3.dex */
public class C8342 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC12575 mo21939(C22453 c22453, int i, String str, int i2, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC23822 m21940(C22453 c22453, int i, int i2) {
        String str;
        if (c22453 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C13217 c13217 = null;
        try {
            C11186 c11186M50388 = c22453.m50388();
            C10396 c10396M50387 = c22453.m50387();
            int iM27753 = c11186M50388.m27753(i2);
            int iM27752 = c11186M50388.m27752(i2 + 2);
            C13217 c13218 = (C13217) c10396M50387.get(iM27753);
            try {
                return (AbstractC23822) mo21939(c22453, i, c13218.getString(), i2 + 6, iM27752);
            } catch (C23158 e) {
                e = e;
                c13217 = c13218;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c13217 != null) {
                    str = c13217.mo2463() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(C14712.m35008(i2));
                e.m21602(sb.toString());
                throw e;
            }
        } catch (C23158 e2) {
            e = e2;
        }
    }
}
