.class public final Ll/۫᩺ۚ;
.super Ljava/lang/Object;
.source "A7EF"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;)V
    .locals 0

    .line 829
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 830
    iput-object p1, p0, Ll/۫᩺ۚ;->᩸:Ll/ܺۤۚ;

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

    .line 846
    iget-object v0, p0, Ll/۫᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    iput-object v0, p0, Ll/۫᩺ۚ;->᩸:Ll/ܺۤۚ;

    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 835
    sget-object v0, Ll/۟۫ۚ;->ۛ:Ll/۟۫ۚ;

    invoke-virtual {v0}, Ll/۟۫ۚ;->ۧ()C

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 836
    iget-object v0, p0, Ll/۫᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
