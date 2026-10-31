.class public final Ll/᩺۟ۜ;
.super Ljava/lang/Object;
.source "59KW"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1137
    iput p1, p0, Ll/᩺۟ۜ;->᩹:I

    .line 1138
    iput p2, p0, Ll/᩺۟ۜ;->᩸:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1132
    check-cast p1, Ll/᩺۟ۜ;

    .line 1142
    iget v0, p0, Ll/᩺۟ۜ;->᩸:I

    iget v1, p0, Ll/᩺۟ۜ;->᩹:I

    sub-int/2addr v0, v1

    iget v1, p1, Ll/᩺۟ۜ;->᩸:I

    iget p1, p1, Ll/᩺۟ۜ;->᩹:I

    sub-int/2addr v1, p1

    .line 1147
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    neg-int p1, p1

    return p1
.end method
