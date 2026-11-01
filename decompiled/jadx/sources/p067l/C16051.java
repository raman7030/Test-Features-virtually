package p067l;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܳ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 842L */
/* JADX INFO: loaded from: classes3.dex */
public class C16051 {

    /* JADX INFO: renamed from: ᩷ */
    public static final C16051 f46457 = new C18734();

    /* JADX INFO: renamed from: ֫ */
    public char[] f46458;

    /* JADX INFO: renamed from: ۜ */
    public SoftReference f46459;

    /* JADX INFO: renamed from: ۧ */
    public int f46460;

    /* JADX INFO: renamed from: ܳ */
    public int f46461;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC4297 f46462;

    /* JADX INFO: renamed from: ܿ */
    public int f46463;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC19740 f46464;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC4456 f46465;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 m36524() {
        return this.f46464;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36526(int i) {
        try {
            if (mo36525(i)) {
                return this.f46463;
            }
            return 0;
        } finally {
            this.f46458 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36523(int i, boolean z) {
        try {
            if (!mo36525(i)) {
                this.f46458 = null;
                return 0;
            }
            int i2 = 0;
            for (int i3 = this.f46461; i3 < i; i3++) {
                if (i3 < this.f46460) {
                    i2 = (this.f46458[i3] == '\t' && z) ? ((i2 / 8) * 8) + 8 : i2 + 1;
                } else {
                    this.f46458 = null;
                    return 0;
                }
            }
            int i4 = i2 + 1;
            this.f46458 = null;
            return i4;
        } catch (Throwable th) {
            this.f46458 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo36525(int i) {
        int i2;
        char[] charArray;
        SoftReference softReference;
        if (i != -1) {
            try {
                if (this.f46458 == null && (softReference = this.f46459) != null) {
                    this.f46458 = (char[]) softReference.get();
                }
                if (this.f46458 != null) {
                    if (this.f46461 > i) {
                        this.f46461 = 0;
                        this.f46463 = 1;
                    }
                } else {
                    CharSequence charSequenceMo9471 = this.f46464.mo9471(true);
                    if (charSequenceMo9471 instanceof CharBuffer) {
                        CharBuffer charBuffer = (CharBuffer) charSequenceMo9471;
                        int i3 = C13625.f38343;
                        if (charBuffer.hasArray()) {
                            charArray = (char[]) charBuffer.compact().flip().array();
                        } else {
                            charArray = charBuffer.toString().toCharArray();
                        }
                        this.f46460 = charBuffer.limit();
                    } else {
                        charArray = charSequenceMo9471.toString().toCharArray();
                        this.f46460 = charArray.length;
                    }
                    this.f46459 = new SoftReference(charArray);
                    this.f46458 = charArray;
                    this.f46461 = 0;
                    this.f46463 = 1;
                }
                int i4 = this.f46461;
                while (true) {
                    i2 = this.f46460;
                    if (i4 >= i2 || i4 >= i) {
                        break;
                    }
                    char[] cArr = this.f46458;
                    int i5 = i4 + 1;
                    char c = cArr[i4];
                    if (c == '\n') {
                        this.f46463++;
                        this.f46461 = i5;
                    } else if (c == '\r') {
                        if (i5 < i2 && cArr[i5] == '\n') {
                            i5 = i4 + 2;
                        }
                        this.f46463++;
                        this.f46461 = i5;
                    }
                    i4 = i5;
                }
                if (i4 <= i2) {
                    return true;
                }
            } catch (IOException unused) {
                this.f46465.mo9362(new Object[0]);
                this.f46458 = new char[0];
                return false;
            }
        }
        return false;
    }
}
