.class public final Ll/ۛ᩻ܽ;
.super Ll/ۜᩳܽ;
.source "54WU"


# instance fields
.field public ۗ:I

.field public final ۙ:Ljava/lang/Object;

.field public ۛ:Z

.field public ۤ:Ll/ۤ᩻ᩴ;

.field public ۨ:Z

.field public ۫:Ll/ۚܳᩴ;

.field public ۬:I

.field public final ᩶:Ll/ۗۜܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۜܽ;Ll/ۛۜܽ;Ll/֫ᩳܽ;)V
    .locals 5

    .line 29
    iget v0, p3, Ll/֫ᩳܽ;->ܽ:I

    invoke-direct {p0, p1}, Ll/ۜᩳܽ;-><init>(Ll/ۤᩳܽ;)V

    .line 20
    new-instance p1, Ll/ۤ᩻ᩴ;

    invoke-direct {p1}, Ll/ۤ᩻ᩴ;-><init>()V

    iput-object p1, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    .line 21
    new-instance p1, Ll/ۚܳᩴ;

    invoke-direct {p1}, Ll/ۚܳᩴ;-><init>()V

    iput-object p1, p0, Ll/ۛ᩻ܽ;->۫:Ll/ۚܳᩴ;

    .line 22
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩻ܽ;->ۙ:Ljava/lang/Object;

    .line 30
    iget-object p1, p2, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iput-object p1, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    .line 31
    invoke-virtual {p2}, Ll/ۛۜܽ;->ܳ()I

    move-result p1

    const/4 v1, 0x2

    .line 32
    invoke-virtual {p2, v1}, Ll/ۛۜܽ;->ᩳ(I)V

    and-int/lit8 v2, p1, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 33
    :goto_0
    iput-boolean v2, p0, Ll/ۛ᩻ܽ;->ۨ:Z

    and-int/2addr p1, v1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 34
    :goto_1
    iput-boolean p1, p0, Ll/ۛ᩻ܽ;->ۛ:Z

    .line 35
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v1

    .line 37
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v4

    add-int/2addr v4, v0

    iput v4, p0, Ll/ۛ᩻ܽ;->ۗ:I

    .line 165
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v4

    check-cast v4, Ll/᩻ۜܽ;

    .line 38
    invoke-virtual {v4}, Ll/᩻ۜܽ;->ۧ()Ll/ᩳۜܽ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v4

    invoke-static {p2, v4}, Ll/᩸ܽܽ;->֫(Ll/ۛۜܽ;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object v4

    iput-object v4, p0, Ll/ۜᩳܽ;->᩹:Ll/᩸ܽܽ;

    .line 80
    iget p3, p3, Ll/֫ᩳܽ;->ۧ:I

    add-int/2addr v0, p3

    invoke-virtual {p2, v0}, Ll/ۛۜܽ;->ܽ(I)V

    const/4 p3, -0x1

    if-eqz v2, :cond_4

    :goto_2
    if-ge v3, v1, :cond_3

    .line 44
    invoke-virtual {p2}, Ll/ۛۜܽ;->᩻()I

    move-result p1

    .line 45
    invoke-virtual {p2}, Ll/ۛۜܽ;->᩻()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    .line 46
    iget-object v2, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    invoke-virtual {v2, p1, v0}, Ll/ۤ᩻ᩴ;->֫(II)I

    if-le p1, p3, :cond_2

    move p3, p1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 51
    :cond_3
    iput p3, p0, Ll/ۛ᩻ܽ;->۬:I

    return-void

    :cond_4
    if-eqz p1, :cond_7

    :goto_3
    if-ge v3, v1, :cond_6

    .line 54
    invoke-virtual {p2}, Ll/ۛۜܽ;->᩻()I

    move-result p1

    const p3, 0xffff

    if-eq p1, p3, :cond_5

    .line 56
    iget-object p3, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    mul-int/lit8 p1, p1, 0x4

    invoke-virtual {p3, v3, p1}, Ll/ۤ᩻ᩴ;->֫(II)I

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 59
    iput v1, p0, Ll/ۛ᩻ܽ;->۬:I

    return-void

    :cond_7
    :goto_4
    if-ge v3, v1, :cond_9

    .line 62
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result p1

    if-eq p1, p3, :cond_8

    .line 64
    iget-object v0, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, v3, p1}, Ll/ۤ᩻ᩴ;->֫(II)I

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 67
    iput v1, p0, Ll/ۛ᩻ܽ;->۬:I

    return-void
.end method


