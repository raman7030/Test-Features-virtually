package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3639 implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ C3639(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C13180();
            case 1:
                return new ArrayList();
            case 2:
                return new C10359();
            case 3:
                return new HashSet();
            case 4:
                return new C11770();
            case 5:
                return new HashMap();
            case 6:
                return new StringBuilder();
            case 7:
                return new LinkedHashSet();
            case 8:
                return new double[4];
            case 9:
                return new double[3];
            case 10:
                return new C17208();
            case 11:
                return new C19326();
            case 12:
                return new C12974();
            case 13:
                return new C17750();
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }
}
