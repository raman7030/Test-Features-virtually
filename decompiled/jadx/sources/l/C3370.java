package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5NZ */
/* JADX INFO: loaded from: classes2.dex */
public class C3370 extends AbstractC22441 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19599 f10666;

    static {
        Pattern.compile(".*[^.]\\.\\.[^.].*");
        Pattern.compile(".*\\.\\.\\.\\s+\\.\\.\\..*");
    }

    public C3370(C19599 c19599, C23831 c23831) {
        super(c23831);
        this.f10666 = c19599;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10301() {
        return this.f10666.f63289.m32229();
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10298(InterfaceC11858 interfaceC11858) {
        return ((InterfaceC4781) interfaceC11858).m13964(1);
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10297(int i, InterfaceC11858 interfaceC11858) {
        StringBuilder sb = new StringBuilder("<missing ");
        sb.append(C4144.f13497[i]);
        sb.append(">");
        throw null;
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo10299(InterfaceC11858 interfaceC11858, int i, C20325 c20325) throws C1959 {
        C1959 c1959 = new C1959((InterfaceC4781) interfaceC11858);
        c1959.f6531 = i;
        throw c1959;
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String mo10300(C14658 c14658, String[] strArr) {
        C6322 c6322Mo13965 = ((InterfaceC4781) c14658.f44796).mo13965();
        Object obj = c14658.f44793;
        c6322Mo13965.getClass();
        InterfaceC6898 interfaceC6898 = obj instanceof C18893 ? ((C18893) obj).f59554 : null;
        c14658.f44795 = interfaceC6898;
        if (interfaceC6898 == null) {
            Object obj2 = c14658.f44793;
            int type = obj2 == null ? 0 : ((InterfaceC22420) obj2).getType();
            Object obj3 = c14658.f44793;
            c14658.f44795 = new C3391(type, obj3 != null ? ((InterfaceC22420) obj3).getText() : null);
        }
        return super.mo10300(c14658, strArr);
    }
}
