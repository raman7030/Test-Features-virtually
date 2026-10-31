.class public final Ll/ܺۜ۠;
.super Ljava/lang/Object;
.source "Z5U8"

# interfaces
.implements Ll/۠᩹֨;


# instance fields
.field public ֫:Ll/ܳ֡֨;

.field public ۧ:Ll/ۖۜ۠;

.field public ܽ:Ll/ۖۜ۠;

.field public final synthetic ᩳ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ܳ֡֨;Ll/ۖۜ۠;Ll/ۖۜ۠;)V
    .locals 0

    .line 2858
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۜ۠;->ᩳ:Ll/᩶ۜ۠;

    .line 2859
    iput-object p2, p0, Ll/ܺۜ۠;->֫:Ll/ܳ֡֨;

    .line 2860
    iput-object p3, p0, Ll/ܺۜ۠;->ܽ:Ll/ۖۜ۠;

    .line 2861
    iput-object p4, p0, Ll/ܺۜ۠;->ۧ:Ll/ۖۜ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ֡֨;)V
    .locals 5

    .line 2866
    iget-object v0, p0, Ll/ܺۜ۠;->ᩳ:Ll/᩶ۜ۠;

    iget-object v1, p0, Ll/ܺۜ۠;->֫:Ll/ܳ֡֨;

    if-ne v1, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 2871
    :try_start_0
    iget-object v2, p0, Ll/ܺۜ۠;->ܽ:Ll/ۖۜ۠;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 2872
    new-instance v4, Ll/ܳۜ۠;

    invoke-direct {v4, v0, v1}, Ll/ܳۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ܳ֡֨;)V

    .line 2873
    invoke-virtual {v4, v2}, Ll/ܳۜ۠;->ۧ(Ll/ۖۜ۠;)Ll/ܽۘ֨;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    .line 2876
    :goto_1
    iget-object v4, p0, Ll/ܺۜ۠;->ۧ:Ll/ۖۜ۠;

    if-eqz v4, :cond_2

    .line 2877
    new-instance v3, Ll/ܳۜ۠;

    invoke-direct {v3, v0, v1}, Ll/ܳۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ܳ֡֨;)V

    .line 2878
    invoke-virtual {v3, v4}, Ll/ܳۜ۠;->ۧ(Ll/ۖۜ۠;)Ll/ܽۘ֨;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2886
    :cond_2
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩹֫()Ll/᩸᩹֨;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/᩸᩹֨;->ۧ(Ll/ܽۘ֨;)V

    .line 2887
    invoke-virtual {p1}, Ll/ܳ֡֨;->᩹֫()Ll/᩸᩹֨;

    move-result-object p1

    invoke-virtual {p1, v3}, Ll/᩸᩹֨;->֫(Ll/ܽۘ֨;)V

    return-void

    :catch_0
    move-exception v1

    .line 2881
    new-instance v2, Ll/᩷֡֨;

    new-instance v3, Ll/ۡۜ۠;

    invoke-direct {v3, p0, v1}, Ll/ۡۜ۠;-><init>(Ll/ܺۜ۠;Ljava/lang/Exception;)V

    iget-object v0, v0, Ll/᩶ۜ۠;->ۡ:Ll/֫ᩴ֨;

    invoke-direct {v2, p1, v3, v0}, Ll/᩷֡֨;-><init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V

    throw v2
.end method
