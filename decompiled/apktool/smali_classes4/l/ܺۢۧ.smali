.class public final Ll/ܺۢۧ;
.super Ljava/lang/Object;
.source "Y8IG"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/᩸᩷ۧ;

.field public final ۧ:I

.field public ܳ:I

.field public final ܽ:I

.field public ܿ:I

.field public final ᩳ:Ljava/lang/String;

.field public ᩻:Ll/᩵ۢۧ;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput p1, p0, Ll/ܺۢۧ;->ۧ:I

    .line 79
    iput p2, p0, Ll/ܺۢۧ;->ܽ:I

    .line 80
    iput-object p3, p0, Ll/ܺۢۧ;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 9

    .line 100
    iget p2, p0, Ll/ܺۢۧ;->ܳ:I

    const/4 v0, -0x1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    if-ne p2, v1, :cond_0

    return v0

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 125
    :cond_1
    iget-object p2, p0, Ll/ܺۢۧ;->᩻:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x400

    .line 126
    invoke-interface {p2, p1, v3, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result p1

    const/4 p2, 0x0

    if-ne p1, v0, :cond_2

    .line 128
    iput v1, p0, Ll/ܺۢۧ;->ܳ:I

    .line 130
    iget-object v2, p0, Ll/ܺۢۧ;->᩻:Ll/᩵ۢۧ;

    iget v6, p0, Ll/ܺۢۧ;->ܿ:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    invoke-interface/range {v2 .. v8}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 132
    iput p2, p0, Ll/ܺۢۧ;->ܿ:I

    return p2

    .line 134
    :cond_2
    iget v0, p0, Ll/ܺۢۧ;->ܿ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܺۢۧ;->ܿ:I

    return p2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 2

    const-wide/16 p3, 0x0

    const/4 v0, 0x1

    cmp-long v1, p1, p3

    if-eqz v1, :cond_1

    .line 113
    iget p1, p0, Ll/ܺۢۧ;->ܳ:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 114
    :cond_1
    :goto_0
    iput v0, p0, Ll/ܺۢۧ;->ܳ:I

    const/4 p1, 0x0

    .line 115
    iput p1, p0, Ll/ܺۢۧ;->ܿ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 93
    iput-object p1, p0, Ll/ܺۢۧ;->֫:Ll/᩸᩷ۧ;

    const/16 v0, 0x400

    const/4 v1, 0x4

    .line 140
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۢۧ;->᩻:Ll/᩵ۢۧ;

    .line 141
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    .line 143
    iget-object v1, p0, Ll/ܺۢۧ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 141
    invoke-interface {p1, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 146
    iget-object p1, p0, Ll/ܺۢۧ;->֫:Ll/᩸᩷ۧ;

    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 147
    iget-object p1, p0, Ll/ܺۢۧ;->֫:Ll/᩸᩷ۧ;

    new-instance v0, Ll/ۖۢۧ;

    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 147
    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    const/4 p1, 0x1

    .line 148
    iput p1, p0, Ll/ܺۢۧ;->ܳ:I

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 85
    iget v2, p0, Ll/ܺۢۧ;->ܽ:I

    iget v3, p0, Ll/ܺۢۧ;->ۧ:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    if-eq v2, v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 86
    new-instance v4, Ll/ᩳ֨֫;

    invoke-direct {v4, v2}, Ll/ᩳ֨֫;-><init>(I)V

    .line 87
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    check-cast p1, Ll/ܺ᩷ۧ;

    .line 157
    invoke-virtual {p1, v1, v1, v2, v5}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 88
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result p1

    if-ne p1, v3, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
