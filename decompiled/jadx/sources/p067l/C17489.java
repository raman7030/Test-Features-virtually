package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.DataInputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܺۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17489 extends AbstractC16186 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C6091 f52294;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17489(C6091 c6091, DataInputStream dataInputStream) {
        super(dataInputStream);
        this.f52294 = c6091;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m39848() {
        try {
            return this.f47649.charAt(this.f47646);
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39849() {
        String str = this.f47649;
        long j = ((long) this.f47647) << 32;
        int i = this.f47646;
        this.f47648 = j | ((long) i);
        try {
            char cCharAt = str.charAt(i);
            int i2 = this.f47646 + 1;
            this.f47646 = i2;
            if (cCharAt == '\n') {
                this.f47647++;
                return cCharAt;
            }
            if (cCharAt != '\r') {
                return cCharAt;
            }
            if (str.charAt(i2) == '\n') {
                this.f47646++;
            }
            this.f47647++;
            return cCharAt;
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39847() {
        char cCharAt;
        C6091 c6091 = this.f52294;
        String str = this.f47649;
        while (true) {
            try {
                cCharAt = str.charAt(this.f47646);
                if (cCharAt != 'u') {
                    break;
                }
                this.f47646++;
            } catch (StringIndexOutOfBoundsException unused) {
                c6091.mo11117(this.f47648, "Invalid escape character", new Object[0]);
                return -1;
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            switch (cCharAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case '8':
                case '9':
                    i = ((i << 4) + cCharAt) - 48;
                    continue;
                    int i3 = this.f47646 + 1;
                    this.f47646 = i3;
                    cCharAt = str.charAt(i3);
                    break;
                default:
                    switch (cCharAt) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            i = (((i << 4) + 10) + cCharAt) - 65;
                            continue;
                            int i4 = this.f47646 + 1;
                            this.f47646 = i4;
                            cCharAt = str.charAt(i4);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'a':
                                case 'b':
                                case C0254q.f1216f /* 99 */:
                                case 'd':
                                case 'e':
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    i = (((i << 4) + 10) + cCharAt) - 97;
                                    continue;
                                    continue;
                                    continue;
                                    int i5 = this.f47646 + 1;
                                    this.f47646 = i5;
                                    cCharAt = str.charAt(i5);
                                    break;
                                default:
                                    c6091.mo11117(this.f47648, "Invalid escape character", new Object[0]);
                                    return i;
                            }
                            break;
                    }
                    break;
            }
            c6091.mo11117(this.f47648, "Invalid escape character", new Object[0]);
            return -1;
        }
        return i;
    }
}
