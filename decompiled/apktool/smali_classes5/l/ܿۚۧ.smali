.class public final Ll/ܿۚۧ;
.super Ljava/lang/Object;
.source "Y8QO"

# interfaces
.implements Ll/֡ۚۧ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ᩳۚۧ;

.field public ܳ:Z

.field public final ܽ:Ll/ᩳ֨֫;

.field public ܿ:I

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ᩳۚۧ;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܿۚۧ;->ۧ:Ll/ᩳۚۧ;

    .line 49
    new-instance p1, Ll/ᩳ֨֫;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ܿۚۧ;->ܽ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p0, Ll/ܿۚۧ;->ܳ:Z

    return-void
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 7

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eqz p1, :cond_1

    .line 71
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    .line 72
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    add-int/2addr v4, v3

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    .line 75
    :goto_1
    iget-boolean v3, p0, Ll/ܿۚۧ;->ܳ:Z

    if-eqz v3, :cond_3

    if-nez p1, :cond_2

    goto/16 :goto_5

    .line 79
    :cond_2
    iput-boolean v1, p0, Ll/ܿۚۧ;->ܳ:Z

    .line 80
    invoke-virtual {p2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 81
    iput v1, p0, Ll/ܿۚۧ;->֫:I

    .line 84
    :cond_3
    :goto_2
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lez p1, :cond_9

    .line 85
    iget p1, p0, Ll/ܿۚۧ;->֫:I

    const/4 v3, 0x3

    iget-object v4, p0, Ll/ܿۚۧ;->ܽ:Ll/ᩳ֨֫;

    if-ge p1, v3, :cond_6

    if-nez p1, :cond_4

    .line 89
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    .line 90
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    sub-int/2addr v5, v0

    invoke-virtual {p2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/16 v5, 0xff

    if-ne p1, v5, :cond_4

    .line 93
    iput-boolean v0, p0, Ll/ܿۚۧ;->ܳ:Z

    return-void

    .line 97
    :cond_4
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    iget v5, p0, Ll/ܿۚۧ;->֫:I

    rsub-int/lit8 v5, v5, 0x3

    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 100
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    iget v6, p0, Ll/ܿۚۧ;->֫:I

    invoke-virtual {p2, v6, p1, v5}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 101
    iget v5, p0, Ll/ܿۚۧ;->֫:I

    add-int/2addr v5, p1

    iput v5, p0, Ll/ܿۚۧ;->֫:I

    if-ne v5, v3, :cond_3

    .line 103
    invoke-virtual {v4, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 104
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 105
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 106
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    .line 107
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    and-int/lit16 v6, p1, 0x80

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    .line 108
    :goto_3
    iput-boolean v6, p0, Ll/ܿۚۧ;->ᩳ:Z

    and-int/lit8 p1, p1, 0xf

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v5

    add-int/2addr p1, v3

    .line 109
    iput p1, p0, Ll/ܿۚۧ;->ܿ:I

    .line 111
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۧ()I

    move-result p1

    iget v3, p0, Ll/ܿۚۧ;->ܿ:I

    if-ge p1, v3, :cond_3

    .line 114
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۧ()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v3, 0x1002

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 115
    invoke-virtual {v4, p1}, Ll/ᩳ֨֫;->֫(I)V

    goto :goto_2

    .line 120
    :cond_6
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    iget v3, p0, Ll/ܿۚۧ;->ܿ:I

    iget v5, p0, Ll/ܿۚۧ;->֫:I

    sub-int/2addr v3, v5

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 122
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    iget v5, p0, Ll/ܿۚۧ;->֫:I

    invoke-virtual {p2, v5, p1, v3}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 123
    iget v3, p0, Ll/ܿۚۧ;->֫:I

    add-int/2addr v3, p1

    iput v3, p0, Ll/ܿۚۧ;->֫:I

    .line 124
    iget p1, p0, Ll/ܿۚۧ;->ܿ:I

    if-ne v3, p1, :cond_3

    .line 125
    iget-boolean v3, p0, Ll/ܿۚۧ;->ᩳ:Z

    if-eqz v3, :cond_8

    .line 127
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    iget v3, p0, Ll/ܿۚۧ;->ܿ:I

    invoke-static {v1, p1, v3, v2}, Ll/ۘ֨֫;->֫(I[BII)I

    move-result p1

    if-eqz p1, :cond_7

    .line 129
    iput-boolean v0, p0, Ll/ܿۚۧ;->ܳ:Z

    return-void

    .line 132
    :cond_7
    iget p1, p0, Ll/ܿۚۧ;->ܿ:I

    add-int/lit8 p1, p1, -0x4

    invoke-virtual {v4, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    goto :goto_4

    .line 135
    :cond_8
    invoke-virtual {v4, p1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 137
    :goto_4
    invoke-virtual {v4, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 138
    iget-object p1, p0, Ll/ܿۚۧ;->ۧ:Ll/ᩳۚۧ;

    invoke-interface {p1, v4}, Ll/ᩳۚۧ;->֫(Ll/ᩳ֨֫;)V

    .line 139
    iput v1, p0, Ll/ܿۚۧ;->֫:I

    goto/16 :goto_2

    :cond_9
    :goto_5
    return-void
.end method

.method public final ֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܿۚۧ;->ۧ:Ll/ᩳۚۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ᩳۚۧ;->֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Ll/ܿۚۧ;->ܳ:Z

    return-void
.end method
