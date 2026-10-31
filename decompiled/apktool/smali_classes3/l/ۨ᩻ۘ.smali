.class public final Ll/ۨ᩻ۘ;
.super Ljava/lang/Object;
.source "27ZX"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ll/֫ۡۘ;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ll/֫ۡۘ;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/֫ۡۘ;)V
    .locals 0

    .line 2993
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3004
    iput-object p1, p0, Ll/ۨ᩻ۘ;->᩹:Ljava/lang/String;

    .line 3012
    iput-object p2, p0, Ll/ۨ᩻ۘ;->ۗ:Ljava/lang/String;

    .line 3020
    iput-object p3, p0, Ll/ۨ᩻ۘ;->᩸:Ll/֫ۡۘ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 2984
    check-cast p1, Ll/ۨ᩻ۘ;

    .line 3066
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩹:Ljava/lang/String;

    .line 3000
    iget-object p1, p1, Ll/ۨ᩻ۘ;->᩹:Ljava/lang/String;

    .line 3066
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 3061
    iget-object v0, p0, Ll/ۨ᩻ۘ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ll/֫ۡۘ;
    .locals 1

    .line 3016
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩸:Ll/֫ۡۘ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 3024
    iput-object p1, p0, Ll/ۨ᩻ۘ;->᩶:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/֫ۡۘ;)V
    .locals 0

    .line 3028
    iput-object p1, p0, Ll/ۨ᩻ۘ;->ۙ:Ll/֫ۡۘ;

    return-void
.end method

.method public final ۡ()Z
    .locals 1

    .line 3052
    iget-object v0, p0, Ll/ۨ᩻ۘ;->ۙ:Ll/֫ۡۘ;

    if-nez v0, :cond_0

    .line 3054
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩸:Ll/֫ۡۘ;

    .line 3056
    :cond_0
    invoke-virtual {v0}, Ll/֫ۡۘ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ۢ()J
    .locals 4

    .line 3044
    iget-object v0, p0, Ll/ۨ᩻ۘ;->ۙ:Ll/֫ۡۘ;

    if-nez v0, :cond_0

    .line 3046
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩸:Ll/֫ۡۘ;

    .line 322
    :cond_0
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    .line 346
    iget v0, v0, Ll/֫ۡۘ;->ܿ:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    return-wide v0

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 3000
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 3032
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()J
    .locals 2

    .line 3036
    iget-object v0, p0, Ll/ۨ᩻ۘ;->ۙ:Ll/֫ۡۘ;

    if-nez v0, :cond_0

    .line 3038
    iget-object v0, p0, Ll/ۨ᩻ۘ;->᩸:Ll/֫ۡۘ;

    .line 322
    :cond_0
    iget v1, v0, Ll/֫ۡۘ;->ܽ:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 326
    iget-wide v0, v0, Ll/֫ۡۘ;->᩻:J

    return-wide v0

    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 3008
    iget-object v0, p0, Ll/ۨ᩻ۘ;->ۗ:Ljava/lang/String;

    return-object v0
.end method
