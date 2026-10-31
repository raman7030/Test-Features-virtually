package l;

import java.security.PrivilegedExceptionAction;

/* JADX INFO: renamed from: l.ܳ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes3.dex */
public final class C14200 implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23373 f42860;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f42861;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42862;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3450 f42863;

    public C14200(C23373 c23373, String str, String str2, C3450 c3450, boolean z) {
        this.f42860 = c23373;
        this.f42862 = str2;
        this.f42863 = c3450;
        this.f42861 = z;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        C23373 c23373 = this.f42860;
        return c23373.m51810().mo16134(c23373.getContext(), this.f42862, this.f42863.m10535(), this.f42861);
    }
}
