.class public final Ll/᩹ۚᩴ;
.super Ll/᩸ۚᩴ;
.source "AAQM"


# instance fields
.field public final ۬:Ljava/util/Comparator;


# direct methods
.method public constructor <init>([Ljava/lang/Object;IIILjava/util/Comparator;)V
    .locals 0

    or-int/lit8 p4, p4, 0x14

    .line 285
    invoke-direct {p0, p2, p3, p4, p1}, Ll/᩸ۚᩴ;-><init>(III[Ljava/lang/Object;)V

    .line 286
    iput-object p5, p0, Ll/᩹ۚᩴ;->۬:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 296
    iget-object v0, p0, Ll/᩹ۚᩴ;->۬:Ljava/util/Comparator;

    return-object v0
.end method

.method public final ֫(II)Ll/᩸ۚᩴ;
    .locals 7

    .line 291
    new-instance v6, Ll/᩹ۚᩴ;

    iget v4, p0, Ll/᩸ۚᩴ;->᩹:I

    iget-object v5, p0, Ll/᩹ۚᩴ;->۬:Ljava/util/Comparator;

    iget-object v1, p0, Ll/᩸ۚᩴ;->᩸:[Ljava/lang/Object;

    move-object v0, v6

    move v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Ll/᩹ۚᩴ;-><init>([Ljava/lang/Object;IIILjava/util/Comparator;)V

    return-object v6
.end method
