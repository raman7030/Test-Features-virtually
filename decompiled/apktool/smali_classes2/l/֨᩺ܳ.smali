.class public final Ll/֨᩺ܳ;
.super Ll/֫ۜܳ;
.source "K7BU"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205c2

    const v1, 0x7f0801e3

    .line 31
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֨᩺ܳ;->ۗ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/util/List;Ll/ܽۢܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/֨۠ۢ;
    .locals 2

    .line 90
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ۚ᩺ܳ;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 91
    invoke-virtual {v0, p0}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 92
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->֫(Ll/ܽۢܳ;)V

    const-string p0, "ARG_MSG_FROM"

    .line 93
    invoke-virtual {v0, p0, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "targetPath"

    .line 94
    invoke-virtual {v0, p0, p4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    const-string p0, "ARG_MSG_TO"

    .line 96
    invoke-virtual {v0, p0, p3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p5, :cond_1

    const-string p0, "replacedName"

    .line 99
    invoke-virtual {v0, p0, p5}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
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
    .locals 6

    .line 22
    move-object v1, p1

    check-cast v1, Ll/ܽۢܳ;

    const-string p1, "local"

    .line 62
    invoke-virtual {v1, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Ll/ܽۢܳ;->۫()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v1}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/֨᩺ܳ;->۫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 66
    iget-object p1, p0, Ll/֨᩺ܳ;->ۗ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const p1, 0x7f120aa9

    .line 67
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 68
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 70
    :cond_1
    iget-object p1, p0, Ll/֨᩺ܳ;->ۗ:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    .line 73
    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v1}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll/֡᩺ܳ;

    invoke-direct {v3, v1, p1}, Ll/֡᩺ܳ;-><init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    invoke-static {v0, p1, v2, v3}, Ll/᩵᩺ܳ;->֫(Lbin/mt/plus/Main;Ll/ᩳۜܳ;Ljava/lang/String;Ll/ᩴ᩺ܳ;)V

    .line 76
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 78
    :cond_2
    iget-object v0, p0, Ll/֨᩺ܳ;->ۗ:Ljava/util/List;

    iget-object v2, p0, Ll/֨᩺ܳ;->۬:Ljava/lang/String;

    invoke-virtual {v1}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v3

    .line 79
    invoke-virtual {v1}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 78
    invoke-static/range {v0 .. v5}, Ll/֨᩺ܳ;->֫(Ljava/util/List;Ll/ܽۢܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/֨۠ۢ;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ll/֨۠ۢ;->֫()I

    .line 80
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 63
    :cond_3
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

    .line 47
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩺ܳ;->ۗ:Ljava/util/List;

    .line 52
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩺ܳ;->۫:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩺ܳ;->۬:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    const v0, 0x7f120928

    invoke-virtual {p1, v0, p0}, Ll/ܽۢܳ;->֫(ILjava/util/function/Function;)V

    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Search results do not support single-window copy."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 39
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
