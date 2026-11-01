package p067l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C16416 extends AbstractC19770 {

    /* JADX INFO: renamed from: ۖ */
    public HashMap f48258;

    /* JADX INFO: renamed from: ۘ */
    public final C19099 f48259;

    /* JADX INFO: renamed from: ۜ */
    public final C19099 f48260;

    /* JADX INFO: renamed from: ۡ */
    public InetSocketAddress f48261;

    /* JADX INFO: renamed from: ۢ */
    public final C19099 f48262;

    /* JADX INFO: renamed from: ܺ */
    public int f48263;

    /* JADX INFO: renamed from: ᩷ */
    public final C19099 f48264;

    public C16416(int i) {
        this(i, 1460, true);
    }

    public C16416(int i, int i2, boolean z) {
        super(i, 0, z);
        this.f48258 = new HashMap();
        this.f48263 = i2 > 0 ? i2 : 1460;
        this.f48259 = new C19099(i2, this, 0);
        this.f48264 = new C19099(i2, this, 0);
        this.f48262 = new C19099(i2, this, 0);
        this.f48260 = new C19099(i2, this, 0);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final InetSocketAddress m37314() {
        return this.f48261;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37307(InetSocketAddress inetSocketAddress) {
        this.f48261 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m37312() {
        return ((((this.f48263 - 12) - this.f48259.size()) - this.f48264.size()) - this.f48262.size()) - this.f48260.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37309(C20441 c20441) throws IOException {
        C19099 c19099 = new C19099(512, this, 0);
        c19099.m43389(c20441.m34943());
        c19099.writeShort(c20441.m34947().m30568());
        c19099.writeShort(c20441.m34945().m18728());
        byte[] byteArray = c19099.toByteArray();
        c19099.close();
        if (byteArray.length < m37312()) {
            this.f60140.add(c20441);
            this.f48259.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37308(C13065 c13065, AbstractC23793 abstractC23793) throws IOException {
        if (c13065 == null || !abstractC23793.m52881(c13065)) {
            m37311(abstractC23793, 0L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37311(AbstractC23793 abstractC23793, long j) throws IOException {
        if (abstractC23793 != null) {
            if (j == 0 || !abstractC23793.mo34939(j)) {
                C19099 c19099 = new C19099(512, this, 0);
                c19099.m43390(abstractC23793, j);
                byte[] byteArray = c19099.toByteArray();
                c19099.close();
                if (byteArray.length < m37312()) {
                    this.f60135.add(abstractC23793);
                    this.f48264.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37310(AbstractC23793 abstractC23793) throws IOException {
        C19099 c19099 = new C19099(512, this, 0);
        c19099.m43390(abstractC23793, 0L);
        byte[] byteArray = c19099.toByteArray();
        c19099.close();
        if (byteArray.length < m37312()) {
            this.f60137.add(abstractC23793);
            this.f48262.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ᩴ */
    public final byte[] m37313() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f48258.clear();
        C19099 c19099 = new C19099(this.f48263, this, 0);
        c19099.writeShort(this.f60136 ? 0 : m44921());
        c19099.writeShort(m44919());
        List<C20441> list = this.f60140;
        c19099.writeShort(list.size());
        List list2 = this.f60135;
        c19099.writeShort(list2.size());
        List list3 = this.f60137;
        c19099.writeShort(list3.size());
        List list4 = this.f60134;
        c19099.writeShort(list4.size());
        for (C20441 c20441 : list) {
            c19099.m43389(c20441.m34943());
            c19099.writeShort(c20441.m34947().m30568());
            c19099.writeShort(c20441.m34945().m18728());
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c19099.m43390((AbstractC23793) it.next(), jCurrentTimeMillis);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            c19099.m43390((AbstractC23793) it2.next(), jCurrentTimeMillis);
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            c19099.m43390((AbstractC23793) it3.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = c19099.toByteArray();
        try {
            c19099.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m44914() ? "dns[query:" : "dns[response:");
        sb.append(" id=0x");
        sb.append(Integer.toHexString(m44921()));
        if (m44919() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m44919()));
            if (m44913()) {
                sb.append(":r");
            }
            if (m44923()) {
                sb.append(":aa");
            }
            if (m44918()) {
                sb.append(":tc");
            }
        }
        List<C20441> list = this.f60140;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC23793> list2 = this.f60135;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC23793> list3 = this.f60137;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC23793> list4 = this.f60134;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C20441 c20441 : list) {
                sb.append("\n\t");
                sb.append(c20441);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC23793 abstractC23793 : list2) {
                sb.append("\n\t");
                sb.append(abstractC23793);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC23793 abstractC23794 : list3) {
                sb.append("\n\t");
                sb.append(abstractC23794);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC23793 abstractC23795 : list4) {
                sb.append("\n\t");
                sb.append(abstractC23795);
            }
        }
        sb.append("\nnames=");
        sb.append(this.f48258);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m37306() {
        return this.f48263;
    }
}
