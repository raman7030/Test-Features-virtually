.class public final Ll/ܰܰᩳ;
.super Ljava/lang/Object;
.source "R6N8"


# instance fields
.field public ֫:Ll/۟ܰᩳ;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:Ll/ۨܰᩳ;

.field public final synthetic ᩻:Ll/ۧ۟ᩳ;


# direct methods
.method public constructor <init>(Ll/ۧ۟ᩳ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܰᩳ;->᩻:Ll/ۧ۟ᩳ;

    const/4 p1, -0x1

    .line 59
    iput p1, p0, Ll/ܰܰᩳ;->ܳ:I

    .line 60
    new-instance p1, Ll/ۨܰᩳ;

    invoke-direct {p1}, Ll/ۨܰᩳ;-><init>()V

    iput-object p1, p0, Ll/ܰܰᩳ;->ᩳ:Ll/ۨܰᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۨܰᩳ;
    .locals 9

    .line 63
    iget-object v0, p0, Ll/ܰܰᩳ;->᩻:Ll/ۧ۟ᩳ;

    invoke-static {v0, p1}, Ll/ۧ۟ᩳ;->ۧ(Ll/ۧ۟ᩳ;I)V

    .line 64
    iget v1, p0, Ll/ܰܰᩳ;->ܳ:I

    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/ۧ۟ᩳ;)I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Ll/ܰܰᩳ;->ܽ:I

    if-lt p1, v1, :cond_0

    iget-object v2, p0, Ll/ܰܰᩳ;->֫:Ll/۟ܰᩳ;

    iget v2, v2, Ll/۟ܰᩳ;->֡:I

    add-int/2addr v1, v2

    if-lt p1, v1, :cond_4

    .line 65
    :cond_0
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ۧ(Ll/ۧ۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 68
    :goto_0
    iget-object v5, v1, Ll/۟ܰᩳ;->᩻:Ll/۟ܰᩳ;

    if-nez v5, :cond_1

    const/4 v6, 0x0

    goto :goto_1

    .line 372
    :cond_1
    iget v6, v5, Ll/۟ܰᩳ;->ۧ:I

    :goto_1
    add-int v7, v2, v6

    if-ge p1, v7, :cond_2

    .line 70
    iget v6, v1, Ll/۟ܰᩳ;->ܿ:I

    add-int/2addr v3, v6

    .line 71
    iget v1, v1, Ll/۟ܰᩳ;->ܳ:I

    add-int/2addr v4, v1

    move-object v1, v5

    goto :goto_0

    .line 73
    :cond_2
    iget v5, v1, Ll/۟ܰᩳ;->֡:I

    add-int v8, v7, v5

    if-lt p1, v8, :cond_3

    add-int/2addr v6, v5

    add-int/2addr v2, v6

    .line 75
    iget v5, v1, Ll/۟ܰᩳ;->ܿ:I

    add-int/2addr v3, v5

    .line 76
    iget v5, v1, Ll/۟ܰᩳ;->ܳ:I

    add-int/2addr v4, v5

    .line 77
    iget-object v1, v1, Ll/۟ܰᩳ;->ۘ:Ll/۟ܰᩳ;

    goto :goto_0

    .line 79
    :cond_3
    iput-object v1, p0, Ll/ܰܰᩳ;->֫:Ll/۟ܰᩳ;

    .line 80
    iput v7, p0, Ll/ܰܰᩳ;->ܽ:I

    .line 81
    iget v2, v1, Ll/۟ܰᩳ;->֫:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܰܰᩳ;->ۧ:I

    .line 82
    iget v1, v1, Ll/۟ܰᩳ;->᩷:I

    add-int/2addr v4, v1

    iput v4, p0, Ll/ܰܰᩳ;->ܿ:I

    .line 83
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/ۧ۟ᩳ;)I

    move-result v0

    iput v0, p0, Ll/ܰܰᩳ;->ܳ:I

    .line 88
    :cond_4
    iget v0, p0, Ll/ܰܰᩳ;->ܽ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/ܰܰᩳ;->֫:Ll/۟ܰᩳ;

    invoke-virtual {v0, p1}, Ll/۟ܰᩳ;->ᩳ(I)I

    move-result v0

    iget v1, p0, Ll/ܰܰᩳ;->ۧ:I

    add-int/2addr v0, v1

    .line 89
    iget-object v1, p0, Ll/ܰܰᩳ;->֫:Ll/۟ܰᩳ;

    .line 472
    iget-object v2, v1, Ll/۟ܰᩳ;->ۜ:[C

    if-eqz v2, :cond_5

    aget-char v2, v2, p1

    goto :goto_2

    :cond_5
    iget-object v2, v1, Ll/۟ܰᩳ;->ۚ:[I

    aget v2, v2, p1

    :goto_2
    add-int/2addr v2, v0

    .line 89
    invoke-virtual {v1, p1}, Ll/۟ܰᩳ;->ܽ(I)I

    move-result v1

    iget v3, p0, Ll/ܰܰᩳ;->ܿ:I

    add-int/2addr v1, v3

    iget-object v3, p0, Ll/ܰܰᩳ;->ᩳ:Ll/ۨܰᩳ;

    invoke-virtual {v3, v0, v2, v1}, Ll/ۨܰᩳ;->֫(III)V

    .line 90
    iget-object v0, p0, Ll/ܰܰᩳ;->֫:Ll/۟ܰᩳ;

    invoke-virtual {v0, p1}, Ll/۟ܰᩳ;->ۧ(I)Z

    move-result p1

    invoke-virtual {v3, p1}, Ll/ۨܰᩳ;->֫(Z)V

    return-object v3
.end method
