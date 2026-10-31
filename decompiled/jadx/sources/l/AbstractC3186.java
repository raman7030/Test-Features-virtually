package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3186 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC12358 f10052;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f10053;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f10054;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10051 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10050 = AbstractC9701.f29320;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo9801() {
        return 1;
    }

    public AbstractC3186(C10242 c10242, EnumC12358 enumC12358, Object obj) {
        this.f10054 = c10242;
        this.f10052 = enumC12358;
        this.f10053 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3637(InterfaceC1134 interfaceC1134, int i) {
        interfaceC1134.mo1968(this.f10054.m24657(i, this.f10052.m29986()));
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo3638(InterfaceC1134 interfaceC1134, int i) {
        interfaceC1134.mo1968(this.f10054.m24657(i, this.f10052.m29984()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m9799() {
        return this.f10051;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9800(IOException iOException) {
        this.f10051.add(iOException);
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo3639() {
        return String.valueOf(this.f10053);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3186)) {
            return false;
        }
        AbstractC3186 abstractC3186 = (AbstractC3186) obj;
        if (this.f10052 != abstractC3186.f10052) {
            return false;
        }
        return this.f10053.equals(abstractC3186.f10053);
    }

    public int hashCode() {
        return this.f10053.hashCode() + (this.f10052.hashCode() * 31);
    }

    public final String toString() {
        return "<CONSTANT " + this.f10052 + " " + mo3639() + ">";
    }
}
