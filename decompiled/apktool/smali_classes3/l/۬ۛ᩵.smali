.class public final Ll/۬ۛ᩵;
.super Ljava/lang/Object;
.source "BAYE"


# static fields
.field public static final ֫:Ll/ܶۛ᩵;

.field public static final ۧ:Ll/᩵᩹᩵;

.field public static final ܽ:Ll/᩵᩹᩵;

.field public static final ᩳ:Ll/᩵᩹᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 11
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۬ۛ᩵;->֫:Ll/ܶۛ᩵;

    return-void
.end method

.method public static final ֫(Ll/ܳ᩸᩵;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll/᩶ۛ᩵;->᩹:Ll/᩶ۛ᩵;

    invoke-interface {p0, v0, v1}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final ֫(Ll/ܳ᩸᩵;Ljava/lang/Object;)V
    .locals 2

    .line 85
    sget-object v0, Ll/۬ۛ᩵;->֫:Ll/ܶۛ᩵;

    if-ne p1, v0, :cond_0

    return-void

    .line 86
    :cond_0
    instance-of v0, p1, Ll/ۛۛ᩵;

    if-eqz v0, :cond_1

    .line 88
    check-cast p1, Ll/ۛۛ᩵;

    invoke-virtual {p1, p0}, Ll/ۛۛ᩵;->֫(Ll/ܳ᩸᩵;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 93
    sget-object v1, Ll/ۙۛ᩵;->᩹:Ll/ۙۛ᩵;

    invoke-interface {p0, v0, v1}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, Ll/ܺ۫᩵;

    .line 94
    invoke-interface {p0, p1}, Ll/ܺ۫᩵;->ۧ(Ljava/lang/Object;)V

    return-void

    .line 93
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۧ(Ll/ܳ᩸᩵;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    .line 65
    invoke-static {p0}, Ll/۬ۛ᩵;->֫(Ll/ܳ᩸᩵;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Ll/۬ۛ᩵;->֫:Ll/ܶۛ᩵;

    return-object p0

    .line 70
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 72
    new-instance v0, Ll/ۛۛ᩵;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Ll/ۛۛ᩵;-><init>(Ll/ܳ᩸᩵;I)V

    sget-object p1, Ll/ۗۛ᩵;->᩹:Ll/ۗۛ᩵;

    invoke-interface {p0, v0, p1}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 77
    :cond_2
    check-cast p1, Ll/ܺ۫᩵;

    .line 78
    invoke-interface {p1, p0}, Ll/ܺ۫᩵;->ۧ(Ll/ܳ᩸᩵;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
