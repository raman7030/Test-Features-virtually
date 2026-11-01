package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20434 implements InterfaceC21775 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC16192 f63127;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f63130;

    /* JADX INFO: renamed from: ᩹ */
    public int f63131;

    /* JADX INFO: renamed from: ۬ */
    public static final int[] f63126 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: ۫ */
    public static final C6352 f63125 = new C6352(new C7775());

    /* JADX INFO: renamed from: ۤ */
    public static final C6352 f63124 = new C6352(new C17588(6));

    /* JADX INFO: renamed from: ᩶ */
    public C11915 f63129 = new C11915();

    /* JADX INFO: renamed from: ۙ */
    public boolean f63128 = true;

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InterfaceC3669[] mo20001(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f63126;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int iM48060 = C21274.m48060((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (iM48060 != -1) {
            m46116(arrayList, iM48060);
        }
        int iM48059 = C21274.m48059(uri);
        if (iM48059 != -1 && iM48059 != iM48060) {
            m46116(arrayList, iM48059);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iM48060 && i2 != iM48059) {
                m46116(arrayList, i2);
            }
        }
        return (InterfaceC3669[]) arrayList.toArray(new InterfaceC3669[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m46117() {
        this.f63130 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m46118() {
        this.f63131 = 1;
    }

    @Override // p067l.InterfaceC21775
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo20000(boolean z) {
        synchronized (this) {
            this.f63128 = z;
        }
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo19999(C11915 c11915) {
        synchronized (this) {
            this.f63129 = c11915;
        }
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo19998() {
        synchronized (this) {
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46116(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new C17849());
                break;
            case 1:
                arrayList.add(new C18520());
                break;
            case 2:
                arrayList.add(new C24555(this.f63130 ? 2 : 0));
                break;
            case 3:
                arrayList.add(new C23471(this.f63130 ? 2 : 0));
                break;
            case 4:
                InterfaceC3669 interfaceC3669M14516 = f63125.m14516(0);
                if (interfaceC3669M14516 != null) {
                    arrayList.add(interfaceC3669M14516);
                } else {
                    arrayList.add(new C19428());
                }
                break;
            case 5:
                arrayList.add(new C16074());
                break;
            case 6:
                arrayList.add(new C15598(this.f63129, this.f63128 ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C18580(this.f63130 ? 2 : 0));
                break;
            case 8:
                arrayList.add(new C14557(this.f63129, this.f63128 ? 0 : 32, null, AbstractC16192.m36872of()));
                arrayList.add(new C15227(this.f63129, this.f63128 ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C5879());
                break;
            case 10:
                arrayList.add(new C17988());
                break;
            case 11:
                if (this.f63127 == null) {
                    this.f63127 = AbstractC16192.m36872of();
                }
                arrayList.add(new C17317(1, !this.f63128 ? 1 : 0, this.f63129, new C11157(0L), new C21874(0, this.f63127)));
                break;
            case 12:
                arrayList.add(new C23353());
                break;
            case 14:
                arrayList.add(new C17415(this.f63131));
                break;
            case 15:
                InterfaceC3669 interfaceC3669M14517 = f63124.m14516(new Object[0]);
                if (interfaceC3669M14517 != null) {
                    arrayList.add(interfaceC3669M14517);
                }
                break;
            case 16:
                arrayList.add(new C14753(1 ^ (this.f63128 ? 1 : 0), this.f63129));
                break;
            case 17:
                arrayList.add(new C21303());
                break;
            case 18:
                arrayList.add(new C13965());
                break;
            case 19:
                arrayList.add(new C4005());
                break;
            case 20:
                arrayList.add(new C10711());
                break;
            case 21:
                arrayList.add(new C9389());
                break;
        }
    }
}
