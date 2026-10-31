package l;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20758 extends Comparable, Iterable, InterfaceC4923 {
    int compareTo(InterfaceC20758 interfaceC20758);

    boolean endsWith(String str);

    boolean endsWith(InterfaceC20758 interfaceC20758);

    boolean equals(Object obj);

    InterfaceC20758 getFileName();

    AbstractC7145 getFileSystem();

    InterfaceC20758 getName(int i);

    int getNameCount();

    InterfaceC20758 getParent();

    InterfaceC20758 getRoot();

    int hashCode();

    boolean isAbsolute();

    Iterator iterator();

    InterfaceC20758 normalize();

    InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641... interfaceC18641Arr);

    InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr, InterfaceC19347... interfaceC19347Arr);

    InterfaceC20758 relativize(InterfaceC20758 interfaceC20758);

    InterfaceC20758 resolve(String str);

    InterfaceC20758 resolve(InterfaceC20758 interfaceC20758);

    InterfaceC20758 resolveSibling(String str);

    InterfaceC20758 resolveSibling(InterfaceC20758 interfaceC20758);

    boolean startsWith(String str);

    boolean startsWith(InterfaceC20758 interfaceC20758);

    InterfaceC20758 subpath(int i, int i2);

    InterfaceC20758 toAbsolutePath();

    File toFile();

    InterfaceC20758 toRealPath(EnumC14406... enumC14406Arr);

    String toString();

    URI toUri();
}
