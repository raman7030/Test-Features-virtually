.class public final Ll/ܽ֡;
.super Ll/ۧ֡;
.source "K9MM"


# direct methods
.method public static ۧ()Ll/ܽ֡;
    .locals 1

    .line 45
    new-instance v0, Ll/ܽ֡;

    .line 63
    invoke-direct {v0}, Ll/ۧ֡;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Z
    .locals 2

    .line 686
    sget-object v0, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ll/۫᩵;->֫(Ll/ۧ֡;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 687
    invoke-static {p0}, Ll/ۧ֡;->֫(Ll/ۧ֡;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
