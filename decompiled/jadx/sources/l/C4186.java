package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5G1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4186 extends AbstractC8891 implements InterfaceC11616 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f13637;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12652 f13638;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f13639;

    public C4186(String str, C12652 c12652) {
        int i;
        this.f13637 = str;
        this.f13638 = c12652;
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f13639 = i;
    }

    @Override // l.InterfaceC4060
    public final String getName() {
        return this.f13637;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19583 mo12184() {
        return ((C14437) this.f13638.f38107.get(0)).f44252;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ܺ */
    public final String mo12183() {
        return ((InterfaceC17507) this.f13638.f38107.get(1)).getValue();
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC0531 mo12182() {
        return ((C23610) this.f13638.f38107.get(2)).f76529;
    }

    @Override // l.InterfaceC4060
    /* JADX INFO: renamed from: ۢ */
    public final List mo12181() {
        C12652 c12652 = this.f13638;
        if (c12652.f38107.size() <= 3) {
            return AbstractC14545.of();
        }
        List list = c12652.f38107;
        return list.subList(3, list.size());
    }

    @Override // l.InterfaceC4060
    public final int getIndex() {
        return this.f13639;
    }
}
