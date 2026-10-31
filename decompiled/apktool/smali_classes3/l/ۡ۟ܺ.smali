.class public final Ll/ۡ۟ܺ;
.super Ll/ۘ۟ܺ;
.source "57R8"

# interfaces
.implements Ll/۫۟ܺ;


# instance fields
.field public final ۫:Ll/ܶ۟ܺ;

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ۟ܺ;)V
    .locals 0

    .line 733
    invoke-direct {p0}, Ll/ۘ۟ܺ;-><init>()V

    .line 734
    iput-object p1, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    return-void
.end method

.method public static ֫(Ll/ܶ۟ܺ;)Ll/ۡ۟ܺ;
    .locals 1

    .line 744
    new-instance v0, Ll/ۡ۟ܺ;

    invoke-direct {v0, p0}, Ll/ۡ۟ܺ;-><init>(Ll/ܶ۟ܺ;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 801
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "tok"

    iget-object v2, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 774
    iget-object v0, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    invoke-interface {v0}, Ll/ܶ۟ܺ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "// "

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 775
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 777
    :cond_0
    invoke-static {v0}, Ll/֫۟ܺ;->֫(Ll/ܶ۟ܺ;)Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;
    .locals 3

    .line 789
    iget v0, p2, Ll/ۢ۟ܺ;->֫:I

    check-cast p1, Ll/֡֫ۖ;

    iget-object v1, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    invoke-virtual {p1, v1, v0}, Ll/֡֫ۖ;->֫(Ll/ܶ۟ܺ;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۟ܺ;->۬:Ljava/lang/String;

    .line 790
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v0, p0, Ll/ۡ۟ܺ;->۬:Ljava/lang/String;

    sget v1, Ll/۬۟ܺ;->֫:I

    .line 112
    new-instance v1, Ll/ۗ۟ܺ;

    invoke-direct {v1, v0}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    .line 906
    :cond_0
    invoke-virtual {v1}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    move-result-object v0

    .line 907
    invoke-virtual {v1}, Ll/ۗ۟ܺ;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 790
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr p1, v0

    .line 791
    iget v0, p2, Ll/ۢ۟ܺ;->֫:I

    add-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴ۟ܺ;)V
    .locals 0

    .line 749
    invoke-virtual {p1, p0}, Ll/ᩴ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method

.method public final ֫(Ll/ᩴۧۖ;)V
    .locals 2

    .line 796
    iget-object v0, p0, Ll/ۡ۟ܺ;->۬:Ljava/lang/String;

    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ll/ܰۤܺ;
    .locals 2

    .line 782
    iget-object v0, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    invoke-interface {v0}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 292
    invoke-static {v0, v0}, Ll/ܰۤܺ;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v0

    .line 782
    invoke-static {}, Ll/ۘ۟ܺ;->ۜ()Ll/᩵ۗܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 4

    .line 754
    iget-object v0, p0, Ll/ۡ۟ܺ;->۫:Ll/ܶ۟ܺ;

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    sget v2, Ll/۬۟ܺ;->֫:I

    .line 112
    new-instance v2, Ll/ۗ۟ܺ;

    invoke-direct {v2, v1}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v2}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    .line 42
    invoke-virtual {v2}, Ll/ۗ۟ܺ;->hasNext()Z

    move-result v1

    const/4 v3, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ll/ۗ۟ܺ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 756
    :goto_0
    invoke-interface {v0}, Ll/ܶ۟ܺ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_3

    if-lez v1, :cond_1

    return v1

    .line 759
    :cond_1
    invoke-interface {v0}, Ll/ܶ۟ܺ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "// "

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 761
    invoke-interface {v0}, Ll/ܶ۟ܺ;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 763
    :cond_2
    invoke-static {v0}, Ll/֫۟ܺ;->֫(Ll/ܶ۟ܺ;)Ll/ܽ۫ᩴ;

    move-result-object v1

    new-instance v2, Ll/۬ܺܳ;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ll/۬ܺܳ;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/ܽ۫ᩴ;->map(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-interface {v0}, Ll/ܶ۟ܺ;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_3
    if-eq v1, v3, :cond_4

    const/16 v0, 0x3e8

    return v0

    .line 766
    :cond_4
    invoke-interface {v0}, Ll/ܶ۟ܺ;->length()I

    move-result v0

    return v0
.end method
