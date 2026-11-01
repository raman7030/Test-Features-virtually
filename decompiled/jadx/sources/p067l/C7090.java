package p067l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I78P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7090 {

    /* JADX INFO: renamed from: ֫ */
    public final int f18487;

    /* JADX INFO: renamed from: ܳ */
    public final int f18489;

    /* JADX INFO: renamed from: ܿ */
    public final int f18491;

    /* JADX INFO: renamed from: ᩳ */
    public final int f18492;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f18490 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f18488 = new ArrayList();

    public C7090(int i, int i2, int i3, int i4, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        this.f18487 = i;
        this.f18489 = i2;
        this.f18491 = i3;
        this.f18492 = i4;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            this.f18490.add((String) it.next());
        }
        Iterator it2 = abstractCollection2.iterator();
        while (it2.hasNext()) {
            this.f18488.add((String) it2.next());
        }
    }
}
