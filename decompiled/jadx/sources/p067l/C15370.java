package p067l;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C15370 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f43912;

    /* JADX INFO: renamed from: ۧ */
    public final C9336 f43913;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12516 f43914;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f43915;

    public C15370(C12516 c12516, C9336 c9336) {
        this.f43914 = c12516;
        this.f43913 = c9336;
        this.f43915 = c9336.f25436 ? null : new boolean[c12516.f35116];
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35035() {
        C9336 c9336 = this.f43913;
        if (c9336.f25435 != this) {
            return;
        }
        int i = 0;
        while (true) {
            C12516 c12516 = this.f43914;
            if (i < c12516.f35116) {
                try {
                    c12516.f35106.mo41668(c9336.f25437[i]);
                } catch (IOException unused) {
                }
                i++;
            } else {
                c9336.f25435 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7603 m35032(int i) {
        synchronized (this.f43914) {
            if (this.f43912) {
                throw new IllegalStateException();
            }
            C9336 c9336 = this.f43913;
            if (c9336.f25435 != this) {
                return C25037.m54973();
            }
            if (!c9336.f25436) {
                this.f43915[i] = true;
            }
            try {
                return new C24088(this, this.f43914.f35106.mo41664(c9336.f25437[i]));
            } catch (FileNotFoundException unused) {
                return C25037.m54973();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35034() {
        synchronized (this.f43914) {
            if (this.f43912) {
                throw new IllegalStateException();
            }
            if (this.f43913.f25435 == this) {
                this.f43914.m28838(this, true);
            }
            this.f43912 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35033() {
        synchronized (this.f43914) {
            if (this.f43912) {
                throw new IllegalStateException();
            }
            if (this.f43913.f25435 == this) {
                this.f43914.m28838(this, false);
            }
            this.f43912 = true;
        }
    }
}
