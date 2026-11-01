package p067l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۧ */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0965 {

    /* JADX INFO: renamed from: ֫ */
    public long f10683;

    /* JADX INFO: renamed from: ۜ */
    public long f10684;

    /* JADX INFO: renamed from: ۡ */
    public long f10685;

    /* JADX INFO: renamed from: ۢ */
    public int f10686;

    /* JADX INFO: renamed from: ۧ */
    public long f10687;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f10688;

    /* JADX INFO: renamed from: ܽ */
    public long f10689;

    /* JADX INFO: renamed from: ܿ */
    public int f10690;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f10691;

    /* JADX INFO: renamed from: ᩷ */
    public float f10692;

    /* JADX INFO: renamed from: ᩻ */
    public Bundle f10693;

    public C0965() {
        this.f10691 = new ArrayList();
        this.f10687 = -1L;
    }

    public C0965(C1805 c1805) {
        ArrayList arrayList = new ArrayList();
        this.f10691 = arrayList;
        this.f10687 = -1L;
        this.f10686 = c1805.f65416;
        this.f10684 = c1805.f65415;
        this.f10692 = c1805.f65414;
        this.f10685 = c1805.f65419;
        this.f10689 = c1805.f65420;
        this.f10683 = c1805.f65421;
        this.f10690 = c1805.f65412;
        this.f10688 = c1805.f65418;
        ArrayList arrayList2 = c1805.f65413;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        this.f10687 = c1805.f65422;
        this.f10693 = c1805.f65417;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10004(int i, long j, float f, long j2) {
        this.f10686 = i;
        this.f10684 = j;
        this.f10685 = j2;
        this.f10692 = f;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10005() {
        this.f10683 = 822L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1805 m10003() {
        return new C1805(this.f10686, this.f10684, this.f10689, this.f10692, this.f10683, this.f10690, this.f10688, this.f10685, this.f10691, this.f10687, this.f10693);
    }
}
