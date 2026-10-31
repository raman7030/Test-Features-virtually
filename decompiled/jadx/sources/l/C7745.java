package l;

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
public final /* synthetic */ class C7745 implements Path {
    public final /* synthetic */ InterfaceC20758 a;

    public /* synthetic */ C7745(InterfaceC20758 interfaceC20758) {
        this.a = interfaceC20758;
    }

    public static /* synthetic */ Path l(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 == null) {
            return null;
        }
        return interfaceC20758 instanceof C14094 ? ((C14094) interfaceC20758).a : new C7745(interfaceC20758);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(AbstractC22791.p(path));
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(Path path) {
        return this.a.compareTo(C14094.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(Path path) {
        return this.a.endsWith(C14094.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20758 interfaceC20758 = this.a;
        if (obj instanceof C7745) {
            obj = ((C7745) obj).a;
        }
        return interfaceC20758.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        C19846.forEach(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return l(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C7556.b(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return l(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return l(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return l(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return l(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C19035.a(this.a.register(C0689.b(watchService), AbstractC22791.G(kindArr)));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C19035.a(this.a.register(C0689.b(watchService), AbstractC22791.G(kindArr), AbstractC22791.H(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path relativize(Path path) {
        return l(this.a.relativize(C14094.l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return l(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(Path path) {
        return l(this.a.resolve(C14094.l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return l(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(Path path) {
        return l(this.a.resolveSibling(C14094.l(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return C8180.convert(C19846.spliterator(this.a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(Path path) {
        return this.a.startsWith(C14094.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return l(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return l(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toRealPath(LinkOption[] linkOptionArr) {
        return l(this.a.toRealPath(AbstractC22791.F(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C1001(this.a.iterator());
    }
}
