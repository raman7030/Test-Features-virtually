.class public final Ll/᩻֫᩻;
.super Ljava/lang/Object;
.source "SAKA"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Z

.field public final ᩳ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩻֫᩻;->ᩳ:Ll/ܽۢܳ;

    .line 32
    iput-object p2, p0, Ll/᩻֫᩻;->ۧ:Ljava/util/List;

    .line 33
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/᩻֫᩻;->ܽ:Z

    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۜܳ;

    .line 36
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ll/ᩳۜܳ;->۬()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 v0, 0x1

    .line 42
    :cond_2
    iput-boolean v0, p0, Ll/᩻֫᩻;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻֫᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻֫᩻;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩻֫᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֫᩻;->ۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩻֫᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻֫᩻;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩻֫᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֫᩻;->ᩳ:Ll/ܽۢܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֨۠ᩳ;)V
    .locals 11

    .line 47
    iget-object v0, p0, Ll/᩻֫᩻;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 50
    iget-object v1, p0, Ll/᩻֫᩻;->ᩳ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v2

    const v3, 0x7f0d01cd

    invoke-virtual {v2, v3}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v7

    const v2, 0x7f0a0074

    .line 51
    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/CheckBox;

    const v2, 0x7f0a0075

    .line 52
    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/CheckBox;

    .line 53
    iget-boolean v2, p0, Ll/᩻֫᩻;->ܽ:Z

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    :goto_0
    invoke-static {v2, v3}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v0

    .line 54
    new-instance v2, Ll/ᩳ֫᩻;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v6

    move-object v4, v2

    move-object v5, p0

    move-object v10, p1

    invoke-direct/range {v4 .. v10}, Ll/ᩳ֫᩻;-><init>(Ll/᩻֫᩻;Lbin/mt/plus/Main;Landroid/view/View;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/֨۠ᩳ;)V

    const p1, 0x7f1205eb

    .line 89
    invoke-virtual {v2, p1}, Ll/۬ۗܿ;->ۡ(I)V

    .line 90
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 91
    invoke-static {}, Ll/ܿۤۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v2}, Ll/۬ۗܿ;->֫()V

    const/4 p1, 0x4

    .line 93
    invoke-virtual {v2, p1}, Ll/۬ۗܿ;->ܿ(I)V

    const/4 p1, 0x6

    .line 94
    invoke-virtual {v2, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    new-instance p1, Ll/֫֫᩻;

    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, v0}, Ll/֫֫᩻;-><init>(Z)V

    .line 95
    invoke-virtual {v2, p1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    .line 205
    invoke-virtual {v2, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 97
    invoke-virtual {v2}, Ll/۬ۗܿ;->᩷()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ܽۡۡ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2}, Ll/ܽۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
