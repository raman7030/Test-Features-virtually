.class public final Ll/ܶ᩶ۧ;
.super Ljava/lang/Object;
.source "84VO"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:Ll/۠᩶ۧ;


# direct methods
.method public constructor <init>(Ll/۠᩶ۧ;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Ll/ܶ᩶ۧ;->ܽ:I

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ܶ᩶ۧ;->ۧ:I

    .line 45
    iput v0, p0, Ll/ܶ᩶ۧ;->֫:I

    .line 49
    iput-object p1, p0, Ll/ܶ᩶ۧ;->ᩳ:Ll/۠᩶ۧ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 58
    iget v0, p0, Ll/ܶ᩶ۧ;->ܽ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 61
    iget-object v2, p0, Ll/ܶ᩶ۧ;->ᩳ:Ll/۠᩶ۧ;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 69
    :cond_1
    iget v0, p0, Ll/ܶ᩶ۧ;->ۧ:I

    iget v1, p0, Ll/ܶ᩶ۧ;->֫:I

    invoke-virtual {v2, v0, v1}, Ll/۠᩶ۧ;->֫(II)V

    goto :goto_0

    .line 66
    :cond_2
    iget v0, p0, Ll/ܶ᩶ۧ;->ۧ:I

    iget v1, p0, Ll/ܶ᩶ۧ;->֫:I

    invoke-virtual {v2, v0, v1}, Ll/۠᩶ۧ;->ᩳ(II)V

    goto :goto_0

    .line 63
    :cond_3
    iget v0, p0, Ll/ܶ᩶ۧ;->ۧ:I

    iget v1, p0, Ll/ܶ᩶ۧ;->֫:I

    invoke-virtual {v2, v0, v1}, Ll/۠᩶ۧ;->ۧ(II)V

    :goto_0
    const/4 v0, 0x0

    .line 73
    iput v0, p0, Ll/ܶ᩶ۧ;->ܽ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 4

    .line 113
    iget v0, p0, Ll/ܶ᩶ۧ;->ܽ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܶ᩶ۧ;->ۧ:I

    iget v2, p0, Ll/ܶ᩶ۧ;->֫:I

    add-int/2addr v2, v0

    if-gt p1, v2, :cond_0

    add-int v3, p1, p2

    if-lt v3, v0, :cond_0

    .line 118
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ܶ᩶ۧ;->ۧ:I

    .line 119
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Ll/ܶ᩶ۧ;->ۧ:I

    sub-int/2addr p1, p2

    iput p1, p0, Ll/ܶ᩶ۧ;->֫:I

    return-void

    .line 122
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩶ۧ;->֫()V

    .line 123
    iput p1, p0, Ll/ܶ᩶ۧ;->ۧ:I

    .line 124
    iput p2, p0, Ll/ܶ᩶ۧ;->֫:I

    .line 126
    iput v1, p0, Ll/ܶ᩶ۧ;->ܽ:I

    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    .line 106
    invoke-virtual {p0}, Ll/ܶ᩶ۧ;->֫()V

    .line 107
    iget-object v0, p0, Ll/ܶ᩶ۧ;->ᩳ:Ll/۠᩶ۧ;

    invoke-virtual {v0, p1, p2}, Ll/۠᩶ۧ;->ܽ(II)V

    return-void
.end method
