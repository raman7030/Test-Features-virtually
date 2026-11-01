package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܺۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17409 extends AbstractC11376 {

    /* JADX INFO: renamed from: ܿ */
    public String f52043;

    @Override // p067l.AbstractC11376
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9902(C9383 c9383) throws IOException {
        super.mo9902(c9383);
        this.f31747.m23425();
        this.f31746.m40448((byte) 5);
        C17823 c17823 = this.f31746;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470("ssh-userauth".getBytes(charset));
        c9383.m21845(this.f31747);
        C21769 c21769 = c9383.f25608;
        c21769.m49100().getClass();
        C17823 c17824 = this.f31746;
        c9383.m21836(c17824);
        this.f31746 = c17824;
        boolean z = c17824.f53185[5] == 6;
        c21769.m49100().getClass();
        if (!z || !c9383.m21829("enable_auth_none").equals("yes")) {
            return false;
        }
        byte[] bArrM46886 = C20764.m46886(this.f31749, charset);
        this.f31747.m23425();
        this.f31746.m40448((byte) 50);
        this.f31746.m40470(bArrM46886);
        this.f31746.m40470("ssh-connection".getBytes(charset));
        this.f31746.m40470("none".getBytes(charset));
        c9383.m21845(this.f31747);
        while (true) {
            C17823 c17825 = this.f31746;
            c9383.m21836(c17825);
            this.f31746 = c17825;
            int i = c17825.f53185[5] & 255;
            if (i == 52) {
                return true;
            }
            if (i != 53) {
                if (i != 51) {
                    throw new C14392(C19768.m44906(i, "USERAUTH fail (", MotionUtils.EASING_TYPE_FORMAT_END));
                }
                c17825.m40464();
                this.f31746.m40447();
                this.f31746.m40447();
                byte[] bArrM40471 = this.f31746.m40471();
                this.f31746.m40447();
                this.f52043 = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                return false;
            }
            c17825.m40464();
            this.f31746.m40447();
            this.f31746.m40447();
            byte[] bArrM40472 = this.f31746.m40471();
            this.f31746.m40471();
            new String(bArrM40472, 0, bArrM40472.length, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m39629() {
        return this.f52043;
    }
}
