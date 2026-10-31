.class public final Ll/ۡᩳ᩻;
.super Ll/۟ܶۡ;
.source "38V8"


# instance fields
.field public final synthetic ۖ:Z

.field public final synthetic ۘ:Ll/ܰܺܳ;

.field public final synthetic ۜ:Ll/ܺᩳ᩻;

.field public final synthetic ۡ:Ljava/util/List;

.field public final synthetic ۢ:Z

.field public ܳ:Ll/ۡۤۡ;

.field public final synthetic ܺ:Z

.field public final synthetic ᩷:Ll/ۗܺ᩷;

.field public ᩻:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ll/ܺᩳ᩻;Lbin/mt/plus/Main;Ljava/util/List;ZZZLl/ܰܺܳ;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ll/ۡᩳ᩻;->ۜ:Ll/ܺᩳ᩻;

    iput-object p2, p0, Ll/ۡᩳ᩻;->᩷:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۡᩳ᩻;->ۡ:Ljava/util/List;

    iput-boolean p4, p0, Ll/ۡᩳ᩻;->ܺ:Z

    iput-boolean p5, p0, Ll/ۡᩳ᩻;->ۢ:Z

    iput-boolean p6, p0, Ll/ۡᩳ᩻;->ۖ:Z

    iput-object p7, p0, Ll/ۡᩳ᩻;->ۘ:Ll/ܰܺܳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 66
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/ۡᩳ᩻;->᩻:Ljava/lang/StringBuilder;

    .line 67
    invoke-static {}, Ll/ۡۤۡ;->᩻()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡᩳ᩻;->ܳ:Ll/ۡۤۡ;

    return-void
.end method

.method private ֫(Ll/ᩳۜܳ;Ljava/lang/String;)V
    .locals 3

    .line 86
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 89
    :cond_0
    iget-boolean v0, p0, Ll/ۡᩳ᩻;->ܺ:Z

    iget-object v1, p0, Ll/ۡᩳ᩻;->᩻:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    .line 90
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 92
    :cond_1
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :goto_0
    iget-boolean v0, p0, Ll/ۡᩳ᩻;->ۢ:Z

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x2f

    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v0, 0xa

    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    iget-boolean v0, p0, Ll/ۡᩳ᩻;->ۖ:Z

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 99
    iget-object v0, p0, Ll/ۡᩳ᩻;->ܳ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 100
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 0
    :cond_3
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 102
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 103
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 199
    iget-object v1, p0, Ll/ۡᩳ᩻;->ۘ:Ll/ܰܺܳ;

    invoke-virtual {v1, p1, v0}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x0

    .line 104
    invoke-static {p1, v0, v0}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    .line 105
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 106
    invoke-direct {p0, v0, p2}, Ll/ۡᩳ᩻;->֫(Ll/ᩳۜܳ;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 113
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    iget-object v0, p0, Ll/ۡᩳ᩻;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 118
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۡᩳ᩻;->ۜ:Ll/ܺᩳ᩻;

    invoke-virtual {v1}, Ll/֫ۜܳ;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 323
    iget-object v3, p0, Ll/ۡᩳ᩻;->᩷:Ll/ۗܺ᩷;

    invoke-static {v3, v0, v1, v2, v2}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۡᩳ᩻;->᩷:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 71
    iget-object v0, p0, Ll/ۡᩳ᩻;->᩷:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    .line 72
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 73
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 74
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 79
    iget-object v0, p0, Ll/ۡᩳ᩻;->ܳ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    .line 80
    iget-object v0, p0, Ll/ۡᩳ᩻;->ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    const-string v2, ""

    .line 81
    invoke-direct {p0, v1, v2}, Ll/ۡᩳ᩻;->֫(Ll/ᩳۜܳ;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 129
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
