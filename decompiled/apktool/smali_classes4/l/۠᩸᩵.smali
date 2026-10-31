.class public abstract Ll/۠᩸᩵;
.super Ll/ۖ᩸᩵;
.source "CANR"


# direct methods
.method public constructor <init>(Ll/ۨܶ᩵;)V
    .locals 1

    .line 80
    invoke-direct {p0, p1}, Ll/ۖ᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    if-eqz p1, :cond_1

    .line 87
    invoke-interface {p1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object p1

    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final getContext()Ll/ܳ᩸᩵;
    .locals 1

    .line 94
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    return-object v0
.end method
