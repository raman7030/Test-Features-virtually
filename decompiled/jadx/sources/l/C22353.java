package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C22353 extends C18744 implements Set, InterfaceC8886 {
    public static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }
}
