package p067l;

import android.view.MenuItem;
import bin.p000mt.function.p001ar.ActivityRecordService;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ۛۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8072 implements InterfaceC24440, InterfaceC1583, InterfaceC17161, InterfaceC21477, InterfaceC1233, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21291;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f21292;

    public /* synthetic */ C8072(int i, Object obj) {
        this.f21291 = i;
        this.f21292 = obj;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f21291) {
            case 2:
                ActivityRecordService.m41((ActivityRecordService) this.f21292, menuItem);
                break;
            default:
                C20275.m45794((C20275) this.f21292, menuItem);
                break;
        }
        return true;
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        switch (this.f21291) {
            case 5:
                ViewOnClickListenerC22924.m51218((ViewOnClickListenerC22924) this.f21292, (Integer) obj);
                break;
            default:
                ((C16408) this.f21292).m37273((C13607) obj, false);
                break;
        }
    }

    @Override // p067l.InterfaceC1233
    /* JADX INFO: renamed from: ֫ */
    public void mo8467(C1898 c1898) {
        ViewOnClickListenerC9523.m22182((ViewOnClickListenerC9523) this.f21292);
    }

    @Override // p067l.InterfaceC17161
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12311(String str) {
        return ((String) this.f21292).equals(str);
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        Constructor constructor = (Constructor) this.f21292;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            int i = C15140.f43223;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C15140.m34566(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C15140.m34566(constructor) + "' with no args", e3.getCause());
        }
    }
}
