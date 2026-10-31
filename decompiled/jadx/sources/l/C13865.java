package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public class C13865 extends ComponentCallbacksC9205 implements InterfaceC15287, InterfaceC8233 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3764 f41339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13132 f41340;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f41341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10339 f41342;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19452 f41343;

    public C13865() {
        super(R.layout.MT_Protector);
        this.f41341 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41339 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        C10339 c10339 = new C10339(this);
        this.f41342 = c10339;
        c10339.m33259((InterfaceC15287) this);
        this.f41342.m33258((InterfaceC8233) this);
        this.f41339.m11411().m1668(this, new C14281(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹ܰ᩷] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.᩶ܰ᩷] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33225(final C13865 c13865, C19452 c19452) {
        c13865.f41343 = c19452;
        c19452.m44826(c13865, (C22333) new InterfaceC1008() { // from class: l.᩹ܰ᩷
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C13865.m33222(this.f72386, (List) obj);
            }
        });
        c19452.m44825(c13865, (C20217) new InterfaceC1008() { // from class: l.᩶ܰ᩷
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C13865.m33223(this.f65407, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33222(C13865 c13865, List list) {
        c13865.f41341 = list;
        c13865.f41342.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33223(C13865 c13865, Set set) {
        HashSet hashSetM33273 = c13865.f41342.m33273();
        c13865.f41342.m33252(1, set);
        c13865.f41342.m33255(hashSetM33273);
        c13865.f41342.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector);
        this.f41340 = c13132;
        c13132.setTag("RecyclerView1");
        this.f41340.setAdapter(this.f41342);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f41340.setAdapter(null);
        this.f41340 = null;
    }

    @Override // l.InterfaceC15287
    /* JADX INFO: renamed from: ۧ */
    public final void mo16606(C16971 c16971) {
        String strM39805 = c16971.m39805();
        C4925.m14316(new RunnableC15602(4, this, strM39805), 500L);
        ((ActivityC17169) requireActivity()).m40354(strM39805, (C19287) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33221(C13865 c13865, String str) {
        C19452 c19452 = c13865.f41343;
        if (c19452 != null) {
            c19452.m44818(str);
        }
    }

    @Override // l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16605(final C16971 c16971) {
        if (!c16971.m39807()) {
            return false;
        }
        C21282 c21282 = new C21282(requireContext(), c16971.m39802(), 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۙܰ᩷
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C13865.m33224(this.f14915, c16971, menuItem);
                return true;
            }
        });
        this.f41340.suppressLayout(true);
        c21282.m48301(new C1909(this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33224(C13865 c13865, C16971 c16971, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c13865.f41339.m11405(c16971.m39805());
            return;
        }
        ActivityC17169 activityC17169 = (ActivityC17169) c13865.requireActivity();
        try {
            String strM44850 = c13865.f41343.m44850(c16971.m39805());
            String strM40368 = activityC17169.m40368(c16971.m39805());
            C2079 c2079M6839 = C2079.m6839();
            c2079M6839.m6842(R.string.MT_Protector, strM44850);
            c2079M6839.m6846(R.string.MT_Protector, strM40368);
            c2079M6839.m6849(".xml");
            c2079M6839.m6840();
            c2079M6839.m6847(c16971.m39805());
            c2079M6839.m6841(R.string.MT_Protector);
            c2079M6839.m6848(c16971.m39801());
            c2079M6839.m6843(C9523.m24404(c16971.m39805()) + ".xml");
            c2079M6839.m6845(activityC17169);
        } catch (IOException e) {
            activityC17169.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
