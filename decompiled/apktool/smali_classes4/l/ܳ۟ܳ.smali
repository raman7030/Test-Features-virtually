.class public final Ll/ܳ۟ܳ;
.super Ll/֫ۜܳ;
.source "V7BK"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۤ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x1040003

    const v1, 0x7f0801e5

    .line 33
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܳ۟ܳ;->ۗ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 23
    check-cast p1, Ll/ܽۢܳ;

    const-string v0, "local"

    .line 65
    invoke-virtual {p1, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ll/ܽۢܳ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 68
    :cond_0
    invoke-virtual {p1}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ۟ܳ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p1, 0x7f120aaa

    .line 69
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 70
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 72
    :cond_1
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 73
    iget-object v2, p0, Ll/ܳ۟ܳ;->ۗ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 74
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 75
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f120617

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-virtual {p1, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    .line 76
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 81
    :cond_3
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ܿ۟ܳ;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 81
    iget-object v1, p0, Ll/ܳ۟ܳ;->ۗ:Ljava/util/List;

    .line 82
    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 83
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->֫(Ll/ܽۢܳ;)V

    const-string v1, "ARG_MSG_FROM"

    iget-object v2, p0, Ll/ܳ۟ܳ;->۬:Ljava/lang/String;

    .line 84
    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ARG_MSG_TO"

    .line 85
    invoke-virtual {p1}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sourcePath"

    iget-object v2, p0, Ll/ܳ۟ܳ;->۫:Ljava/lang/String;

    .line 86
    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "targetPath"

    .line 87
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    .line 89
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 66
    :cond_4
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 1

    const-string v0, "local"

    .line 49
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ۟ܳ;->ۗ:Ljava/util/List;

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ۟ܳ;->ۤ:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Ll/ۖۢܳ;->᩷()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ۟ܳ;->۫:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ۟ܳ;->۬:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    const v0, 0x7f120929

    invoke-virtual {p1, v0, p0}, Ll/ܽۢܳ;->֫(ILjava/util/function/Function;)V

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Search results do not support single-window move."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 41
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
