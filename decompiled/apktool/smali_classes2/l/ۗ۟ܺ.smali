.class public final Ll/ۗ۟ܺ;
.super Ljava/lang/Object;
.source "17NL"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 124
    iput v0, p0, Ll/ۗ۟ܺ;->᩸:I

    .line 125
    iput v0, p0, Ll/ۗ۟ܺ;->᩹:I

    .line 129
    iput-object p1, p0, Ll/ۗ۟ܺ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 134
    iget v0, p0, Ll/ۗ۟ܺ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 139
    iget v0, p0, Ll/ۗ۟ܺ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 148
    :goto_0
    iget v2, p0, Ll/ۗ۟ܺ;->᩹:I

    iget-object v3, p0, Ll/ۗ۟ܺ;->᩶:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 149
    iget v2, p0, Ll/ۗ۟ܺ;->᩹:I

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0xa

    if-eq v2, v4, :cond_1

    const/16 v5, 0xd

    if-eq v2, v5, :cond_0

    .line 148
    iget v2, p0, Ll/ۗ۟ܺ;->᩹:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۗ۟ܺ;->᩹:I

    goto :goto_0

    .line 152
    :cond_0
    iget v1, p0, Ll/ۗ۟ܺ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget v1, p0, Ll/ۗ۟ܺ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_1

    .line 153
    iget v1, p0, Ll/ۗ۟ܺ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۗ۟ܺ;->᩹:I

    .line 157
    :cond_1
    iget v1, p0, Ll/ۗ۟ܺ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۗ۟ܺ;->᩹:I

    .line 158
    iput v1, p0, Ll/ۗ۟ܺ;->᩸:I

    goto :goto_1

    .line 164
    :cond_2
    iput v1, p0, Ll/ۗ۟ܺ;->᩸:I

    .line 144
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 140
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 169
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
