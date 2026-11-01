package p067l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ᩳ */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1815 {

    /* JADX INFO: renamed from: ᩻ */
    public final HashMap f65966 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f65963 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f65961 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f65965 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final transient HashMap f65960 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f65964 = new HashMap();

    /* JADX INFO: renamed from: ܳ */
    public final Bundle f65962 = new Bundle();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo30590(int i, AbstractC1920 abstractC1920, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1325 m47353(String str, InterfaceC24784 interfaceC24784, AbstractC1920 abstractC1920, InterfaceC1885 interfaceC1885) {
        AbstractC9381 lifecycle = interfaceC24784.getLifecycle();
        if (lifecycle.mo21805().m35142(EnumC15415.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC24784 + " is attempting to register while current state is " + lifecycle.mo21805() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m47351(str);
        HashMap map = this.f65961;
        C1780 c1780 = (C1780) map.get(str);
        if (c1780 == null) {
            c1780 = new C1780(lifecycle);
        }
        c1780.m45921(new C1290(this, str, interfaceC1885, abstractC1920));
        map.put(str, c1780);
        return new C1640(this, str, abstractC1920);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1325 m47352(String str, AbstractC1920 abstractC1920, InterfaceC1885 interfaceC1885) {
        m47351(str);
        this.f65960.put(str, new C1045(abstractC1920, interfaceC1885));
        HashMap map = this.f65964;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC1885.mo7780(obj);
        }
        Bundle bundle = this.f65962;
        C1185 c1185 = (C1185) bundle.getParcelable(str);
        if (c1185 != null) {
            bundle.remove(str);
            interfaceC1885.mo7780(abstractC1920.mo5144(c1185.m20658(), c1185.m20659()));
        }
        return new C0975(this, str, abstractC1920);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47356(String str) {
        Integer num;
        if (!this.f65965.contains(str) && (num = (Integer) this.f65963.remove(str)) != null) {
            this.f65966.remove(num);
        }
        this.f65960.remove(str);
        HashMap map = this.f65964;
        if (map.containsKey(str)) {
            C12826.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f65962;
        if (bundle.containsKey(str)) {
            C12826.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f65961;
        C1780 c1780 = (C1780) map2.get(str);
        if (c1780 != null) {
            c1780.m45920();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47358(Bundle bundle) {
        HashMap map = this.f65963;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f65965));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f65962.clone());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47355(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f65965 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f65962;
        bundle3.putAll(bundle2);
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            HashMap map = this.f65963;
            boolean zContainsKey = map.containsKey(str);
            HashMap map2 = this.f65966;
            if (zContainsKey) {
                Integer num = (Integer) map.remove(str);
                if (!bundle3.containsKey(str)) {
                    map2.remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i);
            num2.intValue();
            String str2 = stringArrayList.get(i);
            map2.put(num2, str2);
            map.put(str2, num2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47357(int i, int i2, Intent intent) {
        InterfaceC1885 interfaceC1885;
        String str = (String) this.f65966.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1045 c1045 = (C1045) this.f65960.get(str);
        if (c1045 != null && (interfaceC1885 = c1045.f15840) != null && this.f65965.contains(str)) {
            interfaceC1885.mo7780(c1045.f15841.mo5144(intent, i2));
            this.f65965.remove(str);
            return true;
        }
        this.f65964.remove(str);
        this.f65962.putParcelable(str, new C1185(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47354(int i, @SuppressLint({"UnknownNullness"}) Object obj) {
        InterfaceC1885 interfaceC1885;
        String str = (String) this.f65966.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        C1045 c1045 = (C1045) this.f65960.get(str);
        if (c1045 == null || (interfaceC1885 = c1045.f15840) == null) {
            this.f65962.remove(str);
            this.f65964.put(str, obj);
        } else if (this.f65965.remove(str)) {
            interfaceC1885.mo7780(obj);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m47351(String str) {
        HashMap map = this.f65963;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iMo25445 = AbstractC21092.f66271.mo25445();
        while (true) {
            int i = iMo25445 + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f65966;
            if (map2.containsKey(numValueOf)) {
                iMo25445 = AbstractC21092.f66271.mo25445();
            } else {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
        }
    }
}
