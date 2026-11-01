package p067l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.᩷ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C22143 {

    /* JADX INFO: renamed from: ۧ */
    public C12755 f70051;

    /* JADX INFO: renamed from: ܳ */
    public boolean f70052;

    /* JADX INFO: renamed from: ܽ */
    public C10743 f70053;

    /* JADX INFO: renamed from: ᩻ */
    public final ContextWrapper f70056;

    /* JADX INFO: renamed from: ֫ */
    public C19518 f70050 = C19518.f59441;

    /* JADX INFO: renamed from: ᩳ */
    public C16776 f70055 = InterfaceC24824.f79311;

    /* JADX INFO: renamed from: ܿ */
    public C22813 f70054 = InterfaceC8731.f23681;

    public C22143(ContextWrapper contextWrapper) {
        this.f70056 = contextWrapper;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49951(InterfaceC2418[] interfaceC2418Arr) {
        this.f70053 = new C10743(interfaceC2418Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10072 m49950() {
        C23877.m52960(!this.f70052);
        this.f70052 = true;
        if (this.f70053 == null) {
            this.f70053 = new C10743(new InterfaceC2418[0]);
        }
        if (this.f70051 == null) {
            this.f70051 = new C12755(this.f70056);
        }
        return new C10072(this);
    }
}
