package p067l;

import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7D2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21279 implements InterfaceC5185 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f66934 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f66935;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC24904 f66936;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC3446 f66937;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15242 f66938;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f66939;

    /* JADX INFO: renamed from: ۧ */
    public void mo13869(long j, String str, Object... objArr) {
        throw new C14572();
    }

    @Override // p067l.InterfaceC5185
    /* JADX INFO: renamed from: ֫ */
    public void mo11117(long j, String str, Object... objArr) {
        throw new C14572();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m48080() {
        return this.f66935;
    }

    public AbstractC21279(AbstractC23290 abstractC23290) {
        this.f66937 = abstractC23290.f73282;
        this.f66938 = abstractC23290.f73281;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo4612(String str, Object... objArr) {
        throw new C14572();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13867(InterfaceC24904 interfaceC24904) {
        this.f66936 = interfaceC24904;
        this.f66938.mo16533(interfaceC24904);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m48085() {
        this.f66935 = true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m48091() {
        return this.f66934;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m48079() {
        this.f66934 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m48088() {
        String strM34701 = this.f66938.m34701();
        return strM34701.contains(".") ? strM34701.substring(0, strM34701.indexOf(46)) : strM34701;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m48089() {
        return this.f66938.m34701();
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC24904 m48084() {
        return this.f66936;
    }

    /* JADX INFO: renamed from: ֫ */
    public final DataInputStream m48072() {
        C12826.requireNonNull(this.f66936, "Input must be defined.");
        return this.f66936.mo8317(C18189.m41402of(this));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48090(String str, Object... objArr) {
        if (this.f66935) {
            AbstractC16856 abstractC16856 = this.f66938.f43502;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC16856.mo23662(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48074(Supplier supplier) {
        if (this.f66935) {
            this.f66938.f43502.mo23662((String) supplier.get());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48087(String str, Object... objArr) {
        if (this.f66935) {
            AbstractC16856 abstractC16856 = this.f66938.f43502;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC16856.mo23663(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13866(String str, Object... objArr) {
        this.f66938.mo34699(str, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48073(Throwable th) {
        this.f66938.mo34700(th);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m48081(String str, Object... objArr) {
        return this.f66938.mo16534(str, objArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48083(Throwable th) {
        if (this.f66939) {
            this.f66938.f43502.mo23659(th);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC3446 m48092() {
        return this.f66937;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48075(C4788 c4788) {
        this.f66937 = c4788;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m48078() {
        return this.f66939;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m48077() {
        this.f66939 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48076(C10152 c10152) {
        this.f66938.f43502 = c10152;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15242 m48082() {
        return this.f66938;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16856 m48086() {
        return this.f66938.f43502;
    }
}
