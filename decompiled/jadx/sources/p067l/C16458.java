package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16458 extends AbstractC18422 {

    /* JADX INFO: renamed from: ᩸ */
    public static final AbstractC11994 f48339;

    /* JADX INFO: renamed from: ᩹ */
    public static final AbstractC11994 f48340;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "trash";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        return false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
    }

    static {
        C15345.m34927("trash");
        C11126.m25655("trash", "local", new C24485());
        f48340 = new C15767(R.string.MT_Protector, R.drawable.MT_Protector);
        f48339 = new C19141(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    public C16458(C14677 c14677) {
        super(c14677);
    }

    public C16458(int i) {
        super(i, "/");
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܿ */
    public final void mo37385(String str) {
        super.mo37385(str);
        String strM41982 = m41982();
        if (strM41982.length() <= 1 || strM41982.indexOf(47, 1) != strM41982.length() - 1) {
            return;
        }
        super.mo37385("/");
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        C8392 c8392M31344 = C13757.m31344(m41982());
        if (c8392M31344 == null) {
            return strM16224.concat("/");
        }
        StringBuilder sbM17248 = C7470.m17248(strM16224);
        sbM17248.append(c8392M31344.m19554());
        return AbstractC18422.m41969(sbM17248.toString());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return C13757.f38882;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        String strM41982 = m41982();
        ArrayList arrayListMo9708 = C13757.f38882.mo9708(strM41982, true);
        if (strM41982.length() > 1) {
            arrayListMo9708.add(0, C17278.f51496);
        }
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC3947 mo17068(C4697 c4697) {
        C21134 c21134 = new C21134(R.string.MT_Protector, R.drawable.MT_Protector);
        c21134.m7834();
        return c21134;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC3947 mo17072() {
        return new C6381(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new DialogInterfaceOnDismissListenerC7051();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC3947 mo17075() {
        return new C7722(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC3947 mo37386() {
        return C11955.m27369();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC3947 mo37382() {
        return C5249.m11323();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo37381(C18107 c18107, InterfaceC19370 interfaceC19370) {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        return C15097.f43087;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final String mo37383(C18107 c18107) {
        C22549 c22549M33036;
        if (m41982().length() > 1) {
            return null;
        }
        boolean zM41256 = c18107.m41256();
        long size = 0;
        for (InterfaceC19370 interfaceC19370 : c18107.m41240()) {
            if (!zM41256 || interfaceC19370.isChecked()) {
                if ((interfaceC19370 instanceof C14427) && (c22549M33036 = ((C14427) interfaceC19370).m33036()) != null) {
                    size += c22549M33036.size();
                }
            }
        }
        return C7050.m16224(R.string.MT_Protector) + ": " + C24158.m53411(size);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        C8392 c8392M31344 = C13757.m31344(m41982());
        return new C14005(C7050.m16224(R.string.MT_Protector), c8392M31344 == null ? "/" : c8392M31344.m19554(), C21265.f66822);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo37384() {
        return m41982().length() > 1;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, AbstractC18422.f55045, AbstractC18422.f55040, f48340, f48339, AbstractC18422.m41966(R.string.MT_Protector, true));
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        return interfaceC19370.mo26445();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12073 c12073 = (C12073) it.next();
            InterfaceC19370 interfaceC19370M27646 = c12073.m27646();
            if (interfaceC19370M27646 instanceof C14427) {
                c12073.m27642(((C14427) interfaceC19370M27646).mo26445());
            }
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            c18107.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
