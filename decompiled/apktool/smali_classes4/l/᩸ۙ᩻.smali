.class public abstract Ll/᩸ۙ᩻;
.super Ljava/lang/Object;
.source "R5YB"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ܽۢܳ;

.field public ᩳ:Ll/ۧۗ᩻;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ll/ۧۗ᩻;Ljava/util/ArrayList;ZLjava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/᩸ۙ᩻;->ܿ:Ll/ܽۢܳ;

    .line 41
    iput-object p2, p0, Ll/᩸ۙ᩻;->ᩳ:Ll/ۧۗ᩻;

    .line 42
    iput-object p3, p0, Ll/᩸ۙ᩻;->ۧ:Ljava/util/ArrayList;

    .line 43
    iput-boolean p4, p0, Ll/᩸ۙ᩻;->֫:Z

    .line 44
    iput-object p5, p0, Ll/᩸ۙ᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۙ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸ۙ᩻;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ۙ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙ᩻;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸ۙ᩻;)Ll/ۧۗ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙ᩻;->ᩳ:Ll/ۧۗ᩻;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩸ۙ᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙ᩻;->ܿ:Ll/ܽۢܳ;

    return-object p0
.end method


# virtual methods
.method public abstract ֫()V
.end method

.method public final ۧ()V
    .locals 5

    .line 52
    iget-object v0, p0, Ll/᩸ۙ᩻;->ᩳ:Ll/ۧۗ᩻;

    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v3

    iget-object v4, p0, Ll/᩸ۙ᩻;->ܿ:Ll/ܽۢܳ;

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v1

    if-nez v1, :cond_1

    .line 55
    invoke-virtual {v4}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    const v0, 0x7f120b8d

    invoke-static {v0, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 58
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/᩸ۙ᩻;->֫:Z

    if-eqz v0, :cond_2

    .line 59
    invoke-virtual {v4}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    new-instance v1, Ll/ۚۙ᩻;

    invoke-direct {v1, p0}, Ll/ۚۙ᩻;-><init>(Ll/᩸ۙ᩻;)V

    iget-object v2, p0, Ll/᩸ۙ᩻;->ܽ:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 82
    :cond_2
    new-instance v0, Ll/ܶۙ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v2}, Ll/ܶۙ᩻;-><init>(Ll/᩸ۙ᩻;Ll/ۨۧᩳ;Z)V

    .line 288
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
