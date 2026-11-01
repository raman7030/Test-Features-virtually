package p067l;

import java.io.DataOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C2775 extends AbstractC6129 {

    /* JADX INFO: renamed from: ܽ */
    public StringBuilder f4682;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f4683 = new ArrayList();

    @Override // p067l.InterfaceC3446
    public final void flush() {
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo4343() {
        return null;
    }

    @Override // p067l.AbstractC6129
    /* JADX INFO: renamed from: ۧ */
    public final String mo4346() {
        return "string";
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m4348() {
        return this.f4683;
    }

    public final String toString() {
        return (String) C7480.stream(this.f4683).map(new C20002(6)).collect(C24205.joining(System.lineSeparator()));
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ۧ */
    public final void mo4347(String str) {
        String str2 = this.f15392;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C21459.m48622("Ended with a different class: ", str, "; then ", str2, " was started."));
        }
        StringBuilder sb = this.f4682;
        if (sb != null) {
            this.f4683.add(new C20882(str, sb.toString()));
        }
        super.mo4347(str);
        this.f4682 = null;
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4345(String str, C18189 c18189, AbstractC21279 abstractC21279) {
        this.f15392 = str;
        this.f4682 = new StringBuilder();
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ܽ */
    public final void mo4349(String str) {
        StringBuilder sb = this.f4682;
        sb.append(str);
        sb.append("\n");
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4344(String str) {
        this.f4682.append(str);
    }
}
