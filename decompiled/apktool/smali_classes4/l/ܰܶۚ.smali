.class public final Ll/ܰܶۚ;
.super Ll/۟ܶۚ;
.source "8BJP"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ll/۟ܶۚ;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 104
    iget-object v0, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    const-string v1, ", "

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 94
    :goto_0
    iget v2, p0, Ll/۟ܶۚ;->ۧ:I

    if-ge v1, v2, :cond_1

    .line 95
    iget-object v2, p0, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩹ۚ;

    .line 96
    invoke-virtual {v2, p1, p2}, Ll/᩷᩹ۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
