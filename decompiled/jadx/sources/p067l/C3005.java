package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3005 extends AbstractC23793 {

    /* JADX INFO: renamed from: ۘ */
    public String f5354;

    /* JADX INFO: renamed from: ᩴ */
    public String f5355;

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5057(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5058(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5060() {
        return true;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5059(AbstractC23793 abstractC23793) {
        String str = this.f5355;
        if (!(abstractC23793 instanceof C3005)) {
            return false;
        }
        C3005 c3005 = (C3005) abstractC23793;
        String str2 = c3005.f5355;
        String str3 = c3005.f5354;
        String str4 = this.f5354;
        if (str4 != null || str3 == null) {
            return (str != null || str2 == null) && str4.equals(str3) && str.equals(str2);
        }
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final void mo5056(C19099 c19099) {
        String str = this.f5354 + " " + this.f5355;
        c19099.m43391(str.length(), str);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C21467 mo5054(boolean z) {
        HashMap map = new HashMap(2);
        map.put(C0655am.f2362w, this.f5354);
        map.put(C0655am.f2363x, this.f5355);
        return new C21467(C21562.unmodifiableMap(this.f43820), 0, 0, 0, z, C17422.m39670(map));
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C16771 mo5053(C10738 c10738) {
        C21467 c21467Mo5054 = mo5054(false);
        c21467Mo5054.m48642(c10738);
        return new C16771(c10738, c21467Mo5054.mo27466(), c21467Mo5054.getName(), c21467Mo5054);
    }

    @Override // p067l.AbstractC23793, p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo5055(StringBuilder sb) {
        super.mo5055(sb);
        sb.append(" cpu: '");
        sb.append(this.f5354);
        sb.append("' os: '");
        sb.append(this.f5355);
        sb.append('\'');
    }
}
