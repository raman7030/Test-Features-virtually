.class public final Ll/ۢ֫᩻;
.super Ll/۟ܶۡ;
.source "M4QY"


# instance fields
.field public final synthetic ۜ:Z

.field public final synthetic ۢ:Ll/֨۠ᩳ;

.field public ܳ:Z

.field public final synthetic ᩷:Z

.field public final synthetic ᩻:Ll/ۡ֫᩻;


# direct methods
.method public constructor <init>(Ll/ۡ֫᩻;ZZLl/֨۠ᩳ;)V
    .locals 0

    .line 73
    iput-object p1, p0, Ll/ۢ֫᩻;->᩻:Ll/ۡ֫᩻;

    iput-boolean p2, p0, Ll/ۢ֫᩻;->᩷:Z

    iput-boolean p3, p0, Ll/ۢ֫᩻;->ۜ:Z

    iput-object p4, p0, Ll/ۢ֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 74
    iput-boolean p1, p0, Ll/ۢ֫᩻;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۢ֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    const v0, 0x7f120632

    .line 112
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 117
    iget-boolean v0, p0, Ll/ۢ֫᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Ll/ۢ֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    .line 120
    :cond_0
    iget-object v0, p0, Ll/ۢ֫᩻;->᩻:Ll/ۡ֫᩻;

    invoke-static {v0}, Ll/ۡ֫᩻;->ܽ(Ll/ۡ֫᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 78
    iget-object v0, p0, Ll/ۢ֫᩻;->᩻:Ll/ۡ֫᩻;

    invoke-static {v0}, Ll/ۡ֫᩻;->ܽ(Ll/ۡ֫᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f120797

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 84
    iget-object v0, p0, Ll/ۢ֫᩻;->᩻:Ll/ۡ֫᩻;

    invoke-static {v0}, Ll/ۡ֫᩻;->֫(Ll/ۡ֫᩻;)Ll/֡֫᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡֫᩻;->ۧ()I

    move-result v1

    .line 85
    invoke-static {v0}, Ll/ۡ֫᩻;->֫(Ll/ۡ֫᩻;)Ll/֡֫᩻;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡֫᩻;->֫()I

    move-result v2

    .line 86
    invoke-static {v0}, Ll/ۡ֫᩻;->ۧ(Ll/ۡ֫᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 87
    check-cast v3, Ll/ۢۧ᩻;

    .line 88
    iget-object v4, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v3}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v3}, Ll/ۢۧ᩻;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 93
    invoke-virtual {v3}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    .line 96
    invoke-static {v4, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 0
    instance-of v6, v5, Ll/۬۠ܿ;

    if-eqz v6, :cond_0

    .line 98
    check-cast v5, Ll/۬۠ܿ;

    invoke-virtual {v5}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 99
    invoke-virtual {v5}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    .line 102
    :cond_0
    iget-boolean v5, p0, Ll/ۢ֫᩻;->᩷:Z

    iget-boolean v6, p0, Ll/ۢ֫᩻;->ۜ:Z

    invoke-static {v4, v1, v2, v5, v6}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IIZZ)V

    .line 104
    invoke-virtual {v3}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ll/ܽۜܳ;->֫(II)Ll/ܽۜܳ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V

    const/4 v3, 0x1

    .line 105
    iput-boolean v3, p0, Ll/ۢ֫᩻;->ܳ:Z

    goto :goto_0

    .line 90
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to chown \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\': Unsupported operation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 125
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
