.class public final Ll/ܳܺᩴ;
.super Ll/ܿܺᩴ;
.source "AAP5"


# instance fields
.field public final ۬:Ll/ۙۢᩴ;


# direct methods
.method public constructor <init>([IIIILl/ۙۢᩴ;)V
    .locals 0

    or-int/lit8 p4, p4, 0x14

    .line 278
    invoke-direct {p0, p2, p3, p4, p1}, Ll/ܿܺᩴ;-><init>(III[I)V

    .line 279
    iput-object p5, p0, Ll/ܳܺᩴ;->۬:Ll/ۙۢᩴ;

    return-void
.end method


# virtual methods
.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ܳܺᩴ;->۬:Ll/ۙۢᩴ;

    return-object v0
.end method

.method public final getComparator()Ll/ۙۢᩴ;
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ܳܺᩴ;->۬:Ll/ۙۢᩴ;

    return-object v0
.end method

.method public final ֫(II)Ll/ܿܺᩴ;
    .locals 7

    .line 284
    new-instance v6, Ll/ܳܺᩴ;

    iget v4, p0, Ll/ܿܺᩴ;->᩹:I

    iget-object v5, p0, Ll/ܳܺᩴ;->۬:Ll/ۙۢᩴ;

    iget-object v1, p0, Ll/ܿܺᩴ;->᩸:[I

    move-object v0, v6

    move v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Ll/ܳܺᩴ;-><init>([IIIILl/ۙۢᩴ;)V

    return-object v6
.end method
