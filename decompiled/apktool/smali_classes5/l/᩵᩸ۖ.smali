.class public final Ll/᩵᩸ۖ;
.super Ll/ۖ᩵ۘ;
.source "H528"


# instance fields
.field public ۗ:[Ljava/util/List;

.field public ۙ:Ll/۟۠ۖ;

.field public ᩶:Ll/ᩳ᩸ۖ;

.field public ᩸:I

.field public ᩹:Ljava/util/ArrayList;


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ܽܶۖ;)Ll/ۧ᩸ۖ;
    .locals 2

    .line 85
    iget-object v0, p0, Ll/᩵᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩵᩸ۖ;->᩹:Ljava/util/ArrayList;

    .line 88
    :cond_0
    new-instance v0, Ll/ۧ᩸ۖ;

    invoke-direct {v0, p1, p2}, Ll/ۧ᩸ۖ;-><init>(Ljava/lang/String;Ll/ܽܶۖ;)V

    .line 89
    iget-object p1, p0, Ll/᩵᩸ۖ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(I)Ll/ᩴ᩹ۖ;
    .locals 3

    .line 103
    iget-object v0, p0, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    iget-object v1, p0, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    if-nez v1, :cond_0

    .line 104
    invoke-virtual {v0}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    new-array v1, v1, [Ljava/util/List;

    iput-object v1, p0, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    .line 110
    :cond_0
    iget-object v1, p0, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    array-length v1, v1

    if-lt p1, v1, :cond_1

    .line 111
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WARN: parameter out-of-range in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 115
    :cond_1
    new-instance v0, Ll/ᩴ᩸ۖ;

    invoke-direct {v0, p0, p1}, Ll/ᩴ᩸ۖ;-><init>(Ll/᩵᩸ۖ;I)V

    return-object v0
.end method
