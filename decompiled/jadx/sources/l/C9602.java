package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9602 extends AbstractC3957 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f29137;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29138 = new ArrayList();

    @Override // l.InterfaceC1134
    public final void flush() {
    }

    @Override // l.AbstractC3957
    /* JADX INFO: renamed from: ۧ */
    public final String mo1970() {
        return "byte stream";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m24535() {
        return this.f29138;
    }

    public final String toString() {
        return (String) C5378.stream(this.f29138).map(new C6779(0)).collect(C22976.joining(System.lineSeparator()));
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo1967() {
        return new DataOutputStream(this.f29137);
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ۧ */
    public final void mo1971(String str) {
        String str2 = this.f12584;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C19462.m44858("Ended different class: ", str, " then was started ", str2));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f29137;
        if (byteArrayOutputStream != null) {
            this.f29138.add(new C20891(str, byteArrayOutputStream.toByteArray()));
        }
        super.mo1971(str);
        this.f29137 = null;
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1969(String str, C16646 c16646, AbstractC19898 abstractC19898) {
        this.f12584 = str;
        this.f29137 = new ByteArrayOutputStream(1024);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ */
    public final void mo1973(String str) {
        try {
            this.f29137.write((str + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1968(String str) {
        try {
            this.f29137.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
