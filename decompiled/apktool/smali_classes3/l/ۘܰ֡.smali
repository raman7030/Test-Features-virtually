.class public final Ll/ۘܰ֡;
.super Ljava/lang/Object;
.source "951O"

# interfaces
.implements Ll/ᩳۧۚ;


# instance fields
.field public final synthetic ֫:Ll/ᩴܰ֡;

.field public final synthetic ۧ:I


# direct methods
.method public constructor <init>(Ll/ᩴܰ֡;I)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܰ֡;->֫:Ll/ᩴܰ֡;

    iput p2, p0, Ll/ۘܰ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final getKey()I
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ۘܰ֡;->֫:Ll/ᩴܰ֡;

    iget-object v1, v0, Ll/ᩴܰ֡;->᩸:Ll/᩵ܰ֡;

    iget-object v1, v1, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget-object v0, v0, Ll/ᩴܰ֡;->᩸:Ll/᩵ܰ֡;

    iget v0, v0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v0, v0, 0x4

    iget v2, p0, Ll/ۘܰ֡;->ۧ:I

    mul-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 3

    .line 71
    iget-object v0, p0, Ll/ۘܰ֡;->֫:Ll/ᩴܰ֡;

    iget-object v0, v0, Ll/ᩴܰ֡;->᩸:Ll/᩵ܰ֡;

    iget-object v1, v0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, v0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v2, v2, 0x4

    iget v0, v0, Ll/᩵ܰ֡;->ۙ:I

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v2

    iget v2, p0, Ll/ۘܰ֡;->ۧ:I

    mul-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v0

    return v0
.end method
