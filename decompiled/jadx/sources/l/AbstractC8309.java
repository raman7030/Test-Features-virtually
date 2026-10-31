package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8309 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6322 f25506;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f25507;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f25508;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f25509;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f25510;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f25511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object mo21911(Object obj) {
        return obj;
    }

    public AbstractC8309(C6322 c6322, String str) {
        this.f25507 = 0;
        this.f25509 = false;
        this.f25511 = str;
        this.f25506 = c6322;
    }

    public AbstractC8309(C6322 c6322, String str, Object obj) {
        this(c6322, str);
        m21910(obj);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m21914() {
        this.f25507 = 0;
        this.f25509 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21910(Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList arrayList = this.f25510;
        if (arrayList != null) {
            arrayList.add(obj);
            return;
        }
        if (this.f25508 == null) {
            this.f25508 = obj;
            return;
        }
        ArrayList arrayList2 = new ArrayList(5);
        this.f25510 = arrayList2;
        arrayList2.add(this.f25508);
        this.f25508 = null;
        this.f25510.add(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m21912() {
        ArrayList arrayList;
        return (this.f25508 != null && this.f25507 < 1) || ((arrayList = this.f25510) != null && this.f25507 < arrayList.size());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m21909() {
        int size = this.f25508 != null ? 1 : 0;
        ArrayList arrayList = this.f25510;
        if (arrayList != null) {
            size = arrayList.size();
        }
        String str = this.f25511;
        if (size == 0) {
            throw new C1253(str);
        }
        int i = this.f25507;
        if (i >= size) {
            if (size == 1) {
                return mo21911(this.f25508);
            }
            throw new C5487(str);
        }
        Object obj = this.f25508;
        if (obj != null) {
            this.f25507 = i + 1;
            return mo21911(obj);
        }
        Object objMo21911 = mo21911(this.f25510.get(i));
        this.f25507++;
        return objMo21911;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m21913() {
        int size = this.f25508 != null ? 1 : 0;
        ArrayList arrayList = this.f25510;
        if (arrayList != null) {
            size = arrayList.size();
        }
        if (this.f25509 || (this.f25507 >= size && size == 1)) {
            return ((C15363) this).f25506.m17588(m21909(), (Object) null);
        }
        return m21909();
    }
}
