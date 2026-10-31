.class public final Ll/᩵᩷֨;
.super Ljava/lang/Object;
.source "W1QC"


# instance fields
.field public ֫:I

.field public final ۜ:[I

.field public ۧ:I

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public final ᩷:Ll/֡᩷֨;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ll/֡᩷֨;

    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, Ll/᩵᩷֨;->᩷:Ll/֡᩷֨;

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 12
    iput-object v0, p0, Ll/᩵᩷֨;->ۜ:[I

    return-void
.end method


# virtual methods
.method public final ֫(III)V
    .locals 0

    .line 38
    iput p1, p0, Ll/᩵᩷֨;->᩻:I

    .line 39
    iput p2, p0, Ll/᩵᩷֨;->ᩳ:I

    .line 40
    iput p3, p0, Ll/᩵᩷֨;->֫:I

    const/4 p1, 0x0

    .line 41
    iput-boolean p1, p0, Ll/᩵᩷֨;->ܳ:Z

    return-void
.end method
