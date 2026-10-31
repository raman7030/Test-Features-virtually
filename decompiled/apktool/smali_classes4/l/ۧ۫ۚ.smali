.class public final Ll/ۧ۫ۚ;
.super Ljava/lang/Object;
.source "R7DV"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ll/ܺۤۚ;

.field public ᩹:Ll/֫ۨۚ;


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;Ll/۫ۛۚ;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ۧ۫ۚ;->᩸:Ll/ܺۤۚ;

    .line 66
    iput-object p2, p0, Ll/ۧ۫ۚ;->᩹:Ll/֫ۨۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۧ۫ۚ;->᩹:Ll/֫ۨۚ;

    invoke-interface {v0}, Ll/֫ۨۚ;->getLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ۧ۫ۚ;->᩸:Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    iput-object v0, p0, Ll/ۧ۫ۚ;->᩸:Ll/ܺۤۚ;

    .line 83
    iget-object v0, p0, Ll/ۧ۫ۚ;->᩹:Ll/֫ۨۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/֫ۨۚ;Ll/ۗۛۚ;)Ll/֫ۨۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۫ۚ;->᩹:Ll/֫ۨۚ;

    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۧ۫ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 72
    iget-object v0, p0, Ll/ۧ۫ۚ;->᩹:Ll/֫ۨۚ;

    invoke-interface {v0, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
