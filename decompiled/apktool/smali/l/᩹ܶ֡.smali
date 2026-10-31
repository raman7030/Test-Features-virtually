.class public final Ll/᩹ܶ֡;
.super Ljava/lang/Object;
.source "H5IC"


# instance fields
.field public ֫:I

.field public ۜ:Landroid/util/SparseArray;

.field public ۧ:Z

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Ll/᩹ܶ֡;

    invoke-direct {v0}, Ll/᩹ܶ֡;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 61
    iput v0, p0, Ll/᩹ܶ֡;->֫:I

    const/4 v0, 0x0

    .line 64
    iput-boolean v0, p0, Ll/᩹ܶ֡;->ۧ:Z

    .line 65
    iput-boolean v0, p0, Ll/᩹ܶ֡;->ᩳ:Z

    .line 67
    iput-boolean v0, p0, Ll/᩹ܶ֡;->ܽ:Z

    .line 68
    iput-boolean v0, p0, Ll/᩹ܶ֡;->᩻:Z

    .line 69
    iput-boolean v0, p0, Ll/᩹ܶ֡;->᩷:Z

    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Ll/᩹ܶ֡;->ܿ:Z

    .line 73
    iput-boolean v0, p0, Ll/᩹ܶ֡;->ܳ:Z

    .line 80
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/᩹ܶ֡;->ۜ:Landroid/util/SparseArray;

    return-void
.end method
