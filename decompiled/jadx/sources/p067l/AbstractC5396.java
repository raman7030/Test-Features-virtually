package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5396 {

    /* JADX INFO: renamed from: ܽ */
    public final EnumC14113 f12856;

    /* JADX INFO: renamed from: ܿ */
    public final Object f12857;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C12102 f12858;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f12855 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public int f12854 = AbstractC11588.f32269;

    /* JADX INFO: renamed from: ۧ */
    public int mo11846() {
        return 1;
    }

    public AbstractC5396(C12102 c12102, EnumC14113 enumC14113, Object obj) {
        this.f12858 = c12102;
        this.f12856 = enumC14113;
        this.f12857 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5908(InterfaceC3446 interfaceC3446, int i) {
        interfaceC3446.mo4344(this.f12858.m26671(i, this.f12856.m32047()));
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo5909(InterfaceC3446 interfaceC3446, int i) {
        interfaceC3446.mo4344(this.f12858.m26671(i, this.f12856.m32045()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m11844() {
        return this.f12855;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11845(IOException iOException) {
        this.f12855.add(iOException);
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo5910() {
        return String.valueOf(this.f12857);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5396)) {
            return false;
        }
        AbstractC5396 abstractC5396 = (AbstractC5396) obj;
        if (this.f12856 != abstractC5396.f12856) {
            return false;
        }
        return this.f12857.equals(abstractC5396.f12857);
    }

    public int hashCode() {
        return this.f12857.hashCode() + (this.f12856.hashCode() * 31);
    }

    public final String toString() {
        return "<CONSTANT " + this.f12856 + " " + mo5910() + ">";
    }
}
