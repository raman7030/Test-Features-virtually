.class public final Ll/ᩴ۠᩵;
.super Ljava/lang/Object;
.source "LAXL"


# direct methods
.method public static final ֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;
    .locals 1

    const-string v0, "exception"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    new-instance v0, Ll/ۖ۠᩵;

    invoke-direct {v0, p0}, Ll/ۖ۠᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 132
    instance-of v0, p0, Ll/ۖ۠᩵;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Ll/ۖ۠᩵;

    iget-object p0, p0, Ll/ۖ۠᩵;->᩸:Ljava/lang/Throwable;

    throw p0
.end method
