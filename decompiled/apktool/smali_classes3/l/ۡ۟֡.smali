.class public final Ll/ۡ۟֡;
.super Ll/ܺ۟֡;
.source "N4U4"


# instance fields
.field public final ۧ:Ll/۬ۛ֡;

.field public final ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:Ll/ᩴۨ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 88
    iput v0, p0, Ll/ۡ۟֡;->ܽ:I

    const/4 v0, -0x1

    .line 89
    iput v0, p0, Ll/ۡ۟֡;->ܿ:I

    .line 92
    iput-object p1, p0, Ll/ۡ۟֡;->ۧ:Ll/۬ۛ֡;

    .line 93
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۟֡;->ᩳ:Ll/ᩴۨ֡;

    .line 94
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/ۡ۟֡;->ܳ:I

    .line 95
    iget v0, p0, Ll/ۡ۟֡;->ܽ:I

    if-lt v0, p2, :cond_0

    .line 96
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result p2

    iput p2, p0, Ll/ۡ۟֡;->ܿ:I

    .line 97
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 134
    iget v0, p0, Ll/ۡ۟֡;->ܳ:I

    return v0
.end method

.method public final ۧ()Ll/ۤܽۚ;
    .locals 4

    .line 103
    iget v0, p0, Ll/ۡ۟֡;->ܽ:I

    iget v1, p0, Ll/ۡ۟֡;->ܳ:I

    if-ge v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 104
    iput v0, p0, Ll/ۡ۟֡;->ܽ:I

    .line 105
    iget-object v0, p0, Ll/ۡ۟֡;->ۧ:Ll/۬ۛ֡;

    iget-object v2, p0, Ll/ۡ۟֡;->ᩳ:Ll/ᩴۨ֡;

    invoke-static {v0, v2}, Ll/ۤ᩵ۚ;->֫(Ll/۬ۛ֡;Ll/ᩴۨ֡;)Ll/ۤܽۚ;

    move-result-object v0

    .line 106
    iget v3, p0, Ll/ۡ۟֡;->ܽ:I

    if-lt v3, v1, :cond_0

    .line 107
    invoke-virtual {v2}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ۡ۟֡;->ܿ:I

    .line 108
    invoke-virtual {v2}, Ll/ᩴۨ֡;->ۘ()V

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 129
    iget v0, p0, Ll/ۡ۟֡;->ܿ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۡ۟֡;->ᩳ:Ll/ᩴۨ֡;

    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    :cond_0
    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 117
    iget v0, p0, Ll/ۡ۟֡;->ܽ:I

    iget v1, p0, Ll/ۡ۟֡;->ܳ:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 118
    iput v0, p0, Ll/ۡ۟֡;->ܽ:I

    .line 119
    iget-object v0, p0, Ll/ۡ۟֡;->ᩳ:Ll/ᩴۨ֡;

    invoke-static {v0}, Ll/ۤ᩵ۚ;->֫(Ll/ᩴۨ֡;)V

    .line 120
    iget v2, p0, Ll/ۡ۟֡;->ܽ:I

    if-lt v2, v1, :cond_0

    .line 121
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ۡ۟֡;->ܿ:I

    .line 122
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    :cond_0
    return-void
.end method
