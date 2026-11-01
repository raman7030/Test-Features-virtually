package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public class C15546 extends ComponentCallbacksC11117 implements InterfaceC16897, InterfaceC10193 {

    /* JADX INFO: renamed from: ۗ */
    public C5946 f44420;

    /* JADX INFO: renamed from: ۙ */
    public C14849 f44421;

    /* JADX INFO: renamed from: ᩶ */
    public List f44422;

    /* JADX INFO: renamed from: ᩸ */
    public C12195 f44423;

    /* JADX INFO: renamed from: ᩹ */
    public C20856 f44424;

    public C15546() {
        super(R.layout.MT_Protector);
        this.f44422 = Collections.EMPTY_LIST;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44420 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        C12195 c12195 = new C12195(this);
        this.f44423 = c12195;
        c12195.m35378((InterfaceC16897) this);
        this.f44423.m35377((InterfaceC10193) this);
        this.f44420.m13347().m4066(this, new C15941(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹ܰ᩷] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.᩶ܰ᩷] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35344(final C15546 c15546, C20856 c20856) {
        c15546.f44424 = c20856;
        c20856.m47122(c15546, (C23594) new InterfaceC3326() { // from class: l.᩹ܰ᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C15546.m35341(this.f75112, (List) obj);
            }
        });
        c20856.m47121(c15546, (C21583) new InterfaceC3326() { // from class: l.᩶ܰ᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C15546.m35342(this.f68055, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35341(C15546 c15546, List list) {
        c15546.f44422 = list;
        c15546.f44423.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35342(C15546 c15546, Set set) {
        HashSet hashSetM35392 = c15546.f44423.m35392();
        c15546.f44423.m35371(1, set);
        c15546.f44423.m35374(hashSetM35392);
        c15546.f44423.notifyDataSetChanged();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f44421 = c14849;
        c14849.setTag("RecyclerView1");
        this.f44421.setAdapter(this.f44423);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f44421.setAdapter(null);
        this.f44421 = null;
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        String strM42048 = c18498.m42048();
        C7050.m16213(new RunnableC17196(4, this, strM42048), 500L);
        ((ActivityC18686) requireActivity()).m42599(strM42048, (C20699) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35340(C15546 c15546, String str) {
        C20856 c20856 = c15546.f44424;
        if (c20856 != null) {
            c20856.m47114(str);
        }
    }

    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(final C18498 c18498) {
        if (!c18498.m42050()) {
            return false;
        }
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۙܰ᩷
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15546.m35343(this.f17745, c18498, menuItem);
                return true;
            }
        });
        this.f44421.suppressLayout(true);
        c1898.m50635(new C4183(this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35343(C15546 c15546, C18498 c18498, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c15546.f44420.m13341(c18498.m42048());
            return;
        }
        ActivityC18686 activityC18686 = (ActivityC18686) c15546.requireActivity();
        try {
            String strM47146 = c15546.f44424.m47146(c18498.m42048());
            String strM42613 = activityC18686.m42613(c18498.m42048());
            C4345 c4345M8965 = C4345.m8965();
            c4345M8965.m8968(R.string.MT_Protector, strM47146);
            c4345M8965.m8972(R.string.MT_Protector, strM42613);
            c4345M8965.m8975(".xml");
            c4345M8965.m8966();
            c4345M8965.m8973(c18498.m42048());
            c4345M8965.m8967(R.string.MT_Protector);
            c4345M8965.m8974(c18498.m42044());
            c4345M8965.m8969(C11419.m26414(c18498.m42048()) + ".xml");
            c4345M8965.m8971(activityC18686);
        } catch (IOException e) {
            activityC18686.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
