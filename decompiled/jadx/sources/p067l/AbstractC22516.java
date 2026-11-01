package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22516 implements InterfaceC4410, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;

    @Override // p067l.InterfaceC4410
    public String getName() {
        return null;
    }

    public Object readResolve() {
        return C13128.m30023(getName());
    }
}
