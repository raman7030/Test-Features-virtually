.class public abstract Ll/᩵ᩳ;
.super Ljava/lang/Object;
.source "YB7L"


# instance fields
.field public final transient ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܳ:Landroid/os/Bundle;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/HashMap;

.field public ᩳ:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->ۧ:Ljava/util/HashMap;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    .line 77
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 5

    .line 425
    iget-object v0, p0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    return-void

    .line 441
    :cond_0
    sget-object v1, Ll/᩵᩶᩵;->᩸:Ll/ᩴ᩶᩵;

    invoke-virtual {v1}, Ll/ᩴ᩶᩵;->ۧ()I

    move-result v1

    const/high16 v2, 0x10000

    :goto_0
    add-int/2addr v1, v2

    .line 443
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 444
    sget-object v1, Ll/᩵᩶᩵;->᩸:Ll/ᩴ᩶᩵;

    invoke-virtual {v1}, Ll/ᩴ᩶᩵;->ۧ()I

    move-result v1

    goto :goto_0

    .line 451
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 2

    .line 215
    invoke-direct {p0, p1}, Ll/᩵ᩳ;->ۧ(Ljava/lang/String;)V

    .line 216
    new-instance v0, Ll/ۘᩳ;

    invoke-direct {v0, p2, p3}, Ll/ۘᩳ;-><init>(Ll/᩸ᩳ;Ll/᩷ᩳ;)V

    iget-object v1, p0, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    iget-object v0, p0, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 220
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 221
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    invoke-interface {p3, v1}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    .line 224
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ll/ۜᩳ;

    if-eqz v1, :cond_1

    .line 226
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v1}, Ll/ۜᩳ;->ۧ()I

    move-result v0

    .line 229
    invoke-virtual {v1}, Ll/ۜᩳ;->֫()Landroid/content/Intent;

    move-result-object v1

    .line 227
    invoke-virtual {p2, v1, v0}, Ll/᩸ᩳ;->֫(Landroid/content/Intent;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, v0}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    .line 232
    :cond_1
    new-instance p3, Ll/ۖᩳ;

    invoke-direct {p3, p0, p1, p2}, Ll/ۖᩳ;-><init>(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩸ᩳ;)V

    return-object p3
.end method

.method public final ֫(Ljava/lang/String;Ll/᩻ۡ֫;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 3

    .line 116
    invoke-interface {p2}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v1, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 125
    invoke-direct {p0, p1}, Ll/᩵ᩳ;->ۧ(Ljava/lang/String;)V

    .line 126
    iget-object p2, p0, Ll/᩵ᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴᩳ;

    if-nez v1, :cond_0

    .line 128
    new-instance v1, Ll/ᩴᩳ;

    invoke-direct {v1, v0}, Ll/ᩴᩳ;-><init>(Ll/۟ۢ֫;)V

    .line 130
    :cond_0
    new-instance v0, Ll/ۡᩳ;

    invoke-direct {v0, p0, p1, p4, p3}, Ll/ۡᩳ;-><init>(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩷ᩳ;Ll/᩸ᩳ;)V

    .line 158
    invoke-virtual {v1, v0}, Ll/ᩴᩳ;->֫(Ll/ܿۡ֫;)V

    .line 159
    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    new-instance p2, Ll/ܺᩳ;

    invoke-direct {p2, p0, p1, p3}, Ll/ܺᩳ;-><init>(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩸ᩳ;)V

    return-object p2

    .line 119
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "LifecycleOwner "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is attempting to register while current state is "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". LifecycleOwners must call register before they are STARTED."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 386
    iget-object v0, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    .line 391
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘᩳ;

    if-eqz v0, :cond_2

    .line 392
    iget-object v0, v0, Ll/ۘᩳ;->֫:Ll/᩷ᩳ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 401
    :cond_1
    iget-object v1, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 402
    invoke-interface {v0, p2}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 394
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 396
    iget-object v0, p0, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void
.end method

.method public abstract ֫(ILl/᩸ᩳ;Ljava/lang/Object;)V
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 7

    const-string v0, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 325
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 327
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 332
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    const-string v2, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 334
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 333
    iget-object v2, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 335
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p1, v3, :cond_2

    .line 336
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 341
    iget-object v4, p0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    if-eqz v5, :cond_1

    .line 342
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 346
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 347
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 451
    invoke-virtual {v6, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 273
    iget-object v0, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 277
    iget-object v1, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    iget-object v0, p0, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 283
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    :cond_1
    iget-object v0, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 288
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 289
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 291
    :cond_2
    iget-object v0, p0, Ll/᩵ᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴᩳ;

    if-eqz v1, :cond_3

    .line 293
    invoke-virtual {v1}, Ll/ᩴᩳ;->֫()V

    .line 294
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final ֫(IILandroid/content/Intent;)Z
    .locals 3

    .line 367
    iget-object v0, p0, Ll/᩵ᩳ;->᩻:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 371
    :cond_0
    iget-object v0, p0, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘᩳ;

    if-eqz v0, :cond_1

    .line 410
    iget-object v1, v0, Ll/ۘᩳ;->֫:Ll/᩷ᩳ;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    .line 411
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 413
    iget-object v0, v0, Ll/ۘᩳ;->ۧ:Ll/᩸ᩳ;

    .line 414
    invoke-virtual {v0, p3, p2}, Ll/᩸ᩳ;->֫(Landroid/content/Intent;I)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p2}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    .line 415
    iget-object p2, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 418
    :cond_1
    iget-object v0, p0, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    new-instance v0, Ll/ۜᩳ;

    invoke-direct {v0, p3, p2}, Ll/ۜᩳ;-><init>(Landroid/content/Intent;I)V

    iget-object p2, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Landroid/os/Bundle;)V
    .locals 3

    .line 304
    new-instance v0, Ljava/util/ArrayList;

    .line 305
    iget-object v1, p0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 304
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 306
    new-instance v0, Ljava/util/ArrayList;

    .line 307
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 306
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 308
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 310
    iget-object v0, p0, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    .line 311
    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 310
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
