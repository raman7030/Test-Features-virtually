.class public final synthetic Ll/ᩴۙ֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ܿ֡֨;

    .line 1889
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x1000000000000000L

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
