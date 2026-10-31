.class public final Ll/ܳ᩶ۢ;
.super Ljava/lang/Object;
.source "2C5X"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2

    .line 27
    invoke-virtual {p2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, ":"

    .line 0
    invoke-static {p1, v1, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    :cond_0
    invoke-virtual {p2, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
