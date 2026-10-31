package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18295 extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C18295(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C18295(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
