.class public final Ll/᩷᩶ۖ;
.super Ll/ᩴ᩶ۖ;
.source "K4WW"


# instance fields
.field public ۗ:I

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨᩶ۖ;Ljava/lang/String;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/ᩴ᩶ۖ;-><init>(Ll/֨᩶ۖ;)V

    .line 45
    iput-object p2, p0, Ll/᩷᩶ۖ;->۬:Ljava/lang/String;

    .line 46
    iput p3, p0, Ll/᩷᩶ۖ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/᩷᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 4

    .line 51
    new-instance v0, Ll/᩷᩶ۖ;

    iget-object v1, p0, Ll/᩷᩶ۖ;->۬:Ljava/lang/String;

    iget v2, p0, Ll/᩷᩶ۖ;->ۗ:I

    iget-object v3, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-direct {v0, v3, v1, v2}, Ll/᩷᩶ۖ;-><init>(Ll/֨᩶ۖ;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 3

    .line 55
    new-instance p1, Ll/᩷᩶ۖ;

    iget-object v0, p0, Ll/᩷᩶ۖ;->۬:Ljava/lang/String;

    iget v1, p0, Ll/᩷᩶ۖ;->ۗ:I

    iget-object v2, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-direct {p1, v2, v0, v1}, Ll/᩷᩶ۖ;-><init>(Ll/֨᩶ۖ;Ljava/lang/String;I)V

    return-object p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 60
    sget-object v0, Ll/ۜ᩶ۖ;->֫:[I

    iget-object v1, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 270
    invoke-virtual {p0}, Ll/᩷᩶ۖ;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "@Exception"

    return-object v0

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@parameter_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩷᩶ۖ;->ۗ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "@this"

    return-object v0
.end method
