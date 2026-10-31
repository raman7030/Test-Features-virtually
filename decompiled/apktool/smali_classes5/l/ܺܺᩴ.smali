.class public final Ll/ܺܺᩴ;
.super Ll/ۡܺᩴ;
.source "AAP5"


# instance fields
.field public final ۬:Ll/ۙۢᩴ;


# direct methods
.method public constructor <init>(Ll/ܶۡᩴ;JLl/ۙۢᩴ;)V
    .locals 1

    const/16 v0, 0x155

    .line 1416
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۡܺᩴ;-><init>(Ll/ۜۡᩴ;JI)V

    .line 1417
    iput-object p4, p0, Ll/ܺܺᩴ;->۬:Ll/ۙۢᩴ;

    return-void
.end method


# virtual methods
.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 1422
    iget-object v0, p0, Ll/ܺܺᩴ;->۬:Ll/ۙۢᩴ;

    return-object v0
.end method

.method public final getComparator()Ll/ۙۢᩴ;
    .locals 1

    .line 1422
    iget-object v0, p0, Ll/ܺܺᩴ;->۬:Ll/ۙۢᩴ;

    return-object v0
.end method

.method public final ֫(I[I)Ll/ܽܺᩴ;
    .locals 7

    .line 356
    array-length v0, p2

    const/4 v3, 0x0

    invoke-static {v0, v3, p1}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 392
    new-instance v0, Ll/ܳܺᩴ;

    iget v5, p0, Ll/ۡܺᩴ;->᩸:I

    iget-object v6, p0, Ll/ܺܺᩴ;->۬:Ll/ۙۢᩴ;

    move-object v1, v0

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v6}, Ll/ܳܺᩴ;-><init>([IIIILl/ۙۢᩴ;)V

    return-object v0
.end method
