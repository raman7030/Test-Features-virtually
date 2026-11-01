package p067l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ۗ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5436 {

    /* JADX INFO: renamed from: ֫ */
    public long f12963;

    /* JADX INFO: renamed from: ۧ */
    public final AudioTimestamp f12964 = new AudioTimestamp();

    /* JADX INFO: renamed from: ܳ */
    public long f12965;

    /* JADX INFO: renamed from: ܽ */
    public final AudioTrack f12966;

    /* JADX INFO: renamed from: ܿ */
    public long f12967;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f12968;

    /* JADX INFO: renamed from: ᩻ */
    public long f12969;

    public C5436(AudioTrack audioTrack) {
        this.f12966 = audioTrack;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m11951() {
        AudioTrack audioTrack = this.f12966;
        AudioTimestamp audioTimestamp = this.f12964;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j = audioTimestamp.framePosition;
            long j2 = this.f12965;
            if (j2 > j) {
                if (this.f12968) {
                    this.f12963 += j2;
                    this.f12968 = false;
                } else {
                    this.f12969++;
                }
            }
            this.f12965 = j;
            this.f12967 = j + this.f12963 + (this.f12969 << 32);
        }
        return timestamp;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m11950() {
        return this.f12964.nanoTime / 1000;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m11949() {
        return this.f12967;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11948() {
        this.f12968 = true;
    }
}
