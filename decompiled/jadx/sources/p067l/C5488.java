package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5488 extends AbstractC4643 {

    /* JADX INFO: renamed from: ܽ */
    public static final C15545 f13132 = C15545.m35336("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: ֫ */
    public final List f13133;

    /* JADX INFO: renamed from: ۧ */
    public final List f13134;

    public C5488(ArrayList arrayList, ArrayList arrayList2) {
        this.f13133 = C21407.m48491((List) arrayList);
        this.f13134 = C21407.m48491((List) arrayList2);
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ܽ */
    public final C15545 mo4356() {
        return f13132;
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final long mo4352() {
        return m12126((InterfaceC12257) null, true);
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final void mo4353(InterfaceC12257 interfaceC12257) {
        m12126(interfaceC12257, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private long m12126(InterfaceC12257 interfaceC12257, boolean z) {
        C14268 c14268Mo28282;
        if (z) {
            c14268Mo28282 = new C14268();
        } else {
            c14268Mo28282 = interfaceC12257.mo28282();
        }
        List list = this.f13133;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c14268Mo28282.m56480writeByte(38);
            }
            String str = (String) list.get(i);
            c14268Mo28282.getClass();
            c14268Mo28282.m32781(0, str.length(), str);
            c14268Mo28282.m56480writeByte(61);
            String str2 = (String) this.f13134.get(i);
            c14268Mo28282.m32781(0, str2.length(), str2);
        }
        if (!z) {
            return 0L;
        }
        long size2 = c14268Mo28282.size();
        c14268Mo28282.m32780();
        return size2;
    }
}
