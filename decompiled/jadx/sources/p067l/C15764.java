package p067l;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15764 implements InterfaceC22097, InterfaceC6477 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Path f45650a;

    public /* synthetic */ C15764(Path path) {
        this.f45650a = path;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC22097 m35828l(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C9730 ? ((C9730) path).f26880a : new C15764(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f45650a.compareTo(AbstractC24029.m53247p(obj));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ int compareTo(InterfaceC22097 interfaceC22097) {
        return this.f45650a.compareTo(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f45650a.endsWith(str);
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean endsWith(InterfaceC22097 interfaceC22097) {
        return this.f45650a.endsWith(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f45650a;
        if (obj instanceof C15764) {
            obj = ((C15764) obj).f45650a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final /* synthetic */ void forEach(Consumer consumer) {
        C21230.forEach(this.f45650a, consumer);
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 getFileName() {
        return m35828l(this.f45650a.getFileName());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ AbstractC9159 getFileSystem() {
        return C24302.m53636b(this.f45650a.getFileSystem());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 getName(int i) {
        return m35828l(this.f45650a.getName(i));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ int getNameCount() {
        return this.f45650a.getNameCount();
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 getParent() {
        return m35828l(this.f45650a.getParent());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 getRoot() {
        return m35828l(this.f45650a.getRoot());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ int hashCode() {
        return this.f45650a.hashCode();
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean isAbsolute() {
        return this.f45650a.isAbsolute();
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 normalize() {
        return m35828l(this.f45650a.normalize());
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final /* synthetic */ InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr) {
        return C5037.m10742a(this.f45650a.register(C3695.m7126b(interfaceC7344), AbstractC24029.m53222L(interfaceC20085Arr)));
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final /* synthetic */ InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr, InterfaceC20756[] interfaceC20756Arr) {
        return C5037.m10742a(this.f45650a.register(C3695.m7126b(interfaceC7344), AbstractC24029.m53222L(interfaceC20085Arr), AbstractC24029.m53223M(interfaceC20756Arr)));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 relativize(InterfaceC22097 interfaceC22097) {
        return m35828l(this.f45650a.relativize(C9730.m22751l(interfaceC22097)));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 resolve(String str) {
        return m35828l(this.f45650a.resolve(str));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 resolve(InterfaceC22097 interfaceC22097) {
        return m35828l(this.f45650a.resolve(C9730.m22751l(interfaceC22097)));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 resolveSibling(String str) {
        return m35828l(this.f45650a.resolveSibling(str));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 resolveSibling(InterfaceC22097 interfaceC22097) {
        return m35828l(this.f45650a.resolveSibling(C9730.m22751l(interfaceC22097)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f45650a.spliterator());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f45650a.startsWith(str);
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ boolean startsWith(InterfaceC22097 interfaceC22097) {
        return this.f45650a.startsWith(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 subpath(int i, int i2) {
        return m35828l(this.f45650a.subpath(i, i2));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 toAbsolutePath() {
        return m35828l(this.f45650a.toAbsolutePath());
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ File toFile() {
        return this.f45650a.toFile();
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ InterfaceC22097 toRealPath(EnumC16060[] enumC16060Arr) {
        return m35828l(this.f45650a.toRealPath(AbstractC24029.m53221K(enumC16060Arr)));
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ String toString() {
        return this.f45650a.toString();
    }

    @Override // p067l.InterfaceC22097
    public final /* synthetic */ URI toUri() {
        return this.f45650a.toUri();
    }

    @Override // p067l.InterfaceC22097, java.lang.Iterable
    public final Iterator iterator() {
        return new C3320(this.f45650a.iterator());
    }
}
