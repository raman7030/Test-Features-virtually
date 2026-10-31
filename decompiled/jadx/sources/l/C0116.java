package l;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: l.֡ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J21G */
/* JADX INFO: loaded from: classes3.dex */
public class C0116 implements InterfaceC19168 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AudioAttributes f1102;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1103 = -1;

    public final int hashCode() {
        return this.f1102.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0116) {
            return this.f1102.equals(((C0116) obj).f1102);
        }
        return false;
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1102;
    }
}
