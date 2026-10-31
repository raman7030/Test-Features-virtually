package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۡۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8650 implements BiConsumer {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC23466 f26404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18528 f26405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5062 f26406;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26407;

    public /* synthetic */ C8650(C5062 c5062, String str, C18528 c18528, RunnableC23466 runnableC23466) {
        this.f26406 = c5062;
        this.f26407 = str;
        this.f26405 = c18528;
        this.f26404 = runnableC23466;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C17873.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C14293 c14293 = (C14293) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f26407;
        if (zBooleanValue) {
            C5062 c5062 = this.f26406;
            c5062.m14601(str);
            c5062.m14610();
        }
        this.f26405.m43047(str, c14293, bool.booleanValue());
        this.f26404.run();
    }
}
