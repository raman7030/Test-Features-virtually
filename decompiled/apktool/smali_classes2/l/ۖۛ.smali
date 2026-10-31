.class public final Ll/ۖۛ;
.super Ljava/lang/Object;
.source "JB1Y"

# interfaces
.implements Ll/ܺۛ;


# instance fields
.field public final ֫:Landroid/content/ClipData;

.field public final ۧ:Landroid/os/Bundle;

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/ۢۛ;)V
    .locals 3

    .line 380
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 381
    iget-object v0, p1, Ll/ۢۛ;->֫:Landroid/content/ClipData;

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    iput-object v0, p0, Ll/ۖۛ;->֫:Landroid/content/ClipData;

    .line 382
    iget v0, p1, Ll/ۢۛ;->ܿ:I

    if-ltz v0, :cond_2

    const/4 v1, 0x5

    if-gt v0, v1, :cond_1

    iput v0, p0, Ll/ۖۛ;->ܿ:I

    .line 384
    iget v0, p1, Ll/ۢۛ;->ܽ:I

    and-int/lit8 v1, v0, 0x1

    if-ne v1, v0, :cond_0

    iput v0, p0, Ll/ۖۛ;->ܽ:I

    .line 385
    iget-object v0, p1, Ll/ۢۛ;->ᩳ:Landroid/net/Uri;

    iput-object v0, p0, Ll/ۖۛ;->ᩳ:Landroid/net/Uri;

    .line 386
    iget-object p1, p1, Ll/ۢۛ;->ۧ:Landroid/os/Bundle;

    iput-object p1, p0, Ll/ۖۛ;->ۧ:Landroid/os/Bundle;

    return-void

    .line 190
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Requested flags 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but only 0x"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " are allowed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 249
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "source is out of range of [0, 5] (too high)"

    .line 250
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 245
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "source is out of range of [0, 5] (too low)"

    .line 246
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getSource()I
    .locals 1

    .line 404
    iget v0, p0, Ll/ۖۛ;->ܿ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 428
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{clip="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖۛ;->֫:Landroid/content/ClipData;

    .line 429
    invoke-virtual {v1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    iget v1, p0, Ll/ۖۛ;->ܿ:I

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    .line 112
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "SOURCE_PROCESS_TEXT"

    goto :goto_0

    :cond_1
    const-string v1, "SOURCE_AUTOFILL"

    goto :goto_0

    :cond_2
    const-string v1, "SOURCE_DRAG_AND_DROP"

    goto :goto_0

    :cond_3
    const-string v1, "SOURCE_INPUT_METHOD"

    goto :goto_0

    :cond_4
    const-string v1, "SOURCE_CLIPBOARD"

    goto :goto_0

    :cond_5
    const-string v1, "SOURCE_APP"

    .line 430
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    iget v1, p0, Ll/ۖۛ;->ܽ:I

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_6

    const-string v1, "FLAG_CONVERT_TO_PLAIN_TEXT"

    goto :goto_1

    .line 141
    :cond_6
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 431
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ""

    .line 432
    iget-object v2, p0, Ll/ۖۛ;->ᩳ:Landroid/net/Uri;

    if-nez v2, :cond_7

    move-object v2, v1

    goto :goto_2

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ", hasLinkUri("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    iget-object v2, p0, Ll/ۖۛ;->ۧ:Landroid/os/Bundle;

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, ", hasExtras"

    :goto_3
    const-string v2, "}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/view/ContentInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ()Landroid/content/ClipData;
    .locals 1

    .line 398
    iget-object v0, p0, Ll/ۖۛ;->֫:Landroid/content/ClipData;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 410
    iget v0, p0, Ll/ۖۛ;->ܽ:I

    return v0
.end method
