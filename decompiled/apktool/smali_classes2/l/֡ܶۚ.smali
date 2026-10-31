.class public abstract Ll/֡ܶۚ;
.super Ljava/lang/Object;
.source "4BJL"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:Ll/֫֨ۚ;

.field public ۡ:Ll/᩵֨ۚ;

.field public ۢ:Ll/ۢ֨ۚ;

.field public ۧ:Ll/ۖ֨ۚ;

.field public ܳ:Ll/ᩳۚۚ;

.field public ܺ:Z

.field public ܽ:Ll/֨֡ۚ;

.field public ܿ:Ll/ۧ֨ۚ;

.field public ᩳ:Ll/᩷֨ۚ;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ll/ۢ֨ۚ;

    invoke-direct {v0}, Ll/ۢ֨ۚ;-><init>()V

    iput-object v0, p0, Ll/֡ܶۚ;->ۢ:Ll/ۢ֨ۚ;

    .line 33
    new-instance v0, Ll/᩷֨ۚ;

    invoke-direct {v0}, Ll/᩷֨ۚ;-><init>()V

    iput-object v0, p0, Ll/֡ܶۚ;->ᩳ:Ll/᩷֨ۚ;

    return-void
.end method

.method private ֫(Ll/ۨ֡ۚ;Ll/ۖ֨ۚ;Z)V
    .locals 4

    .line 203
    iget-boolean v0, p0, Ll/֡ܶۚ;->ܺ:Z

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 204
    invoke-virtual {p2}, Ll/ۖ֨ۚ;->ۜ()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    new-instance v1, Ll/۟֡ۚ;

    iget-object v2, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {v2, v0}, Ll/ᩳۚۚ;->ۧ(I)I

    move-result v2

    iget-object v3, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {v3, v0}, Ll/ᩳۚۚ;->֫(I)I

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/۟֡ۚ;-><init>(III)V

    .line 208
    invoke-virtual {p2}, Ll/ۖ֨ۚ;->֫()I

    move-result p2

    .line 209
    new-instance v0, Ll/۟֡ۚ;

    iget-object v2, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {v2, p2}, Ll/ᩳۚۚ;->ۧ(I)I

    move-result v2

    iget-object v3, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {v3, p2}, Ll/ᩳۚۚ;->֫(I)I

    move-result v3

    invoke-direct {v0, p2, v2, v3}, Ll/۟֡ۚ;-><init>(III)V

    .line 210
    new-instance p2, Ll/֫ۚۚ;

    invoke-direct {p2, v1, v0}, Ll/֫ۚۚ;-><init>(Ll/۟֡ۚ;Ll/۟֡ۚ;)V

    .line 211
    invoke-virtual {p2, p1, p3}, Ll/֫ۚۚ;->֫(Ll/ۨ֡ۚ;Z)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/String;Ll/᩶֡ۚ;Ljava/lang/String;Ll/ۧ֨ۚ;)Ljava/util/List;
.end method

.method public final ֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;
    .locals 1

    .line 174
    iget-object v0, p0, Ll/֡ܶۚ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ֨ۚ;

    if-nez v0, :cond_0

    .line 176
    invoke-static {p1, p2}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object p2

    .line 177
    iget-object v0, p0, Ll/֡ܶۚ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_0
    return-object v0
.end method

.method public final ֫()Ll/᩶֡ۚ;
    .locals 2

    .line 130
    iget-object v0, p0, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 131
    iget-object v1, p0, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/֡ܶۚ;->ܽ:Ll/֨֡ۚ;

    return-object v0
.end method

