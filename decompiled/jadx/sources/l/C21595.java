package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21595 extends AbstractC20184 implements InterfaceC1133 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21595 f69344;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f69345;

    @Override // l.InterfaceC15243
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1133 mo36203() {
        return this;
    }

    @Override // l.InterfaceC15243
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo36204() {
        return true;
    }

    public C21595(String str, int i, Map map, C21595 c21595) {
        super(map, i, str);
        this.f69344 = c21595;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48774(int i) {
        if (isClosed()) {
            return;
        }
        this.f65320 = i;
        ArrayList arrayList = this.f69345;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C21595) it.next()).m48774(i);
            }
        }
    }

    @Override // l.InterfaceC1133
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1133 mo3871() {
        return this.f69344;
    }

    @Override // l.InterfaceC1133
    /* JADX INFO: renamed from: ᩳ */
    public final List mo3872() {
        ArrayList arrayList = this.f69345;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC20184, l.InterfaceC15243
    public final Map attributes() {
        return this.f65319;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.f65321);
        sb.append("', start=");
        sb.append(this.f65322);
        sb.append(", end=");
        sb.append(this.f65320);
        sb.append(", attributes=");
        sb.append(this.f65319);
        sb.append(", parent=");
        C21595 c21595 = this.f69344;
        sb.append(c21595 != null ? c21595.f65321 : null);
        sb.append(", children=");
        sb.append(this.f69345);
        sb.append('}');
        return sb.toString();
    }
}
