.class public final Ll/ܳ᩵֡;
.super Ljava/lang/Object;
.source "M8XF"


# instance fields
.field public final ֫:Z

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Ll/ܳ᩵֡;->ܽ:I

    .line 13
    iput p2, p0, Ll/ܳ᩵֡;->ۧ:I

    .line 14
    iput-boolean p3, p0, Ll/ܳ᩵֡;->֫:Z

    return-void
.end method

.method public static ֫(I)Ll/ܳ᩵֡;
    .locals 3

    .line 15
    new-instance v0, Ll/ܳ᩵֡;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ll/ܳ᩵֡;-><init>(IIZ)V

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 22
    iget v0, p0, Ll/ܳ᩵֡;->ۧ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ܳ᩵֡;->ܽ:I

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Ll/ܳ᩵֡;->֫:Z

    return v0
.end method
