package p067l;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8BO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16522 {

    /* JADX INFO: renamed from: ֫ */
    public final TreeMap f48558 = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized List m37489(C22559 c22559) {
        List list;
        if (this.f48558.isEmpty()) {
            list = null;
        } else {
            C22559 c225510 = (C22559) this.f48558.firstKey();
            if (c225510.compareTo(c22559) <= 0) {
                list = (List) this.f48558.remove(c225510);
            } else {
                list = null;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m37490(C22559 c22559, InterfaceC9817 interfaceC9817) {
        List linkedList = (List) this.f48558.get(c22559);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.f48558.put(c22559, linkedList);
        }
        linkedList.add(interfaceC9817);
    }
}
