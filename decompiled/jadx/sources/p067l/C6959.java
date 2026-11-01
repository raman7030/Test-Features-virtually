package p067l;

import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6959 implements InterfaceC19800 {

    /* JADX INFO: renamed from: ֫ */
    public final PrintWriter f18096;

    public C6959(PrintWriter printWriter) {
        this.f18096 = printWriter;
    }

    @Override // p067l.InterfaceC19800
    /* JADX INFO: renamed from: ֫ */
    public final void mo15949(C19023 c19023) {
        PrintWriter printWriter = this.f18096;
        printWriter.print("exports ");
        printWriter.print(c19023.f56714.f27059);
        C4848 c4848 = c19023.f56713;
        List listUnmodifiableList = c4848 == null ? null : C21562.unmodifiableList(c4848);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C7480.stream(listUnmodifiableList).map(new C8811(4)).collect(C24205.joining(", ")));
        }
    }

    @Override // p067l.InterfaceC19800
    /* JADX INFO: renamed from: ֫ */
    public final void mo15951(C25058 c25058) {
        PrintWriter printWriter = this.f18096;
        printWriter.print("opens ");
        printWriter.print(c25058.f79951.f27059);
        C4848 c4848 = c25058.f79950;
        List listUnmodifiableList = c4848 == null ? null : C21562.unmodifiableList(c4848);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C7480.stream(listUnmodifiableList).map(new C8811(4)).collect(C24205.joining(", ")));
        }
    }

    @Override // p067l.InterfaceC19800
    /* JADX INFO: renamed from: ֫ */
    public final void mo15950(C22377 c22377) {
        PrintWriter printWriter = this.f18096;
        printWriter.print("provides ");
        printWriter.print(c22377.f70596.f45855);
        printWriter.print(" with ");
        printWriter.print((String) C7480.stream(c22377.f70595).map(new C8811(4)).collect(C24205.joining(", ")));
    }

    @Override // p067l.InterfaceC19800
    /* JADX INFO: renamed from: ֫ */
    public final void mo15947(C11648 c11648) {
        PrintWriter printWriter = this.f18096;
        printWriter.print("requires ");
        Set set = c11648.f32493;
        if (set.contains(EnumC10977.STATIC_PHASE)) {
            printWriter.print("static ");
        }
        if (set.contains(EnumC10977.TRANSITIVE)) {
            printWriter.print("transitive ");
        }
        printWriter.print(c11648.f32494.f20408);
    }

    @Override // p067l.InterfaceC19800
    /* JADX INFO: renamed from: ֫ */
    public final void mo15948(C17681 c17681) {
        PrintWriter printWriter = this.f18096;
        printWriter.print("uses ");
        printWriter.print(c17681.f52813.f45855);
    }
}
