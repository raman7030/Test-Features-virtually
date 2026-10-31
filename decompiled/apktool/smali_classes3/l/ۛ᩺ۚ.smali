.class public final Ll/ۛ᩺ۚ;
.super Ljava/lang/Object;
.source "A7EF"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ll/ܺۤۚ;

.field public ᩹:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 939
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 940
    iput-object p1, p0, Ll/ۛ᩺ۚ;->᩹:Ll/ܺۤۚ;

    .line 941
    iput-object p2, p0, Ll/ۛ᩺ۚ;->᩸:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 1

    .line 958
    iget-object v0, p0, Ll/ۛ᩺ۚ;->᩹:Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    iput-object v0, p0, Ll/ۛ᩺ۚ;->᩹:Ll/ܺۤۚ;

    .line 959
    iget-object v0, p0, Ll/ۛ᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    iput-object v0, p0, Ll/ۛ᩺ۚ;->᩸:Ll/ܺۤۚ;

    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 946
    sget-object v0, Ll/۟۫ۚ;->᩺:Ll/۟۫ۚ;

    invoke-virtual {v0}, Ll/۟۫ۚ;->ۧ()C

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 947
    iget-object v0, p0, Ll/ۛ᩺ۚ;->᩹:Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 948
    iget-object v0, p0, Ll/ۛ᩺ۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
