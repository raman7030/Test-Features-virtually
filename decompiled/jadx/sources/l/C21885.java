package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes.dex */
public final class C21885 extends C22590 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f70065;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f70066;

    public C21885(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC14545.of());
    }

    public C21885(String str, C21885 c21885, String str2, long j, int i, long j2, C19643 c19643, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, c21885, j, i, j2, c19643, str3, str4, j3, j4, z);
        this.f70065 = str2;
        this.f70066 = AbstractC14545.copyOf((Collection) list);
    }
}
