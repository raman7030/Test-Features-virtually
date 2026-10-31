.class public final Ll/ܽܳᩳ;
.super Ljava/lang/Object;
.source "M5FD"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 4

    .line 364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 365
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 366
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨܿᩳ;

    .line 367
    iget-object v2, v1, Ll/ۨܿᩳ;->֫:Ljava/lang/String;

    iget-object v3, v1, Ll/ۨܿᩳ;->ۧ:Ljava/util/List;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 368
    :cond_0
    new-instance p1, Ll/ܿܳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Duplicate signed attribute: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ll/ۨܿᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 368
    throw p1

    .line 371
    :cond_1
    iput-object v0, p0, Ll/ܽܳᩳ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method private ֫(Ljava/lang/String;)Ll/᩺ᩳᩳ;
    .locals 3

    .line 375
    iget-object v0, p0, Ll/ܽܳᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 376
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 379
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    const/4 p1, 0x0

    .line 382
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩳᩳ;

    return-object p1

    .line 380
    :cond_1
    new-instance v0, Ll/ܿܳᩳ;

    const-string v1, "Attribute "

    const-string v2, " has multiple values"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 380
    throw v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    const-string v0, "1.2.840.113549.1.9.3"

    .line 386
    invoke-direct {p0, v0}, Ll/ܽܳᩳ;->֫(Ljava/lang/String;)Ll/᩺ᩳᩳ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 391
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/᩺ᩳᩳ;->֫()Ljava/nio/ByteBuffer;

    move-result-object v0

    const-class v1, Ll/֫ܳᩳ;

    invoke-static {v0, v1}, Ll/ܶᩳᩳ;->֫(Ljava/nio/ByteBuffer;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܳᩳ;

    iget-object v0, v0, Ll/֫ܳᩳ;->֫:Ljava/lang/String;
    :try_end_0
    .catch Ll/᩹ᩳᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 393
    new-instance v1, Ll/ܿܳᩳ;

    const-string v2, "Failed to decode OBJECT IDENTIFIER"

    .line 30
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 393
    throw v1
.end method

.method public final ۧ()[B
    .locals 3

    const-string v0, "1.2.840.113549.1.9.4"

    .line 398
    invoke-direct {p0, v0}, Ll/ܽܳᩳ;->֫(Ljava/lang/String;)Ll/᩺ᩳᩳ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 403
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/᩺ᩳᩳ;->֫()Ljava/nio/ByteBuffer;

    move-result-object v0

    const-class v1, Ll/ۧܳᩳ;

    invoke-static {v0, v1}, Ll/ܶᩳᩳ;->֫(Ljava/nio/ByteBuffer;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܳᩳ;

    iget-object v0, v0, Ll/ۧܳᩳ;->֫:[B
    :try_end_0
    .catch Ll/᩹ᩳᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 405
    new-instance v1, Ll/ܿܳᩳ;

    const-string v2, "Failed to decode OBJECT IDENTIFIER"

    .line 30
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 405
    throw v1
.end method
