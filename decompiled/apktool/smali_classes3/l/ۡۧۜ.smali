.class public final Ll/ۡۧۜ;
.super Ljava/lang/Object;
.source "X770"


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Z

.field public ᩳ:Ll/ᩳܿۜ;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 643
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 634
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡۧۜ;->ܽ:Ljava/util/ArrayList;

    .line 644
    iput p1, p0, Ll/ۡۧۜ;->ۧ:I

    .line 645
    iput p1, p0, Ll/ۡۧۜ;->ܳ:I

    return-void
.end method
