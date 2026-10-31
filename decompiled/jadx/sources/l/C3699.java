package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3699 implements InterfaceC18286, AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f11669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11670;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3280 f11671;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4691 f11672;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12704 f11673;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5816 f11674;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19222 f11676;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f11677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f11678;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C10336 f11679;

    public C3699(C12704 c12704, int i) {
        this.f11673 = c12704;
        this.f11669 = i;
    }

    @Override // l.InterfaceC18286
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11284(int i, int i2) throws IOException {
        if (i2 >= 0) {
            long j = ((long) i) + ((long) i2);
            C12704 c12704 = this.f11673;
            if (j <= c12704.length()) {
                this.f11675 = i;
                this.f11670 = i2;
                this.f11679 = new C10336(c12704, i, i2, this.f11669);
                return;
            }
        }
        throw new IOException("Invalid migration page range");
    }

    @Override // l.InterfaceC18286
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11285(int i, long j, InputStream inputStream) {
        int i2 = this.f11669;
        if (i == 261) {
            this.f11676 = C19222.m44352(i2, j, inputStream);
            return;
        }
        switch (i) {
            case 256:
                this.f11674 = C5816.m16316(i2, j, inputStream);
                break;
            case 257:
                this.f11678 = m11277(j, inputStream);
                this.f11671 = C3280.m10089(new ByteArrayInputStream(this.f11678), j, i2);
                break;
            case 258:
                this.f11677 = m11277(j, inputStream);
                this.f11672 = C4691.m13767(new ByteArrayInputStream(this.f11677), j, i2);
                break;
            default:
                this.f11679.m26131(i, j, inputStream);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m11277(long j, InputStream inputStream) throws IOException {
        if (j < 0 || j > this.f11669) {
            throw new IOException("Migration app field exceeds limit");
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new IOException("Truncated migration app field");
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11283() throws IOException {
        C19222 c19222 = this.f11676;
        if (c19222 == null || this.f11674 == null || this.f11671 == null || this.f11672 == null || this.f11679 == null) {
            throw new IOException("Incomplete migration app fields");
        }
        if ((c19222.m44355() == 0 && this.f11675 != 0) || (this.f11676.m44355() == this.f11676.m44359() - 1 && ((long) this.f11675) + ((long) this.f11670) != this.f11673.length())) {
            throw new IOException("Migration page range disagrees with fragment manifest");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10336 c10336 = this.f11679;
        if (c10336 != null) {
            c10336.close();
        }
    }
}
