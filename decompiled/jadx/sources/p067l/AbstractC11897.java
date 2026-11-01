package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۤۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5U2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11897 extends AbstractC11500 implements InterfaceC4560, InterfaceC4108 {
    public static final long serialVersionUID = 912559;

    @Override // p067l.InterfaceC4560
    /* JADX INFO: renamed from: ᩳ */
    public abstract AbstractC11897 mo9635();

    /* JADX INFO: renamed from: ᩻ */
    public static C14578 m27218() {
        return new C14578(4);
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Collection values() {
        return mo9635().keySet();
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final AbstractC23966 values() {
        return mo9635().keySet();
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC23966 mo20046() {
        throw new AssertionError("should never be called");
    }

    @Override // p067l.AbstractC11500
    public Object writeReplace() {
        return new C13908(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
