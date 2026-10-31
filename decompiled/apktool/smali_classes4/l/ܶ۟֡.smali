.class public abstract Ll/ܶ۟֡;
.super Ljava/util/AbstractSequentialList;
.source "365W"


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܶ۟֡;->᩸:Ll/۬ۛ֡;

    .line 49
    iput p2, p0, Ll/ܶ۟֡;->᩹:I

    .line 50
    iput p3, p0, Ll/ܶ۟֡;->᩶:I

    return-void
.end method


# virtual methods
.method public final listIterator()Ljava/util/ListIterator;
    .locals 4

    .line 69
    new-instance v0, Ll/۠۟֡;

    iget v1, p0, Ll/ܶ۟֡;->᩹:I

    iget v2, p0, Ll/ܶ۟֡;->᩶:I

    iget-object v3, p0, Ll/ܶ۟֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/۠۟֡;-><init>(Ll/ܶ۟֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 4

    .line 69
    new-instance v0, Ll/۠۟֡;

    iget v1, p0, Ll/ܶ۟֡;->᩹:I

    iget v2, p0, Ll/ܶ۟֡;->᩶:I

    iget-object v3, p0, Ll/ܶ۟֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/۠۟֡;-><init>(Ll/ܶ۟֡;Ll/۬ۛ֡;II)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 76
    invoke-virtual {v0}, Ll/᩸۟֡;->next()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 63
    iget v0, p0, Ll/ܶ۟֡;->᩶:I

    return v0
.end method

.method public abstract ֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;
.end method
