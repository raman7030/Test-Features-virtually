.class public final Ll/᩻ᩳۢ;
.super Ljava/lang/Object;
.source "UATT"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput-object p1, p0, Ll/᩻ᩳۢ;->ۧ:Ljava/lang/CharSequence;

    return-void
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0x85

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2028

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2029

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(ILjava/lang/String;)Z
    .locals 5

    .line 403
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p1

    iget-object v1, p0, Ll/᩻ᩳۢ;->ۧ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 406
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    add-int v2, p1, v0

    .line 407
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v2, v4, :cond_1

    :goto_1
    return v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final ֫(IZ)I
    .locals 7

    .line 345
    iget-object v0, p0, Ll/᩻ᩳۢ;->ۧ:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 346
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/16 v3, 0x22

    const/4 v4, 0x1

    if-eq v1, v3, :cond_a

    const/16 v3, 0x27

    if-ne v1, v3, :cond_0

    goto/16 :goto_6

    :cond_0
    const/16 v3, 0x2f

    if-ne v1, v3, :cond_9

    add-int/lit8 v1, p1, 0x1

    if-ge v1, v2, :cond_9

    .line 364
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_6

    if-eqz p2, :cond_4

    const-string p2, "// MARK_"

    .line 386
    invoke-direct {p0, p1, p2}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 p2, p1, 0x8

    const-string v5, "CLASS_"

    .line 391
    invoke-direct {p0, p2, v5}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "FIELD_"

    invoke-direct {p0, p2, v5}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    const-string v5, "METHOD_"

    .line 393
    invoke-direct {p0, p2, v5}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    add-int/lit8 p2, p1, 0xf

    goto :goto_1

    :cond_3
    :goto_0
    add-int/lit8 p2, p1, 0xe

    :goto_1
    const-string v5, "START"

    .line 399
    invoke-direct {p0, p2, v5}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_6

    const-string v5, "END"

    invoke-direct {p0, p2, v5}, Ll/᩻ᩳۢ;->֫(ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    add-int/lit8 p1, p1, 0x2

    :goto_3
    if-ge p1, v2, :cond_5

    .line 367
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    invoke-static {p2}, Ll/᩻ᩳۢ;->֫(C)Z

    move-result p2

    if-nez p2, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    return p1

    :cond_6
    :goto_4
    const/16 p2, 0x2a

    if-ne v1, p2, :cond_9

    .line 372
    iget-boolean v1, p0, Ll/᩻ᩳۢ;->֫:Z

    if-nez v1, :cond_9

    add-int/lit8 v1, p1, 0x2

    :goto_5
    add-int/lit8 v5, v1, 0x1

    if-ge v5, v2, :cond_8

    .line 374
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-ne v6, p2, :cond_7

    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-ne v6, v3, :cond_7

    add-int/lit8 v1, v1, 0x2

    return v1

    :cond_7
    move v1, v5

    goto :goto_5

    .line 379
    :cond_8
    iput-boolean v4, p0, Ll/᩻ᩳۢ;->֫:Z

    :cond_9
    return p1

    :cond_a
    :goto_6
    add-int/2addr p1, v4

    if-ge p1, v2, :cond_d

    .line 349
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    if-ne p2, v1, :cond_b

    add-int/2addr p1, v4

    return p1

    .line 353
    :cond_b
    invoke-static {p2}, Ll/᩻ᩳۢ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_c

    return p1

    :cond_c
    const/16 v3, 0x5c

    if-ne p2, v3, :cond_a

    add-int/lit8 p2, p1, 0x1

    if-ge p2, v2, :cond_a

    .line 357
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/᩻ᩳۢ;->֫(C)Z

    move-result v3

    if-nez v3, :cond_a

    move p1, p2

    goto :goto_6

    :cond_d
    return v2
.end method
