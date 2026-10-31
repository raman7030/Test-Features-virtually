.class public final Ll/᩺ܶۚ;
.super Ll/۟ܶۚ;
.source "8BJP"


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ll/۟ܶۚ;-><init>()V

    .line 25
    iget-object v0, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    iget-object p1, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/۟ܶۚ;->ۧ:I

    return-void
.end method

.method public varargs constructor <init>([Ll/᩷᩹ۚ;)V
    .locals 0

    .line 48
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩺ܶۚ;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 63
    iget-object v0, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    const-string v1, ""

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 3

    .line 53
    iget v0, p0, Ll/۟ܶۚ;->ۧ:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 54
    iget-object v2, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩹ۚ;

    .line 55
    invoke-virtual {v2, p1, p2}, Ll/᩷᩹ۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method
