package l;

import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C4830 implements InterfaceC18341 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PrintWriter f15263;

    public C4830(PrintWriter printWriter) {
        this.f15263 = printWriter;
    }

    @Override // l.InterfaceC18341
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14069(C17524 c17524) {
        PrintWriter printWriter = this.f15263;
        printWriter.print("exports ");
        printWriter.print(c17524.f53523.f24143);
        C2609 c2609 = c17524.f53522;
        List listUnmodifiableList = c2609 == null ? null : C20195.unmodifiableList(c2609);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C5378.stream(listUnmodifiableList).map(new C6779(4)).collect(C22976.joining(", ")));
        }
    }

    @Override // l.InterfaceC18341
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14071(C23874 c23874) {
        PrintWriter printWriter = this.f15263;
        printWriter.print("opens ");
        printWriter.print(c23874.f77199.f24143);
        C2609 c2609 = c23874.f77198;
        List listUnmodifiableList = c2609 == null ? null : C20195.unmodifiableList(c2609);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C5378.stream(listUnmodifiableList).map(new C6779(4)).collect(C22976.joining(", ")));
        }
    }

    @Override // l.InterfaceC18341
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14070(C21053 c21053) {
        PrintWriter printWriter = this.f15263;
        printWriter.print("provides ");
        printWriter.print(c21053.f67912.f42767);
        printWriter.print(" with ");
        printWriter.print((String) C5378.stream(c21053.f67911).map(new C6779(4)).collect(C22976.joining(", ")));
    }

    @Override // l.InterfaceC18341
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14067(C9764 c9764) {
        PrintWriter printWriter = this.f15263;
        printWriter.print("requires ");
        Set set = c9764.f29540;
        if (set.contains(EnumC9058.STATIC_PHASE)) {
            printWriter.print("static ");
        }
        if (set.contains(EnumC9058.TRANSITIVE)) {
            printWriter.print("transitive ");
        }
        printWriter.print(c9764.f29541.f17562);
    }

    @Override // l.InterfaceC18341
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14068(C16112 c16112) {
        PrintWriter printWriter = this.f15263;
        printWriter.print("uses ");
        printWriter.print(c16112.f49647.f42767);
    }
}
