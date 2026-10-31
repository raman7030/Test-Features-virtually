package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12337 extends AbstractC10988 implements InterfaceC8999 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f36936 = EnumC0841.f3269;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f36937;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public C12337(ArrayList arrayList, int i) {
        super(f36936);
        if (arrayList == null) {
            this.f36937 = AbstractC14545.of();
            return;
        }
        this.f36937 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f36937.add(new C11632(this, i, (C17337) it.next()));
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC17301
    /* JADX INFO: renamed from: ۙ */
    public final List mo8107() {
        return this.f36937;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC7479, l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public final int mo3974() {
        return (this.f36937.size() * 2) + 4;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f36936.f3316;
    }
}
