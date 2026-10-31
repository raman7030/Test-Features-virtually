package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81CV */
/* JADX INFO: loaded from: classes5.dex */
public class C17417 implements InterfaceC11068 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC8245 f53266;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53272;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC8245 f53267 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53265 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f53270 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EnumC18123 f53268 = EnumC18123.UNKNOWN;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53273 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14594 f53274 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f53276 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f53269 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f53275 = new ArrayList();

    public C17417(AbstractC8245 abstractC8245) {
        this.f53266 = abstractC8245;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53266.f25376.m35751());
        sb.append(":");
        sb.append(this.f53268);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f53276 ? Integer.valueOf(this.f53271) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f53275.size());
        sb.append(":d=");
        sb.append(this.f53269.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34849(int i) {
        if (this.f53276) {
            return;
        }
        this.f53276 = true;
        this.f53271 = i;
        for (InterfaceC11068 interfaceC11068 : this.f53269) {
            interfaceC11068.mo6241(interfaceC11068);
        }
    }

    @Override // l.InterfaceC11068
    /* JADX INFO: renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        ArrayList<C17417> arrayList = this.f53275;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C17417) it.next()).f53276) {
                return;
            }
        }
        this.f53270 = true;
        AbstractC8245 abstractC8245 = this.f53267;
        if (abstractC8245 != null) {
            abstractC8245.mo6241(this);
        }
        if (this.f53265) {
            this.f53266.mo6241(this);
            return;
        }
        C17417 c17417 = null;
        int i = 0;
        for (C17417 c17418 : arrayList) {
            if (!(c17418 instanceof C14594)) {
                i++;
                c17417 = c17418;
            }
        }
        if (c17417 != null && i == 1 && c17417.f53276) {
            C14594 c14594 = this.f53274;
            if (c14594 != null) {
                if (!c14594.f53276) {
                    return;
                } else {
                    this.f53272 = this.f53273 * c14594.f53271;
                }
            }
            mo34849(c17417.f53271 + this.f53272);
        }
        AbstractC8245 abstractC8246 = this.f53267;
        if (abstractC8246 != null) {
            abstractC8246.mo6241(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40763(AbstractC8245 abstractC8245) {
        this.f53269.add(abstractC8245);
        if (this.f53276) {
            abstractC8245.mo6241(abstractC8245);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40762() {
        this.f53275.clear();
        this.f53269.clear();
        this.f53276 = false;
        this.f53271 = 0;
        this.f53270 = false;
        this.f53265 = false;
    }
}
