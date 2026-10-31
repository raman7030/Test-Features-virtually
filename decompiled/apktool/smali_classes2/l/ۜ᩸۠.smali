.class public final Ll/ۜ᩸۠;
.super Ljava/lang/Object;
.source "C420"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۜ᩸۠;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;)V
    .locals 4

    .line 294
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v0

    .line 295
    iget-object v1, p0, Ll/ۜ᩸۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܶ۠;

    if-nez v2, :cond_0

    .line 297
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 299
    :cond_0
    invoke-virtual {v2, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 300
    invoke-virtual {v2, p1}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۛ֡֨;)Ljava/lang/String;
    .locals 4

    .line 304
    invoke-virtual {p1}, Ll/ۛ֡֨;->۟()Ll/ۤܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 305
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v1

    if-nez v1, :cond_3

    .line 306
    iget-object v1, p0, Ll/ۜ᩸۠;->֫:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܶ۠;

    if-eqz v1, :cond_0

    .line 218
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    .line 309
    invoke-virtual {v1, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 310
    :cond_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 312
    :goto_0
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v2, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 313
    invoke-virtual {v1}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_1

    .line 315
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v2, Ll/ۖܶ۠;

    invoke-direct {v2, v1, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 316
    iget-object p1, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object v0, v2

    goto :goto_0

    .line 318
    :cond_1
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, p1, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 319
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, ""

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ۠;

    .line 322
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, "."

    goto :goto_1

    .line 326
    :cond_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method
