.class public abstract Ll/ۚ᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 443
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 444
    iput p1, p0, Ll/ۚ᩸ۚ;->֫:I

    .line 445
    iput p2, p0, Ll/ۚ᩸ۚ;->ۧ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 464
    iget v3, p0, Ll/ۚ᩸ۚ;->ۧ:I

    iget v4, p0, Ll/ۚ᩸ۚ;->֫:I

    if-nez v4, :cond_0

    .line 465
    invoke-virtual {p0}, Ll/ۚ᩸ۚ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v1

    aput-object v3, v2, v0

    const-string v0, ":%s(%d)"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez v3, :cond_1

    .line 467
    invoke-virtual {p0}, Ll/ۚ᩸ۚ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v3, v2, v1

    aput-object v4, v2, v0

    const-string v0, ":%s(%dn)"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 468
    :cond_1
    invoke-virtual {p0}, Ll/ۚ᩸ۚ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v1

    aput-object v4, v6, v0

    aput-object v3, v6, v2

    const-string v0, ":%s(%dn%+d)"

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(Ll/᩶֡ۚ;)I
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    .line 453
    invoke-virtual {p2}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 454
    instance-of p1, p1, Ll/֨֡ۚ;

    if-eqz p1, :cond_0

    goto :goto_1

    .line 456
    :cond_0
    invoke-virtual {p0, p2}, Ll/ۚ᩸ۚ;->֫(Ll/᩶֡ۚ;)I

    move-result p1

    .line 457
    iget p2, p0, Ll/ۚ᩸ۚ;->ۧ:I

    iget v0, p0, Ll/ۚ᩸ۚ;->֫:I

    if-nez v0, :cond_1

    if-ne p1, p2, :cond_2

    goto :goto_0

    :cond_1
    sub-int/2addr p1, p2

    mul-int p2, p1, v0

    if-ltz p2, :cond_2

    .line 459
    rem-int/2addr p1, v0

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
