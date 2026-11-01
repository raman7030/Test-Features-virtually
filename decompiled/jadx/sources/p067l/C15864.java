package p067l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ܳ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes3.dex */
public final class C15864 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24582 f45950;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean f45951;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f45952;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C5648 f45953;

    public C15864(C24582 c24582, String str, String str2, C5648 c5648, boolean z) {
        this.f45950 = c24582;
        this.f45952 = str2;
        this.f45953 = c5648;
        this.f45951 = z;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        C24582 c24582 = this.f45950;
        return c24582.m54207().mo18053(c24582.getContext(), this.f45952, this.f45953.m12559(), this.f45951);
    }
}
