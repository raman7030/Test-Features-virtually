.class public final Ll/ܿ۟᩷;
.super Ll/۟ܶۡ;
.source "M1KQ"


# instance fields
.field public final synthetic ۜ:Ljava/lang/String;

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ᩷:Ll/ᩳ۬ܿ;

.field public final synthetic ᩻:Ll/᩵۟᩷;


# direct methods
.method public constructor <init>(Ll/᩵۟᩷;Ljava/lang/String;Ll/ᩳ۬ܿ;)V
    .locals 0

    .line 329
    iput-object p1, p0, Ll/ܿ۟᩷;->᩻:Ll/᩵۟᩷;

    iput-object p2, p0, Ll/ܿ۟᩷;->ۜ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܿ۟᩷;->᩷:Ll/ᩳ۬ܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 358
    iget-object v0, p0, Ll/ܿ۟᩷;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 359
    iget-object v1, p0, Ll/ܿ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v1, v0}, Ll/᩵۟᩷;->ۧ(Ll/᩵۟᩷;Z)V

    .line 360
    invoke-static {v1}, Ll/᩵۟᩷;->ۖ(Ll/᩵۟᩷;)V

    .line 361
    invoke-static {v1}, Ll/᩵۟᩷;->ܽ(Ll/᩵۟᩷;)Ll/ܺ۟᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 367
    iget-object v0, p0, Ll/ܿ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v0}, Ll/᩵۟᩷;->ۡ(Ll/᩵۟᩷;)Ll/ۘۛ᩷;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 334
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ܿ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120528

    .line 335
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 337
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ܿ۟᩷;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 342
    iget-object v0, p0, Ll/ܿ۟᩷;->ۜ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v1, v0}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Ljava/lang/String;)V

    .line 344
    invoke-static {v1}, Ll/᩵۟᩷;->᩻(Ll/᩵۟᩷;)[I

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Ll/᩵۟᩷;->᩻(Ll/᩵۟᩷;)[I

    move-result-object v0

    array-length v0, v0

    invoke-static {v1}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 345
    :cond_0
    invoke-static {v1}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    invoke-static {v1, v0}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;[I)V

    :cond_1
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 346
    :goto_0
    invoke-static {v1}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 347
    invoke-static {v1}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻۟᩷;

    invoke-virtual {v3}, Ll/᩻۟᩷;->ۧ()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/ܿ۟᩷;->᩷:Ll/ᩳ۬ܿ;

    invoke-virtual {v4, v3}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 348
    invoke-static {v1}, Ll/᩵۟᩷;->᩻(Ll/᩵۟᩷;)[I

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    aput v0, v3, v2

    move v2, v4

    .line 349
    :cond_2
    iget-object v3, p0, Ll/ܿ۟᩷;->ܳ:Ll/᩺ۤܿ;

    mul-int/lit8 v4, v2, 0x64

    invoke-static {v1}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    div-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ll/᩺ۤܿ;->ۧ(I)V

    .line 350
    iget-object v3, p0, Ll/ܿ۟᩷;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v3}, Ll/᩺ۤܿ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 353
    :cond_4
    invoke-static {v1, v2}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;I)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 372
    iget-object v0, p0, Ll/ܿ۟᩷;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method
