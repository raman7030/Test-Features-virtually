package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17224 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C20579 f51262;

    /* JADX INFO: renamed from: ۙ */
    public int f51263;

    /* JADX INFO: renamed from: ۬ */
    public C23261 f51264;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f51265;

    /* JADX INFO: renamed from: ᩸ */
    public int f51266;

    /* JADX INFO: renamed from: ᩹ */
    public int f51267 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13104(int i, Object obj);

    public AbstractC17224(C20579 c20579) {
        this.f51262 = c20579;
        this.f51263 = c20579.f63608;
        this.f51266 = c20579.f63610;
        this.f51265 = c20579.f63615;
    }

    public final boolean hasNext() {
        return this.f51266 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38995() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f51266--;
        boolean z = this.f51265;
        C20579 c20579 = this.f51262;
        if (z) {
            this.f51265 = false;
            int i2 = c20579.f63608;
            this.f51267 = i2;
            return i2;
        }
        char[] cArr = c20579.f63607;
        do {
            i = this.f51263 - 1;
            this.f51263 = i;
            if (i < 0) {
                this.f51267 = Integer.MIN_VALUE;
                char c = this.f51264.getChar((-i) - 1);
                int iM34881 = C15322.m34881((int) c);
                int i3 = c20579.f63612;
                while (true) {
                    int i4 = iM34881 & i3;
                    if (c == cArr[i4]) {
                        return i4;
                    }
                    iM34881 = i4 + 1;
                    i3 = c20579.f63612;
                }
            }
        } while (cArr[i] == 0);
        this.f51267 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f51265;
        C20579 c20579 = this.f51262;
        if (z) {
            this.f51265 = false;
            int i2 = c20579.f63608;
            this.f51267 = i2;
            mo13104(i2, obj);
            this.f51266--;
        }
        char[] cArr = c20579.f63607;
        while (this.f51266 != 0) {
            int i3 = this.f51263 - 1;
            this.f51263 = i3;
            if (i3 < 0) {
                this.f51267 = Integer.MIN_VALUE;
                char c = this.f51264.getChar((-i3) - 1);
                int iM34881 = C15322.m34881((int) c);
                int i4 = c20579.f63612;
                while (true) {
                    i = iM34881 & i4;
                    if (c == cArr[i]) {
                        break;
                    }
                    iM34881 = i + 1;
                    i4 = c20579.f63612;
                }
                mo13104(i, obj);
                this.f51266--;
            } else if (cArr[i3] != 0) {
                this.f51267 = i3;
                mo13104(i3, obj);
                this.f51266--;
            }
        }
    }

    public void remove() {
        char c;
        int i = this.f51267;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C20579 c20579 = this.f51262;
        int i2 = c20579.f63608;
        if (i == i2) {
            c20579.f63615 = false;
            c20579.f63617[i2] = null;
        } else {
            int i3 = this.f51263;
            if (i3 >= 0) {
                char[] cArr = c20579.f63607;
                Object[] objArr = c20579.f63617;
                loop0: while (true) {
                    int i4 = (i + 1) & c20579.f63612;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM34881 = C15322.m34881((int) c);
                            int i5 = c20579.f63612;
                            int i6 = iM34881 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f51264 == null) {
                            this.f51264 = new C23261(2);
                        }
                        this.f51264.mo11023(cArr[i4]);
                    }
                    cArr[i] = c;
                    objArr[i] = objArr[i4];
                    i = i4;
                }
                cArr[i] = 0;
                objArr[i] = null;
            } else {
                c20579.mo15134(this.f51264.getChar((-i3) - 1));
                this.f51267 = -1;
                return;
            }
        }
        c20579.f63610--;
        this.f51267 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ /* synthetic */ void m38996(InterfaceC24857 interfaceC24857) {
        forEachRemaining((Object) interfaceC24857);
    }
}
