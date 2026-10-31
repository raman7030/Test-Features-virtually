.class public final Ll/֨᩹ۘ;
.super Ljava/lang/Object;
.source "SA89"


# instance fields
.field public final ֫:Ljava/lang/Long;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/util/Date;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/۠᩹ۘ;Lcom/thegrizzlylabs/sardineandroid/model/Response;)V
    .locals 6

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object v0

    .line 210
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    .line 213
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 214
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 215
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getCreationdate()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    move-object v0, v2

    .line 108
    :goto_1
    invoke-static {v0}, Ll/ܳ᩶ۘ;->֫(Ljava/lang/String;)Ljava/util/Date;

    .line 186
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object v0

    .line 187
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 190
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 191
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 192
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetlastmodified()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    :goto_2
    move-object v0, v2

    .line 109
    :goto_3
    invoke-static {v0}, Ll/ܳ᩶ۘ;->֫(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩹ۘ;->ܽ:Ljava/util/Date;

    .line 234
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object v0

    .line 235
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    .line 238
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 239
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 240
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getResourcetype()Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 241
    invoke-virtual {v2}, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->getCollection()Lcom/thegrizzlylabs/sardineandroid/model/Collection;

    move-result-object v2

    if-eqz v2, :cond_8

    const-string v2, "httpd/unix-directory"

    goto :goto_4

    .line 244
    :cond_8
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetcontenttype()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 245
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetcontenttype()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_9
    const-string v2, "application/octet-stream"

    .line 110
    :goto_4
    iput-object v2, p0, Ll/֨᩹ۘ;->ۧ:Ljava/lang/String;

    .line 111
    invoke-static {p1, p2}, Ll/۠᩹ۘ;->֫(Ll/۠᩹ۘ;Lcom/thegrizzlylabs/sardineandroid/model/Response;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩹ۘ;->֫:Ljava/lang/Long;

    .line 285
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 286
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_5

    .line 289
    :cond_a
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 290
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 291
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetetag()Ljava/lang/String;

    .line 334
    :cond_c
    :goto_5
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 335
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_6

    .line 338
    :cond_d
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 339
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 340
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getDisplayname()Ljava/lang/String;

    .line 353
    :cond_f
    :goto_6
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 354
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 355
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_8

    .line 357
    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 358
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 359
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    if-eqz v2, :cond_11

    .line 360
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getResourcetype()Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 362
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->getCollection()Lcom/thegrizzlylabs/sardineandroid/model/Collection;

    move-result-object v2

    const-string v3, "D"

    const-string v4, "DAV:"

    if-eqz v2, :cond_12

    .line 230
    new-instance v2, Ljavax/xml/namespace/QName;

    const-string v5, "collection"

    invoke-direct {v2, v4, v5, v3}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    :cond_12
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->getPrincipal()Lcom/thegrizzlylabs/sardineandroid/model/Principal;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 230
    new-instance v2, Ljavax/xml/namespace/QName;

    const-string v5, "principal"

    invoke-direct {v2, v4, v5, v3}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    :cond_13
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->getAny()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/Element;

    .line 369
    invoke-static {v2}, Ll/ܳ᩶ۘ;->֫(Lorg/w3c/dom/Element;)Ljavax/xml/namespace/QName;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_14
    move-object p1, v0

    .line 114
    :goto_8
    iput-object p1, p0, Ll/֨᩹ۘ;->ᩳ:Ljava/util/List;

    .line 309
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 310
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_9

    .line 313
    :cond_15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_16
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 314
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    if-eqz v1, :cond_16

    .line 315
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getResourcetype()Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 316
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->getCollection()Lcom/thegrizzlylabs/sardineandroid/model/Collection;

    move-result-object p1

    if-eqz p1, :cond_17

    goto :goto_9

    .line 320
    :cond_17
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetcontentlanguage()Ljava/lang/String;

    .line 419
    :cond_18
    :goto_9
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 420
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_b

    .line 423
    :cond_19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 424
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 425
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    if-eqz v2, :cond_1a

    .line 426
    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getAny()Ljava/util/List;

    move-result-object v1

    .line 427
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/Element;

    .line 428
    invoke-static {v2}, Ll/ܳ᩶ۘ;->֫(Lorg/w3c/dom/Element;)Ljavax/xml/namespace/QName;

    move-result-object v3

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 436
    :cond_1b
    :goto_b
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 437
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_c

    .line 440
    :cond_1c
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 441
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v1

    if-eqz v1, :cond_1d

    .line 442
    invoke-virtual {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getLockdiscovery()Lcom/thegrizzlylabs/sardineandroid/model/Lockdiscovery;

    .line 449
    :cond_1e
    :goto_c
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p1

    .line 450
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1f

    goto :goto_d

    .line 453
    :cond_1f
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_21

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 454
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 455
    invoke-virtual {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getSupportedlock()Lcom/thegrizzlylabs/sardineandroid/model/Supportedlock;

    :cond_21
    :goto_d
    return-void
.end method
