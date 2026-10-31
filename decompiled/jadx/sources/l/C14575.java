package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14575 extends AbstractC8932 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f44615;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 f44616;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f44617;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f44618;

    public C14575(ArrayList arrayList, ArrayList arrayList2, AbstractC8932 abstractC8932, ArrayList arrayList3) {
        this.f44618 = arrayList;
        this.f44615 = arrayList2;
        this.f44616 = abstractC8932;
        this.f44617 = arrayList3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC8932.m23044(sb, "<", this.f44618, "> ");
        sb.append(this.f44616);
        AbstractC8932.m23043(sb, " (", this.f44615, MotionUtils.EASING_TYPE_FORMAT_END);
        AbstractC8932.m23044(sb, " throws ", this.f44617, "");
        return sb.toString();
    }
}
