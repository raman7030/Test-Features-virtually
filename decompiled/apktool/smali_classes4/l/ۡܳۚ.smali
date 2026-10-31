.class public final Ll/ۡܳۚ;
.super Ll/ۜ۬֡;
.source "J2SC"


# instance fields
.field public ᩸:Ll/ۖ֫ۚ;

.field public final synthetic ᩹:Ll/ܺܳۚ;


# direct methods
.method public constructor <init>(Ll/ܺܳۚ;Ll/ۖ֫ۚ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۡܳۚ;->᩹:Ll/ܺܳۚ;

    .line 59
    iput-object p2, p0, Ll/ۡܳۚ;->᩸:Ll/ۖ֫ۚ;

    return-void
.end method


# virtual methods
.method public final ۟()I
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۡܳۚ;->᩸:Ll/ۖ֫ۚ;

    invoke-interface {v0}, Ll/ۖ֫ۚ;->۟()I

    move-result v0

    return v0
.end method

.method public final ܽۧ()Ljava/lang/String;
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ۡܳۚ;->᩹:Ll/ܺܳۚ;

    iget-object v0, v0, Ll/ܺܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۡܳۚ;->᩸:Ll/ۖ֫ۚ;

    invoke-interface {v1}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ll/ᩳ᩻ۚ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
