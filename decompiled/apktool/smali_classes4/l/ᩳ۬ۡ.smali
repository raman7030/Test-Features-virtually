.class public final Ll/ᩳ۬ۡ;
.super Ljava/lang/Object;
.source "J1UA"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ᩳ۬ۡ;->ۧ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x3c

    if-ne v0, v2, :cond_3

    .line 53
    iput v1, p0, Ll/ᩳ۬ۡ;->ܽ:I

    const/4 v0, 0x1

    .line 57
    :cond_0
    iget v3, p0, Ll/ᩳ۬ۡ;->ܽ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ᩳ۬ۡ;->ܽ:I

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v2, :cond_2

    const/16 v4, 0x3e

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-gtz v0, :cond_0

    :cond_3
    const/16 v0, 0x28

    .line 72
    iget v2, p0, Ll/ᩳ۬ۡ;->ܽ:I

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-ltz v0, :cond_4

    const/16 v2, 0x29

    .line 76
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    :goto_1
    iput p1, p0, Ll/ᩳ۬ۡ;->֫:I

    if-ltz v0, :cond_5

    add-int/2addr v0, v1

    goto :goto_2

    .line 81
    :cond_5
    iget v0, p0, Ll/ᩳ۬ۡ;->ܽ:I

    :goto_2
    iput v0, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    return-void
.end method

.method private ܽ()V
    .locals 3

    const/4 v0, 0x1

    .line 180
    :cond_0
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    iget-object v2, p0, Ll/ᩳ۬ۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3c

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-gtz v0, :cond_0

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 114
    iget v0, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    iget v1, p0, Ll/ᩳ۬ۡ;->֫:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 5

    .line 122
    iget v0, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    .line 155
    :goto_0
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    iget-object v2, p0, Ll/ᩳ۬ۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x5b

    if-ne v1, v3, :cond_0

    .line 156
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    goto :goto_0

    .line 126
    :cond_0
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x3c

    if-eq v1, v3, :cond_3

    const/16 v4, 0x4c

    if-eq v1, v4, :cond_1

    const/16 v4, 0x54

    if-eq v1, v4, :cond_1

    goto :goto_2

    .line 163
    :cond_1
    :goto_1
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    add-int/lit8 v4, v1, 0x1

    iput v4, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x3b

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_2

    goto :goto_1

    .line 166
    :cond_2
    invoke-direct {p0}, Ll/ᩳ۬ۡ;->ܽ()V

    goto :goto_1

    .line 134
    :cond_3
    invoke-direct {p0}, Ll/ᩳ۬ۡ;->ܽ()V

    .line 139
    :cond_4
    :goto_2
    iget v1, p0, Ll/ᩳ۬ۡ;->ᩳ:I

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
