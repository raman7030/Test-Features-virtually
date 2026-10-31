.class public final Ll/ܽ֡ۧ;
.super Ljava/lang/Object;
.source "98TO"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/ᩳ֡ۧ;

.field public final ۧ:Ll/ᩳ֨֫;

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ll/ᩳ֡ۧ;

    const-string v1, "audio/ac3"

    invoke-direct {v0, v1}, Ll/ᩳ֡ۧ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ܽ֡ۧ;->֫:Ll/ᩳ֡ۧ;

    .line 60
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xae2

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܽ֡ۧ;->ۧ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 5

    .line 130
    iget-object p2, p0, Ll/ܽ֡ۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/16 v1, 0xae2

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    .line 136
    :cond_0
    invoke-virtual {p2, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 137
    invoke-virtual {p2, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 139
    iget-boolean p1, p0, Ll/ܽ֡ۧ;->ܽ:Z

    iget-object v0, p0, Ll/ܽ֡ۧ;->֫:Ll/ᩳ֡ۧ;

    if-nez p1, :cond_1

    const-wide/16 v3, 0x0

    const/4 p1, 0x4

    .line 141
    invoke-virtual {v0, p1, v3, v4}, Ll/ᩳ֡ۧ;->֫(IJ)V

    const/4 p1, 0x1

    .line 142
    iput-boolean p1, p0, Ll/ܽ֡ۧ;->ܽ:Z

    .line 146
    :cond_1
    invoke-virtual {v0, p2}, Ll/ᩳ֡ۧ;->֫(Ll/ᩳ֨֫;)V

    return v2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    const/4 p1, 0x0

    .line 119
    iput-boolean p1, p0, Ll/ܽ֡ۧ;->ܽ:Z

    .line 120
    iget-object p1, p0, Ll/ܽ֡ۧ;->֫:Ll/ᩳ֡ۧ;

    invoke-virtual {p1}, Ll/ᩳ֡ۧ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 3

    .line 112
    new-instance v0, Ll/᩵ۚۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩵ۚۧ;-><init>(II)V

    iget-object v1, p0, Ll/ܽ֡ۧ;->֫:Ll/ᩳ֡ۧ;

    invoke-virtual {v1, p1, v0}, Ll/ᩳ֡ۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    .line 113
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 114
    new-instance v0, Ll/᩷ۢۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 7

    .line 68
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 71
    :goto_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    move-object v5, p1

    check-cast v5, Ll/ܺ᩷ۧ;

    .line 157
    invoke-virtual {v5, v2, v2, v1, v4}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 72
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 73
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩸()I

    move-result v4

    const v6, 0x494433

    if-eq v4, v6, :cond_4

    .line 81
    invoke-virtual {v5}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 178
    invoke-virtual {v5, v3, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    move v4, v3

    :goto_1
    const/4 p1, 0x0

    .line 87
    :goto_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v6, 0x6

    .line 157
    invoke-virtual {v5, v2, v2, v6, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 88
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 89
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    const/16 v6, 0xb77

    if-eq v1, v6, :cond_1

    .line 92
    invoke-virtual {v5}, Ll/ܺ᩷ۧ;->ۧ()V

    add-int/lit8 v4, v4, 0x1

    sub-int p1, v4, v3

    const/16 v1, 0x2000

    if-lt p1, v1, :cond_0

    goto :goto_3

    .line 178
    :cond_0
    invoke-virtual {v5, v4, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    add-int/2addr p1, v1

    const/4 v6, 0x4

    if-lt p1, v6, :cond_2

    return v1

    .line 101
    :cond_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-static {v1}, Ll/ۛۜۧ;->֫([B)I

    move-result v1

    const/4 v6, -0x1

    if-ne v1, v6, :cond_3

    :goto_3
    return v2

    :cond_3
    add-int/lit8 v1, v1, -0x6

    .line 178
    invoke-virtual {v5, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto :goto_2

    :cond_4
    const/4 v4, 0x3

    .line 76
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 77
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۚ()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    .line 178
    invoke-virtual {v5, v4, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    goto :goto_0
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
