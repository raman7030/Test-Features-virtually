package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ۛ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5906 extends AbstractC4930 implements Handler.Callback {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public long f18125;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C23896 f18126;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12256 f18127;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Handler f18128;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10140 f18129;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C8072 f18130;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f18131;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public long f18132;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f18133;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AbstractC15126 f18134;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        return true;
    }

    public C5906(InterfaceC10140 interfaceC10140, Looper looper) {
        super(5);
        this.f18129 = interfaceC10140;
        this.f18128 = looper == null ? null : new Handler(looper, this);
        this.f18127 = InterfaceC12256.f36516;
        this.f18130 = new C8072(1, 0);
        this.f18125 = -9223372036854775807L;
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo16568(C8353 c8353) {
        if (((C12961) this.f18127).m31530(c8353)) {
            return C11010.m27348(c8353.f25632 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C11010.m27348(0, 0, 0, 0);
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        this.f18134 = ((C12961) this.f18127).m31529(c8353Arr[0]);
        C23896 c23896 = this.f18126;
        if (c23896 != null) {
            this.f18126 = c23896.m52641((c23896.f77254 + this.f18125) - j2);
        }
        this.f18125 = j2;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f18126 = null;
        this.f18133 = false;
        this.f18131 = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16566(C23896 c23896, ArrayList arrayList) {
        for (int i = 0; i < c23896.m52639(); i++) {
            C8353 c8353Mo1025 = c23896.m52640(i).mo1025();
            if (c8353Mo1025 != null) {
                C12961 c12961 = (C12961) this.f18127;
                if (c12961.m31530(c8353Mo1025)) {
                    AbstractC15126 abstractC15126M31529 = c12961.m31529(c8353Mo1025);
                    byte[] bArrMo1027 = c23896.m52640(i).mo1027();
                    bArrMo1027.getClass();
                    C8072 c8072 = this.f18130;
                    c8072.mo7();
                    c8072.m49228(bArrMo1027.length);
                    ByteBuffer byteBuffer = c8072.f69995;
                    String str = C3603.f11424;
                    byteBuffer.put(bArrMo1027);
                    c8072.m49229();
                    C23896 c23896M35829 = abstractC15126M31529.m35829(c8072);
                    if (c23896M35829 != null) {
                        m16566(c23896M35829, arrayList);
                    }
                } else {
                    arrayList.add(c23896.m52640(i));
                }
            } else {
                arrayList.add(c23896.m52640(i));
            }
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        this.f18126 = null;
        this.f18134 = null;
        this.f18125 = -9223372036854775807L;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return this.f18131;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f18129.mo25483((C23896) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f18133 && this.f18126 == null) {
                C8072 c8072 = this.f18130;
                c8072.mo7();
                C3002 c3002M14370 = m14370();
                int iM14355 = m14355(c3002M14370, c8072, 0);
                if (iM14355 == -4) {
                    if (c8072.m12697()) {
                        this.f18133 = true;
                    } else if (c8072.f69997 >= m14371()) {
                        c8072.f24876 = this.f18132;
                        c8072.m49229();
                        AbstractC15126 abstractC15126 = this.f18134;
                        String str = C3603.f11424;
                        C23896 c23896M35829 = abstractC15126.m35829(c8072);
                        if (c23896M35829 != null) {
                            ArrayList arrayList = new ArrayList(c23896M35829.m52639());
                            m16566(c23896M35829, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f18126 = new C23896(m16567(c8072.f69997), (InterfaceC14723[]) arrayList.toArray(new InterfaceC14723[0]));
                            }
                        }
                    }
                } else if (iM14355 == -5) {
                    C8353 c8353 = c3002M14370.f9455;
                    c8353.getClass();
                    this.f18132 = c8353.f25620;
                }
            }
            C23896 c23896 = this.f18126;
            if (c23896 == null || c23896.f77254 > m16567(j)) {
                z = false;
            } else {
                C23896 c23897 = this.f18126;
                Handler handler = this.f18128;
                if (handler != null) {
                    handler.obtainMessage(1, c23897).sendToTarget();
                } else {
                    this.f18129.mo25483(c23897);
                }
                this.f18126 = null;
                z = true;
            }
            if (this.f18133 && this.f18126 == null) {
                this.f18131 = true;
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m16567(long j) {
        C22632.m50634(j != -9223372036854775807L);
        C22632.m50634(this.f18125 != -9223372036854775807L);
        return j - this.f18125;
    }
}
