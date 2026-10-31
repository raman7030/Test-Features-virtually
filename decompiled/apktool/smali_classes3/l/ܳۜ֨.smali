.class public final Ll/ܳۜ֨;
.super Ljava/lang/Object;
.source "Q1RO"


# direct methods
.method public static ֫([Ll/۫᩻֨;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 10
    :goto_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    const-string v3, "Unsupported XZ filter chain"

    if-ge v1, v2, :cond_1

    .line 11
    aget-object v2, p0, v1

    invoke-interface {v2}, Ll/۫᩻֨;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_0
    new-instance p0, Ll/ۢۜ֨;

    .line 20
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 12
    throw p0

    .line 15
    :cond_1
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    aget-object v1, p0, v1

    invoke-interface {v1}, Ll/۫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    .line 20
    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_3

    .line 21
    aget-object v2, p0, v0

    invoke-interface {v2}, Ll/۫᩻֨;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x3

    if-gt v1, p0, :cond_4

    return-void

    .line 25
    :cond_4
    new-instance p0, Ll/ۢۜ֨;

    .line 20
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p0

    .line 16
    :cond_5
    new-instance p0, Ll/ۢۜ֨;

    .line 20
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 16
    throw p0
.end method
