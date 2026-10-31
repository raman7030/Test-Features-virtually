package l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9US */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18309 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f56918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56920;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56921;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f56922 = C20195.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f56917 = C20195.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f56919 = C20195.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f56916 = C20195.synchronizedList(new LinkedList());

    public AbstractC18309(int i, int i2, boolean z) {
        this.f56921 = i;
        this.f56920 = i2;
        this.f56918 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m42660() {
        if (this.f56918) {
            return 0;
        }
        return this.f56920;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42655(int i) {
        this.f56920 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42658() {
        return this.f56921;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42649(int i) {
        this.f56921 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42661() {
        return this.f56918;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m42651() {
        return this.f56916.size() + (this.f56919.size() + (this.f56917.size() + this.f56922.size())) == 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m42656() {
        return this.f56922;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m42648() {
        List list = this.f56917;
        int size = list.size();
        List list2 = this.f56919;
        int size2 = list2.size() + size;
        List list3 = this.f56916;
        ArrayList arrayList = new ArrayList(list3.size() + size2);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m42654() {
        return this.f56917;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m42650() {
        return (this.f56921 & 15) == 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m42659() {
        return (this.f56921 & 30720) >> 11;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m42657() {
        return (this.f56921 & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m42662() {
        return (this.f56921 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m42653() {
        return (this.f56921 & 32768) == 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m42652() {
        return (this.f56921 & 32768) == 32768;
    }
}
