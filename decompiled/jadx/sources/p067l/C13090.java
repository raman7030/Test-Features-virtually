package p067l;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۧ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13090 extends AbstractC5693 {

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f36797 = 0;

    /* JADX INFO: renamed from: ֡ */
    public long f36798;

    /* JADX INFO: renamed from: ֨ */
    public C2952 f36799;

    /* JADX INFO: renamed from: ۚ */
    public C18355 f36800;

    /* JADX INFO: renamed from: ۠ */
    public long f36801;

    /* JADX INFO: renamed from: ܶ */
    public C17704 f36802;

    /* JADX INFO: renamed from: ᩴ */
    public double[] f36803;

    /* JADX INFO: renamed from: ᩵ */
    public final Context f36804;

    /* JADX INFO: renamed from: ᩸ */
    public C9226 f36805;

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return "MidiDecoder";
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo11(C23128 c23128, AbstractC21787 abstractC21787, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC21787;
        ByteBuffer byteBuffer = c23128.f72704;
        byteBuffer.getClass();
        if (z) {
            this.f36798 = -9223372036854775807L;
            try {
                this.f36805.m21264();
                this.f36799.m4881().m40213();
                m29956();
            } catch (C18453 e) {
                return e;
            }
        }
        if (this.f36798 == -9223372036854775807L) {
            this.f36801 = c23128.f72706;
        }
        boolean zM12678 = m12678(c23128.f72706);
        if (zM12678) {
            try {
                long j = this.f36798;
                if (j != -9223372036854775807L) {
                    this.f36805.m21258((c23128.f72706 - j) * 1.0E-6d);
                }
                this.f36798 = c23128.f72706;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.f36800.m41792(byteBuffer.position(), byteBuffer.remaining(), byteBuffer.array());
        }
        int iM40241 = this.f36802.m40241();
        C23877.m52960(zM12678 || iM40241 == 0);
        if (iM40241 > this.f36803.length) {
            this.f36803 = new double[(iM40241 * C0254q.f1218h) / 100];
        }
        int iM40242 = 0;
        while (iM40242 < iM40241) {
            iM40242 += this.f36802.m40242(this.f36803, iM40242, iM40241 - iM40242);
        }
        simpleDecoderOutputBuffer.m6(iM40242 * 4, this.f36801);
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        for (int i = 0; i < iM40242; i++) {
            byteBuffer2.putFloat((float) this.f36803[i]);
        }
        byteBuffer2.flip();
        this.f36801 = (((((long) iM40242) * 1000000) / 2) / 44100) + this.f36801;
        return null;
    }

    static {
        C18373.m41851("media3.decoder.midi");
    }

    @EnsuresNonNull({"synth", "multiSynth", "reader", "midiSynthesizer"})
    /* JADX INFO: renamed from: ܳ */
    private void m29956() {
        C9226 c9226 = new C9226();
        this.f36805 = c9226;
        c9226.m21265();
        C2952 c2952 = new C2952();
        this.f36799 = c2952;
        C9226 c9227 = this.f36805;
        Context context = this.f36804;
        context.getClass();
        c2952.m4885(c9227, C9066.m20987(context));
        this.f36800 = new C18355(this.f36799);
        this.f36802 = new C17704(this.f36805);
        this.f36799.m4881().m38618(0, this.f36802.m40243(), 0);
        this.f36799.m4881().m38618(0, this.f36802.m40243(), 1);
        this.f36805.m21256();
    }

    public C13090(Context context) {
        super(new C23128[16], new SimpleDecoderOutputBuffer[16]);
        this.f36804 = context;
        this.f36803 = new double[8820];
        this.f36798 = -9223372036854775807L;
        m29956();
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ᩳ */
    public final C23128 mo16() {
        return new C23128(1, 0);
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21787 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC23798() { // from class: l.֫᩹֫
            @Override // p067l.InterfaceC23798
            /* JADX INFO: renamed from: ֫ */
            public final void mo9106(AbstractC21787 abstractC21787) {
                this.f9827.m12676((AbstractC21787) ((SimpleDecoderOutputBuffer) abstractC21787));
            }
        });
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo10(Throwable th) {
        return new C18453("Unexpected decode error", th);
    }

    @Override // p067l.AbstractC5693, p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public final void mo12() {
        this.f36805.m21264();
        super.mo12();
    }
}
