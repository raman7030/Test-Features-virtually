package p067l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.function.BooleanSupplier;
import net.p069sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֨ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB70 */
/* JADX INFO: loaded from: classes2.dex */
public class C3494 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ۗ */
    public boolean f7039;

    /* JADX INFO: renamed from: ۙ */
    public String f7040;

    /* JADX INFO: renamed from: ۤ */
    public boolean f7041;

    /* JADX INFO: renamed from: ۫ */
    public boolean f7042;

    /* JADX INFO: renamed from: ۬ */
    public BooleanSupplier f7043 = new C2823();

    /* JADX INFO: renamed from: ᩶ */
    public Iterator f7044;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f7045;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f7046;

    public C3494(AbstractActivityC5549 abstractActivityC5549) {
        this.f7045 = abstractActivityC5549;
    }

    /* JADX INFO: renamed from: ܺ */
    public void m6243(String str) {
        this.f7040 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m6240(BooleanSupplier booleanSupplier) {
        this.f7043 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean m6245() {
        return this.f7041;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public String m6242() {
        if (TextUtils.isEmpty(this.f7040)) {
            return null;
        }
        return this.f7040;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean mo6244() {
        return this.f7046;
    }

    /* JADX INFO: renamed from: ᩺ */
    public boolean m6246() {
        return this.f7039;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean m6241() {
        return this.f7042;
    }

    @Override // net.p069sf.sevenzipjbinding.ICryptoGetTextPassword
    public String cryptoGetTextPassword() throws SevenZipException {
        m6239();
        this.f7041 = true;
        if (TextUtils.isEmpty(this.f7040)) {
            if (this.f7044 == null) {
                this.f7044 = C12248.m28245();
            }
            if (this.f7044.hasNext()) {
                this.f7040 = (String) this.f7044.next();
                this.f7039 = true;
                this.f7042 = false;
            } else {
                this.f7039 = false;
                C13848 c13848 = new C13848(this.f7045, new InterfaceC14518() { // from class: l.ۚܳᩳ
                    @Override // p067l.InterfaceC14518
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo17414(String str) {
                        this.f19736.f7040 = str;
                    }
                });
                c13848.m31525(this.f7043);
                boolean zM31526 = c13848.m31526();
                this.f7042 = zM31526;
                this.f7046 = true ^ zM31526;
                m6239();
            }
        } else {
            this.f7039 = false;
            this.f7042 = false;
        }
        m6239();
        return this.f7040;
    }

    /* JADX INFO: renamed from: ᩶֫ */
    private void m6239() throws SevenZipException {
        if (this.f7046 || this.f7043.getAsBoolean()) {
            this.f7046 = true;
            throw new SevenZipException("Cancel");
        }
    }
}
