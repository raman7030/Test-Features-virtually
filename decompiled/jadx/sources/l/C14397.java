package l;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܳ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 842L */
/* JADX INFO: loaded from: classes3.dex */
public class C14397 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14397 f43364 = new C17220();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public char[] f43365;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public SoftReference f43366;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43368;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC2029 f43369;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43370;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f43371;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC2197 f43372;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m34390() {
        return this.f43371;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34392(int i) {
        try {
            if (mo34391(i)) {
                return this.f43370;
            }
            return 0;
        } finally {
            this.f43365 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34389(int i, boolean z) {
        try {
            if (!mo34391(i)) {
                this.f43365 = null;
                return 0;
            }
            int i2 = 0;
            for (int i3 = this.f43368; i3 < i; i3++) {
                if (i3 < this.f43367) {
                    i2 = (this.f43365[i3] == '\t' && z) ? ((i2 / 8) * 8) + 8 : i2 + 1;
                } else {
                    this.f43365 = null;
                    return 0;
                }
            }
            int i4 = i2 + 1;
            this.f43365 = null;
            return i4;
        } catch (Throwable th) {
            this.f43365 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo34391(int i) {
        int i2;
        char[] charArray;
        SoftReference softReference;
        if (i != -1) {
            try {
                if (this.f43365 == null && (softReference = this.f43366) != null) {
                    this.f43365 = (char[]) softReference.get();
                }
                if (this.f43365 != null) {
                    if (this.f43368 > i) {
                        this.f43368 = 0;
                        this.f43370 = 1;
                    }
                } else {
                    CharSequence charSequenceMo7388 = this.f43371.mo7388(true);
                    if (charSequenceMo7388 instanceof CharBuffer) {
                        CharBuffer charBuffer = (CharBuffer) charSequenceMo7388;
                        int i3 = C11844.f35338;
                        if (charBuffer.hasArray()) {
                            charArray = (char[]) charBuffer.compact().flip().array();
                        } else {
                            charArray = charBuffer.toString().toCharArray();
                        }
                        this.f43367 = charBuffer.limit();
                    } else {
                        charArray = charSequenceMo7388.toString().toCharArray();
                        this.f43367 = charArray.length;
                    }
                    this.f43366 = new SoftReference(charArray);
                    this.f43365 = charArray;
                    this.f43368 = 0;
                    this.f43370 = 1;
                }
                int i4 = this.f43368;
                while (true) {
                    i2 = this.f43367;
                    if (i4 >= i2 || i4 >= i) {
                        break;
                    }
                    char[] cArr = this.f43365;
                    int i5 = i4 + 1;
                    char c = cArr[i4];
                    if (c == '\n') {
                        this.f43370++;
                        this.f43368 = i5;
                    } else if (c == '\r') {
                        if (i5 < i2 && cArr[i5] == '\n') {
                            i5 = i4 + 2;
                        }
                        this.f43370++;
                        this.f43368 = i5;
                    }
                    i4 = i5;
                }
                if (i4 <= i2) {
                    return true;
                }
            } catch (IOException unused) {
                this.f43372.mo7283(new Object[0]);
                this.f43365 = new char[0];
                return false;
            }
        }
        return false;
    }
}
