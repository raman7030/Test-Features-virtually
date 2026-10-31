.class public Ll/ۙ۟ۜ;
.super Ljava/lang/Object;
.source "69LN"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Ll/ۙ۟ۜ;->᩹:I

    .line 16
    iput p2, p0, Ll/ۙ۟ۜ;->᩸:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 5
    check-cast p1, Ll/ۙ۟ۜ;

    .line 27
    iget v0, p0, Ll/ۙ۟ۜ;->᩹:I

    iget p1, p1, Ll/ۙ۟ۜ;->᩹:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ۙ۟ۜ;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۙ۟ۜ;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
