.class public final Ll/᩺ᩳۘ;
.super Ljava/lang/Object;
.source "P1MC"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/ۚܿۘ;

.field public final ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/ۚܿۘ;)V
    .locals 5

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    iput-object p1, p0, Ll/᩺ᩳۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 343
    iput-object p2, p0, Ll/᩺ᩳۘ;->ܽ:Ll/ۚܿۘ;

    .line 377
    sget-object v0, Ll/ۨᩳۘ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_6

    .line 163
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 164
    invoke-static {v3}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 387
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 381
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {v2, p2, p1}, Ll/ۗܿۘ;->ۧ(IILjava/lang/CharSequence;)I

    move-result p2

    .line 382
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, v0, p1}, Ll/ۗܿۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v0

    .line 383
    invoke-static {p2, v0, p1}, Ll/ۧ᩷ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    goto :goto_3

    .line 140
    :cond_3
    instance-of p2, p1, Ljava/lang/String;

    if-nez p2, :cond_5

    instance-of p2, p1, Ll/ܿ᩻ۘ;

    if-eqz p2, :cond_4

    goto :goto_1

    .line 145
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {v2, p2, p1}, Ll/ۧ᩷ܽ;->֫(IILjava/lang/CharSequence;)I

    move-result p2

    goto :goto_2

    .line 142
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    :goto_2
    move v1, p2

    .line 344
    :cond_6
    :goto_3
    iput v1, p0, Ll/᩺ᩳۘ;->֫:I

    .line 351
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 v0, 0x0

    :goto_4
    if-ge v2, p2, :cond_8

    .line 355
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 356
    invoke-static {v1}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_7

    add-int/lit8 v0, v0, 0x1

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 345
    :cond_8
    iput v0, p0, Ll/᩺ᩳۘ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ᩳۘ;)Ll/ۚܿۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ᩳۘ;->ܽ:Ll/ۚܿۘ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 403
    const-class v2, Ll/᩺ᩳۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 405
    :cond_1
    check-cast p1, Ll/᩺ᩳۘ;

    .line 415
    iget v2, p0, Ll/᩺ᩳۘ;->֫:I

    iget v3, p1, Ll/᩺ᩳۘ;->֫:I

    if-eq v2, v3, :cond_2

    return v1

    .line 393
    :cond_2
    iget-object p1, p1, Ll/᩺ᩳۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 364
    sget-object v1, Ll/ۨᩳۘ;->֫:[I

    iget-object v2, p0, Ll/᩺ᩳۘ;->ܽ:Ll/ۚܿۘ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    iget-object v3, p0, Ll/᩺ᩳۘ;->ᩳ:Ljava/lang/CharSequence;

    if-eq v1, v0, :cond_5

    const/4 v0, 0x2

    if-eq v1, v0, :cond_4

    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    .line 370
    invoke-static {v3, p1}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 372
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 368
    :cond_4
    invoke-static {v3, p1}, Ll/ۧ᩷ܽ;->ۧ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 65
    :cond_5
    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 415
    iget v0, p0, Ll/᩺ᩳۘ;->֫:I

    return v0
.end method

.method public final ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 393
    iget-object v0, p0, Ll/᩺ᩳۘ;->ᩳ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 397
    iget v0, p0, Ll/᩺ᩳۘ;->ۧ:I

    return v0
.end method
