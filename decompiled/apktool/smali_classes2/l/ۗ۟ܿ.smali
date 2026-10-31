.class public final Ll/ۗ۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# instance fields
.field public final ֫:J

.field public final ۧ:Z

.field public final ܽ:I


# direct methods
.method public constructor <init>(JIZ)V
    .locals 0

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 624
    iput-boolean p4, p0, Ll/ۗ۟ܿ;->ۧ:Z

    .line 625
    iput-wide p1, p0, Ll/ۗ۟ܿ;->֫:J

    .line 626
    iput p3, p0, Ll/ۗ۟ܿ;->ܽ:I

    return-void
.end method

.method public static ֫()Ll/ۗ۟ܿ;
    .locals 5

    .line 630
    new-instance v0, Ll/ۗ۟ܿ;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۗ۟ܿ;-><init>(JIZ)V

    return-object v0
.end method

.method public static ֫(IJ)Ll/ۗ۟ܿ;
    .locals 2

    .line 634
    new-instance v0, Ll/ۗ۟ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p0, v1}, Ll/ۗ۟ܿ;-><init>(JIZ)V

    return-object v0
.end method
