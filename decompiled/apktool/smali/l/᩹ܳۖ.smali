.class public Ll/᩹ܳۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 318
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 321
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 322
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 323
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 325
    :try_start_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩹()I

    move-result v1

    .line 326
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 328
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 328
    throw v0

    .line 331
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    .line 332
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 333
    new-instance v1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-direct {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    .line 335
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 4

    .line 318
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 342
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    .line 343
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 344
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Ll/᩻ۜۖ;->ۧ(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 346
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void
.end method
