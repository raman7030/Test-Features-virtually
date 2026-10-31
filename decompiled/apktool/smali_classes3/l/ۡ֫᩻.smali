.class public final Ll/ۡ֫᩻;
.super Ljava/lang/Object;
.source "M4QY"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/֡֫᩻;

.field public ܽ:Ljava/util/List;

.field public ᩳ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۡ֫᩻;->ᩳ:Ll/ܽۢܳ;

    .line 28
    iput-object p2, p0, Ll/ۡ֫᩻;->ܽ:Ljava/util/List;

    .line 30
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۜܳ;

    .line 31
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ll/ᩳۜܳ;->۬()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 36
    :goto_0
    iput-boolean p1, p0, Ll/ۡ֫᩻;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ֫᩻;)Ll/֡֫᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    return-object p0
.end method

.method public static ֫(Ll/ۡ֫᩻;Ll/֨۠ᩳ;)V
    .locals 3

    .line 45
    iget-object v0, p0, Ll/ۡ֫᩻;->ᩳ:Ll/ܽۢܳ;

    iget-object v1, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    invoke-virtual {v1}, Ll/֡֫᩻;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    :try_start_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v1, v2}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    iget-object v0, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    invoke-virtual {v0}, Ll/֡֫᩻;->ᩳ()Z

    move-result v0

    .line 72
    iget-object v1, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    invoke-virtual {v1}, Ll/֡֫᩻;->ܽ()Z

    move-result v1

    .line 73
    new-instance v2, Ll/ۢ֫᩻;

    invoke-direct {v2, p0, v0, v1, p1}, Ll/ۢ֫᩻;-><init>(Ll/ۡ֫᩻;ZZLl/֨۠ᩳ;)V

    .line 127
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p0, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡ֫᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֫᩻;->ܽ:Ljava/util/List;

    return-object p0
.end method

.method public static ۧ(Ll/ۡ֫᩻;Ll/֨۠ᩳ;)V
    .locals 3

    .line 60
    iget-object v0, p0, Ll/ۡ֫᩻;->ᩳ:Ll/ܽۢܳ;

    :try_start_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v1, v2}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    iget-object v0, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    invoke-virtual {v0}, Ll/֡֫᩻;->ᩳ()Z

    move-result v0

    .line 72
    iget-object v1, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    invoke-virtual {v1}, Ll/֡֫᩻;->ܽ()Z

    move-result v1

    .line 73
    new-instance v2, Ll/ۢ֫᩻;

    invoke-direct {v2, p0, v0, v1, p1}, Ll/ۢ֫᩻;-><init>(Ll/ۡ֫᩻;ZZLl/֨۠ᩳ;)V

    .line 127
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_0
    move-exception p0

    .line 62
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p0, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۡ֫᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֫᩻;->ᩳ:Ll/ܽۢܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֨۠ᩳ;)V
    .locals 11

    .line 40
    iget-object v0, p0, Ll/ۡ֫᩻;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۡ֫᩻;->ᩳ:Ll/ܽۢܳ;

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    .line 42
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۧ᩻;

    .line 43
    invoke-virtual {v0}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    .line 44
    new-instance v2, Ll/֡֫᩻;

    invoke-virtual {v3}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v5

    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ll/ۜ֫᩻;

    invoke-direct {v9, p0, p1}, Ll/ۜ֫᩻;-><init>(Ll/ۡ֫᩻;Ll/֨۠ᩳ;)V

    iget-boolean v8, p0, Ll/ۡ֫᩻;->֫:Z

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Ll/֡֫᩻;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 54
    invoke-virtual {v0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/֡֫᩻;->֫(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/֡֫᩻;->ܳ()V

    iput-object v2, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    return-void

    .line 58
    :cond_0
    new-instance v1, Ll/֡֫᩻;

    invoke-virtual {v3}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v6

    new-instance v10, Ll/᩷֫᩻;

    invoke-direct {v10, p0, p1}, Ll/᩷֫᩻;-><init>(Ll/ۡ֫᩻;Ll/֨۠ᩳ;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 31
    iget-boolean v9, p0, Ll/ۡ֫᩻;->֫:Z

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Ll/֡֫᩻;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const p1, 0x7f120b86

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֡֫᩻;->֫(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/֡֫᩻;->ܳ()V

    iput-object v1, p0, Ll/ۡ֫᩻;->ۧ:Ll/֡֫᩻;

    return-void
.end method
