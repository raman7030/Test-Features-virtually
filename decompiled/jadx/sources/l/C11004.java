package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11004 implements InterfaceC20196 {
    public volatile /* synthetic */ Object _rootCause;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23703 f33101;
    public volatile /* synthetic */ int _isCompleting = 0;
    public volatile /* synthetic */ Object _exceptionsHolder = null;

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ᩳ */
    public final C23703 mo20125() {
        return this.f33101;
    }

    public C11004(C23703 c23703, Throwable th) {
        this.f33101 = c23703;
        this._rootCause = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m27327() {
        return this._isCompleting;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m27328() {
        this._isCompleting = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m27322() {
        return (Throwable) this._rootCause;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27323(Throwable th) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27325() {
        return ((Throwable) this._rootCause) != null;
    }

    @Override // l.InterfaceC20196
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo20124() {
        return ((Throwable) this._rootCause) == null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27324(Throwable th) {
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
        this._exceptionsHolder = C17353.f53154;
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m27326() {
        return this._exceptionsHolder == C17353.f53154;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + m27325() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f33101 + ']';
    }
}
