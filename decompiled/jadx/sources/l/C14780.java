package l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14780 extends AbstractC18309 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f45144;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17603 f45145;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17603 f45146;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InetSocketAddress f45147;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17603 f45148;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f45149;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17603 f45150;

    public C14780(int i) {
        this(i, 1460, true);
    }

    public C14780(int i, int i2, boolean z) {
        super(i, 0, z);
        this.f45144 = new HashMap();
        this.f45149 = i2 > 0 ? i2 : 1460;
        this.f45145 = new C17603(i2, this, 0);
        this.f45150 = new C17603(i2, this, 0);
        this.f45148 = new C17603(i2, this, 0);
        this.f45146 = new C17603(i2, this, 0);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m35167() {
        return this.f45147;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35160(InetSocketAddress inetSocketAddress) {
        this.f45147 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m35165() {
        return ((((this.f45149 - 12) - this.f45145.size()) - this.f45150.size()) - this.f45148.size()) - this.f45146.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35162(C19015 c19015) throws IOException {
        C17603 c17603 = new C17603(512, this, 0);
        c17603.m41143(c19015.m32828());
        c17603.writeShort(c19015.m32832().m28522());
        c17603.writeShort(c19015.m32830().m16802());
        byte[] byteArray = c17603.toByteArray();
        c17603.close();
        if (byteArray.length < m35165()) {
            this.f56922.add(c19015);
            this.f45145.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35161(C11254 c11254, AbstractC22542 abstractC22542) throws IOException {
        if (c11254 == null || !abstractC22542.m50539(c11254)) {
            m35164(abstractC22542, 0L);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35164(AbstractC22542 abstractC22542, long j) throws IOException {
        if (abstractC22542 != null) {
            if (j == 0 || !abstractC22542.mo32824(j)) {
                C17603 c17603 = new C17603(512, this, 0);
                c17603.m41144(abstractC22542, j);
                byte[] byteArray = c17603.toByteArray();
                c17603.close();
                if (byteArray.length < m35165()) {
                    this.f56917.add(abstractC22542);
                    this.f45150.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35163(AbstractC22542 abstractC22542) throws IOException {
        C17603 c17603 = new C17603(512, this, 0);
        c17603.m41144(abstractC22542, 0L);
        byte[] byteArray = c17603.toByteArray();
        c17603.close();
        if (byteArray.length < m35165()) {
            this.f56919.add(abstractC22542);
            this.f45148.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m35166() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f45144.clear();
        C17603 c17603 = new C17603(this.f45149, this, 0);
        c17603.writeShort(this.f56918 ? 0 : m42660());
        c17603.writeShort(m42658());
        List<C19015> list = this.f56922;
        c17603.writeShort(list.size());
        List list2 = this.f56917;
        c17603.writeShort(list2.size());
        List list3 = this.f56919;
        c17603.writeShort(list3.size());
        List list4 = this.f56916;
        c17603.writeShort(list4.size());
        for (C19015 c19015 : list) {
            c17603.m41143(c19015.m32828());
            c17603.writeShort(c19015.m32832().m28522());
            c17603.writeShort(c19015.m32830().m16802());
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c17603.m41144((AbstractC22542) it.next(), jCurrentTimeMillis);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            c17603.m41144((AbstractC22542) it2.next(), jCurrentTimeMillis);
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            c17603.m41144((AbstractC22542) it3.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = c17603.toByteArray();
        try {
            c17603.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m42653() ? "dns[query:" : "dns[response:");
        sb.append(" id=0x");
        sb.append(Integer.toHexString(m42660()));
        if (m42658() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m42658()));
            if (m42652()) {
                sb.append(":r");
            }
            if (m42662()) {
                sb.append(":aa");
            }
            if (m42657()) {
                sb.append(":tc");
            }
        }
        List<C19015> list = this.f56922;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC22542> list2 = this.f56917;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC22542> list3 = this.f56919;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC22542> list4 = this.f56916;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C19015 c19015 : list) {
                sb.append("\n\t");
                sb.append(c19015);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC22542 abstractC22542 : list2) {
                sb.append("\n\t");
                sb.append(abstractC22542);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC22542 abstractC22543 : list3) {
                sb.append("\n\t");
                sb.append(abstractC22543);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC22542 abstractC22544 : list4) {
                sb.append("\n\t");
                sb.append(abstractC22544);
            }
        }
        sb.append("\nnames=");
        sb.append(this.f45144);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m35159() {
        return this.f45149;
    }
}
