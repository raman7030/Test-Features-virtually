package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0698cb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.֡᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7VX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3071 extends AbstractC21178 {

    /* JADX INFO: renamed from: ۠ */
    public C17823 f5557;

    /* JADX INFO: renamed from: ᩸ */
    public C17823 f5559;

    /* JADX INFO: renamed from: ᩹ */
    public C17823 f5560 = null;

    /* JADX INFO: renamed from: ܶ */
    public C10054 f5558 = null;

    public C3071() {
        this.f5559 = null;
        this.f5557 = null;
        this.f66561 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66550 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66562 = 16384;
        byte[] bArr = C20764.f65273;
        this.f66549 = C20764.m46886("auth-agent@openssh.com", StandardCharsets.UTF_8);
        C17823 c17823 = new C17823();
        this.f5559 = c17823;
        c17823.m40456();
        this.f5557 = new C17823();
        this.f66556 = true;
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۡ */
    public final void mo5176() {
        try {
            m47798();
        } catch (Exception unused) {
            this.f66546 = true;
            m47801();
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x013e A[SYNTHETIC] */
    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ֫ */
    public final void mo5175(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrMo5030;
        InterfaceC2992 interfaceC2992;
        String strMo6780;
        if (this.f5558 == null) {
            C17823 c17823 = new C17823(this.f66548);
            this.f5560 = c17823;
            this.f5558 = new C10054(c17823);
        }
        this.f5559.m40456();
        C17823 c17824 = this.f5559;
        byte[] bArr2 = c17824.f53185;
        if (bArr2.length < c17824.f53186 + i2) {
            byte[] bArr3 = new byte[c17824.f53187 + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f5559.f53185 = bArr3;
        }
        this.f5559.m40460(i, i2, bArr);
        if (this.f5559.m40464() > this.f5559.m40469()) {
            this.f5559.f53187 -= 4;
            return;
        }
        int iM40447 = this.f5559.m40447();
        try {
            C9383 c9383M47808 = m47808();
            InterfaceC3663 interfaceC3663M49098 = c9383M47808.f25608.m49098();
            InterfaceC20093 interfaceC20093M21851 = c9383M47808.m21851();
            this.f5557.m40456();
            if (iM40447 == 11) {
                this.f5557.m40448((byte) 12);
                Vector vectorMo4137 = interfaceC3663M49098.mo4137();
                synchronized (vectorMo4137) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < vectorMo4137.size(); i4++) {
                        if (((InterfaceC2992) vectorMo4137.elementAt(i4)).mo5029() != null) {
                            i3++;
                        }
                    }
                    this.f5557.m40459(i3);
                    for (int i5 = 0; i5 < vectorMo4137.size(); i5++) {
                        byte[] bArrMo5029 = ((InterfaceC2992) vectorMo4137.elementAt(i5)).mo5029();
                        if (bArrMo5029 != null) {
                            C17823 c17825 = this.f5557;
                            c17825.getClass();
                            c17825.m40466(0, bArrMo5029.length, bArrMo5029);
                            this.f5557.m40470(C20764.f65273);
                        }
                    }
                }
            } else if (iM40447 == 1) {
                this.f5557.m40448((byte) 2);
                this.f5557.m40459(0);
            } else if (iM40447 == 13) {
                byte[] bArrM40471 = this.f5559.m40471();
                byte[] bArrM40472 = this.f5559.m40471();
                int iM40464 = this.f5559.m40464();
                Vector vectorMo4138 = interfaceC3663M49098.mo4137();
                synchronized (vectorMo4138) {
                    int i6 = 0;
                    while (true) {
                        bArrMo5030 = null;
                        if (i6 >= vectorMo4138.size()) {
                            interfaceC2992 = null;
                            break;
                        }
                        interfaceC2992 = (InterfaceC2992) vectorMo4138.elementAt(i6);
                        if (interfaceC2992.mo5029() != null && C20764.m46885(bArrM40471, interfaceC2992.mo5029())) {
                            if (!interfaceC2992.mo5031()) {
                                if (!interfaceC2992.mo5031()) {
                                    break;
                                }
                            } else if (interfaceC20093M21851 != null) {
                                while (interfaceC2992.mo5031() && interfaceC20093M21851.mo6783() && (strMo6780 = interfaceC20093M21851.mo6780()) != null) {
                                    try {
                                        if (interfaceC2992.mo5027(strMo6780.getBytes(StandardCharsets.UTF_8))) {
                                            break;
                                        }
                                    } catch (C14392 unused) {
                                    }
                                }
                                if (!interfaceC2992.mo5031()) {
                                    break;
                                    break;
                                }
                            }
                        }
                        i6++;
                    }
                }
                if (interfaceC2992 != null) {
                    byte[] bArrM40473 = new C17823(bArrM40471).m40471();
                    if (!new String(bArrM40473, 0, bArrM40473.length, StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.RSA)) {
                        bArrMo5030 = interfaceC2992.mo5030(bArrM40472);
                    } else if ((iM40464 & 2) != 0) {
                        bArrMo5030 = interfaceC2992.mo5028("rsa-sha2-256", bArrM40472);
                    } else if ((iM40464 & 4) != 0) {
                        bArrMo5030 = interfaceC2992.mo5028("rsa-sha2-512", bArrM40472);
                    } else {
                        bArrMo5030 = interfaceC2992.mo5028(OpenSSHPublicKeyUtil.RSA, bArrM40472);
                    }
                }
                if (bArrMo5030 == null) {
                    this.f5557.m40448((byte) 30);
                } else {
                    this.f5557.m40448(C0698cb.f2570l);
                    C17823 c17826 = this.f5557;
                    c17826.getClass();
                    c17826.m40466(0, bArrMo5030.length, bArrMo5030);
                }
            } else if (iM40447 == 18) {
                interfaceC3663M49098.mo4141(this.f5559.m40471());
                this.f5557.m40448((byte) 6);
            } else if (iM40447 == 9) {
                this.f5557.m40448((byte) 6);
            } else if (iM40447 == 19) {
                interfaceC3663M49098.mo4140();
                this.f5557.m40448((byte) 6);
            } else if (iM40447 == 17) {
                int iM40469 = this.f5559.m40469();
                byte[] bArr4 = new byte[iM40469];
                C17823 c17827 = this.f5559;
                c17827.getClass();
                c17827.m40450(0, iM40469, bArr4);
                this.f5557.m40448(interfaceC3663M49098.mo4139(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                C17823 c17828 = this.f5559;
                c17828.m40465(c17828.m40469() - 1);
                this.f5557.m40448((byte) 5);
            }
            int iM404610 = this.f5557.m40469();
            byte[] bArr5 = new byte[iM404610];
            C17823 c17829 = this.f5557;
            c17829.getClass();
            c17829.m40450(0, iM404610, bArr5);
            this.f5558.m23425();
            this.f5560.m40448((byte) 94);
            this.f5560.m40459(this.f66555);
            int i7 = iM404610 + 4;
            this.f5560.m40459(i7);
            C17823 c178210 = this.f5560;
            c178210.getClass();
            c178210.m40466(0, iM404610, bArr5);
            try {
                m47808().m21835(this.f5558, this, i7);
            } catch (Exception unused2) {
            }
        } catch (C14392 e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5177() {
        super.mo5177();
        m47806();
    }
}
