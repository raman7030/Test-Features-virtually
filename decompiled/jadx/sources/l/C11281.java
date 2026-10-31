package l;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.m.y.q;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۧ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11281 extends AbstractC3498 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33798 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f33799;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0614 f33800;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16821 f33801;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f33802;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C16136 f33803;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double[] f33804;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Context f33805;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7216 f33806;

    @Override // l.InterfaceC1381
    public final String getName() {
        return "MidiDecoder";
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫ */
    public final C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC20432;
        ByteBuffer byteBuffer = c21843.f69995;
        byteBuffer.getClass();
        if (z) {
            this.f33799 = -9223372036854775807L;
            try {
                this.f33806.m19316();
                this.f33800.m2525().m38022();
                m27895();
            } catch (C16924 e) {
                return e;
            }
        }
        if (this.f33799 == -9223372036854775807L) {
            this.f33802 = c21843.f69997;
        }
        boolean zM10683 = m10683(c21843.f69997);
        if (zM10683) {
            try {
                long j = this.f33799;
                if (j != -9223372036854775807L) {
                    this.f33806.m19310((c21843.f69997 - j) * 1.0E-6d);
                }
                this.f33799 = c21843.f69997;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.f33801.m39556(byteBuffer.position(), byteBuffer.remaining(), byteBuffer.array());
        }
        int iM38049 = this.f33803.m38049();
        C22632.m50634(zM10683 || iM38049 == 0);
        if (iM38049 > this.f33804.length) {
            this.f33804 = new double[(iM38049 * q.h) / 100];
        }
        int iM38050 = 0;
        while (iM38050 < iM38049) {
            iM38050 += this.f33803.m38050(this.f33804, iM38050, iM38049 - iM38050);
        }
        simpleDecoderOutputBuffer.m6(iM38050 * 4, this.f33802);
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        for (int i = 0; i < iM38050; i++) {
            byteBuffer2.putFloat((float) this.f33804[i]);
        }
        byteBuffer2.flip();
        this.f33802 = (((((long) iM38050) * 1000000) / 2) / 44100) + this.f33802;
        return null;
    }

    static {
        C16840.m39615("media3.decoder.midi");
    }

    @EnsuresNonNull({"synth", "multiSynth", "reader", "midiSynthesizer"})
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m27895() {
        C7216 c7216 = new C7216();
        this.f33806 = c7216;
        c7216.m19317();
        C0614 c0614 = new C0614();
        this.f33800 = c0614;
        C7216 c7217 = this.f33806;
        Context context = this.f33805;
        context.getClass();
        c0614.m2529(c7217, C7047.m19030(context));
        this.f33801 = new C16821(this.f33800);
        this.f33803 = new C16136(this.f33806);
        this.f33800.m2525().m36460(0, this.f33803.m38051(), 0);
        this.f33800.m2525().m36460(0, this.f33803.m38051(), 1);
        this.f33806.m19308();
    }

    public C11281(Context context) {
        super(new C21843[16], new SimpleDecoderOutputBuffer[16]);
        this.f33805 = context;
        this.f33804 = new double[8820];
        this.f33799 = -9223372036854775807L;
        m27895();
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ᩳ */
    public final C21843 mo16() {
        return new C21843(1, 0);
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC20432 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC22548() { // from class: l.֫᩹֫
            @Override // l.InterfaceC22548
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo6995(AbstractC20432 abstractC20432) {
                this.f7042.m10681((AbstractC20432) ((SimpleDecoderOutputBuffer) abstractC20432));
            }
        });
    }

    @Override // l.AbstractC3498
    /* JADX INFO: renamed from: ֫ */
    public final C8437 mo10(Throwable th) {
        return new C16924("Unexpected decode error", th);
    }

    @Override // l.AbstractC3498, l.InterfaceC1381
    /* JADX INFO: renamed from: ֫ */
    public final void mo12() {
        this.f33806.m19316();
        super.mo12();
    }
}
