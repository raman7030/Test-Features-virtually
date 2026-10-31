package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes.dex */
public final class C23396 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f75153;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f75154;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16560 f75155;

    public C23396(C16560 c16560, List list) {
        this.f75155 = c16560;
        this.f75153 = list;
        boolean z = false;
        this.f75154 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                break;
            }
        }
        this.f75152 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51844(RunnableC1000 runnableC1000) {
        List list = this.f75153;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C16560 c16560 = this.f75155;
        View viewM10216 = c16560.m39056().m10216(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        String strM40576 = C17283.m40576(this.f75154 ? System.currentTimeMillis() : ((InterfaceC17889) list.get(0)).getTime());
        C17752 c17752 = new C17752(this, c16560.m39056(), viewM10216, checkBox, checkBox2, runnableC1000);
        c17752.m31258(R.string.MT_Protector);
        c17752.m31250((CharSequence) strM40576);
        c17752.m31265(C17283.m40571());
        c17752.m31244();
        c17752.m31276(4);
        c17752.m31279(6);
        c17752.m31249(new C1524(true));
        c17752.m31266(true);
        c17752.m31282().setOnClickListener(new ViewOnClickListenerC16536(3, c17752));
    }
}
