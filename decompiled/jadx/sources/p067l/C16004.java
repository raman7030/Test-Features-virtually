package p067l;

import bin.p000mt.json.JSONObject;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16004 extends C13441 {

    /* JADX INFO: renamed from: ۠ */
    public static final /* synthetic */ int f46352 = 0;

    /* JADX INFO: renamed from: ܶ */
    public static final C12100 f46353 = C12100.m27951("2025-06-18", "2025-03-26");

    /* JADX INFO: renamed from: ֡ */
    public final int f46354;

    /* JADX INFO: renamed from: ֨ */
    public final C21180 f46355;

    /* JADX INFO: renamed from: ۚ */
    public final C7549 f46356;

    /* JADX INFO: renamed from: ֫ */
    public static C21180 m36376(C5947 c5947) {
        C16004 c16004 = ServiceC20700.f63917;
        if (c16004 == null) {
            return null;
        }
        return c16004.f46355;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21180 m36375(C4606 c4606) {
        C16004 c16004 = ServiceC20700.f63917;
        if (c16004 == null) {
            return null;
        }
        return c16004.f46355;
    }

    public C16004(int i) {
        C21180 c21180 = new C21180();
        C7549 c7549 = new C7549(new C19247(C23499.m52231(), C23499.m52232()));
        JSONObject jSONObjectM21913 = C9417.m21913("name", "MT MCP", "version", "0.2.0");
        ArrayList arrayList = new ArrayList(30);
        C14964 c14964 = new C14964();
        C18237 c18237 = new C18237(c21180);
        C18908 c18908 = new C18908(c21180);
        C4827 c4827 = new C4827(c21180);
        C7509 c7509 = new C7509(c21180);
        C24272 c24272 = new C24272(c21180);
        C20250 c20250 = new C20250(c21180);
        C24847 c24847 = new C24847(c21180);
        C16799 c16799 = new C16799(c21180);
        arrayList.add(new C19579(c21180));
        arrayList.add(c14964);
        arrayList.add(new C8179(c21180));
        arrayList.add(c18237);
        arrayList.add(c7509);
        arrayList.add(new C10862(c4827));
        arrayList.add(new C24943(c4827));
        arrayList.add(c18908);
        arrayList.add(c24272);
        arrayList.add(new C22262(c4827));
        arrayList.add(c20250);
        arrayList.add(new C24591(c21180));
        arrayList.add(c24847);
        arrayList.add(new C3133(c21180));
        arrayList.add(c16799);
        arrayList.add(new C7997(c21180));
        arrayList.add(new C19227(c21180));
        arrayList.add(new C8259(c21180, c18237, c18908, c4827, c7509, c24272, c20250, c14964, c24847, c16799));
        arrayList.add(new C15634(c21180));
        arrayList.add(new C12874(c21180));
        arrayList.add(new C13624(c21180));
        arrayList.add(new C4156(c21180));
        arrayList.add(new C21671(c21180));
        arrayList.add(new C16225(c21180));
        arrayList.add(new C23921(c21180));
        arrayList.add(new C19483(c21180));
        arrayList.add(new C24352(c21180));
        arrayList.add(new C14294(c21180));
        arrayList.add(new C12283(c21180));
        arrayList.add(new C11533(c21180));
        ArrayList arrayList2 = new ArrayList(arrayList);
        C19247 c19247 = new C19247(C23499.m52231(), C23499.m52232());
        C14553 c14553 = new C14553(c19247);
        C24983 c24983 = new C24983(c19247);
        C14729 c14729 = new C14729(c19247);
        C16740 c16740 = new C16740(c19247);
        C8695 c8695 = new C8695(c19247);
        C2659 c2659 = new C2659(c19247);
        ArrayList arrayList3 = new ArrayList(19);
        arrayList3.add(new C23310(new C6905(c19247)));
        arrayList3.add(new C22382(c24983));
        arrayList3.add(new C14334(c24983));
        arrayList3.add(new C3605(c19247));
        arrayList3.add(new C21041(c19247));
        arrayList3.add(new C25063(c14553));
        arrayList3.add(new C9640(c14553));
        arrayList3.add(new C4947(c14553));
        arrayList3.add(new C23980(c14553));
        arrayList3.add(new C10982(c14729));
        arrayList3.add(new C19699(c16740));
        arrayList3.add(new C9228(c8695));
        arrayList3.add(new C12994(c2659));
        arrayList3.add(new C15004(new C4867(c19247, c24983)));
        arrayList3.add(new C23722(c14553));
        arrayList3.add(new C24392(c14553));
        arrayList3.add(new C6546(c14553));
        arrayList3.add(new C13922(c14553));
        arrayList3.add(new C6958(c7549));
        arrayList2.addAll(arrayList3);
        arrayList2.add(new C16760(new C14079(c14553, c21180)));
        arrayList2.addAll(C24551.m54149(c19247, c14553));
        super(i, f46353, jSONObjectM21913, new C13993(arrayList2), new C18016(i), C7374.m17085());
        this.f46356 = c7549;
        this.f46354 = i;
        this.f46355 = c21180;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m36377() {
        return this.f46354;
    }

    @Override // p067l.AbstractC6843
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15677() {
        C21180 c21180 = this.f46355;
        C7549 c7549 = this.f46356;
        C21306.m48192("MT MCP server stop requested: port=" + this.f46354 + ", wasStarted=" + m15676() + ", alive=" + m15674() + ", listeningPort=" + m15671(), new Throwable("MT MCP server stop trace"));
        try {
            super.mo15677();
        } finally {
            c7549.close();
            try {
                c21180.m47847();
            } catch (Exception e) {
                C21306.m48192("MT MCP smali cache shutdown failed", e);
            }
        }
    }
}
