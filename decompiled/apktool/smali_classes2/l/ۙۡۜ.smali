.class public final Ll/ۙۡۜ;
.super Ljava/lang/Object;
.source "M6XL"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    .line 573
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 574
    iput-boolean p1, p0, Ll/ۙۡۜ;->֫:Z

    .line 575
    iput-boolean p2, p0, Ll/ۙۡۜ;->ۧ:Z

    return-void
.end method

.method public static ֫()Ll/ۙۡۜ;
    .locals 3

    .line 583
    new-instance v0, Ll/ۙۡۜ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۙۡۜ;-><init>(ZZ)V

    return-object v0
.end method

.method public static ֫(Z)Ll/ۙۡۜ;
    .locals 2

    .line 579
    new-instance v0, Ll/ۙۡۜ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/ۙۡۜ;-><init>(ZZ)V

    return-object v0
.end method
