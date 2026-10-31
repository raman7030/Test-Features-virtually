.class public final Ll/᩺ۛ֡;
.super Ll/ۗ᩵ۚ;
.source "Z556"


# instance fields
.field public final synthetic ۬:Z


# direct methods
.method public constructor <init>(Ljava/io/Writer;Z)V
    .locals 0

    .line 691
    iput-boolean p2, p0, Ll/᩺ۛ֡;->۬:Z

    invoke-direct {p0, p1}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨ۗ֡;)V
    .locals 1

    .line 695
    sget-object v0, Ll/֨ۗ֡;->ܺۧ:Ll/֨ۗ֡;

    if-ne p1, v0, :cond_0

    .line 696
    sget-object p1, Ll/֨ۗ֡;->ۡۧ:Ll/֨ۗ֡;

    goto :goto_0

    .line 697
    :cond_0
    sget-object v0, Ll/֨ۗ֡;->ܿܽ:Ll/֨ۗ֡;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/֨ۗ֡;->ܳܽ:Ll/֨ۗ֡;

    if-ne p1, v0, :cond_2

    .line 698
    :cond_1
    sget-object p1, Ll/֨ۗ֡;->ᩳܽ:Ll/֨ۗ֡;

    .line 700
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Ll/ۗ᩵ۚ;->֫(Ll/֨ۗ֡;)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 5

    .line 705
    iget-boolean v0, p0, Ll/᩺ۛ֡;->۬:Z

    if-eqz v0, :cond_0

    const-wide/32 v0, 0x7f000000

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    .line 706
    invoke-super {p0, v0, v1}, Ll/ۗ᩵ۚ;->ۧ(J)V

    return-void

    .line 708
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    return-void
.end method
