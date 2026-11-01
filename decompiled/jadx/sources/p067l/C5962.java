package p067l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ۘۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B929 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5962 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public final int f14752;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14753;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C5962(Point point, String str) {
        this(null, point.x, point.y, str);
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13373(C14146 c14146) {
        C20699.m46760(this.f14753, this.f14752).m46768(c14146);
    }

    public C5962(String str, int i, int i2, String str2) {
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
        this.f14753 = i;
        this.f14752 = i2;
    }
}
