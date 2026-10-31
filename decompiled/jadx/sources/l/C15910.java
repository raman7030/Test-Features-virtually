package l;

import com.alipay.sdk.m.y.q;
import java.io.DataInputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܺۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15910 extends AbstractC14539 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3917 f49148;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15910(C3917 c3917, DataInputStream dataInputStream) {
        super(dataInputStream);
        this.f49148 = c3917;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37674() {
        try {
            return this.f44543.charAt(this.f44540);
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37675() {
        String str = this.f44543;
        long j = ((long) this.f44541) << 32;
        int i = this.f44540;
        this.f44542 = j | ((long) i);
        try {
            char cCharAt = str.charAt(i);
            int i2 = this.f44540 + 1;
            this.f44540 = i2;
            if (cCharAt == '\n') {
                this.f44541++;
                return cCharAt;
            }
            if (cCharAt != '\r') {
                return cCharAt;
            }
            if (str.charAt(i2) == '\n') {
                this.f44540++;
            }
            this.f44541++;
            return cCharAt;
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37673() {
        char cCharAt;
        C3917 c3917 = this.f49148;
        String str = this.f44543;
        while (true) {
            try {
                cCharAt = str.charAt(this.f44540);
                if (cCharAt != 'u') {
                    break;
                }
                this.f44540++;
            } catch (StringIndexOutOfBoundsException unused) {
                c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
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
                    int i3 = this.f44540 + 1;
                    this.f44540 = i3;
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
                            int i4 = this.f44540 + 1;
                            this.f44540 = i4;
                            cCharAt = str.charAt(i4);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'a':
                                case 'b':
                                case q.f /* 99 */:
                                case 'd':
                                case 'e':
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    i = (((i << 4) + 10) + cCharAt) - 97;
                                    continue;
                                    continue;
                                    continue;
                                    int i5 = this.f44540 + 1;
                                    this.f44540 = i5;
                                    cCharAt = str.charAt(i5);
                                    break;
                                default:
                                    c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
                                    return i;
                            }
                            break;
                    }
                    break;
            }
            c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
            return -1;
        }
        return i;
    }
}
