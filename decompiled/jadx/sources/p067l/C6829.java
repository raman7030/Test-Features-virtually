package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes2.dex */
public final class C6829 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f17743 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f17744 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final C5488 m15643() {
        return new C5488(this.f17743, this.f17744);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15644(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str2 == null) {
            throw new NullPointerException("value == null");
        }
        this.f17743.add(C13535.m30804(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
        this.f17744.add(C13535.m30804(str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
    }
}
