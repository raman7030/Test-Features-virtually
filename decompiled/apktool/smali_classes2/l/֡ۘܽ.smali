.class public final Ll/֡ۘܽ;
.super Ljava/lang/Object;
.source "W1FE"

# interfaces
.implements Ll/ܰܿܽ;


# instance fields
.field public ֫:Ll/ᩴۘܽ;

.field public ۧ:Ll/᩵ۘܽ;

.field public ܳ:Ll/֨ۘܽ;

.field public ܽ:Ll/᩵֡ᩴ;

.field public ܿ:Ll/᩵ۘܽ;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ll/᩵֡ᩴ;

    invoke-direct {v0}, Ll/᩵֡ᩴ;-><init>()V

    iput-object v0, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    return-void
.end method


# virtual methods
.method public final text(Ljava/lang/String;)V
    .locals 3

    .line 42
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 43
    iget-object v0, p0, Ll/֡ۘܽ;->ܳ:Ll/֨ۘܽ;

    iget-object v1, v0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    .line 44
    instance-of v2, v1, Ljava/lang/StringBuilder;

    if-eqz v2, :cond_0

    .line 45
    check-cast v1, Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 47
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput-object v2, v0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    return-void

    .line 51
    :cond_1
    new-instance v0, Ll/֨ۘܽ;

    invoke-direct {v0}, Ll/֨ۘܽ;-><init>()V

    .line 52
    iput-object p1, v0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    .line 53
    iget-object p1, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {p1}, Ll/ᩳᩴᩴ;->ܿ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۘܽ;

    iget-object p1, p1, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    iput-object v0, p0, Ll/֡ۘܽ;->ܳ:Ll/֨ۘܽ;

    .line 55
    iput v1, p0, Ll/֡ۘܽ;->ᩳ:I

    return-void
.end method

.method public final ֫()Ll/᩵ۘܽ;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֡ۘܽ;->ۧ:Ll/᩵ۘܽ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Ll/֡ۘܽ;->ۧ:Ll/᩵ۘܽ;

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 98
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 101
    iget-object v0, p0, Ll/֡ۘܽ;->֫:Ll/ᩴۘܽ;

    iput p1, v0, Ll/ᩴۘܽ;->ܽ:I

    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(III)V
    .locals 2

    .line 89
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Ll/֡ۘܽ;->֫:Ll/ᩴۘܽ;

    iput p1, v0, Ll/ᩴۘܽ;->ᩳ:I

    .line 93
    iput p2, v0, Ll/ᩴۘܽ;->ۧ:I

    .line 94
    iput p3, v0, Ll/ᩴۘܽ;->ܿ:I

    return-void

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {v0}, Ll/ᩳᩴᩴ;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۘܽ;

    iget-object v0, v0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 63
    iput p1, p0, Ll/֡ۘܽ;->ᩳ:I

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    new-instance v0, Ll/ᩴۘܽ;

    invoke-direct {v0}, Ll/ᩴۘܽ;-><init>()V

    .line 30
    iput-object p1, v0, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    .line 31
    iput-object p2, v0, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    .line 32
    iget-object p1, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    invoke-virtual {p1}, Ll/ᩳᩴᩴ;->ܿ()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵ۘܽ;

    iget p2, p2, Ll/ۡۘܽ;->ܽ:I

    iput p2, v0, Ll/ᩴۘܽ;->᩷:I

    iput p2, v0, Ll/ᩴۘܽ;->ᩳ:I

    .line 33
    invoke-virtual {p1}, Ll/ᩳᩴᩴ;->ܿ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۘܽ;

    iget-object p1, p1, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    iput-object v0, p0, Ll/֡ۘܽ;->֫:Ll/ᩴۘܽ;

    const/4 p1, 0x2

    .line 35
    iput p1, p0, Ll/֡ۘܽ;->ᩳ:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    .line 114
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 117
    iget-object v0, p0, Ll/֡ۘܽ;->֫:Ll/ᩴۘܽ;

    iput p1, v0, Ll/ᩴۘܽ;->ۜ:I

    return-void

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ(III)V
    .locals 2

    .line 105
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 108
    iget-object v0, p0, Ll/֡ۘܽ;->֫:Ll/ᩴۘܽ;

    iput p1, v0, Ll/ᩴۘܽ;->᩷:I

    .line 109
    iput p2, v0, Ll/ᩴۘܽ;->᩻:I

    .line 110
    iput p3, v0, Ll/ᩴۘܽ;->ۢ:I

    return-void

    .line 106
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 16
    new-instance v0, Ll/᩵ۘܽ;

    invoke-direct {v0}, Ll/᩵ۘܽ;-><init>()V

    .line 17
    iput-object p1, v0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    .line 18
    iget-object p1, p0, Ll/֡ۘܽ;->ۧ:Ll/᩵ۘܽ;

    iget-object v1, p0, Ll/֡ۘܽ;->ܽ:Ll/᩵֡ᩴ;

    if-nez p1, :cond_0

    .line 19
    iput-object v0, p0, Ll/֡ۘܽ;->ۧ:Ll/᩵ۘܽ;

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1}, Ll/ᩳᩴᩴ;->ܿ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۘܽ;

    iget-object p1, p1, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    :goto_0
    invoke-virtual {v1, v0}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 23
    iput-object v0, p0, Ll/֡ۘܽ;->ܿ:Ll/᩵ۘܽ;

    const/4 p1, 0x1

    .line 24
    iput p1, p0, Ll/֡ۘܽ;->ᩳ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 137
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 82
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 85
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֡ۘܽ;->ܿ:Ll/᩵ۘܽ;

    iput p1, v0, Ll/ۡۘܽ;->ۧ:I

    return-void
.end method

.method public final ܽ(III)V
    .locals 2

    .line 73
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 76
    iget-object v0, p0, Ll/֡ۘܽ;->ܿ:Ll/᩵ۘܽ;

    iput p1, v0, Ll/ۡۘܽ;->ܽ:I

    .line 77
    iput p2, v0, Ll/ۡۘܽ;->֫:I

    .line 78
    iput p3, v0, Ll/ۡۘܽ;->ᩳ:I

    return-void

    .line 74
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ᩳ(I)V
    .locals 2

    .line 130
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 133
    iget-object v0, p0, Ll/֡ۘܽ;->ܳ:Ll/֨ۘܽ;

    iput p1, v0, Ll/ۡۘܽ;->ۧ:I

    return-void

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ᩳ(III)V
    .locals 2

    .line 121
    iget v0, p0, Ll/֡ۘܽ;->ᩳ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 124
    iget-object v0, p0, Ll/֡ۘܽ;->ܳ:Ll/֨ۘܽ;

    iput p1, v0, Ll/ۡۘܽ;->ܽ:I

    .line 125
    iput p2, v0, Ll/ۡۘܽ;->֫:I

    .line 126
    iput p3, v0, Ll/ۡۘܽ;->ᩳ:I

    return-void

    .line 122
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
