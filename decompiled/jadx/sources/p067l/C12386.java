package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۤ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12386 {

    /* JADX INFO: renamed from: ֫ */
    public int f34610;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9768 f34611;

    public C12386(InterfaceC9768 interfaceC9768, int i) {
        this.f34611 = interfaceC9768;
        this.f34610 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28502() throws EOFException {
        while (true) {
            int i = this.f34610;
            InterfaceC9768 interfaceC9768 = this.f34611;
            if (i < interfaceC9768.length()) {
                char cCharAt = interfaceC9768.charAt(this.f34610);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                    return;
                } else {
                    this.f34610++;
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28503(String str) throws EOFException {
        while (true) {
            int i = this.f34610;
            InterfaceC9768 interfaceC9768 = this.f34611;
            if (i < interfaceC9768.length()) {
                if (str.indexOf(interfaceC9768.charAt(this.f34610)) != -1) {
                    return;
                } else {
                    this.f34610++;
                }
            } else {
                throw new EOFException();
            }
        }
    }
}
