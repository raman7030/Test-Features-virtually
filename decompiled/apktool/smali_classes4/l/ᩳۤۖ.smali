.class public final Ll/ᩳۤۖ;
.super Ljava/lang/Object;
.source "F9FK"


# instance fields
.field public ֫:Ll/ܽۤۖ;

.field public ۧ:Ljava/lang/String;

.field public ܽ:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FileNotifyInformation{action="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩳۤۖ;->֫:Ll/ܽۤۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳۤۖ;->ۧ:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 40
    iget v0, p0, Ll/ᩳۤۖ;->ܽ:I

    return v0
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 4

    .line 33
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v0

    iput v0, p0, Ll/ᩳۤۖ;->ܽ:I

    .line 34
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    const-class v2, Ll/ܽۤۖ;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v0

    check-cast v0, Ll/ܽۤۖ;

    iput-object v0, p0, Ll/ᩳۤۖ;->֫:Ll/ܽۤۖ;

    .line 35
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    .line 36
    sget-object v2, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    long-to-int v1, v0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۤۖ;->ۧ:Ljava/lang/String;

    return-void
.end method
