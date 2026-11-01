package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5NZ */
/* JADX INFO: loaded from: classes2.dex */
public class C5571 extends AbstractC23696 {

    /* JADX INFO: renamed from: ۧ */
    public C20995 f13473;

    static {
        Pattern.compile(".*[^.]\\.\\.[^.].*");
        Pattern.compile(".*\\.\\.\\.\\s+\\.\\.\\..*");
    }

    public C5571(C20995 c20995, C25017 c25017) {
        super(c25017);
        this.f13473 = c20995;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m12338() {
        return this.f13473.f65907.m34328();
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12335(InterfaceC13638 interfaceC13638) {
        return ((InterfaceC6912) interfaceC13638).m15844(1);
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12334(int i, InterfaceC13638 interfaceC13638) {
        StringBuilder sb = new StringBuilder("<missing ");
        sb.append(C6307.f16311[i]);
        sb.append(">");
        throw null;
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ۧ */
    public final Object mo12336(InterfaceC13638 interfaceC13638, int i, C21685 c21685) throws C4230 {
        C4230 c4230 = new C4230((InterfaceC6912) interfaceC13638);
        c4230.f9310 = i;
        throw c4230;
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ۧ */
    public String mo12337(C16299 c16299, String[] strArr) {
        C8377 c8377Mo15845 = ((InterfaceC6912) c16299.f47906).mo15845();
        Object obj = c16299.f47903;
        c8377Mo15845.getClass();
        InterfaceC8924 interfaceC8924 = obj instanceof C20324 ? ((C20324) obj).f62784 : null;
        c16299.f47905 = interfaceC8924;
        if (interfaceC8924 == null) {
            Object obj2 = c16299.f47903;
            int type = obj2 == null ? 0 : ((InterfaceC23676) obj2).getType();
            Object obj3 = c16299.f47903;
            c16299.f47905 = new C5591(type, obj3 != null ? ((InterfaceC23676) obj3).getText() : null);
        }
        return super.mo12337(c16299, strArr);
    }
}
