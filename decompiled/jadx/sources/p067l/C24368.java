package p067l;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.᩺ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes.dex */
public final class C24368 {

    /* JADX INFO: renamed from: ֫ */
    public final char[] f77153;

    /* JADX INFO: renamed from: ۧ */
    public final C8926 f77154;

    /* JADX INFO: renamed from: ܽ */
    public final C13640 f77155 = new C13640(1024);

    /* JADX INFO: renamed from: ᩳ */
    public final Typeface f77156;

    public C24368(Typeface typeface, C8926 c8926) {
        this.f77156 = typeface;
        this.f77154 = c8926;
        this.f77153 = new char[c8926.m20631() * 2];
        int iM20631 = c8926.m20631();
        for (int i = 0; i < iM20631; i++) {
            C4232 c4232 = new C4232(this, i);
            Character.toChars(c4232.m8605(), this.f77153, i * 2);
            C1524.m35170("invalid metadata codepoint length", c4232.m8596() > 0);
            this.f77155.m31020(c4232, 0, c4232.m8596() - 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24368 m53718(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i = C1107.f19501;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new C24368(typeface, C8275.m19060(mappedByteBuffer));
        } finally {
            int i2 = C1107.f19501;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final Typeface m53722() {
        return this.f77156;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m53721() {
        return this.f77154.m20633();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13640 m53723() {
        return this.f77155;
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m53719() {
        return this.f77153;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8926 m53720() {
        return this.f77154;
    }
}
