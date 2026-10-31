.class public Ll/ᩳܶܿ;
.super Ll/ۧ᩹ܿ;
.source "A14A"


# instance fields
.field public ۛ:Ljava/lang/String;

.field public final ۤ:Ljava/io/File;

.field public ۨ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p2, v0}, Ll/ۧ᩹ܿ;-><init>(Ljava/io/File;Z)V

    .line 23
    iput-object p1, p0, Ll/ᩳܶܿ;->ۤ:Ljava/io/File;

    .line 24
    iput-object p3, p0, Ll/ᩳܶܿ;->ۛ:Ljava/lang/String;

    .line 25
    iput-object p4, p0, Ll/ᩳܶܿ;->ۨ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֨ۧ()Z
    .locals 1

    .line 59
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 60
    :cond_0
    sget-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw v0
.end method

.method public bridge synthetic ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 15
    invoke-virtual {p0}, Ll/ᩳܶܿ;->֫()Ll/ܽܶܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿ᩹ܿ;)Ll/ܶ᩵ܿ;
    .locals 9

    .line 67
    invoke-virtual {p1}, Ll/ܿ᩹ܿ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v7, Ljava/io/File;

    iget-object v1, p0, Ll/ᩳܶܿ;->ۤ:Ljava/io/File;

    invoke-direct {v7, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    new-instance v3, Ljava/io/File;

    iget-object v1, p0, Ll/ۧ᩹ܿ;->۬:Ljava/io/File;

    invoke-direct {v3, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳܶܿ;->ۛ:Ljava/lang/String;

    const-string v4, "/"

    .line 0
    invoke-static {v1, v2, v4, v0}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 71
    new-instance v8, Ll/ܽܶܿ;

    iget-object v5, p0, Ll/ᩳܶܿ;->ۨ:Ljava/lang/String;

    move-object v1, v8

    move-object v2, v7

    move-object v4, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ܽܶܿ;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܿ᩹ܿ;)V

    .line 72
    new-instance p1, Ll/۬۠ܿ;

    const-string v1, "relativePath"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "treePrimaryPath"

    iget-object v4, p0, Ll/ᩳܶܿ;->ۨ:Ljava/lang/String;

    invoke-static {v4, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p1

    move-object v3, v0

    move-object v5, v8

    .line 106
    invoke-direct/range {v1 .. v6}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ᩳܶܿ;Ll/ۙ۠ܿ;)V

    return-object p1
.end method

.method public ֫()Ll/ܽܶܿ;
    .locals 7

    .line 54
    new-instance v6, Ll/ܽܶܿ;

    iget-object v4, p0, Ll/ᩳܶܿ;->ۨ:Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v1, p0, Ll/ᩳܶܿ;->ۤ:Ljava/io/File;

    iget-object v2, p0, Ll/ۧ᩹ܿ;->۬:Ljava/io/File;

    iget-object v3, p0, Ll/ᩳܶܿ;->ۛ:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ܽܶܿ;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ܿ᩹ܿ;)V

    return-object v6
.end method

.method public final ֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;
    .locals 1

    .line 46
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-super {p0, p1}, Ll/ۧ᩹ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1

    return-object p1

    .line 47
    :cond_0
    sget-object p1, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw p1
.end method

.method public final ۠()Z
    .locals 1

    .line 38
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-super {p0}, Ll/ۧ᩹ܿ;->۠()Z

    move-result v0

    return v0

    .line 39
    :cond_0
    sget-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 30
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-super {p0}, Ll/ۧ᩹ܿ;->ᩴ()Z

    move-result v0

    return v0

    .line 31
    :cond_0
    sget-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw v0
.end method

.method public final ᩶ۧ()Ll/᩵᩶ܿ;
    .locals 2

    .line 77
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    invoke-super {p0}, Ll/ۧ᩹ܿ;->᩶ۧ()Ll/᩵᩶ܿ;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 82
    :cond_0
    sget-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw v0

    .line 78
    :cond_1
    sget-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    throw v0
.end method
