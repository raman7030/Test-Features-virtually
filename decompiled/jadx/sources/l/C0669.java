package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0669 extends AbstractC22542 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f2581;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f2582;

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2718(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo2719(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo2721() {
        return true;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        String str = this.f2582;
        if (!(abstractC22542 instanceof C0669)) {
            return false;
        }
        C0669 c0669 = (C0669) abstractC22542;
        String str2 = c0669.f2582;
        String str3 = c0669.f2581;
        String str4 = this.f2581;
        if (str4 != null || str3 == null) {
            return (str != null || str2 == null) && str4.equals(str3) && str.equals(str2);
        }
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2717(C17603 c17603) {
        String str = this.f2581 + " " + this.f2582;
        c17603.m41145(str.length(), str);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20095 mo2715(boolean z) {
        HashMap map = new HashMap(2);
        map.put(am.w, this.f2581);
        map.put(am.x, this.f2582);
        return new C20095(C20195.unmodifiableMap(this.f40739), 0, 0, 0, z, C15839.m37498(map));
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15154 mo2714(C8806 c8806) {
        C20095 c20095Mo2715 = mo2715(false);
        c20095Mo2715.m46326(c8806);
        return new C15154(c8806, c20095Mo2715.mo25446(), c20095Mo2715.getName(), c20095Mo2715);
    }

    @Override // l.AbstractC22542, l.AbstractC13660
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2716(StringBuilder sb) {
        super.mo2716(sb);
        sb.append(" cpu: '");
        sb.append(this.f2581);
        sb.append("' os: '");
        sb.append(this.f2582);
        sb.append('\'');
    }
}
