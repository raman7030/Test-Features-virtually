.class public final Ll/ۜܿ᩻;
.super Ll/۟ܶۡ;
.source "H7FZ"


# instance fields
.field public final synthetic ۜ:Ll/ۖۢܳ;

.field public final ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩷:Ll/ۗۢ᩻;

.field public final synthetic ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩷ܿ᩻;Ll/ۖۢܳ;Ll/ۗۢ᩻;Ljava/util/ArrayList;)V
    .locals 0

    .line 104
    iput-object p2, p0, Ll/ۜܿ᩻;->ۜ:Ll/ۖۢܳ;

    iput-object p3, p0, Ll/ۜܿ᩻;->᩷:Ll/ۗۢ᩻;

    iput-object p4, p0, Ll/ۜܿ᩻;->᩻:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 106
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۜܿ᩻;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۜܿ᩻;->ۜ:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 110
    iget-object v0, p0, Ll/ۜܿ᩻;->ۜ:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f12088f

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    const/4 v0, 0x0

    .line 115
    iget-object v1, p0, Ll/ۜܿ᩻;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 143
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 145
    invoke-interface {v0}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".tmp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Ll/ۜܿ᩻;->᩷:Ll/ۗۢ᩻;

    invoke-virtual {v3, v0}, Ll/ۗۢ᩻;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 146
    invoke-virtual {v3, v2, v0}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/ۜܿ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    :try_start_0
    invoke-virtual {v3, v1, v2}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    invoke-static {v2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 158
    :try_start_1
    invoke-virtual {v3, v0, v1}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-static {v1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v4

    .line 167
    invoke-virtual {v3, v2, v1}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    invoke-static {v2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 169
    invoke-virtual {v3, v0, v2}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 170
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 173
    :cond_0
    throw v4

    :catch_1
    move-exception v1

    .line 152
    invoke-virtual {v3, v0, v2}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 153
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 155
    :cond_1
    throw v1
.end method

.method public final ᩳ()V
    .locals 2

    .line 129
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 130
    iget-object v0, p0, Ll/ۜܿ᩻;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 131
    iget-object v1, p0, Ll/ۜܿ᩻;->ۜ:Ll/ۖۢܳ;

    invoke-virtual {v1}, Ll/ۖۢܳ;->֫()V

    .line 132
    invoke-virtual {v1, v0}, Ll/ۖۢܳ;->֫(Ljava/util/ArrayList;)V

    .line 133
    invoke-virtual {v1}, Ll/ۖۢܳ;->֨()V

    .line 135
    :cond_0
    iget-object v0, p0, Ll/ۜܿ᩻;->᩷:Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
