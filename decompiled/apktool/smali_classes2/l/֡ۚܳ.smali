.class public final Ll/֡ۚܳ;
.super Ll/֫ۜܳ;
.source "X1Y5"


# instance fields
.field public ۗ:Ljava/util/List;


# direct methods
.method public static ֫(Lbin/mt/plus/Main;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 7

    .line 297
    new-instance v0, Ll/ܿۙ;

    invoke-direct {v0, p0}, Ll/ܿۙ;-><init>(Ll/ۗܺ᩷;)V

    .line 79
    invoke-virtual {v0}, Ll/ܿۙ;->֫()V

    .line 80
    invoke-virtual {v0, p2}, Ll/ܿۙ;->ۧ(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 83
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۢܳ;

    invoke-virtual {v1}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿۙ;->֫(Ljava/lang/String;)V

    .line 88
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v1, v4, :cond_1

    sget-boolean v1, Ll/ۛ֨ܿ;->ᩳ:Z

    if-eqz v1, :cond_1

    invoke-static {}, Ll/ۗᩴܺ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 90
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۢܳ;

    .line 91
    invoke-virtual {v5}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۚ()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v1, 0x0

    .line 97
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۤۢܳ;

    .line 99
    invoke-virtual {v6}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    if-eqz v1, :cond_4

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v6

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object v6

    .line 100
    :goto_2
    invoke-virtual {v0, v6}, Ll/ܿۙ;->֫(Landroid/net/Uri;)V

    .line 101
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 103
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v3, :cond_6

    .line 104
    invoke-static {v4}, Ll/ۨ᩵ܿ;->֫(Ljava/util/ArrayList;)V

    .line 108
    :cond_6
    :try_start_0
    invoke-virtual {v0}, Ll/ܿۙ;->ۧ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 110
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v1, v3, :cond_7

    .line 111
    instance-of v1, v0, Landroid/os/FileUriExposedException;

    if-eqz v1, :cond_7

    .line 112
    sput-boolean v2, Ll/ۛ֨ܿ;->ᩳ:Z

    .line 113
    invoke-static {p0, p1, p2}, Ll/֡ۚܳ;->֫(Lbin/mt/plus/Main;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void

    :cond_7
    const/4 p1, 0x0

    .line 546
    invoke-virtual {p0, v0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ֫(Ll/֡ۚܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;)V
    .locals 2

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽ᩷ܳ;->֫(Ljava/util/List;)V

    .line 56
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 57
    iget-object p0, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳۜܳ;

    .line 69
    invoke-interface {p0}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object p0

    const-string v0, "application/vnd.android.package-archive"

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ll/ۗᩴܺ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "application/octet-stream"

    goto :goto_0

    .line 59
    :cond_0
    iget-object p0, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ᩴۚܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ᩴۚܳ;-><init>(I)V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/᩵ۚܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 61
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1, p2, p0}, Ll/֡ۚܳ;->֫(Lbin/mt/plus/Main;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 5

    .line 46
    iget-object v0, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 47
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    iget-object v1, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    invoke-virtual {v0, v1}, Ll/ܽ᩷ܳ;->֫(Ll/ᩳۜܳ;)V

    .line 49
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    iget-object v1, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 51
    new-instance v3, Ll/ۤۢܳ;

    invoke-direct {v3, v2}, Ll/ۤۢܳ;-><init>(Ll/ᩳۜܳ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    new-instance v3, Ll/ۘۚܳ;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v0, v4}, Ll/ۘۚܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2, v0, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    .line 36
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۚܳ;->ۗ:Ljava/util/List;

    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 38
    invoke-interface {v0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
