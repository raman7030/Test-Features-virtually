.class public final Ll/ۜ᩸᩻;
.super Ll/۟ܶۡ;
.source "X8F2"


# instance fields
.field public final synthetic ۖ:Ljava/util/List;

.field public final synthetic ۘ:Ll/ܽۢܳ;

.field public ۜ:Ljava/util/ArrayList;

.field public final synthetic ۡ:Ll/ۡ᩸᩻;

.field public ۢ:Ll/ۤ᩷֡;

.field public ܳ:Ll/᩹ۗܿ;

.field public final synthetic ܺ:Ljava/lang/Runnable;

.field public ᩷:Z

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۡ᩸᩻;Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 191
    iput-object p1, p0, Ll/ۜ᩸᩻;->ۡ:Ll/ۡ᩸᩻;

    iput-object p2, p0, Ll/ۜ᩸᩻;->ۘ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ۜ᩸᩻;->ۖ:Ljava/util/List;

    iput-object p4, p0, Ll/ۜ᩸᩻;->ܺ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 192
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ۜ᩸᩻;->ۜ:Ljava/util/ArrayList;

    .line 193
    invoke-static {p1}, Ll/ۡ᩸᩻;->ۧ(Ll/ۡ᩸᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ֡᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩸᩻;->᩻:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 265
    iget-object v0, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Ll/ۜ᩸᩻;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 268
    iput-boolean v0, p0, Ll/ۜ᩸᩻;->᩷:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 274
    iget-object v0, p0, Ll/ۜ᩸᩻;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 275
    iget-object p1, p0, Ll/ۜ᩸᩻;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 200
    new-instance v0, Ll/᩹ۗܿ;

    iget-object v1, p0, Ll/ۜ᩸᩻;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩹ۗܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f12037a

    .line 201
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->᩻(I)V

    const-string v1, "..."

    .line 202
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩹ۗܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 204
    invoke-virtual {v0}, Ll/᩹ۗܿ;->ۡ()V

    iput-object v0, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    .line 205
    iget-object v0, p0, Ll/ۜ᩸᩻;->ۖ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 206
    iget-object v0, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩹ۗܿ;->ۖ()V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 13

    .line 211
    iget-object v0, p0, Ll/ۜ᩸᩻;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 212
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 214
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 215
    iget-object v1, p0, Ll/ۜ᩸᩻;->ۡ:Ll/ۡ᩸᩻;

    invoke-virtual {v1}, Ll/ۡ᩸᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    .line 191
    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۤ᩷֡;->֫(Ll/ܶ᩵ܿ;)Ll/ۤ᩷֡;

    move-result-object v2

    .line 215
    iput-object v2, p0, Ll/ۜ᩸᩻;->ۢ:Ll/ۤ᩷֡;

    .line 217
    iget-object v2, p0, Ll/ۜ᩸᩻;->ۖ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۤۢܳ;

    .line 218
    iget-object v7, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v7}, Ll/᩺ۤܿ;->᩻()Z

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v7, 0x1

    add-int/2addr v5, v7

    .line 221
    iget-object v8, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v8, v3}, Ll/᩹ۗܿ;->ܿ(I)V

    .line 222
    iget-object v8, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    int-to-long v9, v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v8, v9, v10, v11, v12}, Ll/᩹ۗܿ;->ܽ(JJ)V

    .line 223
    iget-object v8, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v6}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    .line 224
    invoke-virtual {v6}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    .line 225
    invoke-virtual {v6}, Ll/ۤۢܳ;->ܿ()Ljava/lang/String;

    move-result-object v9

    .line 226
    invoke-virtual {v6}, Ll/ۤۢܳ;->ۜ()Z

    move-result v10

    .line 252
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 253
    invoke-static {v1}, Ll/ۡ᩸᩻;->֫(Ll/ۡ᩸᩻;)Ll/ܿ᩸᩻;

    move-result-object v9

    invoke-virtual {v9, v7}, Ll/ܿ᩸᩻;->getEntry(Ljava/lang/String;)Ll/֨᩷֡;

    move-result-object v7

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v10, :cond_3

    .line 258
    invoke-static {v1}, Ll/ۡ᩸᩻;->֫(Ll/ۡ᩸᩻;)Ll/ܿ᩸᩻;

    move-result-object v7

    invoke-virtual {v7, v8}, Ll/ܿ᩸᩻;->getEntry(Ljava/lang/String;)Ll/֨᩷֡;

    move-result-object v7

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_4

    .line 229
    invoke-virtual {v6}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    .line 232
    :cond_4
    invoke-virtual {v6}, Ll/ۤۢܳ;->᩻()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v8

    .line 233
    iget-object v9, p0, Ll/ۜ᩸᩻;->ۢ:Ll/ۤ᩷֡;

    new-instance v10, Ll/᩻᩸᩻;

    invoke-direct {v10, p0}, Ll/᩻᩸᩻;-><init>(Ll/ۜ᩸᩻;)V

    invoke-static {v9, v7, v8, v10}, Ll/۫ܶ᩻;->֫(Ll/ۤ᩷֡;Ll/֨᩷֡;Ll/ܶ᩵ܿ;Ll/۬ܶ᩻;)V

    .line 245
    invoke-virtual {v6, v8}, Ll/ۤۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 246
    new-instance v9, Ll/ۛۢܳ;

    invoke-virtual {v6}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v9, v8, v6, v7}, Ll/ۛۢܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Ll/ۜ᩸᩻;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    :goto_2
    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 280
    iget-object v0, p0, Ll/ۜ᩸᩻;->ۢ:Ll/ۤ᩷֡;

    if-eqz v0, :cond_0

    .line 281
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 283
    :cond_0
    iget-object v0, p0, Ll/ۜ᩸᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 284
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 285
    iget-boolean v0, p0, Ll/ۜ᩸᩻;->᩷:Z

    if-eqz v0, :cond_1

    .line 286
    iget-object v0, p0, Ll/ۜ᩸᩻;->ۡ:Ll/ۡ᩸᩻;

    iget-object v1, p0, Ll/ۜ᩸᩻;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ll/ܽ᩷ܳ;->֫(Ljava/util/ArrayList;)V

    .line 288
    :try_start_0
    iget-object v0, p0, Ll/ۜ᩸᩻;->ܺ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 290
    iget-object v1, p0, Ll/ۜ᩸᩻;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    return-void
.end method
