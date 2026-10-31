.class public final Ll/ۛۨۚ;
.super Ljava/lang/Object;
.source "I7DX"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(ILl/ܺۤۚ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Ll/ۛۨۚ;->᩸:I

    .line 44
    iput-object p2, p0, Ll/ۛۨۚ;->᩹:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۛۨۚ;->᩹:Ll/ܺۤۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    :goto_0
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 55
    iget v0, p0, Ll/ۛۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
