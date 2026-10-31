.class public final Ll/۟ۛܳ;
.super Ll/۟ܶۡ;
.source "O8F2"


# instance fields
.field public final synthetic ۖ:Ll/ܽۢܳ;

.field public ۜ:Ljava/util/ArrayList;

.field public final synthetic ۡ:Ljava/lang/Runnable;

.field public final synthetic ۢ:Ll/֫ۨܳ;

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ܺ:Ljava/util/List;

.field public ᩷:Z

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/֫ۨܳ;Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 160
    iput-object p1, p0, Ll/۟ۛܳ;->ۢ:Ll/֫ۨܳ;

    iput-object p2, p0, Ll/۟ۛܳ;->ۖ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/۟ۛܳ;->ܺ:Ljava/util/List;

    iput-object p4, p0, Ll/۟ۛܳ;->ۡ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 161
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/۟ۛܳ;->ۜ:Ljava/util/ArrayList;

    .line 162
    invoke-static {p1}, Ll/֫ۨܳ;->ۧ(Ll/֫ۨܳ;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ֡᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 209
    iget-object v0, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Ll/۟ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 212
    iput-boolean v0, p0, Ll/۟ۛܳ;->᩷:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 218
    iget-object v0, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    iget-object v0, p0, Ll/۟ۛܳ;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 221
    :cond_0
    iget-object p1, p0, Ll/۟ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 168
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/۟ۛܳ;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f12037a

    .line 169
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const-string v1, "..."

    .line 170
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 172
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 177
    iget-object v0, p0, Ll/۟ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 178
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 180
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 182
    iget-object v1, p0, Ll/۟ۛܳ;->ܺ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۢܳ;

    if-nez v2, :cond_1

    .line 183
    invoke-virtual {v3}, Ll/ۤۢܳ;->ܽ()Ll/ᩳۜܳ;

    move-result-object v4

    instance-of v4, v4, Ll/۫ۛܳ;

    if-eqz v4, :cond_1

    move-object v2, v3

    goto :goto_0

    .line 186
    :cond_1
    invoke-virtual {v3}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    .line 192
    :cond_3
    iget-object v1, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ll/᩺ۤܿ;->ۧ(I)V

    .line 193
    iget-object v1, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v2}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    .line 194
    invoke-virtual {v2}, Ll/ۤۢܳ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 195
    iget-object v1, p0, Ll/۟ۛܳ;->ۢ:Ll/֫ۨܳ;

    invoke-static {v1}, Ll/֫ۨܳ;->֫(Ll/֫ۨܳ;)Ll/ۨۛܳ;

    move-result-object v1

    iget-object v3, p0, Ll/۟ۛܳ;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v3}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    invoke-virtual {v2}, Ll/ۤۢܳ;->ܽ()Ll/ᩳۜܳ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۨۛܳ;->֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;

    move-result-object v1

    .line 197
    :try_start_0
    invoke-virtual {v1}, Ll/᩵ۤܳ;->֫()Ll/᩵ۛۡ;

    move-result-object v3

    iget-object v4, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v4}, Ll/᩺ۤܿ;->ۢ()Ll/ۡۛۡ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/᩵ۛۡ;->ۧ(Ll/ۖۛۡ;)V

    .line 198
    new-instance v3, Ll/ܰۛܳ;

    invoke-direct {v3, p0}, Ll/ܰۛܳ;-><init>(Ll/۟ۛܳ;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v1, v4, v5, v3}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 200
    iget-object v1, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v1}, Ll/᩺ۤܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    return-void

    .line 203
    :cond_4
    invoke-virtual {v2, v0}, Ll/ۤۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 204
    new-instance v1, Ll/ۛۢܳ;

    invoke-virtual {v2}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v3, v2}, Ll/ۛۢܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll/۟ۛܳ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v0

    .line 195
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 226
    iget-object v0, p0, Ll/۟ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 227
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 228
    iget-boolean v0, p0, Ll/۟ۛܳ;->᩷:Z

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Ll/۟ۛܳ;->ۢ:Ll/֫ۨܳ;

    iget-object v1, p0, Ll/۟ۛܳ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ll/ܽ᩷ܳ;->֫(Ljava/util/ArrayList;)V

    .line 231
    :try_start_0
    iget-object v0, p0, Ll/۟ۛܳ;->ۡ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 233
    iget-object v1, p0, Ll/۟ۛܳ;->ۖ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method
