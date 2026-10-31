.class public Ll/֨ᩳ֨;
.super Ll/᩹ᩳ֨;
.source "97F2"


# instance fields
.field public ۙ:I

.field public ᩶:Ll/᩶۬ۚ;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILl/᩶۬ۚ;)V
    .locals 0

    .line 237
    invoke-direct {p0, p1, p2}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    .line 238
    iput p3, p0, Ll/֨ᩳ֨;->ۙ:I

    .line 239
    iput-object p4, p0, Ll/֨ᩳ֨;->᩶:Ll/᩶۬ۚ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 261
    invoke-super {p0, p1}, Ll/᩹ᩳ֨;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/֨ᩳ֨;

    iget p1, p1, Ll/֨ᩳ֨;->ۙ:I

    iget v0, p0, Ll/֨ᩳ֨;->ۙ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 256
    invoke-super {p0}, Ll/᩹ᩳ֨;->hashCode()I

    move-result v0

    iget v1, p0, Ll/֨ᩳ֨;->ۙ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/֨ᩳ֨;->ۙ:I

    iget-object v2, p0, Ll/֨ᩳ֨;->᩶:Ll/᩶۬ۚ;

    invoke-static {v1, v2}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ll/᩹ᩳ֨;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 247
    iget v0, p0, Ll/֨ᩳ֨;->ۙ:I

    return v0
.end method
