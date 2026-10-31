package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16262 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f50020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18380 f50021;

    public C16262(InterfaceC18380 interfaceC18380, List list) {
        this.f50021 = interfaceC18380;
        this.f50020 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return C21908.m49309(this.f50021, this.f50020.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50020.size();
    }
}
