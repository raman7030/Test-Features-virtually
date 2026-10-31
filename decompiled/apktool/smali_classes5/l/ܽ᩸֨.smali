.class public final Ll/ܽ᩸֨;
.super Ll/ۘ᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ۙ:Ll/ۛ᩸֨;

.field public ᩶:Ljava/util/HashSet;

.field public ᩸:Ljava/util/HashMap;

.field public ᩹:Ll/ܿ᩵֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3009
    iput-object p1, p0, Ll/ܽ᩸֨;->ۙ:Ll/ۛ᩸֨;

    .line 3011
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܽ᩸֨;->᩸:Ljava/util/HashMap;

    .line 3013
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ܽ᩸֨;->᩶:Ljava/util/HashSet;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽ᩸֨;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ᩸֨;->᩸:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 3009
    check-cast p1, Ljava/lang/Void;

    .line 3049
    iget-object p1, p0, Ll/ܽ᩸֨;->᩹:Ll/ܿ᩵֨;

    if-nez p1, :cond_0

    .line 3050
    new-instance p1, Ll/ܿ᩵֨;

    iget-object p2, p0, Ll/ܽ᩸֨;->ۙ:Ll/ۛ᩸֨;

    iget-object p2, p2, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p2, p2, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    invoke-direct {p1, p2}, Ll/ܿ᩵֨;-><init>(Ll/ۛ֡֨;)V

    iput-object p1, p0, Ll/ܽ᩸֨;->᩹:Ll/ܿ᩵֨;

    .line 3052
    :cond_0
    iget-object p1, p0, Ll/ܽ᩸֨;->᩹:Ll/ܿ᩵֨;

    return-object p1
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3009
    check-cast p2, Ljava/lang/Void;

    .line 3085
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    const/4 p2, 0x0

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 3085
    check-cast p1, Ll/ܿ᩵֨;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 3009
    check-cast p2, Ljava/lang/Void;

    .line 3057
    iget-object p2, p0, Ll/ܽ᩸֨;->ۙ:Ll/ۛ᩸֨;

    iget-object v0, p0, Ll/ܽ᩸֨;->᩸:Ljava/util/HashMap;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v2, p0, Ll/ܽ᩸֨;->᩶:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3061
    new-instance p2, Ll/ܿ᩵֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {p2, p1}, Ll/ܿ᩵֨;-><init>(Ll/ۛ֡֨;)V

    return-object p2

    .line 3064
    :cond_0
    :try_start_0
    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 3065
    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast v1, Ll/ܳ֡֨;

    .line 3066
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ᩵֨;

    if-nez v3, :cond_2

    .line 3068
    new-instance v3, Ll/ܿ᩵֨;

    invoke-direct {v3, v1}, Ll/ܿ᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 3069
    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {v5, p0, v6}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 3070
    check-cast v5, Ll/۟᩵֨;

    invoke-virtual {v3, v5}, Ll/ܿ᩵֨;->ۧ(Ll/۟᩵֨;)V

    goto :goto_0

    .line 3072
    :cond_1
    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 4900
    invoke-virtual {p2, p0, v6}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 3072
    check-cast p2, Ll/۟᩵֨;

    invoke-virtual {v3, p2}, Ll/ܿ᩵֨;->ۧ(Ll/۟᩵֨;)V

    .line 1336
    invoke-virtual {v1}, Ll/ܳ֡֨;->᩶()V

    .line 1337
    iget-object p2, v1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 3073
    invoke-virtual {v3, p2}, Ll/ܿ᩵֨;->ۧ(Ll/۟᩵֨;)V

    .line 3074
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3079
    :cond_2
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v3

    :catchall_0
    move-exception p2

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 3080
    throw p2
.end method
