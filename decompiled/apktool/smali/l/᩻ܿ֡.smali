.class public final Ll/᩻ܿ֡;
.super Ljava/lang/Object;
.source "V4I8"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:[Ll/᩶ᩳ֡;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    new-array v0, v0, [Ll/᩶ᩳ֡;

    .line 44
    iput-object v0, p0, Ll/᩻ܿ֡;->ܽ:[Ll/᩶ᩳ֡;

    const/4 v0, -0x1

    .line 45
    iput v0, p0, Ll/᩻ܿ֡;->֫:I

    const/4 v1, 0x0

    .line 51
    iput-boolean v1, p0, Ll/᩻ܿ֡;->ۧ:Z

    .line 59
    iput v0, p0, Ll/᩻ܿ֡;->ᩳ:I

    .line 67
    iput v1, p0, Ll/᩻ܿ֡;->ܿ:I

    return-void
.end method
