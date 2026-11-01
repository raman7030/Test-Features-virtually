package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C19137 {

    /* JADX INFO: renamed from: ۧ */
    public final long f57138;

    /* JADX INFO: renamed from: ܳ */
    public int f57139;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f57142 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f57140 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f57141 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final int f57137 = BasicLabelFormatter.MILLION;

    public C19137(long j) {
        this.f57138 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43538() throws C15524 {
        int i = this.f57139 + 1;
        this.f57139 = i;
        if (i > this.f57137) {
            throw new C15524("Recovery graph node limit exceeded");
        }
    }
}
