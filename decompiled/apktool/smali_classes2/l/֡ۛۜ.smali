.class public final Ll/֡ۛۜ;
.super Ljava/lang/Object;
.source "B6LA"


# instance fields
.field public ֫:Z

.field public final ۜ:[F

.field public ۧ:I

.field public ܳ:Ll/ۗۨۜ;

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:Landroid/graphics/Matrix;

.field public final ᩻:J


# direct methods
.method public constructor <init>(JIJ)V
    .locals 1

    .line 537
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 532
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/֡ۛۜ;->ᩳ:Landroid/graphics/Matrix;

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 533
    iput-object v0, p0, Ll/֡ۛۜ;->ۜ:[F

    .line 538
    iput p3, p0, Ll/֡ۛۜ;->ܿ:I

    iput-wide p1, p0, Ll/֡ۛۜ;->ܽ:J

    iput-wide p4, p0, Ll/֡ۛۜ;->᩻:J

    return-void
.end method
