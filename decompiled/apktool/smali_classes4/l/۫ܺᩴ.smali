.class public final Ll/۫ܺᩴ;
.super Ll/᩷ۘᩴ;
.source "UC70"


# instance fields
.field public final synthetic ᩶:Ll/ۤܺᩴ;


# direct methods
.method public constructor <init>(Ll/ۤܺᩴ;I)V
    .locals 0

    .line 663
    iput-object p1, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    .line 972
    invoke-direct {p0, p2}, Ll/ۜۘᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 690
    iget-object v0, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    iget v1, v0, Ll/ۤܺᩴ;->᩶:I

    iget v0, v0, Ll/ۤܺᩴ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 675
    iget-object v0, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۤܺᩴ;->֫(IJ)V

    return-void
.end method

.method public final ۧ(I)J
    .locals 2

    .line 669
    iget-object v0, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    iget-object v1, v0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    iget v0, v0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    invoke-interface {v1, v0}, Ll/ۖۘᩴ;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(IJ)V
    .locals 1

    .line 680
    iget-object v0, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۤܺᩴ;->set(IJ)J

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 685
    iget-object v0, p0, Ll/۫ܺᩴ;->᩶:Ll/ۤܺᩴ;

    invoke-virtual {v0, p1}, Ll/ۤܺᩴ;->ܽ(I)J

    return-void
.end method
