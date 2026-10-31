.class public final Ll/۫ܺܿ;
.super Ll/᩶ܺܿ;
.source "86ZM"


# instance fields
.field public final ۜ:[Ll/᩸᩷ܿ;

.field public final ۢ:Ll/ۚ᩷ܿ;

.field public final ۧ:Ll/᩸᩷ܿ;

.field public final ܳ:Ll/ۨۘܽ;

.field public final ܽ:[Ll/ۡۜܿ;

.field public final ܿ:Z

.field public final ᩳ:[I

.field public final ᩷:[Ll/ۨܺܿ;

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۚ᩷ܿ;[I[Ll/᩸᩷ܿ;[Ll/ۡۜܿ;[Ll/ۨܺܿ;ZLl/᩸᩷ܿ;)V
    .locals 1

    .line 737
    invoke-virtual {p1}, Ll/ۚ᩷ܿ;->ᩳ()Ll/۟ۘܽ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩶ܺܿ;-><init>(Ll/۟ۘܽ;)V

    .line 738
    iput-object p1, p0, Ll/۫ܺܿ;->ۢ:Ll/ۚ᩷ܿ;

    .line 739
    invoke-virtual {p1}, Ll/ۚ᩷ܿ;->ܽ()Ll/ۨۘܽ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ܺܿ;->ܳ:Ll/ۨۘܽ;

    .line 740
    iput-object p2, p0, Ll/۫ܺܿ;->ᩳ:[I

    .line 741
    iput-object p3, p0, Ll/۫ܺܿ;->ۜ:[Ll/᩸᩷ܿ;

    .line 742
    iput-object p4, p0, Ll/۫ܺܿ;->ܽ:[Ll/ۡۜܿ;

    .line 743
    iput-object p5, p0, Ll/۫ܺܿ;->᩷:[Ll/ۨܺܿ;

    .line 744
    iput-boolean p6, p0, Ll/۫ܺܿ;->᩻:Z

    .line 745
    iput-object p7, p0, Ll/۫ܺܿ;->ۧ:Ll/᩸᩷ܿ;

    const/4 p3, 0x0

    const/4 p6, 0x0

    .line 753
    :goto_0
    array-length p7, p2

    if-ge p6, p7, :cond_2

    .line 754
    aget p7, p2, p6

    invoke-virtual {p1, p7}, Ll/ۨۘܽ;->֫(I)Z

    move-result p7

    if-eqz p7, :cond_0

    goto :goto_2

    .line 755
    :cond_0
    aget-object p7, p4, p6

    if-eqz p7, :cond_1

    .line 756
    invoke-virtual {p7}, Ll/ۡۜܿ;->ᩳ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۨۘܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 757
    invoke-virtual {p7}, Ll/ۡۜܿ;->֫()I

    move-result p7

    invoke-virtual {p1, p7}, Ll/ۨۘܽ;->֫(I)Z

    move-result p7

    if-eqz p7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 p6, p6, 0x1

    goto :goto_0

    .line 761
    :cond_2
    array-length p2, p5

    const/4 p4, 0x0

    :goto_1
    if-ge p4, p2, :cond_5

    aget-object p6, p5, p4

    .line 762
    iget p6, p6, Ll/ۨܺܿ;->ܽ:I

    invoke-virtual {p1, p6}, Ll/ۨۘܽ;->֫(I)Z

    move-result p6

    if-eqz p6, :cond_4

    :cond_3
    :goto_2
    const/4 p3, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    .line 746
    :cond_5
    :goto_3
    iput-boolean p3, p0, Ll/۫ܺܿ;->ܿ:Z

    return-void
.end method
