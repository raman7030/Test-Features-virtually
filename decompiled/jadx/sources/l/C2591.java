package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2591 implements InterfaceC23757 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18832 f8196;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3104 f8197;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f8198 = 4;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f8199 = C10957.m27273();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f8200;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15995 f8201;

    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ۧ */
    public final void mo6511() {
    }

    public C2591(InterfaceC21449 interfaceC21449, C3104 c3104, InterfaceC15995 interfaceC15995) {
        this.f8196 = new C18832(interfaceC21449);
        this.f8197 = c3104;
        this.f8201 = interfaceC15995;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m8209() {
        return this.f8200;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m8208() {
        return this.f8196.m43508();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri m8207() {
        return this.f8196.m43510();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m8210() {
        return this.f8196.m43507();
    }

    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ֫ */
    public final void mo6509() {
        this.f8196.m43509();
        C20038 c20038 = new C20038(this.f8196, this.f8197);
        try {
            c20038.m46233();
            Uri uriMo1621 = this.f8196.mo1621();
            uriMo1621.getClass();
            this.f8200 = this.f8201.mo33873(uriMo1621, c20038);
        } finally {
            C3603.m11024(c20038);
        }
    }
}
