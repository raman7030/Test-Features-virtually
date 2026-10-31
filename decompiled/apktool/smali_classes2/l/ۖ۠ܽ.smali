.class public final Ll/ۖ۠ܽ;
.super Ljava/lang/Object;
.source "56VG"


# instance fields
.field public final ֫:Ll/ۖ۠ܽ;

.field public final ۜ:I

.field public final ۢ:I

.field public final ۧ:[C

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:[I

.field public final ᩳ:I

.field public final ᩷:Ll/ܺ۠ܽ;

.field public final ᩻:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(Ll/ۜ֨ܽ;IILl/ۖ۠ܽ;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iget v0, p1, Ll/ۜ֨ܽ;->ܽ:I

    iput v0, p0, Ll/ۖ۠ܽ;->ᩳ:I

    .line 16
    iget v0, p1, Ll/ۜ֨ܽ;->ܿ:I

    iput v0, p0, Ll/ۖ۠ܽ;->ܳ:I

    .line 17
    iput p2, p0, Ll/ۖ۠ܽ;->ܽ:I

    .line 18
    iput p3, p0, Ll/ۖ۠ܽ;->ۢ:I

    .line 19
    iget p2, p1, Ll/ۜ֨ܽ;->ۜ:I

    iput p2, p0, Ll/ۖ۠ܽ;->ۜ:I

    .line 20
    iget-object p2, p1, Ll/ۜ֨ܽ;->ᩳ:[I

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, [I->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    :goto_0
    iput-object p2, p0, Ll/ۖ۠ܽ;->ܿ:[I

    .line 21
    iget-object p2, p1, Ll/ۜ֨ܽ;->ۧ:[C

    if-nez p2, :cond_1

    move-object p2, p3

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, [C->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [C

    :goto_1
    iput-object p2, p0, Ll/ۖ۠ܽ;->ۧ:[C

    .line 22
    iget-object p2, p1, Ll/ۜ֨ܽ;->᩻:Ll/ۧۚܽ;

    iput-object p2, p0, Ll/ۖ۠ܽ;->᩻:Ll/ۧۚܽ;

    .line 23
    iget-object p1, p1, Ll/ۜ֨ܽ;->᩷:Ll/᩻֨ܽ;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p3, Ll/ܺ۠ܽ;

    invoke-direct {p3, p1}, Ll/ܺ۠ܽ;-><init>(Ll/᩻֨ܽ;)V

    :goto_2
    iput-object p3, p0, Ll/ۖ۠ܽ;->᩷:Ll/ܺ۠ܽ;

    .line 24
    iput-object p4, p0, Ll/ۖ۠ܽ;->֫:Ll/ۖ۠ܽ;

    return-void
.end method
