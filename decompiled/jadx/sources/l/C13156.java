package l;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.۬ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13156 implements InterfaceC14484 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39320;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3279 f39321;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39322 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f39323;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f39324;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12451 f39325;

    public C13156(C12451 c12451, C3279 c3279, C15544 c15544, int i) {
        this.f39325 = c12451;
        this.f39321 = c3279;
        this.f39324 = c15544;
        this.f39319 = i;
    }

    @Override // l.InterfaceC14484
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 mo31882() {
        return this.f39321;
    }

    @Override // l.InterfaceC14484
    public final int position() {
        return this.f39323;
    }

    @Override // l.InterfaceC14484
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31883(int i, byte[] bArr) throws IOException {
        if (this.f39320) {
            throw new IllegalStateException("Hex restore delta entry is finished");
        }
        C12451.m30611(this.f39325);
        C9005.m23245(bArr.length, 0, i);
        if (i == 0) {
            return;
        }
        long j = i;
        if (((long) this.f39323) + j > this.f39319) {
            throw new IOException("Hex restore delta exceeds entry length");
        }
        long asLong = this.f39324.getAsLong();
        if (asLong < j) {
            throw new IOException("Invalid hex checkpoint delta offset");
        }
        long j2 = asLong - j;
        long j3 = this.f39322;
        if (j3 < 0) {
            this.f39322 = j2;
        } else {
            long j4 = this.f39323;
            if (j2 < j4 || j3 != j2 - j4) {
                throw new IOException("Non-contiguous hex checkpoint delta entry");
            }
        }
        this.f39323 += i;
    }

    @Override // l.InterfaceC14484
    public final void finish() throws IOException {
        if (this.f39320) {
            return;
        }
        C12451 c12451 = this.f39325;
        C12451.m30611(c12451);
        if (this.f39323 != this.f39319) {
            throw new IOException("Incomplete hex restore delta entry");
        }
        this.f39321.m10085(this.f39322);
        this.f39320 = true;
        C12451.m30610(c12451, this);
    }
}
