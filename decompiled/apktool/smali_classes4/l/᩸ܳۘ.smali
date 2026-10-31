.class public final Ll/᩸ܳۘ;
.super Ljava/lang/Object;
.source "71N5"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Ll/᩸ܳۘ;->֫:I

    .line 26
    iput p2, p0, Ll/᩸ܳۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 32
    const-class v2, Ll/᩸ܳۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    check-cast p1, Ll/᩸ܳۘ;

    .line 36
    iget v2, p0, Ll/᩸ܳۘ;->֫:I

    iget v3, p1, Ll/᩸ܳۘ;->֫:I

    if-eq v2, v3, :cond_2

    return v1

    .line 37
    :cond_2
    iget v2, p0, Ll/᩸ܳۘ;->ۧ:I

    iget p1, p1, Ll/᩸ܳۘ;->ۧ:I

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 42
    iget v0, p0, Ll/᩸ܳۘ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    .line 43
    iget v1, p0, Ll/᩸ܳۘ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩸ܳۘ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩸ܳۘ;->ۧ:I

    const-string v2, "}"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
