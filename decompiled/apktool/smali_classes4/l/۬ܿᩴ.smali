.class public final Ll/۬ܿᩴ;
.super Ll/ۢۡᩴ;
.source "21QH"


# instance fields
.field public final synthetic ᩶:Ll/۫ܿᩴ;


# direct methods
.method public constructor <init>(Ll/۫ܿᩴ;I)V
    .locals 0

    .line 663
    iput-object p1, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    .line 972
    invoke-direct {p0, p2}, Ll/᩷ۡᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 690
    iget-object v0, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    iget v1, v0, Ll/۫ܿᩴ;->᩶:I

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(II)V
    .locals 1

    .line 675
    iget-object v0, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۫ܿᩴ;->add(II)V

    return-void
.end method

.method public final ۧ(I)I
    .locals 2

    .line 669
    iget-object v0, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    iget-object v1, v0, Ll/۫ܿᩴ;->᩹:Ll/ۤܿᩴ;

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    add-int/2addr v0, p1

    invoke-interface {v1, v0}, Ll/֨ۡᩴ;->getInt(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(II)V
    .locals 1

    .line 680
    iget-object v0, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۫ܿᩴ;->set(II)I

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 685
    iget-object v0, p0, Ll/۬ܿᩴ;->᩶:Ll/۫ܿᩴ;

    invoke-virtual {v0, p1}, Ll/۫ܿᩴ;->ۘ(I)I

    return-void
.end method
