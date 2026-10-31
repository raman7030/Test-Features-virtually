.class public final Ll/ܿ֡ۧ;
.super Ljava/lang/Object;
.source "J8LX"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/ܳ֡ۧ;

.field public final ۧ:Ll/ᩳ֨֫;

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ll/ܳ֡ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "audio/ac4"

    .line 87
    invoke-direct {v0, v1, v2, v3}, Ll/ܳ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 67
    iput-object v0, p0, Ll/ܿ֡ۧ;->֫:Ll/ܳ֡ۧ;

    .line 68
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܿ֡ۧ;->ۧ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 5

    .line 140
    iget-object p2, p0, Ll/ܿ֡ۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/16 v1, 0x4000

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    .line 146
    :cond_0
    invoke-virtual {p2, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 147
    invoke-virtual {p2, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 149
    iget-boolean p1, p0, Ll/ܿ֡ۧ;->ܽ:Z

    iget-object v0, p0, Ll/ܿ֡ۧ;->֫:Ll/ܳ֡ۧ;

    if-nez p1, :cond_1

    const-wide/16 v3, 0x0

    const/4 p1, 0x4

    .line 151
    invoke-virtual {v0, p1, v3, v4}, Ll/ܳ֡ۧ;->֫(IJ)V

    const/4 p1, 0x1

    .line 152
    iput-boolean p1, p0, Ll/ܿ֡ۧ;->ܽ:Z

    .line 156
    :cond_1
    invoke-virtual {v0, p2}, Ll/ܳ֡ۧ;->֫(Ll/ᩳ֨֫;)V

    return v2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    const/4 p1, 0x0

    .line 128
    iput-boolean p1, p0, Ll/ܿ֡ۧ;->ܽ:Z

    .line 129
    iget-object p1, p0, Ll/ܿ֡ۧ;->֫:Ll/ܳ֡ۧ;

    invoke-virtual {p1}, Ll/ܳ֡ۧ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 3

    .line 120
    new-instance v0, Ll/᩵ۚۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩵ۚۧ;-><init>(II)V

    iget-object v1, p0, Ll/ܿ֡ۧ;->֫:Ll/ܳ֡ۧ;

    invoke-virtual {v1, p1, v0}, Ll/ܳ֡ۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    .line 122
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 123
    new-instance v0, Ll/᩷ۢۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 14

    .line 76
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 79
    :goto_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    move-object v5, p1

    check-cast v5, Ll/ܺ᩷ۧ;

    .line 157
    invoke-virtual {v5, v2, v2, v1, v4}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 80
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 81
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩸()I

    move-result v4

    const v6, 0x494433

    const/4 v7, 0x3

    if-eq v4, v6, :cond_7

    .line 89
    invoke-virtual {v5}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 178
    invoke-virtual {v5, v3, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    move v4, v3

    :goto_1
    const/4 p1, 0x0

    .line 95
    :goto_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v6, 0x7

    .line 157
    invoke-virtual {v5, v2, v2, v6, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 96
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 97
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    const v8, 0xac40

    const v9, 0xac41

    if-eq v1, v8, :cond_1

    if-eq v1, v9, :cond_1

    .line 100
    invoke-virtual {v5}, Ll/ܺ᩷ۧ;->ۧ()V

    add-int/lit8 v4, v4, 0x1

    sub-int p1, v4, v3

    const/16 v1, 0x2000

    if-lt p1, v1, :cond_0

    goto :goto_5

    .line 178
    :cond_0
    invoke-virtual {v5, v4, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto :goto_1

    :cond_1
    const/4 v8, 0x1

    add-int/2addr p1, v8

    const/4 v10, 0x4

    if-lt p1, v10, :cond_2

    return v8

    .line 109
    :cond_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    .line 760
    array-length v11, v8

    const/4 v12, -0x1

    if-ge v11, v6, :cond_3

    const/4 v1, -0x1

    goto :goto_4

    :cond_3
    const/4 v11, 0x2

    .line 764
    aget-byte v11, v8, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    aget-byte v13, v8, v7

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v11, v13

    const v13, 0xffff

    if-ne v11, v13, :cond_4

    .line 767
    aget-byte v10, v8, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    const/4 v11, 0x5

    aget-byte v11, v8, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v10, v11

    const/4 v11, 0x6

    aget-byte v8, v8, v11

    and-int/lit16 v8, v8, 0xff

    or-int v11, v10, v8

    goto :goto_3

    :cond_4
    const/4 v6, 0x4

    :goto_3
    if-ne v1, v9, :cond_5

    add-int/lit8 v6, v6, 0x2

    :cond_5
    add-int v1, v11, v6

    :goto_4
    if-ne v1, v12, :cond_6

    :goto_5
    return v2

    :cond_6
    add-int/lit8 v1, v1, -0x7

    .line 178
    invoke-virtual {v5, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto :goto_2

    .line 84
    :cond_7
    invoke-virtual {v0, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 85
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۚ()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    .line 178
    invoke-virtual {v5, v4, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto/16 :goto_0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
