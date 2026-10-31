.class public final Ll/۬۠᩵;
.super Ll/۫۠᩵;
.source "79A7"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final ᩶:Ll/۫۠᩵;

.field public ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۫۠᩵;II)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/۬۠᩵;->᩶:Ll/۫۠᩵;

    iput p2, p0, Ll/۬۠᩵;->᩹:I

    .line 14
    invoke-virtual {p1}, Ll/᩹۠᩵;->ۧ()I

    move-result p1

    .line 41
    invoke-static {p2, p3, p1}, Ll/᩶۠᩵;->֫(III)V

    sub-int/2addr p3, p2

    .line 42
    iput p3, p0, Ll/۬۠᩵;->᩸:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 4

    .line 117
    iget v0, p0, Ll/۬۠᩵;->᩸:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 48
    iget v0, p0, Ll/۬۠᩵;->᩹:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/۬۠᩵;->᩶:Ll/۫۠᩵;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 118
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 54
    iget v0, p0, Ll/۬۠᩵;->᩸:I

    invoke-static {p1, p2, v0}, Ll/᩶۠᩵;->֫(III)V

    .line 55
    new-instance v0, Ll/۬۠᩵;

    iget v1, p0, Ll/۬۠᩵;->᩹:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Ll/۬۠᩵;->᩶:Ll/۫۠᩵;

    invoke-direct {v0, p2, p1, v1}, Ll/۬۠᩵;-><init>(Ll/۫۠᩵;II)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 51
    iget v0, p0, Ll/۬۠᩵;->᩸:I

    return v0
.end method
