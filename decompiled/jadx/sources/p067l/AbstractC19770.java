package p067l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9US */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19770 {

    /* JADX INFO: renamed from: ܳ */
    public boolean f60136;

    /* JADX INFO: renamed from: ܿ */
    public int f60138;

    /* JADX INFO: renamed from: ᩳ */
    public int f60139;

    /* JADX INFO: renamed from: ᩻ */
    public final List f60140 = C21562.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۧ */
    public final List f60135 = C21562.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ܽ */
    public final List f60137 = C21562.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ֫ */
    public final List f60134 = C21562.synchronizedList(new LinkedList());

    public AbstractC19770(int i, int i2, boolean z) {
        this.f60139 = i;
        this.f60138 = i2;
        this.f60136 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44921() {
        if (this.f60136) {
            return 0;
        }
        return this.f60138;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44916(int i) {
        this.f60138 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m44919() {
        return this.f60139;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44910(int i) {
        this.f60139 = i;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m44922() {
        return this.f60136;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m44912() {
        return this.f60134.size() + (this.f60137.size() + (this.f60135.size() + this.f60140.size())) == 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m44917() {
        return this.f60140;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m44909() {
        List list = this.f60135;
        int size = list.size();
        List list2 = this.f60137;
        int size2 = list2.size() + size;
        List list3 = this.f60134;
        ArrayList arrayList = new ArrayList(list3.size() + size2);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m44915() {
        return this.f60135;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m44911() {
        return (this.f60139 & 15) == 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m44920() {
        return (this.f60139 & 30720) >> 11;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m44918() {
        return (this.f60139 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m44923() {
        return (this.f60139 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m44914() {
        return (this.f60139 & 32768) == 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m44913() {
        return (this.f60139 & 32768) == 32768;
    }
}