# virtual methods
.method public final getType()Ll/֡᩻ܽ;
    .locals 1

    .line 165
    invoke-super {p0}, Ll/ۜᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩻ۜܽ;

    return-object v0
.end method

.method public final ֨()I
    .locals 1

    .line 73
    iget v0, p0, Ll/ۛ᩻ܽ;->۬:I

    return v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 155
    invoke-super {p0}, Ll/ۜᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    return-object v0
.end method

.method public final ۚ֫()Z
    .locals 1

    .line 145
    iget-boolean v0, p0, Ll/ۛ᩻ܽ;->ۨ:Z

    return v0
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 160
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܽ;

    return-object v0
.end method

.method public final ۧ(I)Ll/᩷᩻ܽ;
    .locals 4

    .line 77
    iget-object v0, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->ܽ(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    iget v1, p0, Ll/ۛ᩻ܽ;->ۗ:I

    add-int/2addr v0, v1

    if-ltz v0, :cond_2

    .line 130
    iget-object v1, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    invoke-virtual {v1, v0}, Ll/ۗۜܽ;->֫(I)I

    move-result v2

    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v1, v0}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v0

    .line 133
    new-instance v2, Ll/ۨ᩻ܽ;

    invoke-direct {v2, p0, p1, v0}, Ll/ۨ᩻ܽ;-><init>(Ll/ۛ᩻ܽ;ILl/ۛۜܽ;)V

    .line 134
    invoke-virtual {v1, v0}, Ll/ۗۜܽ;->֫(Ll/ۛۜܽ;)V

    return-object v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܺ(I)Z
    .locals 6

    .line 77
    iget-object v0, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->ܽ(I)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    .line 84
    iget v1, p0, Ll/ۛ᩻ܽ;->ۗ:I

    add-int/2addr v1, v0

    if-ltz v1, :cond_4

    .line 85
    iget-object v0, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->֫(I)I

    move-result v0

    const/16 v3, 0x8

    if-ge v0, v3, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    iget-object v0, p0, Ll/ۛ᩻ܽ;->ۙ:Ljava/lang/Object;

    monitor-enter v0

    .line 91
    :try_start_0
    iget-object v3, p0, Ll/ۛ᩻ܽ;->۫:Ll/ۚܳᩴ;

    invoke-virtual {v3, p1}, Ll/ۚܳᩴ;->ܽ(I)B

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_2

    .line 93
    iget-object v3, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    invoke-virtual {v3, v1}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v1

    .line 160
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܽ;

    .line 94
    invoke-static {v1, v3}, Ll/ۨ᩻ܽ;->֫(Ll/ۛۜܽ;Ll/ᩳۜܽ;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    .line 99
    :goto_0
    iget-object v5, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    invoke-virtual {v5, v1}, Ll/ۗۜܽ;->֫(Ll/ۛۜܽ;)V

    .line 101
    iget-object v1, p0, Ll/ۛ᩻ܽ;->۫:Ll/ۚܳᩴ;

    invoke-virtual {v1, v3, p1}, Ll/ۚܳᩴ;->֫(BI)B

    :cond_2
    if-ne v3, v4, :cond_3

    const/4 v2, 0x1

    .line 103
    :cond_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    :goto_1
    return v2
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ۛ᩻ܽ;->ۤ:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->ܽ(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 114
    :cond_0
    iget v0, p0, Ll/ۛ᩻ܽ;->ۗ:I

    add-int/2addr v0, p1

    add-int/lit8 p1, v0, 0x2

    .line 42
    iget-object v1, p0, Ll/ۛ᩻ܽ;->᩶:Ll/ۗۜܽ;

    invoke-virtual {v1, p1}, Ll/ۗۜܽ;->ᩳ(I)S

    move-result p1

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_1

    .line 44
    invoke-virtual {v1, v0}, Ll/ۗۜܽ;->ܳ(I)I

    move-result p1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x4

    .line 46
    invoke-virtual {v1, v0}, Ll/ۗۜܽ;->ܽ(I)I

    move-result p1

    .line 160
    :goto_0
    :try_start_0
    invoke-super {p0}, Ll/ۜᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܽ;

    .line 116
    invoke-virtual {v0}, Ll/ᩳۜܽ;->ۜ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ll/ܽۜܽ;

    .line 80
    iget-object v0, v0, Ll/ܽۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "error"

    return-object p1
.end method

.method public final ᩷ۧ()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Ll/ۛ᩻ܽ;->ۛ:Z

    return v0
.end method