.method public ֫(Ljava/io/StringReader;Ljava/lang/String;Ll/ۧ֨ۚ;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 44
    new-instance v0, Ll/֨֡ۚ;

    invoke-direct {v0, p2}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/֡ܶۚ;->ܽ:Ll/֨֡ۚ;

    .line 45
    invoke-virtual {v0, p3}, Ll/֨֡ۚ;->֫(Ll/ۧ֨ۚ;)V

    .line 46
    iput-object p3, p0, Ll/֡ܶۚ;->ܿ:Ll/ۧ֨ۚ;

    .line 47
    invoke-virtual {p3}, Ll/ۧ֨ۚ;->ܿ()Ll/֫֨ۚ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܶۚ;->ۜ:Ll/֫֨ۚ;

    .line 48
    new-instance v0, Ll/ᩳۚۚ;

    const v1, 0x8000

    .line 47
    invoke-direct {v0, p1, v1}, Ll/ᩳۚۚ;-><init>(Ljava/io/StringReader;I)V

    .line 48
    iput-object v0, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    .line 49
    invoke-virtual {p3}, Ll/ۧ֨ۚ;->ܽ()Z

    move-result p1

    iput-boolean p1, p0, Ll/֡ܶۚ;->ܺ:Z

    .line 50
    iget-object p1, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {p3}, Ll/ۧ֨ۚ;->ۧ()Z

    iget-boolean v0, p0, Ll/֡ܶۚ;->ܺ:Z

    invoke-virtual {p1, v0}, Ll/ᩳۚۚ;->ۧ(Z)V

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 52
    new-instance p1, Ll/᩵֨ۚ;

    iget-object v0, p0, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {p3}, Ll/ۧ֨ۚ;->֫()Ll/۟ۚۚ;

    move-result-object p3

    invoke-direct {p1, v0, p3}, Ll/᩵֨ۚ;-><init>(Ll/ᩳۚۚ;Ll/۟ۚۚ;)V

    iput-object p1, p0, Ll/֡ܶۚ;->ۡ:Ll/᩵֨ۚ;

    .line 53
    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0x20

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    .line 54
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/֡ܶۚ;->᩻:Ljava/util/HashMap;

    .line 55
    iput-object p2, p0, Ll/֡ܶۚ;->֫:Ljava/lang/String;

    return-void

    .line 31
    :cond_0
    new-instance p1, Ll/ܳ֡ۚ;

    const-string p2, "The parameter \'baseUri\' must not be null."

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1
.end method

.method public final ֫(Ll/ۨ֡ۚ;Ll/ۖ֨ۚ;)V
    .locals 1

    const/4 v0, 0x1

    .line 189
    invoke-direct {p0, p1, p2, v0}, Ll/֡ܶۚ;->֫(Ll/ۨ֡ۚ;Ll/ۖ֨ۚ;Z)V

    return-void
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/ۖ֨ۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 199
    invoke-direct {p0, p1, p2, v0}, Ll/֡ܶۚ;->֫(Ll/ۨ֡ۚ;Ll/ۖ֨ۚ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 140
    iget-object v0, p0, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {p0}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {v0}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ֫(Ll/ۖ֨ۚ;)Z
.end method

.method public ֫(Ll/ܺ֡ۚ;)Z
    .locals 3

    .line 108
    iget-object v0, p0, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    const-string v1, "input"

    iget-object v2, p0, Ll/֡ܶۚ;->ۢ:Ll/ۢ֨ۚ;

    if-ne v0, v2, :cond_0

    .line 109
    new-instance v0, Ll/ۢ֨ۚ;

    invoke-direct {v0}, Ll/ۢ֨ۚ;-><init>()V

    .line 306
    iput-object v1, v0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    .line 307
    iput-object p1, v0, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    .line 85
    invoke-static {v1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 308
    iput-object p1, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 109
    invoke-virtual {p0, v0}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 111
    :cond_0
    invoke-virtual {v2}, Ll/ۢ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    .line 306
    iput-object v1, v2, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    .line 307
    iput-object p1, v2, Ll/ۡ֨ۚ;->ۜ:Ll/ܺ֡ۚ;

    .line 85
    invoke-static {v1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 308
    iput-object p1, v2, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 113
    invoke-virtual {p0, v2}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method

.method public abstract ۧ()Ll/֫֨ۚ;
.end method

.method public ۧ(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()V
    .locals 3

    .line 82
    iget-object v0, p0, Ll/֡ܶۚ;->ۡ:Ll/᩵֨ۚ;

    .line 83
    sget-object v1, Ll/ܺ֨ۚ;->ۗ:Ll/ܺ֨ۚ;

    .line 86
    :cond_0
    invoke-virtual {v0}, Ll/᩵֨ۚ;->ۜ()Ll/ۖ֨ۚ;

    move-result-object v2

    .line 87
    invoke-virtual {p0, v2}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    .line 88
    invoke-virtual {v2}, Ll/ۖ֨ۚ;->᩻()V

    .line 90
    iget-object v2, v2, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    if-ne v2, v1, :cond_0

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 2

    .line 117
    iget-object v0, p0, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    iget-object v1, p0, Ll/֡ܶۚ;->ᩳ:Ll/᩷֨ۚ;

    if-ne v0, v1, :cond_0

    .line 118
    new-instance v0, Ll/᩷֨ۚ;

    invoke-direct {v0}, Ll/᩷֨ۚ;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۡ֨ۚ;->ᩳ(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 120
    :cond_0
    invoke-virtual {v1}, Ll/ۡ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    invoke-virtual {v1, p1}, Ll/ۡ֨ۚ;->ᩳ(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 2

    .line 100
    iget-object v0, p0, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    iget-object v1, p0, Ll/֡ܶۚ;->ۢ:Ll/ۢ֨ۚ;

    if-ne v0, v1, :cond_0

    .line 101
    new-instance v0, Ll/ۢ֨ۚ;

    invoke-direct {v0}, Ll/ۢ֨ۚ;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۡ֨ۚ;->ᩳ(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    return-void

    .line 103
    :cond_0
    invoke-virtual {v1}, Ll/ۢ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    invoke-virtual {v1, p1}, Ll/ۡ֨ۚ;->ᩳ(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    return-void
.end method
