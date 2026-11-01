package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12126 extends C8792 {

    /* JADX INFO: renamed from: ۙ */
    public int f33887;

    /* JADX INFO: renamed from: ᩶ */
    public TreeMap f33888;

    public C12126(C5263 c5263, EnumC6799 enumC6799, int i) {
        TreeMap treeMap = new TreeMap();
        super(c5263, enumC6799);
        this.f33887 = i;
        this.f33888 = treeMap;
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        int length = 1;
        for (int i = 0; i < this.f33887; i++) {
            ArrayList arrayList = (ArrayList) this.f33888.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    length += ((InterfaceC4079) it.next()).getLength();
                }
            }
            length += 2;
        }
        return length;
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        C8121 c8121 = (C8121) interfaceC2756;
        int i = this.f33887;
        c8121.m18811(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) this.f33888.get(Integer.valueOf(i2));
            if (arrayList != null) {
                c8121.m18818(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4079) it.next()).mo5157(c8121);
                }
            } else {
                c8121.m18818(0);
            }
        }
    }
}
