.class public final Ll/᩵ܺۚ;
.super Ljava/lang/Object;
.source "95A4"


# instance fields
.field public ֫:Z

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 38
    iput v0, p0, Ll/᩵ܺۚ;->ۧ:I

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Ll/᩵ܺۚ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩵ۡۚ;
    .locals 2

    .line 43
    new-instance v0, Ll/᩵ۡۚ;

    iget v1, p0, Ll/᩵ܺۚ;->ۧ:I

    invoke-static {v1}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    return-object v0
.end method
