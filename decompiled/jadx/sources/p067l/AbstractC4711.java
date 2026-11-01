package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37DX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4711 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC12758 f10653;

    /* JADX INFO: renamed from: ۧ */
    public Object f10654;

    /* JADX INFO: renamed from: ۧ */
    public int mo9989() {
        return 1;
    }

    public AbstractC4711(EnumC12758 enumC12758, Object obj) {
        this.f10653 = enumC12758;
        this.f10654 = obj;
    }

    public int hashCode() {
        Object obj = this.f10654;
        return this.f10653.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4711)) {
            return false;
        }
        AbstractC4711 abstractC4711 = (AbstractC4711) obj;
        return this.f10654.equals(abstractC4711.f10654) && this.f10653 == abstractC4711.f10653;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo9988(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4711)) {
            return false;
        }
        AbstractC4711 abstractC4711 = (AbstractC4711) obj;
        EnumC12758 enumC12758 = abstractC4711.f10653;
        Object obj2 = this.f10654;
        boolean z = obj2 instanceof C17450;
        EnumC12758 enumC12759 = this.f10653;
        if (!z) {
            return obj2.equals(abstractC4711.f10654) && enumC12759 == enumC12758;
        }
        Object obj3 = abstractC4711.f10654;
        return (obj3 instanceof C17450) && ((C17450) obj2).m39777(obj3) && enumC12759 == enumC12758;
    }

    public String toString() {
        return C21459.m48622("[", this.f10653.toString(), " : '", mo9986(), "']");
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo9986() {
        Object obj = this.f10654;
        return obj == null ? "?" : obj.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9987(InterfaceC2756 interfaceC2756) throws IOException {
        ((C8121) interfaceC2756).m18811((int) this.f10653.m29300());
    }
}
