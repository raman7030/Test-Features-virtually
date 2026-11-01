package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۖۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4670 extends AbstractC11376 {
    @Override // p067l.AbstractC11376
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9902(C9383 c9383) {
        C17823 c17823;
        int i;
        super.mo9902(c9383);
        byte[] bytes = c9383.f25578;
        String str = this.f31749 + "@" + c9383.f25599;
        if (c9383.f25620 != 22) {
            C9179.m21133(str, ":").append(c9383.f25620);
        }
        while (c9383.f25611 < c9383.f25592) {
            try {
                if (bytes == null) {
                    InterfaceC20093 interfaceC20093 = this.f31748;
                    if (interfaceC20093 == null) {
                        if (bytes != null) {
                            C20764.m46890(bytes);
                        }
                        return false;
                    }
                    if (!interfaceC20093.mo6782()) {
                        throw new C5675("password");
                    }
                    String password = this.f31748.getPassword();
                    if (password == null) {
                        throw new C5675("password");
                    }
                    bytes = password.getBytes(StandardCharsets.UTF_8);
                }
                String str2 = this.f31749;
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrM46886 = C20764.m46886(str2, charset);
                this.f31747.m23425();
                this.f31746.m40448((byte) 50);
                this.f31746.m40470(bArrM46886);
                this.f31746.m40470("ssh-connection".getBytes(charset));
                this.f31746.m40470("password".getBytes(charset));
                this.f31746.m40448((byte) 0);
                this.f31746.m40470(bytes);
                c9383.m21845(this.f31747);
                while (true) {
                    c17823 = this.f31746;
                    c9383.m21836(c17823);
                    this.f31746 = c17823;
                    i = c17823.f53185[5] & 255;
                    if (i == 52) {
                        C20764.m46890(bytes);
                        return true;
                    }
                    if (i == 53) {
                        c17823.m40464();
                        this.f31746.m40447();
                        this.f31746.m40447();
                        byte[] bArrM40471 = this.f31746.m40471();
                        this.f31746.m40471();
                        new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                    } else if (i == 60) {
                        c17823.m40464();
                        this.f31746.m40447();
                        this.f31746.m40447();
                        byte[] bArrM40472 = this.f31746.m40471();
                        this.f31746.m40471();
                        InterfaceC20093 interfaceC20094 = this.f31748;
                        if (interfaceC20094 != null && (interfaceC20094 instanceof InterfaceC22105)) {
                            int length = bArrM40472.length;
                            Charset charset2 = StandardCharsets.UTF_8;
                            new String(bArrM40472, 0, length, charset2);
                            String[] strArrMo6781 = ((InterfaceC22105) interfaceC20094).mo6781(new String[]{"New Password: "});
                            if (strArrMo6781 == null) {
                                throw new C5675("password");
                            }
                            String str3 = strArrMo6781[0];
                            byte[] bytes2 = str3 != null ? str3.getBytes(charset2) : C20764.f65273;
                            this.f31747.m23425();
                            this.f31746.m40448((byte) 50);
                            C17823 c17824 = this.f31746;
                            c17824.getClass();
                            c17824.m40466(0, bArrM46886.length, bArrM46886);
                            this.f31746.m40470("ssh-connection".getBytes(charset2));
                            this.f31746.m40470("password".getBytes(charset2));
                            this.f31746.m40448((byte) 1);
                            C17823 c17825 = this.f31746;
                            c17825.getClass();
                            c17825.m40466(0, bytes.length, bytes);
                            this.f31746.m40470(bytes2);
                            C20764.m46890(bytes2);
                            c9383.m21845(this.f31747);
                        }
                        C20764.m46890(bytes);
                        return false;
                    }
                }
                if (i != 51) {
                    C20764.m46890(bytes);
                    return false;
                }
                c17823.m40464();
                this.f31746.m40447();
                this.f31746.m40447();
                byte[] bArrM40473 = this.f31746.m40471();
                if (this.f31746.m40447() != 0) {
                    throw new C8357(new String(bArrM40473, 0, bArrM40473.length, StandardCharsets.UTF_8));
                }
                c9383.f25611++;
                C20764.m46890(bytes);
                bytes = null;
            } catch (Throwable th) {
                if (bytes != null) {
                    C20764.m46890(bytes);
                }
                throw th;
            }
        }
        if (bytes != null) {
            C20764.m46890(bytes);
            return false;
        }
        return false;
    }
}
