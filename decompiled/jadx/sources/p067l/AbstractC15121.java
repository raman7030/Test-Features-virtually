package p067l;

/* JADX INFO: renamed from: l.۬᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15121 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC5734 f43176;

    /* JADX INFO: renamed from: ۧ */
    public Object f43177;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8374(C14192 c14192);

    public AbstractC15121(EnumC5734 enumC5734) {
        this.f43176 = enumC5734;
    }

    public AbstractC15121(EnumC5734 enumC5734, Object obj) {
        this.f43176 = enumC5734;
        this.f43177 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC5734 m34536() {
        return this.f43176;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m34537() {
        return this.f43177;
    }

    public final String toString() {
        return "AvPair{avId=" + this.f43176.name() + ", value=" + this.f43177 + '}';
    }
}
