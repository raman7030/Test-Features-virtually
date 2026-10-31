package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۤ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31646;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f31647;

    public C10540(InterfaceC7785 interfaceC7785, int i) {
        this.f31647 = interfaceC7785;
        this.f31646 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26469() throws EOFException {
        while (true) {
            int i = this.f31646;
            InterfaceC7785 interfaceC7785 = this.f31647;
            if (i < interfaceC7785.length()) {
                char cCharAt = interfaceC7785.charAt(this.f31646);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                    return;
                } else {
                    this.f31646++;
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26470(String str) throws EOFException {
        while (true) {
            int i = this.f31646;
            InterfaceC7785 interfaceC7785 = this.f31647;
            if (i < interfaceC7785.length()) {
                if (str.indexOf(interfaceC7785.charAt(this.f31646)) != -1) {
                    return;
                } else {
                    this.f31646++;
                }
            } else {
                throw new EOFException();
            }
        }
    }
}
