.class public final Ll/ᩴ۟ۚ;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:Ll/ۜۨۚ;

.field public ᩹:Ll/ܰ۬ۚ;


# direct methods
.method public constructor <init>(Ll/ܰ۬ۚ;Ll/ۜۨۚ;)V
    .locals 0

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput-object p1, p0, Ll/ᩴ۟ۚ;->᩹:Ll/ܰ۬ۚ;

    .line 413
    iput-object p2, p0, Ll/ᩴ۟ۚ;->᩸:Ll/ۜۨۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 423
    iget-object v0, p0, Ll/ᩴ۟ۚ;->᩹:Ll/ܰ۬ۚ;

    invoke-virtual {v0}, Ll/ܰ۬ۚ;->ܿ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 424
    iget-object v0, p0, Ll/ᩴ۟ۚ;->᩸:Ll/ۜۨۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
