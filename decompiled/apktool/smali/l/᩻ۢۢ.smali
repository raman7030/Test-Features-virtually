.class public final synthetic Ll/᩻ۢۢ;
.super Ljava/lang/Object;
.source "K1PX"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ll/ᩳۢۢ;

    .line 4
    check-cast p2, Ll/ᩳۢۢ;

    .line 427
    iget-object p2, p2, Ll/ᩳۢۢ;->ܿ:Landroid/content/pm/PackageInfo;

    iget-wide v0, p2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-object p1, p1, Ll/ᩳۢۢ;->ܿ:Landroid/content/pm/PackageInfo;

    iget-wide p1, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    div-long/2addr p1, v2

    sub-long/2addr v0, p1

    long-to-int p1, v0

    return p1
.end method
