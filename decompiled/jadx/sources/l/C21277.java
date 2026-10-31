package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21277 implements InterfaceC13965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10753 f68627;

    public C21277(C10753 c10753) {
        this.f68627 = c10753;
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ۧ */
    public final void mo1294(String str) throws IOException {
        this.f68627.startTag(null, str);
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1290(String str) throws IOException {
        this.f68627.endTag(null, str);
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1291(String str, String str2) throws IOException {
        this.f68627.attribute(null, str, str2);
    }

    @Override // l.InterfaceC13965
    public final void text(String str) throws IOException {
        this.f68627.text(str);
    }
}
