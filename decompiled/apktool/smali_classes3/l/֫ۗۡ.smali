.class public final Ll/֫ۗۡ;
.super Ll/֨۬֡;
.source "51V0"


# instance fields
.field public final ᩶:Ll/᩹ܽۚ;

.field public final ᩸:Ll/ۖۗۡ;

.field public final ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩹ܽۚ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p2, p0, Ll/֫ۗۡ;->᩹:Ll/ܽܳۚ;

    .line 172
    iput-object p3, p0, Ll/֫ۗۡ;->᩶:Ll/᩹ܽۚ;

    .line 173
    invoke-static {p1}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object p1

    invoke-interface {p3}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۗۡ;->᩸:Ll/ۖۗۡ;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 5

    .line 185
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֫ۗۡ;->᩹:Ll/ܽܳۚ;

    .line 186
    invoke-virtual {v1}, Ll/ܽܳۚ;->֫()Ll/ᩳ᩻ۚ;

    move-result-object v1

    iget-object v2, p0, Ll/֫ۗۡ;->᩶:Ll/᩹ܽۚ;

    .line 187
    invoke-interface {v2}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object v2

    .line 186
    invoke-static {v2, v1}, Ll/᩸᩻ۚ;->֫(Ljava/util/Set;Ll/ᩳ᩻ۚ;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    .line 188
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 189
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ֫ۚ;

    .line 190
    iget-object v3, p0, Ll/֫ۗۡ;->᩸:Ll/ۖۗۡ;

    invoke-interface {v2}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۖۗۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 192
    invoke-interface {v2}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v2

    .line 193
    new-instance v4, Ll/۟ۙۡ;

    invoke-direct {v4, v3, v2}, Ll/۟ۙۡ;-><init>(Ljava/lang/String;Ll/ۤܽۚ;)V

    .line 206
    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 210
    :cond_1
    invoke-static {v0}, Ll/ۢۗۡ;->֫(Ljava/util/ArrayList;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 179
    iget-object v0, p0, Ll/֫ۗۡ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۗۡ;->᩶:Ll/᩹ܽۚ;

    invoke-interface {v1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
