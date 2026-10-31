.class public final Ll/ܿ۠֨;
.super Ljava/lang/Object;
.source "K7QZ"


# static fields
.field public static final ܿ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/۬᩹֨;

.field public final ۧ:Ll/ۢۗ֨;

.field public final ܽ:Ll/᩹ܶ۠;

.field public final ᩳ:Ll/ۛܶ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 90
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ܿ۠֨;->ܿ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    sget-object v0, Ll/ܿ۠֨;->ܿ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 107
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ۠֨;->ᩳ:Ll/ۛܶ۠;

    .line 108
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ۠֨;->ܽ:Ll/᩹ܶ۠;

    .line 109
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    .line 110
    invoke-static {p1}, Ll/۬᩹֨;->֫(Ll/ۗ֨۠;)Ll/۬᩹֨;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ۠֨;->֫:Ll/۬᩹֨;

    .line 111
    invoke-static {p1}, Ll/ۢۗ֨;->֫(Ll/ۗ֨۠;)Ll/ۢۗ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۠֨;->ۧ:Ll/ۢۗ֨;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ܿ۠֨;
    .locals 1

    .line 93
    sget-object v0, Ll/ܿ۠֨;->ܿ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۠֨;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Ll/ܿ۠֨;

    invoke-direct {v0, p0}, Ll/ܿ۠֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܽۘ֨;Ll/ۛ֡֨;)Ll/֫۠֨;
    .locals 1

    .line 176
    iget-object v0, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/᩶֡֨;->᩶֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    sget-object p1, Ll/֫۠֨;->ۙ:Ll/֫۠֨;

    return-object p1

    .line 179
    :cond_0
    iget-object p1, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0, p1}, Ll/ܿ۠֨;->֫(Ll/᩶֡֨;)Ll/ۖܶ۠;

    move-result-object p1

    if-nez p1, :cond_1

    .line 181
    sget-object p1, Ll/֫۠֨;->᩶:Ll/֫۠֨;

    return-object p1

    .line 182
    :cond_1
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۛ֨֨;

    invoke-direct {v0, p0, p2}, Ll/ۛ֨֨;-><init>(Ll/ܿ۠֨;Ll/ۛ֡֨;)V

    .line 183
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    sget-object p2, Ll/֫۠֨;->ۙ:Ll/֫۠֨;

    new-instance v0, Ll/ۨ֨֨;

    invoke-direct {v0, p0}, Ll/ۨ֨֨;-><init>(Ll/ܿ۠֨;)V

    .line 184
    invoke-interface {p1, p2, v0}, Ll/ܿ᩺ᩴ;->reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫۠֨;

    return-object p1
.end method

.method public final ֫(Ll/᩶֡֨;)Ll/ۖܶ۠;
    .locals 3

    .line 153
    invoke-virtual {p1}, Ll/᩶֡֨;->᩹֫()Ll/᩸᩹֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩹֨;->ᩳ()Ll/ܽۘ֨;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Ll/ܿ۠֨;->ᩳ:Ll/ۛܶ۠;

    iget-object v0, v0, Ll/ۛܶ۠;->ܶܽ:Ll/ۤܶ۠;

    invoke-virtual {p1, v0}, Ll/ܽۘ֨;->֫(Ll/ۤܶ۠;)Ll/ۡۘ֨;

    move-result-object p1

    .line 159
    instance-of v0, p1, Ll/֫ۘ֨;

    if-eqz v0, :cond_2

    check-cast p1, Ll/֫ۘ֨;

    .line 343
    iget-object p1, p1, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    invoke-static {p1}, Ll/ۖܶ۠;->֫([Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    .line 164
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩸᩶֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩸᩶֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/ۚ᩵۠;)V
    .locals 1

    .line 121
    new-instance v0, Ll/ܰ֨֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ܰ֨֨;-><init>(Ll/ܿ۠֨;Ll/֫ۤ֨;Ll/ۚ᩵۠;)V

    iget-object p1, p0, Ll/ܿ۠֨;->֫:Ll/۬᩹֨;

    invoke-virtual {p1, v0}, Ll/۬᩹֨;->֫(Ll/ܰ֨֨;)V

    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 2

    .line 147
    new-instance v0, Ll/ᩳ۠֨;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ᩳ۠֨;-><init>(Ll/ܿ۠֨;Z)V

    invoke-virtual {v0, p1}, Ll/ᩳ۠֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ۧ(Ll/֫ۤ֨;Ll/ۚ᩵۠;)V
    .locals 1

    .line 132
    new-instance v0, Ll/᩺֨֨;

    invoke-direct {v0, p0, p1, p2}, Ll/᩺֨֨;-><init>(Ll/ܿ۠֨;Ll/֫ۤ֨;Ll/ۚ᩵۠;)V

    iget-object p1, p0, Ll/ܿ۠֨;->֫:Ll/۬᩹֨;

    invoke-virtual {p1, v0}, Ll/۬᩹֨;->ۧ(Ljava/lang/Runnable;)V

    return-void
.end method
