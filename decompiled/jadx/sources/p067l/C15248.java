package p067l;

import java.io.Serializable;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܰۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C15248 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumSet f43510;

    public C15248(EnumSet enumSet) {
        this.f43510 = enumSet;
    }

    public Object readResolve() {
        return new C9214(this.f43510.clone(), 0);
    }
}
