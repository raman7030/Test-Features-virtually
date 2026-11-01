package p067l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۡۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10589 implements BiConsumer {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ RunnableC24670 f29322;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C19977 f29323;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7179 f29324;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f29325;

    public /* synthetic */ C10589(C7179 c7179, String str, C19977 c19977, RunnableC24670 runnableC24670) {
        this.f29324 = c7179;
        this.f29325 = str;
        this.f29323 = c19977;
        this.f29322 = runnableC24670;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C15952 c15952 = (C15952) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f29325;
        if (zBooleanValue) {
            C7179 c7179 = this.f29324;
            c7179.m16508(str);
            c7179.m16517();
        }
        this.f29323.m45325(str, c15952, bool.booleanValue());
        this.f29322.run();
    }
}
