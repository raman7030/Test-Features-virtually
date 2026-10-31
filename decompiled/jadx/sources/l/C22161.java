package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes.dex */
public final class C22161 extends AbstractC10771 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f71922;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f71923;

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final int mo1336() {
        return this.f71923.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final int mo1334() {
        return this.f71922.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1337(int i, int i2) {
        return ((AbstractC3817) this.f71923.get(i)).m11544() == ((AbstractC3817) this.f71922.get(i2)).m11544();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1335(int i, int i2) {
        return this.f71923.get(i) == this.f71922.get(i2);
    }

    public C22161(ArrayList arrayList, ArrayList arrayList2) {
        this.f71923 = arrayList;
        this.f71922 = arrayList2;
    }
}
