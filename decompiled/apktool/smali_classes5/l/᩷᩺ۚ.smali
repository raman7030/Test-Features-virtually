.class public final Ll/᩷᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public final ᩶:Ll/ܺۤۚ;

.field public final ᩸:I

.field public final ᩹:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(Ll/۠ᩳ֨;Ll/ܿ᩺ۚ;Ll/ܽ᩺ۚ;)V
    .locals 0

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    invoke-virtual {p2, p1}, Ll/ܿ᩺ۚ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۤۚ;

    iput-object p2, p0, Ll/᩷᩺ۚ;->᩹:Ll/ܺۤۚ;

    .line 149
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p2

    .line 222
    invoke-virtual {p3, p2}, Ll/ܽ᩺ۚ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۤۚ;

    :goto_0
    iput-object p2, p0, Ll/᩷᩺ۚ;->᩶:Ll/ܺۤۚ;

    .line 145
    invoke-virtual {p1}, Ll/֨ᩳ֨;->᩻()I

    move-result p1

    .line 223
    iput p1, p0, Ll/᩷᩺ۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 228
    iget-object v0, p0, Ll/᩷᩺ۚ;->᩹:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 229
    iget v0, p0, Ll/᩷᩺ۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 230
    iget-object v0, p0, Ll/᩷᩺ۚ;->᩶:Ll/ܺۤۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    :goto_0
    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
