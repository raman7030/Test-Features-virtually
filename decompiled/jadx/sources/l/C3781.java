package l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ۘۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B929 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f11946;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11947;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C3781(Point point, String str) {
        this(null, point.x, point.y, str);
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11437(C12392 c12392) {
        C19287.m44466(this.f11947, this.f11946).m44474(c12392);
    }

    public C3781(String str, int i, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("[");
            sb.append(str);
            sb.append("] line ");
            sb.append(i);
            if (i2 > 0) {
                sb.append(':');
                sb.append(i2 + 1);
            }
        } else if (i2 > 0) {
            sb.append('[');
            sb.append(i);
            sb.append(':');
            sb.append(i2 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(i);
            sb.append(']');
        }
        if (str2 != null && !str2.isEmpty()) {
            sb.append(' ');
            sb.append(str2);
        }
        super(sb.toString());
        this.f11947 = i;
        this.f11946 = i2;
    }
}
