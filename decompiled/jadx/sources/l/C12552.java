package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12552 implements InterfaceC21725 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37678;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37682;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f37680 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f37683 = 65536;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37681 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8319[] f37679 = new C8319[100];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C8319 m30781() {
        C8319 c8319;
        int i = this.f37678 + 1;
        this.f37678 = i;
        int i2 = this.f37681;
        if (i2 > 0) {
            C8319[] c8319Arr = this.f37679;
            int i3 = i2 - 1;
            this.f37681 = i3;
            c8319 = c8319Arr[i3];
            c8319.getClass();
            this.f37679[this.f37681] = null;
        } else {
            C8319 c83110 = new C8319(new byte[this.f37683], 0);
            C8319[] c8319Arr2 = this.f37679;
            if (i > c8319Arr2.length) {
                this.f37679 = (C8319[]) Arrays.copyOf(c8319Arr2, c8319Arr2.length * 2);
            }
            c8319 = c83110;
        }
        return c8319;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30782(int i) {
        boolean z = i < this.f37682;
        this.f37682 = i;
        if (z) {
            m30787();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized int m30786() {
        return this.f37678 * this.f37683;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30787() {
        int iMax = Math.max(0, C3603.m10999(this.f37682, this.f37683) - this.f37678);
        int i = this.f37681;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f37679, iMax, i, (Object) null);
        this.f37681 = iMax;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30788() {
        if (this.f37680) {
            m30782(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30783(C8319 c8319) {
        C8319[] c8319Arr = this.f37679;
        int i = this.f37681;
        this.f37681 = i + 1;
        c8319Arr[i] = c8319;
        this.f37678--;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30784(InterfaceC15373 interfaceC15373) {
        while (interfaceC15373 != null) {
            C8319[] c8319Arr = this.f37679;
            int i = this.f37681;
            this.f37681 = i + 1;
            c8319Arr[i] = interfaceC15373.mo18655();
            this.f37678--;
            interfaceC15373 = interfaceC15373.next();
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30785() {
        return this.f37683;
    }
}
