package l;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.֨ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1022 extends List, Comparable, InterfaceC1043 {
    void add(int i, int i2);

    @Override // l.InterfaceC1043
    boolean add(int i);

    @Override // java.util.List
    @Deprecated
    Integer get(int i);

    int getInt(int i);

    int indexOf(int i);

    @Override // java.util.List
    @Deprecated
    int indexOf(Object obj);

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, l.InterfaceC1043, l.InterfaceC14427
    InterfaceC15132 iterator();

    int lastIndexOf(int i);

    @Override // java.util.List
    @Deprecated
    int lastIndexOf(Object obj);

    @Override // java.util.List
    InterfaceC15132 listIterator();

    @Override // java.util.List
    InterfaceC15132 listIterator(int i);

    @Override // java.util.List
    @Deprecated
    Integer remove(int i);

    int set(int i, int i2);

    @Override // java.util.List
    InterfaceC1022 subList(int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo3537(int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo3538(int i, int i2, int i3, int[] iArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo3539(int i, int i2, int[] iArr);

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo3540(int i, Integer num);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo3541(IntUnaryOperator intUnaryOperator);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    int mo3542(int i);

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    Integer mo3543(int i, Integer num);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    void mo3544(int i, int i2, int[] iArr);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    void mo3545(InterfaceC4571 interfaceC4571);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    void mo3546(int[] iArr);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    void mo3547(InterfaceC4571 interfaceC4571);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    void mo3548(int[] iArr);
}
