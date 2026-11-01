package p067l;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9730 implements Path {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC22097 f26880a;

    public /* synthetic */ C9730(InterfaceC22097 interfaceC22097) {
        this.f26880a = interfaceC22097;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Path m22751l(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            return null;
        }
        return interfaceC22097 instanceof C15764 ? ((C15764) interfaceC22097).f45650a : new C9730(interfaceC22097);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f26880a.compareTo(AbstractC24029.m53247p(path));
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(Path path) {
        return this.f26880a.compareTo(C15764.m35828l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f26880a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(Path path) {
        return this.f26880a.endsWith(C15764.m35828l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC22097 interfaceC22097 = this.f26880a;
        if (obj instanceof C9730) {
            obj = ((C9730) obj).f26880a;
        }
        return interfaceC22097.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        C21230.forEach(this.f26880a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return m22751l(this.f26880a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C9550.m22253b(this.f26880a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return m22751l(this.f26880a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f26880a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return m22751l(this.f26880a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return m22751l(this.f26880a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f26880a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f26880a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return m22751l(this.f26880a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C20460.m46155a(this.f26880a.register(C3024.m5116b(watchService), AbstractC24029.m53217G(kindArr)));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C20460.m46155a(this.f26880a.register(C3024.m5116b(watchService), AbstractC24029.m53217G(kindArr), AbstractC24029.m53218H(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path relativize(Path path) {
        return m22751l(this.f26880a.relativize(C15764.m35828l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return m22751l(this.f26880a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(Path path) {
        return m22751l(this.f26880a.resolve(C15764.m35828l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return m22751l(this.f26880a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(Path path) {
        return m22751l(this.f26880a.resolveSibling(C15764.m35828l(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return C10143.convert(C21230.spliterator(this.f26880a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f26880a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(Path path) {
        return this.f26880a.startsWith(C15764.m35828l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return m22751l(this.f26880a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return m22751l(this.f26880a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f26880a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toRealPath(LinkOption[] linkOptionArr) {
        return m22751l(this.f26880a.toRealPath(AbstractC24029.m53216F(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f26880a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f26880a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C3320(this.f26880a.iterator());
    }
}
