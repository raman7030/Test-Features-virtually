package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7727 implements InterfaceC2458 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14076 f23914;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20803 f23915;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3869 f23916 = new C3869();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m20701(int i, String str) {
        if (this.f23915.m47598()) {
            return;
        }
        Iterator it = this.f23916.m11687(i, str).iterator();
        while (it.hasNext()) {
            C14076.m33671(this.f23914, this.f23915, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m20702(String str, String str2) {
        if (this.f23915.m47598()) {
            return;
        }
        Iterator it = this.f23916.m11688(str, str2).iterator();
        while (it.hasNext()) {
            C14076.m33671(this.f23914, this.f23915, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m20703(String str, String str2, String str3, C10925 c10925) {
        if (this.f23915.m47598()) {
            return;
        }
        for (String str4 : this.f23916.m11689(str, str2, c10925)) {
            if (!str4.equals(str)) {
                C14076.m33671(this.f23914, this.f23915, str4);
            }
        }
        C14076.m33672(this.f23914, this.f23915, str, c10925);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20704(String str, String str2, String str3, C10925 c10925) {
        if (!this.f23915.m47598() && this.f23916.m11690(str, str2, c10925)) {
            C14076.m33672(this.f23914, this.f23915, str, c10925);
        }
    }

    public C7727(C14076 c14076, C20803 c20803) {
        this.f23914 = c14076;
        this.f23915 = c20803;
    }
}
