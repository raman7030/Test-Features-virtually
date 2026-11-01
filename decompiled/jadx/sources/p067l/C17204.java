package p067l;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17204 implements InterfaceC22097 {

    /* JADX INFO: renamed from: h */
    public static final Pattern f51205h = Pattern.compile("/+");

    /* JADX INFO: renamed from: a */
    public final AbstractC9159 f51206a;

    /* JADX INFO: renamed from: b */
    public final String f51207b;

    /* JADX INFO: renamed from: c */
    public final List f51208c;

    /* JADX INFO: renamed from: d */
    public final boolean f51209d;

    /* JADX INFO: renamed from: e */
    public final String f51210e;

    /* JADX INFO: renamed from: f */
    public final String f51211f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f51212g;

    public C17204(AbstractC9159 abstractC9159, String str, String str2, String str3) {
        this(abstractC9159, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) C23573.stream(f51205h.split(str)).filter(new C10500(0)).collect(C24205.toUnmodifiableList()), str2, str3);
    }

    public C17204(AbstractC9159 abstractC9159, boolean z, List list, String str, String str2) {
        this.f51206a = abstractC9159;
        this.f51209d = z;
        this.f51208c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC24029.m53211A(list));
        this.f51207b = sb.toString();
        this.f51210e = str;
        this.f51211f = str2;
    }

    @Override // p067l.InterfaceC22097
    public final AbstractC9159 getFileSystem() {
        return this.f51206a;
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 toRealPath(EnumC16060[] enumC16060Arr) {
        this.f51206a.provider().checkAccess(this, EnumC13183.READ);
        if (Arrays.asList(enumC16060Arr).contains(EnumC16060.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new C17204(this.f51206a, toFile().getCanonicalPath(), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C17204 toAbsolutePath() {
        if (this.f51209d) {
            return this;
        }
        AbstractC9159 abstractC9159 = this.f51206a;
        String str = this.f51210e;
        return new C17204(abstractC9159, str, str, this.f51211f).resolve(this);
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 getRoot() {
        if (!this.f51209d) {
            return null;
        }
        AbstractC9159 abstractC9159 = this.f51206a;
        String str = this.f51211f;
        return new C17204(abstractC9159, str, this.f51210e, str);
    }

    @Override // p067l.InterfaceC22097
    public final boolean isAbsolute() {
        return this.f51209d;
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 getFileName() {
        if (this.f51208c.isEmpty()) {
            if (this.f51209d) {
                return null;
            }
            return this;
        }
        AbstractC9159 abstractC9159 = this.f51206a;
        List list = this.f51208c;
        return new C17204(abstractC9159, (String) list.get(list.size() - 1), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    public final int getNameCount() {
        return this.f51208c.size();
    }

    @Override // p067l.InterfaceC22097
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C17204 getName(int i) {
        if (i < 0 || i >= this.f51208c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C17204(this.f51206a, (String) this.f51208c.get(i), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C17204 getParent() {
        int size = this.f51208c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.f51209d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51209d) {
            sb.append("/");
        }
        sb.append(AbstractC24029.m53211A(this.f51208c.subList(0, size - 1)));
        return new C17204(this.f51206a, sb.toString(), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 subpath(int i, int i2) {
        return new C17204(this.f51206a, AbstractC24029.m53211A(this.f51208c.subList(i, i2)), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    public final boolean startsWith(String str) {
        return startsWith(new C17204(this.f51206a, str, this.f51210e, this.f51211f));
    }

    @Override // p067l.InterfaceC22097
    public final boolean startsWith(InterfaceC22097 interfaceC22097) {
        int size;
        C12826.requireNonNull(interfaceC22097);
        if (!(interfaceC22097 instanceof C17204)) {
            return false;
        }
        C17204 c17204 = (C17204) interfaceC22097;
        if (this.f51209d != c17204.f51209d || this.f51208c.size() < (size = c17204.f51208c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(c17204.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC22097
    public final boolean endsWith(String str) {
        return endsWith(new C17204(this.f51206a, str, this.f51210e, this.f51211f));
    }

    @Override // p067l.InterfaceC22097
    public final boolean endsWith(InterfaceC22097 interfaceC22097) {
        C12826.requireNonNull(interfaceC22097);
        if (!(interfaceC22097 instanceof C17204)) {
            return false;
        }
        C17204 c17204 = (C17204) interfaceC22097;
        if (!c17204.f51209d) {
            int size = c17204.f51208c.size();
            if (this.f51208c.size() < size) {
                return false;
            }
            int size2 = this.f51208c.size();
            for (int i = size - 1; i >= 0; i--) {
                if (!getName((i - size) + size2).equals(c17204.getName(i))) {
                    return false;
                }
            }
            return true;
        }
        return equals(interfaceC22097);
    }

    @Override // p067l.InterfaceC22097
    public final boolean equals(Object obj) {
        return (obj instanceof C17204) && compareTo((InterfaceC22097) obj) == 0;
    }

    @Override // p067l.InterfaceC22097
    public final int hashCode() {
        return this.f51207b.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC22097 interfaceC22097) {
        return this.f51207b.compareTo(((C17204) interfaceC22097).f51207b);
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f51208c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC9159 abstractC9159 = this.f51206a;
        boolean z = this.f51209d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC24029.m53211A(arrayDeque));
        return new C17204(abstractC9159, sb.toString(), this.f51210e, this.f51211f);
    }

    @Override // p067l.InterfaceC22097
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C17204 resolve(InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 instanceof C17204) {
            if (((C17204) interfaceC22097).f51209d) {
                return (C17204) interfaceC22097;
            }
            return new C17204(this.f51206a, this.f51207b + "/" + interfaceC22097, this.f51210e, this.f51211f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC22097, interfaceC22097.getFileSystem()));
    }

    @Override // p067l.InterfaceC22097
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C17204 resolveSibling(InterfaceC22097 interfaceC22097) {
        if (!(C12826.requireNonNull(interfaceC22097) instanceof C17204)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC22097, interfaceC22097.getFileSystem()));
        }
        C17204 parent = getParent();
        return parent == null ? (C17204) interfaceC22097 : parent.resolve(interfaceC22097);
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 resolveSibling(String str) {
        return resolveSibling(new C17204(this.f51206a, str, this.f51210e, this.f51211f));
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 relativize(InterfaceC22097 interfaceC22097) {
        int i = 0;
        if (interfaceC22097 instanceof C17204) {
            if (this.f51209d != ((C17204) interfaceC22097).f51209d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((C17204) interfaceC22097).f51208c;
            int size = this.f51208c.size();
            int size2 = list.size();
            while (i < size && i < size2 && ((String) this.f51208c.get(i)).equals(list.get(i))) {
                i++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = i; i2 < size; i2++) {
                arrayList.add("..");
            }
            while (i < size2) {
                arrayList.add((String) list.get(i));
                i++;
            }
            return new C17204(this.f51206a, false, arrayList, this.f51210e, this.f51211f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC22097, interfaceC22097.getFileSystem()));
    }

    @Override // p067l.InterfaceC22097
    public final File toFile() {
        return new File(this.f51207b);
    }

    @Override // p067l.InterfaceC22097
    public final URI toUri() {
        char[] cArr = AbstractC4465.f10033c;
        C17204 absolutePath = toAbsolutePath();
        if (absolutePath.f51212g == null) {
            absolutePath.f51212g = absolutePath.f51207b.getBytes(AbstractC5806.f14267a);
        }
        byte[] bArr = absolutePath.f51212g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = AbstractC4465.f10031a;
            long j2 = AbstractC4465.f10032b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = AbstractC4465.f10033c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.InterfaceC22097
    public final String toString() {
        return this.f51207b;
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr, InterfaceC20756... interfaceC20756Arr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 resolve(String str) {
        return resolve(getFileSystem().getPath(str, new String[0]));
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085... interfaceC20085Arr) {
        register(interfaceC7344, interfaceC20085Arr, new InterfaceC20756[0]);
        throw null;
    }

    @Override // p067l.InterfaceC22097, java.lang.Iterable
    public final Iterator iterator() {
        return new C24482(this);
    }
}
