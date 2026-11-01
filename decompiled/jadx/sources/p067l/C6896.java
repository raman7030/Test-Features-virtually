package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6896 extends AbstractC5555 implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21649(this);
    }

    public final String toString() {
        return "Directory{fileId=" + this.f13423 + ", fileName='" + this.f13422.m41324() + "'}";
    }
}
