.class public final Ll/۠ۜۖ;
.super Ll/ܶۜۖ;
.source "Y4D9"


# instance fields
.field public final synthetic ᩶:Ll/ۛۜۖ;

.field public final ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۛۜۖ;)V
    .locals 1

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object p1, p0, Ll/۠ۜۖ;->᩶:Ll/ۛۜۖ;

    const/4 v0, 0x0

    .line 158
    iput v0, p0, Ll/۠ۜۖ;->᩹:I

    .line 159
    invoke-virtual {p1}, Ll/ۛۜۖ;->size()I

    move-result p1

    iput p1, p0, Ll/۠ۜۖ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 163
    iget v0, p0, Ll/۠ۜۖ;->᩹:I

    iget v1, p0, Ll/۠ۜۖ;->᩸:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextByte()B
    .locals 2

    .line 168
    iget v0, p0, Ll/۠ۜۖ;->᩹:I

    .line 169
    iget v1, p0, Ll/۠ۜۖ;->᩸:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 172
    iput v1, p0, Ll/۠ۜۖ;->᩹:I

    .line 173
    iget-object v1, p0, Ll/۠ۜۖ;->᩶:Ll/ۛۜۖ;

    invoke-virtual {v1, v0}, Ll/ۛۜۖ;->ۧ(I)B

    move-result v0

    return v0

    .line 170
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
