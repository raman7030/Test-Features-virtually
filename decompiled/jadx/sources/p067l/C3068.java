package p067l;

import java.lang.ref.SoftReference;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.֡᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3068 {

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f5549;

    /* JADX INFO: renamed from: ۧ */
    public int f5550;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Object m5168() {
        Object obj;
        Object[] objArr = this.f5549;
        int i = this.f5550;
        obj = objArr[i];
        objArr[i] = null;
        this.f5550 = (i - 1) & SecP521R1Field.P16;
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m5169(SoftReference softReference) {
        int i = (this.f5550 + 1) & SecP521R1Field.P16;
        this.f5550 = i;
        this.f5549[i] = softReference;
    }

    public C3068() {
        this.f5549 = new Object[512];
        this.f5550 = 0;
    }

    public /* synthetic */ C3068(int i) {
        this();
    }
}
