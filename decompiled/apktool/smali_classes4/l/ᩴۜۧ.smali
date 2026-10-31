.class public final Ll/ᩴۜۧ;
.super Ljava/lang/Object;
.source "J8TG"


# instance fields
.field public final ֫:I

.field public final ۧ:[F

.field public final ܽ:I

.field public final ᩳ:[F


# direct methods
.method public constructor <init>(II[F[F)V
    .locals 6

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput p1, p0, Ll/ᩴۜۧ;->ܽ:I

    .line 218
    array-length p1, p3

    int-to-long v0, p1

    const-wide/16 v2, 0x2

    mul-long v0, v0, v2

    array-length p1, p4

    int-to-long v2, p1

    const-wide/16 v4, 0x3

    mul-long v2, v2, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    .line 221
    iput-object p3, p0, Ll/ᩴۜۧ;->ᩳ:[F

    .line 222
    iput-object p4, p0, Ll/ᩴۜۧ;->ۧ:[F

    .line 223
    iput p2, p0, Ll/ᩴۜۧ;->֫:I

    return-void
.end method
