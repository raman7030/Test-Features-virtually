.class public final Ll/֡ܶܺ;
.super Ljava/lang/Object;
.source "35QW"


# direct methods
.method public static ֫(Ll/ᩴܶܺ;Ll/ᩴܶܺ;)Ll/ᩴܶܺ;
    .locals 3

    .line 136
    new-instance v0, Ll/᩵ܶܺ;

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x2

    new-array v1, v1, [Ll/ᩴܶܺ;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    .line 796
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 136
    invoke-direct {v0, p0}, Ll/᩵ܶܺ;-><init>(Ljava/util/List;)V

    return-object v0
.end method
