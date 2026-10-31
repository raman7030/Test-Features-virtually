.class public final Ll/ۚۨ֡;
.super Ljava/util/AbstractList;
.source "T65P"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܰۨ֡;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ܰۨ֡;III)V
    .locals 0

    .line 274
    iput-object p1, p0, Ll/ۚۨ֡;->᩸:Ll/ܰۨ֡;

    iput p2, p0, Ll/ۚۨ֡;->᩹:I

    iput p3, p0, Ll/ۚۨ֡;->ۙ:I

    iput p4, p0, Ll/ۚۨ֡;->᩶:I

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 4

    if-ltz p1, :cond_1

    .line 277
    iget v0, p0, Ll/ۚۨ֡;->᩹:I

    if-ge p1, v0, :cond_1

    .line 280
    iget-object v0, p0, Ll/ۚۨ֡;->᩸:Ll/ܰۨ֡;

    invoke-static {v0}, Ll/ܰۨ֡;->֫(Ll/ܰۨ֡;)Z

    move-result v1

    iget v2, p0, Ll/ۚۨ֡;->᩶:I

    iget v3, p0, Ll/ۚۨ֡;->ۙ:I

    if-eqz v1, :cond_0

    .line 281
    new-instance v1, Ll/ۙۨ֡;

    mul-int p1, p1, v2

    add-int/2addr p1, v3

    invoke-direct {v1, v0, p1}, Ll/ۙۨ֡;-><init>(Ll/ܰۨ֡;I)V

    return-object v1

    .line 283
    :cond_0
    new-instance v1, Ll/᩶ۨ֡;

    mul-int p1, p1, v2

    add-int/2addr p1, v3

    invoke-direct {v1, v0, p1}, Ll/᩶ۨ֡;-><init>(Ll/ܰۨ֡;I)V

    return-object v1

    .line 278
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 289
    iget v0, p0, Ll/ۚۨ֡;->᩹:I

    return v0
.end method
