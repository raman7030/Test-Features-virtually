package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8043 extends C18416 implements InterfaceC15339 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f21165;

    /* JADX INFO: renamed from: ֫ */
    public final C4000 m18657(InterfaceC2873 interfaceC2873) {
        return ((C14748) interfaceC2873).f42036;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24787 m18658(InterfaceC2873 interfaceC2873) {
        return ((C14748) interfaceC2873).f42034;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C14748) obj).f42035;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9384 m18659(InterfaceC2873 interfaceC2873) {
        return ((C14748) interfaceC2873).f42033;
    }

    public C8043(C20765 c20765) {
        super(c20765);
        this.f21165 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14748 m18660(InterfaceC2873 interfaceC2873) {
        String string = interfaceC2873.toString();
        ConcurrentMapC12768 concurrentMapC12768 = this.f21165;
        C14748 c14748 = (C14748) concurrentMapC12768.get(string);
        if (c14748 != null) {
            return c14748;
        }
        C20765 c20765 = this.f55000;
        C15418 c15418 = (C15418) c20765.f71646;
        List<CharSequence> listMo4624 = interfaceC2873.mo4624();
        String strMo4625 = interfaceC2873.mo4625();
        InterfaceC20276 interfaceC20276 = C18693.f55824;
        StringBuilder sb = new StringBuilder(listMo4624.size() + 1);
        sb.append(strMo4625.length() > 1 ? 'L' : strMo4625.charAt(0));
        for (CharSequence charSequence : listMo4624) {
            sb.append(charSequence.length() > 1 ? 'L' : charSequence.charAt(0));
        }
        C14748 c14749 = new C14748(c15418.m35146(sb.toString()), ((C19423) c20765.f71644).m44195(interfaceC2873.mo4624()), c20765.f71655.m36581(interfaceC2873.mo4625()));
        C14748 c147410 = (C14748) concurrentMapC12768.putIfAbsent(string, c14749);
        return c147410 == null ? c14749 : c147410;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C12067(this.f21165.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f21165.size();
    }
}
