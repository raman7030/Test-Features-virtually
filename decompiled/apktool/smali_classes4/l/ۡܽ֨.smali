.class public final Ll/ۡܽ֨;
.super Ll/֫ܽ֨;
.source "H7D7"

# interfaces
.implements Ll/ۗܽ֨;


# instance fields
.field public ۛ֫:I

.field public ۤ֫:I

.field public ۨ֫:Ljava/lang/String;

.field public ۫֫:I

.field public ۬֫:I

.field public ᩺֫:I


# direct methods
.method public constructor <init>(Ll/᩷ۧ֨;Ll/۟ۧ֨;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Ll/֫ܽ֨;-><init>(Ll/᩷ۧ֨;Ll/۟ۧ֨;)V

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Ll/ۡܽ֨;->۫֫:I

    .line 46
    sget-object p1, Ll/ܶۨۚ;->ۗܽ:Ll/ܶۨۚ;

    invoke-virtual {p1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    sget p2, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual {p0, p2, p1}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܽ֨;->ۨ֫:Ljava/lang/String;

    .line 50
    sget-object p1, Ll/֨۟ۚ;->ܰ:Ll/֨۟ۚ;

    iput-object p1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    return-void
.end method

.method private ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 136
    iget v0, p0, Ll/ۡܽ֨;->ۛ֫:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/Object;

    aput-object v0, v3, v1

    const-string v0, "#%d = "

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    :cond_0
    iget v0, p0, Ll/ۡܽ֨;->ۤ֫:I

    if-eqz v0, :cond_1

    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/Object;

    aput-object v0, v3, v1

    const-string v0, "#%d"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 140
    :cond_1
    iget v0, p0, Ll/ۡܽ֨;->᩺֫:I

    if-eqz v0, :cond_2

    .line 141
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, " of #%d"

    .line 19
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const-string v0, ";"

    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 154
    iput p1, p0, Ll/ۢܽ֨;->᩺:I

    return-void
.end method

.method public final ۧ(II)V
    .locals 3

    .line 76
    iget p1, p0, Ll/ۡܽ֨;->۬֫:I

    sget-object p2, Ll/᩶۬ۚ;->ۤ:Ll/᩶۬ۚ;

    invoke-static {p1, p2}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/ۡܽ֨;->ۨ֫:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 77
    iget-boolean p2, p0, Ll/ۢܽ֨;->ܺ֫:Z

    iget-boolean v0, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v0, :cond_1

    .line 78
    invoke-direct {p0, p1}, Ll/ۡܽ֨;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 80
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p0}, Ll/ۡܽ֨;->ܿ()I

    move-result v1

    invoke-virtual {p0, v1, p1}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 228
    iget-object v1, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-interface {v1, p1}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    const-string p1, " // "

    .line 82
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    :goto_0
    if-eqz v0, :cond_3

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    return-void

    .line 88
    :cond_3
    :goto_1
    iget p1, p0, Ll/ۡܽ֨;->ۛ֫:I

    iget-object v0, p0, Ll/֫ܽ֨;->ۗ֫:Ll/᩷ۧ֨;

    if-eqz p1, :cond_4

    .line 89
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v2, p0, Ll/ۡܽ֨;->ۛ֫:I

    invoke-virtual {v1, v2}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 90
    :cond_4
    iget p1, p0, Ll/ۡܽ֨;->ۤ֫:I

    if-eqz p1, :cond_5

    .line 91
    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v1, p1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 92
    :cond_5
    iget p1, p0, Ll/ۡܽ֨;->᩺֫:I

    if-eqz p1, :cond_6

    .line 93
    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v1, p1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 94
    :cond_6
    iget-boolean p1, v0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz p1, :cond_7

    if-nez p2, :cond_7

    const-string p1, ""

    goto :goto_2

    :cond_7
    const-string p1, ";"

    :goto_2
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ()I
    .locals 3

    .line 55
    iget v0, p0, Ll/ۡܽ֨;->۫֫:I

    if-nez v0, :cond_1

    .line 56
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۘ()Z

    move-result v0

    iget-object v1, p0, Ll/֫ܽ֨;->ۙ֫:Ll/۟ۧ֨;

    if-eqz v0, :cond_0

    .line 394
    iget v0, v1, Ll/ۢܽ֨;->᩶:I

    .line 57
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩻()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۡܽ֨;->۫֫:I

    .line 159
    iget v1, p0, Ll/ۢܽ֨;->᩺:I

    .line 58
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۡܽ֨;->۫֫:I

    goto :goto_0

    .line 394
    :cond_0
    iget v0, v1, Ll/ۢܽ֨;->᩶:I

    .line 60
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩻()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۡܽ֨;->۫֫:I

    .line 159
    iget v1, p0, Ll/ۢܽ֨;->᩺:I

    .line 61
    iget-object v2, p0, Ll/ۡܽ֨;->ۨ֫:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۡܽ֨;->۫֫:I

    .line 64
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۡܽ֨;->۫֫:I

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 148
    iget v0, p0, Ll/ۡܽ֨;->۬֫:I

    sget-object v1, Ll/᩶۬ۚ;->ۤ:Ll/᩶۬ۚ;

    invoke-static {v0, v1}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۡܽ֨;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩳ(II)V
    .locals 6

    if-nez p1, :cond_0

    .line 103
    sget-object v0, Ll/ܶۨۚ;->ۗܽ:Ll/ܶۨۚ;

    invoke-virtual {v0}, Ll/ܶۨۚ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " {"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 103
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    .line 260
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 106
    iget v1, p0, Ll/ۡܽ֨;->۬֫:I

    sget-object v2, Ll/᩶۬ۚ;->ۤ:Ll/᩶۬ۚ;

    invoke-static {v1, v2}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v1

    .line 107
    iget-boolean v2, p0, Ll/ۢܽ֨;->֫֫:Z

    iget-boolean v3, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-eqz v2, :cond_2

    .line 108
    invoke-direct {p0, v1}, Ll/ۡܽ֨;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v3, :cond_1

    .line 110
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p0}, Ll/ۡܽ֨;->ܿ()I

    move-result v4

    .line 218
    iget-object v5, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-virtual {p0, v4, v1}, Ll/ۢܽ֨;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    const-string v1, " // "

    .line 112
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 115
    :cond_2
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    :goto_0
    if-eqz v2, :cond_4

    if-eqz v2, :cond_3

    if-nez v3, :cond_3

    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    goto :goto_3

    .line 119
    :cond_4
    :goto_1
    iget v1, p0, Ll/ۡܽ֨;->ۛ֫:I

    iget-object v2, p0, Ll/֫ܽ֨;->ۗ֫:Ll/᩷ۧ֨;

    if-eqz v1, :cond_5

    .line 120
    iget-object v4, v2, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v4, v1}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v1

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 121
    :cond_5
    iget v1, p0, Ll/ۡܽ֨;->ۤ֫:I

    if-eqz v1, :cond_6

    .line 122
    iget-object v4, v2, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v4, v1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 123
    :cond_6
    iget v1, p0, Ll/ۡܽ֨;->᩺֫:I

    if-eqz v1, :cond_7

    .line 124
    iget-object v4, v2, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v4, v1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 125
    :cond_7
    iget-boolean v1, v2, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v1, :cond_8

    if-nez v3, :cond_8

    const-string v1, ""

    goto :goto_2

    :cond_8
    const-string v1, ";"

    :goto_2
    invoke-virtual {p0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 264
    :goto_3
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(I)V

    sub-int/2addr p2, v0

    if-ne p1, p2, :cond_9

    const-string p1, "}"

    .line 131
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_9
    return-void
.end method
