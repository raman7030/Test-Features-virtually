package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11171;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f11172;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f11173;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f11174;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f11175;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f11176;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11177;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f11178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f11179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f11180;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11181;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f11182;

    public final String toString() {
        int i = this.f11171;
        int i2 = this.f11175;
        int i3 = this.f11182;
        int i4 = this.f11181;
        int i5 = this.f11172;
        int i6 = this.f11174;
        int i7 = this.f11178;
        int i8 = this.f11180;
        int i9 = this.f11176;
        int i10 = this.f11179;
        long j = this.f11173;
        int i11 = this.f11177;
        String str = C3603.f11424;
        Locale locale = Locale.US;
        StringBuilder sbM46682 = C20361.m46682("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i2);
        C5834.m16344(sbM46682, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        C5834.m16344(sbM46682, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        C5834.m16344(sbM46682, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        C5834.m16344(sbM46682, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbM46682.append(j);
        sbM46682.append("\n videoFrameProcessingOffsetCount=");
        sbM46682.append(i11);
        sbM46682.append("\n}");
        return sbM46682.toString();
    }
}
