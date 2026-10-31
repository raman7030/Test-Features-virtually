package l;

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
public final class C15610 implements InterfaceC20758 {
    public static final Pattern h = Pattern.compile("/+");
    public final AbstractC7145 a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public C15610(AbstractC7145 abstractC7145, String str, String str2, String str3) {
        this(abstractC7145, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) C22311.stream(h.split(str)).filter(new C8556(0)).collect(C22976.toUnmodifiableList()), str2, str3);
    }

    public C15610(AbstractC7145 abstractC7145, boolean z, List list, String str, String str2) {
        this.a = abstractC7145;
        this.d = z;
        this.c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC22791.A(list));
        this.b = sb.toString();
        this.e = str;
        this.f = str2;
    }

    @Override // l.InterfaceC20758
    public final AbstractC7145 getFileSystem() {
        return this.a;
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 toRealPath(EnumC14406[] enumC14406Arr) {
        this.a.provider().checkAccess(this, EnumC11379.READ);
        if (Arrays.asList(enumC14406Arr).contains(EnumC14406.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new C15610(this.a, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C15610 toAbsolutePath() {
        if (this.d) {
            return this;
        }
        AbstractC7145 abstractC7145 = this.a;
        String str = this.e;
        return new C15610(abstractC7145, str, str, this.f).resolve(this);
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 getRoot() {
        if (!this.d) {
            return null;
        }
        AbstractC7145 abstractC7145 = this.a;
        String str = this.f;
        return new C15610(abstractC7145, str, this.e, str);
    }

    @Override // l.InterfaceC20758
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 getFileName() {
        if (this.c.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        AbstractC7145 abstractC7145 = this.a;
        List list = this.c;
        return new C15610(abstractC7145, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // l.InterfaceC20758
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C15610 getName(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C15610(this.a, (String) this.c.get(i), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C15610 getParent() {
        int size = this.c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d) {
            sb.append("/");
        }
        sb.append(AbstractC22791.A(this.c.subList(0, size - 1)));
        return new C15610(this.a, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 subpath(int i, int i2) {
        return new C15610(this.a, AbstractC22791.A(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    public final boolean startsWith(String str) {
        return startsWith(new C15610(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC20758
    public final boolean startsWith(InterfaceC20758 interfaceC20758) {
        int size;
        C11003.requireNonNull(interfaceC20758);
        if (!(interfaceC20758 instanceof C15610)) {
            return false;
        }
        C15610 c15610 = (C15610) interfaceC20758;
        if (this.d != c15610.d || this.c.size() < (size = c15610.c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(c15610.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC20758
    public final boolean endsWith(String str) {
        return endsWith(new C15610(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC20758
    public final boolean endsWith(InterfaceC20758 interfaceC20758) {
        C11003.requireNonNull(interfaceC20758);
        if (!(interfaceC20758 instanceof C15610)) {
            return false;
        }
        C15610 c15610 = (C15610) interfaceC20758;
        if (!c15610.d) {
            int size = c15610.c.size();
            if (this.c.size() < size) {
                return false;
            }
            int size2 = this.c.size();
            for (int i = size - 1; i >= 0; i--) {
                if (!getName((i - size) + size2).equals(c15610.getName(i))) {
                    return false;
                }
            }
            return true;
        }
        return equals(interfaceC20758);
    }

    @Override // l.InterfaceC20758
    public final boolean equals(Object obj) {
        return (obj instanceof C15610) && compareTo((InterfaceC20758) obj) == 0;
    }

    @Override // l.InterfaceC20758
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC20758 interfaceC20758) {
        return this.b.compareTo(((C15610) interfaceC20758).b);
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC7145 abstractC7145 = this.a;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC22791.A(arrayDeque));
        return new C15610(abstractC7145, sb.toString(), this.e, this.f);
    }

    @Override // l.InterfaceC20758
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C15610 resolve(InterfaceC20758 interfaceC20758) {
        if (interfaceC20758 instanceof C15610) {
            if (((C15610) interfaceC20758).d) {
                return (C15610) interfaceC20758;
            }
            return new C15610(this.a, this.b + "/" + interfaceC20758, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC20758, interfaceC20758.getFileSystem()));
    }

    @Override // l.InterfaceC20758
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C15610 resolveSibling(InterfaceC20758 interfaceC20758) {
        if (!(C11003.requireNonNull(interfaceC20758) instanceof C15610)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC20758, interfaceC20758.getFileSystem()));
        }
        C15610 parent = getParent();
        return parent == null ? (C15610) interfaceC20758 : parent.resolve(interfaceC20758);
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 resolveSibling(String str) {
        return resolveSibling(new C15610(this.a, str, this.e, this.f));
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 relativize(InterfaceC20758 interfaceC20758) {
        int i = 0;
        if (interfaceC20758 instanceof C15610) {
            if (this.d != ((C15610) interfaceC20758).d) {
                throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
            }
            List list = ((C15610) interfaceC20758).c;
            int size = this.c.size();
            int size2 = list.size();
            while (i < size && i < size2 && ((String) this.c.get(i)).equals(list.get(i))) {
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
            return new C15610(this.a, false, arrayList, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", interfaceC20758, interfaceC20758.getFileSystem()));
    }

    @Override // l.InterfaceC20758
    public final File toFile() {
        return new File(this.b);
    }

    @Override // l.InterfaceC20758
    public final URI toUri() {
        char[] cArr = AbstractC2206.c;
        C15610 absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(AbstractC3617.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = AbstractC2206.a;
            long j2 = AbstractC2206.b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = AbstractC2206.c;
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

    @Override // l.InterfaceC20758
    public final String toString() {
        return this.b;
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr, InterfaceC19347... interfaceC19347Arr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // l.InterfaceC20758
    public final InterfaceC20758 resolve(String str) {
        return resolve(getFileSystem().getPath(str, new String[0]));
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641... interfaceC18641Arr) {
        register(interfaceC5235, interfaceC18641Arr, new InterfaceC19347[0]);
        throw null;
    }

    @Override // l.InterfaceC20758, java.lang.Iterable
    public final Iterator iterator() {
        return new C23267(this);
    }
}
