package p067l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17824 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ List f53189;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC19837 f53190;

    public C17824(InterfaceC19837 interfaceC19837, List list) {
        this.f53190 = interfaceC19837;
        this.f53189 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return C23190.m51662(this.f53190, this.f53189.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53189.size();
    }
}
