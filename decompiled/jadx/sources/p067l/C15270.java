package p067l;

import bin.p000mt.plus.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15270 implements InterfaceC10319 {

    /* JADX INFO: renamed from: ֫ */
    public List f43570;

    /* JADX INFO: renamed from: ۧ */
    public List f43571;

    /* JADX INFO: renamed from: ܽ */
    public final List f43572;

    @Override // p067l.InterfaceC10319
    public final String getId() {
        return ":dictionary:translator";
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final int mo8693(int i, String str) {
        return -1;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final void mo8695() {
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final void mo8696(int i) {
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8697() {
        return false;
    }

    public C15270() {
        m34744(C4069.m8151());
        this.f43572 = Arrays.asList(new C7637("f", C7050.m16224(R.string.MT_Protector)), new C7637("r", C7050.m16224(R.string.MT_Protector)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34744(List list) {
        List list2 = this.f43570;
        if (list2 != null && list2.equals(list)) {
            return false;
        }
        this.f43570 = list;
        this.f43571 = list.isEmpty() ? Collections.singletonList(new C7637("", "----")) : (List) C7480.stream(list).map(new C22966(1)).collect(C24205.toList());
        return true;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ᩳ */
    public final List mo8700() {
        return this.f43571;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ܽ */
    public final List mo8698() {
        return this.f43572;
    }

    @Override // p067l.InterfaceC10319
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15012 mo8694(C3613 c3613, C3613 c3614) {
        return new C23988(this.f43570.isEmpty() ? null : (C21249) this.f43570.get(c3613.f7481), c3614.f7481 == 0);
    }

    public final String toString() {
        return C7050.m16224(R.string.MT_Protector);
    }
}
