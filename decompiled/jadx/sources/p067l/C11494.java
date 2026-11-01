package p067l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11494 extends AbstractC6129 {

    /* JADX INFO: renamed from: ܽ */
    public ByteArrayOutputStream f32084;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f32085 = new ArrayList();

    @Override // p067l.InterfaceC3446
    public final void flush() {
    }

    @Override // p067l.AbstractC6129
    /* JADX INFO: renamed from: ۧ */
    public final String mo4346() {
        return "byte stream";
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m26547() {
        return this.f32085;
    }

    public final String toString() {
        return (String) C7480.stream(this.f32085).map(new C8811(0)).collect(C24205.joining(System.lineSeparator()));
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo4343() {
        return new DataOutputStream(this.f32084);
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ۧ */
    public final void mo4347(String str) {
        String str2 = this.f15392;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C20865.m47154("Ended different class: ", str, " then was started ", str2));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f32084;
        if (byteArrayOutputStream != null) {
            this.f32085.add(new C22223(str, byteArrayOutputStream.toByteArray()));
        }
        super.mo4347(str);
        this.f32084 = null;
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4345(String str, C18189 c18189, AbstractC21279 abstractC21279) {
        this.f15392 = str;
        this.f32084 = new ByteArrayOutputStream(1024);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ܽ */
    public final void mo4349(String str) {
        try {
            this.f32084.write((str + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4344(String str) {
        try {
            this.f32084.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
