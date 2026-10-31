package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۖۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2422 extends AbstractC9478 {
    @Override // l.AbstractC9478
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7854(C7381 c7381) {
        C16261 c16261;
        int i;
        super.mo7854(c7381);
        byte[] bytes = c7381.f22666;
        String str = this.f28800 + "@" + c7381.f22687;
        if (c7381.f22708 != 22) {
            C7166.m19190(str, ":").append(c7381.f22708);
        }
        while (c7381.f22699 < c7381.f22680) {
            try {
                if (bytes == null) {
                    InterfaceC18650 interfaceC18650 = this.f28799;
                    if (interfaceC18650 == null) {
                        if (bytes != null) {
                            C19356.m44596(bytes);
                        }
                        return false;
                    }
                    if (!interfaceC18650.mo4550()) {
                        throw new C3479("password");
                    }
                    String password = this.f28799.getPassword();
                    if (password == null) {
                        throw new C3479("password");
                    }
                    bytes = password.getBytes(StandardCharsets.UTF_8);
                }
                String str2 = this.f28800;
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrM44592 = C19356.m44592(str2, charset);
                this.f28798.m21457();
                this.f28797.m38234((byte) 50);
                this.f28797.m38256(bArrM44592);
                this.f28797.m38256("ssh-connection".getBytes(charset));
                this.f28797.m38256("password".getBytes(charset));
                this.f28797.m38234((byte) 0);
                this.f28797.m38256(bytes);
                c7381.m19872(this.f28798);
                while (true) {
                    c16261 = this.f28797;
                    c7381.m19863(c16261);
                    this.f28797 = c16261;
                    i = c16261.f50016[5] & 255;
                    if (i == 52) {
                        C19356.m44596(bytes);
                        return true;
                    }
                    if (i == 53) {
                        c16261.m38250();
                        this.f28797.m38233();
                        this.f28797.m38233();
                        byte[] bArrM38257 = this.f28797.m38257();
                        this.f28797.m38257();
                        new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                    } else if (i == 60) {
                        c16261.m38250();
                        this.f28797.m38233();
                        this.f28797.m38233();
                        byte[] bArrM38258 = this.f28797.m38257();
                        this.f28797.m38257();
                        InterfaceC18650 interfaceC18651 = this.f28799;
                        if (interfaceC18651 != null && (interfaceC18651 instanceof InterfaceC20767)) {
                            int length = bArrM38258.length;
                            Charset charset2 = StandardCharsets.UTF_8;
                            new String(bArrM38258, 0, length, charset2);
                            String[] strArrMo4549 = ((InterfaceC20767) interfaceC18651).mo4549(new String[]{"New Password: "});
                            if (strArrMo4549 == null) {
                                throw new C3479("password");
                            }
                            String str3 = strArrMo4549[0];
                            byte[] bytes2 = str3 != null ? str3.getBytes(charset2) : C19356.f62660;
                            this.f28798.m21457();
                            this.f28797.m38234((byte) 50);
                            C16261 c16262 = this.f28797;
                            c16262.getClass();
                            c16262.m38252(0, bArrM44592.length, bArrM44592);
                            this.f28797.m38256("ssh-connection".getBytes(charset2));
                            this.f28797.m38256("password".getBytes(charset2));
                            this.f28797.m38234((byte) 1);
                            C16261 c16263 = this.f28797;
                            c16263.getClass();
                            c16263.m38252(0, bytes.length, bytes);
                            this.f28797.m38256(bytes2);
                            C19356.m44596(bytes2);
                            c7381.m19872(this.f28798);
                        }
                        C19356.m44596(bytes);
                        return false;
                    }
                }
                if (i != 51) {
                    C19356.m44596(bytes);
                    return false;
                }
                c16261.m38250();
                this.f28797.m38233();
                this.f28797.m38233();
                byte[] bArrM38259 = this.f28797.m38257();
                if (this.f28797.m38233() != 0) {
                    throw new C6301(new String(bArrM38259, 0, bArrM38259.length, StandardCharsets.UTF_8));
                }
                c7381.f22699++;
                C19356.m44596(bytes);
                bytes = null;
            } catch (Throwable th) {
                if (bytes != null) {
                    C19356.m44596(bytes);
                }
                throw th;
            }
        }
        if (bytes != null) {
            C19356.m44596(bytes);
            return false;
        }
        return false;
    }
}
