package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C9713 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֫ */
    public final C15747 f26827;

    /* JADX INFO: renamed from: ۧ */
    public final C22140 f26828;

    /* JADX INFO: renamed from: ܽ */
    public final C6046 f26829 = new C6046();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m22681(int i, String str) {
        if (this.f26828.m49926()) {
            return;
        }
        Iterator it = this.f26829.m13623(i, str).iterator();
        while (it.hasNext()) {
            C15747.m35796(this.f26827, this.f26828, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m22682(String str, String str2) {
        if (this.f26828.m49926()) {
            return;
        }
        Iterator it = this.f26829.m13624(str, str2).iterator();
        while (it.hasNext()) {
            C15747.m35796(this.f26827, this.f26828, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m22683(String str, String str2, String str3, C12752 c12752) {
        if (this.f26828.m49926()) {
            return;
        }
        for (String str4 : this.f26829.m13625(str, str2, c12752)) {
            if (!str4.equals(str)) {
                C15747.m35796(this.f26827, this.f26828, str4);
            }
        }
        C15747.m35797(this.f26827, this.f26828, str, c12752);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m22684(String str, String str2, String str3, C12752 c12752) {
        if (!this.f26828.m49926() && this.f26829.m13626(str, str2, c12752)) {
            C15747.m35797(this.f26827, this.f26828, str, c12752);
        }
    }

    public C9713(C15747 c15747, C22140 c22140) {
        this.f26827 = c15747;
        this.f26828 = c22140;
    }
}
