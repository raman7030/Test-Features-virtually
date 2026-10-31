.class public final synthetic Ll/ۗۖܳ;
.super Ljava/lang/Object;
.source "J26J"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/ᩴܺܳ;
.implements Ll/᩷ܺۡ;
.implements Ll/ۙ۫ۡ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/۠ۖ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗۖܳ;->᩸:I

    iput-object p2, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->$r8$lambda$RXRVdOP2Ops8JetgN5e2AF0jW18(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۗۖܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۧܺۡ;

    .line 116
    :goto_0
    invoke-static {v0}, Ll/ܿܺۡ;->ۧ(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟ۡۡ;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۢۛܽ;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public ֫(Ll/ۢܺۡ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۢۘܳ;

    invoke-static {p1}, Ll/ۢۘܳ;->ᩳ(Ll/ۢۘܳ;)V

    return-void
.end method

.method public ֫(Ll/᩸ۖ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩸᩻ۢ;

    invoke-static {p1}, Ll/᩸᩻ۢ;->֫(Ll/᩸᩻ۢ;)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/ۗۖܳ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    const/4 v1, 0x0

    .line 1988
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v2

    .line 63
    sget-object v3, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    invoke-static {v2, v3}, Ll/ۡܿܽ;->֫([BLl/ۢܿܽ;)Ll/ۡܿܽ;

    move-result-object v2

    .line 1989
    invoke-virtual {v2}, Ll/ۡܿܽ;->᩻ۧ()Ll/۬ܿܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ܿܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗܿܽ;

    const-string v5, "MT\u7ba1\u7406\u5668"

    .line 1990
    invoke-virtual {v4, v5}, Ll/ۗܿܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 1992
    :cond_0
    invoke-virtual {v2}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܿܽ;

    .line 1993
    invoke-virtual {v4}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ܿܽ;

    .line 1994
    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "^attr-private"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 1995
    invoke-virtual {v6}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/۠ܿܽ;->֫(I)V

    goto :goto_1

    .line 2000
    :cond_3
    invoke-virtual {v2}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܿܽ;

    .line 2001
    invoke-virtual {v4}, Ll/۠ܿܽ;->ۡ()V

    .line 2002
    invoke-virtual {v4}, Ll/۠ܿܽ;->᩵()V

    .line 2003
    invoke-virtual {v4}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ܿܽ;

    .line 2004
    invoke-virtual {v6}, Ll/ۤᩳܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖܿܽ;

    .line 2005
    invoke-virtual {v7, v5}, Ll/ۖܿܽ;->֫(Z)V

    .line 2006
    invoke-virtual {v7}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩴܿܽ;

    .line 2007
    invoke-virtual {v8, v5}, Ll/ᩴܿܽ;->֫(Z)V

    goto :goto_2

    .line 2012
    :cond_7
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۚ()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_c

    .line 2015
    invoke-virtual {v2, v5}, Ll/ۡܿܽ;->ۢ(I)Ll/۠ܿܽ;

    move-result-object v3

    .line 2016
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 2017
    invoke-virtual {v3}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ܿܽ;

    .line 2018
    :goto_4
    invoke-virtual {v6}, Ll/᩶ܿܽ;->ۜ֫()I

    move-result v7

    if-le v7, v4, :cond_9

    .line 2019
    invoke-virtual {v6}, Ll/᩶ܿܽ;->ۜ֫()I

    move-result v7

    sub-int/2addr v7, v4

    invoke-virtual {v6, v7}, Ll/᩶ܿܽ;->᩻(I)V

    goto :goto_4

    .line 2021
    :cond_9
    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 2023
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    const/4 v8, 0x3

    .line 2026
    :cond_a
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/᩶ܿܽ;->ܽ(Ljava/lang/String;)V

    goto :goto_3

    .line 75
    :cond_b
    sget-object v3, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    invoke-static {v2, v3}, Ll/ۡܿܽ;->֫(Ll/ۡᩳܽ;Ll/ۢܿܽ;)Ll/ۡܿܽ;

    move-result-object v2

    .line 2031
    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    .line 2032
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۡ()V

    .line 236
    invoke-virtual {v2, v3, v1}, Ll/ۡܿܽ;->֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;)V

    const-string v2, "slim.arsc"

    .line 2034
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 2035
    invoke-virtual {p1, v3}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    .line 2036
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    .line 2013
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 2038
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
