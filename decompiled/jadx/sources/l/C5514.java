package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5514 extends AbstractC8343 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 f17070;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17071;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f17072;

    public C5514(InterfaceC9922 interfaceC9922, InterfaceC4277 interfaceC4277, ArrayList arrayList) throws C3059 {
        super((AbstractC9049) interfaceC9922);
        this.f17071 = new ArrayList();
        this.f25568 = interfaceC4277.mo12848();
        this.f17070 = interfaceC4277;
        this.f25566 = interfaceC4277.mo12858();
        this.f25565 = interfaceC4277.getPackageName();
        this.f17072 = new ArrayList(interfaceC4277.mo12853());
        HashSet hashSet = new HashSet();
        for (InterfaceC0748 c1280 : interfaceC4277.mo12850()) {
            ArrayList arrayListM15645 = m15645(arrayList, c1280.mo2870());
            ArrayList arrayList2 = this.f17071;
            if (hashSet.add(Integer.valueOf(c1280.mo2870())) && !arrayListM15645.isEmpty()) {
                c1280 = new C1280(this, c1280, c1280.mo2870(), arrayListM15645);
            }
            arrayList2.add(c1280);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            int i = (c4103.f13041 >>> 16) & 255;
            if (i == 0) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch type ID is invalid.");
            }
            if (hashSet.add(Integer.valueOf(i))) {
                while (this.f17072.size() < i) {
                    this.f17072.add("?" + (this.f17072.size() + 1));
                }
                this.f17072.set(i - 1, c4103.f13045);
                this.f17071.add(new C1280(this, null, i, m15645(arrayList, i)));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m15645(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            if (((c4103.f13041 >>> 16) & 255) == i) {
                arrayList2.add(c4103);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۗ */
    public final int mo12851() {
        return this.f17071.size();
    }

    @Override // l.InterfaceC4277
    public final InterfaceC0748 getType(int i) {
        return (InterfaceC0748) this.f17071.get(i);
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo12853() {
        return this.f17072;
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ۖۧ */
    public final Iterable mo12850() {
        return this.f17071;
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo12854() {
        return this.f17070.mo12854();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC9216 mo12849(int i) {
        return this.f17070.mo12849(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ۠ۧ */
    public final Iterable mo12855() {
        return this.f17070.mo12855();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֡ */
    public final int mo12844() {
        return this.f17070.mo12844();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC16270 mo12856(int i) {
        return this.f17070.mo12856(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ֡֫ */
    public final Iterable mo12845() {
        return this.f17070.mo12845();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo12846() {
        return this.f17070.mo12846();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19094 mo12852(int i) {
        return this.f17070.mo12852(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo12857() {
        return this.f17070.mo12857();
    }
}
