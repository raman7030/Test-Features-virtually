.class public final Ll/۫᩸᩻;
.super Ll/ܺۘܳ;
.source "I97X"


# instance fields
.field public final ۧ֫:Ll/ܶ᩵ܿ;

.field public final ܽ֫:Ll/᩸֡ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 9

    .line 21
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    const/4 p2, 0x0

    .line 22
    iput-object p2, p0, Ll/۫᩸᩻;->ܽ֫:Ll/᩸֡ܿ;

    .line 23
    iput-object p1, p0, Ll/۫᩸᩻;->ۧ֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public constructor <init>(Ll/᩸֡ܿ;)V
    .locals 10

    .line 15
    invoke-virtual {p1}, Ll/᩸֡ܿ;->֫()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩸֡ܿ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/᩸֡ܿ;->size()J

    move-result-wide v4

    invoke-virtual {p1}, Ll/᩸֡ܿ;->ܳ()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/᩸֡ܿ;->ᩳ()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 16
    iput-object p1, p0, Ll/۫᩸᩻;->ܽ֫:Ll/᩸֡ܿ;

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$RECYCLE.BIN$/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩸֡ܿ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/᩸֡ܿ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩸᩻;->ۧ֫:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 46
    iget-object v0, p0, Ll/۫᩸᩻;->ܽ֫:Ll/᩸֡ܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܶۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۫᩸᩻;->ۧ֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܽ()Ll/᩸֡ܿ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/۫᩸᩻;->ܽ֫:Ll/᩸֡ܿ;

    return-object v0
.end method

.method public final ᩳ()Ll/᩸֡ܿ;
    .locals 4

    .line 33
    iget-object v0, p0, Ll/۫᩸᩻;->ܽ֫:Ll/᩸֡ܿ;

    if-eqz v0, :cond_0

    return-object v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    .line 39
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩹֡ܿ;->֫(Ljava/lang/String;)Ll/᩸֡ܿ;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
