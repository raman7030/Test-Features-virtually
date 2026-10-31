.class public final Ll/ۗ۫ܳ;
.super Ll/۟ܶۡ;
.source "J4L7"


# instance fields
.field public final synthetic ۜ:Ll/ۛ۫ܳ;

.field public final synthetic ۢ:[I

.field public ܳ:Z

.field public final synthetic ᩷:Ljava/lang/Runnable;

.field public ᩻:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/ۛ۫ܳ;[ILjava/lang/Runnable;)V
    .locals 0

    .line 135
    iput-object p1, p0, Ll/ۗ۫ܳ;->ۜ:Ll/ۛ۫ܳ;

    iput-object p2, p0, Ll/ۗ۫ܳ;->ۢ:[I

    iput-object p3, p0, Ll/ۗ۫ܳ;->᩷:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 192
    iget-boolean v0, p0, Ll/ۗ۫ܳ;->ܳ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    iget-object v0, p0, Ll/ۗ۫ܳ;->᩷:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 200
    iget-object v0, p0, Ll/ۗ۫ܳ;->ۜ:Ll/ۛ۫ܳ;

    invoke-static {v0}, Ll/ۛ۫ܳ;->ܳ(Ll/ۛ۫ܳ;)Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 142
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ۗ۫ܳ;->ۜ:Ll/ۛ۫ܳ;

    invoke-static {v1}, Ll/ۛ۫ܳ;->ܳ(Ll/ۛ۫ܳ;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120528

    .line 143
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 145
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 8

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۗ۫ܳ;->ۢ:[I

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Ll/ۗ۫ܳ;->ۜ:Ll/ۛ۫ܳ;

    if-ge v3, v2, :cond_0

    aget v5, v1, v3

    .line 153
    invoke-static {v4}, Ll/ۛ۫ܳ;->᩷(Ll/ۛ۫ܳ;)[Ll/ۤ۫ܳ;

    move-result-object v4

    aget-object v4, v4, v5

    .line 457
    iget-object v4, v4, Ll/ۤ۫ܳ;->ܽ:Ljava/util/function/Supplier;

    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܺܽ;

    .line 153
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 155
    :cond_0
    invoke-static {v4}, Ll/ۛ۫ܳ;->ۡ(Ll/ۛ۫ܳ;)Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v2

    .line 156
    new-instance v3, Ll/ۚܺܽ;

    invoke-direct {v3, v0}, Ll/ۚܺܽ;-><init>(Ljava/util/List;)V

    .line 157
    :try_start_0
    invoke-static {v4}, Ll/ۛ۫ܳ;->ۜ(Ll/ۛ۫ܳ;)Ll/ᩳۜܳ;

    move-result-object v5

    new-instance v6, Ll/ۙ۫ܳ;

    invoke-direct {v6, p0, v3}, Ll/ۙ۫ܳ;-><init>(Ll/ۗ۫ܳ;Ll/ۚܺܽ;)V

    const/4 v7, 0x0

    .line 193
    invoke-virtual {v2, v7, v5, v6}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    invoke-virtual {v3}, Ll/ۚܺܽ;->close()V

    .line 184
    iget-boolean v2, p0, Ll/ۗ۫ܳ;->ܳ:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v2}, Ll/᩺ۤܿ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    .line 185
    iget-object v2, p0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    const/16 v3, 0x64

    invoke-virtual {v2, v3}, Ll/᩺ۤܿ;->ۧ(I)V

    .line 186
    invoke-static {v4}, Ll/ۛ۫ܳ;->᩻(Ll/ۛ۫ܳ;)Ll/۬۫ܳ;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ll/۬۫ܳ;->֫(Ljava/util/ArrayList;[I)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 156
    :try_start_1
    invoke-virtual {v3}, Ll/ۚܺܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۗ۫ܳ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 206
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    return-void
.end method
