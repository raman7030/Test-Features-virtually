package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17643 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f53945;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53946;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f53949 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f53947 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f53948 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53944 = BasicLabelFormatter.MILLION;

    public C17643(long j) {
        this.f53945 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41292() throws C13842 {
        int i = this.f53946 + 1;
        this.f53946 = i;
        if (i > this.f53944) {
            throw new C13842("Recovery graph node limit exceeded");
        }
    }
}
