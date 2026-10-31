.class public final Ll/֨ܰ֡;
.super Ljava/lang/Object;
.source "052C"


# instance fields
.field public final ֫:Ll/۬ۛ֡;

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/֨ܰ֡;->֫:Ll/۬ۛ֡;

    .line 53
    iput p2, p0, Ll/֨ܰ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 100
    iget-object v0, p0, Ll/֨ܰ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/֨ܰ֡;->ۧ:I

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 2

    .line 104
    iget-object v0, p0, Ll/֨ܰ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/֨ܰ֡;->ۧ:I

    add-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 91
    iget-object v0, p0, Ll/֨ܰ֡;->֫:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/֨ܰ֡;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method
