.class public final Ll/۫ܰ᩵;
.super Ljava/lang/Object;
.source "44FR"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۤܰ᩵;
    .locals 1

    .line 401
    new-instance v0, Ll/ۤܰ᩵;

    invoke-direct {v0, p0}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    const-string v0, ":"

    const/4 v1, 0x1

    .line 286
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v0, 0x0

    .line 288
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 289
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v2, ""

    if-eqz v0, :cond_1

    .line 292
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 294
    :cond_1
    invoke-virtual {p0, v2, p1}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 311
    invoke-static {p1}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 312
    invoke-static {p2, p1}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-virtual {p0, p1, p2}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 392
    iget-object v0, p0, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_1

    .line 393
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 394
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 362
    iget-object v0, p0, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 368
    :goto_0
    iget-object v1, p0, Ll/۫ܰ᩵;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 369
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 370
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 371
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x2

    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    return-void
.end method
