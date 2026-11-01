package p067l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7V8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10725 extends AbstractC19442 {

    /* JADX INFO: renamed from: ۖ */
    public byte[] f29707;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f29708;

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo24663();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo24664();

    public AbstractC10725(C23780 c23780, byte[] bArr, byte[] bArr2) {
        super(c23780);
        this.f29708 = bArr;
        this.f29707 = bArr2;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9933(byte[] bArr) {
        int i = this.f59223;
        C23780 c23780 = this.f59228;
        if (i == 2 || i == 5) {
            C17823 c17823 = new C17823(bArr);
            c17823.m40465(bArr.length);
            try {
                this.f29707 = c17823.m40453(1, "")[0];
                return true;
            } catch (C14392 unused) {
                c23780.getClass();
                C21769.f68542.getClass();
                return false;
            }
        }
        if (i == 4) {
            try {
                C17823 c17824 = new C17823(bArr);
                if (c17824.m40464() != c17824.m40464()) {
                    throw new C14392("check failed");
                }
                C20764.m46882(c17824.m40471());
                this.f29708 = c17824.m40471();
                this.f29707 = Arrays.copyOf(c17824.m40471(), mo26346());
                byte[] bArrM40471 = c17824.m40471();
                this.f59222 = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                return true;
            } catch (Exception unused2) {
                c23780.getClass();
                C21769.f68542.getClass();
                return false;
            }
        }
        if (i != 3) {
            c23780.getClass();
            C21769.f68542.getClass();
            return false;
        }
        try {
            InterfaceC17429 interfaceC17429 = (InterfaceC17429) Class.forName(C21769.m49091("keypairgen_fromprivate.eddsa")).asSubclass(InterfaceC17429.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC17429.mo33657(mo24663(), bArr);
            this.f29708 = interfaceC17429.mo33658();
            this.f29707 = interfaceC17429.mo33659();
            return true;
        } catch (Exception | LinkageError unused3) {
            c23780.getClass();
            C21769.f68542.getClass();
            return false;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܿ */
    public final byte[] mo9934() {
        byte[] bArrMo9934 = super.mo9934();
        if (bArrMo9934 != null) {
            return bArrMo9934;
        }
        if (this.f29708 == null) {
            return null;
        }
        return C17823.m40446(new byte[][]{mo9935(), this.f29708}).f53185;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo9935() {
        String strMo24664 = mo24664();
        byte[] bArr = C20764.f65273;
        return strMo24664.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9932(byte[] bArr) {
        return mo9930(mo24664(), bArr);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo9930(String str, byte[] bArr) {
        try {
            InterfaceC24786 interfaceC24786 = (InterfaceC24786) Class.forName(C21769.m49091(str)).asSubclass(InterfaceC24786.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC24786.init();
            interfaceC24786.mo29590(this.f29707);
            interfaceC24786.update(bArr);
            byte[] bArrSign = interfaceC24786.sign();
            byte[] bArr2 = C20764.f65273;
            return C17823.m40446(new byte[][]{str.getBytes(StandardCharsets.UTF_8), bArrSign}).f53185;
        } catch (Exception | LinkageError unused) {
            this.f59228.getClass();
            C21769.f68542.getClass();
            return null;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final void mo13547() {
        C20764.m46890(this.f29707);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9931() throws C14392 {
        if (this.f59227) {
            throw new C14392("key is encrypted.");
        }
        C17823 c17823 = new C17823();
        c17823.m40470(mo9935());
        c17823.m40470(this.f29708);
        byte[] bArr = this.f29707;
        int length = bArr.length + this.f29708.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f29708;
        System.arraycopy(bArr3, 0, bArr2, this.f29707.length, bArr3.length);
        c17823.m40466(0, length, bArr2);
        c17823.m40470(C20764.m46886(this.f59222, StandardCharsets.UTF_8));
        int iM40469 = c17823.m40469();
        byte[] bArr4 = new byte[iM40469];
        c17823.m40450(0, iM40469, bArr4);
        return bArr4;
    }
}
