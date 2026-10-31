package l;

import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7D2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19898 implements InterfaceC2964 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64299 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC23712 f64301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC1134 f64302;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC13546 f64303;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f64304;

    /* JADX INFO: renamed from: ۧ */
    public void mo11949(long j, String str, Object... objArr) {
        throw new C12841();
    }

    @Override // l.InterfaceC2964
    /* JADX INFO: renamed from: ֫ */
    public void mo9065(long j, String str, Object... objArr) {
        throw new C12841();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m45768() {
        return this.f64300;
    }

    public AbstractC19898(AbstractC22014 abstractC22014) {
        this.f64302 = abstractC22014.f70569;
        this.f64303 = abstractC22014.f70568;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo2245(String str, Object... objArr) {
        throw new C12841();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11947(InterfaceC23712 interfaceC23712) {
        this.f64301 = interfaceC23712;
        this.f64303.mo14625(interfaceC23712);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m45773() {
        this.f64300 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45779() {
        return this.f64299;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m45767() {
        this.f64299 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m45776() {
        String strM32598 = this.f64303.m32598();
        return strM32598.contains(".") ? strM32598.substring(0, strM32598.indexOf(46)) : strM32598;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m45777() {
        return this.f64303.m32598();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23712 m45772() {
        return this.f64301;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DataInputStream m45760() {
        C11003.requireNonNull(this.f64301, "Input must be defined.");
        return this.f64301.mo6119(C16646.of(this));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45778(String str, Object... objArr) {
        if (this.f64300) {
            AbstractC15244 abstractC15244 = this.f64303.f40432;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC15244.mo21693(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45762(Supplier supplier) {
        if (this.f64300) {
            this.f64303.f40432.mo21693((String) supplier.get());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45775(String str, Object... objArr) {
        if (this.f64300) {
            AbstractC15244 abstractC15244 = this.f64303.f40432;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC15244.mo21694(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11946(String str, Object... objArr) {
        this.f64303.mo32596(str, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45761(Throwable th) {
        this.f64303.mo32597(th);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m45769(String str, Object... objArr) {
        return this.f64303.mo14626(str, objArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45771(Throwable th) {
        if (this.f64304) {
            this.f64303.f40432.mo21690(th);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC1134 m45780() {
        return this.f64302;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45763(C2546 c2546) {
        this.f64302 = c2546;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m45766() {
        return this.f64304;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45765() {
        this.f64304 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45764(C8190 c8190) {
        this.f64303.f40432 = c8190;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13546 m45770() {
        return this.f64303;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15244 m45774() {
        return this.f64303.f40432;
    }
}
