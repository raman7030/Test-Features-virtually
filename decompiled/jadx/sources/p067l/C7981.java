package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ۛ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7981 extends AbstractC7054 implements Handler.Callback {

    /* JADX INFO: renamed from: ۖ֫ */
    public long f20980;

    /* JADX INFO: renamed from: ۘ֫ */
    public C25079 f20981;

    /* JADX INFO: renamed from: ۜ֫ */
    public final InterfaceC14016 f20982;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Handler f20983;

    /* JADX INFO: renamed from: ۢ֫ */
    public final InterfaceC12005 f20984;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C10040 f20985;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f20986;

    /* JADX INFO: renamed from: ᩴ֫ */
    public long f20987;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f20988;

    /* JADX INFO: renamed from: ᩻֫ */
    public AbstractC16744 f20989;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        return true;
    }

    public C7981(InterfaceC12005 interfaceC12005, Looper looper) {
        super(5);
        this.f20984 = interfaceC12005;
        this.f20983 = looper == null ? null : new Handler(looper, this);
        this.f20982 = InterfaceC14016.f39533;
        this.f20985 = new C10040(1, 0);
        this.f20980 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        if (((C14686) this.f20982).m33616(c10307)) {
            return C12832.m29410(c10307.f28546 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C12832.m29410(0, 0, 0, 0);
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        this.f20989 = ((C14686) this.f20982).m33615(c10307Arr[0]);
        C25079 c25079 = this.f20981;
        if (c25079 != null) {
            this.f20981 = c25079.m55050((c25079.f80005 + this.f20980) - j2);
        }
        this.f20980 = j2;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) {
        this.f20981 = null;
        this.f20988 = false;
        this.f20986 = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX INFO: renamed from: ֫ */
    private void m18492(C25079 c25079, ArrayList arrayList) {
        for (int i = 0; i < c25079.m55048(); i++) {
            C10307 c10307Mo3421 = c25079.m55049(i).mo3421();
            if (c10307Mo3421 != null) {
                C14686 c14686 = (C14686) this.f20982;
                if (c14686.m33616(c10307Mo3421)) {
                    AbstractC16744 abstractC16744M33615 = c14686.m33615(c10307Mo3421);
                    byte[] bArrMo3423 = c25079.m55049(i).mo3423();
                    bArrMo3423.getClass();
                    C10040 c10040 = this.f20985;
                    c10040.mo7();
                    c10040.m51579(bArrMo3423.length);
                    ByteBuffer byteBuffer = c10040.f72704;
                    String str = C5792.f14228;
                    byteBuffer.put(bArrMo3423);
                    c10040.m51580();
                    C25079 c25079M37987 = abstractC16744M33615.m37987(c10040);
                    if (c25079M37987 != null) {
                        m18492(c25079M37987, arrayList);
                    }
                } else {
                    arrayList.add(c25079.m55049(i));
                }
            } else {
                arrayList.add(c25079.m55049(i));
            }
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        this.f20981 = null;
        this.f20989 = null;
        this.f20980 = -9223372036854775807L;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return this.f20986;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f20984.mo27502((C25079) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f20988 && this.f20981 == null) {
                C10040 c10040 = this.f20985;
                c10040.mo7();
                C5221 c5221M16267 = m16267();
                int iM16252 = m16252(c5221M16267, c10040, 0);
                if (iM16252 == -4) {
                    if (c10040.m14573()) {
                        this.f20988 = true;
                    } else if (c10040.f72706 >= m16268()) {
                        c10040.f27789 = this.f20987;
                        c10040.m51580();
                        AbstractC16744 abstractC16744 = this.f20989;
                        String str = C5792.f14228;
                        C25079 c25079M37987 = abstractC16744.m37987(c10040);
                        if (c25079M37987 != null) {
                            ArrayList arrayList = new ArrayList(c25079M37987.m55048());
                            m18492(c25079M37987, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f20981 = new C25079(m18493(c10040.f72706), (InterfaceC16361[]) arrayList.toArray(new InterfaceC16361[0]));
                            }
                        }
                    }
                } else if (iM16252 == -5) {
                    C10307 c10307 = c5221M16267.f12253;
                    c10307.getClass();
                    this.f20987 = c10307.f28534;
                }
            }
            C25079 c25079 = this.f20981;
            if (c25079 == null || c25079.f80005 > m18493(j)) {
                z = false;
            } else {
                C25079 c250710 = this.f20981;
                Handler handler = this.f20983;
                if (handler != null) {
                    handler.obtainMessage(1, c250710).sendToTarget();
                } else {
                    this.f20984.mo27502(c250710);
                }
                this.f20981 = null;
                z = true;
            }
            if (this.f20988 && this.f20981 == null) {
                this.f20986 = true;
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ܽ */
    private long m18493(long j) {
        C23877.m52960(j != -9223372036854775807L);
        C23877.m52960(this.f20980 != -9223372036854775807L);
        return j - this.f20980;
    }
}
