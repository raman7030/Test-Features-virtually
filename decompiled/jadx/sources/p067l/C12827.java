package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12827 implements InterfaceC21563 {
    public volatile /* synthetic */ Object _rootCause;

    /* JADX INFO: renamed from: ᩸ */
    public final C24896 f36095;
    public volatile /* synthetic */ int _isCompleting = 0;
    public volatile /* synthetic */ Object _exceptionsHolder = null;

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ᩳ */
    public final C24896 mo22101() {
        return this.f36095;
    }

    public C12827(C24896 c24896, Throwable th) {
        this.f36095 = c24896;
        this._rootCause = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: ܿ */
    public final boolean m29389() {
        return this._isCompleting;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m29390() {
        this._isCompleting = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Throwable m29384() {
        return (Throwable) this._rootCause;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29385(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
            return;
        }
        if (th == th2) {
            return;
        }
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th;
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        this._exceptionsHolder = arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29387() {
        return ((Throwable) this._rootCause) != null;
    }

    @Override // p067l.InterfaceC21563
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22100() {
        return ((Throwable) this._rootCause) == null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m29386(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj != null) {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList(4);
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !th.equals(th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = C18861.f56338;
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m29388() {
        return this._exceptionsHolder == C18861.f56338;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + m29387() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f36095 + ']';
    }
}
