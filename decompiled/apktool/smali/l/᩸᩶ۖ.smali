.class public final Ll/᩸᩶ۖ;
.super Ll/ܰ᩶ۖ;
.source "1570"


# direct methods
.method public constructor <init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;)V
    .locals 1

    .line 84
    sget-object v0, Ll/֡᩹ۖ;->ۙ:Ll/֡᩹ۖ;

    invoke-direct {p0, p1, v0}, Ll/֫ۙۖ;-><init>(Ll/۟᩶ۖ;Ll/֡᩹ۖ;)V

    .line 85
    iput-object p2, p0, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 86
    iput-object p3, p0, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 45
    sget-object v0, Ll/ܶ᩶ۖ;->֫:[I

    iget-object v1, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 55
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " <- "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " := "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 47
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 3

    .line 40
    new-instance v0, Ll/᩸᩶ۖ;

    iget-object v1, p0, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v1, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    invoke-virtual {v2, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v2, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-direct {v0, v2, v1, p1}, Ll/᩸᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;)V

    return-object v0
.end method
