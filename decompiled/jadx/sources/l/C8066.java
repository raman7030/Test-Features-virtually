package l;

import java.util.HashMap;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;

/* JADX INFO: renamed from: l.۠ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7YJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8066 implements InterfaceC1737 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Argon2BytesGenerator f24869;

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final void mo5811(byte[] bArr) throws C12651 {
        throw new C12651("initWithOpenSSHv1KDFOptions() not supported");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e A[Catch: NumberFormatException -> 0x00d4, LOOP:0: B:24:0x007c->B:25:0x007e, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:3:0x0002, B:6:0x0016, B:8:0x001e, B:14:0x0032, B:23:0x004f, B:25:0x007e, B:26:0x0092, B:28:0x00c8, B:29:0x00cd, B:17:0x003c, B:20:0x0046, B:30:0x00ce, B:31:0x00d3), top: B:35:0x0002 }] */
    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final void mo5810(HashMap map) throws C12651 {
        int i;
        int length;
        byte[] bArr;
        int i2;
        try {
            String str = (String) map.get("Key-Derivation");
            String str2 = (String) map.get("Argon2-Salt");
            if (str == null || str2 == null || str2.length() % 2 != 0) {
                throw new C12651("Invalid argon2 params.");
            }
            int iHashCode = str.hashCode();
            if (iHashCode == -1530598888) {
                if (str.equals("Argon2id")) {
                    i = 2;
                    int i3 = Integer.parseInt((String) map.get("Argon2-Memory"));
                    int i4 = Integer.parseInt((String) map.get("Argon2-Passes"));
                    int i5 = Integer.parseInt((String) map.get("Argon2-Parallelism"));
                    length = str2.length() / 2;
                    bArr = new byte[length];
                    for (i2 = 0; i2 < length; i2++) {
                        int i6 = i2 * 2;
                        bArr[i2] = (byte) Integer.parseInt(str2.substring(i6, i6 + 2), 16);
                    }
                    Argon2Parameters argon2ParametersBuild = new Argon2Parameters.Builder(i).withSalt(bArr).withAdditional(new byte[0]).withSecret(new byte[0]).withIterations(i4).withMemoryAsKB(i3).withParallelism(i5).withVersion(19).build();
                    Argon2BytesGenerator argon2BytesGenerator = new Argon2BytesGenerator();
                    this.f24869 = argon2BytesGenerator;
                    argon2BytesGenerator.init(argon2ParametersBuild);
                    return;
                }
                throw new C12651("Invalid argon2 params.");
            }
            if (iHashCode != 920457159) {
                if (iHashCode == 920457164 && str.equals("Argon2i")) {
                    i = 1;
                    int i7 = Integer.parseInt((String) map.get("Argon2-Memory"));
                    int i8 = Integer.parseInt((String) map.get("Argon2-Passes"));
                    int i9 = Integer.parseInt((String) map.get("Argon2-Parallelism"));
                    length = str2.length() / 2;
                    bArr = new byte[length];
                    while (i2 < length) {
                        int i10 = i2 * 2;
                        bArr[i2] = (byte) Integer.parseInt(str2.substring(i10, i10 + 2), 16);
                    }
                    Argon2Parameters argon2ParametersBuild2 = new Argon2Parameters.Builder(i).withSalt(bArr).withAdditional(new byte[0]).withSecret(new byte[0]).withIterations(i8).withMemoryAsKB(i7).withParallelism(i9).withVersion(19).build();
                    Argon2BytesGenerator argon2BytesGenerator2 = new Argon2BytesGenerator();
                    this.f24869 = argon2BytesGenerator2;
                    argon2BytesGenerator2.init(argon2ParametersBuild2);
                    return;
                }
                throw new C12651("Invalid argon2 params.");
            }
            if (str.equals("Argon2d")) {
                i = 0;
                int i11 = Integer.parseInt((String) map.get("Argon2-Memory"));
                int i12 = Integer.parseInt((String) map.get("Argon2-Passes"));
                int i13 = Integer.parseInt((String) map.get("Argon2-Parallelism"));
                length = str2.length() / 2;
                bArr = new byte[length];
                while (i2 < length) {
                    int i14 = i2 * 2;
                    bArr[i2] = (byte) Integer.parseInt(str2.substring(i14, i14 + 2), 16);
                }
                Argon2Parameters argon2ParametersBuild3 = new Argon2Parameters.Builder(i).withSalt(bArr).withAdditional(new byte[0]).withSecret(new byte[0]).withIterations(i12).withMemoryAsKB(i11).withParallelism(i13).withVersion(19).build();
                Argon2BytesGenerator argon2BytesGenerator3 = new Argon2BytesGenerator();
                this.f24869 = argon2BytesGenerator3;
                argon2BytesGenerator3.init(argon2ParametersBuild3);
                return;
            }
            throw new C12651("Invalid argon2 params.");
        } catch (NumberFormatException e) {
            throw new C12651("Invalid argon2 params.", e);
        }
    }

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ۧ */
    public final void mo5813(byte[] bArr) throws C12651 {
        throw new C12651("initWithASN1() not supported");
    }

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo5812(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f24869.generateBytes(bArr, bArr2);
        return bArr2;
    }
}
