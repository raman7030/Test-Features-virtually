package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22892 extends AbstractC21551 implements InterfaceC3445 {

    /* JADX INFO: renamed from: ܳ */
    public final C22892 f72048;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f72049;

    @Override // p067l.InterfaceC16855
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3445 mo38364() {
        return this;
    }

    @Override // p067l.InterfaceC16855
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo38365() {
        return true;
    }

    public C22892(String str, int i, Map map, C22892 c22892) {
        super(map, i, str);
        this.f72048 = c22892;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51121(int i) {
        if (isClosed()) {
            return;
        }
        this.f67968 = i;
        ArrayList arrayList = this.f72049;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C22892) it.next()).m51121(i);
            }
        }
    }

    @Override // p067l.InterfaceC3445
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3445 mo6112() {
        return this.f72048;
    }

    @Override // p067l.InterfaceC3445
    /* JADX INFO: renamed from: ᩳ */
    public final List mo6113() {
        ArrayList arrayList = this.f72049;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.AbstractC21551, p067l.InterfaceC16855
    public final Map attributes() {
        return this.f67967;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.f67969);
        sb.append("', start=");
        sb.append(this.f67970);
        sb.append(", end=");
        sb.append(this.f67968);
        sb.append(", attributes=");
        sb.append(this.f67967);
        sb.append(", parent=");
        C22892 c22892 = this.f72048;
        sb.append(c22892 != null ? c22892.f67969 : null);
        sb.append(", children=");
        sb.append(this.f72049);
        sb.append('}');
        return sb.toString();
    }
}
