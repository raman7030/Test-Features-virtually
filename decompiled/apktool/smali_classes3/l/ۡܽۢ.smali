.class public final synthetic Ll/ۡܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ۗ:[C

.field public final synthetic ۙ:[C

.field public final synthetic ᩶:[C

.field public final synthetic ᩸:Ll/ۤܽۢ;

.field public final synthetic ᩹:[C


# direct methods
.method public synthetic constructor <init>(Ll/ۤܽۢ;[C[C[C[C)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡܽۢ;->᩸:Ll/ۤܽۢ;

    iput-object p2, p0, Ll/ۡܽۢ;->᩹:[C

    iput-object p3, p0, Ll/ۡܽۢ;->᩶:[C

    iput-object p4, p0, Ll/ۡܽۢ;->ۙ:[C

    iput-object p5, p0, Ll/ۡܽۢ;->ۗ:[C

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 11

    .line 2
    iget-object v0, p0, Ll/ۡܽۢ;->᩸:Ll/ۤܽۢ;

    .line 4
    iget-object v3, p0, Ll/ۡܽۢ;->᩹:[C

    .line 6
    iget-object v5, p0, Ll/ۡܽۢ;->᩶:[C

    .line 8
    iget-object v7, p0, Ll/ۡܽۢ;->ۙ:[C

    .line 10
    iget-object v9, p0, Ll/ۡܽۢ;->ۗ:[C

    .line 12
    check-cast p1, Ll/ܰ֫ۢ;

    .line 344
    :try_start_0
    invoke-virtual {v0}, Ll/ۤܽۢ;->get()Ll/᩺ۖܽ;

    move-result-object v0

    .line 345
    invoke-interface {p1, v0}, Ll/ܰ֫ۢ;->֫(Ll/᩺ۖܽ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 346
    invoke-virtual {v0}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object p1

    .line 348
    invoke-virtual {p1}, Ll/ۨۖܽ;->getValue()[C

    move-result-object v1

    invoke-virtual {p1}, Ll/ۨۖܽ;->length()I

    move-result v2

    array-length v4, v3

    array-length v6, v5

    array-length v8, v7

    array-length v10, v9

    .line 347
    invoke-static/range {v1 .. v10}, Ll/ۗᩳۢ;->֫([CI[CI[CI[CI[CI)Ljava/util/ArrayList;

    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 354
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 355
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 356
    new-instance v3, Ll/᩵ۛ᩷;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 357
    aget v4, v2, v4

    iput v4, v3, Ll/᩵ۛ᩷;->᩸:I

    const/4 v5, 0x1

    .line 358
    aget v2, v2, v5

    iput v2, v3, Ll/᩵ۛ᩷;->᩹:I

    .line 359
    invoke-virtual {v3, v4, v2, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 360
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    return-object v1

    :catchall_0
    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
