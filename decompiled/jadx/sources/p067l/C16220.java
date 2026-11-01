package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16220 extends AbstractC10857 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f47723;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10857 f47724;

    /* JADX INFO: renamed from: ܽ */
    public final List f47725;

    /* JADX INFO: renamed from: ᩳ */
    public final List f47726;

    public C16220(ArrayList arrayList, ArrayList arrayList2, AbstractC10857 abstractC10857, ArrayList arrayList3) {
        this.f47726 = arrayList;
        this.f47723 = arrayList2;
        this.f47724 = abstractC10857;
        this.f47725 = arrayList3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC10857.m25018(sb, "<", this.f47726, "> ");
        sb.append(this.f47724);
        AbstractC10857.m25017(sb, " (", this.f47723, MotionUtils.EASING_TYPE_FORMAT_END);
        AbstractC10857.m25018(sb, " throws ", this.f47725, "");
        return sb.toString();
    }
}
