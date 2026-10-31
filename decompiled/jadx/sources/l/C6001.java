package l;

import android.view.MenuItem;
import bin.mt.function.ar.ActivityRecordService;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ۛۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6001 implements InterfaceC23223, InterfaceC14930, InterfaceC15564, InterfaceC20106, InterfaceC7875, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18441;

    public /* synthetic */ C6001(int i, Object obj) {
        this.f18440 = i;
        this.f18441 = obj;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f18440) {
            case 2:
                ActivityRecordService.m41((ActivityRecordService) this.f18441, menuItem);
                break;
            default:
                C18841.m43528((C18841) this.f18441, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        switch (this.f18440) {
            case 5:
                ViewOnClickListenerC21628.m48870((ViewOnClickListenerC21628) this.f18441, (Integer) obj);
                break;
            default:
                ((C14772) this.f18441).m35126((C11825) obj, false);
                break;
        }
    }

    @Override // l.InterfaceC7875
    /* JADX INFO: renamed from: ֫ */
    public void mo6265(C21282 c21282) {
        ViewOnClickListenerC7528.m20206((ViewOnClickListenerC7528) this.f18441);
    }

    @Override // l.InterfaceC15564
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10274(String str) {
        return ((String) this.f18441).equals(str);
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        Constructor constructor = (Constructor) this.f18441;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            int i = C13438.f40152;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C13438.m32464(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C13438.m32464(constructor) + "' with no args", e3.getCause());
        }
    }
}
