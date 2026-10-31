.class public final Ll/֫ۧۧ;
.super Ljava/lang/Object;
.source "J8KG"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/۟֫ۧ;

.field public final ܽ:I

.field public final ܿ:Ll/᩸۠֫;

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Ll/᩸۠֫;ILl/۟֫ۧ;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lez p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 62
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 63
    iput-object p1, p0, Ll/֫ۧۧ;->ܿ:Ll/᩸۠֫;

    .line 64
    iput p2, p0, Ll/֫ۧۧ;->ܽ:I

    .line 65
    iput-object p3, p0, Ll/֫ۧۧ;->ۧ:Ll/۟֫ۧ;

    new-array p1, v0, [B

    .line 66
    iput-object p1, p0, Ll/֫ۧۧ;->ᩳ:[B

    .line 67
    iput p2, p0, Ll/֫ۧۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 110
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final read([BII)I
    .locals 7

    .line 83
    iget v0, p0, Ll/֫ۧۧ;->֫:I

    iget-object v1, p0, Ll/֫ۧۧ;->ܿ:Ll/᩸۠֫;

    const/4 v2, -0x1

    if-nez v0, :cond_6

    const/4 v0, 0x1

    .line 121
    iget-object v3, p0, Ll/֫ۧۧ;->ᩳ:[B

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4, v0}, Ll/ۢᩴ֫;->read([BII)I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_1

    .line 125
    :cond_0
    aget-byte v0, v3, v4

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_1

    goto :goto_3

    .line 132
    :cond_1
    new-array v3, v0, [B

    move v5, v0

    :goto_0
    if-lez v5, :cond_3

    .line 134
    invoke-interface {v1, v3, v4, v5}, Ll/ۢᩴ֫;->read([BII)I

    move-result v6

    if-ne v6, v2, :cond_2

    :goto_1
    return v2

    :cond_2
    add-int/2addr v4, v6

    sub-int/2addr v5, v6

    goto :goto_0

    :cond_3
    :goto_2
    if-lez v0, :cond_4

    add-int/lit8 v4, v0, -0x1

    .line 143
    aget-byte v4, v3, v4

    if-nez v4, :cond_4

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_4
    if-lez v0, :cond_5

    .line 148
    new-instance v4, Ll/ᩳ֨֫;

    invoke-direct {v4, v3, v0}, Ll/ᩳ֨֫;-><init>([BI)V

    iget-object v0, p0, Ll/֫ۧۧ;->ۧ:Ll/۟֫ۧ;

    check-cast v0, Ll/۟ۧۧ;

    invoke-virtual {v0, v4}, Ll/۟ۧۧ;->֫(Ll/ᩳ֨֫;)V

    .line 85
    :cond_5
    :goto_3
    iget v0, p0, Ll/֫ۧۧ;->ܽ:I

    iput v0, p0, Ll/֫ۧۧ;->֫:I

    .line 90
    :cond_6
    iget v0, p0, Ll/֫ۧۧ;->֫:I

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-interface {v1, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    if-eq p1, v2, :cond_7

    .line 92
    iget p2, p0, Ll/֫ۧۧ;->֫:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/֫ۧۧ;->֫:I

    :cond_7
    return p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 0

    .line 78
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/֫ۧۧ;->ܿ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    iget-object v0, p0, Ll/֫ۧۧ;->ܿ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/֫ۧۧ;->ܿ:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
