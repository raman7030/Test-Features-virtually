.class public final Ll/ۙܿۚ;
.super Ll/ۡ۬֡;
.source "N98Q"


# instance fields
.field public ᩸:Ll/ۘܽۚ;

.field public final synthetic ᩹:Ll/ۗܿۚ;


# direct methods
.method public constructor <init>(Ll/ۗܿۚ;Ll/ۘܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Ll/ۙܿۚ;->᩹:Ll/ۗܿۚ;

    .line 65
    iput-object p2, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    invoke-interface {v0}, Ll/ۘܽۚ;->getIndex()I

    move-result v0

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    invoke-interface {v0}, Ll/ۘܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/util/List;
    .locals 2

    .line 103
    iget-object v0, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    invoke-interface {v0}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/᩶ܿۚ;

    invoke-direct {v1, p0}, Ll/᩶ܿۚ;-><init>(Ll/ۙܿۚ;)V

    invoke-static {v0, v1}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/֡ܽۚ;
    .locals 3

    .line 95
    iget-object v0, p0, Ll/ۙܿۚ;->᩹:Ll/ۗܿۚ;

    iget-object v0, v0, Ll/ۗܿۚ;->֫:Ll/ܽܳۚ;

    .line 96
    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    .line 97
    invoke-interface {v1}, Ll/ۘܽۚ;->ۧ()Ll/֡ܽۚ;

    move-result-object v1

    .line 208
    new-instance v2, Ll/֨᩻ۚ;

    invoke-direct {v2, v0, v1}, Ll/֨᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ll/֡ܽۚ;)V

    return-object v2
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    invoke-interface {v0}, Ll/ۘܽۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/᩵ܽۚ;
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ۙܿۚ;->᩹:Ll/ۗܿۚ;

    iget-object v0, v0, Ll/ۗܿۚ;->֫:Ll/ܽܳۚ;

    iget-object v1, p0, Ll/ۙܿۚ;->᩸:Ll/ۘܽۚ;

    .line 83
    invoke-interface {v1}, Ll/ۘܽۚ;->᩷()Ll/᩵ܽۚ;

    move-result-object v1

    .line 82
    invoke-static {v1, v0}, Ll/᩸᩻ۚ;->֫(Ll/᩵ܽۚ;Ll/ܽܳۚ;)Ll/ۖ۬֡;

    move-result-object v0

    return-object v0
.end method
