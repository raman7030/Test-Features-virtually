package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C22461 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public String f70850;

    /* JADX INFO: renamed from: ۧ */
    public Pattern f70851;

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        String str = this.f70850;
        return c211910.mo27069(str) && this.f70851.matcher(c211910.mo27065(str)).find();
    }

    public final String toString() {
        return C21459.m48622("[", this.f70850, "~=", this.f70851.toString(), "]");
    }
}
