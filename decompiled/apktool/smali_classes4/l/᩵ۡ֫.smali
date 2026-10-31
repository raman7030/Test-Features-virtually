.class public abstract Ll/᩵ۡ֫;
.super Ljava/lang/Object;
.source "X4YZ"


# instance fields
.field public final synthetic ۙ:Ll/֡ۡ֫;

.field public final ᩶:Ll/֨ۡ֫;

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/֡ۡ֫;Ll/֨ۡ֫;)V
    .locals 0

    .line 461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۡ֫;->ۙ:Ll/֡ۡ֫;

    const/4 p1, -0x1

    .line 459
    iput p1, p0, Ll/᩵ۡ֫;->᩹:I

    .line 462
    iput-object p2, p0, Ll/᩵ۡ֫;->᩶:Ll/֨ۡ֫;

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 475
    iget-boolean v0, p0, Ll/᩵ۡ֫;->᩸:Z

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 480
    :cond_0
    iput-boolean p1, p0, Ll/᩵ۡ֫;->᩸:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    .line 481
    :goto_0
    iget-object v0, p0, Ll/᩵ۡ֫;->ۙ:Ll/֡ۡ֫;

    invoke-virtual {v0, p1}, Ll/֡ۡ֫;->֫(I)V

    .line 482
    iget-boolean p1, p0, Ll/᩵ۡ֫;->᩸:Z

    if-eqz p1, :cond_2

    .line 483
    invoke-virtual {v0, p0}, Ll/֡ۡ֫;->֫(Ll/᩵ۡ֫;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public abstract ۧ()Z
.end method

.method public ᩻(Ll/᩻ۡ֫;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
