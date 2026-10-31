.class public final Ll/ۤ᩺ۚ;
.super Ljava/lang/Object;
.source "A7EF"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ll/ܺۤۚ;

.field public ᩹:C


# direct methods
.method public constructor <init>(CLl/ܺۤۚ;)V
    .locals 0

    .line 898
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 899
    iput-char p1, p0, Ll/ۤ᩺ۚ;->᩹:C

    .line 900
    iput-object p2, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 1

    .line 916
    iget-object v0, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0}, Ll/ܺۤۚ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 917
    iget-object v0, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    iput-object v0, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    .line 918
    iget-char p1, p0, Ll/ۤ᩺ۚ;->᩹:C

    invoke-static {p1}, Ll/۟۫ۚ;->֫(C)Z

    move-result p1

    if-nez p1, :cond_1

    .line 919
    iget-object p1, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    .line 72
    iget-object p1, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-nez p1, :cond_0

    sget-object p1, Ll/۟۫ۚ;->ۧ֫:Ll/۟۫ۚ;

    invoke-virtual {p1}, Ll/۟۫ۚ;->ۧ()C

    move-result p1

    goto :goto_0

    .line 73
    :cond_0
    iget-object p1, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {p1}, Ll/ۧۤۚ;->֫()C

    move-result p1

    .line 919
    :goto_0
    iput-char p1, p0, Ll/ۤ᩺ۚ;->᩹:C

    :cond_1
    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 905
    iget-char v0, p0, Ll/ۤ᩺ۚ;->᩹:C

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 906
    iget-object v0, p0, Ll/ۤ᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
