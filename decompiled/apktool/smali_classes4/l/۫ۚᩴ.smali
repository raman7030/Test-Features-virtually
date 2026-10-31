.class public final Ll/۫ۚᩴ;
.super Ll/۬ۚᩴ;
.source "AAQM"


# instance fields
.field public final ۬:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ll/ܶ֡ᩴ;JLjava/util/Comparator;)V
    .locals 1

    const/16 v0, 0x55

    .line 1239
    invoke-direct {p0, p1, p2, p3, v0}, Ll/۬ۚᩴ;-><init>(Ll/۫֡ᩴ;JI)V

    .line 1240
    iput-object p4, p0, Ll/۫ۚᩴ;->۬:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 1245
    iget-object v0, p0, Ll/۫ۚᩴ;->۬:Ljava/util/Comparator;

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)Ll/۠ۚᩴ;
    .locals 7

    .line 361
    array-length v0, p2

    const/4 v3, 0x0

    invoke-static {v0, v3, p1}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 399
    new-instance v0, Ll/᩹ۚᩴ;

    iget v5, p0, Ll/۬ۚᩴ;->᩸:I

    iget-object v6, p0, Ll/۫ۚᩴ;->۬:Ljava/util/Comparator;

    move-object v1, v0

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v6}, Ll/᩹ۚᩴ;-><init>([Ljava/lang/Object;IIILjava/util/Comparator;)V

    return-object v0
.end method
