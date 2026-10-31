.class public final Ll/֡ܿ᩻;
.super Ll/֫ۜܳ;
.source "GAHN"


# instance fields
.field public ۗ:Ll/ܽۧ᩻;


# direct methods
.method public static ֫(Ll/֡ܿ᩻;Ll/ۖۢܳ;Ljava/util/LinkedList;Ll/֡ۚۢ;)V
    .locals 9

    .line 77
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    check-cast v0, Ll/ۗۢ᩻;

    .line 79
    :goto_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 80
    invoke-virtual {p3}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 85
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    .line 199
    invoke-virtual {v0, v1, v2}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 91
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 92
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget v5, v4, Ll/ܽۧ᩻;->ܿ:I

    add-int/2addr v5, v2

    iput v5, v4, Ll/ܽۧ᩻;->ܿ:I

    .line 93
    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v4

    if-nez v4, :cond_1

    .line 94
    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    .line 97
    :cond_2
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget v5, v4, Ll/ܽۧ᩻;->ᩳ:I

    add-int/2addr v5, v2

    iput v5, v4, Ll/ܽۧ᩻;->ᩳ:I

    .line 98
    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v4

    if-nez v4, :cond_1

    .line 99
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget-wide v5, v4, Ll/ܽۧ᩻;->ܳ:J

    invoke-interface {v3}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    add-long/2addr v7, v5

    iput-wide v7, v4, Ll/ܽۧ᩻;->ܳ:J

    goto :goto_1

    .line 103
    :cond_3
    iget-object v1, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ll/ۘۢܳ;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_0

    :catch_0
    move-exception p0

    .line 87
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    const/4 p2, 0x0

    .line 546
    invoke-virtual {p1, p0, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 9

    const-string v0, "net"

    .line 44
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 49
    new-instance v0, Ll/ܽۧ᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܽۧ᩻;-><init>(Lbin/mt/plus/Main;)V

    iput-object v0, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    .line 50
    iget-object v0, v0, Ll/ܽۧ᩻;->ᩴ:Landroid/widget/TextView;

    const v1, 0x7f1205ca

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 51
    iget-object v0, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget-object v0, v0, Ll/ܽۧ᩻;->ۢ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/֫ۜܳ;->ܳ(Ll/ۖۢܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    iget-object v1, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget-object v1, v1, Ll/ܽۧ᩻;->᩵:Landroid/view/View;

    .line 53
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v1, Ll/ܺܿ᩻;

    invoke-direct {v1, p0, p1}, Ll/ܺܿ᩻;-><init>(Ll/֡ܿ᩻;Ll/ۖۢܳ;)V

    const v2, 0x7f12070a

    .line 54
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const/4 v2, 0x0

    .line 55
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 56
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 57
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 58
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    .line 59
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 60
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 61
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget v5, v4, Ll/ܽۧ᩻;->ܿ:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Ll/ܽۧ᩻;->ܿ:I

    .line 62
    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v4

    if-nez v4, :cond_0

    .line 63
    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_1
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget v5, v4, Ll/ܽۧ᩻;->ᩳ:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Ll/ܽۧ᩻;->ᩳ:I

    .line 67
    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v4

    if-nez v4, :cond_0

    .line 68
    iget-object v4, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget-wide v5, v4, Ll/ܽۧ᩻;->ܳ:J

    invoke-interface {v3}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    add-long/2addr v7, v5

    iput-wide v7, v4, Ll/ܽۧ᩻;->ܳ:J

    goto :goto_0

    .line 72
    :cond_2
    iget-object v2, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    new-instance v3, Ll/ۘۢܳ;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v2}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 73
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 74
    iget-object p1, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget-object p1, p1, Ll/ܽۧ᩻;->᩻:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 76
    :cond_3
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ۖܿ᩻;

    invoke-direct {v3, p0, p1, v1, v0}, Ll/ۖܿ᩻;-><init>(Ll/֡ܿ᩻;Ll/ۖۢܳ;Ljava/util/LinkedList;Ll/֡ۚۢ;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 2

    .line 111
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/᩵ܿ᩻;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 112
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 113
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    const-string v1, "deleteFrom"

    .line 115
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ll/֡ܿ᩻;->ۗ:Ll/ܽۧ᩻;

    iget v1, p1, Ll/ܽۧ᩻;->ᩳ:I

    iget p1, p1, Ll/ܽۧ᩻;->ܿ:I

    add-int/2addr v1, p1

    const-string p1, "minTotal"

    .line 116
    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 117
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 0

    .line 39
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    check-cast p1, Ll/ۚۡ᩻;

    invoke-virtual {p1}, Ll/ۚۡ᩻;->᩻֫()V

    const/4 p1, 0x1

    return p1
.end method
