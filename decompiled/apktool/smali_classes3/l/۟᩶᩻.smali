.class public final Ll/۟᩶᩻;
.super Ll/۟ܶۡ;
.source "JAK2"


# instance fields
.field public final synthetic ֡:J

.field public final synthetic ۖ:Ljava/util/HashSet;

.field public final synthetic ۘ:Z

.field public ۚ:Ll/ᩳܰۡ;

.field public ۜ:Ll/᩸᩶᩻;

.field public final synthetic ۡ:Ljava/util/HashSet;

.field public final synthetic ۢ:Z

.field public ܳ:Ll/᩹ۗܿ;

.field public final synthetic ܺ:Ljava/util/ArrayList;

.field public final synthetic ᩴ:Ll/ܳۙ᩻;

.field public final synthetic ᩵:Ll/ۨۧᩳ;

.field public final synthetic ᩷:Ll/֫ۙ᩻;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/֫ۙ᩻;Ll/ۨۧᩳ;ZLjava/util/HashSet;Ljava/util/ArrayList;ZJLjava/util/HashSet;Ll/ܳۙ᩻;)V
    .locals 0

    .line 158
    iput-object p1, p0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    iput-object p2, p0, Ll/۟᩶᩻;->᩵:Ll/ۨۧᩳ;

    iput-boolean p3, p0, Ll/۟᩶᩻;->ۘ:Z

    iput-object p4, p0, Ll/۟᩶᩻;->ۖ:Ljava/util/HashSet;

    iput-object p5, p0, Ll/۟᩶᩻;->ܺ:Ljava/util/ArrayList;

    iput-boolean p6, p0, Ll/۟᩶᩻;->ۢ:Z

    iput-wide p7, p0, Ll/۟᩶᩻;->֡:J

    iput-object p9, p0, Ll/۟᩶᩻;->ۡ:Ljava/util/HashSet;

    iput-object p10, p0, Ll/۟᩶᩻;->ᩴ:Ll/ܳۙ᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 276
    iget-object v0, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    iget-object v0, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {v0}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v0

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 293
    iget-object v0, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    invoke-virtual {v0}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void

    .line 279
    :cond_1
    iget-object v0, p0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    invoke-static {v0}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ֫()V

    .line 280
    iget-object v0, p0, Ll/۟᩶᩻;->ᩴ:Ll/ܳۙ᩻;

    invoke-virtual {v0}, Ll/ܳۙ᩻;->run()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 291
    iget-object v0, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {v0}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v0

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 293
    iget-object v0, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    invoke-virtual {v0}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 287
    :cond_0
    iget-object v0, p0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    invoke-static {v0}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

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

    .line 167
    new-instance v0, Ll/᩹ۗܿ;

    iget-object v1, p0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    invoke-static {v1}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩹ۗܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120797

    .line 168
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->᩻(I)V

    const-string v1, "..."

    .line 169
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 171
    invoke-virtual {v0}, Ll/᩹ۗܿ;->ۡ()V

    iput-object v0, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 15

    .line 176
    new-instance v0, Ll/ᩳܰۡ;

    iget-object v1, p0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v0, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    .line 177
    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iget-object v2, p0, Ll/۟᩶᩻;->᩵:Ll/ۨۧᩳ;

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v3}, Ll/᩹᩶᩻;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;

    move-result-object v0

    iput-object v0, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    .line 178
    invoke-virtual {v0}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v0

    if-nez v2, :cond_1

    .line 179
    iget-boolean v3, p0, Ll/۟᩶᩻;->ۘ:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 180
    iget-object v3, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-virtual {v0, v3}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V

    .line 182
    :cond_1
    iget-object v3, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->᩸()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 183
    invoke-virtual {v0}, Ll/ۡܰۡ;->ᩳ()V

    .line 185
    :cond_2
    iget-object v3, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v3

    .line 187
    invoke-static {v3}, Ll/᩹᩶᩻;->֫(Ljava/util/Collection;)J

    move-result-wide v4

    .line 188
    new-instance v6, Ll/ܰ᩶᩻;

    invoke-direct {v6, p0, v4, v5}, Ll/ܰ᩶᩻;-><init>(Ll/۟᩶᩻;J)V

    .line 202
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    iget-object v8, p0, Ll/۟᩶᩻;->ۡ:Ljava/util/HashSet;

    iget-boolean v9, p0, Ll/۟᩶᩻;->ۢ:Z

    iget-wide v10, p0, Ll/۟᩶᩻;->֡:J

    iget-object v12, p0, Ll/۟᩶᩻;->ܺ:Ljava/util/ArrayList;

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 203
    iget-object v13, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v13}, Ll/᩺ۤܿ;->᩻()Z

    move-result v13

    if-eqz v13, :cond_3

    return-void

    .line 207
    :cond_3
    iget-object v13, p0, Ll/۟᩶᩻;->ۖ:Ljava/util/HashSet;

    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    .line 210
    :cond_4
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v9, :cond_6

    .line 212
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_2

    .line 217
    :cond_6
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 225
    :goto_2
    invoke-virtual {v7, v10, v11}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 226
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 227
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 232
    iget-object v8, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const v10, 0x7f120ac0

    invoke-static {v10}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ")"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/᩹ۗܿ;->ܿ(Ljava/lang/CharSequence;)V

    .line 233
    iget-object v8, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    .line 234
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_8

    .line 235
    invoke-virtual {v0, v7}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto/16 :goto_1

    .line 237
    :cond_8
    iget-object v8, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-static {v7, v8, v0, v6}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۠᩶᩻;)V

    .line 238
    iget-wide v8, p0, Ll/۟᩶᩻;->᩻:J

    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v10

    add-long/2addr v10, v8

    iput-wide v10, p0, Ll/۟᩶᩻;->᩻:J

    goto/16 :goto_1

    :cond_9
    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 241
    invoke-static {v4}, Ll/ۛۧᩳ;->֫(Z)V

    const-string v4, "META-INF/"

    .line 242
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 243
    new-instance v4, Ll/ۨ᩶᩻;

    invoke-direct {v4, v10, v11}, Ll/ۨ᩶᩻;-><init>(J)V

    invoke-static {v4}, Ll/ۛۧᩳ;->֫(Ll/ۨ᩶᩻;)V

    :cond_a
    if-nez v9, :cond_b

    .line 247
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 248
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 249
    new-instance v6, Ll/ۗ᩺ۡ;

    invoke-direct {v6, v5}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v6, v10, v11}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 251
    invoke-virtual {v0, v6}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_3

    .line 255
    :cond_b
    iget-object v4, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    const/16 v5, 0x64

    invoke-virtual {v4, v5}, Ll/᩹ۗܿ;->ܿ(I)V

    .line 256
    iget-object v4, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v4, v5}, Ll/᩹ۗܿ;->ܳ(I)V

    .line 258
    invoke-virtual {v0}, Ll/ۡܰۡ;->close()V

    if-eqz v2, :cond_c

    .line 261
    invoke-static {v1}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    iget-object v4, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    iget-object v5, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-static {v0, v4, v2, v5}, Ll/ۤۗܳ;->֫(Lbin/mt/plus/Main;Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/᩹ۗܿ;)V

    .line 263
    :cond_c
    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴܶۡ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 264
    new-instance v0, Ll/ܿ᩵ܿ;

    invoke-direct {v0}, Ll/ܿ᩵ܿ;-><init>()V

    .line 265
    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 267
    iget-object v2, p0, Ll/۟᩶᩻;->ۜ:Ll/᩸᩶᩻;

    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v4

    new-instance v5, Ll/᩺᩶᩻;

    invoke-direct {v5, p0}, Ll/᩺᩶᩻;-><init>(Ll/۟᩶᩻;)V

    iget-object v6, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/AutoCloseable;

    aput-object v6, v7, v3

    invoke-virtual {v2, v4, v5, v7}, Ll/᩸᩶᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V

    .line 271
    invoke-static {v1}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 299
    invoke-static {v0}, Ll/ۛۧᩳ;->֫(Z)V

    const/4 v0, 0x0

    .line 300
    invoke-static {v0}, Ll/ۛۧᩳ;->֫(Ll/ۨ᩶᩻;)V

    .line 301
    iget-object v0, p0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 302
    iget-object v0, p0, Ll/۟᩶᩻;->ۚ:Ll/ᩳܰۡ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 303
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method
