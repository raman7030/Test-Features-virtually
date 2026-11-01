package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11075 extends AbstractC18422 implements InterfaceC21323 {

    /* JADX INFO: renamed from: ۤ */
    public static final HashMap f30662 = new HashMap();

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ int f30663 = 0;

    /* JADX INFO: renamed from: ۗ */
    public C17969 f30664;

    /* JADX INFO: renamed from: ۙ */
    public final String f30665;

    /* JADX INFO: renamed from: ۬ */
    public final C19121 f30666;

    /* JADX INFO: renamed from: ᩶ */
    public final C9015 f30667;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11994 f30668;

    /* JADX INFO: renamed from: ᩹ */
    public final C25108 f30669;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "tar";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    static {
        C15345.m34927("tar");
        C11126.m25655("tar", "local", new C16438());
    }

    public C11075(int i, String str, String str2) throws C20807 {
        super(i, "/");
        this.f30664 = new C17969("tar", null);
        this.f30669 = new C25108(this);
        this.f30667 = new C9015(this);
        this.f30668 = new C11746(this);
        C19121 c19121 = new C19121(str, str2);
        this.f30666 = c19121;
        String str3 = (String) f30662.get(str);
        if (str3 != null && !str3.isEmpty()) {
            c19121.m43451(str3);
        }
        this.f30665 = c19121.m43447().getName();
        m41986(str2);
        try {
            mo16732(false);
        } catch (IOException e) {
            C20807 c20807 = new C20807(C7050.m16224(R.string.MT_Protector));
            c20807.initCause((Throwable) e);
            throw c20807;
        }
    }

    public C11075(C14677 c14677) {
        super(c14677);
        this.f30664 = new C17969("tar", null);
        this.f30669 = new C25108(this);
        this.f30667 = new C9015(this);
        this.f30668 = new C11746(this);
        C19121 c19121M43444 = C19121.m43444(c14677);
        this.f30666 = c19121M43444;
        this.f30665 = c19121M43444.m43447().getName();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        this.f30666.mo9714(c11996);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return this.f30665 + super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f30666;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        C19121 c19121 = this.f30666;
        if (c19121.m43454() == null) {
            mo16732(false);
        }
        ArrayList arrayListMo9708 = c19121.mo9708(m41982(), true);
        arrayListMo9708.add(0, C17278.f51496);
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new C6871(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        return C8212.m18995();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        return new C14005(this.f30665, this.f30666.m43448(), C21265.f66869);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return this.f30666.m43450();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return this.f30666.m43446();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18108.m41279(this.f30665);
        c18108.m41259(this.f30666.m43447().m38669(), true);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        C3659 entry = this.f30666.getEntry(str.substring(1));
        return (entry == null || entry.m7006()) ? false : true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        m41978(c18107);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043M38684 = C18524.m42109(this.f55050.mo25505(), C6458.m14757(m41982())).m38684(interfaceC19370.getName());
        abstractC17043M38684.mo25496();
        return abstractC17043M38684;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        new C9063(this, c18107, list, runnable).m22250();
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final String m25519() {
        return this.f30666.m43452();
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m25520() {
        return this.f30666.m43448();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
        C19121 c19121 = this.f30666;
        if (c19121.m43448().equals(c19121.m43452()) || !c19121.m43452().endsWith("._tar")) {
            return;
        }
        c19121.m43453().mo25503();
        C17127.m38756();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, this.f30669, this.f30667, AbstractC18422.f55045, AbstractC18422.f55040, new C9943(), AbstractC18422.f55038, this.f30668, m41984(), AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, true));
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15431(C17969 c17969) {
        this.f30664 = c17969;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final C17969 mo15430() {
        return this.f30664;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15432(C18107 c18107, View view, C17969 c17969, InterfaceC19311 interfaceC19311) {
        new C15957(c18107, this).m36251(c17969.f53664, new RunnableC17814(2, interfaceC19311));
    }
}
