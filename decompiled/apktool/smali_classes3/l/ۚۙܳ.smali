.class public final synthetic Ll/ۚۙܳ;
.super Ljava/lang/Object;
.source "L73L"

# interfaces
.implements Ll/۠ۚ֫;


# direct methods
.method public static ֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 73
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt p0, v2, :cond_0

    return v0

    .line 77
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 78
    invoke-virtual {p2, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v4

    .line 113
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v5

    if-eq v4, v5, :cond_3

    .line 115
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v4

    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v5

    if-ne v4, v5, :cond_2

    goto :goto_1

    :cond_2
    return v0

    .line 82
    :cond_3
    :goto_1
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr p0, v2

    .line 83
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫()Ll/ܺۚۧ;
    .locals 7

    .line 370
    new-instance v6, Ll/ܺۚۧ;

    new-instance v4, Ll/ۢ֨֫;

    const-wide v0, 0x7fffffffffffffffL

    invoke-direct {v4, v0, v1}, Ll/ۢ֨֫;-><init>(J)V

    new-instance v5, Ll/᩷֡ۧ;

    const/16 v0, 0x18

    invoke-direct {v5, v0}, Ll/᩷֡ۧ;-><init>(I)V

    const/4 v1, 0x2

    const/4 v2, 0x1

    sget-object v3, Ll/ۜᩴۧ;->֫:Ll/ۜᩴۧ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ܺۚۧ;-><init>(IILl/ۜᩴۧ;Ll/ۢ֨֫;Ll/᩷֡ۧ;)V

    return-object v6
.end method
