.class public final Ll/ܽ֨ۘ;
.super Ll/ۧ֨ۘ;
.source "Q89H"


# instance fields
.field public ۧ:Ll/᩻֨ۘ;

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 95
    :cond_0
    instance-of v1, p1, Ll/ܽ֨ۘ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 98
    :cond_1
    move-object v1, p1

    check-cast v1, Ll/ܽ֨ۘ;

    .line 99
    invoke-super {p0, p1}, Ll/ᩳ֨ۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Ll/ܽ֨ۘ;->ܽ:I

    iget v3, v1, Ll/ܽ֨ۘ;->ܽ:I

    if-ne p1, v3, :cond_2

    .line 58
    iget-object p1, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    iget-object v1, v1, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    .line 101
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    .line 88
    invoke-super {p0}, Ll/ᩳ֨ۘ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 50
    iget v1, p0, Ll/ܽ֨ۘ;->ܽ:I

    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 58
    iget-object v2, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    .line 88
    invoke-static {v3}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 107
    invoke-virtual {p0}, Ll/ᩳ֨ۘ;->֫()Ll/᩻֨ۘ;

    move-result-object v0

    .line 50
    iget v1, p0, Ll/ܽ֨ۘ;->ܽ:I

    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 58
    iget-object v2, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const-string v0, "SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}"

    .line 106
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܺۚۘ;)V
    .locals 1

    .line 81
    invoke-super {p0, p1}, Ll/ᩳ֨ۘ;->֫(Ll/ܺۚۘ;)V

    .line 82
    iget-object v0, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ᩴۚۘ;)V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/᩻֨ۘ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    return-object v0
.end method

.method public final ۧ(Ll/ܺۚۘ;)V
    .locals 2

    .line 67
    invoke-super {p0, p1}, Ll/ᩳ֨ۘ;->ۧ(Ll/ܺۚۘ;)V

    .line 70
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܿ()J

    move-result-wide v0

    long-to-int v1, v0

    iput v1, p0, Ll/ܽ֨ۘ;->ܽ:I

    .line 57
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result p1

    if-eqz p1, :cond_0

    .line 74
    new-instance p1, Ll/᩻֨ۘ;

    .line 49
    invoke-direct {p1}, Ll/ۜ֨ۘ;-><init>()V

    .line 74
    iput-object p1, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 76
    iput-object p1, p0, Ll/ܽ֨ۘ;->ۧ:Ll/᩻֨ۘ;

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ܽ֨ۘ;->ܽ:I

    return v0
.end method
