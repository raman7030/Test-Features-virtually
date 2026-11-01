package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܳۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16123 implements InterfaceC20563 {

    /* JADX INFO: renamed from: ܳ */
    public static final List f47451 = C21407.m48492("connection", C0172c.f710f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: ᩻ */
    public static final List f47452 = C21407.m48492("connection", C0172c.f710f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: ֫ */
    public final C9833 f47453;

    /* JADX INFO: renamed from: ۧ */
    public final C23500 f47454;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC16041 f47455;

    /* JADX INFO: renamed from: ܿ */
    public final C17208 f47456;

    /* JADX INFO: renamed from: ᩳ */
    public C12101 f47457;

    public C16123(C18724 c18724, C9833 c9833, C17208 c17208, C23500 c23500) {
        this.f47453 = c9833;
        this.f47456 = c17208;
        this.f47454 = c23500;
        List listM42718 = c18724.m42718();
        EnumC16041 enumC16041 = EnumC16041.H2_PRIOR_KNOWLEDGE;
        this.f47455 = listM42718.contains(enumC16041) ? enumC16041 : EnumC16041.HTTP_2;
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7603 mo30185(C10678 c10678, long j) {
        return this.f47457.m27964();
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final void mo30188(C10678 c10678) {
        if (this.f47457 != null) {
            return;
        }
        boolean z = c10678.m24585() != null;
        C12194 c12194M24588 = c10678.m24588();
        ArrayList arrayList = new ArrayList(c12194M24588.m28164() + 4);
        arrayList.add(new C9163(C9163.f24825, c10678.m24589()));
        C13598 c13598 = C9163.f24820;
        C13535 c13535M24591 = c10678.m24591();
        String strM30819 = c13535M24591.m30819();
        String strM30824 = c13535M24591.m30824();
        if (strM30824 != null) {
            strM30819 = strM30819 + '?' + strM30824;
        }
        arrayList.add(new C9163(c13598, strM30819));
        String strM24584 = c10678.m24584("Host");
        if (strM24584 != null) {
            arrayList.add(new C9163(C9163.f24821, strM24584));
        }
        arrayList.add(new C9163(C9163.f24824, c10678.m24591().m30814()));
        int iM28164 = c12194M24588.m28164();
        for (int i = 0; i < iM28164; i++) {
            C13598 c13598M30949 = C13598.m30949(c12194M24588.m28161(i).toLowerCase(Locale.US));
            if (!f47451.contains(c13598M30949.mo4706())) {
                arrayList.add(new C9163(c13598M30949, c12194M24588.m28165(i)));
            }
        }
        C12101 c12101M52252 = this.f47454.m52252(arrayList, z);
        this.f47457 = c12101M52252;
        C14112 c14112 = c12101M52252.f33837;
        C9833 c9833 = this.f47453;
        long jM23005 = c9833.m23005();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c14112.mo22306(jM23005);
        this.f47457.f33829.mo22306(c9833.m23009());
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ۧ */
    public final void mo30190() {
        this.f47454.f74872.flush();
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final void mo30187() {
        ((C5395) this.f47457.m27964()).close();
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final C5984 mo30184(boolean z) throws ProtocolException {
        C12194 c12194M27960 = this.f47457.m27960();
        C14205 c14205 = new C14205();
        int iM28164 = c12194M27960.m28164();
        C23245 c23245M51791 = null;
        for (int i = 0; i < iM28164; i++) {
            String strM28161 = c12194M27960.m28161(i);
            String strM28165 = c12194M27960.m28165(i);
            if (strM28161.equals(":status")) {
                c23245M51791 = C23245.m51791("HTTP/1.1 " + strM28165);
            } else if (!f47452.contains(strM28161)) {
                AbstractC10007.f27689.mo23320(c14205, strM28161, strM28165);
            }
        }
        if (c23245M51791 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C5984 c5984 = new C5984();
        c5984.m13418(this.f47455);
        c5984.m13411(c23245M51791.f73071);
        c5984.m13422(c23245M51791.f73072);
        c5984.m13416(c14205.m32677());
        if (z && AbstractC10007.f27689.mo23313(c5984) == 100) {
            return null;
        }
        return c5984;
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final C16538 mo30186(C20066 c20066) {
        this.f47456.f51224.getClass();
        return new C16538(c20066.m45435("Content-Type"), C3127.m5330(c20066), C25037.m54976(new C18806(this, this.f47457.m27967())));
    }

    @Override // p067l.InterfaceC20563
    public final void cancel() {
        C12101 c12101 = this.f47457;
        if (c12101 != null) {
            c12101.m27962(EnumC15197.CANCEL);
        }
    }
}
