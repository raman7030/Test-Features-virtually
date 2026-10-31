.class public final Ll/ۘᩳܿ;
.super Ljava/lang/Object;
.source "068W"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:[C


# direct methods
.method public constructor <init>([CI)V
    .locals 0

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p1, p0, Ll/ۘᩳܿ;->ܽ:[C

    const/4 p1, 0x0

    .line 204
    iput p1, p0, Ll/ۘᩳܿ;->֫:I

    .line 205
    iput p2, p0, Ll/ۘᩳܿ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 254
    iget v0, p0, Ll/ۘᩳܿ;->֫:I

    iget v1, p0, Ll/ۘᩳܿ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ۧ()I
    .locals 3

    .line 248
    iget v0, p0, Ll/ۘᩳܿ;->֫:I

    iget-object v1, p0, Ll/ۘᩳܿ;->ܽ:[C

    array-length v2, v1

    if-lt v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 250
    iput v2, p0, Ll/ۘᩳܿ;->֫:I

    aget-char v0, v1, v0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 6

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    iget v1, p0, Ll/ۘᩳܿ;->֫:I

    iget-object v2, p0, Ll/ۘᩳܿ;->ܽ:[C

    array-length v3, v2

    const/4 v4, -0x1

    if-lt v1, v3, :cond_0

    move-object v3, p0

    goto :goto_1

    .line 240
    :cond_0
    aget-char v1, v2, v1

    move-object v3, p0

    :goto_0
    if-eq v1, v4, :cond_2

    const/16 v5, 0x3c

    if-eq v1, v5, :cond_2

    const/16 v5, 0x3e

    if-eq v1, v5, :cond_2

    const/16 v5, 0x3d

    if-eq v1, v5, :cond_2

    const/16 v5, 0x22

    if-eq v1, v5, :cond_2

    const/16 v5, 0x27

    if-eq v1, v5, :cond_2

    .line 211
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v5

    if-nez v5, :cond_2

    int-to-char v1, v1

    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 244
    iget v1, v3, Ll/ۘᩳܿ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v3, Ll/ۘᩳܿ;->֫:I

    .line 238
    array-length v5, v2

    if-lt v1, v5, :cond_1

    :goto_1
    const/4 v1, -0x1

    goto :goto_0

    .line 240
    :cond_1
    aget-char v1, v2, v1

    goto :goto_0

    .line 216
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 4

    .line 238
    iget v0, p0, Ll/ۘᩳܿ;->֫:I

    iget-object v1, p0, Ll/ۘᩳܿ;->ܽ:[C

    array-length v2, v1

    if-lt v0, v2, :cond_0

    move-object v2, p0

    goto :goto_1

    .line 240
    :cond_0
    aget-char v0, v1, v0

    move-object v2, p0

    .line 221
    :goto_0
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    iget v0, v2, Ll/ۘᩳܿ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v2, Ll/ۘᩳܿ;->֫:I

    .line 238
    array-length v3, v1

    if-lt v0, v3, :cond_1

    :goto_1
    const/4 v0, -0x1

    goto :goto_0

    .line 240
    :cond_1
    aget-char v0, v1, v0

    goto :goto_0

    :cond_2
    return-void
.end method
