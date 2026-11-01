package p067l;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: l.֡ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J21G */
/* JADX INFO: loaded from: classes3.dex */
public class C2478 implements InterfaceC20585 {

    /* JADX INFO: renamed from: ֫ */
    public AudioAttributes f3878;

    /* JADX INFO: renamed from: ۧ */
    public int f3879 = -1;

    public final int hashCode() {
        return this.f3878.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2478) {
            return this.f3878.equals(((C2478) obj).f3878);
        }
        return false;
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3878;
    }
}
