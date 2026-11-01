package p067l;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22097 extends Comparable, Iterable, InterfaceC7048 {
    int compareTo(InterfaceC22097 interfaceC22097);

    boolean endsWith(String str);

    boolean endsWith(InterfaceC22097 interfaceC22097);

    boolean equals(Object obj);

    InterfaceC22097 getFileName();

    AbstractC9159 getFileSystem();

    InterfaceC22097 getName(int i);

    int getNameCount();

    InterfaceC22097 getParent();

    InterfaceC22097 getRoot();

    int hashCode();

    boolean isAbsolute();

    Iterator iterator();

    InterfaceC22097 normalize();

    InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085... interfaceC20085Arr);

    InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr, InterfaceC20756... interfaceC20756Arr);

    InterfaceC22097 relativize(InterfaceC22097 interfaceC22097);

    InterfaceC22097 resolve(String str);

    InterfaceC22097 resolve(InterfaceC22097 interfaceC22097);

    InterfaceC22097 resolveSibling(String str);

    InterfaceC22097 resolveSibling(InterfaceC22097 interfaceC22097);

    boolean startsWith(String str);

    boolean startsWith(InterfaceC22097 interfaceC22097);

    InterfaceC22097 subpath(int i, int i2);

    InterfaceC22097 toAbsolutePath();

    File toFile();

    InterfaceC22097 toRealPath(EnumC16060... enumC16060Arr);

    String toString();

    URI toUri();
}
