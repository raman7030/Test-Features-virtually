.class public final Ll/ܿ֫᩻;
.super Ll/۟ܶۡ;
.source "SAKA"


# instance fields
.field public final synthetic ۜ:Ll/᩻֫᩻;

.field public final synthetic ۡ:Ll/֨۠ᩳ;

.field public final synthetic ۢ:Z

.field public ܳ:Z

.field public final synthetic ܺ:J

.field public final synthetic ᩷:Z

.field public ᩻:Ll/ۡۤۡ;


# direct methods
.method public constructor <init>(Ll/᩻֫᩻;JZZLl/֨۠ᩳ;)V
    .locals 0

    .line 101
    iput-object p1, p0, Ll/ܿ֫᩻;->ۜ:Ll/᩻֫᩻;

    iput-wide p2, p0, Ll/ܿ֫᩻;->ܺ:J

    iput-boolean p4, p0, Ll/ܿ֫᩻;->᩷:Z

    iput-boolean p5, p0, Ll/ܿ֫᩻;->ۢ:Z

    iput-object p6, p0, Ll/ܿ֫᩻;->ۡ:Ll/֨۠ᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 102
    iput-boolean p1, p0, Ll/ܿ֫᩻;->ܳ:Z

    .line 103
    invoke-static {}, Ll/ۡۤۡ;->᩻()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ֫᩻;->᩻:Ll/ۡۤۡ;

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 4

    .line 152
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 155
    :cond_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p2, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 156
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    const-string v2, "/"

    .line 0
    invoke-static {p3, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 157
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Ll/ܿ֫᩻;->֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_0

    .line 159
    :cond_1
    iget-boolean v0, p0, Ll/ܿ֫᩻;->ۢ:Z

    if-eqz v0, :cond_3

    .line 160
    new-instance v0, Ll/ܳ֫᩻;

    invoke-direct {v0, p2, p3}, Ll/ܳ֫᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 163
    :cond_2
    iget-boolean v0, p0, Ll/ܿ֫᩻;->᩷:Z

    if-eqz v0, :cond_3

    .line 164
    new-instance v0, Ll/ܳ֫᩻;

    invoke-direct {v0, p2, p3}, Ll/ܳ֫᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 171
    iget-boolean v0, p0, Ll/ܿ֫᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Ll/ܿ֫᩻;->ۡ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    const v0, 0x7f120632

    .line 173
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const v0, 0x7f120631

    .line 175
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 181
    iget-boolean v0, p0, Ll/ܿ֫᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Ll/ܿ֫᩻;->ۡ:Ll/֨۠ᩳ;

    invoke-virtual {v0}, Ll/֨۠ᩳ;->run()V

    .line 184
    :cond_0
    iget-object v0, p0, Ll/ܿ֫᩻;->ۜ:Ll/᩻֫᩻;

    invoke-static {v0}, Ll/᩻֫᩻;->ᩳ(Ll/᩻֫᩻;)Ll/ܽۢܳ;

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

    .line 107
    iget-object v0, p0, Ll/ܿ֫᩻;->ۜ:Ll/᩻֫᩻;

    invoke-static {v0}, Ll/᩻֫᩻;->ᩳ(Ll/᩻֫᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f120797

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    iget-object v1, p0, Ll/ܿ֫᩻;->ۜ:Ll/᩻֫᩻;

    invoke-static {v1}, Ll/᩻֫᩻;->ۧ(Ll/᩻֫᩻;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 136
    invoke-interface {v3}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 137
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 138
    iget-boolean v7, p0, Ll/ܿ֫᩻;->᩷:Z

    if-nez v7, :cond_0

    iget-boolean v7, p0, Ll/ܿ֫᩻;->ۢ:Z

    if-eqz v7, :cond_1

    .line 139
    :cond_0
    invoke-interface {v3}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ll/ᩳۜܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_1

    .line 413
    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v3

    .line 140
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ܿ;

    const-string v7, "/"

    .line 0
    invoke-static {v6, v7}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 141
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v0, v4, v7}, Ll/ܿ֫᩻;->֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_1

    .line 145
    :cond_1
    new-instance v3, Ll/ܳ֫᩻;

    invoke-direct {v3, v5, v6}, Ll/ܳ֫᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 117
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩻;

    .line 118
    iget-object v3, p0, Ll/ܿ֫᩻;->᩻:Ll/ۡۤۡ;

    invoke-virtual {v3}, Ll/ۡۤۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 119
    iget-object v3, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    iget-object v5, v2, Ll/ܳ֫᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 121
    :cond_4
    iget-object v2, v2, Ll/ܳ֫᩻;->֫:Ll/ܶ᩵ܿ;

    .line 122
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-wide v5, p0, Ll/ܿ֫᩻;->ܺ:J

    invoke-virtual {v2, v5, v6}, Ll/ܶ᩵ܿ;->֫(J)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 123
    iput-boolean v4, p0, Ll/ܿ֫᩻;->ܳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 127
    :cond_5
    iget-boolean v0, p0, Ll/ܿ֫᩻;->ܳ:Z

    if-eqz v0, :cond_6

    .line 128
    invoke-static {v1}, Ll/᩻֫᩻;->ۧ(Ll/᩻֫᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 129
    invoke-interface {v1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ll/ᩳۜܳ;->setTime(J)V

    goto :goto_3

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    .line 127
    iget-boolean v2, p0, Ll/ܿ֫᩻;->ܳ:Z

    if-eqz v2, :cond_7

    .line 128
    invoke-static {v1}, Ll/᩻֫᩻;->ۧ(Ll/᩻֫᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 129
    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Ll/ᩳۜܳ;->setTime(J)V

    goto :goto_4

    .line 132
    :cond_7
    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 189
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
