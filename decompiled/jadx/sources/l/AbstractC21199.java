package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21199 implements InterfaceC2148, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;

    @Override // l.InterfaceC2148
    public String getName() {
        return null;
    }

    public Object readResolve() {
        return C11321.m27962(getName());
    }
}
