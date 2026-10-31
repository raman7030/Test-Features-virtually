.class public final synthetic Ll/ܳۧ֨;
.super Ljava/lang/Object;
.source "FBFP"

# interfaces
.implements Ljava/util/function/IntFunction;


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    .line 699
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "#%d"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
