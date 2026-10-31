package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16789 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f51552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23761 f51553;

    public /* synthetic */ C16789(List list, C23761 c23761) {
        this.f51552 = list;
        this.f51553 = c23761;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        int size;
        C11146 c11146;
        C15293 c15293 = (C15293) obj;
        int i = ActivityC0477.f2061;
        List list = this.f51552;
        if (list.isEmpty()) {
            size = list.size();
        } else {
            C15293 c15294 = (C15293) C7166.m19188(1, list);
            if (c15294.f46926.m27662() == 22 || ((c11146 = c15294.f46925) != null && c11146.m27662() == 22)) {
                size = list.size() - 1;
            } else {
                size = list.size();
            }
        }
        list.add(size, c15293);
        C23761 c23761 = this.f51553;
        c23761.f76915.notifyItemInserted(size);
        c23761.f76923.smoothScrollToPosition(size);
        C8239.m21822();
    }
}
