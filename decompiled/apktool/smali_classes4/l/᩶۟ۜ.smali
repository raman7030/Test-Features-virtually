.class public final Ll/᩶۟ۜ;
.super Ljava/lang/Object;
.source "T9KX"


# instance fields
.field public ֫:I

.field public ۧ:[I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, -0x565657

    .line 38
    iput v0, p0, Ll/᩶۟ۜ;->֫:I

    const v0, -0x333334

    const/4 v1, -0x1

    .line 39
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Ll/᩶۟ۜ;->ۧ:[I

    const v0, -0x7f7f80

    .line 40
    iput v0, p0, Ll/᩶۟ۜ;->ܿ:I

    goto :goto_0

    :cond_0
    const v0, -0xc5c3c3

    .line 42
    iput v0, p0, Ll/᩶۟ۜ;->֫:I

    const v0, -0x444445

    const v1, -0x111112

    .line 43
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Ll/᩶۟ۜ;->ۧ:[I

    const v0, -0xaaa9aa

    .line 44
    iput v0, p0, Ll/᩶۟ۜ;->ܿ:I

    :goto_0
    const v0, 0x60808080

    .line 46
    iput v0, p0, Ll/᩶۟ۜ;->ᩳ:I

    const v0, 0x50f06060

    .line 47
    iput v0, p0, Ll/᩶۟ۜ;->ܽ:I

    const v0, -0xfffaa

    .line 48
    iput v0, p0, Ll/᩶۟ۜ;->ܳ:I

    return-void
.end method
