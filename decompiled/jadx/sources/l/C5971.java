package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5971 extends C16885 implements InterfaceC13648 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f18312;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1717 m16731(InterfaceC0531 interfaceC0531) {
        return ((C13026) interfaceC0531).f38990;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23589 m16732(InterfaceC0531 interfaceC0531) {
        return ((C13026) interfaceC0531).f38988;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C13026) obj).f38989;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7382 m16733(InterfaceC0531 interfaceC0531) {
        return ((C13026) interfaceC0531).f38987;
    }

    public C5971(C19357 c19357) {
        super(c19357);
        this.f18312 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13026 m16734(InterfaceC0531 interfaceC0531) {
        String string = interfaceC0531.toString();
        ConcurrentMapC10942 concurrentMapC10942 = this.f18312;
        C13026 c13026 = (C13026) concurrentMapC10942.get(string);
        if (c13026 != null) {
            return c13026;
        }
        C19357 c19357 = this.f51819;
        C13731 c13731 = (C13731) c19357.f68948;
        List<CharSequence> listMo2257 = interfaceC0531.mo2257();
        String strMo2258 = interfaceC0531.mo2258();
        InterfaceC18842 interfaceC18842 = C17177.f52643;
        StringBuilder sb = new StringBuilder(listMo2257.size() + 1);
        sb.append(strMo2258.length() > 1 ? 'L' : strMo2258.charAt(0));
        for (CharSequence charSequence : listMo2257) {
            sb.append(charSequence.length() > 1 ? 'L' : charSequence.charAt(0));
        }
        C13026 c13027 = new C13026(c13731.m33032(sb.toString()), ((C17945) c19357.f68946).m41946(interfaceC0531.mo2257()), c19357.f68957.m34448(interfaceC0531.mo2258()));
        C13026 c13028 = (C13026) concurrentMapC10942.putIfAbsent(string, c13027);
        return c13028 == null ? c13027 : c13028;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C10205(this.f18312.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f18312.size();
    }
}
