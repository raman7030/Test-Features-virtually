package l;

import java.lang.ref.SoftReference;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.֡᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0736 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f2775;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2776;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Object m2839() {
        Object obj;
        Object[] objArr = this.f2775;
        int i = this.f2776;
        obj = objArr[i];
        objArr[i] = null;
        this.f2776 = (i - 1) & SecP521R1Field.P16;
        return obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m2840(SoftReference softReference) {
        int i = (this.f2776 + 1) & SecP521R1Field.P16;
        this.f2776 = i;
        this.f2775[i] = softReference;
    }

    public C0736() {
        this.f2775 = new Object[512];
        this.f2776 = 0;
    }

    public /* synthetic */ C0736(int i) {
        this();
    }
}
