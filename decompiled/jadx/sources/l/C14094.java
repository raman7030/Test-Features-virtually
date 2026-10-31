package l;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14094 implements InterfaceC20758, InterfaceC4323 {
    public final /* synthetic */ Path a;

    public /* synthetic */ C14094(Path path) {
        this.a = path;
    }

    public static /* synthetic */ InterfaceC20758 l(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C7745 ? ((C7745) path).a : new C14094(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(AbstractC22791.p(obj));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ int compareTo(InterfaceC20758 interfaceC20758) {
        return this.a.compareTo(C7745.l(interfaceC20758));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean endsWith(InterfaceC20758 interfaceC20758) {
        return this.a.endsWith(C7745.l(interfaceC20758));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof C14094) {
            obj = ((C14094) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C19846.forEach(this.a, consumer);
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 getFileName() {
        return l(this.a.getFileName());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ AbstractC7145 getFileSystem() {
        return C23078.b(this.a.getFileSystem());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 getName(int i) {
        return l(this.a.getName(i));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 getParent() {
        return l(this.a.getParent());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 getRoot() {
        return l(this.a.getRoot());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 normalize() {
        return l(this.a.normalize());
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final /* synthetic */ InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr) {
        return C2807.a(this.a.register(C1395.b(interfaceC5235), AbstractC22791.L(interfaceC18641Arr)));
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final /* synthetic */ InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr, InterfaceC19347[] interfaceC19347Arr) {
        return C2807.a(this.a.register(C1395.b(interfaceC5235), AbstractC22791.L(interfaceC18641Arr), AbstractC22791.M(interfaceC19347Arr)));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 relativize(InterfaceC20758 interfaceC20758) {
        return l(this.a.relativize(C7745.l(interfaceC20758)));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 resolve(String str) {
        return l(this.a.resolve(str));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 resolve(InterfaceC20758 interfaceC20758) {
        return l(this.a.resolve(C7745.l(interfaceC20758)));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 resolveSibling(String str) {
        return l(this.a.resolveSibling(str));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 resolveSibling(InterfaceC20758 interfaceC20758) {
        return l(this.a.resolveSibling(C7745.l(interfaceC20758)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ boolean startsWith(InterfaceC20758 interfaceC20758) {
        return this.a.startsWith(C7745.l(interfaceC20758));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 subpath(int i, int i2) {
        return l(this.a.subpath(i, i2));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 toAbsolutePath() {
        return l(this.a.toAbsolutePath());
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ InterfaceC20758 toRealPath(EnumC14406[] enumC14406Arr) {
        return l(this.a.toRealPath(AbstractC22791.K(enumC14406Arr)));
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // l.InterfaceC20758
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // l.InterfaceC20758, java.lang.Iterable
    public final Iterator iterator() {
        return new C1001(this.a.iterator());
    }
}
