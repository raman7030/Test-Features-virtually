package l;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.᩺ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes.dex */
public final class C23148 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f74407;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6900 f74408;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11860 f74409 = new C11860(1024);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Typeface f74410;

    public C23148(Typeface typeface, C6900 c6900) {
        this.f74410 = typeface;
        this.f74408 = c6900;
        this.f74407 = new char[c6900.m18682() * 2];
        int iM18682 = c6900.m18682();
        for (int i = 0; i < iM18682; i++) {
            C1961 c1961 = new C1961(this, i);
            Character.toChars(c1961.m6464(), this.f74407, i * 2);
            C13746.m33056("invalid metadata codepoint length", c1961.m6455() > 0);
            this.f74409.m28969(c1961, 0, c1961.m6455() - 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23148 m51323(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i = C5342.f16662;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new C23148(typeface, C6215.m17128(mappedByteBuffer));
        } finally {
            int i2 = C5342.f16662;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Typeface m51327() {
        return this.f74410;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m51326() {
        return this.f74408.m18684();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11860 m51328() {
        return this.f74409;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m51324() {
        return this.f74407;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6900 m51325() {
        return this.f74408;
    }
}
