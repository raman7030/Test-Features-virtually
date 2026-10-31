.class public final Ll/ۧ᩻ۚ;
.super Ll/ᩴ۬֡;
.source "22S9"

# interfaces
.implements Ll/ᩴ֫ۚ;


# instance fields
.field public ᩸:Ll/ᩴ֫ۚ;

.field public final synthetic ᩹:Ll/ܽ᩻ۚ;


# direct methods
.method public constructor <init>(Ll/ܽ᩻ۚ;Ll/ᩴ֫ۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    .line 66
    iput-object p2, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 3

    .line 111
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۧ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v1

    .line 78
    new-instance v2, Ll/ۡ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ۡ᩻ۚ;-><init>(Ljava/util/Set;Ll/ᩳ᩻ۚ;)V

    return-object v2
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 78
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 3

    .line 94
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ܺ()Ll/᩺ܳۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v1

    .line 110
    new-instance v2, Ll/ܺ᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v2
.end method

.method public final ۘ()Ljava/util/List;
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܽۚ;

    invoke-interface {v0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ljava/util/Set;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    invoke-interface {v0}, Ll/ᩴ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷ۧ()Ll/᩵֫ۚ;
    .locals 2

    .line 123
    iget-object v0, p0, Ll/ۧ᩻ۚ;->᩹:Ll/ܽ᩻ۚ;

    iget-object v0, v0, Ll/ܽ᩻ۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۡ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۚ;->᩸:Ll/ᩴ֫ۚ;

    .line 124
    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v1

    .line 123
    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫ۚ;

    return-object v0
.end method
