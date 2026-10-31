.class public final Ll/᩵ܳ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public final synthetic ܿ:Ll/᩹ܳ۠;

.field public final ᩳ:Ll/ۘܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 4

    .line 2007
    iput-object p1, p0, Ll/᩵ܳ۠;->ܿ:Ll/᩹ܳ۠;

    .line 2008
    sget-object v0, Ll/᩷᩶۠;->ۛ:Ll/᩷᩶۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/֡ۖ۠;

    sget-object v2, Ll/֡ۖ۠;->ܿۧ:Ll/֡ۖ۠;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    .line 2005
    new-instance v0, Ll/ۘܳ۠;

    invoke-direct {v0, p1}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 1

    .line 2068
    iget-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 0

    .line 2058
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 0

    .line 2063
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p2

    .line 2013
    iget-object v0, v7, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v9, 0x0

    if-nez v0, :cond_0

    return v9

    :cond_0
    const/4 v10, 0x1

    .line 2017
    iput-boolean v10, v7, Ll/ܰܿ۠;->֫:Z

    .line 2019
    iget-object v11, v7, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v11}, Ll/ۘܳ۠;->֫()V

    const-string v0, "\u0000"

    .line 2026
    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v13, v12

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_2

    aget-object v0, v12, v14

    const/16 v1, 0x3d

    .line 2027
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 2028
    iget-object v2, v7, Ll/᩵ܳ۠;->ܿ:Ll/᩹ܳ۠;

    if-lez v1, :cond_1

    .line 2029
    invoke-virtual {v0, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 2030
    new-instance v5, Ll/֨ܳ۠;

    invoke-direct {v5, v2}, Ll/֨ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    add-int/lit8 v1, v1, 0x1

    .line 2031
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    .line 2032
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v7, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v1}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2033
    new-instance v15, Ll/ܽܳ۠;

    const/4 v6, 0x0

    move-object v0, v15

    move-object v1, v2

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v6}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 2035
    invoke-virtual {v11, v15}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_1

    .line 2039
    :cond_1
    invoke-static {v2}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2409
    new-instance v1, Ll/۫۠۠;

    new-array v2, v10, [Ljava/lang/Object;

    aput-object v8, v2, v9

    const-string v3, "compiler"

    const-string v4, "locn.invalid.arg.for.xpatch"

    invoke-direct {v1, v3, v4, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2039
    invoke-virtual {v0, v1}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_2
    return v10
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 2083
    iget-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 1

    .line 2073
    iget-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/Iterable;
    .locals 1

    .line 2078
    iget-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0}, Ll/ۘܳ۠;->ᩳ()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 1

    .line 2053
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 2048
    iget-object v0, p0, Ll/᩵ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0}, Ll/ۘܳ۠;->ܽ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
