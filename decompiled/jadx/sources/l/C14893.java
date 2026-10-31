package l;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8BO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14893 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeMap f45443 = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized List m35337(C21245 c21245) {
        List list;
        if (this.f45443.isEmpty()) {
            list = null;
        } else {
            C21245 c21246 = (C21245) this.f45443.firstKey();
            if (c21246.compareTo(c21245) <= 0) {
                list = (List) this.f45443.remove(c21246);
            } else {
                list = null;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m35338(C21245 c21245, InterfaceC7838 interfaceC7838) {
        List linkedList = (List) this.f45443.get(c21245);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.f45443.put(c21245, linkedList);
        }
        linkedList.add(interfaceC7838);
    }
}
