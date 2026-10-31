package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7V8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8793 extends AbstractC17965 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f26782;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f26783;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract String mo22693();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract String mo22694();

    public AbstractC8793(C22529 c22529, byte[] bArr, byte[] bArr2) {
        super(c22529);
        this.f26783 = bArr;
        this.f26782 = bArr2;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7885(byte[] bArr) {
        int i = this.f56026;
        C22529 c22529 = this.f56031;
        if (i == 2 || i == 5) {
            C16261 c16261 = new C16261(bArr);
            c16261.m38251(bArr.length);
            try {
                this.f26782 = c16261.m38239(1, "")[0];
                return true;
            } catch (C12651 unused) {
                c22529.getClass();
                C20413.f65866.getClass();
                return false;
            }
        }
        if (i == 4) {
            try {
                C16261 c16262 = new C16261(bArr);
                if (c16262.m38250() != c16262.m38250()) {
                    throw new C12651("check failed");
                }
                C19356.m44588(c16262.m38257());
                this.f26783 = c16262.m38257();
                this.f26782 = Arrays.copyOf(c16262.m38257(), mo24336());
                byte[] bArrM38257 = c16262.m38257();
                this.f56025 = new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                return true;
            } catch (Exception unused2) {
                c22529.getClass();
                C20413.f65866.getClass();
                return false;
            }
        }
        if (i != 3) {
            c22529.getClass();
            C20413.f65866.getClass();
            return false;
        }
        try {
            InterfaceC15847 interfaceC15847 = (InterfaceC15847) Class.forName(C20413.m46768("keypairgen_fromprivate.eddsa")).asSubclass(InterfaceC15847.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC15847.mo31572(mo22693(), bArr);
            this.f26783 = interfaceC15847.mo31573();
            this.f26782 = interfaceC15847.mo31574();
            return true;
        } catch (Exception | LinkageError unused3) {
            c22529.getClass();
            C20413.f65866.getClass();
            return false;
        }
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܿ */
    public final byte[] mo7886() {
        byte[] bArrMo7886 = super.mo7886();
        if (bArrMo7886 != null) {
            return bArrMo7886;
        }
        if (this.f26783 == null) {
            return null;
        }
        return C16261.m38232(new byte[][]{mo7887(), this.f26783}).f50016;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo7887() {
        String strMo22694 = mo22694();
        byte[] bArr = C19356.f62660;
        return strMo22694.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7884(byte[] bArr) {
        return mo7882(mo22694(), bArr);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo7882(String str, byte[] bArr) {
        try {
            InterfaceC23588 interfaceC23588 = (InterfaceC23588) Class.forName(C20413.m46768(str)).asSubclass(InterfaceC23588.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC23588.init();
            interfaceC23588.mo27528(this.f26782);
            interfaceC23588.update(bArr);
            byte[] bArrSign = interfaceC23588.sign();
            byte[] bArr2 = C19356.f62660;
            return C16261.m38232(new byte[][]{str.getBytes(StandardCharsets.UTF_8), bArrSign}).f50016;
        } catch (Exception | LinkageError unused) {
            this.f56031.getClass();
            C20413.f65866.getClass();
            return null;
        }
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final void mo11611() {
        C19356.m44596(this.f26782);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7883() throws C12651 {
        if (this.f56030) {
            throw new C12651("key is encrypted.");
        }
        C16261 c16261 = new C16261();
        c16261.m38256(mo7887());
        c16261.m38256(this.f26783);
        byte[] bArr = this.f26782;
        int length = bArr.length + this.f26783.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f26783;
        System.arraycopy(bArr3, 0, bArr2, this.f26782.length, bArr3.length);
        c16261.m38252(0, length, bArr2);
        c16261.m38256(C19356.m44592(this.f56025, StandardCharsets.UTF_8));
        int iM38255 = c16261.m38255();
        byte[] bArr4 = new byte[iM38255];
        c16261.m38236(0, iM38255, bArr4);
        return bArr4;
    }
}
