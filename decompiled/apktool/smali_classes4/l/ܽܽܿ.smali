.class public final Ll/ܽܽܿ;
.super Ljava/lang/Object;
.source "35OM"


# instance fields
.field public final ֫:Ll/ܰܰᩳ;

.field public ۜ:I

.field public final ۧ:I

.field public final ܳ:I

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ll/᩷۟ᩳ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩷۟ᩳ;IIII)V
    .locals 0

    .line 1027
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1028
    iput-object p1, p0, Ll/ܽܽܿ;->ᩳ:Ll/᩷۟ᩳ;

    .line 1029
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܽܿ;->֫:Ll/ܰܰᩳ;

    .line 1030
    iput p2, p0, Ll/ܽܽܿ;->ܽ:I

    .line 1031
    iput p3, p0, Ll/ܽܽܿ;->᩻:I

    iput p3, p0, Ll/ܽܽܿ;->ۧ:I

    .line 1032
    iput p4, p0, Ll/ܽܽܿ;->ܿ:I

    .line 1033
    iput p5, p0, Ll/ܽܽܿ;->ܳ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽܽܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽܽܿ;->᩻:I

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ۨܰᩳ;Ll/ۜ۟ᩳ;)Z
    .locals 6

    .line 1037
    :goto_0
    iget v0, p0, Ll/ܽܽܿ;->ܽ:I

    iget v1, p0, Ll/ܽܽܿ;->ܿ:I

    iget v2, p0, Ll/ܽܽܿ;->ۧ:I

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    iget-object v4, p0, Ll/ܽܽܿ;->ᩳ:Ll/᩷۟ᩳ;

    invoke-virtual {v4, v0}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v0

    add-int/2addr v0, v1

    iget v4, p1, Ll/ۨܰᩳ;->᩸:I

    if-ge v0, v4, :cond_0

    iget v0, p0, Ll/ܽܽܿ;->ܽ:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ܽܽܿ;->ܽ:I

    goto :goto_0

    .line 1038
    :cond_0
    iget v0, p0, Ll/ܽܽܿ;->ܽ:I

    if-ne v0, v2, :cond_1

    goto :goto_1

    .line 1039
    :cond_1
    iget-object v2, p0, Ll/ܽܽܿ;->֫:Ll/ܰܰᩳ;

    invoke-virtual {v2, v0}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 57
    iget v2, v0, Ll/ۨܰᩳ;->᩶:I

    add-int/2addr v2, v1

    iput v2, v0, Ll/ۨܰᩳ;->᩶:I

    .line 58
    iget v4, v0, Ll/ۨܰᩳ;->᩸:I

    add-int/2addr v4, v1

    iput v4, v0, Ll/ۨܰᩳ;->᩸:I

    .line 59
    iget v1, v0, Ll/ۨܰᩳ;->᩹:I

    iget v5, p0, Ll/ܽܽܿ;->ܳ:I

    add-int/2addr v1, v5

    iput v1, v0, Ll/ۨܰᩳ;->᩹:I

    .line 1041
    iget v0, p1, Ll/ۨܰᩳ;->᩹:I

    if-eq v1, v0, :cond_2

    goto :goto_1

    .line 1042
    :cond_2
    iget v0, p0, Ll/ܽܽܿ;->ۜ:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ܽܽܿ;->ۜ:I

    .line 1043
    iget p1, p1, Ll/ۨܰᩳ;->᩸:I

    if-eq v4, p1, :cond_5

    const/16 v5, 0x1388

    if-lt v0, v5, :cond_4

    if-ge p1, v2, :cond_3

    goto :goto_1

    .line 1046
    :cond_3
    new-instance v0, Ll/ۨܰᩳ;

    invoke-direct {v0, p1, v4, v1}, Ll/ۨܰᩳ;-><init>(III)V

    invoke-virtual {p2, v0}, Ll/ۜ۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1

    .line 1049
    :cond_5
    :goto_2
    iget p1, p0, Ll/ܽܽܿ;->ܽ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܽܽܿ;->᩻:I

    return v3
.end method
