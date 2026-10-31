.class public final Ll/۬۫ۧ;
.super Ljava/lang/Object;
.source "JALK"

# interfaces
.implements Ll/᩵ۤ᩵;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۤ᩵;


# direct methods
.method public constructor <init>(Ll/᩵ۤ᩵;Ll/ۛ۫ۧ;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/۬۫ۧ;->᩸:Ll/᩵ۤ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ᩴ᩸᩵;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p2, Ll/ۗ۫ۧ;

    if-eqz v0, :cond_0

    .line 7
    move-object v0, p2

    check-cast v0, Ll/ۗ۫ۧ;

    .line 9
    iget v1, v0, Ll/ۗ۫ۧ;->ۙ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    .line 18
    iput v1, v0, Ll/ۗ۫ۧ;->ۙ:I

    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ll/ۗ۫ۧ;

    .line 24
    invoke-direct {v0, p0, p2}, Ll/ۗ۫ۧ;-><init>(Ll/۬۫ۧ;Ll/ᩴ᩸᩵;)V

    .line 26
    :goto_0
    iget-object p2, v0, Ll/ۗ۫ۧ;->ۗ:Ljava/lang/Object;

    .line 57
    sget-object v1, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    .line 0
    iget v2, v0, Ll/ۗ۫ۧ;->ۙ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 138
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 0
    :cond_2
    invoke-static {p2}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    .line 136
    check-cast p1, Ll/ܿܽܽ;

    .line 88
    invoke-virtual {p1}, Ll/ܿܽܽ;->֫()Ljava/util/List;

    move-result-object p1

    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Ll/ۨ֫ܽ;

    .line 89
    instance-of v4, v4, Ll/ܳۧܽ;

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_4
    move-object p2, v2

    .line 88
    :goto_1
    instance-of p1, p2, Ll/ܳۧܽ;

    if-eqz p1, :cond_5

    move-object v2, p2

    check-cast v2, Ll/ܳۧܽ;

    :cond_5
    if-nez v2, :cond_6

    goto :goto_2

    .line 138
    :cond_6
    iput v3, v0, Ll/ۗ۫ۧ;->ۙ:I

    iget-object p1, p0, Ll/۬۫ۧ;->᩸:Ll/᩵ۤ᩵;

    invoke-interface {p1, v2, v0}, Ll/᩵ۤ᩵;->֫(Ljava/lang/Object;Ll/ᩴ᩸᩵;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
