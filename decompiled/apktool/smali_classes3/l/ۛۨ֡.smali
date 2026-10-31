.class public final Ll/ۛۨ֡;
.super Ll/ۨۨ֡;
.source "T65P"


# instance fields
.field public final synthetic ܽ:Ll/᩺ۨ֡;


# direct methods
.method public constructor <init>(Ll/᩺ۨ֡;I)V
    .locals 0

    .line 651
    iput-object p1, p0, Ll/ۛۨ֡;->ܽ:Ll/᩺ۨ֡;

    .line 652
    invoke-direct {p0, p1, p2}, Ll/ۨۨ֡;-><init>(Ll/᩺ۨ֡;I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 657
    iget-object v0, p0, Ll/ۛۨ֡;->ܽ:Ll/᩺ۨ֡;

    invoke-static {v0}, Ll/᩺ۨ֡;->ᩳ(Ll/᩺ۨ֡;)Ll/۬ۨ֡;

    move-result-object v1

    iget-object v0, v0, Ll/᩺ۨ֡;->ܿ:Ll/ܰۨ֡;

    iget v2, p0, Ll/ۨۨ֡;->֫:I

    invoke-virtual {v0, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ll/۬ۨ֡;->֫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()I
    .locals 2

    .line 669
    iget-object v0, p0, Ll/ۛۨ֡;->ܽ:Ll/᩺ۨ֡;

    iget-object v0, v0, Ll/᩺ۨ֡;->ܿ:Ll/ܰۨ֡;

    iget v1, p0, Ll/ۨۨ֡;->֫:I

    add-int/lit8 v1, v1, 0x6

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 661
    iget-object v0, p0, Ll/ۛۨ֡;->ܽ:Ll/᩺ۨ֡;

    iget-object v0, v0, Ll/᩺ۨ֡;->ܿ:Ll/ܰۨ֡;

    iget v1, p0, Ll/ۨۨ֡;->֫:I

    add-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Ll/᩺ۤ֡;->ܽ(I)J

    move-result-wide v0

    return-wide v0
.end method
