package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C23613 extends C20183 implements Set, InterfaceC10814 {
    public static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f62465a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f62465a.hashCode();
    }
}
