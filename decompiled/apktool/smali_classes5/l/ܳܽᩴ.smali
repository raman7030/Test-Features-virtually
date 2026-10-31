.class public final Ll/ܳܽᩴ;
.super Ll/ܿܽᩴ;
.source "4AQC"


# instance fields
.field public final ۬:Ll/֫ۧᩴ;


# direct methods
.method public constructor <init>([CIIILl/֫ۧᩴ;)V
    .locals 0

    or-int/lit8 p4, p4, 0x14

    .line 280
    invoke-direct {p0, p2, p3, p1, p4}, Ll/ܿܽᩴ;-><init>(II[CI)V

    .line 281
    iput-object p5, p0, Ll/ܳܽᩴ;->۬:Ll/֫ۧᩴ;

    return-void
.end method


# virtual methods
.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ܳܽᩴ;->۬:Ll/֫ۧᩴ;

    return-object v0
.end method

.method public final getComparator()Ll/֫ۧᩴ;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ܳܽᩴ;->۬:Ll/֫ۧᩴ;

    return-object v0
.end method

.method public final ֫(II)Ll/ܿܽᩴ;
    .locals 7

    .line 286
    new-instance v6, Ll/ܳܽᩴ;

    iget v4, p0, Ll/ܿܽᩴ;->᩹:I

    iget-object v5, p0, Ll/ܳܽᩴ;->۬:Ll/֫ۧᩴ;

    iget-object v1, p0, Ll/ܿܽᩴ;->᩸:[C

    move-object v0, v6

    move v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Ll/ܳܽᩴ;-><init>([CIIILl/֫ۧᩴ;)V

    return-object v6
.end method
