package p067l;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.֨ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3340 extends List, Comparable, InterfaceC3360 {
    void add(int i, int i2);

    @Override // p067l.InterfaceC3360
    boolean add(int i);

    @Override // java.util.List
    @Deprecated
    Integer get(int i);

    int getInt(int i);

    int indexOf(int i);

    @Override // java.util.List
    @Deprecated
    int indexOf(Object obj);

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3360, p067l.InterfaceC16080
    InterfaceC16750 iterator();

    int lastIndexOf(int i);

    @Override // java.util.List
    @Deprecated
    int lastIndexOf(Object obj);

    @Override // java.util.List
    InterfaceC16750 listIterator();

    @Override // java.util.List
    InterfaceC16750 listIterator(int i);

    @Override // java.util.List
    @Deprecated
    Integer remove(int i);

    int set(int i, int i2);

    @Override // java.util.List
    InterfaceC3340 subList(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    void mo5824(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    void mo5825(int i, int i2, int i3, int[] iArr);

    /* JADX INFO: renamed from: ֫ */
    void mo5826(int i, int i2, int[] iArr);

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    void mo5827(int i, Integer num);

    /* JADX INFO: renamed from: ֫ */
    void mo5828(IntUnaryOperator intUnaryOperator);

    /* JADX INFO: renamed from: ۘ */
    int mo5829(int i);

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    Integer mo5830(int i, Integer num);

    /* JADX INFO: renamed from: ۧ */
    void mo5831(int i, int i2, int[] iArr);

    /* JADX INFO: renamed from: ۧ */
    void mo5832(InterfaceC6713 interfaceC6713);

    /* JADX INFO: renamed from: ۧ */
    void mo5833(int[] iArr);

    /* JADX INFO: renamed from: ܽ */
    void mo5834(InterfaceC6713 interfaceC6713);

    /* JADX INFO: renamed from: ܽ */
    void mo5835(int[] iArr);
}
