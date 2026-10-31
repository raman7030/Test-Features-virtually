.class public final Ll/֨֫᩻;
.super Ll/۟ܶۡ;
.source "F180"


# instance fields
.field public final synthetic ۜ:Z

.field public final synthetic ۢ:Ll/֨۠ᩳ;

.field public ܳ:Z

.field public final synthetic ᩷:Z

.field public final synthetic ᩻:Ll/ܶ֫᩻;


# direct methods
.method public constructor <init>(Ll/ܶ֫᩻;ZZLl/֨۠ᩳ;)V
    .locals 0

    .line 75
    iput-object p1, p0, Ll/֨֫᩻;->᩻:Ll/ܶ֫᩻;

    iput-boolean p2, p0, Ll/֨֫᩻;->᩷:Z

    iput-boolean p3, p0, Ll/֨֫᩻;->ۜ:Z

    iput-object p4, p0, Ll/֨֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Ll/֨֫᩻;->ܳ:Z

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 150
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 153
    :cond_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 154
    iget-boolean v0, p0, Ll/֨֫᩻;->᩷:Z

    if-eqz v0, :cond_1

    .line 0
    instance-of v0, p2, Ll/۬ܶܿ;

    if-eqz v0, :cond_1

    .line 156
    new-instance v0, Ll/۠֫᩻;

    move-object v2, p2

    check-cast v2, Ll/۬ܶܿ;

    invoke-direct {v0, v2, p3, v1}, Ll/۠֫᩻;-><init>(Ll/۬ܶܿ;Ljava/lang/String;Ll/ۢۧ᩻;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v0, 0x1

    .line 413
    invoke-virtual {p2, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p2

    .line 159
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    const-string v1, "/"

    .line 0
    invoke-static {p3, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 160
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Ll/֨֫᩻;->֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_0

    .line 163
    :cond_2
    iget-boolean v0, p0, Ll/֨֫᩻;->ۜ:Z

    if-eqz v0, :cond_3

    .line 0
    instance-of v0, p2, Ll/۬ܶܿ;

    if-eqz v0, :cond_3

    .line 165
    new-instance v0, Ll/۠֫᩻;

    check-cast p2, Ll/۬ܶܿ;

    invoke-direct {v0, p2, p3, v1}, Ll/۠֫᩻;-><init>(Ll/۬ܶܿ;Ljava/lang/String;Ll/ۢۧ᩻;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 173
    iget-object v0, p0, Ll/֨֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    const v0, 0x7f120632

    .line 174
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 179
    iget-boolean v0, p0, Ll/֨֫᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Ll/֨֫᩻;->ۢ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    .line 182
    :cond_0
    iget-object v0, p0, Ll/֨֫᩻;->᩻:Ll/ܶ֫᩻;

    invoke-static {v0}, Ll/ܶ֫᩻;->ܽ(Ll/ܶ֫᩻;)Ll/ܽۢܳ;

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

    .line 80
    iget-object v0, p0, Ll/֨֫᩻;->᩻:Ll/ܶ֫᩻;

    invoke-static {v0}, Ll/ܶ֫᩻;->ܽ(Ll/ܶ֫᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f120797

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 11

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    iget-object v2, p0, Ll/֨֫᩻;->᩻:Ll/ܶ֫᩻;

    invoke-static {v2}, Ll/ܶ֫᩻;->ۧ(Ll/ܶ֫᩻;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 89
    check-cast v4, Ll/ۢۧ᩻;

    .line 90
    invoke-virtual {v4}, Ll/ۢۧ᩻;->ᩳ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 91
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 96
    :cond_1
    invoke-static {v2}, Ll/ܶ֫᩻;->֫(Ll/ܶ֫᩻;)Ll/ۘ֨ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۘ֨ܳ;->֫()I

    move-result v2

    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    iget-boolean v4, p0, Ll/֨֫᩻;->ۜ:Z

    iget-boolean v5, p0, Ll/֨֫᩻;->᩷:Z

    const/4 v6, 0x1

    if-nez v3, :cond_3

    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۧ᩻;

    .line 99
    iget-object v7, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v3}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v3}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/String;

    .line 103
    invoke-static {v7, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v8

    .line 0
    instance-of v9, v8, Ll/۬۠ܿ;

    if-eqz v9, :cond_2

    .line 105
    check-cast v8, Ll/۬۠ܿ;

    invoke-virtual {v8}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 106
    invoke-virtual {v8}, Ll/ۧ᩹ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    .line 109
    :cond_2
    invoke-static {v7, v2, v5, v4}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;IZZ)V

    .line 110
    invoke-virtual {v3}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v7

    invoke-virtual {v7, v2}, Ll/ܽۜܳ;->֫(I)Ll/ܽۜܳ;

    move-result-object v7

    invoke-virtual {v3, v7}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V

    .line 111
    iput-boolean v6, p0, Ll/֨֫᩻;->ܳ:Z

    goto :goto_1

    .line 114
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    .line 115
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۧ᩻;

    .line 135
    invoke-virtual {v3}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 136
    invoke-virtual {v3}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v8

    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v9, v7, Ll/۬ܶܿ;

    if-eqz v9, :cond_5

    .line 138
    new-instance v9, Ll/۠֫᩻;

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object v10

    invoke-direct {v9, v10, v8, v3}, Ll/۠֫᩻;-><init>(Ll/۬ܶܿ;Ljava/lang/String;Ll/ۢۧ᩻;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    if-nez v4, :cond_6

    if-eqz v5, :cond_4

    .line 141
    :cond_6
    invoke-virtual {v3}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v3}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_4

    .line 413
    invoke-virtual {v7, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v3

    .line 142
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ᩵ܿ;

    const-string v9, "/"

    .line 0
    invoke-static {v8, v9}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 143
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, v1, v7, v9}, Ll/֨֫᩻;->֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_2

    .line 119
    :cond_7
    invoke-static {}, Ll/ۡۤۡ;->᩻()Ll/ۡۤۡ;

    move-result-object v0

    .line 120
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠֫᩻;

    .line 121
    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 122
    iget-object v4, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    iget-object v5, v3, Ll/۠֫᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 124
    :cond_9
    iget-object v4, v3, Ll/۠֫᩻;->֫:Ll/۬ܶܿ;

    invoke-virtual {v4, v2}, Ll/۬ܶܿ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 125
    iget-object v3, v3, Ll/۠֫᩻;->ۧ:Ll/ۢۧ᩻;

    if-eqz v3, :cond_a

    .line 126
    invoke-virtual {v3}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/ܽۜܳ;->֫(I)Ll/ܽۜܳ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V

    .line 128
    :cond_a
    iput-boolean v6, p0, Ll/֨֫᩻;->ܳ:Z

    goto :goto_3

    :cond_b
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 187
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
