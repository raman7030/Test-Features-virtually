.class public final Ll/֨֡ۚ;
.super Ll/᩶֡ۚ;
.source "O1HV"


# instance fields
.field public ۟:Ll/ۚ֡ۚ;

.field public ܰ:Ll/ۧ֨ۚ;

.field public ᩺:Ll/֡֡ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 155
    new-instance v0, Ll/᩻᩹ۚ;

    const-string v1, "title"

    invoke-direct {v0, v1}, Ll/᩻᩹ۚ;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "#root"

    .line 39
    sget-object v1, Ll/֫֨ۚ;->ܽ:Ll/֫֨ۚ;

    invoke-static {v0, v1}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object v0

    const/4 v1, 0x0

    .line 87
    invoke-direct {p0, v0, p1, v1}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 26
    new-instance p1, Ll/֡֡ۚ;

    invoke-direct {p1}, Ll/֡֡ۚ;-><init>()V

    iput-object p1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    .line 28
    sget-object p1, Ll/ۚ֡ۚ;->᩶:Ll/ۚ֡ۚ;

    iput-object p1, p0, Ll/֨֡ۚ;->۟:Ll/ۚ֡ۚ;

    .line 250
    new-instance p1, Ll/ۧ֨ۚ;

    new-instance v0, Ll/ܿۚۚ;

    invoke-direct {v0}, Ll/ܿۚۚ;-><init>()V

    invoke-direct {p1, v0}, Ll/ۧ֨ۚ;-><init>(Ll/֡ܶۚ;)V

    .line 41
    iput-object p1, p0, Ll/֨֡ۚ;->ܰ:Ll/ۧ֨ۚ;

    return-void
.end method

.method public static ۖ(Ljava/lang/String;)Ll/֨֡ۚ;
    .locals 2

    .line 52
    new-instance v0, Ll/֨֡ۚ;

    invoke-direct {v0, p0}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    .line 656
    iget-object p0, v0, Ll/֨֡ۚ;->ܰ:Ll/ۧ֨ۚ;

    .line 53
    iput-object p0, v0, Ll/֨֡ۚ;->ܰ:Ll/ۧ֨ۚ;

    const-string p0, "html"

    .line 54
    invoke-virtual {v0, p0}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    move-result-object p0

    const-string v1, "head"

    .line 55
    invoke-virtual {p0, v1}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    const-string v1, "body"

    .line 56
    invoke-virtual {p0, v1}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 337
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/֨֡ۚ;

    .line 338
    iget-object v1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    invoke-virtual {v1}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۚ;
    .locals 2

    .line 337
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/֨֡ۚ;

    .line 338
    iget-object v1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    invoke-virtual {v1}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/᩶֡ۚ;
    .locals 2

    .line 337
    invoke-super {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    check-cast v0, Ll/֨֡ۚ;

    .line 338
    iget-object v1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    invoke-virtual {v1}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-object v0
.end method

.method public final ֡֫()Ll/֡֡ۚ;
    .locals 1

    .line 624
    iget-object v0, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-object v0
.end method

.method public final ֫(Ll/ۚ֡ۚ;)V
    .locals 0

    .line 647
    iput-object p1, p0, Ll/֨֡ۚ;->۟:Ll/ۚ֡ۚ;

    return-void
.end method

.method public final ֫(Ll/ۧ֨ۚ;)V
    .locals 0

    .line 666
    iput-object p1, p0, Ll/֨֡ۚ;->ܰ:Ll/ۧ֨ۚ;

    return-void
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 245
    invoke-virtual {p0}, Ll/᩶֡ۚ;->ܰ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ֫()Ll/ۧ֨ۚ;
    .locals 1

    .line 656
    iget-object v0, p0, Ll/֨֡ۚ;->ܰ:Ll/ۧ֨ۚ;

    return-object v0
.end method

.method public final ۧ(Ll/֡֡ۚ;)V
    .locals 0

    .line 634
    iput-object p1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-void
.end method

.method public final ۬֫()Ll/֨֡ۚ;
    .locals 2

    .line 344
    new-instance v0, Ll/֨֡ۚ;

    invoke-virtual {p0}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    .line 345
    iget-object v1, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz v1, :cond_0

    .line 346
    invoke-virtual {v1}, Ll/ܺ֡ۚ;->clone()Ll/ܺ֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    .line 347
    :cond_0
    iget-object v1, p0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    invoke-virtual {v1}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/֨֡ۚ;->᩺:Ll/֡֡ۚ;

    return-object v0
.end method

.method public final ܶ֫()Ll/ۚ֡ۚ;
    .locals 1

    .line 643
    iget-object v0, p0, Ll/֨֡ۚ;->۟:Ll/ۚ֡ۚ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "#document"

    return-object v0
.end method

.method public final ܺ(Ljava/lang/String;)V
    .locals 1

    .line 255
    invoke-virtual {p0}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩶֡ۚ;->ܺ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩴ֫()Ll/᩶֡ۚ;
    .locals 5

    .line 104
    invoke-virtual {p0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "html"

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶֡ۚ;

    .line 105
    invoke-virtual {v1}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {p0, v2}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    move-result-object v1

    .line 139
    :goto_0
    invoke-virtual {v1}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "body"

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 140
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "frameset"

    invoke-virtual {v2}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_3
    return-object v2

    .line 143
    :cond_4
    invoke-virtual {v1, v3}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    move-result-object v0

    return-object v0
.end method
