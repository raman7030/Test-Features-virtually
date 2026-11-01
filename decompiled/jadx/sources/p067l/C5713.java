package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5713 {

    /* JADX INFO: renamed from: ֫ */
    public int f13977;

    /* JADX INFO: renamed from: ۜ */
    public int f13978;

    /* JADX INFO: renamed from: ۡ */
    public long f13979;

    /* JADX INFO: renamed from: ۢ */
    public int f13980;

    /* JADX INFO: renamed from: ۧ */
    public int f13981;

    /* JADX INFO: renamed from: ܳ */
    public int f13982;

    /* JADX INFO: renamed from: ܺ */
    public int f13983;

    /* JADX INFO: renamed from: ܽ */
    public int f13984;

    /* JADX INFO: renamed from: ܿ */
    public int f13985;

    /* JADX INFO: renamed from: ᩳ */
    public int f13986;

    /* JADX INFO: renamed from: ᩷ */
    public int f13987;

    /* JADX INFO: renamed from: ᩻ */
    public int f13988;

    public final String toString() {
        int i = this.f13977;
        int i2 = this.f13981;
        int i3 = this.f13988;
        int i4 = this.f13987;
        int i5 = this.f13978;
        int i6 = this.f13980;
        int i7 = this.f13984;
        int i8 = this.f13986;
        int i9 = this.f13982;
        int i10 = this.f13985;
        long j = this.f13979;
        int i11 = this.f13983;
        String str = C5792.f14228;
        Locale locale = Locale.US;
        StringBuilder sbM49005 = C21720.m49005("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i2);
        C7913.m18269(sbM49005, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        C7913.m18269(sbM49005, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        C7913.m18269(sbM49005, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        C7913.m18269(sbM49005, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbM49005.append(j);
        sbM49005.append("\n videoFrameProcessingOffsetCount=");
        sbM49005.append(i11);
        sbM49005.append("\n}");
        return sbM49005.toString();
    }
}
